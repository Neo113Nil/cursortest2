package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.voip.ui.VoipViewModelState;
import xsna.pbt0;
import xsna.y5j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class obt0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ obt0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                pbt0.a aVar = (pbt0.a) this.c;
                pbt0 pbt0Var = (pbt0) this.d;
                mbt0 mbt0Var = aVar.n;
                if (mbt0Var != null) {
                    pbt0Var.c.invoke(mbt0Var);
                }
                break;
            case 1:
                DisableableViewPager disableableViewPager = (DisableableViewPager) this.c;
                ViewPagerVh viewPagerVh = (ViewPagerVh) this.d;
                if (((Integer) obj).intValue() == disableableViewPager.getCurrentItem()) {
                    int currentItem = disableableViewPager.getCurrentItem();
                    sba sbaVar = viewPagerVh.s;
                    if (sbaVar != null) {
                        sbaVar.b(currentItem);
                    }
                    z = true;
                } else {
                    z = false;
                }
                break;
            case 2:
                y5j.b bVar = (y5j.b) this.c;
                y5j.a aVar2 = (y5j.a) this.d;
                q5j q5jVar = (q5j) obj;
                jor0.a(q5jVar.d, bVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                jor0.a(q5jVar.f, q5jVar.c.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                jcv.b(q5jVar.g, aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                break;
            default:
                tlp tlpVar = (tlp) this.c;
                r6x0 r6x0Var = ((kcx0) this.d).d;
                fjw0 fjw0Var = (fjw0) obj;
                VoipViewModelState voipViewModelState = fjw0Var.a;
                VoipViewModelState voipViewModelState2 = VoipViewModelState.Idle;
                if (voipViewModelState != voipViewModelState2 && fjw0Var.b == voipViewModelState2) {
                    tlpVar.b(r6x0Var);
                } else if (voipViewModelState == voipViewModelState2) {
                    tlpVar.a(r6x0Var);
                    r6x0Var.s(null);
                    r6x0Var.n = null;
                    r6x0Var.g = null;
                    r6x0Var.j.clear();
                    r6x0Var.m.getClass();
                }
                break;
        }
        return s3q0.a;
    }
}
