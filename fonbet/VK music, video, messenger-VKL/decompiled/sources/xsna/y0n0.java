package xsna;

import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: SubtitleOutputBuffer.java */
/* loaded from: classes12.dex */
public abstract class y0n0 extends k8l implements m0n0 {

    @Nullable
    public m0n0 e;
    public long f;

    @Override // xsna.k8l
    public final void c() {
        super.c();
        this.e = null;
    }

    @Override // xsna.m0n0
    public final List<rkk> getCues(long j) {
        m0n0 m0n0Var = this.e;
        m0n0Var.getClass();
        return m0n0Var.getCues(j - this.f);
    }

    @Override // xsna.m0n0
    public final long getEventTime(int i) {
        m0n0 m0n0Var = this.e;
        m0n0Var.getClass();
        return m0n0Var.getEventTime(i) + this.f;
    }

    @Override // xsna.m0n0
    public final int getEventTimeCount() {
        m0n0 m0n0Var = this.e;
        m0n0Var.getClass();
        return m0n0Var.getEventTimeCount();
    }

    @Override // xsna.m0n0
    public final int getNextEventTimeIndex(long j) {
        m0n0 m0n0Var = this.e;
        m0n0Var.getClass();
        return m0n0Var.getNextEventTimeIndex(j - this.f);
    }

    public final void i(long j, m0n0 m0n0Var, long j2) {
        this.c = j;
        this.e = m0n0Var;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f = j;
    }
}
