package com.yandex.mapkit.styling.automotivenavigation.balloons;

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
import com.yandex.runtime.device.internal.DeviceInfo;
import com.yandex.runtime.image.ImageProvider;
import defpackage.h8;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.w511;
import java.util.UUID;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001:\u0001DB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H$J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020'H\u0002J\u000e\u0010(\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010*\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u0016H\u0002J\u0010\u0010.\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u0016H\u0002J+\u00102\u001a\b\u0012\u0004\u0012\u00020\"032\u0006\u00104\u001a\u00020\"2\u0006\u00105\u001a\u00020\"2\u0006\u00106\u001a\u000207H\u0002¢\u0006\u0002\u00108J\u0018\u00105\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u00109\u001a\u00020\"2\u0006\u00105\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J \u0010:\u001a\u0002002\u0006\u00101\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\"H\u0002J\u0018\u0010>\u001a\u00020)2\u0006\u0010?\u001a\u00020)2\u0006\u0010@\u001a\u00020\u0005H\u0002J\u0018\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020B2\u0006\u0010@\u001a\u00020\u0005H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonTexture;", "", "balloonParams", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonParams;", "scaleFactor", "", "<init>", "(Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonParams;F)V", "value", "", "legColor", "getLegColor", "()I", "setLegColor", "(I)V", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/ShadowParams;", "shadow", "getShadow", "()Lcom/yandex/mapkit/styling/automotivenavigation/balloons/ShadowParams;", "setShadow", "(Lcom/yandex/mapkit/styling/automotivenavigation/balloons/ShadowParams;)V", "getView", "Landroid/view/View;", "balloonAnchor", "Lcom/yandex/mapkit/navigation/balloons/BalloonAnchor;", "scaleCoefficient", "deltaCorner", "deltaCornerPlusOffset", "deltaCenterPlusOffset", "halfWidthCenterLeg", "heightCenterLegPlusOffset", "paint", "Landroid/graphics/Paint;", "getBalloonSize", "Landroid/graphics/PointF;", "bodySize", "shiftToRect", IssuingDistributionPointExtension.POINT, "targetRect", "Landroid/graphics/RectF;", "getBalloonGeometry", "Lcom/yandex/mapkit/navigation/balloons/BalloonGeometry;", "create", "Lcom/yandex/runtime/image/ImageProvider;", "getBodySize", "view", "bodyTopLeftCorner", "getBodyPath", "Landroid/graphics/Path;", "offset", "pathForCornerLeg", "", "bodyCorner", "legTip", "backwards", "", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Z)[Landroid/graphics/PointF;", "anchorPoint", "pathForLeg", "getRects", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonTexture$Rects;", "balloonSize", "scaleGeometry", "balloonGeometry", "scale", "scaleRect", "Lcom/yandex/mapkit/map/Rect;", "rect", "Rects", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class BalloonTexture {
    private final BalloonParams balloonParams;
    private final float deltaCenterPlusOffset;
    private final float deltaCorner;
    private final float deltaCornerPlusOffset;
    private final float halfWidthCenterLeg;
    private final float heightCenterLegPlusOffset;
    private final Paint paint;
    private final float scaleCoefficient;
    private ShadowParams shadow;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonTexture$Rects;", "", "balloonRect", "Landroid/graphics/RectF;", "envelopingRect", "<init>", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)V", "getBalloonRect", "()Landroid/graphics/RectF;", "getEnvelopingRect", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public BalloonTexture(BalloonParams balloonParams, float f) {
        this.balloonParams = balloonParams;
        this.scaleCoefficient = f / DeviceInfo.pixelsPerPoint();
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
        setLegColor(-65536);
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
        float f = offset.x;
        float f2 = offset.y;
        path.addRoundRect(new RectF(f, f2, bodySize.x + f, bodySize.y + f2), this.balloonParams.getCornerRadius(), this.balloonParams.getCornerRadius(), Path.Direction.CW);
        return path;
    }

    private final PointF getBodySize(View view) {
        return new PointF(view.getMeasuredWidth(), view.getMeasuredHeight());
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

    private final PointF[] pathForCornerLeg(PointF bodyCorner, PointF legTip, boolean backwards) {
        PointF pointF = new PointF(bodyCorner.x, Math.copySign(this.balloonParams.getSizeCornerLegInnerPart(), bodyCorner.y - legTip.y) + bodyCorner.y);
        PointF pointF2 = new PointF(Math.copySign(this.balloonParams.getSizeCornerLegInnerPart(), bodyCorner.x - legTip.x) + bodyCorner.x, bodyCorner.y);
        return backwards ? new PointF[]{new PointF(legTip.x, legTip.y), new PointF(pointF.x, pointF.y), new PointF(pointF2.x, pointF2.y)} : new PointF[]{new PointF(pointF.x, pointF.y), new PointF(legTip.x, legTip.y), new PointF(pointF2.x, pointF2.y)};
    }

    private final Path pathForLeg(PointF offset, PointF bodySize, BalloonAnchor balloonAnchor) {
        PointF[] pathForCornerLeg;
        PointF[] pointFArr;
        PointF[] pointFArr2;
        Path path = new Path();
        float f = bodySize.x / 2.0f;
        float f2 = bodySize.y / 2.0f;
        int i = WhenMappings.$EnumSwitchMapping$1[balloonAnchor.getVertical().ordinal()];
        if (i == 1) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[balloonAnchor.getHorizontal().ordinal()];
            if (i2 == 1) {
                float f3 = this.deltaCornerPlusOffset;
                pathForCornerLeg = pathForCornerLeg(new PointF(f3, f3), legTip(bodySize, balloonAnchor), false);
            } else if (i2 == 2) {
                pointFArr = new PointF[]{new PointF(f - this.halfWidthCenterLeg, this.heightCenterLegPlusOffset), legTip(bodySize, balloonAnchor), new PointF(f + this.halfWidthCenterLeg, this.heightCenterLegPlusOffset)};
                pathForCornerLeg = pointFArr;
            } else {
                if (i2 != 3) {
                    w511.b();
                    return null;
                }
                pathForCornerLeg = pathForCornerLeg(new PointF(bodySize.x, this.deltaCornerPlusOffset), legTip(bodySize, balloonAnchor), true);
            }
        } else if (i == 2) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[balloonAnchor.getHorizontal().ordinal()];
            if (i3 == 1) {
                pointFArr2 = new PointF[]{new PointF(this.heightCenterLegPlusOffset, this.halfWidthCenterLeg + f2), legTip(bodySize, balloonAnchor), new PointF(this.heightCenterLegPlusOffset, f2 - this.halfWidthCenterLeg)};
            } else {
                if (i3 == 2) {
                    ny61.g("Unknown leg position");
                    return null;
                }
                if (i3 != 3) {
                    w511.b();
                    return null;
                }
                pointFArr2 = new PointF[]{new PointF(bodySize.x, f2 - this.halfWidthCenterLeg), legTip(bodySize, balloonAnchor), new PointF(bodySize.x, f2 + this.halfWidthCenterLeg)};
            }
            pathForCornerLeg = pointFArr2;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            int i4 = WhenMappings.$EnumSwitchMapping$0[balloonAnchor.getHorizontal().ordinal()];
            if (i4 == 1) {
                pathForCornerLeg = pathForCornerLeg(new PointF(this.deltaCornerPlusOffset, bodySize.y), legTip(bodySize, balloonAnchor), true);
            } else if (i4 == 2) {
                pointFArr = new PointF[]{new PointF(this.halfWidthCenterLeg + f, bodySize.y), legTip(bodySize, balloonAnchor), new PointF(f - this.halfWidthCenterLeg, bodySize.y)};
                pathForCornerLeg = pointFArr;
            } else {
                if (i4 != 3) {
                    w511.b();
                    return null;
                }
                pathForCornerLeg = pathForCornerLeg(new PointF(bodySize.x, bodySize.y), legTip(bodySize, balloonAnchor), false);
            }
        }
        path.setFillType(Path.FillType.EVEN_ODD);
        for (PointF pointF : pathForCornerLeg) {
            pointF.offset(offset.x, offset.y);
        }
        PointF pointF2 = pathForCornerLeg[0];
        path.moveTo(pointF2.x, pointF2.y);
        PointF pointF3 = pathForCornerLeg[1];
        path.lineTo(pointF3.x, pointF3.y);
        PointF pointF4 = pathForCornerLeg[2];
        path.lineTo(pointF4.x, pointF4.y);
        path.close();
        return path;
    }

    private final BalloonGeometry scaleGeometry(BalloonGeometry balloonGeometry, float scale) {
        return new BalloonGeometry(balloonGeometry.getAnchor(), balloonGeometry.getWidth() * scale, balloonGeometry.getHeight() * scale, balloonGeometry.getImageAnchor(), scaleRect(balloonGeometry.getContentRect(), scale), scaleRect(balloonGeometry.getBalloonRect(), scale));
    }

    private final Rect scaleRect(Rect rect, float scale) {
        return new Rect(new PointF(rect.getMin().x * scale, rect.getMin().y * scale), new PointF(rect.getMax().x * scale, rect.getMax().y * scale));
    }

    private final PointF shiftToRect(PointF point, RectF targetRect) {
        return new PointF(point.x - targetRect.left, point.y - targetRect.top);
    }

    public final ImageProvider create(BalloonAnchor balloonAnchor) {
        View view = getView(balloonAnchor);
        PointF bodySize = getBodySize(view);
        PointF bodyTopLeftCorner = bodyTopLeftCorner(balloonAnchor);
        Rects rects = getRects(getBalloonSize(bodySize, balloonAnchor));
        RectF balloonRect = rects.getBalloonRect();
        RectF envelopingRect = rects.getEnvelopingRect();
        PointF pointF = new PointF(balloonRect.left - envelopingRect.left, balloonRect.top - envelopingRect.top);
        PointF pointF2 = new PointF(pointF.x + bodyTopLeftCorner.x, pointF.y + bodyTopLeftCorner.y);
        Bitmap createBitmap = Bitmap.createBitmap((int) (envelopingRect.width() * this.scaleCoefficient), (int) (envelopingRect.height() * this.scaleCoefficient), Bitmap.Config.ARGB_8888);
        Path bodyPath = getBodyPath(pointF2, view);
        if (balloonAnchor.getVertical() != VerticalPosition.CENTER || balloonAnchor.getHorizontal() != HorizontalPosition.CENTER) {
            bodyPath.addPath(pathForLeg(pointF, bodySize, balloonAnchor));
        }
        Canvas canvas = new Canvas(createBitmap);
        float f = this.scaleCoefficient;
        canvas.scale(f, f);
        canvas.drawPath(bodyPath, this.paint);
        canvas.translate(pointF2.x, pointF2.y);
        view.draw(canvas);
        canvas.translate(-pointF2.x, -pointF2.y);
        return ImageProvider.fromBitmap(createBitmap, false, "bitmap:" + UUID.randomUUID());
    }

    public final BalloonGeometry getBalloonGeometry(BalloonAnchor balloonAnchor) {
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
        return scaleGeometry(new BalloonGeometry(balloonAnchor, envelopingRect.width(), envelopingRect.height(), new PointF(shiftToRect2.x / envelopingRect.width(), shiftToRect2.y / envelopingRect.height()), rect2, rect), this.scaleCoefficient);
    }

    public final int getLegColor() {
        return this.paint.getColor();
    }

    public final ShadowParams getShadow() {
        return this.shadow;
    }

    public abstract View getView(BalloonAnchor balloonAnchor);

    public final void setLegColor(int i) {
        this.paint.setColor(i);
    }

    public final void setShadow(ShadowParams shadowParams) {
        this.shadow = shadowParams;
        Paint paint = this.paint;
        if (shadowParams != null) {
            paint.setShadowLayer(shadowParams.getRadius(), shadowParams.getOffset().x, shadowParams.getOffset().y, shadowParams.getColor());
        } else {
            paint.clearShadowLayer();
        }
    }
}
