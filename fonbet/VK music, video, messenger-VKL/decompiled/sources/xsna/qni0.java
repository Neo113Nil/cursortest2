package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.uni0;

/* compiled from: ServerClock.kt */
/* loaded from: classes11.dex */
public final class qni0 {
    public static SharedPreferences f;
    public static gsv0 g;
    public static volatile long h;
    public static long i;
    public static volatile Future<?> j;
    public static volatile io.reactivex.rxjava3.disposables.c k;
    public static dr6 l;
    public static wzs<? super Long, ? super Long, s3q0> n;
    public static io.reactivex.rxjava3.internal.operators.observable.j1 p;
    public static s7r0 q;
    public static ro r;
    public static volatile boolean s;
    public static final qni0 a = new qni0();
    public static final pni0 b = new pni0(0);
    public static final long c = 21600000;
    public static final int d = 3;
    public static final long e = 1000;
    public static long m = System.currentTimeMillis();
    public static gzs<Boolean> o = new dr6(13);

    public static final long a() {
        return System.currentTimeMillis() - h;
    }

    public static final long b() {
        return a() / 1000;
    }

    public static SharedPreferences c() {
        SharedPreferences sharedPreferences = f;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        s7r0 s7r0Var = q;
        if (s7r0Var == null) {
            s7r0Var = null;
        }
        SharedPreferences sharedPreferences2 = (SharedPreferences) s7r0Var.invoke("ServerTimeProvider_LIB_TIME_CONFIG", 0);
        f = sharedPreferences2;
        return sharedPreferences2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, xsna.rni0, xsna.uni0$a] */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, xsna.nfg0] */
    public static void d(Context context) {
        ExecutorService executorService;
        if (p != null) {
            SharedPreferences c2 = c();
            long j2 = c;
            long j3 = c2.getLong("ServerTimeProvider_UPD", -j2);
            ro roVar = r;
            if (roVar != null) {
                roVar.k("SCLU:" + a() + ':' + j3);
            }
            boolean z = a() - j3 >= j2;
            if (p == null || !z) {
                return;
            }
            a aVar = new a();
            a.getClass();
            if (p == null) {
                ro roVar2 = r;
                if (roVar2 != null) {
                    roVar2.k("sync impossible: ServerClock is not initialized! Call init method first!");
                    return;
                }
                return;
            }
            Future<?> future = j;
            if (future != null && !future.isCancelled() && !future.isDone()) {
                ro roVar3 = r;
                if (roVar3 != null) {
                    roVar3.k("sync impossible: task already execution");
                    return;
                }
                return;
            }
            Future<?> future2 = null;
            future2 = null;
            if (!o.invoke().booleanValue()) {
                ro roVar4 = r;
                if (roVar4 != null) {
                    roVar4.k("sync impossible: No connection! Network listener activated");
                }
                if (k != null) {
                    return;
                }
                ro roVar5 = r;
                if (roVar5 != null) {
                    roVar5.k("Register connectivity checker...");
                }
                io.reactivex.rxjava3.internal.operators.observable.j1 j1Var = p;
                k = (j1Var != null ? j1Var : null).subscribe(new b0y(new el30(context, 27), 23));
                return;
            }
            if (g == null || !o25.a().b()) {
                ro roVar6 = r;
                if (roVar6 != null) {
                    roVar6.k("sync impossible: Not authorized!");
                    return;
                }
                return;
            }
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ?? rni0Var = new rni0(aVar);
            ref$ObjectRef.element = rni0Var;
            kg00 kg00Var = new kg00(rni0Var);
            gsv0 gsv0Var = g;
            int i2 = d;
            ro roVar7 = r;
            ref$ObjectRef.element = new nfg0(gsv0Var, i2, roVar7, o, kg00Var);
            if (roVar7 != null) {
                roVar7.k("sync submitted successfully");
            }
            dr6 dr6Var = l;
            if (dr6Var != null && (executorService = (ExecutorService) dr6Var.invoke()) != null) {
                future2 = executorService.submit(new xw1(ref$ObjectRef, 12));
            }
            j = future2;
        }
    }

    public static void e(long j2) {
        ro roVar = r;
        if (roVar != null) {
            roVar.k("New server time resolved! Time: " + j2);
        }
        h = System.currentTimeMillis() - j2;
        i = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        c().edit().putLong("ServerTimeProvider_KEY_TIME_DIFF", h).apply();
        io.reactivex.rxjava3.disposables.c cVar = k;
        if (cVar != null) {
            cVar.dispose();
        }
        k = null;
        c().edit().putLong("ServerTimeProvider_UPD", j2).apply();
    }

    /* compiled from: ServerClock.kt */
    /* loaded from: classes6.dex */
    public static final class a implements uni0.a {
        @Override // xsna.uni0.a
        public final void b() {
        }

        @Override // xsna.uni0.a
        public final void a(long j) {
        }
    }
}
