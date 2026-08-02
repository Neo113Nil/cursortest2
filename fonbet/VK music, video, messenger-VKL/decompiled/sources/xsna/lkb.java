package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelsSubscribeLpTaskInteractor.kt */
/* loaded from: classes2.dex */
public final class lkb {
    public final w2w a;
    public final Peer b;
    public final boolean c;
    public final boolean d;
    public final long e;

    public lkb(w2w w2wVar, Peer peer, boolean z, boolean z2) {
        this.a = w2wVar;
        this.b = peer;
        this.c = z;
        this.d = z2;
        this.e = peer.b;
    }

    public final void a(c400 c400Var, f400 f400Var) {
        p4g.a(Long.valueOf(this.e), f400Var.i, !c400Var.i.containsKey(Long.valueOf(r0)));
    }

    public final void b(c400 c400Var, izs<? super xgl0, s3q0> izsVar) {
        this.a.I0().u(new sc5(c400Var, this, izsVar, 2));
    }
}
