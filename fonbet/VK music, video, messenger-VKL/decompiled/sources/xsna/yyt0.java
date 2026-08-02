package xsna;

import xsna.g4z;

/* compiled from: ViewModelWrapper.kt */
/* loaded from: classes3.dex */
public final class yyt0<T extends g4z> extends nyt0 {
    public final T b;

    public yyt0(T t) {
        this.b = t;
    }

    @Override // xsna.nyt0
    public final void h() {
        this.b.onDestroy();
    }
}
