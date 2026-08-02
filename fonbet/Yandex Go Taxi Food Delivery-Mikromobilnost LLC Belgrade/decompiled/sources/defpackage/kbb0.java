package defpackage;

import com.ybsdk.feature.pfm.internal.ui.PfmFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class kbb0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ l761 b;
    public final /* synthetic */ PfmFragment c;

    public /* synthetic */ kbb0(l761 l761Var, PfmFragment pfmFragment, int i) {
        this.a = i;
        this.b = l761Var;
        this.c = pfmFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onViewCreated$lambda$13$lambda$10;
        zy11 onViewCreated$lambda$13$lambda$11;
        zy11 scrollToTop$lambda$28$lambda$27;
        int i = this.a;
        PfmFragment pfmFragment = this.c;
        l761 l761Var = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$13$lambda$10 = PfmFragment.onViewCreated$lambda$13$lambda$10(l761Var, pfmFragment);
                return onViewCreated$lambda$13$lambda$10;
            case 1:
                onViewCreated$lambda$13$lambda$11 = PfmFragment.onViewCreated$lambda$13$lambda$11(l761Var, pfmFragment);
                return onViewCreated$lambda$13$lambda$11;
            default:
                scrollToTop$lambda$28$lambda$27 = PfmFragment.scrollToTop$lambda$28$lambda$27(l761Var, pfmFragment);
                return scrollToTop$lambda$28$lambda$27;
        }
    }
}
