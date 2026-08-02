package xsna;

import com.vk.dto.common.Peer;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MessagesRemoveChatUserApiCmd.kt */
/* loaded from: classes2.dex */
public final class lg20 extends nx2<Boolean> {
    public final Peer b;
    public final a c;
    public final Peer d;
    public final boolean e;

    /* compiled from: MessagesRemoveChatUserApiCmd.kt */
    public interface a {

        /* compiled from: MessagesRemoveChatUserApiCmd.kt */
        /* renamed from: xsna.lg20$a$a, reason: collision with other inner class name */
        public static final class C3265a implements a {
            public final int a;

            public C3265a(int i) {
                this.a = i;
            }
        }

        /* compiled from: MessagesRemoveChatUserApiCmd.kt */
        public static final class b implements a {
            public final Peer a;

            public b(Peer peer) {
                this.a = peer;
            }
        }
    }

    public lg20(Peer peer, a aVar, Peer peer2, boolean z) {
        this.b = peer;
        this.c = aVar;
        this.d = peer2;
        this.e = z;
        if (!peer.zb()) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        xy2 a2;
        a aVar = this.c;
        boolean z = aVar instanceof a.C3265a;
        Peer peer = this.d;
        Peer peer2 = this.b;
        if (z) {
            a2 = sg20.a(new vg20(), (int) peer2.d, fto0.d(peer), null, Integer.valueOf(((a.C3265a) aVar).a), 10);
        } else {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a2 = sg20.a(new vg20(), (int) peer2.d, fto0.d(peer), com.vk.dto.common.a.b(((a.b) aVar).a), null, 18);
        }
        bz2.l(a2, this.e);
        return Boolean.TRUE;
    }
}
