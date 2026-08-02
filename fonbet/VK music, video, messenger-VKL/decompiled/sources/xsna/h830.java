package xsna;

/* compiled from: MonotonicFrameClock.kt */
/* loaded from: classes11.dex */
public final class h830 implements izs<Long, Object> {
    public final /* synthetic */ izs<Long, Object> b;

    /* JADX WARN: Multi-variable type inference failed */
    public h830(izs<? super Long, Object> izsVar) {
        this.b = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Long l) {
        return this.b.invoke(Long.valueOf(l.longValue() / 1000000));
    }
}
