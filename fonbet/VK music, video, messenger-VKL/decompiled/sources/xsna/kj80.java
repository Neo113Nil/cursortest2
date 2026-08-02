package xsna;

import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class kj80 implements com.vk.movika.sdk.player.base.listener.b {
    public final /* synthetic */ mj80 b;

    @Override // com.vk.movika.sdk.player.base.listener.b
    public final void a(Throwable th) {
        Iterator it = ((Iterable) this.b.l).iterator();
        while (it.hasNext()) {
            ((com.vk.movika.sdk.player.base.listener.b) it.next()).a(th);
        }
    }
}
