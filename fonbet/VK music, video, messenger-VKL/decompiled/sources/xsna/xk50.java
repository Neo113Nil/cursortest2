package xsna;

import xsna.g4z;

/* compiled from: MviFeatureViewModelWrapper.kt */
/* loaded from: classes3.dex */
public final class xk50<T extends g4z> extends nyt0 {
    public final T b;

    public xk50(T t) {
        this.b = t;
    }

    @Override // xsna.nyt0
    public final void h() {
        this.b.onDestroy();
    }
}
