package xsna;

/* compiled from: DialogsListModels.kt */
/* loaded from: classes2.dex */
public final class ro8 implements lge0 {
    public final int b;
    public final boolean c;

    public ro8(int i, boolean z) {
        this.b = i;
        this.c = z;
    }

    @Override // xsna.ogm
    public final int Za() {
        return 14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro8)) {
            return false;
        }
        ro8 ro8Var = (ro8) obj;
        return this.b == ro8Var.b && this.c == ro8Var.c;
    }

    @Override // xsna.hfz
    public final /* bridge */ /* synthetic */ Number getItemId() {
        return 2147483642;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BusinessNotifyItem(count=");
        sb.append(this.b);
        sb.append(", isPullable=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
