package com.yandex.div.core.util.mask;

import defpackage.gvu0;
import defpackage.jl40;
import defpackage.klb1;
import defpackage.sls;
import defpackage.u25;
import defpackage.uly0;
import defpackage.v25;
import defpackage.w25;
import defpackage.x25;
import defpackage.y25;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.regex.PatternSyntaxException;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.Regex;

/* loaded from: classes11.dex */
public abstract class a {
    public x25 a;
    public final LinkedHashMap b = new LinkedHashMap();
    public ArrayList c;
    public int d;

    public a(x25 x25Var) {
        this.a = x25Var;
        n(x25Var, true);
    }

    public void a(String str, Integer num) {
        uly0 c = klb1.c(i(), str);
        int intValue = num.intValue();
        int i = c.b;
        int i2 = intValue - i;
        if (i2 < 0) {
            i2 = 0;
        }
        int l = l(new uly0(i2, i, c.c), str);
        int g = g();
        if (i2 < g) {
            g = Math.min(f(l), i().length());
        }
        this.d = g;
    }

    public final String b(int i, String str) {
        StringBuilder sb = new StringBuilder();
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = i;
        sls slsVar = new sls() { // from class: com.yandex.div.core.util.mask.BaseInputMask$calculateInsertableSubstring$moveToAndGetNextHolderFilter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                while (true) {
                    int i2 = Ref$IntRef.this.element;
                    ArrayList arrayList = this.c;
                    if (arrayList == null) {
                        arrayList = null;
                    }
                    if (i2 < arrayList.size()) {
                        ArrayList arrayList2 = this.c;
                        if (arrayList2 == null) {
                            arrayList2 = null;
                        }
                        if (arrayList2.get(Ref$IntRef.this.element) instanceof u25) {
                            break;
                        }
                        Ref$IntRef.this.element++;
                    } else {
                        break;
                    }
                }
                ArrayList arrayList3 = this.c;
                if (arrayList3 == null) {
                    arrayList3 = null;
                }
                Object S = kotlin.collections.a.S(Ref$IntRef.this.element, arrayList3);
                u25 u25Var = S instanceof u25 ? (u25) S : null;
                if (u25Var != null) {
                    return u25Var.b;
                }
                return null;
            }
        };
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            Regex regex = (Regex) slsVar.invoke();
            if (regex != null && regex.h(String.valueOf(charAt))) {
                sb.append(charAt);
                ref$IntRef.element++;
            }
        }
        return sb.toString();
    }

    public final void c(uly0 uly0Var) {
        int i = uly0Var.b;
        int i2 = uly0Var.a;
        if (i == 0 && uly0Var.c == 1) {
            int i3 = i2;
            while (true) {
                if (i3 < 0) {
                    break;
                }
                ArrayList arrayList = this.c;
                if (arrayList == null) {
                    arrayList = null;
                }
                w25 w25Var = (w25) arrayList.get(i3);
                if (w25Var instanceof u25) {
                    u25 u25Var = (u25) w25Var;
                    if (u25Var.a != null) {
                        u25Var.a = null;
                        break;
                    }
                }
                i3--;
            }
        }
        ArrayList arrayList2 = this.c;
        d(i2, (arrayList2 != null ? arrayList2 : null).size());
    }

    public final void d(int i, int i2) {
        while (i < i2) {
            ArrayList arrayList = this.c;
            if (arrayList == null) {
                arrayList = null;
            }
            if (i >= arrayList.size()) {
                return;
            }
            ArrayList arrayList2 = this.c;
            if (arrayList2 == null) {
                arrayList2 = null;
            }
            w25 w25Var = (w25) arrayList2.get(i);
            if (w25Var instanceof u25) {
                ((u25) w25Var).a = null;
            }
            i++;
        }
    }

    public final String e(int i, int i2) {
        Character ch;
        StringBuilder sb = new StringBuilder();
        while (i <= i2) {
            ArrayList arrayList = this.c;
            if (arrayList == null) {
                arrayList = null;
            }
            w25 w25Var = (w25) arrayList.get(i);
            if ((w25Var instanceof u25) && (ch = ((u25) w25Var).a) != null) {
                sb.append(ch);
            }
            i++;
        }
        return sb.toString();
    }

    public final int f(int i) {
        while (true) {
            ArrayList arrayList = this.c;
            if (arrayList == null) {
                arrayList = null;
            }
            if (i >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = this.c;
            if (((w25) (arrayList2 != null ? arrayList2 : null).get(i)) instanceof u25) {
                break;
            }
            i++;
        }
        return i;
    }

    public final int g() {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = null;
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            w25 w25Var = (w25) it.next();
            if ((w25Var instanceof u25) && ((u25) w25Var).a == null) {
                break;
            }
            i++;
        }
        if (i != -1) {
            return i;
        }
        ArrayList arrayList2 = this.c;
        return (arrayList2 != null ? arrayList2 : null).size();
    }

    public final String h() {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = null;
        }
        return e(0, arrayList.size() - 1);
    }

    public final String i() {
        Character ch;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            w25 w25Var = (w25) obj;
            if (w25Var instanceof v25) {
                sb.append(((v25) w25Var).a);
            } else if ((w25Var instanceof u25) && (ch = ((u25) w25Var).a) != null) {
                sb.append(ch);
            } else {
                if (!this.a.c) {
                    break;
                }
                sb.append(((u25) w25Var).c);
            }
            arrayList2.add(obj);
        }
        return sb.toString();
    }

    public abstract void j(PatternSyntaxException patternSyntaxException);

    public void k(String str) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = null;
        }
        d(0, arrayList.size());
        m(0, null, str);
        this.d = Math.min(this.d, i().length());
    }

    public final int l(uly0 uly0Var, String str) {
        int i;
        Integer valueOf;
        int i2 = uly0Var.a;
        String substring = str.substring(i2, uly0Var.b + i2);
        int i3 = i2 + uly0Var.c;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = null;
        }
        String e = e(i3, arrayList.size() - 1);
        c(uly0Var);
        int g = g();
        if (e.length() == 0) {
            valueOf = null;
        } else {
            if (this.b.size() <= 1) {
                int i4 = g;
                int i5 = 0;
                while (true) {
                    ArrayList arrayList2 = this.c;
                    if (arrayList2 == null) {
                        arrayList2 = null;
                    }
                    if (i4 >= arrayList2.size()) {
                        break;
                    }
                    ArrayList arrayList3 = this.c;
                    if (arrayList3 == null) {
                        arrayList3 = null;
                    }
                    if (arrayList3.get(i4) instanceof u25) {
                        i5++;
                    }
                    i4++;
                }
                i = i5 - e.length();
            } else {
                String b = b(g, e);
                int i6 = 0;
                while (true) {
                    ArrayList arrayList4 = this.c;
                    if (arrayList4 == null) {
                        arrayList4 = null;
                    }
                    if (i6 >= arrayList4.size() || !b.equals(b(g + i6, e))) {
                        break;
                    }
                    i6++;
                }
                i = i6 - 1;
            }
            valueOf = Integer.valueOf(i >= 0 ? i : 0);
        }
        m(g, valueOf, substring);
        int g2 = g();
        m(g2, null, e);
        return g2;
    }

    public final void m(int i, Integer num, String str) {
        String b = b(i, str);
        if (num != null) {
            b = gvu0.A0(num.intValue(), b);
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (arrayList == null) {
                arrayList = null;
            }
            if (i >= arrayList.size() || i2 >= b.length()) {
                return;
            }
            ArrayList arrayList2 = this.c;
            w25 w25Var = (w25) (arrayList2 != null ? arrayList2 : null).get(i);
            char charAt = b.charAt(i2);
            if (w25Var instanceof u25) {
                ((u25) w25Var).a = Character.valueOf(charAt);
                i2++;
            }
            i++;
        }
    }

    public final void n(x25 x25Var, boolean z) {
        Object obj;
        String h = (jl40.l(this.a, x25Var) || !z) ? null : h();
        this.a = x25Var;
        LinkedHashMap linkedHashMap = this.b;
        linkedHashMap.clear();
        for (y25 y25Var : this.a.b) {
            try {
                String str = y25Var.b;
                if (str != null) {
                    linkedHashMap.put(Character.valueOf(y25Var.a), new Regex(str));
                }
            } catch (PatternSyntaxException e) {
                j(e);
            }
        }
        String str2 = this.a.a;
        ArrayList arrayList = new ArrayList(str2.length());
        for (int i = 0; i < str2.length(); i++) {
            char charAt = str2.charAt(i);
            Iterator it = this.a.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((y25) obj).a == charAt) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            y25 y25Var2 = (y25) obj;
            arrayList.add(y25Var2 != null ? new u25((Regex) linkedHashMap.get(Character.valueOf(y25Var2.a)), y25Var2.c) : new v25(charAt));
        }
        this.c = arrayList;
        if (h != null) {
            k(h);
        }
    }
}
