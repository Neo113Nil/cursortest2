package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.Data;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.eyx;

/* compiled from: WorkerWrapper.kt */
/* loaded from: classes.dex */
public final class uyx0 {
    public final fxx0 a;
    public final Context b;
    public final String c;
    public final WorkerParameters.a d;
    public final hwx0 e;
    public final androidx.work.a f;
    public final i7o0 g;
    public final ohd0 h;
    public final WorkDatabase i;
    public final gxx0 j;
    public final izl k;
    public final ArrayList l;
    public final String m;
    public final gyx n;

    /* compiled from: WorkerWrapper.kt */
    public static final class a {
        public final androidx.work.a a;
        public final hwx0 b;
        public final ohd0 c;
        public final WorkDatabase d;
        public final fxx0 e;
        public final ArrayList f;
        public final Context g;
        public WorkerParameters.a h = new WorkerParameters.a();

        @SuppressLint({"LambdaLast"})
        public a(Context context, androidx.work.a aVar, hwx0 hwx0Var, ohd0 ohd0Var, WorkDatabase workDatabase, fxx0 fxx0Var, ArrayList arrayList) {
            this.a = aVar;
            this.b = hwx0Var;
            this.c = ohd0Var;
            this.d = workDatabase;
            this.e = fxx0Var;
            this.f = arrayList;
            this.g = context.getApplicationContext();
        }
    }

    /* compiled from: WorkerWrapper.kt */
    public static abstract class b {

        /* compiled from: WorkerWrapper.kt */
        /* loaded from: classes12.dex */
        public static final class a extends b {
            public final b.a.C0092a a;

            public a() {
                this(0);
            }

            public final b.a a() {
                return this.a;
            }

            public a(int i) {
                this.a = new b.a.C0092a();
            }
        }

        /* compiled from: WorkerWrapper.kt */
        /* renamed from: xsna.uyx0$b$b, reason: collision with other inner class name */
        public static final class C3858b extends b {
            public final b.a a;

            public C3858b(b.a aVar) {
                this.a = aVar;
            }
        }

        /* compiled from: WorkerWrapper.kt */
        /* loaded from: classes12.dex */
        public static final class c extends b {
            public final int a;

            public c() {
                this((Object) null);
            }

            public final int a() {
                return this.a;
            }

            public c(int i) {
                this.a = i;
            }

            public /* synthetic */ c(Object obj) {
                this(-256);
            }
        }
    }

