package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.im_item.ImItemType;

/* compiled from: CnvMsgHiddenOnLpTask.kt */
/* loaded from: classes2.dex */
public final class pxf extends e500 {
    public final w2w c;
    public final Peer d;
    public final int e;

    public pxf(w2w w2wVar, Peer peer, int i) {
        super("CnvMsgHiddenOnLpTask");
        this.c = w2wVar;
        this.d = peer;
        this.e = i;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.a = Boolean.TRUE;
        z300Var.h(new b5w(this.d.b, ImItemType.DIALOG));
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        this.c.I0().o().w(this.e, this.d.b);
    }
}
