package xsna;

import com.vk.stickers.views.sticker.StickerAnimationState;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.d2l0;

/* compiled from: StickerAnimationStateMediator.kt */
/* loaded from: classes2.dex */
public final class e2l0 implements d2l0 {
    public final ArrayList a = new ArrayList();
    public StickerAnimationState b = StickerAnimationState.DISABLE;

    @Override // xsna.d2l0
    public final void a(d2l0.a aVar) {
        this.a.add(aVar);
    }

    @Override // xsna.d2l0
    public final void b(d2l0.a aVar) {
        this.a.remove(aVar);
    }

    @Override // xsna.d2l0
    public final StickerAnimationState c() {
        return this.b;
    }

    public final void d(StickerAnimationState stickerAnimationState) {
        bpn0 bpn0Var = i0q0.a;
        this.b = stickerAnimationState;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((d2l0.a) it.next()).g(stickerAnimationState);
        }
    }
}
