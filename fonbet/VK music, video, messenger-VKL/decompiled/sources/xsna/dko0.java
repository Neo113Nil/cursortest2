package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.er9;

/* compiled from: TextPainter.kt */
/* loaded from: classes11.dex */
public final class dko0 {
    public static void a(oio oioVar, ljo0 ljo0Var, long j, long j2) {
        m540 m540Var = ljo0Var.b;
        kjo0 kjo0Var = ljo0Var.a;
        hik0 hik0Var = kjo0Var.b.a;
        v4j0 v4j0Var = hik0Var.n;
        pdo0 pdo0Var = hik0Var.m;
        qio qioVar = hik0Var.p;
        er9.b a0 = oioVar.a0();
        long d = a0.d();
        a0.a().e();
        try {
            fr9 fr9Var = a0.a;
            fr9Var.l(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            if (ljo0Var.e() && kjo0Var.f != 3) {
                long j3 = ljo0Var.c;
                fr9Var.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (j3 >> 32), (int) (j3 & 4294967295L), 1);
            }
            nmo0 nmo0Var = kjo0Var.b;
            yk8 e = nmo0Var.a.a.e();
            if (e == null || j != 16) {
                m540Var.j(oioVar.a0().a(), qxm0.s(Float.NaN, j != 16 ? j : nmo0Var.b()), v4j0Var, pdo0Var, qioVar);
            } else {
                m540Var.k(oioVar.a0().a(), e, Float.isNaN(Float.NaN) ? nmo0Var.a.a.a() : Float.NaN, v4j0Var, pdo0Var, qioVar);
            }
            nq.b(a0, d);
        } catch (Throwable th) {
            nq.b(a0, d);
            throw th;
        }
    }
}
