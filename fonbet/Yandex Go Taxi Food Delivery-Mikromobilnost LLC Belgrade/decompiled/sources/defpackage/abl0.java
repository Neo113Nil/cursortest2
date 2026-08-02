package defpackage;

import java.util.List;

/* loaded from: classes8.dex */
public final /* synthetic */ class abl0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ abl0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        bmt0 bmt0Var = null;
        r1 = null;
        hry0 hry0Var = null;
        bmt0Var = null;
        int i = 0;
        switch (this.a) {
            case 0:
                return ((bbl0) obj).a;
            case 1:
                return ((bbl0) obj).d;
            case 2:
                return ((bbl0) obj).e;
            case 3:
                return ((bbl0) obj).f;
            case 4:
                return ((bbl0) obj).g;
            case 5:
                return ((bbl0) obj).h;
            case 6:
                return ((bbl0) obj).i;
            case 7:
                return Boolean.valueOf(((bbl0) obj).j);
            case 8:
                return ((bbl0) obj).k;
            case 9:
                return ((bbl0) obj).l;
            case 10:
                return ((bbl0) obj).m;
            case 11:
                return ((bbl0) obj).n;
            case 12:
                return Long.valueOf(((bbl0) obj).o);
            case 13:
                return ((bbl0) obj).p;
            case 14:
                return Long.valueOf(((bbl0) obj).q);
            case 15:
                return ((bbl0) obj).b;
            case 16:
                return ((bbl0) obj).c;
            case 17:
                return obj;
            case 18:
                List list = (List) obj;
                Object obj2 = list.get(0);
                tls tlsVar = (tls) t2m0.h.b;
                Boolean bool = Boolean.FALSE;
                bmt0 bmt0Var2 = (jl40.l(obj2, bool) || obj2 == null) ? null : (bmt0) tlsVar.invoke(obj2);
                Object obj3 = list.get(1);
                bmt0 bmt0Var3 = (jl40.l(obj3, bool) || obj3 == null) ? null : (bmt0) tlsVar.invoke(obj3);
                Object obj4 = list.get(2);
                bmt0 bmt0Var4 = (jl40.l(obj4, bool) || obj4 == null) ? null : (bmt0) tlsVar.invoke(obj4);
                Object obj5 = list.get(3);
                if (!jl40.l(obj5, bool) && obj5 != null) {
                    bmt0Var = (bmt0) tlsVar.invoke(obj5);
                }
                return new hry0(bmt0Var2, bmt0Var3, bmt0Var4, bmt0Var);
            case 19:
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (jl40.l(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((tls) t2m0.a.b).invoke(obj6);
                Object obj7 = list2.get(0);
                return new kk2(list3, obj7 != null ? (String) obj7 : null);
            case 20:
                return new rly0(((Integer) obj).intValue());
            case 21:
                List list4 = (List) obj;
                return new soy0(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 22:
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                tty0[] tty0VarArr = sty0.b;
                tls tlsVar2 = t2m0.v.b;
                Boolean bool2 = Boolean.FALSE;
                jl40.l(obj8, bool2);
                long j = (obj8 != null ? (sty0) tlsVar2.invoke(obj8) : null).a;
                Object obj9 = list5.get(1);
                jl40.l(obj9, bool2);
                return new apy0(j, (obj9 != null ? (sty0) tlsVar2.invoke(obj9) : null).a);
            case 23:
                return new lzr(((Integer) obj).intValue());
            case 24:
                return new td5(((Float) obj).floatValue());
            case 25:
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                int intValue = (obj10 != null ? (Integer) obj10 : null).intValue();
                Object obj11 = list6.get(1);
                return new asy0(eja1.c(intValue, (obj11 != null ? (Integer) obj11 : null).intValue()));
            case 26:
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i2 = ldc.n;
                Boolean bool3 = Boolean.FALSE;
                jl40.l(obj12, bool3);
                long j2 = (obj12 != null ? jl40.l(obj12, Boolean.FALSE) ? new ldc(ldc.m) : new ldc(rzo.d(((Integer) obj12).intValue())) : null).a;
                Object obj13 = list7.get(1);
                s2m0 s2m0Var = t2m0.x;
                jl40.l(obj13, bool3);
                long j3 = (obj13 != null ? (wu60) s2m0Var.b.invoke(obj13) : null).a;
                Object obj14 = list7.get(2);
                return new bgr0(j2, j3, (obj14 != null ? (Float) obj14 : null).floatValue());
            case 27:
                return new sjy0(((Integer) obj).intValue());
            case 28:
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str = obj15 != null ? (String) obj15 : null;
                Object obj16 = list8.get(1);
                tig0 tig0Var = t2m0.i;
                if (!jl40.l(obj16, Boolean.FALSE) && obj16 != null) {
                    hry0Var = (hry0) ((tls) tig0Var.b).invoke(obj16);
                }
                return new jky(str, hry0Var, i);
            default:
                return new vly0(((Integer) obj).intValue());
        }
    }
}
