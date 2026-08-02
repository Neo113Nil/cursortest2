package com.yandex.div.core.timer;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;
import xsna.s3q0;

/* compiled from: TimerController.kt */
/* loaded from: classes7.dex */
public /* synthetic */ class TimerController$ticker$3 extends FunctionReferenceImpl implements izs<Long, s3q0> {
    public TimerController$ticker$3(Object obj) {
        super(1, obj, TimerController.class, "onEnd", "onEnd(J)V", 0);
    }

    @Override // xsna.izs
    public /* bridge */ /* synthetic */ s3q0 invoke(Long l) {
        invoke(l.longValue());
        return s3q0.a;
    }

    public final void invoke(long j) {
        ((TimerController) this.receiver).onEnd(j);
    }
}
