package xsna;

import java.util.concurrent.CancellationException;

/* compiled from: LazyLayoutScrollScope.kt */
/* loaded from: classes11.dex */
public final class jux extends CancellationException {
    private final int itemOffset;
    private final kq2<Float, sq2> previousAnimation;

    public jux(int i, kq2<Float, sq2> kq2Var) {
        this.itemOffset = i;
        this.previousAnimation = kq2Var;
    }

    public final int d() {
        return this.itemOffset;
    }

    public final kq2<Float, sq2> g() {
        return this.previousAnimation;
    }
}
