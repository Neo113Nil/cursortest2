package defpackage;

import java.util.ArrayList;

/* loaded from: classes11.dex */
public interface a691 {
    static r691 g(a691 a691Var, a791 a791Var, cr71 cr71Var, ArrayList arrayList) {
        String str = a791Var.a;
        if (a691Var.d(str)) {
            r691 a = a691Var.a(str);
            if (a instanceof s591) {
                return ((s591) a).c(cr71Var, arrayList);
            }
            ny61.g(b64.j(str, " is not a function"));
            return null;
        }
        if ("hasOwnProperty".equals(str)) {
            cwa1.e(1, "hasOwnProperty", arrayList);
            return a691Var.d(((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(0)).zzc()) ? r691.E5 : r691.F5;
        }
        ny61.g(g8e.o("Object has no function ", str));
        return null;
    }

    r691 a(String str);

    boolean d(String str);

    void f(String str, r691 r691Var);
}
