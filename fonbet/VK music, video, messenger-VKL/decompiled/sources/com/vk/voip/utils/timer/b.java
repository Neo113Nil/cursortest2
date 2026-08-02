package com.vk.voip.utils.timer;

import com.vk.voip.utils.timer.CountDownTimer;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;
import xsna.s3q0;

/* compiled from: CountDownTimer.kt */
/* loaded from: classes7.dex */
public final class b extends android.os.CountDownTimer {
    public final /* synthetic */ CountDownTimer a;

    /* compiled from: CountDownTimer.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<CountDownTimer.a, s3q0> {
        public static final a b = new a(1, CountDownTimer.a.class, "onTimerFinished", "onTimerFinished()V", 0);

        @Override // xsna.izs
        public final s3q0 invoke(CountDownTimer.a aVar) {
            aVar.n0();
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j, CountDownTimer countDownTimer, long j2) {
        super(j, j2);
        this.a = countDownTimer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.CountDownTimer
    public final void onFinish() {
        a aVar = a.b;
        CountDownTimer countDownTimer = this.a;
        countDownTimer.b = null;
        CountDownTimer.State state = CountDownTimer.State.FINISHED;
        Iterator it = countDownTimer.c.iterator();
        while (it.hasNext()) {
            aVar.invoke(it.next());
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            ((CountDownTimer.a) it.next()).s0(j);
        }
    }
}
