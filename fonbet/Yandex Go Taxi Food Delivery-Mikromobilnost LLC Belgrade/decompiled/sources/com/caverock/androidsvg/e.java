package com.caverock.androidsvg;

import defpackage.q97;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class e {
    public final CSSParser$Combinator a;
    public final String b;
    public ArrayList c = null;
    public ArrayList d = null;

    public e(CSSParser$Combinator cSSParser$Combinator, String str) {
        this.a = null;
        this.b = null;
        this.a = cSSParser$Combinator == null ? CSSParser$Combinator.DESCENDANT : cSSParser$Combinator;
        this.b = str;
    }

    public final void a(String str, CSSParser$AttribOp cSSParser$AttribOp, String str2) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(new b(str, cSSParser$AttribOp, str2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CSSParser$Combinator cSSParser$Combinator = CSSParser$Combinator.CHILD;
        CSSParser$Combinator cSSParser$Combinator2 = this.a;
        if (cSSParser$Combinator2 == cSSParser$Combinator) {
            sb.append("> ");
        } else if (cSSParser$Combinator2 == CSSParser$Combinator.FOLLOWS) {
            sb.append("+ ");
        }
        String str = this.b;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                sb.append('[');
                String str2 = bVar.a;
                String str3 = bVar.c;
                sb.append(str2);
                int i = a.a[bVar.b.ordinal()];
                if (i == 1) {
                    sb.append('=');
                    sb.append(str3);
                } else if (i == 2) {
                    sb.append("~=");
                    sb.append(str3);
                } else if (i == 3) {
                    sb.append("|=");
                    sb.append(str3);
                }
                sb.append(']');
            }
        }
        ArrayList arrayList2 = this.d;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                q97 q97Var = (q97) it2.next();
                sb.append(':');
                sb.append(q97Var);
            }
        }
        return sb.toString();
    }
}
