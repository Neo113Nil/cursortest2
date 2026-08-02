package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.im_item.ImItemType;

/* compiled from: ChannelDeleteLpTask.kt */
/* loaded from: classes2.dex */
public final class sxa extends e500 {
    public final w2w c;
    public final Peer d;

    public sxa(w2w w2wVar, Peer peer) {
        super("ChannelDeleteLpTask");
        this.c = w2wVar;
        this.d = peer;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.b = Boolean.TRUE;
        z300Var.h(new b5w(this.d.b, ImItemType.CHANNEL));
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        new txa(this.d).o(this.c);
    }
}
