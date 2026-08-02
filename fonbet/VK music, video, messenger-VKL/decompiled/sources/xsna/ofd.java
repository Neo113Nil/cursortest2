package xsna;

import xsna.rxp;

/* compiled from: ClipViewerEventsConsumer.kt */
/* loaded from: classes6.dex */
public final class ofd implements z0q {
    public final e1s0 a;

    public ofd(e1s0 e1s0Var) {
        this.a = e1s0Var;
    }

    @Override // xsna.z0q
    public final void b(rxp rxpVar) {
        if (rxpVar instanceof rxp.b) {
            this.a.invoke();
        }
    }
}
