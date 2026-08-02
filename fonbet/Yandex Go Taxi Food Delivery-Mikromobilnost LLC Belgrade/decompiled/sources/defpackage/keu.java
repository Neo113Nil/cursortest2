package defpackage;

import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class keu {
    public final ArrayList a = new ArrayList(20);

    public final void a(String str, String str2) {
        ooc.q(str);
        ooc.r(str2, str);
        ooc.h(this, str, str2);
    }

    public final void b(String str) {
        int G = evu0.G(str, ':', 1, 4);
        if (G != -1) {
            ooc.h(this, str.substring(0, G), str.substring(G + 1));
        } else if (str.charAt(0) == ':') {
            ooc.h(this, "", str.substring(1));
        } else {
            ooc.h(this, "", str);
        }
    }

    public final void c(String str, String str2) {
        ooc.q(str);
        ooc.h(this, str, str2);
    }

    public final meu d() {
        return new meu((String[]) this.a.toArray(new String[0]));
    }

    public final String e(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 2;
        int v = jx81.v(size, 0, -2);
        if (v > size) {
            return null;
        }
        while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
            if (size == v) {
                return null;
            }
            size -= 2;
        }
        return (String) arrayList.get(size + 1);
    }

    public final void f(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public final void g(String str, String str2) {
        ooc.q(str);
        ooc.r(str2, str);
        f(str);
        ooc.h(this, str, str2);
    }
}
