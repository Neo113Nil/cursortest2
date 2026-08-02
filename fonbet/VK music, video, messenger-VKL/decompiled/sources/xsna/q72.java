package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import com.unity3d.services.UnityAdsConstants;
import xsna.er9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class q72 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ q72(long j, int i) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ColorFilter porterDuffColorFilter;
        switch (this.b) {
            case 0:
                kw8 kw8Var = (kw8) obj;
                final float intBitsToFloat = Float.intBitsToFloat((int) (kw8Var.b.d() >> 32)) / 2.0f;
                final agw d = nc2.d(kw8Var, intBitsToFloat);
                int i = Build.VERSION.SDK_INT;
                long j = this.c;
                if (i >= 29) {
                    se7.b();
                    porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
                } else {
                    porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
                }
                final oe7 oe7Var = new oe7(j, 5, porterDuffColorFilter);
                return kw8Var.e(new izs() { // from class: xsna.r72
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        float f = intBitsToFloat;
                        agw agwVar = d;
                        oe7 oe7Var2 = oe7Var;
                        ggj ggjVar = (ggj) obj2;
                        ggjVar.s1();
                        er9.b a0 = ggjVar.a0();
                        long d2 = a0.d();
                        a0.a().e();
                        try {
                            fr9 fr9Var = a0.a;
                            fr9Var.l(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            fr9Var.h(45.0f, 0L);
                            oio.R(ggjVar, agwVar, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oe7Var2, 46);
                            nq.b(a0, d2);
                            return s3q0.a;
                        } catch (Throwable th) {
                            nq.b(a0, d2);
                            throw th;
                        }
                    }
                });
            default:
                hpm e = ((xgl0) obj).b().e();
                long j2 = this.c;
                com.vk.im.engine.models.dialogs.b c = e.c(j2);
                boolean z = false;
                if (c != null ? epx.f(c.n, Boolean.TRUE) : false) {
                    e.q(j2, null);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
