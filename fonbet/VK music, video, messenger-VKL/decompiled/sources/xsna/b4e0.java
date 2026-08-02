package xsna;

/* compiled from: ProgressiveMediaPeriod.java */
/* loaded from: classes12.dex */
public final class b4e0 extends aas {
    public final /* synthetic */ androidx.media3.exoplayer.source.m b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4e0(androidx.media3.exoplayer.source.m mVar, n3i0 n3i0Var) {
        super(n3i0Var);
        this.b = mVar;
    }

    @Override // xsna.aas, xsna.n3i0
    public final long getDurationUs() {
        return this.b.E;
    }
}
