package defpackage;

import com.google.android.material.appbar.AppBarLayout;
import com.ybsdk.feature.pfm.internal.ui.PfmFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class jbb0 implements ip2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PfmFragment b;

    public /* synthetic */ jbb0(PfmFragment pfmFragment, int i) {
        this.a = i;
        this.b = pfmFragment;
    }

    @Override // defpackage.gp2
    public final void a(AppBarLayout appBarLayout, int i) {
        int i2 = this.a;
        PfmFragment pfmFragment = this.b;
        switch (i2) {
            case 0:
                pfmFragment.onAppBarOffsetChanged(appBarLayout, i);
                break;
            default:
                PfmFragment.expandedCategoriesAppBarListener$lambda$6(pfmFragment, appBarLayout, i);
                break;
        }
    }
}
