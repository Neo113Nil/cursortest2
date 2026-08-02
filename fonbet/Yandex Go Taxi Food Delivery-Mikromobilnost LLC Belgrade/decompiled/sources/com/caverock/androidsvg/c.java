package com.caverock.androidsvg;

import defpackage.h0n;
import defpackage.i6z0;
import defpackage.q97;
import defpackage.r97;
import defpackage.s97;
import defpackage.t97;
import defpackage.u97;
import defpackage.v97;
import defpackage.x97;
import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes10.dex */
public final class c extends p {
    public c(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public static int r(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 65 && i <= 70) {
            return i - 55;
        }
        if (i < 97 || i > 102) {
            return -1;
        }
        return i - 87;
    }

    public final String s() {
        int r;
        if (f()) {
            return null;
        }
        char charAt = this.a.charAt(this.b);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        this.b++;
        int intValue = h().intValue();
        while (intValue != -1 && intValue != charAt) {
            if (intValue == 92) {
                intValue = h().intValue();
                if (intValue != -1) {
                    if (intValue == 10 || intValue == 13 || intValue == 12) {
                        intValue = h().intValue();
                    } else {
                        int r2 = r(intValue);
                        if (r2 != -1) {
                            for (int i = 1; i <= 5 && (r = r((intValue = h().intValue()))) != -1; i++) {
                                r2 = (r2 * 16) + r;
                            }
                            sb.append((char) r2);
                        }
                    }
                }
            }
            sb.append((char) intValue);
            intValue = h().intValue();
        }
        return sb.toString();
    }

    public final String t() {
        int i;
        boolean f = f();
        int i2 = this.b;
        String str = this.a;
        if (!f) {
            int charAt = str.charAt(i2);
            if (charAt == 45) {
                charAt = a();
            }
            if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                i = i2;
            } else {
                int a = a();
                while (true) {
                    if ((a < 65 || a > 90) && ((a < 97 || a > 122) && !((a >= 48 && a <= 57) || a == 45 || a == 95))) {
                        break;
                    }
                    a = a();
                }
                i = this.b;
            }
            this.b = i2;
            i2 = i;
        }
        int i3 = this.b;
        if (i2 == i3) {
            return null;
        }
        String substring = str.substring(i3, i2);
        this.b = i2;
        return substring;
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x0469, code lost:
    
        r0 = r4.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x046b, code lost:
    
        if (r0 == null) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0471, code lost:
    
