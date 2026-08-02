package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChatInfoUpdateLpTask.kt */
/* loaded from: classes2.dex */
public final class wrb extends e500 {
    public final Peer c;

    public wrb(Peer peer) {
        super("ChatInfoUpdateLpTask");
        this.c = peer;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.g(this.c.b);
    }
}
