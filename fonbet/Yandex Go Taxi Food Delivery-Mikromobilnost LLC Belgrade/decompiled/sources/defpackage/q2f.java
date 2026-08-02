package defpackage;

import android.util.Log;
import com.google.firebase.crashlytics.internal.settings.a;
import java.util.concurrent.Callable;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class q2f implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ a w;
    public final /* synthetic */ com.google.firebase.crashlytics.internal.common.a x;

    public q2f(com.google.firebase.crashlytics.internal.common.a aVar, long j, Throwable th, Thread thread, a aVar2) {
        this.x = aVar;
        this.a = j;
        this.b = th;
        this.c = thread;
        this.w = aVar2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long j = this.a;
        long j2 = j / 1000;
        com.google.firebase.crashlytics.internal.common.a aVar = this.x;
        String f = aVar.f();
        if (f == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return udq0.p(null);
        }
        aVar.c.o();
        u0r0 u0r0Var = aVar.m;
        u0r0Var.getClass();
        Log.isLoggable("FirebaseCrashlytics", 2);
        u0r0Var.f(this.b, this.c, "crash", new pgo(f, j2, b.f()), true);
        aVar.d(j);
        a aVar2 = this.w;
        aVar.b(false, aVar2, false);
        aVar.c(new f87().a, Boolean.FALSE);
        return !aVar.b.c() ? udq0.p(null) : ((atx0) aVar2.i.get()).a.q(aVar.e.a, new sae(this, f));
    }
}
