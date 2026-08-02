package xsna;

import com.vk.dto.common.Peer;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: ChannelArchiveLpTask.kt */
/* loaded from: classes2.dex */
public final class fua extends e500 {
    public static final /* synthetic */ qcy<Object>[] g;
    public final w2w c;
    public final h6o0 d;
    public final long e;
    public final nf3 f;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(fua.class, "archived", "getArchived()Z", 0);
        fpf0.a.getClass();
        g = new qcy[]{mutablePropertyReference1Impl};
    }

    public fua(w2w w2wVar, Peer peer) {
        super("ChannelArchiveLpTask");
        this.c = w2wVar;
        this.d = new h6o0(w2wVar);
        this.e = peer.b;
        this.f = new nf3();
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        if (c400Var.a()) {
            return;
        }
        f400Var.k = true;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        if (((Boolean) this.f.getValue(this, g[0])).booleanValue()) {
            z300Var.b = Boolean.TRUE;
            z300Var.c(this.e);
        }
        z300Var.X = true;
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        h6o0 h6o0Var = this.d;
        Boolean bool = (Boolean) ((w2w) h6o0Var.b).I0().u(new bua(h6o0Var, this.e, 0));
        bool.getClass();
        qcy<Object> qcyVar = g[0];
        this.f.c = bool;
    }
}
