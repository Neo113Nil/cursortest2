package defpackage;

import com.ybsdk.feature.pfm.internal.ui.widgets.PfmFilterBottomSheetContentView;

/* loaded from: classes3.dex */
public final /* synthetic */ class eab0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PfmFilterBottomSheetContentView b;

    public /* synthetic */ eab0(PfmFilterBottomSheetContentView pfmFilterBottomSheetContentView, int i) {
        this.a = i;
        this.b = pfmFilterBottomSheetContentView;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 itemsAdapter$lambda$0;
        zy11 itemsAdapter$lambda$1;
        int i = this.a;
        PfmFilterBottomSheetContentView pfmFilterBottomSheetContentView = this.b;
        switch (i) {
            case 0:
                itemsAdapter$lambda$0 = PfmFilterBottomSheetContentView.itemsAdapter$lambda$0(pfmFilterBottomSheetContentView, (nab0) obj, ((Boolean) obj2).booleanValue());
                return itemsAdapter$lambda$0;
            default:
                itemsAdapter$lambda$1 = PfmFilterBottomSheetContentView.itemsAdapter$lambda$1(pfmFilterBottomSheetContentView, (dab0) obj, ((Boolean) obj2).booleanValue());
                return itemsAdapter$lambda$1;
        }
    }
}
