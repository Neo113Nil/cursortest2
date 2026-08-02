package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AnalyticsWebSocketListener.kt */
/* loaded from: classes5.dex */
public final class oy1 extends uhx0 {
    public final w80 b;
    public final n4w0 c;
    public final o4w0 d;
    public final hpj e;
    public volatile a f;
    public volatile qjx0 g;
    public final wi50 h;

    /* compiled from: AnalyticsWebSocketListener.kt */
    public static final class a {
        public final long a;
        public final long b;
        public final long c;
        public final eyx d;

        public a(long j, long j2, long j3, eyx eyxVar) {
            this.a = j;
            this.b = j2;
            this.c = j3;
            this.d = eyxVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "CheckAliveState(activeForMs=" + this.a + ", lastActiveCheckTime=" + this.b + ", activeInterval=" + this.c + ", lastJob=" + this.d + ')';
        }
    }

    public oy1() {
        throw null;
    }

    public oy1(w80 w80Var, n4w0 n4w0Var, o4w0 o4w0Var) {
        bdn bdnVar = bdn.a;
        hpj a2 = zvj.a(wgl.c);
        this.b = w80Var;
        this.c = n4w0Var;
        this.d = o4w0Var;
        this.e = a2;
        this.h = bay.a();
        myc0.h(a2, null, null, new ty1(this, new ry1(this, null), null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(oy1 oy1Var, ContinuationImpl continuationImpl) {
        qy1 qy1Var;
        int i;
        oy1Var.getClass();
        if (continuationImpl instanceof qy1) {
            qy1Var = (qy1) continuationImpl;
            int i2 = qy1Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qy1Var.label = i2 - Integer.MIN_VALUE;
                Object obj = qy1Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qy1Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    obj = oy1Var.g;
                    if (obj == null) {
                        o4w0 o4w0Var = oy1Var.d;
                        qy1Var.L$0 = oy1Var;
                        qy1Var.label = 1;
                        obj = o4w0Var.invoke(qy1Var);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return obj;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oy1Var = (oy1) qy1Var.L$0;
                kotlin.a.a(obj);
                oy1Var.g = (qjx0) obj;
                return obj;
            }
        }
        qy1Var = new qy1(oy1Var, continuationImpl);
        Object obj2 = qy1Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qy1Var.label;
        if (i != 0) {
        }
        oy1Var.g = (qjx0) obj2;
        return obj2;
    }

    @Override // xsna.uhx0
    public final void onClosed(phx0 phx0Var, int i, String str) {
        myc0.h(this.e, null, null, new ty1(this, new sy1(this, null), null), 3);
    }

    @Override // xsna.uhx0
    public final void onClosing(phx0 phx0Var, int i, String str) {
        myc0.h(this.e, null, null, new ty1(this, new sy1(this, null), null), 3);
    }

    @Override // xsna.uhx0
    public final void onFailure(phx0 phx0Var, Throwable th, okhttp3.u uVar) {
        myc0.h(this.e, null, null, new ty1(this, new sy1(this, null), null), 3);
    }

    @Override // xsna.uhx0
    public final void onOpen(phx0 phx0Var, okhttp3.u uVar) {
        myc0.h(this.e, null, null, new ty1(this, new ry1(this, null), null), 3);
    }
}
