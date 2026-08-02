package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes11.dex */
public class g730 implements w73 {
    public RectF j;
    public PathMeasure l;
    public boolean n;
    public boolean o;
    public final RectF d = new RectF();
    public final RectF e = new RectF();
    public final RectF f = new RectF();
    public final PointF g = new PointF(0.0f, 0.0f);
    public final PointF h = new PointF(0.0f, 0.0f);
    public final Matrix i = new Matrix();
    public final Paint k = new Paint(1);
    public final float m = 1.0f;
    public final Path a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(vr90[] vr90VarArr) {
        int i;
        float[] fArr;
        char c;
        int i2;
        int i3;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float[] fArr2;
        float f9;
        float f10;
        float f11;
        Path path = this.a;
        path.reset();
        float[] fArr3 = new float[6];
        char c2 = 'm';
        int i4 = 0;
        char c3 = 'm';
        int i5 = 0;
        while (i5 < vr90VarArr.length) {
            vr90 vr90Var = vr90VarArr[i5];
            char c4 = vr90Var.a;
            float[] fArr4 = vr90Var.b;
            float f12 = fArr3[i4];
            float f13 = fArr3[1];
            float f14 = fArr3[2];
            float f15 = fArr3[3];
            float f16 = fArr3[4];
            float f17 = fArr3[5];
            switch (c4) {
                case 'A':
                case HProv.PP_BIO_STATISTICA_LEN /* 97 */:
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case MSException.ERROR_INVALID_PASSWORD /* 86 */:
                case 'h':
                case HProv.PP_INFO /* 118 */:
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case HProv.PP_CACHE_SIZE /* 115 */:
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f16, f17);
                    f12 = f16;
                    f14 = f12;
                    f13 = f17;
                    f15 = f13;
                default:
                    i = 2;
                    break;
            }
            float f18 = f12;
            float f19 = f15;
            float f20 = f16;
            float f21 = f17;
            int i6 = i4;
            float f22 = f13;
            int i7 = i6;
            while (i7 < fArr4.length) {
                if (c4 == 'A') {
                    fArr = fArr4;
                    c = c4;
                    i2 = i7;
                    i3 = i5;
                    int i8 = i2 + 5;
                    int i9 = i2 + 6;
                    vr90.a(path, f18, f22, fArr[i8], fArr[i9], fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != 0.0f ? 1 : i6, fArr[i2 + 4] != 0.0f ? 1 : i6);
                    float f23 = fArr[i8];
                    f = fArr[i9];
                    f14 = f23;
                    f18 = f14;
                    f19 = f;
                } else if (c4 != 'C') {
                    if (c4 == 'H') {
                        fArr = fArr4;
                        c = c4;
                        i2 = i7;
                        i3 = i5;
                        f = f22;
                        path.lineTo(fArr[i2], f);
                        f2 = fArr[i2];
                    } else if (c4 == 'Q') {
                        fArr = fArr4;
                        c = c4;
                        i2 = i7;
                        i3 = i5;
                        int i10 = i2 + 1;
                        int i11 = i2 + 2;
                        int i12 = i2 + 3;
                        path.quadTo(fArr[i2], fArr[i10], fArr[i11], fArr[i12]);
                        float f24 = fArr[i2];
                        float f25 = fArr[i10];
                        float f26 = fArr[i11];
                        f19 = f25;
                        f = fArr[i12];
                        f14 = f24;
                        f18 = f26;
                    } else if (c4 == 'V') {
                        fArr = fArr4;
                        c = c4;
                        i2 = i7;
                        i3 = i5;
                        path.lineTo(f18, fArr[i2]);
                        f = fArr[i2];
                    } else if (c4 != 'a') {
                        if (c4 != 'c') {
                            if (c4 == 'h') {
                                fArr = fArr4;
                                c = c4;
                                i2 = i7;
                                path.rLineTo(fArr[i2], 0.0f);
                                f18 += fArr[i2];
                            } else if (c4 != 'q') {
                                if (c4 != 'v') {
                                    if (c4 != 'L') {
                                        if (c4 == 'M') {
                                            fArr = fArr4;
                                            c = c4;
                                            i2 = i7;
                                            f7 = fArr[i2];
                                            f = fArr[i2 + 1];
                                            if (i2 > 0) {
                                                path.lineTo(f7, f);
                                            } else {
                                                path.moveTo(f7, f);
                                                f18 = f7;
                                                f20 = f18;
                                                f21 = f;
                                            }
                                        } else if (c4 == 'S') {
                                            fArr = fArr4;
                                            c = c4;
                                            i2 = i7;
                                            if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                f18 = (f18 * 2.0f) - f14;
                                                f22 = (f22 * 2.0f) - f19;
                                            }
                                            float f27 = f18;
                                            float f28 = f22;
                                            int i13 = i2 + 1;
                                            int i14 = i2 + 2;
                                            int i15 = i2 + 3;
                                            path.cubicTo(f27, f28, fArr[i2], fArr[i13], fArr[i14], fArr[i15]);
                                            float f29 = fArr[i2];
                                            float f30 = fArr[i13];
                                            float f31 = fArr[i14];
                                            f19 = f30;
                                            f = fArr[i15];
                                            f14 = f29;
                                            f18 = f31;
                                        } else if (c4 == 'T') {
                                            fArr = fArr4;
                                            c = c4;
                                            i2 = i7;
                                            if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                f18 = (f18 * 2.0f) - f14;
                                                f22 = (f22 * 2.0f) - f19;
                                            }
                                            int i16 = i2 + 1;
                                            path.quadTo(f18, f22, fArr[i2], fArr[i16]);
                                            f2 = fArr[i2];
                                            f = fArr[i16];
                                            i3 = i5;
                                            f14 = f18;
                                            f19 = f22;
                                        } else if (c4 == 'l') {
                                            fArr = fArr4;
                                            c = c4;
                                            i2 = i7;
                                            int i17 = i2 + 1;
                                            path.rLineTo(fArr[i2], fArr[i17]);
                                            f18 += fArr[i2];
                                            f6 = fArr[i17];
                                        } else if (c4 == c2) {
                                            fArr = fArr4;
                                            c = c4;
                                            i2 = i7;
                                            float f32 = fArr[i2];
                                            f18 += f32;
                                            float f33 = fArr[i2 + 1];
                                            f22 += f33;
                                            if (i2 > 0) {
                                                path.rLineTo(f32, f33);
                                            } else {
                                                path.rMoveTo(f32, f33);
                                                i3 = i5;
                                                f20 = f18;
                                                f = f22;
                                                f21 = f;
                                            }
                                        } else if (c4 != 's') {
                                            if (c4 == 't') {
                                                if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                    f10 = f18 - f14;
                                                    f11 = f22 - f19;
                                                } else {
                                                    f10 = 0.0f;
                                                    f11 = 0.0f;
                                                }
                                                int i18 = i7 + 1;
                                                path.rQuadTo(f10, f11, fArr4[i7], fArr4[i18]);
                                                float f34 = f10 + f18;
                                                f19 = f11 + f22;
                                                f18 += fArr4[i7];
                                                f22 += fArr4[i18];
                                                f14 = f34;
                                            }
                                            fArr = fArr4;
                                            c = c4;
                                            i2 = i7;
                                        } else {
                                            if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                f8 = f18 - f14;
                                                float f35 = f22 - f19;
                                                fArr2 = fArr4;
                                                f9 = f35;
                                            } else {
                                                fArr2 = fArr4;
                                                f8 = 0.0f;
                                                f9 = 0.0f;
                                            }
                                            int i19 = i7 + 1;
                                            fArr = fArr2;
                                            int i20 = i7 + 2;
                                            i2 = i7;
                                            int i21 = i2 + 3;
                                            c = c4;
                                            path.rCubicTo(f8, f9, fArr2[i7], fArr[i19], fArr[i20], fArr[i21]);
                                            f3 = fArr[i2] + f18;
                                            f4 = fArr[i19] + f22;
                                            f18 += fArr[i20];
                                            f5 = fArr[i21];
                                        }
                                        i3 = i5;
                                    } else {
                                        fArr = fArr4;
                                        c = c4;
                                        i2 = i7;
                                        int i22 = i2 + 1;
                                        path.lineTo(fArr[i2], fArr[i22]);
                                        f7 = fArr[i2];
                                        f = fArr[i22];
                                    }
                                    f18 = f7;
                                    i3 = i5;
                                } else {
                                    fArr = fArr4;
                                    c = c4;
                                    i2 = i7;
                                    path.rLineTo(0.0f, fArr[i2]);
                                    f6 = fArr[i2];
                                }
                                f22 += f6;
                            } else {
                                fArr = fArr4;
                                c = c4;
                                i2 = i7;
                                int i23 = i2 + 1;
                                int i24 = i2 + 2;
                                int i25 = i2 + 3;
                                path.rQuadTo(fArr[i2], fArr[i23], fArr[i24], fArr[i25]);
                                f3 = fArr[i2] + f18;
                                f4 = fArr[i23] + f22;
                                f18 += fArr[i24];
                                f5 = fArr[i25];
                            }
                            i3 = i5;
                            f = f22;
                        } else {
                            fArr = fArr4;
                            c = c4;
                            i2 = i7;
                            int i26 = i2 + 2;
                            int i27 = i2 + 3;
                            int i28 = i2 + 4;
                            int i29 = i2 + 5;
                            path.rCubicTo(fArr[i2], fArr[i2 + 1], fArr[i26], fArr[i27], fArr[i28], fArr[i29]);
                            f3 = fArr[i26] + f18;
                            f4 = fArr[i27] + f22;
                            f18 += fArr[i28];
                            f5 = fArr[i29];
                        }
                        f22 += f5;
                        f14 = f3;
                        f19 = f4;
                        i3 = i5;
                        f = f22;
                    } else {
                        fArr = fArr4;
                        c = c4;
                        i2 = i7;
                        int i30 = i2 + 5;
                        int i31 = i2 + 6;
                        i3 = i5;
                        float f36 = f18;
                        float f37 = f22;
                        vr90.a(path, f36, f37, fArr[i30] + f18, fArr[i31] + f22, fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != 0.0f ? 1 : i6, fArr[i2 + 4] != 0.0f ? 1 : i6);
                        f18 = f36 + fArr[i30];
                        f = fArr[i31] + f37;
                        f19 = f;
                        f14 = f18;
                    }
                    f18 = f2;
                } else {
                    fArr = fArr4;
                    c = c4;
                    i2 = i7;
                    i3 = i5;
                    int i32 = i2 + 2;
                    int i33 = i2 + 3;
                    int i34 = i2 + 4;
                    int i35 = i2 + 5;
                    path.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i32], fArr[i33], fArr[i34], fArr[i35]);
                    float f38 = fArr[i34];
                    f = fArr[i35];
                    float f39 = fArr[i32];
                    f19 = fArr[i33];
                    f18 = f38;
                    f14 = f39;
                }
                i7 = i2 + i;
                f22 = f;
                fArr4 = fArr;
                i5 = i3;
                c3 = c;
                c4 = c3;
                c2 = 'm';
            }
            int i36 = i5;
            fArr3[i6] = f18;
            fArr3[1] = f22;
            fArr3[2] = f14;
            fArr3[3] = f19;
            fArr3[4] = f20;
            fArr3[5] = f21;
            c3 = vr90VarArr[i36].a;
            i5 = i36 + 1;
            i4 = i6;
            c2 = 'm';
        }
        RectF rectF = this.d;
        path.computeBounds(rectF, true);
        float width = rectF.width();
        float height = rectF.height();
        if (width > height) {
            rectF.inset(0.0f, -((width - height) / 2.0f));
        } else if (width < height) {
            rectF.inset(-((height - width) / 2.0f), 0.0f);
        }
        this.n = true;
    }
}
