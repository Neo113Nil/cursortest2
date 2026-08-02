package androidx.compose.runtime;

import defpackage.cvw;
import defpackage.dse;
import defpackage.dvw;
import defpackage.ese;
import defpackage.ffx;
import defpackage.fse;
import defpackage.gux;
import defpackage.j18;
import defpackage.ny61;
import defpackage.r630;
import defpackage.tj;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class e implements r630 {
    public final r630 a;
    public final gux b = new gux();

    public e(r630 r630Var) {
        this.a = r630Var;
    }

    @Override // defpackage.fse
    public final Object fold(Object obj, wls wlsVar) {
        return wlsVar.invoke(obj, this);
    }

    @Override // defpackage.fse
    public final dse get(ese eseVar) {
        return ffx.H(this, eseVar);
    }

    @Override // defpackage.fse
    public final fse minusKey(ese eseVar) {
        return ffx.Y(this, eseVar);
    }

    @Override // defpackage.fse
    public final fse plus(fse fseVar) {
        return cvw.U(this, fseVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.r630
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(tls tlsVar, Continuation continuation) {
        PausableMonotonicFrameClock$withFrameNanos$1 pausableMonotonicFrameClock$withFrameNanos$1;
        int i;
        boolean z;
        Object s;
        if (continuation instanceof PausableMonotonicFrameClock$withFrameNanos$1) {
            pausableMonotonicFrameClock$withFrameNanos$1 = (PausableMonotonicFrameClock$withFrameNanos$1) continuation;
            int i2 = pausableMonotonicFrameClock$withFrameNanos$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pausableMonotonicFrameClock$withFrameNanos$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pausableMonotonicFrameClock$withFrameNanos$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pausableMonotonicFrameClock$withFrameNanos$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gux guxVar = this.b;
                    pausableMonotonicFrameClock$withFrameNanos$1.L$0 = tlsVar;
                    pausableMonotonicFrameClock$withFrameNanos$1.label = 1;
                    synchronized (guxVar.a) {
                        z = guxVar.d;
                    }
                    if (z) {
                        s = zy11.a;
                    } else {
                        j18 j18Var = new j18(1, dvw.b(pausableMonotonicFrameClock$withFrameNanos$1));
                        j18Var.u();
                        synchronized (guxVar.a) {
                            guxVar.b.add(j18Var);
                        }
                        j18Var.w(new tj(15, guxVar, j18Var));
                        s = j18Var.s();
                        if (s != coroutineSingletons) {
                            s = zy11.a;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tlsVar = (tls) pausableMonotonicFrameClock$withFrameNanos$1.L$0;
                    kotlin.b.b(obj);
                }
                r630 r630Var = this.a;
                pausableMonotonicFrameClock$withFrameNanos$1.L$0 = null;
                pausableMonotonicFrameClock$withFrameNanos$1.label = 2;
                Object v = r630Var.v(tlsVar, pausableMonotonicFrameClock$withFrameNanos$1);
                return v != coroutineSingletons ? coroutineSingletons : v;
            }
        }
        pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos$1(this, continuation);
        Object obj2 = pausableMonotonicFrameClock$withFrameNanos$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pausableMonotonicFrameClock$withFrameNanos$1.label;
        if (i != 0) {
        }
        r630 r630Var2 = this.a;
        pausableMonotonicFrameClock$withFrameNanos$1.L$0 = null;
        pausableMonotonicFrameClock$withFrameNanos$1.label = 2;
        Object v2 = r630Var2.v(tlsVar, pausableMonotonicFrameClock$withFrameNanos$1);
        if (v2 != coroutineSingletons2) {
        }
    }
}
