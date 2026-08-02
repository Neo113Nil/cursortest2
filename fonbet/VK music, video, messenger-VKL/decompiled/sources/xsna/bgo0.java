package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.NoWhenBranchMatchedException;
import xsna.vho0;
import xsna.wlp0;

/* compiled from: TextFieldImpl.kt */
/* loaded from: classes11.dex */
public final class bgo0 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ nmo0 b;
    public final /* synthetic */ nmo0 c;
    public final /* synthetic */ mtk0<Float> d;
    public final /* synthetic */ mtk0<l5g> e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ mtk0<l5g> g;
    public final /* synthetic */ yzs<lgo0, androidx.compose.runtime.a, Integer, s3q0> h;
    public final /* synthetic */ ego0 i;

    public bgo0(nmo0 nmo0Var, nmo0 nmo0Var2, wlp0.d dVar, wlp0.d dVar2, boolean z, wlp0.d dVar3, yzs yzsVar, ego0 ego0Var) {
        this.b = nmo0Var;
        this.c = nmo0Var2;
        this.d = dVar;
        this.e = dVar2;
        this.f = z;
        this.g = dVar3;
        this.h = yzsVar;
        this.i = ego0Var;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        zho0 zho0Var;
        vho0 vho0Var;
        v4j0 j;
        v4j0 v4j0Var;
        hua0 hua0Var;
        yta0 yta0Var;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1076580032, intValue, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:139)");
            }
            float floatValue = this.d.getValue().floatValue();
            nmo0 nmo0Var = this.b;
            hik0 hik0Var = nmo0Var.a;
            nmo0 nmo0Var2 = this.c;
            hik0 hik0Var2 = nmo0Var2.a;
            vho0 vho0Var2 = iik0.d;
            vho0 vho0Var3 = hik0Var.a;
            vho0 vho0Var4 = hik0Var2.a;
            boolean z = vho0Var3 instanceof dl8;
            vho0 vho0Var5 = vho0.a.a;
            if (!z && !(vho0Var4 instanceof dl8)) {
                long D = f870.D(vho0Var3.c(), vho0Var4.c(), floatValue);
                if (D != 16) {
                    vho0Var5 = new j8g(D);
                }
            } else if (z && (vho0Var4 instanceof dl8)) {
                dl8 dl8Var = (dl8) vho0Var3;
                dl8 dl8Var2 = (dl8) vho0Var4;
                yk8 yk8Var = (yk8) iik0.b(floatValue, dl8Var.a, dl8Var2.a);
                float z2 = q6x.z(dl8Var.b, dl8Var2.b, floatValue);
                if (yk8Var != null) {
                    if (yk8Var instanceof rek0) {
                        long s = qxm0.s(z2, ((rek0) yk8Var).b);
                        if (s != 16) {
                            vho0Var5 = new j8g(s);
                        }
                    } else {
                        if (!(yk8Var instanceof n4j0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        vho0Var5 = new dl8((n4j0) yk8Var, z2);
                    }
                }
            } else {
                vho0Var5 = (vho0) iik0.b(floatValue, vho0Var3, vho0Var4);
            }
            vho0 vho0Var6 = vho0Var5;
            v4s v4sVar = (v4s) iik0.b(floatValue, hik0Var.f, hik0Var2.f);
            long c = iik0.c(hik0Var.b, hik0Var2.b, floatValue);
            b6s b6sVar = hik0Var.c;
            if (b6sVar == null) {
                b6sVar = b6s.h;
            }
            b6s b6sVar2 = hik0Var2.c;
            if (b6sVar2 == null) {
                b6sVar2 = b6s.h;
            }
            b6s b6sVar3 = new b6s(swe0.g(q6x.A(b6sVar.b, b6sVar2.b, floatValue), 1, 1000));
            u5s u5sVar = (u5s) iik0.b(floatValue, hik0Var.d, hik0Var2.d);
            v5s v5sVar = (v5s) iik0.b(floatValue, hik0Var.e, hik0Var2.e);
            String str = (String) iik0.b(floatValue, hik0Var.g, hik0Var2.g);
            long c2 = iik0.c(hik0Var.h, hik0Var2.h, floatValue);
            et6 et6Var = hik0Var.i;
            float f = et6Var != null ? et6Var.a : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            et6 et6Var2 = hik0Var2.i;
            float z3 = q6x.z(f, et6Var2 != null ? et6Var2.a : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, floatValue);
            zho0 zho0Var2 = hik0Var.j;
            zho0 zho0Var3 = zho0.c;
            if (zho0Var2 == null) {
                zho0Var2 = zho0Var3;
            }
            zho0 zho0Var4 = hik0Var2.j;
            if (zho0Var4 != null) {
                zho0Var3 = zho0Var4;
            }
            zho0 zho0Var5 = new zho0(q6x.z(zho0Var2.a, zho0Var3.a, floatValue), q6x.z(zho0Var2.b, zho0Var3.b, floatValue));
            lwz lwzVar = (lwz) iik0.b(floatValue, hik0Var.k, hik0Var2.k);
            long D2 = f870.D(hik0Var.l, hik0Var2.l, floatValue);
            pdo0 pdo0Var = (pdo0) iik0.b(floatValue, hik0Var.m, hik0Var2.m);
            v4j0 v4j0Var2 = hik0Var.n;
            v4j0 v4j0Var3 = hik0Var2.n;
            if (v4j0Var2 == null && v4j0Var3 == null) {
                zho0Var = zho0Var5;
                vho0Var = vho0Var6;
                v4j0Var = null;
            } else {
                if (v4j0Var2 == null) {
                    zho0Var = zho0Var5;
                    vho0Var = vho0Var6;
                    j = kci.j(v4j0.a(v4j0Var3, l5g.c(14, v4j0Var3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), v4j0Var3, floatValue);
                } else {
                    zho0Var = zho0Var5;
                    vho0Var = vho0Var6;
                    j = v4j0Var3 == null ? kci.j(v4j0Var2, v4j0.a(v4j0Var2, l5g.c(14, v4j0Var2.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), floatValue) : kci.j(v4j0Var2, v4j0Var3, floatValue);
                }
                v4j0Var = j;
            }
            hua0 hua0Var2 = hik0Var.o;
            hua0 hua0Var3 = hik0Var2.o;
            if (hua0Var2 == null && hua0Var3 == null) {
                hua0Var = null;
            } else {
                if (hua0Var2 == null) {
                    hua0Var2 = hua0.a;
                }
                hua0Var = hua0Var2;
            }
            hik0 hik0Var3 = new hik0(vho0Var, c, b6sVar3, u5sVar, v5sVar, v4sVar, str, c2, new et6(z3), zho0Var, lwzVar, D2, pdo0Var, v4j0Var, hua0Var, (qio) iik0.b(floatValue, hik0Var.p, hik0Var2.p));
            fh90 fh90Var = nmo0Var.b;
            fh90 fh90Var2 = nmo0Var2.b;
            int i = gh90.b;
            int i2 = ((obo0) iik0.b(floatValue, new obo0(fh90Var.a), new obo0(fh90Var2.a))).a;
            int i3 = ((udo0) iik0.b(floatValue, new udo0(fh90Var.b), new udo0(fh90Var2.b))).a;
            long c3 = iik0.c(fh90Var.c, fh90Var2.c, floatValue);
            iio0 iio0Var = fh90Var.d;
            if (iio0Var == null) {
                iio0Var = iio0.c;
            }
            iio0 iio0Var2 = fh90Var2.d;
            if (iio0Var2 == null) {
                iio0Var2 = iio0.c;
            }
            iio0 iio0Var3 = new iio0(iik0.c(iio0Var.a, iio0Var2.a, floatValue), iik0.c(iio0Var.b, iio0Var2.b, floatValue));
            yta0 yta0Var2 = fh90Var.e;
            yta0 yta0Var3 = fh90Var2.e;
            if (yta0Var2 == null && yta0Var3 == null) {
                yta0Var = null;
            } else {
                if (yta0Var2 == null) {
                    yta0Var2 = yta0.c;
                }
                yta0 yta0Var4 = yta0Var2;
                if (yta0Var3 == null) {
                    yta0Var3 = yta0.c;
                }
                yta0Var = yta0Var4.a == yta0Var3.a ? yta0Var4 : new yta0(((ydp) iik0.b(floatValue, new ydp(yta0Var4.b), new ydp(yta0Var3.b))).a, ((Boolean) iik0.b(floatValue, Boolean.valueOf(yta0Var4.a), Boolean.valueOf(yta0Var3.a))).booleanValue());
            }
            nmo0 nmo0Var3 = new nmo0(hik0Var3, new fh90(i2, i3, c3, iio0Var3, yta0Var, (t7z) iik0.b(floatValue, fh90Var.f, fh90Var2.f), ((q7z) iik0.b(floatValue, new q7z(fh90Var.g), new q7z(fh90Var2.g))).a, ((plv) iik0.b(floatValue, new plv(fh90Var.h), new plv(fh90Var2.h))).a, (zjo0) iik0.b(floatValue, fh90Var.i, fh90Var2.i)));
            if (this.f) {
                nmo0Var3 = nmo0.a(nmo0Var3, this.g.getValue().a, 0L, null, null, 0L, 0L, null, null, 16777214);
            }
            fgo0.b(this.e.getValue().a, nmo0Var3, kai.c(1157484991, new ago0(this.h, this.i), aVar2), aVar2, 384);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
