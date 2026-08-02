package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import xsna.bpn0;
import xsna.gzs;
import xsna.rl3;
import xsna.xq;
import xsna.zcl;

/* compiled from: RadialGradientDrawable.kt */
/* loaded from: classes7.dex */
public final class RadialGradientDrawable extends Drawable {
    public static final Companion Companion = new Companion(null);
    private Center centerX;
    private Center centerY;
    private int[] colors;
    private Radius radius;
    private final Paint paint = new Paint();
    private RectF rect = new RectF();

    /* compiled from: RadialGradientDrawable.kt */
    public static abstract class Center {

        /* compiled from: RadialGradientDrawable.kt */
        public static final class Fixed extends Center {
            private final float value;

            public Fixed(float f) {
                super(null);
                this.value = f;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Fixed) && Float.compare(this.value, ((Fixed) obj).value) == 0;
            }

            public final float getValue() {
                return this.value;
            }

            public int hashCode() {
                return Float.hashCode(this.value);
            }

            public String toString() {
                return xq.c(')', this.value, new StringBuilder("Fixed(value="));
            }
        }

        /* compiled from: RadialGradientDrawable.kt */
        public static final class Relative extends Center {
            private final float value;

            public Relative(float f) {
                super(null);
                this.value = f;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Relative) && Float.compare(this.value, ((Relative) obj).value) == 0;
            }

            public final float getValue() {
                return this.value;
            }

            public int hashCode() {
                return Float.hashCode(this.value);
            }

