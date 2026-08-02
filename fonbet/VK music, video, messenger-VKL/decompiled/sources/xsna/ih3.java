package xsna;

/* compiled from: DialogsListModels.kt */
/* loaded from: classes2.dex */
public final class ih3 implements lge0 {
    public final int b;
    public final boolean c;
    public final boolean d;

    public ih3(int i, boolean z, boolean z2) {
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    @Override // xsna.ogm
    public final int Za() {
        return 20;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih3)) {
            return false;
        }
        ih3 ih3Var = (ih3) obj;
        return this.b == ih3Var.b && this.c == ih3Var.c && this.d == ih3Var.d;
    }

    @Override // xsna.hfz
    public final /* bridge */ /* synthetic */ Number getItemId() {
        return 2147483636;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArchiveCountItem(unreadCount=");
        sb.append(this.b);
        sb.append(", hasMentions=");
        sb.append(this.c);
        sb.append(", isPullable=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
