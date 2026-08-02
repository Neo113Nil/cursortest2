package defpackage;

import java.io.File;
import java.util.ArrayList;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class oq90 implements Comparable {
    public static final String b = File.separator;
    public final ByteString a;

    public oq90(ByteString byteString) {
        this.a = byteString;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a = g.a(this);
        ByteString byteString = this.a;
        if (a == -1) {
            a = 0;
        } else if (a < byteString.h() && byteString.m(a) == 92) {
            a++;
        }
        int h = byteString.h();
        int i = a;
        while (a < h) {
            if (byteString.m(a) == 47 || byteString.m(a) == 92) {
                arrayList.add(byteString.s(i, a));
                i = a + 1;
            }
            a++;
        }
        if (i < byteString.h()) {
            arrayList.add(byteString.s(i, byteString.h()));
        }
        return arrayList;
    }

    public final String b() {
        ByteString byteString = g.a;
        int i = j.b;
        ByteString byteString2 = this.a;
        byteString2.getClass();
        int n = byteString2.n(i, byteString.l());
        if (n == -1) {
            ByteString byteString3 = g.b;
            byteString2.getClass();
            n = byteString2.n(i, byteString3.l());
        }
        if (n != -1) {
            byteString2 = ByteString.t(n + 1, 0, 2, byteString2);
        } else if (f() != null && byteString2.h() == 2) {
            byteString2 = ByteString.c;
        }
        return byteString2.w();
    }

    public final oq90 c() {
        ByteString byteString = g.d;
        ByteString byteString2 = this.a;
        if (jl40.l(byteString2, byteString)) {
            return null;
        }
        ByteString byteString3 = g.a;
        if (jl40.l(byteString2, byteString3)) {
            return null;
        }
        ByteString byteString4 = g.b;
        if (jl40.l(byteString2, byteString4)) {
            return null;
        }
        ByteString byteString5 = g.e;
        if (byteString2.q(byteString5, byteString2.h() - byteString5.h(), byteString5.h()) && (byteString2.h() == 2 || byteString2.q(byteString3, byteString2.h() - 3, 1) || byteString2.q(byteString4, byteString2.h() - 3, 1))) {
            return null;
        }
        int i = j.b;
        byteString2.getClass();
        int n = byteString2.n(i, byteString3.l());
        if (n == -1) {
            byteString2.getClass();
            n = byteString2.n(i, byteString4.l());
        }
        if (n == 2 && f() != null) {
            if (byteString2.h() == 3) {
                return null;
            }
            return new oq90(ByteString.t(0, 3, 1, byteString2));
        }
        if (n == 1 && byteString2.q(byteString4, 0, byteString4.h())) {
            return null;
        }
        if (n != -1 || f() == null) {
            return n == -1 ? new oq90(byteString) : n == 0 ? new oq90(ByteString.t(0, 1, 1, byteString2)) : new oq90(ByteString.t(0, n, 1, byteString2));
        }
        if (byteString2.h() == 2) {
            return null;
        }
        return new oq90(ByteString.t(0, 2, 1, byteString2));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.compareTo(((oq90) obj).a);
    }

    public final oq90 d(oq90 oq90Var) {
        ByteString byteString = oq90Var.a;
        int a = g.a(this);
        ByteString byteString2 = this.a;
        oq90 oq90Var2 = a == -1 ? null : new oq90(byteString2.s(0, a));
        int a2 = g.a(oq90Var);
        if (!jl40.l(oq90Var2, a2 == -1 ? null : new oq90(byteString.s(0, a2)))) {
            vg10.j("Paths of different roots cannot be relative to each other: ", this, " and ", oq90Var);
            return null;
        }
        ArrayList a3 = a();
        ArrayList a4 = oq90Var.a();
        int min = Math.min(a3.size(), a4.size());
        int i = 0;
        while (i < min && jl40.l(a3.get(i), a4.get(i))) {
            i++;
        }
        if (i == min && byteString2.h() == byteString.h()) {
            return sms.f(Extension.DOT_CHAR);
        }
        if (a4.subList(i, a4.size()).indexOf(g.e) != -1) {
            vg10.j("Impossible relative path to resolve: ", this, " and ", oq90Var);
            return null;
        }
        if (jl40.l(byteString, g.d)) {
            return this;
        }
        yp6 yp6Var = new yp6();
        ByteString c = g.c(oq90Var);
        if (c == null && (c = g.c(this)) == null) {
            c = g.f(b);
        }
        int size = a4.size();
        for (int i2 = i; i2 < size; i2++) {
            yp6Var.b0(g.e);
            yp6Var.b0(c);
        }
        int size2 = a3.size();
        while (i < size2) {
            yp6Var.b0((ByteString) a3.get(i));
            yp6Var.b0(c);
            i++;
        }
        return g.d(yp6Var, false);
    }

    public final oq90 e(String str) {
        yp6 yp6Var = new yp6();
        yp6Var.x0(str);
        return g.b(this, g.d(yp6Var, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof oq90) && jl40.l(((oq90) obj).a, this.a);
    }

    public final Character f() {
        ByteString byteString = g.a;
        ByteString byteString2 = this.a;
        if (ByteString.k(byteString2, byteString) != -1 || byteString2.h() < 2 || byteString2.m(1) != 58) {
            return null;
        }
        char m = (char) byteString2.m(0);
        if (('a' > m || m >= '{') && ('A' > m || m >= '[')) {
            return null;
        }
        return Character.valueOf(m);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final File toFile() {
        return new File(this.a.w());
    }

    public final String toString() {
        return this.a.w();
    }
}
