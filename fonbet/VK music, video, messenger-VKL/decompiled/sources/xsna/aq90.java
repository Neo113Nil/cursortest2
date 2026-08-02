package xsna;

import java.io.File;
import java.util.ArrayList;
import okio.ByteString;

/* compiled from: Path.kt */
/* loaded from: classes11.dex */
public final class aq90 implements Comparable<aq90> {
    public static final String c = File.separator;
    public final ByteString b;

    /* compiled from: Path.kt */
    public static final class a {
        public static aq90 a(String str, boolean z) {
            ByteString byteString = d.a;
            vl8 vl8Var = new vl8();
            vl8Var.S(str);
            return d.d(vl8Var, z);
        }

        public static aq90 b(File file) {
            String str = aq90.c;
            return a(file.toString(), false);
        }
    }

    public aq90(ByteString byteString) {
        this.b = byteString;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a2 = d.a(this);
        ByteString byteString = this.b;
        if (a2 == -1) {
            a2 = 0;
        } else if (a2 < byteString.n() && byteString.s(a2) == 92) {
            a2++;
        }
        int n = byteString.n();
        int i = a2;
        while (a2 < n) {
            if (byteString.s(a2) == 47 || byteString.s(a2) == 92) {
                arrayList.add(byteString.w(i, a2));
                i = a2 + 1;
            }
            a2++;
        }
        if (i < byteString.n()) {
            arrayList.add(byteString.w(i, byteString.n()));
        }
        return arrayList;
    }

    public final String c() {
        ByteString byteString = d.a;
        int i = e.b;
        ByteString byteString2 = this.b;
        byteString2.getClass();
        int t = byteString2.t(i, byteString.r());
        if (t == -1) {
            ByteString byteString3 = d.b;
            byteString2.getClass();
            t = byteString2.t(i, byteString3.r());
        }
        if (t != -1) {
            byteString2 = ByteString.x(byteString2, t + 1, 0, 2);
        } else if (k() != null && byteString2.n() == 2) {
            byteString2 = ByteString.d;
        }
        return byteString2.A();
    }

    @Override // java.lang.Comparable
    public final int compareTo(aq90 aq90Var) {
        return this.b.compareTo(aq90Var.b);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aq90) && epx.f(((aq90) obj).b, this.b);
    }

    public final aq90 h() {
        ByteString byteString = d.d;
        ByteString byteString2 = this.b;
        if (epx.f(byteString2, byteString)) {
            return null;
        }
        ByteString byteString3 = d.a;
        if (epx.f(byteString2, byteString3)) {
            return null;
        }
        ByteString byteString4 = d.b;
        if (epx.f(byteString2, byteString4)) {
            return null;
        }
        ByteString byteString5 = d.e;
        if (byteString2.v(byteString2.n() - byteString5.n(), byteString5, byteString5.n()) && (byteString2.n() == 2 || byteString2.v(byteString2.n() - 3, byteString3, 1) || byteString2.v(byteString2.n() - 3, byteString4, 1))) {
            return null;
        }
        int i = e.b;
        byteString2.getClass();
        int t = byteString2.t(i, byteString3.r());
        if (t == -1) {
            byteString2.getClass();
            t = byteString2.t(i, byteString4.r());
        }
        if (t == 2 && k() != null) {
            if (byteString2.n() == 3) {
                return null;
            }
            return new aq90(ByteString.x(byteString2, 0, 3, 1));
        }
        if (t == 1 && byteString2.v(0, byteString4, byteString4.n())) {
            return null;
        }
        if (t != -1 || k() == null) {
            return t == -1 ? new aq90(byteString) : t == 0 ? new aq90(ByteString.x(byteString2, 0, 1, 1)) : new aq90(ByteString.x(byteString2, 0, t, 1));
        }
        if (byteString2.n() == 2) {
            return null;
        }
        return new aq90(ByteString.x(byteString2, 0, 2, 1));
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final aq90 i(aq90 aq90Var) {
        int a2 = d.a(this);
        ByteString byteString = this.b;
        aq90 aq90Var2 = a2 == -1 ? null : new aq90(byteString.w(0, a2));
        aq90Var.getClass();
        ByteString byteString2 = aq90Var.b;
        int a3 = d.a(aq90Var);
        if (!epx.f(aq90Var2, a3 != -1 ? new aq90(byteString2.w(0, a3)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + aq90Var).toString());
        }
        ArrayList a4 = a();
        ArrayList a5 = aq90Var.a();
        int min = Math.min(a4.size(), a5.size());
        int i = 0;
        while (i < min && epx.f(a4.get(i), a5.get(i))) {
            i++;
        }
        if (i == min && byteString.n() == byteString2.n()) {
            return a.a(".", false);
        }
        if (a5.subList(i, a5.size()).indexOf(d.e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + aq90Var).toString());
        }
        vl8 vl8Var = new vl8();
        ByteString c2 = d.c(aq90Var);
        if (c2 == null && (c2 = d.c(this)) == null) {
            c2 = d.f(c);
        }
        int size = a5.size();
        for (int i2 = i; i2 < size; i2++) {
            vl8Var.H(d.e);
            vl8Var.H(c2);
        }
        int size2 = a4.size();
        while (i < size2) {
            vl8Var.H((ByteString) a4.get(i));
            vl8Var.H(c2);
            i++;
        }
        return d.d(vl8Var, false);
    }

    public final aq90 j(String str) {
        vl8 vl8Var = new vl8();
        vl8Var.S(str);
        return d.b(this, d.d(vl8Var, false), false);
    }

    public final Character k() {
        ByteString byteString = d.a;
        ByteString byteString2 = this.b;
        if (ByteString.q(byteString2, byteString) != -1 || byteString2.n() < 2 || byteString2.s(1) != 58) {
            return null;
        }
        char s = (char) byteString2.s(0);
        if (('a' > s || s >= '{') && ('A' > s || s >= '[')) {
            return null;
        }
        return Character.valueOf(s);
    }

    public final File toFile() {
        return new File(this.b.A());
    }

    public final String toString() {
        return this.b.A();
    }
}
