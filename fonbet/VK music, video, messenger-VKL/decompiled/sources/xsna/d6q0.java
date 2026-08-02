package xsna;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.network.kbh.ShowModalDecision;
import com.vk.network.kbh.state.NetworkState;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bxi;
import xsna.n6q0;

/* compiled from: UnstableNetworkDetector.kt */
/* loaded from: classes3.dex */
public final class d6q0 {
    public static bxi b;
    public static bwz g;
    public static q1p0 h;
    public static k6q0 i;
    public static WeakReference<AppCompatActivity> m;
    public static nhp0 n;
    public static nhp0 o;
    public static volatile Boolean p;
    public static volatile boolean q;
    public static volatile boolean r;
    public static volatile d s;
    public static final d6q0 a = new d6q0();
    public static final mti c = new mti();
    public static final CopyOnWriteArrayList<ny1> d = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<ny20> e = new CopyOnWriteArrayList<>();
    public static final ArrayList f = new ArrayList();
    public static final Handler j = new Handler(Looper.getMainLooper());
    public static final ConcurrentHashMap.KeySetView<String, Boolean> k = ConcurrentHashMap.newKeySet();
    public static final ConcurrentHashMap.KeySetView<String, Boolean> l = ConcurrentHashMap.newKeySet();
    public static volatile NetworkState t = NetworkState.UNKNOWN;
    public static final b u = new b();

    /* compiled from: UnstableNetworkDetector.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShowModalDecision.values().length];
            try {
                iArr[ShowModalDecision.SKIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShowModalDecision.SHOW_DISMISSABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShowModalDecision.SHOW_BLOCKING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShowModalDecision.SHOW_OR_RECREATE_BLOCKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: UnstableNetworkDetector.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            d6q0 d6q0Var = (d6q0) this.receiver;
            d6q0 d6q0Var2 = d6q0.a;
            d6q0Var.i();
            return s3q0.a;
        }
    }

    /* compiled from: UnstableNetworkDetector.kt */
    public static final class d implements Runnable {
        public final /* synthetic */ wbq b;

