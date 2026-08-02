package defpackage;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EdgeEffect;
import com.squareup.moshi.Types;
import com.yandex.delivery.live.location.impl.repository.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.go.blockeduser.api.BlockedUserType;
import com.yandex.go.blockeduser.api.analytics.BlockedReason;
import com.yandex.go.sdk.SourceType;
import com.ybsdk.core.analytics.DeeplinkParamsFilter;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.r0;
import kotlinx.serialization.KSerializer;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.sdk.lifecycle_listener.AppLifecycleListenerCallbacks;
import ru.yandex.taxi.logistics.address.g;
import ru.yandex.taxi.logistics.sdk.delivery.state.d;
import ru.yandex.taxi.logistics.sdk.management.f;
import ru.yandex.taxi.logistics.sdk.o;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;
import ru.yandex.taxi.net.taxi.dto.response.BlockedUserTypeDto;

/* loaded from: classes.dex */
public abstract class bvf0 {
    public static final jb20 a;
    public static final jb20 b;
    public static y8g c;
    public static y8g d;
    public static y8g e;
    public static y8g f;
    public static final Object g = new Object();
    public static final jb20 h;
    public static final jb20 i;

    static {
        int i2 = 1;
        a = new jb20("UNDEFINED", i2);
        b = new jb20("REUSABLE_CLAIMED", i2);
        h = new jb20(JCP.RAW_PREFIX, i2);
        i = new jb20("PENDING", i2);
    }

    public static final sf90 A(sbx sbxVar) {
        return ((xf90) gtq0.B(sbxVar.b, qoi0.a(xf90.class))).a;
    }

    public static qdx C(cne0 cne0Var, String str) {
        return new qdx(0, cne0Var, cne0Var, str);
    }

