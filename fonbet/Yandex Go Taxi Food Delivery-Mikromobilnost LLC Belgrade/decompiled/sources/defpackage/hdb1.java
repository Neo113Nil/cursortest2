package defpackage;

/* loaded from: classes4.dex */
public abstract class hdb1 {
    public static final void a(q5y q5yVar, Object obj, int i, Object obj2, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1439843069);
        int i3 = (btsVar.k(q5yVar) ? 4 : 2) | i2 | (btsVar.k(obj) ? 32 : 16) | (btsVar.c(i) ? 256 : 128) | (btsVar.k(obj2) ? 2048 : 1024);
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            ((h1m0) obj).b(obj2, wwg.S(980966366, true, new nxu(i, q5yVar, obj2), btsVar), btsVar, 48);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm(q5yVar, obj, i, obj2, i2);
        }
    }

    public static meu b(meu meuVar, meu meuVar2) {
        keu keuVar = new keu();
        int size = meuVar.size();
        for (int i = 0; i < size; i++) {
            String b = meuVar.b(i);
            String f = meuVar.f(i);
            if ((!"Warning".equalsIgnoreCase(b) || !cvu0.x(f, "1", false)) && ("Content-Length".equalsIgnoreCase(b) || "Content-Encoding".equalsIgnoreCase(b) || "Content-Type".equalsIgnoreCase(b) || !c(b) || meuVar2.a(b) == null)) {
                keuVar.c(b, f);
            }
        }
        int size2 = meuVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String b2 = meuVar2.b(i2);
            if (!"Content-Length".equalsIgnoreCase(b2) && !"Content-Encoding".equalsIgnoreCase(b2) && !"Content-Type".equalsIgnoreCase(b2) && c(b2)) {
                keuVar.c(b2, meuVar2.f(i2));
            }
        }
        return keuVar.d();
    }

    public static boolean c(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
