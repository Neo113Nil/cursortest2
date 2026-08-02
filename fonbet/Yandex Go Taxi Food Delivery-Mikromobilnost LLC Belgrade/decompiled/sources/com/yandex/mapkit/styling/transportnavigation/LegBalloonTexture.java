package com.yandex.mapkit.styling.transportnavigation;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
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
import defpackage.j73;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.w511;
import java.util.UUID;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0001VB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J-\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u000bJ\u001f\u0010!\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\u000bJ'\u0010\"\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010#J7\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\b\b\u0002\u0010&\u001a\u00020\u001cH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010,J\u001c\u0010-\u001a\u00020\u0006*\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0082\u0002¢\u0006\u0004\b-\u0010.J\u001c\u0010/\u001a\u00020\u0006*\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0082\u0002¢\u0006\u0004\b/\u0010.J\u001c\u00101\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u000200H\u0082\u0002¢\u0006\u0004\b1\u00102J\u001c\u00104\u001a\u00020\u0006*\u00020\u00062\u0006\u00103\u001a\u000200H\u0082\u0002¢\u0006\u0004\b4\u00102J\u0013\u00105\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b5\u00106J\u0015\u0010:\u001a\u0002092\u0006\u00108\u001a\u000207¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u0002092\b\u00108\u001a\u0004\u0018\u00010<¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u0002092\b\u00108\u001a\u0004\u0018\u00010?¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020B2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020E2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010HR\u0014\u0010I\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010JR\u0014\u0010L\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010JR\u0014\u0010M\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010JR\u0014\u0010N\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010JR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010R\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010T\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006W"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/LegBalloonTexture;", "Lcom/yandex/mapkit/styling/transportnavigation/BalloonTexture;", "Lcom/yandex/mapkit/styling/transportnavigation/BalloonParams;", "balloonParams", "<init>", "(Lcom/yandex/mapkit/styling/transportnavigation/BalloonParams;)V", "Landroid/graphics/PointF;", "bodySize", "Lcom/yandex/mapkit/navigation/balloons/BalloonAnchor;", "balloonAnchor", "getBalloonSize", "(Landroid/graphics/PointF;Lcom/yandex/mapkit/navigation/balloons/BalloonAnchor;)Landroid/graphics/PointF;", IssuingDistributionPointExtension.POINT, "Landroid/graphics/RectF;", "targetRect", "shiftToRect", "(Landroid/graphics/PointF;Landroid/graphics/RectF;)Landroid/graphics/PointF;", "bodyTopLeftCorner", "(Lcom/yandex/mapkit/navigation/balloons/BalloonAnchor;)Landroid/graphics/PointF;", "offset", "Landroid/view/View;", "view", "Landroid/graphics/Path;", "getOutlinePath", "(Landroid/graphics/PointF;Landroid/view/View;)Landroid/graphics/Path;", "getBodyPath", "bodyCorner", "legTip", "", "backwards", "", "pathForCornerLeg", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Z)[Landroid/graphics/PointF;", "anchorPoint", "pathForLeg", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Lcom/yandex/mapkit/navigation/balloons/BalloonAnchor;)Landroid/graphics/Path;", "pointOne", "pointTwo", "isCornerLeg", "pathForUsualLeg", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Z)[Landroid/graphics/PointF;", "balloonSize", "Lcom/yandex/mapkit/styling/transportnavigation/LegBalloonTexture$Rects;", "getRects", "(Landroid/graphics/PointF;)Lcom/yandex/mapkit/styling/transportnavigation/LegBalloonTexture$Rects;", "plus", "(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;", "minus", "", "times", "(Landroid/graphics/PointF;F)Landroid/graphics/PointF;", "divider", "div", "normalize", "(Landroid/graphics/PointF;)Landroid/graphics/PointF;", "", "value", "Lzy11;", "setColor", "(I)V", "Lcom/yandex/mapkit/styling/transportnavigation/ShadowParams;", "setShadowParams", "(Lcom/yandex/mapkit/styling/transportnavigation/ShadowParams;)V", "Lcom/yandex/mapkit/styling/transportnavigation/OutlineParams;", "setOutlineParams", "(Lcom/yandex/mapkit/styling/transportnavigation/OutlineParams;)V", "Lcom/yandex/mapkit/navigation/balloons/BalloonGeometry;", "getBalloonGeometry", "(Lcom/yandex/mapkit/navigation/balloons/BalloonAnchor;)Lcom/yandex/mapkit/navigation/balloons/BalloonGeometry;", "Lcom/yandex/runtime/image/ImageProvider;", "create", "(Lcom/yandex/mapkit/navigation/balloons/BalloonAnchor;)Lcom/yandex/runtime/image/ImageProvider;", "Lcom/yandex/mapkit/styling/transportnavigation/BalloonParams;", "deltaCorner", "F", "deltaCornerPlusOffset", "deltaCenterPlusOffset", "halfWidthCenterLeg", "heightCenterLegPlusOffset", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "shadow", "Lcom/yandex/mapkit/styling/transportnavigation/ShadowParams;", "outline", "Lcom/yandex/mapkit/styling/transportnavigation/OutlineParams;", "Rects", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class LegBalloonTexture extends BalloonTexture {
    private final BalloonParams balloonParams;
    private final float deltaCenterPlusOffset;
    private final float deltaCorner;
    private final float deltaCornerPlusOffset;
    private final float halfWidthCenterLeg;
    private final float heightCenterLegPlusOffset;
    private OutlineParams outline;
    private final Paint paint;
    private ShadowParams shadow;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/LegBalloonTexture$Rects;", "", "balloonRect", "Landroid/graphics/RectF;", "envelopingRect", "<init>", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)V", "getBalloonRect", "()Landroid/graphics/RectF;", "getEnvelopingRect", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Rects {
        private final RectF balloonRect;
        private final RectF envelopingRect;

        public Rects(RectF rectF, RectF rectF2) {
            this.balloonRect = rectF;
            this.envelopingRect = rectF2;
        }

        public static /* synthetic */ Rects copy$default(Rects rects, RectF rectF, RectF rectF2, int i, Object obj) {
            if ((i & 1) != 0) {
                rectF = rects.balloonRect;
            }
            if ((i & 2) != 0) {
                rectF2 = rects.envelopingRect;
            }
            return rects.copy(rectF, rectF2);
        }

        /* renamed from: component1, reason: from getter */
        public final RectF getBalloonRect() {
            return this.balloonRect;
        }

        /* renamed from: component2, reason: from getter */
        public final RectF getEnvelopingRect() {
            return this.envelopingRect;
        }

        public final Rects copy(RectF balloonRect, RectF envelopingRect) {
            return new Rects(balloonRect, envelopingRect);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rects)) {
                return false;
            }
            Rects rects = (Rects) other;
            return jl40.l(this.balloonRect, rects.balloonRect) && jl40.l(this.envelopingRect, rects.envelopingRect);
        }

        public final RectF getBalloonRect() {
            return this.balloonRect;
        }

        public final RectF getEnvelopingRect() {
            return this.envelopingRect;
        }

        public int hashCode() {
            return this.envelopingRect.hashCode() + (this.balloonRect.hashCode() * 31);
        }

        public String toString() {
            return "Rects(balloonRect=" + this.balloonRect + ", envelopingRect=" + this.envelopingRect + Extension.C_BRAKE;
        }
    }

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

    public LegBalloonTexture(BalloonParams balloonParams) {
        this.balloonParams = balloonParams;
        float sizeCornerLeg = balloonParams.getSizeCornerLeg() - balloonParams.getSizeCornerLegInnerPart();
        this.deltaCorner = sizeCornerLeg;
        this.deltaCornerPlusOffset = balloonParams.getLegOffset() + sizeCornerLeg;
        this.deltaCenterPlusOffset = balloonParams.getLegOffset() + balloonParams.getHeightCenterLeg();
        this.halfWidthCenterLeg = balloonParams.getWidthCenterLeg() / 2.0f;
        this.heightCenterLegPlusOffset = balloonParams.getLegOffset() + balloonParams.getHeightCenterLeg();
        Paint paint = new Paint();
        this.paint = paint;
        paint.setStrokeWidth(0.1f);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        setColor(-65536);
    }

    private final PointF anchorPoint(PointF legTip, BalloonAnchor balloonAnchor) {
        float legOffset;
        float legOffset2;
        int i = WhenMappings.$EnumSwitchMapping$0[balloonAnchor.getHorizontal().ordinal()];
        if (i == 1) {
            legOffset = legTip.x - this.balloonParams.getLegOffset();
        } else if (i == 2) {
            legOffset = legTip.x;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            legOffset = this.balloonParams.getLegOffset() + legTip.x;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[balloonAnchor.getVertical().ordinal()];
        if (i2 == 1) {
            legOffset2 = legTip.y - this.balloonParams.getLegOffset();
        } else if (i2 == 2) {
            legOffset2 = legTip.y;
        } else {
            if (i2 != 3) {
                w511.b();
                return null;
            }
            legOffset2 = this.balloonParams.getLegOffset() + legTip.y;
        }
        return new PointF(legOffset, legOffset2);
    }

    private final PointF bodyTopLeftCorner(BalloonAnchor balloonAnchor) {
        return new PointF(balloonAnchor.getHorizontal() == HorizontalPosition.LEFT ? balloonAnchor.getVertical() == VerticalPosition.CENTER ? this.deltaCenterPlusOffset : this.deltaCornerPlusOffset : 0.0f, balloonAnchor.getVertical() == VerticalPosition.TOP ? balloonAnchor.getHorizontal() == HorizontalPosition.CENTER ? this.deltaCenterPlusOffset : this.deltaCornerPlusOffset : 0.0f);
    }

    private final PointF div(PointF pointF, float f) {
        return new PointF(pointF.x / f, pointF.y / f);
    }

    private final PointF getBalloonSize(PointF bodySize, BalloonAnchor balloonAnchor) {
        PointF pointF = new PointF(bodySize.x, bodySize.y);
        VerticalPosition vertical = balloonAnchor.getVertical();
        VerticalPosition verticalPosition = VerticalPosition.CENTER;
        if (vertical != verticalPosition && balloonAnchor.getHorizontal() != HorizontalPosition.CENTER) {
            float f = pointF.x;
            float f2 = this.deltaCornerPlusOffset;
            pointF.x = f + f2;
            pointF.y += f2;
            return pointF;
        }
        if (balloonAnchor.getVertical() != verticalPosition) {
            pointF.y += this.deltaCenterPlusOffset;
            return pointF;
        }
        if (balloonAnchor.getHorizontal() != HorizontalPosition.CENTER) {
            pointF.x += this.deltaCenterPlusOffset;
        }
        return pointF;
    }

    private final Path getBodyPath(PointF offset, View view) {
        Path path = new Path();
        PointF bodySize = getBodySize(view);
        if (this.outline == null) {
            float f = offset.x;
            float f2 = offset.y;
            path.addRoundRect(new RectF(f, f2, bodySize.x + f, bodySize.y + f2), this.balloonParams.getCornerRadius(), this.balloonParams.getCornerRadius(), Path.Direction.CW);
            return path;
        }
        path.addRoundRect(new RectF(this.outline.getSize() + offset.x, this.outline.getSize() + offset.y, (offset.x + bodySize.x) - this.outline.getSize(), (offset.y + bodySize.y) - this.outline.getSize()), this.outline.getRadius(), this.outline.getRadius(), Path.Direction.CW);
        return path;
    }

    private final Path getOutlinePath(PointF offset, View view) {
        if (this.outline == null) {
            return null;
        }
        Path path = new Path();
        PointF bodySize = getBodySize(view);
        float f = offset.x;
        float f2 = offset.y;
        path.addRoundRect(new RectF(f, f2, bodySize.x + f, bodySize.y + f2), this.balloonParams.getCornerRadius(), this.balloonParams.getCornerRadius(), Path.Direction.CW);
        return path;
    }

    private final Rects getRects(PointF balloonSize) {
        PointF pointF;
        ShadowParams shadowParams = this.shadow;
        float radius = (shadowParams != null ? shadowParams.getRadius() : 0.0f) * 1.0f;
        ShadowParams shadowParams2 = this.shadow;
        if (shadowParams2 == null || (pointF = shadowParams2.getOffset()) == null) {
            pointF = new PointF();
        }
        RectF rectF = new RectF(0.0f, 0.0f, balloonSize.x, balloonSize.y);
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pointF.x, pointF.y);
        float f = -radius;
        rectF2.inset(f, f);
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return new Rects(rectF, rectF3);
    }

    private final PointF legTip(PointF bodySize, BalloonAnchor balloonAnchor) {
        float f = bodySize.x / 2.0f;
        float f2 = bodySize.y / 2.0f;
        int i = WhenMappings.$EnumSwitchMapping$1[balloonAnchor.getVertical().ordinal()];
        if (i == 1) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[balloonAnchor.getHorizontal().ordinal()];
            if (i2 == 1) {
                return new PointF(this.balloonParams.getLegOffset(), this.balloonParams.getLegOffset());
            }
            if (i2 == 2) {
                return new PointF(f, this.balloonParams.getLegOffset());
            }
            if (i2 == 3) {
                return new PointF(bodySize.x + this.deltaCorner, this.balloonParams.getLegOffset());
            }
            w511.b();
            return null;
        }
        if (i == 2) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[balloonAnchor.getHorizontal().ordinal()];
            if (i3 == 1) {
                return new PointF(this.balloonParams.getLegOffset(), f2);
            }
            if (i3 == 2) {
                ny61.g("Unknown leg position");
                return null;
            }
            if (i3 == 3) {
                return new PointF(this.balloonParams.getHeightCenterLeg() + bodySize.x, f2);
            }
            w511.b();
            return null;
        }
        if (i != 3) {
            w511.b();
            return null;
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[balloonAnchor.getHorizontal().ordinal()];
        if (i4 == 1) {
            return new PointF(this.balloonParams.getLegOffset(), bodySize.y + this.deltaCorner);
        }
        if (i4 == 2) {
            return new PointF(f, this.balloonParams.getHeightCenterLeg() + bodySize.y);
        }
        if (i4 != 3) {
            w511.b();
            return null;
        }
        float f3 = bodySize.x;
        float f4 = this.deltaCorner;
        return new PointF(f3 + f4, bodySize.y + f4);
    }

    private final PointF minus(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x - pointF2.x, pointF.y - pointF2.y);
    }

    private final PointF normalize(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        return sqrt == 0.0f ? new PointF(0.0f, 0.0f) : new PointF(pointF.x / sqrt, pointF.y / sqrt);
    }

    private final PointF[] pathForCornerLeg(PointF bodyCorner, PointF legTip, boolean backwards) {
        PointF[] pathForUsualLeg$default = pathForUsualLeg$default(this, new PointF(bodyCorner.x, Math.copySign(this.balloonParams.getSizeCornerLegInnerPart(), bodyCorner.y - legTip.y) + bodyCorner.y), legTip, new PointF(Math.copySign(this.balloonParams.getSizeCornerLegInnerPart(), bodyCorner.x - legTip.x) + bodyCorner.x, bodyCorner.y), false, 8, null);
        return backwards ? (PointF[]) j73.W(pathForUsualLeg$default) : pathForUsualLeg$default;
    }

    private final Path pathForLeg(PointF offset, PointF bodySize, BalloonAnchor balloonAnchor) {
        PointF[] pathForCornerLeg;
        Path path = new Path();
        float f = bodySize.x / 2.0f;
        float f2 = bodySize.y / 2.0f;
        int i = WhenMappings.$EnumSwitchMapping$1[balloonAnchor.getVertical().ordinal()];
        if (i == 1) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[balloonAnchor.getHorizontal().ordinal()];
            if (i2 == 1) {
                float f3 = this.deltaCornerPlusOffset;
                pathForCornerLeg = pathForCornerLeg(new PointF(f3, f3), new PointF(this.balloonParams.getLegOffset(), this.balloonParams.getLegOffset()), false);
            } else if (i2 == 2) {
                pathForCornerLeg = pathForUsualLeg(new PointF(f - this.halfWidthCenterLeg, this.heightCenterLegPlusOffset), new PointF(f, this.balloonParams.getLegOffset()), new PointF(f + this.halfWidthCenterLeg, this.heightCenterLegPlusOffset), false);
            } else {
                if (i2 != 3) {
                    w511.b();
                    return null;
                }
                pathForCornerLeg = pathForCornerLeg(new PointF(bodySize.x, this.deltaCornerPlusOffset), new PointF(bodySize.x + this.deltaCorner, this.balloonParams.getLegOffset()), true);
            }
        } else if (i == 2) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[balloonAnchor.getHorizontal().ordinal()];
            if (i3 == 1) {
                pathForCornerLeg = pathForUsualLeg(new PointF(this.heightCenterLegPlusOffset, Math.min(this.halfWidthCenterLeg + f2, bodySize.y - this.balloonParams.getCornerRadius())), new PointF(this.balloonParams.getLegOffset(), f2), new PointF(this.heightCenterLegPlusOffset, Math.max(f2 - this.halfWidthCenterLeg, this.balloonParams.getCornerRadius())), false);
            } else {
                if (i3 == 2) {
                    ny61.g("Unknown leg position");
                    return null;
                }
                if (i3 != 3) {
                    w511.b();
                    return null;
                }
                pathForCornerLeg = pathForUsualLeg(new PointF(bodySize.x, Math.max(f2 - this.halfWidthCenterLeg, this.balloonParams.getCornerRadius())), new PointF(this.balloonParams.getHeightCenterLeg() + bodySize.x, f2), new PointF(bodySize.x, Math.min(f2 + this.halfWidthCenterLeg, bodySize.y - this.balloonParams.getCornerRadius())), false);
            }
        } else {
            if (i != 3) {
                ny61.f("pathForLeg with legPlacement == NONE");
                return null;
            }
            int i4 = WhenMappings.$EnumSwitchMapping$0[balloonAnchor.getHorizontal().ordinal()];
            if (i4 == 1) {
                pathForCornerLeg = pathForCornerLeg(new PointF(this.deltaCornerPlusOffset, bodySize.y), new PointF(this.balloonParams.getLegOffset(), bodySize.y + this.deltaCorner), true);
            } else if (i4 == 2) {
                pathForCornerLeg = pathForUsualLeg(new PointF(this.halfWidthCenterLeg + f, bodySize.y), new PointF(f, this.balloonParams.getHeightCenterLeg() + bodySize.y), new PointF(f - this.halfWidthCenterLeg, bodySize.y), false);
            } else {
                if (i4 != 3) {
                    w511.b();
                    return null;
                }
                PointF pointF = new PointF(bodySize.x, bodySize.y);
                float f4 = bodySize.x;
                float f5 = this.deltaCorner;
                pathForCornerLeg = pathForCornerLeg(pointF, new PointF(f4 + f5, bodySize.y + f5), false);
            }
        }
        path.setFillType(Path.FillType.EVEN_ODD);
        for (PointF pointF2 : pathForCornerLeg) {
            pointF2.offset(offset.x, offset.y);
        }
        PointF pointF3 = pathForCornerLeg[0];
        path.moveTo(pointF3.x, pointF3.y);
        PointF pointF4 = pathForCornerLeg[1];
        float f6 = pointF4.x;
        float f7 = pointF4.y;
        PointF pointF5 = pathForCornerLeg[2];
        float f8 = pointF5.x;
        float f9 = pointF5.y;
        PointF pointF6 = pathForCornerLeg[3];
        path.cubicTo(f6, f7, f8, f9, pointF6.x, pointF6.y);
        PointF pointF7 = pathForCornerLeg[4];
        float f10 = pointF7.x;
        float f11 = pointF7.y;
        PointF pointF8 = pathForCornerLeg[5];
        float f12 = pointF8.x;
        float f13 = pointF8.y;
        PointF pointF9 = pathForCornerLeg[6];
        path.cubicTo(f10, f11, f12, f13, pointF9.x, pointF9.y);
        PointF pointF10 = pathForCornerLeg[7];
        float f14 = pointF10.x;
        float f15 = pointF10.y;
        PointF pointF11 = pathForCornerLeg[8];
        float f16 = pointF11.x;
        float f17 = pointF11.y;
        PointF pointF12 = pathForCornerLeg[9];
        path.cubicTo(f14, f15, f16, f17, pointF12.x, pointF12.y);
        path.close();
        return path;
    }

    private final PointF[] pathForUsualLeg(PointF pointOne, PointF legTip, PointF pointTwo, boolean isCornerLeg) {
        PointF div = isCornerLeg ? div(plus(times(plus(pointOne, pointTwo), 1.5f), legTip), 4.0f) : div(plus(pointOne, pointTwo), 2.0f);
        PointF div2 = div(plus(plus(pointOne, pointTwo), times(legTip, 2.0f)), 4.0f);
        PointF div3 = div(minus(pointOne, pointTwo), 4.0f);
        PointF div4 = div(minus(pointOne, pointTwo), isCornerLeg ? 8.0f : 13.0f);
        PointF plus = plus(times(normalize(minus(pointOne, pointTwo)), this.balloonParams.getLegTipThickness()), div(minus(div, legTip), 9.0f));
        PointF plus2 = plus(times(normalize(minus(pointTwo, pointOne)), this.balloonParams.getLegTipThickness()), div(minus(div, legTip), 9.0f));
        return new PointF[]{pointOne, plus(div, div3), plus(div2, div4), plus(legTip, plus), plus(plus(legTip, plus), times(times(normalize(minus(legTip, div)), this.balloonParams.getLegTipThickness()), 1.5f)), plus(plus(legTip, plus2), times(times(normalize(minus(legTip, div)), this.balloonParams.getLegTipThickness()), 1.5f)), plus(legTip, plus2), minus(div2, div4), minus(div, div3), pointTwo};
    }

    public static /* synthetic */ PointF[] pathForUsualLeg$default(LegBalloonTexture legBalloonTexture, PointF pointF, PointF pointF2, PointF pointF3, boolean z, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: pathForUsualLeg");
            return null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return legBalloonTexture.pathForUsualLeg(pointF, pointF2, pointF3, z);
    }

    private final PointF plus(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    private final PointF shiftToRect(PointF point, RectF targetRect) {
        return new PointF(point.x - targetRect.left, point.y - targetRect.top);
    }

    private final PointF times(PointF pointF, float f) {
        return new PointF(pointF.x * f, pointF.y * f);
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.BalloonTexture
    public ImageProvider create(BalloonAnchor balloonAnchor) {
        View view = getView(balloonAnchor);
        PointF bodySize = getBodySize(view);
        PointF bodyTopLeftCorner = bodyTopLeftCorner(balloonAnchor);
        Rects rects = getRects(getBalloonSize(bodySize, balloonAnchor));
        RectF balloonRect = rects.getBalloonRect();
        RectF envelopingRect = rects.getEnvelopingRect();
        PointF pointF = new PointF(balloonRect.left - envelopingRect.left, balloonRect.top - envelopingRect.top);
        PointF pointF2 = new PointF(pointF.x + bodyTopLeftCorner.x, pointF.y + bodyTopLeftCorner.y);
        Bitmap createBitmap = Bitmap.createBitmap((int) envelopingRect.width(), (int) envelopingRect.height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Path outlinePath = getOutlinePath(pointF2, view);
        if (outlinePath != null) {
            int color = this.paint.getColor();
            this.paint.setColor(this.outline.getColor());
            canvas.drawPath(outlinePath, this.paint);
            this.paint.setColor(color);
        }
        Path bodyPath = getBodyPath(pointF2, view);
        if (balloonAnchor.getVertical() != VerticalPosition.CENTER || balloonAnchor.getHorizontal() != HorizontalPosition.CENTER) {
            bodyPath.addPath(pathForLeg(pointF, bodySize, balloonAnchor));
        }
        canvas.drawPath(bodyPath, this.paint);
        canvas.translate(pointF2.x, pointF2.y);
        view.draw(canvas);
        canvas.translate(-pointF2.x, -pointF2.y);
        return ImageProvider.fromBitmap(createBitmap, false, "bitmap:" + UUID.randomUUID());
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.BalloonTexture
    public BalloonGeometry getBalloonGeometry(BalloonAnchor balloonAnchor) {
        int i;
        int i2;
        int i3;
        int i4;
        View view = getView(balloonAnchor);
        PointF bodySize = getBodySize(view);
        PointF bodyTopLeftCorner = bodyTopLeftCorner(balloonAnchor);
        RectF envelopingRect = getRects(getBalloonSize(bodySize, balloonAnchor)).getEnvelopingRect();
        PointF shiftToRect = shiftToRect(bodyTopLeftCorner, envelopingRect);
        Rect rect = new Rect(shiftToRect, new PointF(shiftToRect.x + bodySize.x, shiftToRect.y + bodySize.y));
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
        PointF shiftToRect2 = shiftToRect(anchorPoint(legTip(bodySize, balloonAnchor), balloonAnchor), envelopingRect);
        return new BalloonGeometry(balloonAnchor, envelopingRect.width(), envelopingRect.height(), new PointF(shiftToRect2.x / envelopingRect.width(), shiftToRect2.y / envelopingRect.height()), rect2, rect);
    }

    public final void setColor(int value) {
        this.paint.setColor(value);
    }

    public final void setOutlineParams(OutlineParams value) {
        this.outline = value;
    }

    public final void setShadowParams(ShadowParams value) {
        this.shadow = value;
        Paint paint = this.paint;
        if (value != null) {
            paint.setShadowLayer(value.getRadius(), value.getOffset().x, value.getOffset().y, value.getColor());
        } else {
            paint.clearShadowLayer();
        }
    }
}
