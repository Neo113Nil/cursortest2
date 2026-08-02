package xsna;

/* compiled from: SnapshotLongState.kt */
/* loaded from: classes11.dex */
public interface ah50 extends wh50<Long>, mtk0<Long> {
    default void b(long j) {
        p(j);
    }

    long i();

    void p(long j);

    @Override // xsna.wh50
    /* bridge */ /* synthetic */ default void setValue(Long l) {
        b(l.longValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xsna.mtk0
    default Long getValue() {
        return Long.valueOf(i());
    }
}
