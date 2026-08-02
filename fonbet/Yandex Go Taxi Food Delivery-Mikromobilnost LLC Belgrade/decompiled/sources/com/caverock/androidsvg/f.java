package com.caverock.androidsvg;

import android.util.Log;
import defpackage.anl0;
import defpackage.q97;
import defpackage.w97;
import defpackage.wml0;
import defpackage.x97;
import defpackage.yml0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class f {
    public final CSSParser$MediaType a;
    public final CSSParser$Source b;
    public boolean c = false;

    public f(CSSParser$MediaType cSSParser$MediaType, CSSParser$Source cSSParser$Source) {
        this.a = cSSParser$MediaType;
        this.b = cSSParser$Source;
    }

    public static int a(ArrayList arrayList, int i, yml0 yml0Var) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = arrayList.get(i);
        wml0 wml0Var = yml0Var.b;
        if (obj != wml0Var) {
            return -1;
        }
        Iterator it = wml0Var.getChildren().iterator();
        while (it.hasNext()) {
            if (((anl0) it.next()) == yml0Var) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static ArrayList c(c cVar) {
        ArrayList arrayList = new ArrayList();
        while (!cVar.f()) {
            String str = cVar.a;
            String str2 = null;
            if (!cVar.f()) {
                int i = cVar.b;
                char charAt = str.charAt(i);
                if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                    cVar.b = i;
                } else {
                    int a = cVar.a();
                    while (true) {
                        if ((a < 65 || a > 90) && (a < 97 || a > 122)) {
                            break;
                        }
                        a = cVar.a();
                    }
                    str2 = str.substring(i, cVar.b);
                }
            }
            if (str2 == null) {
                break;
            }
            try {
                arrayList.add(CSSParser$MediaType.valueOf(str2));
            } catch (IllegalArgumentException unused) {
            }
            if (!cVar.p()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean f(x97 x97Var, int i, ArrayList arrayList, int i2, yml0 yml0Var) {
        e eVar = (e) x97Var.a.get(i);
        if (!i(eVar, yml0Var)) {
            return false;
        }
        CSSParser$Combinator cSSParser$Combinator = eVar.a;
        if (cSSParser$Combinator == CSSParser$Combinator.DESCENDANT) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!h(x97Var, i - 1, arrayList, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (cSSParser$Combinator == CSSParser$Combinator.CHILD) {
            return h(x97Var, i - 1, arrayList, i2);
        }
        int a = a(arrayList, i2, yml0Var);
        if (a <= 0) {
            return false;
        }
        return f(x97Var, i - 1, arrayList, i2, (yml0) yml0Var.b.getChildren().get(a - 1));
    }

    public static boolean g(x97 x97Var, yml0 yml0Var) {
        ArrayList arrayList = new ArrayList();
        Object obj = yml0Var.b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((anl0) obj).b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = x97Var.a;
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        ArrayList arrayList3 = x97Var.a;
        if (size2 == 1) {
            return i((e) arrayList3.get(0), yml0Var);
        }
        return f(x97Var, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, yml0Var);
    }

    public static boolean h(x97 x97Var, int i, ArrayList arrayList, int i2) {
        e eVar = (e) x97Var.a.get(i);
        yml0 yml0Var = (yml0) arrayList.get(i2);
        if (!i(eVar, yml0Var)) {
            return false;
        }
        CSSParser$Combinator cSSParser$Combinator = eVar.a;
        if (cSSParser$Combinator == CSSParser$Combinator.DESCENDANT) {
            if (i != 0) {
                while (i2 > 0) {
                    i2--;
                    if (h(x97Var, i - 1, arrayList, i2)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (cSSParser$Combinator == CSSParser$Combinator.CHILD) {
            return h(x97Var, i - 1, arrayList, i2 - 1);
        }
        int a = a(arrayList, i2, yml0Var);
        if (a <= 0) {
            return false;
        }
        return f(x97Var, i - 1, arrayList, i2, (yml0) yml0Var.b.getChildren().get(a - 1));
    }

    public static boolean i(e eVar, yml0 yml0Var) {
        ArrayList arrayList;
        String str = eVar.b;
        if (str != null && !str.equals(yml0Var.n().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList arrayList2 = eVar.c;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                String str2 = bVar.a;
                String str3 = bVar.c;
                if (str2.equals("id")) {
                    if (!str3.equals(yml0Var.c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = yml0Var.g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = eVar.d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            if (!((q97) it2.next()).a(yml0Var)) {
                return false;
            }
        }
        return true;
    }

    public final void b(w97 w97Var, c cVar) {
        int intValue;
        char charAt;
        int r;
        String t = cVar.t();
        cVar.q();
        if (t == null) {
            throw new CSSParseException("Invalid '@' rule");
        }
        int i = 0;
        if (!this.c && t.equals("media")) {
            ArrayList c = c(cVar);
            if (!cVar.d('{')) {
                throw new CSSParseException("Invalid @media rule: missing rule set");
            }
            cVar.q();
            Iterator it = c.iterator();
            while (it.hasNext()) {
                CSSParser$MediaType cSSParser$MediaType = (CSSParser$MediaType) it.next();
                if (cSSParser$MediaType == CSSParser$MediaType.all || cSSParser$MediaType == this.a) {
                    this.c = true;
                    w97Var.b(e(cVar));
                    this.c = false;
                    break;
                }
            }
            e(cVar);
            if (!cVar.f() && !cVar.d('}')) {
                throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.c || !t.equals("import")) {
            while (!cVar.f() && ((intValue = cVar.h().intValue()) != 59 || i != 0)) {
                if (intValue == 123) {
                    i++;
                } else if (intValue == 125 && i > 0 && i - 1 == 0) {
                    break;
                }
            }
        } else {
            String str = null;
            if (!cVar.f()) {
                int i2 = cVar.b;
                if (cVar.e("url(")) {
                    cVar.q();
                    String s = cVar.s();
                    if (s == null) {
                        String str2 = cVar.a;
                        StringBuilder sb = new StringBuilder();
                        while (!cVar.f() && (charAt = str2.charAt(cVar.b)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !p.g(charAt) && !Character.isISOControl((int) charAt)) {
                            cVar.b++;
                            if (charAt == '\\') {
                                if (!cVar.f()) {
                                    int i3 = cVar.b;
                                    cVar.b = i3 + 1;
                                    charAt = str2.charAt(i3);
                                    if (charAt != '\n' && charAt != '\r' && charAt != '\f') {
                                        int r2 = c.r(charAt);
                                        if (r2 != -1) {
                                            for (int i4 = 1; i4 <= 5 && !cVar.f() && (r = c.r(str2.charAt(cVar.b))) != -1; i4++) {
                                                cVar.b++;
                                                r2 = (r2 * 16) + r;
                                            }
                                            sb.append((char) r2);
                                        }
                                    }
                                }
                            }
                            sb.append(charAt);
                        }
                        s = sb.length() == 0 ? null : sb.toString();
                    }
                    if (s == null) {
                        cVar.b = i2;
                    } else {
                        cVar.q();
                        if (cVar.f() || cVar.e(Extension.C_BRAKE)) {
                            str = s;
                        } else {
                            cVar.b = i2;
                        }
                    }
                }
            }
            if (str == null) {
                str = cVar.s();
            }
            if (str == null) {
                throw new CSSParseException("Invalid @import rule: expected string or url()");
            }
            cVar.q();
            c(cVar);
            if (!cVar.f() && !cVar.d(';')) {
                throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        cVar.q();
    }

    public final boolean d(w97 w97Var, c cVar) {
        ArrayList u = cVar.u();
        if (u == null || u.isEmpty()) {
            return false;
        }
        if (!cVar.d('{')) {
            throw new CSSParseException("Malformed rule block: expected '{'");
        }
        cVar.q();
        k kVar = new k();
        do {
            String t = cVar.t();
            cVar.q();
            if (!cVar.d(':')) {
                throw new CSSParseException("Expected ':'");
            }
            cVar.q();
            String str = cVar.a;
            String str2 = null;
            if (!cVar.f()) {
                int i = cVar.b;
                int charAt = str.charAt(i);
                int i2 = i;
                while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && charAt != 10 && charAt != 13) {
                    if (!p.g(charAt)) {
                        i2 = cVar.b + 1;
                    }
                    charAt = cVar.a();
                }
                if (cVar.b > i) {
                    str2 = str.substring(i, i2);
                } else {
                    cVar.b = i;
                }
            }
            if (str2 == null) {
                throw new CSSParseException("Expected property value");
            }
            cVar.q();
            if (cVar.d('!')) {
                cVar.q();
                if (!cVar.e("important")) {
                    throw new CSSParseException("Malformed rule set: found unexpected '!'");
                }
                cVar.q();
            }
            cVar.d(';');
            q.E(kVar, t, str2);
            cVar.q();
            if (cVar.f()) {
                break;
            }
        } while (!cVar.d('}'));
        cVar.q();
        Iterator it = u.iterator();
        while (it.hasNext()) {
            x97 x97Var = (x97) it.next();
            d dVar = new d();
            dVar.a = x97Var;
            dVar.b = kVar;
            dVar.c = this.b;
            w97Var.a(dVar);
        }
        return true;
    }

    public final w97 e(c cVar) {
        w97 w97Var = new w97();
        while (!cVar.f()) {
            try {
                if (!cVar.e("<!--") && !cVar.e("-->")) {
                    if (!cVar.d('@')) {
                        if (!d(w97Var, cVar)) {
                            break;
                        }
                    } else {
                        b(w97Var, cVar);
                    }
                }
            } catch (CSSParseException e) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e.getMessage());
                return w97Var;
            }
        }
        return w97Var;
    }
}
