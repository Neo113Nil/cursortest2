package defpackage;

/* loaded from: classes4.dex */
public class nw61 implements Comparable {
    public final int[] a;
    public final int b;
    public String c;

    public nw61(int[] iArr) {
        if (iArr.length <= 0) {
            ny61.g("Components[] parameter can not be NULL or empty.");
            throw null;
        }
        this.a = (int[]) iArr.clone();
        int length = iArr.length;
        for (int i : iArr) {
            length += i * 37;
        }
        this.b = length;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(nw61 nw61Var) {
        int[] iArr = this.a;
        int length = iArr.length;
        int[] iArr2 = nw61Var.a;
        int[] iArr3 = nw61Var.a;
        int length2 = length < iArr2.length ? iArr.length : iArr2.length;
        for (int i = 0; i < length2; i++) {
            int i2 = iArr[i] - iArr3[i];
            if (i2 != 0) {
                return i2;
            }
        }
        return iArr.length - iArr3.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nw61) && compareTo((nw61) obj) == 0;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        if (this.c == null) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (true) {
                int[] iArr = this.a;
                if (i >= iArr.length) {
                    break;
                }
                if (i > 0) {
                    sb.append('.');
                }
                sb.append(iArr[i]);
                i++;
            }
            this.c = sb.toString();
        }
        return this.c;
    }
}
