package defpackage;

import com.ybsdk.feature.pfm.internal.ui.widgets.PfmFiltersView;

/* loaded from: classes3.dex */
public final /* synthetic */ class fbb0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PfmFiltersView b;

    public /* synthetic */ fbb0(PfmFiltersView pfmFiltersView, int i) {
        this.a = i;
        this.b = pfmFiltersView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 filtersAdapter_delegate$lambda$2$lambda$0;
        zy11 filtersAdapter_delegate$lambda$2$lambda$1;
        int i = this.a;
        PfmFiltersView pfmFiltersView = this.b;
        dbb0 dbb0Var = (dbb0) obj;
        switch (i) {
            case 0:
                filtersAdapter_delegate$lambda$2$lambda$0 = PfmFiltersView.filtersAdapter_delegate$lambda$2$lambda$0(pfmFiltersView, dbb0Var);
                return filtersAdapter_delegate$lambda$2$lambda$0;
            default:
                filtersAdapter_delegate$lambda$2$lambda$1 = PfmFiltersView.filtersAdapter_delegate$lambda$2$lambda$1(pfmFiltersView, dbb0Var);
                return filtersAdapter_delegate$lambda$2$lambda$1;
        }
    }
}
