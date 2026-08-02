package xsna;

import android.content.Context;

/* compiled from: VoipOnFirstCallInitializer.kt */
/* loaded from: classes11.dex */
public final class gtw0 implements fhw0 {
    public final Context a;
    public volatile boolean b;
    public Throwable c;

    public gtw0(Context context, ed9 ed9Var) {
        xkg xkgVar = xkg.a;
        this.a = context;
    }

    @Override // xsna.fhw0
    public final io.reactivex.rxjava3.core.a a() {
        return b(false);
    }

    public final io.reactivex.rxjava3.core.a b(boolean z) {
        io.reactivex.rxjava3.core.w i;
        if (z) {
            asu0.a.getClass();
            i = (io.reactivex.rxjava3.core.w) asu0.j0.getValue();
        } else {
            asu0.a.getClass();
            i = asu0.i();
        }
        return io.reactivex.rxjava3.core.a.l(new a2b(this, 7)).q(i);
    }

    @Override // xsna.fhw0
    public final boolean isInitialized() {
        return this.b;
    }
}
