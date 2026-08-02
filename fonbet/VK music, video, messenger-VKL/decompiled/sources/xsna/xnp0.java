package xsna;

import com.vk.dto.common.Peer;
import xsna.lc80;

/* compiled from: TranslateMsgErrorLpTask.kt */
/* loaded from: classes2.dex */
public final class xnp0 extends e500 {
    public final Peer c;
    public final int d;
    public final int e;
    public final w2w f;

    public xnp0(Peer peer, int i, int i2, w2w w2wVar) {
        super("TranslateMsgErrorLpTask");
        this.c = peer;
        this.d = i;
        this.e = i2;
        this.f = w2wVar;
    }

    @Override // xsna.e500
    public final void d(c400 c400Var) {
        this.f.e1(this, new lc80.a(this.c, this.d, this.e, this));
    }
}
