package defpackage;

import java.util.List;
import java.util.function.BiPredicate;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.statebar.StateBarViewModel$Type;

/* loaded from: classes9.dex */
public final /* synthetic */ class etq0 implements wls {
    public final /* synthetic */ int a;

    public /* synthetic */ etq0(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r7.equals(r6) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        if (r5 != false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean l;
        boolean z = false;
        r1 = false;
        r1 = false;
        r1 = false;
        r1 = false;
        boolean z2 = false;
        r1 = false;
        boolean z3 = false;
        z = false;
        final int i = 1;
        switch (this.a) {
            case 0:
                List list = (List) obj2;
                return gtq0.C((lfx) obj, gtq0.L(itq0.a, list, true), new oc0(list, 6));
            case 1:
                List list2 = (List) obj2;
                KSerializer C = gtq0.C((lfx) obj, gtq0.L(itq0.a, list2, true), new oc0(list2, 7));
                if (C != null) {
                    return qke.n(C);
                }
                return null;
            case 2:
                oqx0 oqx0Var = (oqx0) obj;
                oqx0 oqx0Var2 = (oqx0) obj2;
                oqx0Var.getClass();
                if (oqx0Var2.a.b(oqx0Var.a) && oqx0Var2.b == oqx0Var.b) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                return Integer.valueOf(jl40.q(((StateBarViewModel$Type) obj2).getPriority(), ((StateBarViewModel$Type) obj).getPriority()));
            case 4:
                fnx0 fnx0Var = (fnx0) obj2;
                boolean l2 = jl40.l(((fnx0) obj).c.b, fnx0Var.c.b);
                Object[] objArr = fnx0Var.c.h != ybo.d;
                if (l2 && objArr != false) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 5:
                uzs uzsVar = zzs.Companion;
                return Boolean.valueOf(((zzs) obj).a((zzs) obj2, 1.0E-6d));
            case 6:
                return Boolean.valueOf(cvu0.t((String) obj, (String) obj2, true));
            case 7:
                dse dseVar = (dse) obj2;
                if (!(dseVar instanceof txy0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? dseVar : Integer.valueOf(intValue + 1);
            case 8:
                txy0 txy0Var = (txy0) obj;
                dse dseVar2 = (dse) obj2;
                if (txy0Var != null) {
                    return txy0Var;
                }
                if (dseVar2 instanceof txy0) {
                    return (txy0) dseVar2;
                }
                return null;
            case 9:
                jyy0 jyy0Var = (jyy0) obj;
                dse dseVar3 = (dse) obj2;
                if (dseVar3 instanceof txy0) {
                    txy0 txy0Var2 = (txy0) dseVar3;
                    fse fseVar = jyy0Var.a;
                    Object H0 = txy0Var2.H0();
                    Object[] objArr2 = jyy0Var.b;
                    int i2 = jyy0Var.d;
                    objArr2[i2] = H0;
                    txy0[] txy0VarArr = jyy0Var.c;
                    jyy0Var.d = i2 + 1;
                    txy0VarArr[i2] = txy0Var2;
                }
                return jyy0Var;
            case 10:
                Object obj3 = (ai51) obj;
                ai51 ai51Var = (ai51) obj2;
                if (obj3 != ai51Var) {
                    if (obj3.getClass().equals(ai51Var.getClass())) {
                        if (obj3.equals(xh51.d) || obj3.equals(xh51.b) || obj3.equals(xh51.a) || obj3.equals(xh51.c)) {
                            z2 = obj3.equals(ai51Var);
                        } else if (obj3 instanceof zh51) {
                            if (ai51Var instanceof zh51) {
                                break;
                            }
                        } else {
                            if (!(obj3 instanceof yh51)) {
                                w511.b();
                                return null;
                            }
                            if (ai51Var instanceof yh51) {
                                yh51 yh51Var = (yh51) obj3;
                                yh51 yh51Var2 = (yh51) ai51Var;
                                final int i3 = z ? 1 : 0;
                                BiPredicate biPredicate = new BiPredicate() { // from class: f2k
                                    @Override // java.util.function.BiPredicate
                                    public final boolean test(Object obj4, Object obj5) {
                                        switch (i3) {
                                            case 0:
                                                if (obj4 == null) {
                                                    throw oyr.d(obj5);
                                                }
                                                throw new ClassCastException();
                                            default:
                                                return jl40.C((xf51) obj4, (xf51) obj5);
                                        }
                                    }
                                };
                                EmptyList emptyList = EmptyList.a;
                                if (!jl40.F(emptyList, emptyList, biPredicate) || !jl40.F(yh51Var.b, yh51Var2.b, new BiPredicate() { // from class: f2k
                                    @Override // java.util.function.BiPredicate
                                    public final boolean test(Object obj4, Object obj5) {
                                        switch (i) {
                                            case 0:
                                                if (obj4 == null) {
                                                    throw oyr.d(obj5);
                                                }
                                                throw new ClassCastException();
                                            default:
                                                return jl40.C((xf51) obj4, (xf51) obj5);
                                        }
                                    }
                                })) {
                                    l = false;
                                    break;
                                } else {
                                    l = jl40.l(yh51Var.a, yh51Var2.a);
                                    break;
                                }
                            }
                        }
                    }
                    return Boolean.valueOf(z2);
                }
                z2 = true;
                return Boolean.valueOf(z2);
            default:
                return Boolean.valueOf(z81.a(((d0l0) obj).h(), ((d0l0) obj2).h()));
        }
    }
}
