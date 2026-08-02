package xsna;

/* compiled from: GoodTextDescriptionItemHolder.kt */
/* loaded from: classes18.dex */
public final class n8u {
    public final int a;
    public final String b;

    public n8u(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8u)) {
            return false;
        }
        n8u n8uVar = (n8u) obj;
        return this.a == n8uVar.a && epx.f(this.b, n8uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoodTextDescriptionItemInfo(titleRes=");
        sb.append(this.a);
        sb.append(", text=");
        return ho8.a(sb, this.b, ')');
    }
}