        public d(wbq wbqVar) {
            this.b = wbqVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object failure;
            f370 f370Var;
            f370 f370Var2;
            if (!d6q0.q || !epx.f(d6q0.p, Boolean.TRUE)) {
                d6q0 d6q0Var = d6q0.a;
                d6q0.s = null;
                return;
            }
            try {
                failure = Boolean.valueOf(this.b.run());
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                d6q0.a.getClass();
                bxi bxiVar = d6q0.b;
                if (bxiVar != null && (f370Var2 = bxiVar.h) != null) {
                    f370Var2.n(a);
                }
            }
            Boolean bool = Boolean.FALSE;
            if (failure instanceof Result.Failure) {
                failure = bool;
            }
            final boolean booleanValue = ((Boolean) failure).booleanValue();
            if (!d6q0.q || !epx.f(d6q0.p, Boolean.TRUE)) {
                d6q0 d6q0Var2 = d6q0.a;
                d6q0.s = null;
                return;
            }
            d6q0.a.getClass();
            Iterator<ny1> it = d6q0.d.iterator();
            while (it.hasNext()) {
                it.next().a(booleanValue);
            }
            d6q0 d6q0Var3 = d6q0.a;
            d6q0Var3.getClass();
            bxi bxiVar2 = d6q0.b;
            if (bxiVar2 != null && !bxiVar2.s) {
                d6q0.c.a(booleanValue);
            }
            bxi bxiVar3 = d6q0.b;
            if (bxiVar3 != null && (f370Var = bxiVar3.h) != null) {
                f370Var.b(new gzs() { // from class: xsna.e6q0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        return zhy0.a("UnstableNetworkDetector: remote check result is ", booleanValue);
                    }
                });
            }
            d6q0.m(booleanValue ? NetworkState.UNSTABLE : NetworkState.STABLE);
            d6q0Var3.n();
            d6q0.s = null;
        }
    }

    public static final void a(b8u0 b8u0Var) {
        d.add(b8u0Var);
    }

    public static final void b(j6q0 j6q0Var) {
        mti mtiVar = c;
        synchronized (mtiVar) {
            mtiVar.b.add(j6q0Var);
        }
    }

    public static final void c(q560 q560Var) {
        f.add(q560Var);
        q560Var.a(t);
    }

    public static void d() {
        if (r) {
            r8l0 r8l0Var = new r8l0(2);
            if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
                r8l0Var.run();
            } else {
                j.post(r8l0Var);
            }
        }
    }

    public static final void e(bxi bxiVar, nhp0 nhp0Var, AppCompatActivity appCompatActivity) {
        Application application;
        if (r) {
            return;
        }
        b = bxiVar;
        g6q0 g6q0Var = bxiVar.n;
        if (g6q0Var != null) {
            e.add(g6q0Var);
        }
        ConcurrentHashMap.KeySetView<String, Boolean> keySetView = k;
        LinkedHashSet linkedHashSet = bxiVar.j;
        ArrayList arrayList = new ArrayList(c5g.u(linkedHashSet, 10));
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).toLowerCase(Locale.ROOT));
        }
        keySetView.addAll(arrayList);
        ConcurrentHashMap.KeySetView<String, Boolean> keySetView2 = l;
        Set<String> set = bxiVar.k;
        ArrayList arrayList2 = new ArrayList(c5g.u(set, 10));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((String) it2.next()).toLowerCase(Locale.ROOT));
        }
        keySetView2.addAll(arrayList2);
        t = NetworkState.UNKNOWN;
        m = null;
        o = null;
        p = null;
        q = false;
        whl whlVar = new whl(bxiVar.a, bxiVar.h, bxiVar.t ? new c(0, a, d6q0.class, "runCheck", "runCheck()V", 0) : null, bxiVar.u);
        whlVar.i = new mq2(12);
        g = whlVar;
        h = bxiVar.c;
        m = appCompatActivity != null ? new WeakReference<>(appCompatActivity) : null;
        j(nhp0Var);
        r = true;
        if (bxiVar.b) {
            synchronized (d6q0.class) {
                try {
                    if (!q && r) {
                        bxi bxiVar2 = b;
                        if (bxiVar2 != null && bxiVar2.h != null) {
                            L l2 = L.a;
                            l2.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l2, L.LogType.i, new Object[]{"UnstableNetworkDetectorLogger", "UnstableNetworkDetector: started"});
                            }
                        }
                        q = true;
                        a.getClass();
                        bxi bxiVar3 = b;
                        if (bxiVar3 != null && (application = bxiVar3.a) != null) {
                            application.registerActivityLifecycleCallbacks(u);
                        }
                        bwz bwzVar = g;
                        if (bwzVar != null) {
                            bwzVar.start();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public static final void f(j6q0 j6q0Var) {
        mti mtiVar = c;
        synchronized (mtiVar) {
            mtiVar.b.remove(j6q0Var);
        }
    }

    public static final void g(q560 q560Var) {
        f.remove(q560Var);
    }

    public static ShowModalDecision h(NetworkState networkState) {
        jcw jcwVar;
        ShowModalDecision showModalDecision;
        LinkedHashSet linkedHashSet;
        nhp0 nhp0Var = n;
        String str = nhp0Var != null ? nhp0Var.a : null;
        if (networkState == NetworkState.UNKNOWN || networkState == NetworkState.STABLE) {
            return ShowModalDecision.SKIP;
        }
        ShowModalDecision showModalDecision2 = str == null ? ShowModalDecision.SKIP : l.contains(str) ? ShowModalDecision.SHOW_BLOCKING : k.contains(str) ? ShowModalDecision.SKIP : ShowModalDecision.SHOW_BLOCKING;
        bxi bxiVar = b;
        if (bxiVar != null && (jcwVar = bxiVar.m) != null) {
            nhp0 nhp0Var2 = o;
            nhp0 nhp0Var3 = n;
            f6q0 f6q0Var = (f6q0) jcwVar.b;
            Object obj = nhp0Var3 != null ? nhp0Var3.b : null;
            boolean z = obj instanceof ip20;
            if (z && f6q0Var.e.contains(Long.valueOf(((ip20) obj).a)) && networkState == NetworkState.UNSTABLE) {
                showModalDecision = ShowModalDecision.SHOW_BLOCKING;
            } else {
                if (z) {
                    SetBuilder setBuilder = new SetBuilder();
                    setBuilder.addAll(f6q0Var.d);
                    setBuilder.addAll(f870.F(qex0.a.b()));
                    if (setBuilder.d().contains(Long.valueOf(((ip20) obj).a))) {
                        showModalDecision = ShowModalDecision.SKIP;
                    }
                }
                String str2 = nhp0Var2 != null ? nhp0Var2.a : null;
                Locale locale = Locale.ROOT;
                if (epx.f(str2, "CLIPS_AUDIO_PICKER".toLowerCase(locale))) {
                    if (epx.f(nhp0Var3 != null ? nhp0Var3.a : null, "CATALOG".toLowerCase(locale))) {
                        showModalDecision = ShowModalDecision.SKIP;
                    }
                }
                if (epx.f(nhp0Var2 != null ? nhp0Var2.a : null, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.SPRINGBOARD)) && ((linkedHashSet = ol40.b) == null || !linkedHashSet.isEmpty())) {
                    Iterator it = linkedHashSet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (com.vk.stat.scheme.t0.a((MobileOfficialAppsCoreNavStat$EventScreen) it.next()).equals(nhp0Var3 != null ? nhp0Var3.a : null)) {
                            if (showModalDecision2 == ShowModalDecision.SHOW_BLOCKING) {
                                showModalDecision = ShowModalDecision.SHOW_OR_RECREATE_BLOCKING;
                            }
                        }
                    }
                }
                showModalDecision = showModalDecision2;
            }
            if (showModalDecision != null) {
                return showModalDecision;
            }
        }
        return showModalDecision2;
    }

    public static final synchronized void j(nhp0 nhp0Var) {
        f370 f370Var;
        synchronized (d6q0.class) {
            try {
                if (epx.f(n, nhp0Var)) {
                    return;
                }
                nhp0 nhp0Var2 = n;
                o = nhp0Var2;
                n = nhp0Var;
                bxi bxiVar = b;
                if (bxiVar != null && (f370Var = bxiVar.h) != null) {
                    f370Var.b(new com.vk.movika.sdk.base.ui.r(22, nhp0Var, nhp0Var2));
                }
                a.n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void k() {
        l(false, false);
    }

    public static void l(final boolean z, final boolean z2) {
        if (r) {
            Runnable runnable = new Runnable() { // from class: xsna.a6q0
                @Override // java.lang.Runnable
                public final void run() {
                    bxi bxiVar;
                    bxi.a aVar;
                    pxv pxvVar;
                    pxv pxvVar2;
                    f370 f370Var;
                    yo20 yo20Var;
                    bxi bxiVar2;
                    boolean z3 = z;
                    boolean z4 = z2;
                    if (d6q0.q) {
                        final boolean z5 = true;
                        boolean z6 = false;
                        if (!z3 && ((bxiVar2 = d6q0.b) == null || !bxiVar2.r)) {
                            z5 = false;
                        }
                        WeakReference<AppCompatActivity> weakReference = d6q0.m;
                        k6q0 k6q0Var = null;
                        AppCompatActivity appCompatActivity = weakReference != null ? weakReference.get() : null;
                        nhp0 nhp0Var = d6q0.n;
                        if (appCompatActivity == null || appCompatActivity.isFinishing() || appCompatActivity.isDestroyed() || nhp0Var == null) {
                            return;
                        }
                        bxi bxiVar3 = d6q0.b;
                        if (bxiVar3 != null && (yo20Var = bxiVar3.e) != null) {
                            k6q0Var = (k6q0) yo20Var.invoke(nhp0Var);
                        }
                        if (!epx.f(d6q0.i, k6q0Var)) {
                            k6q0 k6q0Var2 = d6q0.i;
                            if (k6q0Var2 != null) {
                                k6q0Var2.hide();
                            }
                            d6q0.i = k6q0Var;
                        }
                        bxi bxiVar4 = d6q0.b;
                        if (bxiVar4 != null && (f370Var = bxiVar4.h) != null) {
                            f370Var.b(new gzs() { // from class: xsna.b6q0
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    return "UnstableNetworkDetector: showing modal (dismissable " + z5 + ')';
                                }
                            });
                        }
                        d6q0.a.getClass();
                        ((InputMethodManager) appCompatActivity.getSystemService("input_method")).hideSoftInputFromWindow(appCompatActivity.getWindow().getDecorView().getWindowToken(), 0);
                        if (k6q0Var != null) {
                            if (z4) {
                                k6q0Var.hide();
                            }
                            bxi bxiVar5 = d6q0.b;
                            if (bxiVar5 != null && (pxvVar2 = bxiVar5.g) != null) {
                                z6 = ((Boolean) pxvVar2.invoke()).booleanValue();
                            }
                            k6q0Var.a(appCompatActivity, z5, z6);
                            return;
                        }
                        if (z4) {
                            wil.a.getClass();
                            wil.a();
                        }
                        wil wilVar = wil.a;
                        bxi bxiVar6 = d6q0.b;
                        if (bxiVar6 != null && (pxvVar = bxiVar6.g) != null) {
                            z6 = ((Boolean) pxvVar.invoke()).booleanValue();
                        }
                        wilVar.getClass();
                        if (wil.b != null && !z5 && epx.f(wil.c, Boolean.TRUE)) {
                            wil.a();
                        }
                        if (wil.b != null || (bxiVar = d6q0.b) == null || (aVar = bxiVar.f) == null) {
                            return;
                        }
                        n6q0.a aVar2 = new n6q0.a();
                        aVar2.a = aVar.b;
                        aVar2.g = z6;
                        bxi.a.C2631a c2631a = aVar.d;
                        String str = c2631a.a;
                        if (str != null && c2631a.b != null) {
                            g4 g4Var = new g4(11, c2631a, appCompatActivity);
                            aVar2.b = str;
                            aVar2.c = g4Var;
                        }
                        bxi.a.C2631a c2631a2 = aVar.e;
                        String str2 = c2631a2.a;
                        if (str2 != null && c2631a2.b != null) {
                            h4 h4Var = new h4(7, c2631a2, appCompatActivity);
                            aVar2.d = str2;
                            aVar2.e = h4Var;
                        }
                        if (z5) {
                            aVar2.f = new com.vk.movika.tools.controls.seekbar.n(16);
                        }
                        appCompatActivity.getOnBackPressedDispatcher().a(appCompatActivity, new vil(z5));
                        Iterator<ny20> it = d6q0.e.iterator();
                        while (it.hasNext()) {
                            ny20 next = it.next();
                            d6q0.a.getClass();
                            next.a(d6q0.n, appCompatActivity, aVar2);
                        }
                        wil.c = Boolean.valueOf(z5);
                        wil.b = aVar2.f(appCompatActivity);
                        d6q0.a.getClass();
                        Iterator<ny1> it2 = d6q0.d.iterator();
                        while (it2.hasNext()) {
                            it2.next().c();
                        }
                        d6q0.a.getClass();
                        bxi bxiVar7 = d6q0.b;
                        if (bxiVar7 == null || bxiVar7.s) {
                            return;
                        }
                        d6q0.c.c();
                    }
                }
            };
            if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
                runnable.run();
            } else {
                j.post(runnable);
            }
        }
    }

    public static void m(NetworkState networkState) {
        if (r) {
            q1p0 q1p0Var = h;
            boolean z = false;
            if (q1p0Var != null && q1p0Var.a()) {
                z = true;
            }
            Iterator<ny1> it = d.iterator();
            while (it.hasNext()) {
                it.next().f(networkState, z);
            }
            bxi bxiVar = b;
            if ((bxiVar == null || !bxiVar.s) && t != networkState) {
                t = networkState;
                Iterator it2 = f.iterator();
                while (it2.hasNext()) {
                    ((q560) it2.next()).a(networkState);
                }
            }
        }
    }

    public final synchronized void i() {
        bxi bxiVar;
        Executor executor;
        try {
            if (r) {
                if (q && epx.f(p, Boolean.TRUE) && s == null) {
                    q1p0 q1p0Var = h;
                    if (q1p0Var != null && ((bxiVar = b) == null || !bxiVar.q)) {
                        s = new d(q1p0Var);
                        bxi bxiVar2 = b;
                        if (bxiVar2 != null && (executor = bxiVar2.d) != null) {
                            executor.execute(s);
                        }
                        return;
                    }
                    m(NetworkState.UNSTABLE);
                    n();
                }
            }
        } finally {
        }
    }

    public final synchronized void n() {
        f370 f370Var;
        if (r) {
            bxi bxiVar = b;
            if (bxiVar == null || !bxiVar.s) {
                ShowModalDecision h2 = h(t);
                bxi bxiVar2 = b;
                if (bxiVar2 != null && (f370Var = bxiVar2.h) != null) {
                    f370Var.b(new p1d0(h2, 25));
                }
                int i2 = a.$EnumSwitchMapping$0[h2.ordinal()];
                if (i2 == 1) {
                    d();
                } else if (i2 == 2) {
                    l(true, false);
                } else if (i2 == 3) {
                    l(false, false);
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l(false, true);
                }
            }
        }
    }

    /* compiled from: UnstableNetworkDetector.kt */
    public static final class b implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            d6q0.a.getClass();
            WeakReference<AppCompatActivity> weakReference = d6q0.m;
            if (epx.f(weakReference != null ? weakReference.get() : null, activity)) {
                d6q0.d();
                d6q0.m = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            bwz bwzVar;
            AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
            if (appCompatActivity != null) {
                d6q0 d6q0Var = d6q0.a;
                d6q0Var.getClass();
                WeakReference<AppCompatActivity> weakReference = d6q0.m;
                if (!epx.f(weakReference != null ? weakReference.get() : null, activity)) {
                    d6q0.d();
                    d6q0.m = new WeakReference<>(appCompatActivity);
                    d6q0Var.n();
                }
                bxi bxiVar = d6q0.b;
                if (bxiVar != null && bxiVar.l && d6q0.q && d6q0.r && (bwzVar = d6q0.g) != null) {
                    bwzVar.a(true);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
