package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.feature.qr.payments.internal.screens.list.presentation.view.SelectorListView;
import com.ybsdk.widgets.common.chip.ChipListView;

/* loaded from: classes3.dex */
public final /* synthetic */ class fqb implements zo31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ fqb(ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = viewGroup;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        View chipsAdapterDelegate$lambda$2$lambda$1;
        View selectorsAdapterDelegate$lambda$2$lambda$1;
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                chipsAdapterDelegate$lambda$2$lambda$1 = ChipListView.chipsAdapterDelegate$lambda$2$lambda$1(viewGroup);
                return chipsAdapterDelegate$lambda$2$lambda$1;
            default:
                selectorsAdapterDelegate$lambda$2$lambda$1 = SelectorListView.selectorsAdapterDelegate$lambda$2$lambda$1(viewGroup);
                return selectorsAdapterDelegate$lambda$2$lambda$1;
        }
    }
}
