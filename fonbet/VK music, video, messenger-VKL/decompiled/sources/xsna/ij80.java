package xsna;

import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ij80 implements com.vk.movika.sdk.player.base.listener.c {
    public final /* synthetic */ mj80 a;

    @Override // com.vk.movika.sdk.player.base.listener.c
    public final void a(com.vk.movika.sdk.player.base.model.a aVar) {
        Iterator it = ((Iterable) this.a.j).iterator();
        while (it.hasNext()) {
            ((com.vk.movika.sdk.player.base.listener.c) it.next()).a(aVar);
        }
    }
}
