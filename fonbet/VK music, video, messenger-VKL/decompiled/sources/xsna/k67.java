package xsna;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.biometrics.lock.impl.service.HidePushContentService;
import com.vk.toggle.features.CoreFeatures;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.anj;
import xsna.b25;
import xsna.ug5;

/* compiled from: BiometricsLockInteractorImpl.kt */
/* loaded from: classes.dex */
public final class k67 implements v57 {
    public final Context b;
    public final b87 c;
    public final p97 d;
    public boolean e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public io.reactivex.rxjava3.disposables.c j;
    public final io.reactivex.rxjava3.subjects.d<Boolean> k;
    public final io.reactivex.rxjava3.disposables.b l;
    public final n67 m;
    public final Object n;
    public final Object o;
    public final b p;
    public final io.reactivex.rxjava3.disposables.c q;
    public final io.reactivex.rxjava3.disposables.c r;
    public final io.reactivex.rxjava3.internal.operators.single.b s;
    public final ArrayList t;

    /* compiled from: BiometricsLockInteractorImpl.kt */
    public static final class a extends t57 {
        public a() {
        }

        @Override // xsna.t57
        public final void a(xk xkVar) {
            k67 k67Var = k67.this;
            if (k67Var.e && !epx.f(k67Var.m.b().P0(), Boolean.FALSE)) {
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                CoreFeatures coreFeatures = CoreFeatures.NAVIGATION_WAIT_BIOMETRICS;
                coreFeatures.getClass();
                if (com.vk.toggle.b.A.a(coreFeatures)) {
                    synchronized (k67Var.t) {
                        k67Var.t.add(xkVar);
                    }
                    return;
                }
            }
            xkVar.invoke();
        }
    }

    /* compiled from: BiometricsLockInteractorImpl.kt */
    public static final class b implements b25.a {
        @Override // xsna.b25.a
        public final void d(tbu0 tbu0Var) {
            long j = tbu0Var.a.a().b;
        }
    }

