package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class m881 implements Comparable {
    public final int a;
    public final int b;
    public final int c;

    public m881(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(m881 m881Var) {
        int i = m881Var.a;
        int i2 = this.a;
        if (i2 != i) {
            return jl40.q(i2, i);
        }
        int i3 = m881Var.b;
        int i4 = this.b;
        return i4 != i3 ? jl40.q(i4, i3) : jl40.q(this.c, m881Var.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m881)) {
            return false;
        }
        m881 m881Var = (m881) obj;
        return this.a == m881Var.a && this.b == m881Var.b && this.c == m881Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + fia1.b(this.b, Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return this.a + Extension.DOT_CHAR + this.b + Extension.DOT_CHAR + this.c;
    }
}
