package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.nx0;
import yads.q80;

/* loaded from: classes7.dex */
public final class h081 {
    public final b881 a;

    public h081(b881 b881Var) {
        this.a = b881Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        nx0 nx0Var;
        int i;
        String str2;
        Iterator it;
        Object obj;
        ee81 ee81Var;
        hi71 hi71Var;
        Object obj2;
        Object obj3;
        String str3;
        if (continuationImpl instanceof nx0) {
            nx0Var = (nx0) continuationImpl;
            int i2 = nx0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nx0Var.e = i2 - Integer.MIN_VALUE;
                Object obj4 = nx0Var.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nx0Var.e;
                if (i != 0) {
                    b.b(obj4);
                    nx0Var.b = str;
                    nx0Var.e = 1;
                    b881 b881Var = this.a;
                    Object k0 = tje.k0(b881Var.d, new q80(b881Var, null), nx0Var);
                    if (k0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj4 = k0;
                    str2 = str;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = nx0Var.b;
                    b.b(obj4);
                }
                vx71 vx71Var = (vx71) obj4;
                it = vx71Var.g.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jl40.l(((ee81) obj).c, str2)) {
                        break;
                    }
                }
                ee81Var = (ee81) obj;
                if (ee81Var != null) {
                    return null;
                }
                ArrayList arrayList = vx71Var.d.a;
                s271 s271Var = ee81Var.d;
                if (s271Var == null) {
                    hi71Var = new hi71(EmptyList.a);
                } else {
                    List<fr81> list = s271Var.b;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
                    for (fr81 fr81Var : list) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            if (jl40.l(((sk81) obj3).a, fr81Var.b)) {
                                break;
                            }
                        }
                        sk81 sk81Var = (sk81) obj3;
                        String str4 = (sk81Var == null || (str3 = sk81Var.b) == null) ? "" : str3;
                        List<ii71> list2 = fr81Var.c;
                        ArrayList arrayList3 = new ArrayList(tcc.n(list2, 10));
                        for (ii71 ii71Var : list2) {
                            arrayList3.add(new or81(ii71Var.a, ii71Var.b));
                        }
                        arrayList2.add(new hf71(str4, fr81Var.b, arrayList3, fr81Var.d, fr81Var.e, x571.a));
                    }
                    List<sx71> list3 = s271Var.a;
                    ArrayList arrayList4 = new ArrayList(tcc.n(list3, 10));
                    for (sx71 sx71Var : list3) {
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it3.next();
                            if (jl40.l(((sk81) obj2).a, sx71Var.b)) {
                                break;
                            }
                        }
                        sk81 sk81Var2 = (sk81) obj2;
                        String str5 = sk81Var2 != null ? sk81Var2.b : null;
                        String str6 = str5 == null ? "" : str5;
                        List<o181> list4 = sx71Var.c;
                        ArrayList arrayList5 = new ArrayList(tcc.n(list4, 10));
                        for (o181 o181Var : list4) {
                            arrayList5.add(new or81(o181Var.a, o181Var.b));
                        }
                        arrayList4.add(new hf71(str6, sx71Var.b, arrayList5, null, sx71Var.d, new y871(sx71Var.e, sx71Var.f)));
                    }
                    hi71Var = new hi71(a.m0(arrayList4, arrayList2));
                }
                return new tw81(ee81Var.a, ee81Var.b, str2, hi71Var);
            }
        }
        nx0Var = new nx0(this, continuationImpl);
        Object obj42 = nx0Var.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nx0Var.e;
        if (i != 0) {
        }
        vx71 vx71Var2 = (vx71) obj42;
        it = vx71Var2.g.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        ee81Var = (ee81) obj;
        if (ee81Var != null) {
        }
    }
}