            public String toString() {
                return xq.c(')', this.value, new StringBuilder("Relative(value="));
            }
        }

        public /* synthetic */ Center(zcl zclVar) {
            this();
        }

        private Center() {
        }
    }

    /* compiled from: RadialGradientDrawable.kt */
    public static final class Companion {

        /* compiled from: RadialGradientDrawable.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Radius.Relative.Type.values().length];
                try {
                    iArr[Radius.Relative.Type.NEAREST_CORNER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Radius.Relative.Type.FARTHEST_CORNER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Radius.Relative.Type.NEAREST_SIDE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Radius.Relative.Type.FARTHEST_SIDE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float createRadialGradient$distTo(float f, float f2, float f3, float f4) {
            double d = 2;
            return (float) Math.sqrt(((float) Math.pow(f - f3, d)) + ((float) Math.pow(f2 - f4, d)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float createRadialGradient$distToHorizontalSide(float f, float f2) {
            return Math.abs(f - f2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float createRadialGradient$distToVerticalSide(float f, float f2) {
            return Math.abs(f - f2);
        }

        private static final Float[] createRadialGradient$lambda$0(Lazy<Float[]> lazy) {
            return lazy.getValue();
        }

        private static final Float[] createRadialGradient$lambda$1(Lazy<Float[]> lazy) {
            return lazy.getValue();
        }

        private static final float createRadialGradient$value(Center center, int i) {
            if (center instanceof Center.Fixed) {
                return ((Center.Fixed) center).getValue();
            }
            if (center instanceof Center.Relative) {
                return ((Center.Relative) center).getValue() * i;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final RadialGradient createRadialGradient(Radius radius, Center center, Center center2, int[] iArr, int i, int i2) {
            float floatValue;
            final float createRadialGradient$value = createRadialGradient$value(center, i);
            final float createRadialGradient$value2 = createRadialGradient$value(center2, i2);
            final float f = i;
            final float f2 = i2;
            final float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            final float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            bpn0 bpn0Var = new bpn0(new gzs<Float[]>() { // from class: com.yandex.div.internal.drawable.RadialGradientDrawable$Companion$createRadialGradient$distancesToCorners$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // xsna.gzs
                public final Float[] invoke() {
                    float createRadialGradient$distTo;
                    float createRadialGradient$distTo2;
                    float createRadialGradient$distTo3;
                    float createRadialGradient$distTo4;
                    createRadialGradient$distTo = RadialGradientDrawable.Companion.createRadialGradient$distTo(createRadialGradient$value, createRadialGradient$value2, f3, f4);
                    Float valueOf = Float.valueOf(createRadialGradient$distTo);
                    createRadialGradient$distTo2 = RadialGradientDrawable.Companion.createRadialGradient$distTo(createRadialGradient$value, createRadialGradient$value2, f, f4);
                    Float valueOf2 = Float.valueOf(createRadialGradient$distTo2);
                    createRadialGradient$distTo3 = RadialGradientDrawable.Companion.createRadialGradient$distTo(createRadialGradient$value, createRadialGradient$value2, f, f2);
                    Float valueOf3 = Float.valueOf(createRadialGradient$distTo3);
                    createRadialGradient$distTo4 = RadialGradientDrawable.Companion.createRadialGradient$distTo(createRadialGradient$value, createRadialGradient$value2, f3, f2);
                    return new Float[]{valueOf, valueOf2, valueOf3, Float.valueOf(createRadialGradient$distTo4)};
                }
            });
            bpn0 bpn0Var2 = new bpn0(new gzs<Float[]>() { // from class: com.yandex.div.internal.drawable.RadialGradientDrawable$Companion$createRadialGradient$distancesToSides$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // xsna.gzs
                public final Float[] invoke() {
                    float createRadialGradient$distToVerticalSide;
                    float createRadialGradient$distToVerticalSide2;
                    float createRadialGradient$distToHorizontalSide;
                    float createRadialGradient$distToHorizontalSide2;
                    createRadialGradient$distToVerticalSide = RadialGradientDrawable.Companion.createRadialGradient$distToVerticalSide(createRadialGradient$value, f3);
                    Float valueOf = Float.valueOf(createRadialGradient$distToVerticalSide);
                    createRadialGradient$distToVerticalSide2 = RadialGradientDrawable.Companion.createRadialGradient$distToVerticalSide(createRadialGradient$value, f);
                    Float valueOf2 = Float.valueOf(createRadialGradient$distToVerticalSide2);
                    createRadialGradient$distToHorizontalSide = RadialGradientDrawable.Companion.createRadialGradient$distToHorizontalSide(createRadialGradient$value2, f2);
                    Float valueOf3 = Float.valueOf(createRadialGradient$distToHorizontalSide);
                    createRadialGradient$distToHorizontalSide2 = RadialGradientDrawable.Companion.createRadialGradient$distToHorizontalSide(createRadialGradient$value2, f4);
                    return new Float[]{valueOf, valueOf2, valueOf3, Float.valueOf(createRadialGradient$distToHorizontalSide2)};
                }
            });
            if (radius instanceof Radius.Fixed) {
                floatValue = ((Radius.Fixed) radius).getValue();
            } else {
                if (!(radius instanceof Radius.Relative)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i3 = WhenMappings.$EnumSwitchMapping$0[((Radius.Relative) radius).getType().ordinal()];
                if (i3 == 1) {
                    floatValue = rl3.h0(createRadialGradient$lambda$0(bpn0Var)).floatValue();
                } else if (i3 == 2) {
                    floatValue = rl3.e0(createRadialGradient$lambda$0(bpn0Var)).floatValue();
                } else if (i3 == 3) {
                    floatValue = rl3.h0(createRadialGradient$lambda$1(bpn0Var2)).floatValue();
                } else {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    floatValue = rl3.e0(createRadialGradient$lambda$1(bpn0Var2)).floatValue();
                }
            }
            if (floatValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                floatValue = 0.01f;
            }
            return new RadialGradient(createRadialGradient$value, createRadialGradient$value2, floatValue, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }

        private Companion() {
        }
    }

    /* compiled from: RadialGradientDrawable.kt */
    public static abstract class Radius {

        /* compiled from: RadialGradientDrawable.kt */
        public static final class Fixed extends Radius {
            private final float value;

            public Fixed(float f) {
                super(null);
                this.value = f;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Fixed) && Float.compare(this.value, ((Fixed) obj).value) == 0;
            }

            public final float getValue() {
                return this.value;
            }

            public int hashCode() {
                return Float.hashCode(this.value);
            }

            public String toString() {
                return xq.c(')', this.value, new StringBuilder("Fixed(value="));
            }
        }

        /* compiled from: RadialGradientDrawable.kt */
        public static final class Relative extends Radius {
            private final Type type;

            /* compiled from: RadialGradientDrawable.kt */
            public enum Type {
                NEAREST_CORNER,
                FARTHEST_CORNER,
                NEAREST_SIDE,
                FARTHEST_SIDE
            }

            public Relative(Type type) {
                super(null);
                this.type = type;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Relative) && this.type == ((Relative) obj).type;
            }

            public final Type getType() {
                return this.type;
            }

            public int hashCode() {
                return this.type.hashCode();
            }

            public String toString() {
                return "Relative(type=" + this.type + ')';
            }
        }

        public /* synthetic */ Radius(zcl zclVar) {
            this();
        }

        private Radius() {
        }
    }

    public RadialGradientDrawable(Radius radius, Center center, Center center2, int[] iArr) {
        this.radius = radius;
        this.centerX = center;
        this.centerY = center2;
        this.colors = iArr;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawRect(this.rect, this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.paint.setShader(Companion.createRadialGradient(this.radius, this.centerX, this.centerY, this.colors, rect.width(), rect.height()));
        this.rect.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.paint.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