    public k67(Context context, b87 b87Var, p97 p97Var) {
        this.b = context;
        this.c = b87Var;
        this.d = p97Var;
        this.e = p97Var.a();
        this.f = p97Var.h();
        this.g = p97Var.g();
        this.h = p97Var.m();
        this.i = p97Var.d();
        o25.a().c().getClass();
        this.k = io.reactivex.rxjava3.subjects.d.O0(Boolean.TRUE);
        this.l = new io.reactivex.rxjava3.disposables.b();
        n67 b2 = r57.b();
        this.m = b2;
        g67 g67Var = new g67(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.n = msy.a(lazyThreadSafetyMode, g67Var);
        this.o = msy.a(lazyThreadSafetyMode, new zf6(this, 1));
        this.p = new b();
        io.reactivex.rxjava3.internal.operators.observable.c0 c0Var = new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.h67
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o25.a().b0(k67.this.p);
                return s3q0.a;
            }
        }), io.reactivex.rxjava3.internal.functions.a.d, new io.reactivex.rxjava3.functions.a() { // from class: xsna.i67
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                o25.a().B(k67.this.p);
            }
        });
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.disposables.c subscribe = c0Var.r0(asu0Var.c()).subscribe();
        ver0.c(context, subscribe);
        this.q = subscribe;
        io.reactivex.rxjava3.internal.operators.observable.l2 r0 = new io.reactivex.rxjava3.internal.operators.observable.y(b2.a(), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(asu0Var.c()).r0(asu0Var.c());
        z33 z33Var = new z33(new j67(this, 0), 1);
        new a43(1);
        io.reactivex.rxjava3.disposables.c subscribe2 = r0.subscribe(z33Var, new x57());
        ver0.c(context, subscribe2);
        this.r = subscribe2;
        this.s = new io.reactivex.rxjava3.internal.operators.single.b(new y57());
        this.t = new ArrayList();
        t57 t57Var = s57.a;
        s57.a = new a();
    }

    @Override // xsna.v57
    public final boolean a() {
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.v57
    public final void b() {
        if (!this.k.P0().booleanValue()) {
            final long currentTimeMillis = System.currentTimeMillis();
            asu0.a.getClass();
            asu0.n().execute(new Runnable() { // from class: xsna.w57
                @Override // java.lang.Runnable
                public final void run() {
                    k67.this.d.l(currentTimeMillis);
                }
            });
            this.g = currentTimeMillis;
        }
        ((geh0) this.n.getValue()).e.e();
        this.l.e();
    }

    @Override // xsna.v57
    public final void c(boolean z) {
        if (!z) {
            this.g = System.currentTimeMillis();
        }
        this.m.b().onNext(Boolean.valueOf(z));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.v57
    public final void d() {
        if (this.i) {
            ?? r0 = this.o;
            ehe0 ehe0Var = (ehe0) r0.getValue();
            ehe0Var.getClass();
            ((xsl) uh.b.b()).c("HidePushContentJob");
            Context context = ehe0Var.a;
            Intent intent = new Intent(context, (Class<?>) HidePushContentService.class);
            intent.putExtra("DELAY_IN_MS_KEY", ehe0Var.b.a());
            context.stopService(intent);
            if (((NotificationManager) this.b.getSystemService("notification")).getActiveNotifications().length == 0) {
                return;
            }
            ehe0 ehe0Var2 = (ehe0) r0.getValue();
            Context context2 = ehe0Var2.a;
            ug5 ug5Var = ehe0Var2.b;
            if (epx.f(ug5Var, ug5.b.b)) {
                r57.b().d(context2);
                return;
            }
            if (!epx.f(ug5Var, ug5.c.b) && !epx.f(ug5Var, ug5.a.b)) {
                if (!epx.f(ug5Var, ug5.d.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ehe0.a(ehe0Var2.b.a());
                return;
            }
            try {
                Intent intent2 = new Intent(ehe0Var2.a, (Class<?>) HidePushContentService.class);
                intent2.putExtra("DELAY_IN_MS_KEY", ehe0Var2.b.a());
                anj.a.b(context2, intent2);
            } catch (IllegalStateException e) {
                if (!gz80.a(31) || !ugj.f(e)) {
                    throw e;
                }
                ehe0.a(ehe0Var2.b.a());
            }
        }
    }

    @Override // xsna.v57
    public final io.reactivex.rxjava3.core.q<Boolean> e() {
        return this.k;
    }

    @Override // xsna.v57
    public final void f(String str, gzs<s3q0> gzsVar) {
        if (str == null) {
            str = UUID.randomUUID().toString();
        }
        n67 n67Var = this.m;
        LinkedHashMap<String, gzs<s3q0>> linkedHashMap = n67Var.b;
        ReentrantReadWriteLock reentrantReadWriteLock = n67Var.a;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            linkedHashMap.remove(str);
            linkedHashMap.put(str, gzsVar);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @Override // xsna.v57
    public final boolean g() {
        return this.i && epx.f(this.m.b().P0(), Boolean.TRUE) && k();
    }

    @Override // xsna.v57
    public final boolean h() {
        return this.i;
    }

    @Override // xsna.v57
    public final void i() {
        io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(this.m.b(), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
        asu0 asu0Var = asu0.a;
        this.l.b(yVar.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new d67(new c67(this, 0), 0), new f67()));
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void j(boolean z) {
        c63 c63Var = c63.a;
        Activity b2 = c63.b();
        if ((b2 instanceof AppCompatActivity) && z) {
            geh0 geh0Var = (geh0) this.n.getValue();
            geh0Var.e.e();
            if (((Boolean) geh0Var.b.invoke()).booleanValue()) {
                io.reactivex.rxjava3.disposables.c subscribe = ((zdh0) geh0Var.d.getValue()).c().a0(asu0.a.d()).subscribe(new d120(new wug0(geh0Var, 2), 12));
                geh0Var.e.b(subscribe);
                ver0.c(geh0Var.a, subscribe);
            }
            i0q0.f(new a67((AppCompatActivity) b2, 0));
        }
    }

    public final boolean k() {
        return this.g == -1 || System.currentTimeMillis() - this.g >= this.f;
    }
}
