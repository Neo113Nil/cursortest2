package xsna;

import com.vk.dialogslist.impl.list.adapter.DialogsListAdapter;

/* compiled from: MessagesRequestsItem.kt */
/* loaded from: classes18.dex */
public final class og20 implements pgm {
    public final int b;
    public final String c;
    public final Long d;
    public final DialogsListAdapter.ViewType e = DialogsListAdapter.ViewType.MESSAGES_REQUESTS;

    public og20(int i, Long l, String str) {
        this.b = i;
        this.c = str;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og20)) {
            return false;
        }
        og20 og20Var = (og20) obj;
        return this.b == og20Var.b && this.c.equals(og20Var.c) && epx.f(this.d, og20Var.d);
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
        StringBuilder sb = new StringBuilder("MessagesRequestsItem(count=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append((Object) this.c);
        sb.append(", lastMsgTime=");
        return iq.b(sb, this.d, ')');
    }
}
