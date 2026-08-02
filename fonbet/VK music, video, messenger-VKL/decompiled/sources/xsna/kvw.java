package xsna;

import com.vk.dialogslist.impl.list.adapter.DialogsListAdapter;
import com.vk.im.engine.models.InfoBar;

/* compiled from: InfoBarItem.kt */
/* loaded from: classes18.dex */
public final class kvw implements pgm {
    public final InfoBar b;
    public final DialogsListAdapter.ViewType c = DialogsListAdapter.ViewType.INFOBAR;

    public kvw(InfoBar infoBar) {
        this.b = infoBar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kvw) && epx.f(this.b, ((kvw) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.hashCode());
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.pgm
    public final DialogsListAdapter.ViewType l() {
        return this.c;
    }

    public final String toString() {
        return "InfoBarItem(infoBar=" + this.b + ')';
    }
}
