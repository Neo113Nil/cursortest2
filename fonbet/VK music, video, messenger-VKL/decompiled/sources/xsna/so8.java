package xsna;

/* compiled from: DialogsListModels.kt */
/* loaded from: classes2.dex */
public final class so8 implements ogm {
    public final int b;
    public final String c;
    public final Long d;

    public so8(int i, Long l, String str) {
        this.b = i;
        this.c = str;
        this.d = l;
    }

    @Override // xsna.ogm
    public final int Za() {
        return 23;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so8)) {
            return false;
        }
        so8 so8Var = (so8) obj;
        return this.b == so8Var.b && this.c.equals(so8Var.c) && epx.f(this.d, so8Var.d);
    }

    @Override // xsna.hfz
    public final /* bridge */ /* synthetic */ Number getItemId() {
        return 2147483634;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (Integer.hashCode(this.b) * 31)) * 31;
        Long l = this.d;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BusinessNotifyItemNew(unreadCount=");
        sb.append(this.b);
        sb.append(", lastSenderName=");
        sb.append((Object) this.c);
        sb.append(", lastMsgTime=");
        return iq.b(sb, this.d, ')');
    }
}
