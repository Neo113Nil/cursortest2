package xsna;

import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: ContactCallListenerProxyImpl.kt */
/* loaded from: classes11.dex */
public final class h8j implements f8j {
    public final CopyOnWriteArraySet<f8j> b = new CopyOnWriteArraySet<>();

    @Override // xsna.f8j
    public final void onContactCallMyAnonChanged() {
        i0q0.i(0L, new hv2(new nef(this, 5), 3));
    }
}
