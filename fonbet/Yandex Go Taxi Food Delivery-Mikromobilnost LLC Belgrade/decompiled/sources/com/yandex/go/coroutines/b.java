package com.yandex.go.coroutines;

import defpackage.e3n;
import defpackage.fse;
import defpackage.gtq0;
import defpackage.hnr0;
import defpackage.jqr;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.o430;
import defpackage.oyr;
import defpackage.pzt0;
import defpackage.rol0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.yk;
import defpackage.zls;
import defpackage.zy11;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.t0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public abstract class b {
    public static final yk a = new yk(10);

    public static final rol0 a(n0 n0Var, int i, long j) {
        if (i <= 0) {
            w511.f(oyr.j(i, "Max buffer size has to be greater than zero (got ", Extension.C_BRAKE));
            return null;
        }
        if (e3n.j(j)) {
            return new rol0(new BufferedWithTimeoutKt$bufferedWithTimeout$3(i, n0Var, j, null));
        }
        w511.f(oyr.p("Timeout has to be positive (got ", e3n.p(j), Extension.C_BRAKE));
        return null;
    }

    public static final zls b() {
        return new CoroutineUtilsKt$ignoreErrors$1();
    }

    public static final jqr c(tpr tprVar, wls wlsVar) {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        return new jqr(tprVar, new FlowExtensionsKt$onFirstEmit$1(ref$BooleanRef, wlsVar, null), 3);
    }

    public static final tpr d(tpr tprVar, wls wlsVar) {
        return tprVar instanceof hnr0 ? new t0((hnr0) tprVar, wlsVar) : new n(tprVar, wlsVar);
    }

    public static final wls e() {
        return new CoroutineUtilsKt$onUnexpectedError$1(new IllegalStateException("No exception handlers defined"), null);
    }

    public static final rol0 f(o oVar, wls wlsVar) {
        return new rol0(new RepeatKt$repeatWhen$1(oVar, wlsVar, null));
    }

    public static pzt0 g(tse tseVar, fse fseVar, CoroutineStart coroutineStart, wls wlsVar, int i) {
        if ((i & 1) != 0) {
            fseVar = EmptyCoroutineContext.a;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return tje.M(tseVar, gtq0.i().plus(fseVar), coroutineStart, wlsVar);
    }

    public static final pzt0 h(tse tseVar, tpr tprVar) {
        return g(tseVar, null, null, new CoroutineUtilsKt$safeLaunchIn$1(tprVar, null), 3);
    }

    public static final rol0 i(tpr tprVar) {
        return new rol0(new DelayKt$sampleIntermediates$2(tprVar, 500L, null));
    }

    public static final rol0 j(tpr tprVar, long j) {
        return new rol0(new DelayKt$throttleFirst$1(tprVar, j, null));
    }

    public static final rol0 k(tpr tprVar, long j, tpr tprVar2) {
        return new rol0(new TimeoutKt$timeout$1(j, tprVar2, tprVar, null));
    }

    public static rol0 l(long j) {
        o430 o430Var = e3n.b;
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        return m(kp50.V(j, durationUnit), kp50.V(0L, durationUnit));
    }

    public static final rol0 m(long j, long j2) {
        return new rol0(new TimerKt$timerFlow$1(j2, j, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(n0 n0Var, ContinuationImpl continuationImpl) {
        CoroutineUtilsKt$waitForSubscription$1 coroutineUtilsKt$waitForSubscription$1;
        int i;
        if (continuationImpl instanceof CoroutineUtilsKt$waitForSubscription$1) {
            coroutineUtilsKt$waitForSubscription$1 = (CoroutineUtilsKt$waitForSubscription$1) continuationImpl;
            int i2 = coroutineUtilsKt$waitForSubscription$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coroutineUtilsKt$waitForSubscription$1.label = i2 - Integer.MIN_VALUE;
                Object obj = coroutineUtilsKt$waitForSubscription$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coroutineUtilsKt$waitForSubscription$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(n0Var.j());
                    coroutineUtilsKt$waitForSubscription$1.L$0 = null;
                    coroutineUtilsKt$waitForSubscription$1.label = 1;
                    if (kotlinx.coroutines.flow.e.y(dVar, coroutineUtilsKt$waitForSubscription$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        coroutineUtilsKt$waitForSubscription$1 = new CoroutineUtilsKt$waitForSubscription$1(continuationImpl);
        Object obj2 = coroutineUtilsKt$waitForSubscription$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coroutineUtilsKt$waitForSubscription$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
