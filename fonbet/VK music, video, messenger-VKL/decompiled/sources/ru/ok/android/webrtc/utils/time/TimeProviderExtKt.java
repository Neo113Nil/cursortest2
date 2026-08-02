package ru.ok.android.webrtc.utils.time;

import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.single.n;
import io.reactivex.rxjava3.internal.operators.single.o;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.gzs;
import xsna.izs;
import xsna.riy0;
import xsna.s3q0;
import xsna.zoy0;

/* loaded from: classes9.dex */
public final class TimeProviderExtKt {
    public static final <T> x<T> measureExecutionTime(x<T> xVar, TimeProvider timeProvider, izs<? super Long, s3q0> izsVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        riy0 riy0Var = new riy0(ref$ObjectRef, timeProvider);
        xVar.getClass();
        return new o(new n(xVar, riy0Var), new zoy0(ref$ObjectRef, izsVar, timeProvider));
    }

    public static final TimeProvider newInstance() {
        return new TimeProviderImpl();
    }

    public static final void setServerTimeMs(TimeProvider timeProvider, long j) {
        if (timeProvider instanceof TimeProviderImpl) {
            ((TimeProviderImpl) timeProvider).setServerTimeMs(j);
        }
    }

    public static final void setServerTimeNs(TimeProvider timeProvider, long j) {
        if (timeProvider instanceof TimeProviderImpl) {
            ((TimeProviderImpl) timeProvider).setServerTimeNs(j);
        }
    }

    public static final <T> T withMeasureExecutionTime(TimeProvider timeProvider, izs<? super Long, s3q0> izsVar, gzs<? extends T> gzsVar) {
        long msSinceBoot = timeProvider.getMsSinceBoot();
        T invoke = gzsVar.invoke();
        izsVar.invoke(Long.valueOf(timeProvider.getMsSinceBoot() - msSinceBoot));
        return invoke;
    }

    public static final TimeProvider newInstance(TimeProvider.Companion companion) {
        return new TimeProviderImpl();
    }
}
