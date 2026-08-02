package xsna;

import android.view.View;
import com.vk.lists.ListDataSet;

/* compiled from: MoneyTransferAdapter.kt */
/* loaded from: classes3.dex */
public final class t730 extends gf6<zif0> {
    public final o010 e;

    public t730(o010 o010Var, ListDataSet listDataSet) {
        super((hg6) listDataSet, false);
        this.e = o010Var;
    }

    @Override // xsna.gf6
    public final hf6 K0(int i, View view) {
        return new x730(view, this.e);
    }
}
