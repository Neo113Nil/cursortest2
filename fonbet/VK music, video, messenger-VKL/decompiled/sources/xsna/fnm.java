package xsna;

/* compiled from: DialogsConversationCardHideApiCmd.kt */
/* loaded from: classes2.dex */
public final class fnm extends nx2<Boolean> {
    public final long b;
    public final String c;
    public final boolean d = true;

    public fnm(long j, String str) {
        this.b = j;
        this.c = str;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        tfx tfxVar = new tfx("messages.hideConversationCard", new pr(24), new qr(21));
        tfx.m(tfxVar, "peer_id", this.b, 0L, 12);
        tfx.o(tfxVar, "card_id", this.c, 0, 0, 12);
        bz2.l(tfxVar, this.d);
        return Boolean.TRUE;
    }
}
