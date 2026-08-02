package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class kbi {
    public final qqo a;

    public kbi(rqo rqoVar) {
        jbi.Companion.getClass();
        this.a = ((jbh) rqoVar).c(jbi.f);
    }

    public final String a(String str, String str2) {
        List list;
        Object obj;
        jbi jbiVar = (jbi) this.a.b();
        if (!jbiVar.getB()) {
            jbiVar = null;
        }
        ebj0 c = jbiVar != null ? jbiVar.c(str) : null;
        if (str2 == null) {
            if (c != null) {
                return c.c;
            }
        } else if (c != null && (list = c.d) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((be70) obj).a, str2)) {
                    break;
                }
            }
            be70 be70Var = (be70) obj;
            if (be70Var != null) {
                return be70Var.b;
            }
        }
        return null;
    }

    public final String b(String str) {
        adj adjVar;
        String str2;
        jbi jbiVar = (jbi) this.a.b();
        String str3 = null;
        if (!jbiVar.getB()) {
            jbiVar = null;
        }
        if (jbiVar == null) {
            return "";
        }
        ebj0 c = jbiVar.c(str);
        if (c != null && (adjVar = c.b) != null && (str2 = adjVar.b) != null) {
            str3 = d6z.Y(jbiVar, str2);
        }
        return str3 == null ? "" : str3;
    }

    public final String c(String str) {
        adj adjVar;
        String str2;
        jbi jbiVar = (jbi) this.a.b();
        String str3 = null;
        if (!jbiVar.getB()) {
            jbiVar = null;
        }
        if (jbiVar == null) {
            return "";
        }
        ebj0 c = jbiVar.c(str);
        if (c != null && (adjVar = c.b) != null && (str2 = adjVar.a) != null) {
            str3 = d6z.Y(jbiVar, str2);
        }
        return str3 == null ? "" : str3;
    }
}
