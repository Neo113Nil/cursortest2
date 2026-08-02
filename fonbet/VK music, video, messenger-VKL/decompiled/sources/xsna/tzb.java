package xsna;

import xsna.ij20;

/* compiled from: ChatsJoinByLinkCmd.kt */
/* loaded from: classes2.dex */
public final class tzb extends xl6<Long> {
    public final String b;

    public tzb(String str) {
        this.b = str;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-chat-invite";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        ij20.a aVar = new ij20.a();
        aVar.d = bz2.m();
        aVar.c = "messages.joinChatByInviteLink";
        aVar.b("link", this.b);
        aVar.i = true;
        return (Long) bz2.f(new ij20(aVar), szb.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return tzb.class.equals(obj != null ? obj.getClass() : null) && epx.f(this.b, ((tzb) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return i5s.a(new StringBuilder("ChatsJoinByLinkCmd(link='"), this.b, "')");
    }
}
