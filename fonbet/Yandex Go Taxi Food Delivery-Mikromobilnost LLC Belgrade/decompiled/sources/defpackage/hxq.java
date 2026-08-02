package defpackage;

/* loaded from: classes2.dex */
public final class hxq {
    public final int a;
    public final boolean b;

    public hxq(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxq)) {
            return false;
        }
        hxq hxqVar = (hxq) obj;
        return this.a == hxqVar.a && this.b == hxqVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FieldChoiceItem(fieldName=");
        sb.append(this.a);
        sb.append(", isChecked=");
        return unr0.u(sb, this.b, ')');
    }
}
