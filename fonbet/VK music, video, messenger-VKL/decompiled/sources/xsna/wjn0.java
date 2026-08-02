package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;

/* compiled from: Surface.kt */
/* loaded from: classes11.dex */
public final class wjn0 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ q630 b;
    public final /* synthetic */ r5j0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;
    public final /* synthetic */ y18 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ sg50 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ gzs<s3q0> j;
    public final /* synthetic */ float k;
    public final /* synthetic */ jai l;

    public wjn0(q630 q630Var, r5j0 r5j0Var, long j, float f, y18 y18Var, boolean z, sg50 sg50Var, boolean z2, gzs gzsVar, float f2, jai jaiVar) {
        this.b = q630Var;
        this.c = r5j0Var;
        this.d = j;
        this.e = f;
        this.f = y18Var;
        this.g = z;
        this.h = sg50Var;
        this.i = z2;
        this.j = gzsVar;
        this.k = f2;
        this.l = jaiVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1508735219, intValue, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:321)");
            }
            icv icvVar = zax.a;
            q630 f = kn4.f(lai0.a(xjn0.d(this.b.g(zr20.a), this.c, xjn0.e(this.d, this.e, aVar2), this.f, ((azl) aVar2.r(uvi.h)).I0(this.k)), this.g, this.h, ilg0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7), this.i, null, this.j));
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, true);
            int m = n34.m(aVar2);
            sy90 D = aVar2.D();
            q630 c = qri.c(aVar2, f);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar3);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, d, cri.a.f);
            k9q0.w(aVar2, D, cri.a.e);
            cri.a.b bVar = cri.a.g;
            if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m))) {
                kr.a(m, aVar2, m, bVar);
            }
            k9q0.w(aVar2, c, cri.a.d);
            if (er.f(0, aVar2, this.l)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
