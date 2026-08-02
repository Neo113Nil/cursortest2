package ru.ok.android.webrtc.mediarecord;

import android.graphics.Matrix;
import kotlin.Pair;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import xsna.an10;
import xsna.epx;
import xsna.izs;
import xsna.odj;
import xsna.s200;
import xsna.s3q0;
import xsna.swe0;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class VideoFrameTransform {

    @Deprecated
    public static final int FRAME_MAX_DIMENSION = 4096;

    @Deprecated
    public static final int FRAME_MIN_DIMENSION = 320;

    @Deprecated
    public static final int PERFECT_PIXELS = 16;

    @Deprecated
    public static final int PERFECT_RATIO_COUNTER = 16;

    @Deprecated
    public static final int PERFECT_RATIO_DENOMINATOR = 9;
    public final boolean a;
    public final boolean b;
    public final izs c;
    public final int d;
    public volatile Integer e;
    public volatile Integer f;
    public Transform.CropAndScale g;
    public Integer h;
    public Integer i;
    public Integer j;

    public interface Transform {

        public static final class CropAndScale implements Transform {
            public final int a;
            public final int b;
            public final int c;
            public final int d;
            public final int e;
            public final int f;
            public final boolean g;
            public SurfaceTextureHelper.FrameGeometry h;
            public final Matrix i = new Matrix();

            public CropAndScale(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.d = i4;
                this.e = i5;
                this.f = i6;
                this.g = z;
            }

            @Override // ru.ok.android.webrtc.mediarecord.VideoFrameTransform.Transform
            public SurfaceTextureHelper.FrameGeometry apply(Matrix matrix, int i, int i2) {
                Matrix matrix2;
                SurfaceTextureHelper.FrameGeometry frameGeometry = this.h;
                Matrix matrix3 = this.i;
                if (frameGeometry != null && frameGeometry.width == i && frameGeometry.height == i2 && epx.f(matrix3, matrix)) {
                    return frameGeometry;
                }
                if (this.g) {
                    Matrix matrix4 = new Matrix(matrix);
                    float f = i;
                    float f2 = i2;
                    matrix4.postTranslate(this.a / f, (i2 - (this.b + this.d)) / f2);
                    matrix4.postScale(this.c / f, this.d / f2);
                    matrix2 = matrix4;
                } else {
                    Matrix matrix5 = new Matrix();
                    float f3 = i;
                    float f4 = i2;
                    matrix5.preTranslate(this.a / f3, (i2 - (this.b + this.d)) / f4);
                    matrix5.preScale(this.c / f3, this.d / f4);
                    Matrix matrix6 = new Matrix(matrix);
                    matrix6.preConcat(matrix5);
                    matrix2 = matrix6;
                }
                SurfaceTextureHelper.FrameGeometry frameGeometry2 = new SurfaceTextureHelper.FrameGeometry(i, i2, this.e, this.f, matrix2);
                this.i.set(matrix);
                this.h = frameGeometry2;
                return frameGeometry2;
            }

            public final int getCropHeight$webrtc_android_sdk_release() {
                return this.d;
            }

            public final int getCropWidth$webrtc_android_sdk_release() {
                return this.c;
            }

            public final int getCropX$webrtc_android_sdk_release() {
                return this.a;
            }

            public final int getCropY$webrtc_android_sdk_release() {
                return this.b;
            }

            public final int getScaleHeight$webrtc_android_sdk_release() {
                return this.f;
            }

            public final int getScaleWidth$webrtc_android_sdk_release() {
                return this.e;
            }

            @Override // ru.ok.android.webrtc.mediarecord.VideoFrameTransform.Transform
            public Size toSize() {
                return new Size(this.e, this.f);
            }
        }

        public static final class NoOp implements Transform {
            public static final NoOp INSTANCE = new NoOp();

            @Override // ru.ok.android.webrtc.mediarecord.VideoFrameTransform.Transform
            public SurfaceTextureHelper.FrameGeometry apply(Matrix matrix, int i, int i2) {
                return null;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof NoOp);
            }

            public int hashCode() {
                return -1657027572;
            }

            @Override // ru.ok.android.webrtc.mediarecord.VideoFrameTransform.Transform
            public Size toSize() {
                return null;
            }

            public String toString() {
                return "NoOp";
            }
        }

        SurfaceTextureHelper.FrameGeometry apply(Matrix matrix, int i, int i2);

        Size toSize();
    }

    public VideoFrameTransform(boolean z, boolean z2, int i, izs<? super String, s3q0> izsVar) {
        this.a = z;
        this.b = z2;
        this.c = izsVar;
        this.d = swe0.g(i - (i % 16), 320, 4096);
    }

    public final Transform.CropAndScale a(int i, int i2) {
        Pair pair;
        float f;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.b) {
            int max = Math.max(i, i2);
            int min = Math.min(i, i2);
            Integer num = this.e;
            Integer num2 = this.f;
            int i15 = this.d;
            if (num != null && num2 != null) {
                i15 = Math.min(num.intValue(), num2.intValue());
            } else if (num != null) {
                i15 = num.intValue();
            } else if (num2 != null) {
                i15 = num2.intValue();
            }
            float f2 = i15;
            int b = an10.b((9 * f2) / 16) + 15;
            int i16 = b - (b % 16);
            float f3 = i16 / f2;
            int b2 = an10.b(max * f3);
            Pair pair2 = b2 <= min ? new Pair(Integer.valueOf(max), Integer.valueOf(b2)) : new Pair(Integer.valueOf(an10.b(min / f3)), Integer.valueOf(min));
            int intValue = ((Number) pair2.d()).intValue();
            int intValue2 = ((Number) pair2.g()).intValue();
            if (i >= i2) {
                i9 = (i - intValue) / 2;
                i10 = (i2 - intValue2) / 2;
                i13 = intValue;
                i14 = i16;
                i11 = intValue2;
                i12 = i15;
            } else {
                i9 = (i - intValue2) / 2;
                i10 = (i2 - intValue) / 2;
                i11 = intValue;
                i12 = i16;
                i13 = intValue2;
                i14 = i15;
            }
            return new Transform.CropAndScale(i9, i10, i13, i11, i12, i14, this.a);
        }
        Integer num3 = this.e;
        Integer num4 = this.f;
        int i17 = this.d;
        if (num3 != null && num4 != null) {
            i17 = Math.min(num3.intValue(), num4.intValue());
        } else if (num3 != null) {
            i17 = num3.intValue();
        } else if (num4 != null) {
            i17 = num4.intValue();
        }
        int max2 = Math.max(i, i2);
        if (max2 > i17) {
            f = i17 / max2;
            int min2 = Math.min(i, i2);
            if (min2 > 0) {
                float f4 = min2;
                int b3 = an10.b(f * f4);
                int i18 = b3 % 16;
                if (i18 > 0) {
                    int i19 = (b3 - i18) + 16;
                    if (i18 > i19 - b3) {
                        f = i19 / f4;
                    }
                }
            }
            pair = new Pair(Integer.valueOf(an10.b(i * f)), Integer.valueOf(an10.b(i2 * f)));
            z = true;
        } else {
            pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
            f = 1.0f;
            z = false;
        }
        int intValue3 = ((Number) pair.d()).intValue();
        int intValue4 = ((Number) pair.g()).intValue();
        int max3 = Math.max(intValue3, intValue4);
        int max4 = max3 < 320 ? Math.max(320 / max3, 2) : 1;
        int i20 = max4 == 1 ? max3 : max3 * max4;
        int min3 = Math.min(intValue3, intValue4);
        int i21 = max4 == 1 ? min3 : min3 * max4;
        if (i20 < i17) {
            i17 = i20 - (i20 % 16);
        }
        int i22 = i17 / 16;
        int i23 = i22 * 9;
        int o = i23 > i21 ? s200.o(i21, i22, 0) : s200.o(i23, i22, i21);
        if (max4 == 1) {
            max3 = i17;
        } else if (i17 != i20) {
            max3 = an10.b(i17 / max4);
        }
        if (z) {
            max3 = an10.b(max3 / f);
        }
        if (max4 == 1) {
            min3 = o;
        } else if (o != i21) {
            min3 = an10.b(o / max4);
        }
        if (z) {
            min3 = an10.b(min3 / f);
        }
        if (i >= i2) {
            i3 = (i - max3) / 2;
            i4 = (i2 - min3) / 2;
            i8 = min3;
            i7 = o;
            i6 = i17;
            i5 = max3;
        } else {
            i3 = (i - min3) / 2;
            i4 = (i2 - max3) / 2;
            i5 = min3;
            i6 = o;
            i7 = i17;
            i8 = max3;
        }
        return new Transform.CropAndScale(i3, i4, i5, i8, i6, i7, this.a);
    }

    public final boolean getUseAlgorithmV2() {
        return this.b;
    }

    public final boolean isCamera2ApiEnabled() {
        return this.a;
    }

    public final void restrictMaxDimension(Integer num) {
        Integer num2;
        if (num == null || num.intValue() <= 0 || num.intValue() >= this.d) {
            num2 = null;
        } else {
            int intValue = num.intValue();
            num2 = Integer.valueOf(swe0.g(intValue - (intValue % 16), 320, 4096));
        }
        this.e = num2;
    }

    public final void setScaleRestriction(Float f) {
        Integer num;
        if (f != null) {
            int b = an10.b(this.d * f.floatValue());
            num = Integer.valueOf(swe0.g(b - (b % 16), 320, 4096));
        } else {
            num = null;
        }
        this.f = num;
        this.c.invoke("Set scale restriction: " + f + " ");
    }

    public final Transform transform(int i, int i2) {
        Integer num;
        Integer num2;
        Integer num3;
        if (i == 0 || i2 == 0) {
            this.c.invoke("Wrong frame size: " + i + "x" + i2);
            return Transform.NoOp.INSTANCE;
        }
        Transform.CropAndScale cropAndScale = this.g;
        Integer num4 = this.e;
        Integer num5 = this.f;
        int i3 = this.d;
        if (num4 != null && num5 != null) {
            i3 = Math.min(num4.intValue(), num5.intValue());
        } else if (num4 != null) {
            i3 = num4.intValue();
        } else if (num5 != null) {
            i3 = num5.intValue();
        }
        if (cropAndScale != null && (num = this.h) != null && num.intValue() == i && (num2 = this.i) != null && num2.intValue() == i2 && (num3 = this.j) != null && num3.intValue() == i3) {
            return cropAndScale;
        }
        Transform.CropAndScale a = a(i, i2);
        this.g = a;
        this.h = Integer.valueOf(i);
        this.i = Integer.valueOf(i2);
        this.j = Integer.valueOf(i3);
        izs izsVar = this.c;
        int scaleWidth$webrtc_android_sdk_release = a.getScaleWidth$webrtc_android_sdk_release();
        int scaleHeight$webrtc_android_sdk_release = a.getScaleHeight$webrtc_android_sdk_release();
        StringBuilder a2 = odj.a(i, i2, "get new transform ", "x", " -> ");
        a2.append(scaleWidth$webrtc_android_sdk_release);
        a2.append("x");
        a2.append(scaleHeight$webrtc_android_sdk_release);
        izsVar.invoke(a2.toString());
        return a;
    }

    public final Size transformToSize(int i, int i2) {
        if (i != 0 && i2 != 0) {
            return a(i, i2).toSize();
        }
        this.c.invoke("Wrong frame size: " + i + "x" + i2);
        return null;
    }

    public /* synthetic */ VideoFrameTransform(boolean z, boolean z2, int i, izs izsVar, int i2, zcl zclVar) {
        this(z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? VideoRecord.DEFAULT_MAX_DIMENSION : i, izsVar);
    }
}
