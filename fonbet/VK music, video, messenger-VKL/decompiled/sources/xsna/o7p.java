package xsna;

import com.vk.dialogslist.impl.list.adapter.DialogsListAdapter;

/* compiled from: EduSwitchAccountItem.kt */
/* loaded from: classes18.dex */
public final class o7p implements pgm {
    public final DialogsListAdapter.ViewType b = DialogsListAdapter.ViewType.EDU_SWITCH_ACCOUNT;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7p)) {
            return false;
        }
        ((o7p) obj).getClass();
        return true;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        Integer.hashCode(0);
        throw null;
    }

    @Override // xsna.pgm
    public final DialogsListAdapter.ViewType l() {
        return this.b;
    }

    public final String toString() {
        return "EduSwitchAccountItem(unreadMessageCounter=0, accountType=null)";
    }
}
