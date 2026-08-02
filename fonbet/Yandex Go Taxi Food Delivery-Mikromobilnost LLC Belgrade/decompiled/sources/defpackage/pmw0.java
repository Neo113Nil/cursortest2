package defpackage;

import com.yandex.go.requirements.api.domain.model.CompoundSelect$CompoundSelectItemType;
import com.yandex.go.requirements.api.domain.model.OptionType;
import com.yandex.go.requirements.api.domain.model.OptionViewStyle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.yandex.taxi.requirements.models.net.CompoundSelectDto;
import ru.yandex.taxi.requirements.models.net.c;

/* loaded from: classes10.dex */
public final class pmw0 {
    public static fmw0 a(c cVar, String str) {
        String str2 = cVar.c;
        String str3 = cVar.a;
        String str4 = cVar.b;
        String str5 = cVar.d;
        String str6 = cVar.e;
        String str7 = cVar.n;
        String str8 = cVar.t;
        f1b0 f1b0Var = cVar.u;
        k1b0 T = f1b0Var != null ? uh6.T(f1b0Var, str2, str) : h1b0.a;
        wej0 wej0Var = cVar.v;
        tej0 g = wej0Var != null ? g(wej0Var) : null;
        rej0 rej0Var = cVar.w;
        oej0 oej0Var = rej0Var != null ? new oej0(rej0Var.a, rej0Var.b) : null;
        String str9 = cVar.x;
        jbj0 jbj0Var = cVar.y;
        gbj0 e = jbj0Var != null ? e(jbj0Var) : null;
        kk4 kk4Var = cVar.z;
        idj0 f = kk4Var != null ? f(kk4Var) : null;
        Boolean bool = cVar.A;
        return new fmw0(str2, str3, str5, str7, f, cVar.B, new koj0(cVar.C.a), T, str4, str6, str8, g, oej0Var, str9, e, bool != null ? bool.booleanValue() : false);
    }

