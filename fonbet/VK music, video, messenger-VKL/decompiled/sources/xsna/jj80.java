package xsna;

import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jj80 implements com.vk.movika.sdk.player.base.listener.d {
    public final /* synthetic */ mj80 a;

    @Override // com.vk.movika.sdk.player.base.listener.d
    public final void a(com.vk.movika.sdk.player.base.model.a aVar) {
        mj80 mj80Var = this.a;
        if (mj80Var.u) {
            Iterator it = ((Iterable) mj80Var.k).iterator();
            while (it.hasNext()) {
                ((com.vk.movika.sdk.player.base.listener.d) it.next()).a(aVar);
            }
        }
    }
}
