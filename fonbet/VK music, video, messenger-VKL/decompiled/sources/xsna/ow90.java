package xsna;

import android.view.Choreographer;
import androidx.compose.runtime.a;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lifecycle.ProcessStateProvider;
import com.vk.metrics.performance.appstart.a;
import com.vk.metrics.performance.memory.LargeTransactionChecker;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PerformanceReporter.kt */
/* loaded from: classes.dex */
public final class ow90 {
    public static boolean d;
    public static final a f;
    public static final com.vk.metrics.performance.appstart.a g;
    public static final bpn0 h;
    public static final Set<wzs<Long, Throwable, s3q0>> i;
    public static LargeTransactionChecker j;
    public static rch0 k;
    public static qa30 l;
    public static ab3 m;
    public static final bpn0 n;
    public static ProcessStateProvider o;
    public static final int p;
    public static final ow90 a = new ow90();
    public static final ArrayList<aw90> b = new ArrayList<>();
    public static final bpn0 c = new bpn0(new zg9(10));
    public static final dx90 e = new dx90();

    /* compiled from: PerformanceReporter.kt */
    public static final class a {
        public final AtomicLong a = new AtomicLong(0);
        public final AtomicLong b = new AtomicLong(0);
        public final AtomicLong c = new AtomicLong(0);
        public final AtomicBoolean d = new AtomicBoolean(false);
    }

    static {
        a aVar = new a();
        f = aVar;
        com.vk.metrics.performance.appstart.a aVar2 = new com.vk.metrics.performance.appstart.a(new b63(10), new wgd0(), new v0f(6));
        com.vk.metrics.performance.appstart.b bVar = new com.vk.metrics.performance.appstart.b(new ArrayList());
        CopyOnWriteArrayList<a.InterfaceC1278a> copyOnWriteArrayList = aVar2.d;
        copyOnWriteArrayList.add(bVar);
        copyOnWriteArrayList.add(new com.vk.metrics.performance.appstart.c(aVar));
        g = aVar2;
        h = new bpn0(new u35(10));
        i = Collections.synchronizedSet(new LinkedHashSet());
        n = new bpn0(new w0f(8));
        p = 8;
    }

    public static void b(long j2) {
        p pVar = (p) h.getValue();
        pVar.a = false;
        pVar.b = j2;
        pVar.c = j2 != 0;
        Iterator<aw90> it = b.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public static void c(ScrollScreenType scrollScreenType, RecyclerView recyclerView) {
        rch0 rch0Var = k;
        if (rch0Var == null) {
            rch0Var = new rch0(Choreographer.getInstance(), e);
            k = rch0Var;
        }
        rch0Var.a(scrollScreenType, recyclerView);
    }

    public final void a(xvy xvyVar, ScrollScreenType scrollScreenType, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(1634196551);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1634196551, i2, -1, "com.vk.metrics.reporters.PerformanceReporter.StartComposeScrollPerformanceTracking (PerformanceReporter.kt:188)");
        }
        boolean J = M.J(e);
        Object x = M.x();
        if (J || x == a.C0011a.a) {
            kgh0 kgh0Var = new kgh0(dx90.V, new nrb(3), new z9g(7), new nw90());
            M.R(kgh0Var);
            x = kgh0Var;
        }
        qch0.a(xvyVar, scrollScreenType, (kgh0) x, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new xv9(i2, 4, this, xvyVar, scrollScreenType));
        }
    }
}
