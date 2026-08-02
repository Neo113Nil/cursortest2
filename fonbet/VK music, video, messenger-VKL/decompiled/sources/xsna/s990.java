package xsna;

import com.vk.dialogslist.impl.list.adapter.DialogsListAdapter;

/* compiled from: PageLoadingItem.kt */
/* loaded from: classes18.dex */
public final class s990 implements pgm {
    public final boolean b;
    public final DialogsListAdapter.ViewType c = DialogsListAdapter.ViewType.PAGE_LOADING;

    public s990(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s990) && this.b == ((s990) obj).b;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(Boolean.hashCode(this.b));
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    @Override // xsna.pgm
    public final DialogsListAdapter.ViewType l() {
        return this.c;
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("PageLoadingItem(isEmptyLoad="), this.b, ')');
    }
}
