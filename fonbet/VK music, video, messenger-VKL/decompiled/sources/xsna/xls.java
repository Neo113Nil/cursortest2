package xsna;

import com.vk.dialogslist.impl.list.adapter.DialogsListAdapter;
import com.vk.im.engine.models.InfoBar;

/* compiled from: FriendsBirthdayItem.kt */
/* loaded from: classes18.dex */
public final class xls implements pgm {
    public final InfoBar b;
    public final DialogsListAdapter.ViewType c = DialogsListAdapter.ViewType.FRIENDS_BIRTHDAY_BANNER;

    public xls(InfoBar infoBar) {
        this.b = infoBar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xls) && epx.f(this.b, ((xls) obj).b);
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
        return "FriendsBirthdayItem(infoBar=" + this.b + ')';
    }
}
