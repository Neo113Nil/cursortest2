package com.yandex.mapkit.styling.transportnavigation;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mapkit.map.Rect;
import com.yandex.mapkit.navigation.balloons.BalloonAnchor;
import com.yandex.mapkit.navigation.balloons.BalloonGeometry;
import com.yandex.mapkit.navigation.balloons.HorizontalPosition;
import com.yandex.mapkit.navigation.balloons.VerticalPosition;
import com.yandex.runtime.image.ImageProvider;
import defpackage.h8;
import defpackage.w511;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/MasstransitViewBalloonTexture;", "Lcom/yandex/mapkit/styling/transportnavigation/BalloonTexture;", "view", "Landroid/view/View;", "anchorView", "<init>", "(Landroid/view/View;Landroid/view/View;)V", "getView", "balloonAnchor", "Lcom/yandex/mapkit/navigation/balloons/BalloonAnchor;", "getAnchorView", "getBalloonGeometry", "Lcom/yandex/mapkit/navigation/balloons/BalloonGeometry;", "create", "Lcom/yandex/runtime/image/ImageProvider;", "getBalloonSize", "Landroid/graphics/PointF;", "bodySize", "getRects", "Landroid/graphics/RectF;", "balloonSize", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MasstransitViewBalloonTexture extends BalloonTexture {
    private final View anchorView;
    private final View view;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HorizontalPosition.values().length];
            try {
                iArr[HorizontalPosition.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HorizontalPosition.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HorizontalPosition.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VerticalPosition.values().length];
            try {
                iArr2[VerticalPosition.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VerticalPosition.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VerticalPosition.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public MasstransitViewBalloonTexture(View view, View view2) {
        this.view = view;
        this.anchorView = view2;
    }

    private final View getAnchorView() {
        return this.anchorView;
    }

    private final PointF getBalloonSize(PointF bodySize) {
        return new PointF(bodySize.x, bodySize.y);
    }

    private final RectF getRects(PointF balloonSize) {
        return new RectF(0.0f, 0.0f, balloonSize.x, balloonSize.y);
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.BalloonTexture
    public ImageProvider create(BalloonAnchor balloonAnchor) {
        View view = getView(balloonAnchor);
        RectF rects = getRects(getBalloonSize(getBodySize(view)));
        PointF pointF = new PointF(rects.left, rects.top);
        Bitmap createBitmap = Bitmap.createBitmap((int) rects.width(), (int) rects.height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(pointF.x, pointF.y);
        view.draw(canvas);
        canvas.translate(-pointF.x, -pointF.y);
        return ImageProvider.fromBitmap(createBitmap, false, "bitmap:" + UUID.randomUUID());
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.BalloonTexture
    public BalloonGeometry getBalloonGeometry(BalloonAnchor balloonAnchor) {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        View view = getView(balloonAnchor);
        PointF bodySize = getBodySize(view);
        PointF bodySize2 = getBodySize(getAnchorView());
        float f2 = 0.0f;
        PointF pointF = new PointF(0.0f, 0.0f);
        RectF rectF = new RectF(0.0f, 0.0f, bodySize.x, bodySize.y);
        Rect rect = new Rect(pointF, new PointF(pointF.x + bodySize.x, pointF.y + bodySize.y));
        if (view instanceof ViewGroup) {
            h8 h8Var = new h8(3, (ViewGroup) view);
            i = Integer.MAX_VALUE;
            i2 = Integer.MAX_VALUE;
            i3 = Integer.MAX_VALUE;
            i4 = Integer.MAX_VALUE;
            while (h8Var.hasNext()) {
                View view2 = (View) h8Var.next();
                if (view2.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        int i5 = marginLayoutParams.topMargin;
                        if (i > i5) {
                            i = i5;
                        }
                        int i6 = marginLayoutParams.leftMargin;
                        if (i2 > i6) {
                            i2 = i6;
                        }
                        int i7 = marginLayoutParams.bottomMargin;
                        if (i3 > i7) {
                            i3 = i7;
                        }
                        int i8 = marginLayoutParams.rightMargin;
                        if (i4 > i8) {
                            i4 = i8;
                        }
                    }
                }
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        Rect rect2 = new Rect(new PointF(rect.getMin().x + view.getPaddingLeft() + i2, rect.getMin().y + view.getPaddingTop() + i), new PointF((rect.getMax().x - view.getPaddingRight()) - i4, (rect.getMax().y - view.getPaddingBottom()) - i3));
        int i9 = WhenMappings.$EnumSwitchMapping$0[balloonAnchor.getHorizontal().ordinal()];
        if (i9 == 1) {
            f = 0.0f;
        } else if (i9 == 2) {
            f = bodySize2.x / 2.0f;
        } else {
            if (i9 != 3) {
                w511.b();
                return null;
            }
            f = bodySize2.x;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$1[balloonAnchor.getVertical().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                f2 = bodySize2.y / 2.0f;
            } else {
                if (i10 != 3) {
                    w511.b();
                    return null;
                }
                f2 = bodySize2.y;
            }
        }
        PointF pointF2 = new PointF(f, f2);
        return new BalloonGeometry(balloonAnchor, rectF.width(), rectF.height(), new PointF(pointF2.x / rectF.width(), pointF2.y / rectF.height()), rect2, rect);
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.BalloonTexture
    public View getView(BalloonAnchor balloonAnchor) {
        return this.view;
    }
}
