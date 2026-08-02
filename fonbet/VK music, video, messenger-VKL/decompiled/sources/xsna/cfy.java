package xsna;

import xsna.ify;

/* compiled from: KeyboardClosedEvent.kt */
/* loaded from: classes17.dex */
public final class cfy implements ify.a {
    public final /* synthetic */ io.reactivex.rxjava3.core.b b;

    public cfy(io.reactivex.rxjava3.core.b bVar) {
        this.b = bVar;
    }

    @Override // xsna.ify.a
    public final void Y0() {
        this.b.onComplete();
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
    }
}
