package xsna;

/* compiled from: BottomActionItem.kt */
/* loaded from: classes6.dex */
public final class bqv {
    public final Integer a;
    public final String b;

    public bqv() {
        this(3, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqv)) {
            return false;
        }
        bqv bqvVar = (bqv) obj;
        return epx.f(this.a, bqvVar.a) && epx.f(this.b, bqvVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IconDataActionItem(iconRes=");
        sb.append(this.a);
        sb.append(", urlIcon=");
        return ho8.a(sb, this.b, ')');
    }

    public bqv(int i, Integer num, String str) {
        num = (i & 1) != 0 ? null : num;
        str = (i & 2) != 0 ? null : str;
        this.a = num;
        this.b = str;
    }
}
