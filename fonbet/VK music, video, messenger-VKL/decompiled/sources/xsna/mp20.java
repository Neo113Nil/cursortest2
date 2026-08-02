package xsna;

import com.vk.dialogslist.impl.list.adapter.DialogsListAdapter;

/* compiled from: MiniAppItem.kt */
/* loaded from: classes18.dex */
public final class mp20 implements pgm {
    public final DialogsListAdapter.ViewType b = DialogsListAdapter.ViewType.MINIAPP;

    public final boolean equals(Object obj) {
        return obj instanceof mp20;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.b.ordinal();
    }

    @Override // xsna.pgm
    public final DialogsListAdapter.ViewType l() {
        return this.b;
    }
}