    public uyx0(a aVar) {
        fxx0 fxx0Var = aVar.e;
        this.a = fxx0Var;
        this.b = aVar.g;
        String str = fxx0Var.a;
        this.c = str;
        this.d = aVar.h;
        this.e = aVar.b;
        androidx.work.a aVar2 = aVar.a;
        this.f = aVar2;
        this.g = aVar2.d;
        this.h = aVar.c;
        WorkDatabase workDatabase = aVar.d;
        this.i = workDatabase;
        this.j = workDatabase.D();
        this.k = workDatabase.y();
        ArrayList arrayList = aVar.f;
        this.l = arrayList;
        this.m = i5s.a(t33.a("Work [ id=", str, ", tags={ "), j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, null, 62), " } ]");
        this.n = iyx.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(uyx0 uyx0Var, ContinuationImpl continuationImpl) {
        xyx0 xyx0Var;
        int i;
        CoroutineSingletons coroutineSingletons;
        f2x f2xVar;
        Data a2;
        final uyx0 uyx0Var2 = uyx0Var;
        String str = uyx0Var2.c;
        hwx0 hwx0Var = uyx0Var2.e;
        WorkDatabase workDatabase = uyx0Var2.i;
        androidx.work.a aVar = uyx0Var2.f;
        fxx0 fxx0Var = uyx0Var2.a;
        try {
            if (continuationImpl instanceof xyx0) {
                xyx0Var = (xyx0) continuationImpl;
                int i2 = xyx0Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    xyx0Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = xyx0Var.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = xyx0Var.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        p7i p7iVar = aVar.m;
                        srl srlVar = aVar.e;
                        p7iVar.getClass();
                        boolean e = ndp0.e();
                        String str2 = fxx0Var.x;
                        String str3 = fxx0Var.c;
                        String str4 = fxx0Var.d;
                        if (e && str2 != null) {
                            p7i p7iVar2 = aVar.m;
                            int hashCode = fxx0Var.hashCode();
                            p7iVar2.getClass();
                            ndp0.a(hashCode, str2);
                        }
                        Object obj2 = null;
                        if (((Boolean) workDatabase.t(new Callable() { // from class: xsna.syx0
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                uyx0 uyx0Var3 = uyx0.this;
                                fxx0 fxx0Var2 = uyx0Var3.a;
                                WorkInfo.State state = fxx0Var2.b;
                                WorkInfo.State state2 = WorkInfo.State.ENQUEUED;
                                if (state != state2) {
                                    String str5 = bzx0.a;
                                    m100.c().getClass();
                                    return Boolean.TRUE;
                                }
                                if (fxx0Var2.d() || (fxx0Var2.b == state2 && fxx0Var2.k > 0)) {
                                    uyx0Var3.g.getClass();
                                    if (System.currentTimeMillis() < fxx0Var2.a()) {
                                        m100 c = m100.c();
                                        String str6 = bzx0.a;
                                        c.getClass();
                                        return Boolean.TRUE;
                                    }
                                }
                                return Boolean.FALSE;
                            }
                        })).booleanValue()) {
                            return new b.c(obj2);
                        }
                        if (fxx0Var.d()) {
                            a2 = fxx0Var.e;
                            coroutineSingletons = coroutineSingletons2;
                        } else {
                            aVar.f.getClass();
                            String str5 = g2x.a;
                            try {
                                f2xVar = (f2x) Class.forName(str4).getDeclaredConstructor(null).newInstance(null);
                                coroutineSingletons = coroutineSingletons2;
                            } catch (Exception e2) {
                                coroutineSingletons = coroutineSingletons2;
                                m100.c().b(g2x.a, "Trouble instantiating ".concat(str4), e2);
                                f2xVar = null;
                            }
                            if (f2xVar == null) {
                                String str6 = bzx0.a;
                                m100.c().a(str6, "Could not create Input Merger " + str4);
                                return new b.a(0);
                            }
                            a2 = f2xVar.a(j5g.u0(uyx0Var2.j.f(str), Collections.singletonList(fxx0Var.e)));
                        }
                        UUID fromString = UUID.fromString(str);
                        ArrayList arrayList = uyx0Var2.l;
                        WorkerParameters.a aVar2 = uyx0Var2.d;
                        int i3 = fxx0Var.k;
                        Executor executor = aVar.a;
                        ovj ovjVar = aVar.b;
                        xyx0 xyx0Var2 = xyx0Var;
                        twx0 twx0Var = new twx0(workDatabase, hwx0Var);
                        rvx0 rvx0Var = new rvx0(workDatabase, uyx0Var2.h, hwx0Var);
                        WorkerParameters workerParameters = new WorkerParameters();
                        workerParameters.a = fromString;
                        workerParameters.b = a2;
                        workerParameters.c = new HashSet(arrayList);
                        workerParameters.d = aVar2;
                        workerParameters.e = i3;
                        workerParameters.f = executor;
                        workerParameters.g = ovjVar;
                        workerParameters.h = hwx0Var;
                        workerParameters.i = srlVar;
                        workerParameters.j = twx0Var;
                        workerParameters.k = rvx0Var;
                        try {
                            androidx.work.b a3 = srlVar.a(uyx0Var2.b, str3, workerParameters);
                            a3.setUsed();
                            eyx eyxVar = (eyx) xyx0Var2.getContext().get(eyx.a.b);
                            eyxVar.E(new yyx0(a3, e, str2, uyx0Var2));
                            if (!((Boolean) workDatabase.t(new Callable() { // from class: xsna.tyx0
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    boolean z;
                                    uyx0 uyx0Var3 = uyx0.this;
                                    gxx0 gxx0Var = uyx0Var3.j;
                                    String str7 = uyx0Var3.c;
                                    if (gxx0Var.d(str7) == WorkInfo.State.ENQUEUED) {
                                        gxx0Var.h(WorkInfo.State.RUNNING, str7);
                                        gxx0Var.D(str7);
                                        gxx0Var.c(-256, str7);
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    return Boolean.valueOf(z);
                                }
                            })).booleanValue()) {
                                return new b.c((Object) null);
                            }
                            Object obj3 = null;
                            if (eyxVar.isCancelled()) {
                                return new b.c(obj3);
                            }
                            ovj b2 = qu5.b(hwx0Var.d);
                            zyx0 zyx0Var = new zyx0(uyx0Var2, a3, rvx0Var, null);
                            xyx0Var2.L$0 = uyx0Var2;
                            xyx0Var2.L$1 = workerParameters;
                            xyx0Var2.label = 1;
                            obj = myc0.k(b2, zyx0Var, xyx0Var2);
                            CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                            if (obj == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                        } catch (Throwable unused) {
                            String str7 = bzx0.a;
                            m100.c().a(str7, "Could not create Worker " + str3);
                            return new b.a(0);
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uyx0Var2 = (uyx0) xyx0Var.L$0;
                        kotlin.a.a(obj);
                    }
                    return new b.C3858b((b.a) obj);
                }
            }
            if (i != 0) {
            }
            return new b.C3858b((b.a) obj);
        } catch (CancellationException e3) {
            String str8 = bzx0.a;
            m100 c = m100.c();
            String str9 = uyx0Var2.m;
            c.getClass();
            throw e3;
        } catch (Throwable th) {
            m100.c().b(bzx0.a, i5s.a(new StringBuilder(), uyx0Var2.m, " failed because it threw an exception/error"), th);
            uyx0Var2.f.getClass();
            return new b.a(0);
        }
        xyx0Var = new xyx0(uyx0Var2, continuationImpl);
        Object obj4 = xyx0Var.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = xyx0Var.label;
    }

    public final void b(int i) {
        WorkInfo.State state = WorkInfo.State.ENQUEUED;
        gxx0 gxx0Var = this.j;
        String str = this.c;
        gxx0Var.h(state, str);
        this.g.getClass();
        gxx0Var.p(System.currentTimeMillis(), str);
        gxx0Var.w(this.a.v, str);
        gxx0Var.u(-1L, str);
        gxx0Var.c(i, str);
    }

    public final void c() {
        this.g.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        gxx0 gxx0Var = this.j;
        String str = this.c;
        gxx0Var.p(currentTimeMillis, str);
        gxx0Var.h(WorkInfo.State.ENQUEUED, str);
        gxx0Var.i(str);
        gxx0Var.w(this.a.v, str);
        gxx0Var.t(str);
        gxx0Var.u(-1L, str);
    }

    public final void d(b.a aVar) {
        String str = this.c;
        ArrayList o = e43.o(str);
        while (true) {
            boolean isEmpty = o.isEmpty();
            gxx0 gxx0Var = this.j;
            if (isEmpty) {
                Data a2 = ((b.a.C0092a) aVar).a();
                gxx0Var.w(this.a.v, str);
                gxx0Var.l(str, a2);
                return;
            } else {
                String str2 = (String) g5g.I(o);
                if (gxx0Var.d(str2) != WorkInfo.State.CANCELLED) {
                    gxx0Var.h(WorkInfo.State.FAILED, str2);
                }
                o.addAll(this.k.a(str2));
            }
        }
    }
}
