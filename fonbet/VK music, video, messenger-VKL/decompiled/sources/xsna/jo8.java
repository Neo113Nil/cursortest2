package xsna;

import com.vk.dialogslist.impl.list.adapter.DialogsListAdapter;

/* compiled from: BusinessNotificationsItem.kt */
/* loaded from: classes18.dex */
public final class jo8 implements pgm {
    public final int b;
    public final String c;
    public final Long d;
    public final DialogsListAdapter.ViewType e = DialogsListAdapter.ViewType.BUSINESS_NOTIFICATION;

    public jo8(int i, Long l, String str) {
        this.b = i;
        this.c = str;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo8)) {
            return false;
        }
        jo8 jo8Var = (jo8) obj;
        return this.b == jo8Var.b && this.c.equals(jo8Var.c) && epx.f(this.d, jo8Var.d);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (Integer.hashCode(this.b) * 31)) * 31;
        Long l = this.d;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    @Override // xsna.pgm
    public final DialogsListAdapter.ViewType l() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BusinessNotificationsItem(count=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append((Object) this.c);
        sb.append(", lastMsgTime=");
        return iq.b(sb, this.d, ')');
    }
}
