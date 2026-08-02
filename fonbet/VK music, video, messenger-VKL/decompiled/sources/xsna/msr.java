package xsna;

import one.video.streaming.tools.TimeMachine;

/* compiled from: FlowControl.java */
/* loaded from: classes8.dex */
public final class msr extends s1p0 {
    public final /* synthetic */ nsr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msr(nsr nsrVar, TimeMachine timeMachine) {
        super(timeMachine, 300L, 1000L);
        this.a = nsrVar;
    }

    @Override // xsna.s1p0
    public final long getBWLimit() {
        return this.a.j;
    }
}
