package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import xsna.cpc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class t77 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t77(zpc zpcVar, boolean z, z37 z37Var) {
        this.d = zpcVar;
        this.c = z;
        this.e = z37Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                wj50 wj50Var = (wj50) this.d;
                izs izsVar = (izs) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(390522358, intValue, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.pin.ContentScene.<anonymous>.<anonymous>.<anonymous> (BiometricsLockPinView.kt:210)");
                    }
                    boolean z = this.c;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (z) {
                        aVar.K(1629832981);
                        boolean y = aVar.y(wj50Var);
                        Object x = aVar.x();
                        if (y || x == c0012a) {
                            x = new m1(wj50Var, 7);
                            aVar.R(x);
                        }
                        com.vk.biometrics.lock.impl.presentation.base.mvi.pin.j.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, (gzs) x, aVar, 0);
                        aVar.j();
                    } else {
                        aVar.K(1629837215);
                        boolean J = aVar.J(izsVar);
                        Object x2 = aVar.x();
                        if (J || x2 == c0012a) {
                            x2 = new jd(izsVar, 10);
                            aVar.R(x2);
                        }
                        com.vk.biometrics.lock.impl.presentation.base.mvi.pin.j.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, (gzs) x2, aVar, 0);
                        aVar.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                zpc zpcVar = (zpc) this.d;
                z37 z37Var = (z37) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(155298089, intValue2, -1, "com.vk.clips.attachments.impl.publish.cta.donut.presentation.compose.ClipCtaWithDonutComposeContent.<anonymous>.<anonymous> (ClipCtaWithDonutComposeContent.kt:88)");
                    }
                    boolean J2 = aVar2.J(z37Var);
                    Object x3 = aVar2.x();
                    if (J2 || x3 == a.C0011a.a) {
                        cpc.c cVar = new cpc.c(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                        aVar2.R(cVar);
                        x3 = cVar;
                    }
                    cpc.c(zpcVar, this.c, (izs) ((fcy) x3), aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ t77(boolean z, wj50 wj50Var, izs izsVar) {
        this.c = z;
        this.d = wj50Var;
        this.e = izsVar;
    }
}
