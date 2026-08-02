package xsna;

import xsna.n3i0;

/* compiled from: ForwardingSeekMap.java */
/* loaded from: classes12.dex */
public class aas implements n3i0 {
    public final n3i0 a;

    public aas(n3i0 n3i0Var) {
        this.a = n3i0Var;
    }

    @Override // xsna.n3i0
    public final boolean c() {
        return this.a.c();
    }

    @Override // xsna.n3i0
    public long getDurationUs() {
        return this.a.getDurationUs();
    }

    @Override // xsna.n3i0
    public n3i0.a getSeekPoints(long j) {
        return this.a.getSeekPoints(j);
    }

    @Override // xsna.n3i0
    public final boolean isSeekable() {
        return this.a.isSeekable();
    }
}