    public static ArrayList b(String str, List list) {
        boolean z;
        lmw0 a;
        CompoundSelect$CompoundSelectItemType compoundSelect$CompoundSelectItemType;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            ylx0 ylx0Var = cVar.m;
            jbj0 jbj0Var = cVar.y;
            rej0 rej0Var = cVar.w;
            f1b0 f1b0Var = cVar.u;
            wej0 wej0Var = cVar.v;
            hgh hghVar = cVar.l;
            boolean z2 = cVar.k;
            boolean z3 = cVar.j;
            Number number = cVar.i;
            boolean z4 = cVar.h;
            yg70 yg70Var = cVar.g;
            CompoundSelectDto compoundSelectDto = cVar.s;
            Iterator it2 = it;
            noj0 noj0Var = cVar.C;
            kk4 kk4Var = cVar.z;
            String str2 = cVar.f;
            String str3 = cVar.c;
            boolean z5 = ylx0Var != null;
            boolean l = jl40.l(str2, "select");
            boolean l2 = jl40.l(str2, "boolean");
            if (z5) {
                a = new kmw0(cVar.c, cVar.a, cVar.d, cVar.n, kk4Var != null ? f(kk4Var) : null, cVar.B, new koj0(noj0Var.a), new tlx0(ylx0Var.a, ylx0Var.b, ylx0Var.c));
            } else if (l2) {
                a = a(cVar, str);
            } else {
                List list3 = compoundSelectDto.a;
                List list4 = list3;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        tvd tvdVar = (tvd) it3.next();
                        Iterator it4 = it3;
                        if (tvdVar.a.length() <= 0 || tvdVar.e.length() <= 0 || tvdVar.h.length() <= 0) {
                            z = false;
                            break;
                        }
                        it3 = it4;
                    }
                }
                z = true;
                if (!z) {
                    xby.l(jst.e, "Requirements:Mapping:Type", null, null, g8e.o("Invalid compound select items for requirement: ", str3), 6);
                }
                boolean equals = "compoundselect".equals(str2);
                k1b0 k1b0Var = h1b0.a;
                if (equals && !list3.isEmpty() && z) {
                    vg70 d = d(yg70Var, z4);
                    String str4 = cVar.c;
                    String str5 = cVar.a;
                    String str6 = cVar.b;
                    String str7 = cVar.d;
                    String str8 = cVar.e;
                    boolean z6 = cVar.h;
                    int intValue = number.intValue();
                    ArrayList arrayList2 = d.c;
                    boolean z7 = !arrayList2.isEmpty() ? z3 : false;
                    boolean z8 = !arrayList2.isEmpty() ? z2 : false;
                    fgh c = c(hghVar);
                    String str9 = cVar.n;
                    List list5 = cVar.r;
                    tej0 g = wej0Var != null ? g(wej0Var) : null;
                    if (f1b0Var != null) {
                        k1b0Var = uh6.T(f1b0Var, str3, str);
                    }
                    k1b0 k1b0Var2 = k1b0Var;
                    String str10 = cVar.t;
                    List list6 = list3;
                    ArrayList arrayList3 = new ArrayList(tcc.n(list6, 10));
                    Iterator it5 = list6.iterator();
                    while (it5.hasNext()) {
                        tvd tvdVar2 = (tvd) it5.next();
                        String str11 = tvdVar2.a;
                        Iterator it6 = it5;
                        String str12 = tvdVar2.b;
                        String str13 = tvdVar2.c;
                        String str14 = tvdVar2.d;
                        String str15 = tvdVar2.e;
                        n7v n7vVar = tvdVar2.f;
                        String str16 = tvdVar2.g;
                        String str17 = tvdVar2.h;
                        kk4 kk4Var2 = tvdVar2.i;
                        arrayList3.add(new qvd(str11, str12, str13, str14, str15, n7vVar, str16, str17, kk4Var2 != null ? f(kk4Var2) : null));
                        it5 = it6;
                    }
                    int i = omw0.b[compoundSelectDto.b.ordinal()];
                    if (i == 1) {
                        compoundSelect$CompoundSelectItemType = CompoundSelect$CompoundSelectItemType.DEFAULT;
                    } else {
                        if (i != 2) {
                            w511.b();
                            return null;
                        }
                        compoundSelect$CompoundSelectItemType = CompoundSelect$CompoundSelectItemType.CHILD_SEATS;
                    }
                    a = new gmw0(str4, str5, str7, str9, kk4Var != null ? f(kk4Var) : null, cVar.B, new koj0(noj0Var.a), d, list5, z6, intValue, z7, z8, k1b0Var2, str6, str8, c, new ovd(arrayList3, compoundSelect$CompoundSelectItemType), str10, g, rej0Var != null ? new oej0(rej0Var.a, rej0Var.b) : null, cVar.x, jbj0Var != null ? e(jbj0Var) : null);
                } else if (l) {
                    vg70 d2 = d(yg70Var, z4);
                    String str18 = cVar.c;
                    String str19 = cVar.a;
                    String str20 = cVar.b;
                    String str21 = cVar.d;
                    String str22 = cVar.e;
                    boolean z9 = cVar.h;
                    int intValue2 = number.intValue();
                    ArrayList arrayList4 = d2.c;
                    boolean z10 = !arrayList4.isEmpty() ? z3 : false;
                    boolean z11 = !arrayList4.isEmpty() ? z2 : false;
                    fgh c2 = c(hghVar);
                    String str23 = cVar.n;
                    List list7 = cVar.r;
                    String str24 = cVar.t;
                    if (f1b0Var != null) {
                        k1b0Var = uh6.T(f1b0Var, str3, str);
                    }
                    a = new hmw0(str18, str19, str21, str23, kk4Var != null ? f(kk4Var) : null, cVar.B, new koj0(noj0Var.a), d2, list7, z9, intValue2, z10, z11, k1b0Var, str20, str22, c2, str24, wej0Var != null ? g(wej0Var) : null, rej0Var != null ? new oej0(rej0Var.a, rej0Var.b) : null, cVar.x, jbj0Var != null ? e(jbj0Var) : null);
                } else {
                    xby.l(jst.e, "Requirements:Mapping:Type", null, null, g8e.o("Unknown requirement type for requirement: ", str3), 6);
                    a = a(cVar, str);
                }
            }
            arrayList.add(a);
            it = it2;
        }
        return arrayList;
    }

    public static fgh c(hgh hghVar) {
        List list = hghVar.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(q5z.g0((rf70) it.next()));
        }
        return new fgh(arrayList);
    }

    public static vg70 d(yg70 yg70Var, boolean z) {
        OptionViewStyle optionViewStyle;
        String str = yg70Var.a;
        String str2 = yg70Var.b;
        OptionType optionType = jl40.l(str2, "string") ? OptionType.STRING : jl40.l(str2, "number") ? OptionType.NUMBER : OptionType.NUMBER;
        List list = yg70Var.c;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            je70 je70Var = (je70) it.next();
            String str3 = je70Var.c;
            String str4 = je70Var.a;
            String str5 = je70Var.b;
            int max = Math.max(je70Var.d.intValue(), 1);
            int max2 = Math.max(je70Var.e, 1);
            Map map = je70Var.f;
            int i = omw0.a[je70Var.g.ordinal()];
            if (i == 1) {
                optionViewStyle = OptionViewStyle.SPINNER;
            } else {
                if (i != 2 && i != 3) {
                    w511.b();
                    return null;
                }
                optionViewStyle = (!z || je70Var.a() <= 1) ? z ? OptionViewStyle.CHECKBOX : OptionViewStyle.RADIO : OptionViewStyle.SPINNER;
            }
            n7v n7vVar = je70Var.h;
            n7v n7vVar2 = je70Var.i;
            n7v n7vVar3 = je70Var.j;
            kf70 kf70Var = null;
            String str6 = je70Var.k;
            Iterator it2 = it;
            String str7 = je70Var.l;
            rf70 rf70Var = je70Var.m;
            if (rf70Var != null) {
                kf70Var = q5z.g0(rf70Var);
            }
            ge70 ge70Var = je70Var.n;
            arrayList.add(new ejj0(str3, str4, str5, max, max2, optionViewStyle, n7vVar, n7vVar2, n7vVar3, str6, str7, kf70Var, new de70(ge70Var.a, ge70Var.b), je70Var.o, map));
            it = it2;
        }
        return new vg70(str, optionType, arrayList);
    }

    public static gbj0 e(jbj0 jbj0Var) {
        kcj0 kcj0Var = jbj0Var.a;
        hcj0 hcj0Var = null;
        if (kcj0Var != null) {
            pcj0 a = kcj0Var.getA();
            hcj0Var = new hcj0(a != null ? new mcj0(a.getA(), a.getB(), a.getC().toString()) : null);
        }
        return new gbj0(hcj0Var);
    }

    public static idj0 f(kk4 kk4Var) {
        String a = kk4Var.a.getA();
        ok4 ok4Var = kk4Var.a;
        return new idj0(new fdj0(a, new gdj0(ok4Var.getB().getA(), ok4Var.getB().getB(), ok4Var.getB().getC())), new hdj0(kk4Var.b.getA()));
    }

    public static tej0 g(wej0 wej0Var) {
        String str = wej0Var.a;
        Integer num = wej0Var.b;
        afj0 afj0Var = wej0Var.c;
        return new tej0(str, num, new xej0(afj0Var.a, afj0Var.b, afj0Var.c));
    }
}