    public static final boolean D(tse tseVar) {
        l8x l8xVar = (l8x) tseVar.getCoroutineContext().get(seu.C);
        if (l8xVar != null) {
            return l8xVar.isActive();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean G(ezw ezwVar, zir zirVar) {
        if (zirVar instanceof xir) {
            return true;
        }
        if (!(zirVar instanceof yir)) {
            w511.b();
            return false;
        }
        r0t r0tVar = (r0t) a.a0(((yir) zirVar).d);
        if (r0tVar == null) {
            return ezwVar.a.a(true) || ((Boolean) ezwVar.b.a.b()).booleanValue();
        }
        Boolean bool = ezwVar.a.b.a(r0tVar).a;
        if ((bool != null ? bool.booleanValue() : true) || ezwVar.b.b.a(r0tVar).c) {
        }
    }

    public static final vg70 H(vg70 vg70Var, vg70 vg70Var2) {
        Object obj;
        Object obj2;
        if (!h(vg70Var, vg70Var2)) {
            return null;
        }
        ArrayList m0 = a.m0(vg70Var2.c, vg70Var.c);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        Iterator it = m0.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((ejj0) it.next()).a);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : linkedHashSet) {
            Iterator it2 = vg70Var.c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (jl40.l(((ejj0) obj).a, str)) {
                    break;
                }
            }
            ejj0 ejj0Var = (ejj0) obj;
            Iterator it3 = vg70Var2.c.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                if (jl40.l(((ejj0) obj2).a, str)) {
                    break;
                }
            }
            ejj0 ejj0Var2 = (ejj0) obj2;
            if (ejj0Var != null && ejj0Var2 != null) {
                ejj0Var = !jl40.l(ejj0Var.a, ejj0Var2.a) ? null : ejj0.a(ejj0Var, Math.min(ejj0Var.d, ejj0Var2.d), Math.max(ejj0Var.e, ejj0Var2.e));
            } else if (ejj0Var == null) {
                ejj0Var = ejj0Var2;
            }
            if (ejj0Var != null) {
                arrayList.add(ejj0Var);
            }
        }
        return vg70.a(vg70Var, arrayList);
    }

    public static final vg70 I(vg70 vg70Var, vg70 vg70Var2) {
        Object obj;
        Object obj2;
        if (!h(vg70Var, vg70Var2)) {
            return null;
        }
        ArrayList arrayList = vg70Var.c;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ejj0) it.next()).a);
        }
        ArrayList arrayList3 = vg70Var2.c;
        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((ejj0) it2.next()).a);
        }
        LinkedHashSet<String> U = a.U(arrayList2, a.N0(arrayList4));
        ArrayList arrayList5 = new ArrayList();
        for (String str : U) {
            Iterator it3 = vg70Var.c.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                if (jl40.l(((ejj0) obj).a, str)) {
                    break;
                }
            }
            ejj0 ejj0Var = (ejj0) obj;
            Iterator it4 = vg70Var2.c.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it4.next();
                if (jl40.l(((ejj0) obj2).a, str)) {
                    break;
                }
            }
            ejj0 ejj0Var2 = (ejj0) obj2;
            ejj0 a2 = (ejj0Var == null || ejj0Var2 == null || !(ejj0Var == ejj0Var2 || (jl40.l(ejj0Var.b, ejj0Var2.b) && jl40.l(ejj0Var.c, ejj0Var2.c) && jl40.l(ejj0Var.a, ejj0Var2.a) && ejj0Var.f == ejj0Var2.f && jl40.l(ejj0Var.g, ejj0Var2.g) && jl40.l(ejj0Var.h, ejj0Var2.h) && jl40.l(ejj0Var.i, ejj0Var2.i) && jl40.l(ejj0Var.l, ejj0Var2.l) && ejj0Var.m.equals(ejj0Var2.m) && jl40.l(ejj0Var.n, ejj0Var2.n)))) ? null : ejj0.a(ejj0Var, ejj0Var.d + ejj0Var2.d, Math.min(ejj0Var.e, ejj0Var2.e));
            if (a2 != null) {
                arrayList5.add(a2);
            }
        }
        return vg70.a(vg70Var, arrayList5);
    }

    public static final k1b0 J(k1b0 k1b0Var, k1b0 k1b0Var2, String str) {
        if (jl40.l(k1b0Var, h1b0.a)) {
            return k1b0Var2;
        }
        if (k1b0Var instanceof j1b0) {
            return k1b0Var;
        }
        if (k1b0Var instanceof i1b0) {
            return k1b0Var2 instanceof j1b0 ? k1b0Var2 : new i1b0("multiclass", str);
        }
        w511.b();
        return null;
    }

    public static float K(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return jkn.c(edgeEffect, f2, f3);
        }
        ikn.a(edgeEffect, f2, f3);
        return f2;
    }

    public static final boolean L(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        Object tag = viewGroup.getTag(ngh0.div_penetrating_longtap_tag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        return (bool != null ? bool.booleanValue() : false) || L(viewGroup);
    }

    public static final ike M(tse tseVar, fse fseVar) {
        return new ike(tseVar.getCoroutineContext().plus(fseVar));
    }

    public static void N(kjz kjzVar) {
        y8g y8gVar = f;
        if (y8gVar == null) {
            y8gVar = null;
        }
        st2 st2Var = (st2) y8gVar.c.get();
        gjz gjzVar = y8gVar.a;
        AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl = gjzVar.d;
        t0k0 t0k0Var = (t0k0) y8gVar.m.get();
        b bVar = (b) y8gVar.U0.get();
        f fVar = (f) y8gVar.z0.get();
        jwh a2 = gjzVar.a();
        q5z.h(a2);
        Application application = (Application) gjzVar.b.c;
        q5z.h(application);
        ru2 ru2Var = new ru2(st2Var, appVisibilitySubscriptionImpl, t0k0Var, bVar, fVar, a2, application, new d((ru.yandex.taxi.logistics.sdk.delivery.edit.b) y8gVar.D0.get(), (hwh) y8gVar.h0.get(), (st2) y8gVar.c.get()), new ru.yandex.logistics.cargo_form.async.impl.polling.b((ru.yandex.logistics.cargo_form.async.impl.storage.b) y8gVar.s.get(), (ru.yandex.logistics.cargo_form.async.impl.interactor.b) y8gVar.A1.get(), (st2) y8gVar.c.get()));
        o oVar = (o) kjzVar.b;
        int i2 = 7;
        xvf0 b2 = i5m.b(new nf(new cnt(new lcw(new kwf(ru2Var, 1), new kwf(ru2Var, 2), new kwf(ru2Var, 8), new kwf(ru2Var, i2), new kwf(ru2Var, 4), new kwf(ru2Var, 0), new kwf(ru2Var, 3), 6), 16), n3w.a(new qu2(new hzk((g) oVar.l.get(), (bdi) oVar.m.get()))), i2));
        xvf0 b3 = i5m.b(new kwf(ru2Var, 5));
        xvf0 b4 = i5m.b(new kwf(ru2Var, 6));
        ArrayList arrayList = new ArrayList(3);
        Object obj = b2.get();
        q5z.g(obj, "Set contributions cannot be null");
        arrayList.add(obj);
        Object obj2 = b3.get();
        q5z.g(obj2, "Set contributions cannot be null");
        arrayList.add(obj2);
        Object obj3 = b4.get();
        q5z.g(obj3, "Set contributions cannot be null");
        arrayList.add(obj3);
        ((Application) kjzVar.c).registerActivityLifecycleCallbacks(new AppLifecycleListenerCallbacks(arrayList.isEmpty() ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList))));
    }

    public static final zx01 O(sz40 sz40Var, String str, fid fidVar, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        boolean z = (((i2 & 14) ^ 6) > 4 && ((bts) fidVar).k(sz40Var)) || (i2 & 6) == 4;
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        Object obj = did.a;
        if (z || Q == obj) {
            i2t0 D = tje.D();
            tls e2 = D != null ? D.e() : null;
            i2t0 O = tje.O(D);
            try {
                Object zx01Var = new zx01(sz40Var, null, str);
                tje.W(D, O, e2);
                btsVar.o0(zx01Var);
                Q = zx01Var;
            } catch (Throwable th) {
                tje.W(D, O, e2);
                throw th;
            }
        }
        zx01 zx01Var2 = (zx01) Q;
        btsVar.e0(-1356604288);
        zx01Var2.a(sz40Var.c.getValue(), btsVar, 0);
        btsVar.t(false);
        boolean k = btsVar.k(zx01Var2);
        Object Q2 = btsVar.Q();
        if (k || Q2 == obj) {
            Q2 = new ate0(25, zx01Var2);
            btsVar.o0(Q2);
        }
        zpn.a(zx01Var2, (tls) Q2, btsVar);
        return zx01Var2;
    }

    public static final void P(Object obj, Continuation continuation) {
        if (!(continuation instanceof pyj)) {
            continuation.resumeWith(obj);
            return;
        }
        pyj pyjVar = (pyj) continuation;
        jse jseVar = pyjVar.w;
        ContinuationImpl continuationImpl = pyjVar.x;
        Throwable a2 = Result.a(obj);
        Object tzcVar = a2 == null ? obj : new tzc(a2, false);
        if (R(jseVar, continuationImpl.get_context())) {
            pyjVar.y = tzcVar;
            pyjVar.c = 1;
            Q(continuationImpl.get_context(), jseVar, pyjVar);
            return;
        }
        fgo a3 = byy0.a();
        if (a3.b >= 4294967296L) {
            pyjVar.y = tzcVar;
            pyjVar.c = 1;
            a3.T(pyjVar);
            return;
        }
        a3.U(true);
        try {
            l8x l8xVar = (l8x) continuationImpl.get_context().get(seu.C);
            if (l8xVar == null || l8xVar.isActive()) {
                Object obj2 = pyjVar.z;
                fse fseVar = continuationImpl.get_context();
                Object H = gwk0.H(fseVar, obj2);
                zx11 n0 = H != gwk0.d ? q5z.n0(continuationImpl, fseVar, H) : null;
                try {
                    continuationImpl.resumeWith(obj);
                } finally {
                    if (n0 == null || n0.o0()) {
                        gwk0.x(fseVar, H);
                    }
                }
            } else {
                pyjVar.resumeWith(new Result.Failure(l8xVar.I()));
            }
            while (a3.Z()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void Q(fse fseVar, jse jseVar, Runnable runnable) {
        try {
            jseVar.o(fseVar, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, jseVar, fseVar);
        }
    }

    public static final boolean R(jse jseVar, fse fseVar) {
        try {
            return jseVar.G(fseVar);
        } catch (Throwable th) {
            throw new DispatchException(th, jseVar, fseVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x005c, code lost:
    
        if (r7 != null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KSerializer S(kf5 kf5Var, mgx mgxVar, boolean z) {
        KSerializer kSerializer;
        KSerializer kSerializer2;
        KSerializer v5e0Var;
        lfx F = uh6.F(mgxVar);
        boolean b2 = mgxVar.b();
        List<ogx> g2 = mgxVar.g();
        ArrayList arrayList = new ArrayList(tcc.n(g2, 10));
        for (ogx ogxVar : g2) {
            mgx a2 = ogxVar.a();
            if (a2 == null) {
                vg10.r(ogxVar.a(), "Star projections in type arguments are not allowed, but had ");
                return null;
            }
            arrayList.add(a2);
        }
        boolean isEmpty = arrayList.isEmpty();
        List list = EmptyList.a;
        if (isEmpty) {
            if (!y5e.w(F) || kf5Var.b(F, list) == null) {
                kSerializer = !b2 ? ftq0.a.h(F) : ftq0.b.h(F);
                if (kSerializer == null) {
                    return kSerializer;
                }
                if (arrayList.isEmpty()) {
                    kSerializer2 = gtq0.K(F);
                    if (kSerializer2 == null && (kSerializer2 = kf5Var.b(F, list)) == null) {
                        if (y5e.w(F)) {
                            v5e0Var = new v5e0(F);
                            kSerializer2 = v5e0Var;
                        }
                        kSerializer2 = null;
                    }
                    if (kSerializer2 != null) {
                        return b2 ? qke.n(kSerializer2) : kSerializer2;
                    }
                } else {
                    ArrayList L = gtq0.L(kf5Var, arrayList, z);
                    if (L != null) {
                        KSerializer C = gtq0.C(F, L, new fyi(arrayList, 3));
                        if (C == null) {
                            kSerializer2 = kf5Var.b(F, L);
                            if (kSerializer2 == null) {
                                if (y5e.w(F)) {
                                    v5e0Var = new v5e0(F);
                                    kSerializer2 = v5e0Var;
                                }
                                kSerializer2 = null;
                            }
                        } else {
                            kSerializer2 = C;
                        }
                        if (kSerializer2 != null) {
                        }
                    }
                }
                return null;
            }
            kSerializer = null;
            if (kSerializer == null) {
            }
        } else {
            if (!kf5Var.a) {
                Object f2 = !b2 ? ftq0.c.f(F, arrayList) : ftq0.d.f(F, arrayList);
                if (f2 instanceof Result.Failure) {
                    f2 = null;
                }
                kSerializer = (KSerializer) f2;
                if (kSerializer == null) {
                }
            }
            kSerializer = null;
            if (kSerializer == null) {
            }
        }
    }

    public static final long X(long j, long j2, String str, long j3) {
        String str2;
        int i2 = t3x0.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long m = bvu0.m(10, str2);
        if (m == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = m.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        StringBuilder l = x4e.l("System property '", str, "' should be in range ", j2);
        x4e.A(j3, "..", ", but is '", l);
        l.append(longValue);
        l.append('\'');
        throw new IllegalStateException(l.toString().toString());
    }

    public static int Y(int i2, int i3, String str) {
        return (int) X(i2, 1L, str, (i3 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final String Z(String str) {
        Object obj;
        Iterator<E> it = SourceType.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((SourceType) obj).getSource(), str)) {
                break;
            }
        }
        SourceType sourceType = (SourceType) obj;
        switch (sourceType == null ? -1 : mrk0.a[sourceType.ordinal()]) {
            case -1:
            case 5:
            case 6:
            case 7:
                return str;
            case 0:
            default:
                w511.b();
                return null;
            case 1:
                return "output_verified";
            case 2:
                return "android_gps";
            case 3:
                return "android_network";
            case 4:
                return "android_fused";
        }
    }

    public static final ike a(fse fseVar) {
        if (fseVar.get(seu.C) == null) {
            fseVar = fseVar.plus(kotlinx.coroutines.a.a());
        }
        return new ike(fseVar);
    }

    public static final zx01 a0(Object obj, String str, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = new zx01(new sz40(obj), null, str);
            btsVar.o0(Q);
        }
        zx01 zx01Var = (zx01) Q;
        zx01Var.a(obj, btsVar, (i2 & 8) | 48 | (i2 & 14));
        Object Q2 = btsVar.Q();
        if (Q2 == o430Var) {
            Q2 = new jl01(20, zx01Var);
            btsVar.o0(Q2);
        }
        zpn.a(zx01Var, (tls) Q2, btsVar);
        return zx01Var;
    }

    public static final ike b() {
        qhw0 a2 = jl40.a();
        sjh sjhVar = uyj.a;
        return new ike(cvw.U(a2, o400.a));
    }

    public static final void b0(kotlinx.serialization.modules.a aVar) {
        aVar.g(qoi0.a(xf90.class), new xf90());
    }

    public static final r0 c(Object obj) {
        if (obj == null) {
            obj = vez0.b;
        }
        return new r0(obj);
    }

    public static final String c0(ArrayList arrayList) {
        Object obj;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((hvu) obj).a, "Content-Type", true)) {
                break;
            }
        }
        hvu hvuVar = (hvu) obj;
        if (hvuVar != null) {
            return hvuVar.b;
        }
        return null;
    }

    public static final void d(zx01 zx01Var, tx01 tx01Var, Object obj, Object obj2, qar qarVar, fid fidVar, int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(867041821);
        if ((i2 & 6) == 0) {
            i3 = (btsVar.k(zx01Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.k(tx01Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? btsVar.k(obj) : btsVar.e(obj) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= (i2 & 4096) == 0 ? btsVar.k(obj2) : btsVar.e(obj2) ? 2048 : 1024;
        }
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= (32768 & i2) == 0 ? btsVar.k(qarVar) : btsVar.e(qarVar) ? 16384 : 8192;
        }
        if (!btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            btsVar.Y();
        } else if (zx01Var.g()) {
            tx01Var.f(obj, obj2, qarVar);
        } else {
            tx01Var.g(obj2, qarVar);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mfe0(zx01Var, tx01Var, obj, obj2, qarVar, i2, 9);
        }
    }

    public static void d0(int i2, int i3) {
        String d2;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                d2 = fxa1.d("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    ny61.g(oyr.i(i3, "negative size: "));
                    return;
                }
                d2 = fxa1.d("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(d2);
        }
    }

    public static final void e(View view, Expression expression, jzv jzvVar, rvo rvoVar) {
        if (((Boolean) expression.a(rvoVar)).booleanValue()) {
            com.yandex.div.core.view2.divs.a.m(view, jzvVar);
            view.requestFocus();
        }
    }

    public static void e0(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? f0(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? f0(i3, i4, "end index") : fxa1.d("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(View view, List list, rvo rvoVar, tls tlsVar) {
        if ((view instanceof uvo) && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((uvo) view).addSubscription(((v3k) it.next()).b.c(rvoVar, tlsVar));
            }
        }
    }

    public static String f0(int i2, int i3, String str) {
        if (i2 < 0) {
            return fxa1.d("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return fxa1.d("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        ny61.g(oyr.i(i3, "negative size: "));
        return null;
    }

    public static final boolean g(AtomicInteger atomicInteger, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (i3 == 0) {
            return true;
        }
        if (i3 < -65535 || i3 > 65535 || i2 > 65535) {
            return false;
        }
        do {
            i4 = atomicInteger.get();
            if (i4 == -1) {
                return false;
            }
            if (i4 == 0) {
                i5 = i2;
            } else {
                if ((i4 & 65535) != i2) {
                    return false;
                }
                i5 = i4;
            }
            int i7 = ((i5 >>> 16) & 65535) + i3;
            if (i7 < 0 || i7 > 65535 || (i6 = (i7 << 16) | i2) == -1) {
                return false;
            }
        } while (!atomicInteger.compareAndSet(i4, i6));
        return true;
    }

    public static final boolean h(vg70 vg70Var, vg70 vg70Var2) {
        if (vg70Var == vg70Var2) {
            return true;
        }
        return jl40.l(vg70Var.a, vg70Var2.a) && vg70Var.b == vg70Var2.b;
    }

    public static final void i(tse tseVar, String str, Exception exc) {
        j(tseVar, uh6.b(str, exc));
    }

    public static final void j(tse tseVar, CancellationException cancellationException) {
        l8x l8xVar = (l8x) tseVar.getCoroutineContext().get(seu.C);
        if (l8xVar != null) {
            l8xVar.a(cancellationException);
        } else {
            yhl.d(tseVar, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final dfr k(String str, ExperimentApplyType experimentApplyType, boolean z) {
        return new dfr(str, Types.newParameterizedType(CommonExperiment.class, CommonFeatureFlag.class), new CommonExperiment(new CommonFeatureFlag(z), experimentApplyType));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r4 == 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final dqr0 l(tpr tprVar, int i2) {
        ci9.A1.getClass();
        int i3 = bi9.b;
        if (i2 >= i3) {
            i3 = i2;
        }
        int i4 = i3 - i2;
        if (tprVar instanceof kotlinx.coroutines.flow.internal.a) {
            kotlinx.coroutines.flow.internal.a aVar = (kotlinx.coroutines.flow.internal.a) tprVar;
            BufferOverflow bufferOverflow = aVar.c;
            tpr i5 = aVar.i();
            if (i5 != null) {
                int i6 = aVar.b;
                if (i6 != -3 && i6 != -2 && i6 != 0) {
                    i4 = i6;
                } else if (bufferOverflow != BufferOverflow.SUSPEND) {
                    if (i2 == 0) {
                        i4 = 1;
                    }
                    i4 = 0;
                }
                return new dqr0(i4, aVar.a, i5, bufferOverflow);
            }
        }
        return new dqr0(i4, EmptyCoroutineContext.a, tprVar, BufferOverflow.SUSPEND);
    }

    public static final y8g m() {
        y8g y8gVar;
        synchronized (g) {
            y8gVar = d;
            if (y8gVar == null) {
                y8gVar = null;
            }
        }
        return y8gVar;
    }

    public static final Object n(wls wlsVar, Continuation continuation) {
        fbp0 fbp0Var = new fbp0(continuation.get_context(), continuation);
        Object H = sb2.H(fbp0Var, true, fbp0Var, wlsVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return H;
    }

    public static final u7p o(sbx sbxVar, wg10 wg10Var) {
        return new u7p(wg10Var, new yo40(sbxVar));
    }

    public static EdgeEffect p(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? jkn.a(context, attributeSet) : new EdgeEffect(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r12.f != null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final m46 q(s36 s36Var, BlockedReason blockedReason, String str) {
        p36 p36Var;
        BlockedUserType blockedUserType;
        if (s36Var != null) {
            BlockedUserTypeDto blockedUserTypeDto = s36Var.a;
            int i2 = tv00.b[blockedReason.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                if (blockedUserTypeDto != null) {
                }
            }
            int i3 = blockedUserTypeDto == null ? -1 : tv00.a[blockedUserTypeDto.ordinal()];
            if (i3 == -1) {
                blockedUserType = BlockedUserType.PHONE;
            } else if (i3 == 1) {
                blockedUserType = BlockedUserType.ID;
            } else {
                if (i3 != 2) {
                    w511.b();
                    return null;
                }
                blockedUserType = BlockedUserType.PHONE;
            }
            p36Var = new p36(blockedUserType, s36Var.b, s36Var.c, s36Var.d, s36Var.e, s36Var.f);
            if (p36Var != null) {
                return null;
            }
            return new m46(p36Var, blockedReason, str);
        }
        p36Var = null;
        if (p36Var != null) {
        }
    }

    public static final ox01 r(zx01 zx01Var, gl11 gl11Var, String str, fid fidVar, int i2, int i3) {
        nx01 nx01Var;
        if ((i3 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean k = ((bts) fidVar).k(zx01Var);
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (k || Q == o430Var) {
            Q = new ox01(zx01Var, gl11Var, str);
            btsVar.o0(Q);
        }
        ox01 ox01Var = (ox01) Q;
        boolean k2 = btsVar.k(zx01Var) | btsVar.e(ox01Var);
        Object Q2 = btsVar.Q();
        if (k2 || Q2 == o430Var) {
            Q2 = new fgw0(4, zx01Var, ox01Var);
            btsVar.o0(Q2);
        }
        zpn.a(ox01Var, (tls) Q2, btsVar);
        if (zx01Var.g() && (nx01Var = (nx01) ox01Var.b.getValue()) != null) {
            zx01 zx01Var2 = ox01Var.c;
            nx01Var.a.f(nx01Var.c.invoke(zx01Var2.f().c()), nx01Var.c.invoke(zx01Var2.f().b()), (qar) nx01Var.b.invoke(zx01Var2.f()));
        }
        return ox01Var;
    }

    public static final tx01 s(zx01 zx01Var, Object obj, Object obj2, qar qarVar, gl11 gl11Var, fid fidVar, int i2) {
        boolean k = ((bts) fidVar).k(zx01Var);
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (k || Q == o430Var) {
            i2t0 D = tje.D();
            tls e2 = D != null ? D.e() : null;
            i2t0 O = tje.O(D);
            try {
                sj2 sj2Var = (sj2) gl11Var.a.invoke(obj2);
                sj2Var.d();
                tx01 tx01Var = new tx01(zx01Var, obj, sj2Var, gl11Var);
                tje.W(D, O, e2);
                btsVar.o0(tx01Var);
                Q = tx01Var;
            } catch (Throwable th) {
                tje.W(D, O, e2);
                throw th;
            }
        }
        tx01 tx01Var2 = (tx01) Q;
        d(zx01Var, tx01Var2, obj, obj2, qarVar, btsVar, 0);
        boolean k2 = btsVar.k(zx01Var) | btsVar.k(tx01Var2);
        Object Q2 = btsVar.Q();
        if (k2 || Q2 == o430Var) {
            Q2 = new dl01(11, zx01Var, tx01Var2);
            btsVar.o0(Q2);
        }
        zpn.a(tx01Var2, (tls) Q2, btsVar);
        return tx01Var2;
    }

    public static final void t(tse tseVar) {
        kotlinx.coroutines.a.k(tseVar.getCoroutineContext());
    }

    public static final y8g u() {
        y8g y8gVar;
        synchronized (g) {
            y8gVar = c;
            if (y8gVar == null) {
                y8gVar = null;
            }
        }
        return y8gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static Map v(LinkedHashMap linkedHashMap, Map map, Map map2) {
        if (map.isEmpty() && map2.isEmpty()) {
            return linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            List list = (List) map2.get(str);
            String str2 = 0;
            str2 = 0;
            str2 = 0;
            if ((value instanceof String) && list != null) {
                String str3 = (String) value;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((x2h) obj).b(str3)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    str2 = str3;
                    while (it.hasNext()) {
                        str2 = ((x2h) it.next()).a(str2);
                    }
                }
            }
            if (str2 == 0) {
                str2 = w(map, str, value);
            }
            linkedHashMap2.put(key, str2);
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Object w(Map map, String str, Object obj) {
        String obj2;
        String obj3;
        DeeplinkParamsFilter deeplinkParamsFilter = (DeeplinkParamsFilter) map.get(str.toLowerCase(Locale.ROOT));
        Uri uri = null;
        switch (deeplinkParamsFilter == null ? -1 : z42.a[deeplinkParamsFilter.ordinal()]) {
            case -1:
            case 6:
            case 7:
                return obj;
            case 0:
            default:
                w511.b();
                return null;
            case 1:
                return "*";
            case 2:
                if (obj != null && (obj2 = obj.toString()) != null) {
                    uri = Uri.parse(obj2);
                }
                if (uri != null && dta1.b(uri)) {
                    Uri.Builder clearQuery = uri.buildUpon().clearQuery();
                    Iterator<T> it = uri.getQueryParameterNames().iterator();
                    while (it.hasNext()) {
                        clearQuery.appendQueryParameter((String) it.next(), "*");
                    }
                    return clearQuery.build().toString();
                }
                return obj;
            case 3:
                if (obj != null && (obj3 = obj.toString()) != null) {
                    uri = Uri.parse(obj3);
                }
                if (uri != null && dta1.b(uri)) {
                    Uri.Builder clearQuery2 = uri.buildUpon().clearQuery();
                    for (String str2 : uri.getQueryParameterNames()) {
                        clearQuery2.appendQueryParameter(str2, String.valueOf(w(map, str2, uri.getQueryParameter(str2))));
                    }
                    return clearQuery2.build().toString();
                }
                return obj;
            case 4:
                return ssa1.b(String.valueOf(obj));
            case 5:
                if (obj instanceof Map) {
                    Map map2 = (Map) obj;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map2.size()));
                    for (Map.Entry entry : map2.entrySet()) {
                        linkedHashMap.put(entry.getKey(), w(map, String.valueOf(entry.getKey()), entry.getValue()));
                    }
                    return linkedHashMap;
                }
                LinkedHashMap c2 = dta1.c(String.valueOf(obj));
                if (c2 != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(c2.size()));
                    for (Map.Entry entry2 : c2.entrySet()) {
                        linkedHashMap2.put(entry2.getKey(), w(map, (String) entry2.getKey(), entry2.getValue()));
                    }
                    return linkedHashMap2;
                }
                return obj;
        }
    }

    public static final String x(p7j0 p7j0Var, s610 s610Var, oy2 oy2Var) {
        String str;
        List w0 = a.w0(s610Var.a);
        ArrayList arrayList = new ArrayList();
        Iterator it = w0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            List list = (List) p7j0Var.b.get(str2);
            String p = list != null ? g8e.p(str2, "-", a.X(list, "_", null, null, null, 62)) : null;
            if (p != null) {
                arrayList.add(p);
            }
        }
        List<String> w02 = a.w0(s610Var.b);
        ArrayList arrayList2 = new ArrayList();
        for (String str3 : w02) {
            String p2 = (oy2Var == null || (str = oy2Var.get(str3)) == null) ? null : g8e.p(str3, "-", str);
            if (p2 != null) {
                arrayList2.add(p2);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(evu0.Q("/", p7j0Var.a));
        sb.append(ShimmerDivHandler.NUMBER_SING);
        a.W(arrayList, sb, ";", null, HProv.PP_SAME_MEDIA);
        sb.append(ShimmerDivHandler.NUMBER_SING);
        a.W(arrayList2, sb, ";", null, HProv.PP_SAME_MEDIA);
        return sb.toString();
    }

    public static final tvo y(rvo rvoVar) {
        if (rvoVar instanceof tvo) {
            return (tvo) rvoVar;
        }
        return null;
    }

    public static float z(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return jkn.b(edgeEffect);
        }
        return 0.0f;
    }

    public abstract void B(int i2);

    public abstract boolean E();

    public abstract boolean F();

    public abstract void T(boolean z);

    public abstract void U(boolean z);

    public abstract void V();

    public abstract void W();
}
