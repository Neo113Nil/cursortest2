package defpackage;

import com.ybsdk.feature.pfm.internal.ui.PfmFragment;
import java.util.Set;

/* loaded from: classes3.dex */
public final /* synthetic */ class hbb0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PfmFragment b;

    public /* synthetic */ hbb0(PfmFragment pfmFragment, int i) {
        this.a = i;
        this.b = pfmFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int filtersPaddingTopPx_delegate$lambda$0;
        Set adapter$lambda$1;
        zy11 adapter$lambda$3;
        zy11 thresholdItemScrollListener$lambda$4;
        int i = this.a;
        PfmFragment pfmFragment = this.b;
        switch (i) {
            case 0:
                filtersPaddingTopPx_delegate$lambda$0 = PfmFragment.filtersPaddingTopPx_delegate$lambda$0(pfmFragment);
                return Integer.valueOf(filtersPaddingTopPx_delegate$lambda$0);
            case 1:
                adapter$lambda$1 = PfmFragment.adapter$lambda$1(pfmFragment);
                return adapter$lambda$1;
            case 2:
                adapter$lambda$3 = PfmFragment.adapter$lambda$3(pfmFragment);
                return adapter$lambda$3;
            default:
                thresholdItemScrollListener$lambda$4 = PfmFragment.thresholdItemScrollListener$lambda$4(pfmFragment);
                return thresholdItemScrollListener$lambda$4;
        }
    }
}
