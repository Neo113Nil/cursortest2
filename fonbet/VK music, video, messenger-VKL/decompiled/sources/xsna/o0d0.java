package xsna;

import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.PropertyReference0Impl;
import xsna.p0d0;
import xsna.ppy;

/* compiled from: PreinflateTaskLogic.kt */
/* loaded from: classes11.dex */
public final class o0d0 extends ParallelTaskRunner.d {
    public final ExecutorService c;

    /* compiled from: PreinflateTaskLogic.kt */
    public static final /* synthetic */ class a extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((p0d0) this.receiver).a();
        }
    }

    public o0d0(Application application, ExecutorService executorService) {
        super(application);
        this.c = executorService;
    }

    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "PreinflateTaskLogic";
    }

    public final void c() {
        Application application = this.b;
        ExecutorService executorService = this.c;
        bpn0 bpn0Var = new bpn0(new a(p0d0.a.a, p0d0.class, "requests", "getRequests()Ljava/util/List;", 0));
        rgd0.a.getClass();
        if (rgd0.b(application)) {
            ppy.a<Integer, ppy.b> aVar = ppy.a;
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            int i = 0;
            ppy.d = (context.getResources().getConfiguration().uiMode & 48) == 32;
            c63 c63Var = c63.a;
            c63.a(new rpy());
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) bpn0Var.getValue()).iterator();
            while (it.hasNext()) {
                arrayList.add((bxc0) it.next());
            }
            ppy.a<Integer, ppy.b> aVar2 = ppy.a;
            dhr0.a.getClass();
            Context E = dhr0.E();
            ViewConfiguration.get(E);
            asu0.a.getClass();
            io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
            io.reactivex.rxjava3.internal.schedulers.d dVar = new io.reactivex.rxjava3.internal.schedulers.d(executorService, true);
            io.reactivex.rxjava3.internal.operators.observable.m1 a0 = io.reactivex.rxjava3.core.q.T(arrayList).a0(io.reactivex.rxjava3.android.schedulers.a.b());
            final epy epyVar = new epy(0);
            ppy.b = new io.reactivex.rxjava3.internal.operators.observable.o0(a0.L(new io.reactivex.rxjava3.functions.l() { // from class: xsna.hpy
                @Override // io.reactivex.rxjava3.functions.l
                public final Object apply(Object obj) {
                    return (io.reactivex.rxjava3.core.t) epy.this.invoke(obj);
                }
            }, false).U(new jpy(new ipy(E, 0))), new lpy(new kpy(dVar, 0), i)).subscribe(new npy(), new opy(new m3w(2), 0));
        }
    }

    @Override // xsna.gzs
    public final /* bridge */ /* synthetic */ s3q0 invoke() {
        c();
        return s3q0.a;
    }
}
