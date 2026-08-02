package xsna;

/* compiled from: SnapshotIntState.kt */
/* loaded from: classes11.dex */
public interface rg50 extends wh50<Integer>, mtk0<Integer> {
    void C(int i);

    default void e(int i) {
        C(i);
    }

    int getIntValue();

    @Override // xsna.wh50
    /* bridge */ /* synthetic */ default void setValue(Integer num) {
        e(num.intValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xsna.mtk0
    default Integer getValue() {
        return Integer.valueOf(getIntValue());
    }
}