        if (r0.isEmpty() == false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0474, code lost:
    
        r1.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0477, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0382 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0467 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v12, types: [com.caverock.androidsvg.CSSParser$AttribOp] */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.caverock.androidsvg.CSSParser$Combinator] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v10, types: [com.caverock.androidsvg.e] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [com.caverock.androidsvg.e] */
    /* JADX WARN: Type inference failed for: r8v13, types: [com.caverock.androidsvg.e] */
    /* JADX WARN: Type inference failed for: r8v14, types: [com.caverock.androidsvg.e] */
    /* JADX WARN: Type inference failed for: r8v15, types: [com.caverock.androidsvg.e] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [com.caverock.androidsvg.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList u() {
        ?? r6;
        ?? r8;
        String str;
        int i;
        e eVar;
        String str2;
        Object obj;
        int i2;
        int i3;
        int i4;
        h0n h0nVar;
        int i5;
        i6z0 i6z0Var;
        ArrayList u;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str3 = null;
        if (f()) {
            return null;
        }
        int i6 = 1;
        ArrayList arrayList3 = new ArrayList(1);
        x97 x97Var = new x97();
        while (true) {
            if (!f() && !f()) {
                int i7 = this.b;
                ArrayList arrayList4 = x97Var.a;
                char c = '+';
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    if (d('>')) {
                        CSSParser$Combinator cSSParser$Combinator = CSSParser$Combinator.CHILD;
                        q();
                        r6 = cSSParser$Combinator;
                    } else if (d('+')) {
                        CSSParser$Combinator cSSParser$Combinator2 = CSSParser$Combinator.FOLLOWS;
                        q();
                        r6 = cSSParser$Combinator2;
                    }
                    if (d('*')) {
                        String t = t();
                        if (t != null) {
                            e eVar2 = new e(r6, t);
                            x97Var.b += i6;
                            r8 = eVar2;
                        } else {
                            r8 = str3;
                        }
                    } else {
                        r8 = new e(r6, str3);
                    }
                    while (!f()) {
                        if (d('.')) {
                            if (r8 == 0) {
                                r8 = new e(r6, str3);
                            }
                            String t2 = t();
                            if (t2 == null) {
                                throw new CSSParseException("Invalid \".class\" simpleSelectors");
                            }
                            r8.a("class", CSSParser$AttribOp.EQUALS, t2);
                            x97Var.a();
                        } else if (d('#')) {
                            if (r8 == 0) {
                                r8 = new e(r6, str3);
                            }
                            String t3 = t();
                            if (t3 == null) {
                                throw new CSSParseException("Invalid \"#id\" simpleSelectors");
                            }
                            r8.a("id", CSSParser$AttribOp.EQUALS, t3);
                            x97Var.b += 1000000;
                        } else if (d('[')) {
                            if (r8 == 0) {
                                r8 = new e(r6, str3);
                            }
                            q();
                            String t4 = t();
                            if (t4 == null) {
                                throw new CSSParseException("Invalid attribute simpleSelectors");
                            }
                            q();
                            Object obj2 = d('=') ? CSSParser$AttribOp.EQUALS : e("~=") ? CSSParser$AttribOp.INCLUDES : e("|=") ? CSSParser$AttribOp.DASHMATCH : str3;
                            if (obj2 != null) {
                                q();
                                if (f()) {
                                    str = str3;
                                } else {
                                    str = k();
                                    if (str == null) {
                                        str = t();
                                    }
                                }
                                if (str == null) {
                                    throw new CSSParseException("Invalid attribute simpleSelectors");
                                }
                                q();
                            } else {
                                str = str3;
                            }
                            ?? r11 = obj2;
                            if (!d(']')) {
                                throw new CSSParseException("Invalid attribute simpleSelectors");
                            }
                            if (obj2 == null) {
                                r11 = CSSParser$AttribOp.EXISTS;
                            }
                            r8.a(t4, r11, str);
                            x97Var.a();
                        } else {
                            e eVar3 = r8;
                            if (d(':')) {
                                if (r8 == 0) {
                                    eVar3 = new e(r6, str3);
                                }
                                String t5 = t();
                                if (t5 == null) {
                                    throw new CSSParseException("Invalid pseudo class");
                                }
                                CSSParser$PseudoClassIdents a = CSSParser$PseudoClassIdents.a(t5);
                                switch (a.b[a.ordinal()]) {
                                    case 1:
                                        i = i6;
                                        eVar = eVar3;
                                        str2 = null;
                                        Object r97Var = new r97(0, 1, null, true, false);
                                        x97Var.a();
                                        obj = r97Var;
                                        if (eVar.d == null) {
                                            eVar.d = new ArrayList();
                                        }
                                        eVar.d.add(obj);
                                        i6 = i;
                                        str3 = str2;
                                        r8 = eVar;
                                        c = '+';
                                        break;
                                    case 2:
                                        i = i6;
                                        eVar = eVar3;
                                        str2 = null;
                                        Object r97Var2 = new r97(0, 1, null, false, false);
                                        x97Var.a();
                                        obj = r97Var2;
                                        if (eVar.d == null) {
                                        }
                                        eVar.d.add(obj);
                                        i6 = i;
                                        str3 = str2;
                                        r8 = eVar;
                                        c = '+';
                                        break;
                                    case 3:
                                        i = i6;
                                        eVar = eVar3;
                                        str2 = null;
                                        obj = new v97(false, null);
                                        x97Var.a();
                                        if (eVar.d == null) {
                                        }
                                        eVar.d.add(obj);
                                        i6 = i;
                                        str3 = str2;
                                        r8 = eVar;
                                        c = '+';
                                        break;
                                    case 4:
                                        i2 = i6;
                                        eVar = eVar3;
                                        Object r97Var3 = new r97(0, 1, eVar.b, true, true);
                                        x97Var.a();
                                        obj = r97Var3;
                                        str2 = null;
                                        i = i2;
                                        if (eVar.d == null) {
                                        }
                                        eVar.d.add(obj);
                                        i6 = i;
                                        str3 = str2;
                                        r8 = eVar;
                                        c = '+';
                                        break;
                                    case 5:
                                        i2 = i6;
                                        eVar = eVar3;
                                        Object r97Var4 = new r97(0, 1, eVar.b, false, true);
                                        x97Var.a();
                                        obj = r97Var4;
                                        str2 = null;
                                        i = i2;
                                        if (eVar.d == null) {
                                        }
                                        eVar.d.add(obj);
                                        i6 = i;
                                        str3 = str2;
                                        r8 = eVar;
                                        c = '+';
                                        break;
                                    case 6:
                                        ?? r7 = i6;
                                        eVar = eVar3;
                                        obj = new v97(r7, eVar.b);
                                        x97Var.a();
                                        i2 = r7;
                                        str2 = null;
                                        i = i2;
                                        if (eVar.d == null) {
                                        }
                                        eVar.d.add(obj);
                                        i6 = i;
                                        str3 = str2;
                                        r8 = eVar;
                                        c = '+';
                                        break;
                                    case 7:
                                        eVar = eVar3;
                                        i2 = 1;
                                        obj = new s97(1);
                                        x97Var.a();
                                        str2 = null;
                                        i = i2;
                                        if (eVar.d == null) {
                                        }
                                        eVar.d.add(obj);
                                        i6 = i;
                                        str3 = str2;
                                        r8 = eVar;
                                        c = '+';
                                        break;
                                    case 8:
                                        eVar = eVar3;
                                        obj = new s97(0);
                                        x97Var.a();
                                        i2 = 1;
                                        str2 = null;
                                        i = i2;
                                        if (eVar.d == null) {
                                        }
                                        eVar.d.add(obj);
                                        i6 = i;
                                        str3 = str2;
                                        r8 = eVar;
                                        c = '+';
                                        break;
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                        ?? r21 = (a == CSSParser$PseudoClassIdents.nth_child || a == CSSParser$PseudoClassIdents.nth_of_type) ? i6 : 0;
                                        ?? r22 = (a == CSSParser$PseudoClassIdents.nth_of_type || a == CSSParser$PseudoClassIdents.nth_last_of_type) ? i6 : 0;
                                        if (!f()) {
                                            int i8 = this.b;
                                            if (d('(')) {
                                                q();
                                                if (e("odd")) {
                                                    i6z0Var = new i6z0(2, i6, i6);
                                                } else if (e("even")) {
                                                    i6z0Var = new i6z0(2, 0, i6);
                                                } else {
                                                    int i9 = (!d(c) && d(LicenseUtility.SEPARATOR)) ? -1 : i6;
                                                    int i10 = this.b;
                                                    int i11 = this.c;
                                                    String str4 = this.a;
                                                    h0n c2 = h0n.c(i10, i11, str4);
                                                    if (c2 != null) {
                                                        this.b = c2.a;
                                                    }
                                                    if (d('n') || d('N')) {
                                                        if (c2 != null) {
                                                            i3 = i11;
                                                        } else {
                                                            i3 = i11;
                                                            c2 = new h0n(1L, this.b);
                                                        }
                                                        q();
                                                        boolean d = d(c);
                                                        i4 = (d || !(d = d(LicenseUtility.SEPARATOR))) ? 1 : -1;
                                                        if (d) {
                                                            q();
                                                            h0nVar = h0n.c(this.b, i3, str4);
                                                            if (h0nVar != null) {
                                                                this.b = h0nVar.a;
                                                            } else {
                                                                this.b = i8;
                                                            }
                                                        } else {
                                                            h0nVar = null;
                                                        }
                                                    } else {
                                                        i4 = i9;
                                                        h0nVar = c2;
                                                        i9 = 1;
                                                        c2 = null;
                                                    }
                                                    if (c2 == null) {
                                                        eVar = eVar3;
                                                        i5 = 0;
                                                    } else {
                                                        eVar = eVar3;
                                                        i5 = i9 * ((int) c2.b);
                                                    }
                                                    i6z0Var = new i6z0(i5, h0nVar == null ? 0 : ((int) h0nVar.b) * i4, 1);
                                                    q();
                                                    if (!d(')')) {
                                                        this.b = i8;
                                                        i6z0Var = null;
                                                    }
                                                    if (i6z0Var == null) {
                                                        throw new CSSParseException("Invalid or missing parameter section for pseudo class: ".concat(t5));
                                                    }
                                                    Object r97Var5 = new r97(i6z0Var.b, i6z0Var.c, eVar.b, r21, r22);
                                                    x97Var.a();
                                                    obj = r97Var5;
                                                    i2 = 1;
                                                    str2 = null;
                                                    i = i2;
                                                    if (eVar.d == null) {
                                                    }
                                                    eVar.d.add(obj);
                                                    i6 = i;
                                                    str3 = str2;
                                                    r8 = eVar;
                                                    c = '+';
                                                    break;
                                                }
                                                eVar = eVar3;
                                                q();
                                                if (!d(')')) {
                                                }
                                                if (i6z0Var == null) {
                                                }
                                            }
                                        }
                                        eVar = eVar3;
                                        i6z0Var = null;
                                        if (i6z0Var == null) {
                                        }
                                        break;
                                    case 13:
                                        if (!f()) {
                                            int i12 = this.b;
                                            if (d('(')) {
                                                q();
                                                u = u();
                                                if (u == null) {
                                                    this.b = i12;
                                                } else if (d(')')) {
                                                    Iterator it = u.iterator();
                                                    while (it.hasNext() && (arrayList = ((x97) it.next()).a) != null) {
                                                        Iterator it2 = arrayList.iterator();
                                                        while (it2.hasNext() && (arrayList2 = ((e) it2.next()).d) != null) {
                                                            Iterator it3 = arrayList2.iterator();
                                                            while (it3.hasNext()) {
                                                                if (((q97) it3.next()) instanceof t97) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (u != null) {
                                                        throw new CSSParseException("Invalid or missing parameter section for pseudo class: ".concat(t5));
                                                    }
                                                    t97 t97Var = new t97();
                                                    t97Var.a = u;
                                                    Iterator it4 = u.iterator();
                                                    int i13 = Integer.MIN_VALUE;
                                                    while (it4.hasNext()) {
                                                        int i14 = ((x97) it4.next()).b;
                                                        if (i14 > i13) {
                                                            i13 = i14;
                                                        }
                                                    }
                                                    x97Var.b = i13;
                                                    i2 = i6;
                                                    eVar = eVar3;
                                                    obj = t97Var;
                                                    str2 = null;
                                                    i = i2;
                                                    if (eVar.d == null) {
                                                    }
                                                    eVar.d.add(obj);
                                                    i6 = i;
                                                    str3 = str2;
                                                    r8 = eVar;
                                                    c = '+';
                                                    break;
                                                } else {
                                                    this.b = i12;
                                                }
                                            }
                                        }
                                        u = null;
                                        if (u != null) {
                                        }
                                        break;
                                    case 14:
                                        obj = new s97(2);
                                        x97Var.a();
                                        i2 = i6;
                                        eVar = eVar3;
                                        str2 = null;
                                        i = i2;
                                        if (eVar.d == null) {
                                        }
                                        eVar.d.add(obj);
                                        i6 = i;
                                        str3 = str2;
                                        r8 = eVar;
                                        c = '+';
                                        break;
                                    case 15:
                                        if (!f()) {
                                            int i15 = this.b;
                                            if (d('(')) {
                                                q();
                                                ArrayList arrayList5 = null;
                                                while (true) {
                                                    String t6 = t();
                                                    if (t6 == null) {
                                                        this.b = i15;
                                                    } else {
                                                        if (arrayList5 == null) {
                                                            arrayList5 = new ArrayList();
                                                        }
                                                        arrayList5.add(t6);
                                                        q();
                                                        if (!p()) {
                                                            if (!d(')')) {
                                                                this.b = i15;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        obj = new u97(t5);
                                        x97Var.a();
                                        i2 = i6;
                                        eVar = eVar3;
                                        str2 = null;
                                        i = i2;
                                        if (eVar.d == null) {
                                        }
                                        eVar.d.add(obj);
                                        i6 = i;
                                        str3 = str2;
                                        r8 = eVar;
                                        c = '+';
                                        break;
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                        obj = new u97(t5);
                                        x97Var.a();
                                        i2 = i6;
                                        eVar = eVar3;
                                        str2 = null;
                                        i = i2;
                                        if (eVar.d == null) {
                                        }
                                        eVar.d.add(obj);
                                        i6 = i;
                                        str3 = str2;
                                        r8 = eVar;
                                        c = '+';
                                        break;
                                    default:
                                        throw new CSSParseException("Unsupported pseudo class: ".concat(t5));
                                }
                            } else {
                                String str5 = str3;
                                int i16 = i6;
                                if (r8 != 0) {
                                    if (x97Var.a == null) {
                                        x97Var.a = new ArrayList();
                                    }
                                    x97Var.a.add(r8);
                                    if (p()) {
                                        arrayList3.add(x97Var);
                                        x97Var = new x97();
                                    }
                                    i6 = i16;
                                    str3 = str5;
                                } else {
                                    this.b = i7;
                                }
                            }
                        }
                    }
                    String str52 = str3;
                    int i162 = i6;
                    if (r8 != 0) {
                    }
                }
                r6 = str3;
                if (d('*')) {
                }
                while (!f()) {
                }
                String str522 = str3;
                int i1622 = i6;
                if (r8 != 0) {
                }
            }
        }
    }
}
