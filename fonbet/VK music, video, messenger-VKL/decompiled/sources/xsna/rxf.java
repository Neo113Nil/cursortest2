package xsna;

import com.vk.dto.common.Peer;

/* compiled from: CnvMsgImportantChangeLpTask.kt */
/* loaded from: classes2.dex */
public final class rxf extends e500 {
    public final w2w c;
    public final Peer d;
    public final int e;
    public final boolean f;
    public int g;

    public rxf(w2w w2wVar, Peer peer, int i, boolean z) {
        super("CnvMsgImportantChangeLpTask");
        this.c = w2wVar;
        this.d = peer;
        this.e = i;
        this.f = z;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        int i = this.g;
        if (i > 0) {
            z300Var.j(i, this.d.b);
        }
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        this.c.I0().u(new omf(this, 1));
    }
}
