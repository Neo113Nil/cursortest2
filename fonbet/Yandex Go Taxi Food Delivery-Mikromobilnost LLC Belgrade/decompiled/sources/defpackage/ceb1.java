package defpackage;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import com.yandex.go.design.compose.icon.IconSpotSize;
import com.yandex.go.design.compose.icon.IconSpotStyle;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class ceb1 {
    public static au2 a;

    public static final void a(n8v n8vVar, f530 f530Var, IconSpotSize iconSpotSize, IconSpotStyle iconSpotStyle, fid fidVar, int i) {
        int i2;
        hdu hduVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1230869473);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n8vVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.c(iconSpotSize == null ? -1 : iconSpotSize.ordinal()) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.c(iconSpotStyle != null ? iconSpotStyle.ordinal() : -1) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            int[] iArr = uts0.a;
            int i3 = iArr[iconSpotStyle.ordinal()];
            tp2 tp2Var = null;
            if (i3 == 1) {
                hduVar = e5v.a;
            } else if (i3 == 2) {
                hduVar = e5v.b;
            } else {
                if (i3 != 3) {
                    w511.b();
                    return;
                }
                hduVar = null;
            }
            int i4 = iArr[iconSpotStyle.ordinal()];
            if (i4 != 1 && i4 != 2) {
                if (i4 != 3) {
                    w511.b();
                    return;
                }
                tp2Var = tp2.a;
            }
            e5v.a(f530Var, hduVar, tp2Var, iconSpotSize, wwg.S(1198791507, true, new w7o0(17, n8vVar), btsVar), btsVar, ((i2 >> 3) & 14) | HProv.ALG_CLASS_DATA_ENCRYPT | ((i2 << 3) & 7168), 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0((Object) n8vVar, f530Var, (Object) iconSpotSize, (Object) iconSpotStyle, i, 11);
        }
    }

    public static CameraUnavailableException b(CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int a2 = cameraAccessExceptionCompat.a();
        int i = 1;
        if (a2 != 1) {
            i = 2;
            if (a2 != 2) {
                i = 3;
                if (a2 != 3) {
                    i = 4;
                    if (a2 != 4) {
                        i = 5;
                        if (a2 != 5) {
                            i = a2 != 10001 ? 0 : 6;
                        }
                    }
                }
            }
        }
        return new CameraUnavailableException(i, cameraAccessExceptionCompat);
    }

    public static final au2 c() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("Letter", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 uq90Var = new uq90();
        uq90Var.k(12.0f, 12.5f);
        uq90Var.i(7.97f, -4.55f);
        uq90Var.b(2.0f, 2.0f, false, false, -0.12f, -0.72f);
        uq90Var.b(2.0f, 2.0f, false, false, -1.08f, -1.08f);
        uq90Var.b(2.0f, 2.0f, false, false, -0.72f, -0.12f);
        uq90Var.d(17.58f, 6.0f, 16.95f, 6.0f, 16.0f, 6.0f);
        uq90Var.f(8.0f);
        uq90Var.e(-0.96f, 0.0f, -1.58f, 0.0f, -2.05f, 0.03f);
        uq90Var.n(-0.63f, 0.09f, -0.72f, 0.12f);
        uq90Var.b(2.0f, 2.0f, false, false, -1.08f, 1.08f);
        uq90Var.e(-0.03f, 0.09f, -0.09f, 0.26f, -0.12f, 0.72f);
        uq90Var.c();
        uq90Var.j(22.0f, 10.0f);
        uq90Var.p(4.0f);
        uq90Var.e(0.0f, 1.86f, 0.0f, 2.8f, -0.3f, 3.53f);
        uq90Var.b(4.0f, 4.0f, false, true, -2.17f, 2.17f);
        uq90Var.e(-0.73f, 0.3f, -1.67f, 0.3f, -3.53f, 0.3f);
        uq90Var.f(8.0f);
        uq90Var.e(-1.86f, 0.0f, -2.8f, 0.0f, -3.53f, -0.3f);
        uq90Var.b(4.0f, 4.0f, false, true, -2.17f, -2.17f);
        uq90Var.d(2.0f, 16.8f, 2.0f, 15.86f, 2.0f, 14.0f);
        uq90Var.p(-4.0f);
        uq90Var.e(0.0f, -1.86f, 0.0f, -2.8f, 0.3f, -3.53f);
        uq90Var.a(4.0f, 4.0f, false, true, 4.47f, 4.3f);
        uq90Var.d(5.2f, 4.0f, 6.14f, 4.0f, 8.0f, 4.0f);
        uq90Var.g(8.0f);
        uq90Var.e(1.86f, 0.0f, 2.8f, 0.0f, 3.53f, 0.3f);
        uq90Var.b(4.0f, 4.0f, false, true, 2.17f, 2.17f);
        uq90Var.e(0.3f, 0.73f, 0.3f, 1.67f, 0.3f, 3.53f);
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", uq90Var.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }
}
