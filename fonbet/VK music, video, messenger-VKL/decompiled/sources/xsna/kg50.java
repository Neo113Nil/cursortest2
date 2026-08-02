package xsna;

/* compiled from: SnapshotFloatState.kt */
/* loaded from: classes11.dex */
public interface kg50 extends wh50<Float>, mtk0<Float> {
    default void f(float f) {
        g(f);
    }

    void g(float f);

    float getFloatValue();

    @Override // xsna.wh50
    /* bridge */ /* synthetic */ default void setValue(Float f) {
        f(f.floatValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xsna.mtk0
    default Float getValue() {
        return Float.valueOf(getFloatValue());
    }
}
