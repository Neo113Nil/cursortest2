package com.yandex.passport.internal.flags.presentation;

import android.content.SharedPreferences;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.flags.experiments.ExperimentsUpdater$LoadingStrategy;
import defpackage.bvf0;
import defpackage.ds31;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.gci0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.w511;
import defpackage.yr31;
import defpackage.ywv;
import defpackage.zwv;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONArray;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class o0 extends yr31 {
    public static final ywv B;
    public final gci0 A;
    public final com.yandex.passport.internal.flags.experiments.g b;
    public final com.yandex.passport.internal.flags.experiments.q c;
    public final com.yandex.passport.internal.flags.experiments.e w;
    public final com.yandex.passport.internal.flags.experiments.k x;
    public final com.yandex.passport.internal.flags.j y;
    public final kotlinx.coroutines.flow.r0 z;

    static {
        zwv zwvVar = new zwv();
        zwvVar.a(qoi0.a(o0.class), new com.yandex.passport.internal.analytics.a0(4, com.yandex.passport.internal.di.a.a()));
        B = zwvVar.b();
    }

    public o0(com.yandex.passport.internal.flags.experiments.g gVar, com.yandex.passport.internal.flags.experiments.q qVar, com.yandex.passport.internal.flags.experiments.e eVar, com.yandex.passport.internal.flags.experiments.k kVar, com.yandex.passport.internal.flags.j jVar) {
        this.b = gVar;
        this.c = qVar;
        this.w = eVar;
        this.x = kVar;
        this.y = jVar;
        kotlinx.coroutines.flow.r0 c = bvf0.c(new d0(0));
        this.z = c;
        this.A = kotlinx.coroutines.flow.e.d(c);
        i0(g0.a);
    }

    public static final void W(o0 o0Var) {
        Object value;
        o0Var.b.a(new com.yandex.passport.internal.flags.experiments.a(kotlin.collections.b.f(), null, kotlin.collections.b.f()));
        kotlinx.coroutines.flow.r0 r0Var = o0Var.z;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, d0.a((d0) value, null, null, null, a0.a, false, 7)));
    }

    public static final void X(o0 o0Var) {
        Object value;
        SharedPreferences.Editor edit = o0Var.x.a.edit();
        edit.clear();
        edit.apply();
        kotlinx.coroutines.flow.r0 r0Var = o0Var.z;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, d0.a((d0) value, null, null, null, a0.a, false, 7)));
    }

    public static final void Y(o0 o0Var) {
        Object value;
        kotlinx.coroutines.flow.r0 r0Var = o0Var.z;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, d0.a((d0) value, null, null, null, null, false, 29)));
    }

    public static final void Z(o0 o0Var, c0 c0Var) {
        Object value;
        d0 d0Var;
        kotlinx.coroutines.flow.r0 r0Var = o0Var.z;
        do {
            value = r0Var.getValue();
            d0Var = (d0) value;
            if (jl40.l(d0Var.d, c0Var)) {
                d0Var = d0.a(d0Var, null, null, null, null, false, 23);
            }
        } while (!r0Var.k(value, d0Var));
    }

    public static final void a0(o0 o0Var) {
        Object value;
        kotlinx.coroutines.flow.r0 r0Var = o0Var.z;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, d0.a((d0) value, null, null, null, z.a, false, 23)));
    }

    public static final void b0(o0 o0Var, com.yandex.passport.internal.flags.g gVar) {
        Object value;
        d0 d0Var;
        String g0;
        String g02;
        String g03;
        String g04;
        String str;
        com.yandex.passport.internal.flags.g gVar2;
        com.yandex.passport.internal.flags.j jVar = o0Var.y;
        com.yandex.passport.internal.flags.h c = jVar.c(gVar);
        kotlinx.coroutines.flow.r0 r0Var = o0Var.z;
        do {
            value = r0Var.getValue();
            d0Var = (d0) value;
            Object b = jVar.b(gVar);
            String g05 = b != null ? g0(b, gVar) : null;
            Object obj = c.a;
            g0 = obj != null ? g0(obj, gVar) : null;
            Object obj2 = c.b;
            g02 = obj2 != null ? g0(obj2, gVar) : null;
            Object obj3 = c.c;
            g03 = obj3 != null ? g0(obj3, gVar) : null;
            Object obj4 = gVar.b;
            g04 = obj4 != null ? g0(obj4, gVar) : null;
            str = g05;
            gVar2 = gVar;
            gVar = gVar2;
        } while (!r0Var.k(value, d0.a(d0Var, null, new u(gVar2, str, g0, g02, g03, g04), null, null, false, 29)));
    }

    public static final void c0(o0 o0Var, com.yandex.passport.internal.flags.g gVar, String str) {
        Object value;
        Object value2;
        kotlinx.coroutines.flow.r0 r0Var = o0Var.z;
        try {
            String h0 = h0(gVar, str);
            com.yandex.passport.internal.flags.experiments.k kVar = o0Var.x;
            String str2 = gVar.a;
            SharedPreferences sharedPreferences = kVar.a;
            if (h0 == null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.remove(str2);
                edit.apply();
            } else {
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.putString(str2, h0);
                edit2.apply();
            }
            do {
                value2 = r0Var.getValue();
            } while (!r0Var.k(value2, d0.a((d0) value2, null, null, null, a0.a, false, 21)));
        } catch (Throwable unused) {
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, d0.a((d0) value, null, null, null, new b0(g8e.o("Can't save: ", str)), false, 23)));
        }
    }

    public static final void d0(o0 o0Var) {
        Object value;
        String str;
        o0Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : com.yandex.passport.internal.flags.q.a().entrySet()) {
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            arrayList.add(new w(str2));
            List<com.yandex.passport.internal.flags.g> list2 = list;
            ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
            for (com.yandex.passport.internal.flags.g gVar : list2) {
                Object b = o0Var.y.b(gVar);
                if (b == null || (str = g0(b, gVar)) == null) {
                    str = "";
                }
                arrayList2.add(new v(gVar, str));
            }
            arrayList.addAll(arrayList2);
        }
        kotlinx.coroutines.flow.r0 r0Var = o0Var.z;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, d0.a((d0) value, arrayList, null, null, null, false, 14)));
    }

    public static final void e0(o0 o0Var, Throwable th) {
        kotlinx.coroutines.flow.r0 r0Var = o0Var.z;
        while (true) {
            Object value = r0Var.getValue();
            Throwable th2 = th;
            if (r0Var.k(value, d0.a((d0) value, null, null, th2, null, false, 11))) {
                return;
            } else {
                th = th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f0(o0 o0Var, Environment environment, ContinuationImpl continuationImpl) {
        ExperimentsInternalTestViewModel$onUpdateNetworkCache$1 experimentsInternalTestViewModel$onUpdateNetworkCache$1;
        int i;
        Object value;
        Object value2;
        c0 b0Var;
        kotlinx.coroutines.flow.r0 r0Var;
        Object value3;
        o0Var.getClass();
        if (continuationImpl instanceof ExperimentsInternalTestViewModel$onUpdateNetworkCache$1) {
            experimentsInternalTestViewModel$onUpdateNetworkCache$1 = (ExperimentsInternalTestViewModel$onUpdateNetworkCache$1) continuationImpl;
            int i2 = experimentsInternalTestViewModel$onUpdateNetworkCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                experimentsInternalTestViewModel$onUpdateNetworkCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = experimentsInternalTestViewModel$onUpdateNetworkCache$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = experimentsInternalTestViewModel$onUpdateNetworkCache$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kotlinx.coroutines.flow.r0 r0Var2 = o0Var.z;
                    do {
                        value = r0Var2.getValue();
                    } while (!r0Var2.k(value, d0.a((d0) value, null, null, null, null, true, 15)));
                    o0Var.c.a(ExperimentsUpdater$LoadingStrategy.FORCED, environment);
                    kotlinx.coroutines.flow.n0 n0Var = o0Var.w.g;
                    experimentsInternalTestViewModel$onUpdateNetworkCache$1.L$0 = o0Var;
                    experimentsInternalTestViewModel$onUpdateNetworkCache$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(n0Var, experimentsInternalTestViewModel$onUpdateNetworkCache$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o0Var = (o0) experimentsInternalTestViewModel$onUpdateNetworkCache$1.L$0;
                    kotlin.b.b(obj);
                }
                value2 = ((Result) obj).getValue();
                if (value2 instanceof Result.Failure) {
                    b0Var = a0.a;
                } else {
                    b0Var = new b0("experimentsFetcher.result: " + ((Object) Result.c(value2)));
                }
                r0Var = o0Var.z;
                do {
                    value3 = r0Var.getValue();
                } while (!r0Var.k(value3, d0.a((d0) value3, null, null, null, b0Var, false, 7)));
                return zy11.a;
            }
        }
        experimentsInternalTestViewModel$onUpdateNetworkCache$1 = new ExperimentsInternalTestViewModel$onUpdateNetworkCache$1(o0Var, continuationImpl);
        Object obj2 = experimentsInternalTestViewModel$onUpdateNetworkCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = experimentsInternalTestViewModel$onUpdateNetworkCache$1.label;
        if (i != 0) {
        }
        value2 = ((Result) obj2).getValue();
        if (value2 instanceof Result.Failure) {
        }
        r0Var = o0Var.z;
        do {
            value3 = r0Var.getValue();
        } while (!r0Var.k(value3, d0.a((d0) value3, null, null, null, b0Var, false, 7)));
        return zy11.a;
    }

    public static String g0(Object obj, com.yandex.passport.internal.flags.g gVar) {
        return gVar instanceof com.yandex.passport.internal.flags.m ? kotlin.collections.a.X((List) obj, Extension.FIX_SPACE, "[", "]", new com.yandex.passport.internal.core.announcing.f(1), 24) : obj.toString();
    }

    public static String h0(com.yandex.passport.internal.flags.g gVar, String str) {
        ArrayList arrayList;
        String p0;
        String n0;
        List W;
        Enum r3;
        if (gVar instanceof com.yandex.passport.internal.flags.a) {
            Boolean valueOf = str != null ? Boolean.valueOf(evu0.i0(str)) : null;
            if (valueOf != null) {
                if (valueOf.equals(Boolean.TRUE)) {
                    return "1";
                }
                if (valueOf.equals(Boolean.FALSE)) {
                    return "0";
                }
                w511.b();
                return null;
            }
        } else {
            int i = 0;
            if (gVar instanceof com.yandex.passport.internal.flags.b) {
                if (str == null) {
                    r3 = null;
                } else {
                    Enum[] enumArr = ((com.yandex.passport.internal.flags.b) gVar).c;
                    int length = enumArr.length;
                    while (true) {
                        if (i >= length) {
                            r3 = null;
                            break;
                        }
                        r3 = enumArr[i];
                        if (jl40.l(r3.name(), str)) {
                            break;
                        }
                        i++;
                    }
                    if (r3 == null) {
                        ny61.g("No enum with value ".concat(str));
                        return null;
                    }
                }
                if (r3 != null) {
                    return Integer.valueOf(r3.ordinal()).toString();
                }
            } else if (gVar instanceof com.yandex.passport.internal.flags.l) {
                Integer valueOf2 = str != null ? Integer.valueOf(Integer.parseInt(str)) : null;
                if (valueOf2 != null) {
                    return valueOf2.toString();
                }
            } else {
                if (!(gVar instanceof com.yandex.passport.internal.flags.m)) {
                    w511.b();
                    return null;
                }
                if (str == null || (p0 = evu0.p0(str, '[')) == null || (n0 = evu0.n0(p0, ']')) == null) {
                    arrayList = null;
                } else {
                    W = evu0.W(n0, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
                    List list = W;
                    arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(evu0.k0((String) it.next()).toString());
                    }
                }
                if (arrayList != null) {
                    return new JSONArray((Collection) arrayList).toString();
                }
            }
        }
        return null;
    }

    public final void i0(n0 n0Var) {
        tje.N(ds31.a(this), null, null, new ExperimentsInternalTestViewModel$onWish$1(n0Var, this, null), 3);
    }
}
