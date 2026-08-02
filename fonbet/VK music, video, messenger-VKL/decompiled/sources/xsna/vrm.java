package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.exceptions.ImEngineException;
import kotlin.NoWhenBranchMatchedException;
import xsna.lg20;

/* compiled from: DialogsKickCmd.kt */
/* loaded from: classes2.dex */
public final class vrm extends le6<Boolean> {
    public final Peer b;
    public final a c;
    public final boolean d;
    public final Object e;

    /* compiled from: DialogsKickCmd.kt */
    public interface a {

        /* compiled from: DialogsKickCmd.kt */
        /* renamed from: xsna.vrm$a$a, reason: collision with other inner class name */
        public static final class C3900a implements a {
            public final int a;

            public C3900a(int i) {
                this.a = i;
            }
        }

        /* compiled from: DialogsKickCmd.kt */
        public static final class b implements a {
            public final Peer a;

            public b(Peer peer) {
                this.a = peer;
            }
        }
    }

    public /* synthetic */ vrm(Peer peer, a.b bVar) {
        this(peer, bVar, false, null);
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        lg20.a c3265a;
        Peer peer = this.b;
        if (!peer.zb()) {
            throw new ImEngineException("Specified dialogId=" + peer + " is not a chat");
        }
        Peer H0 = w2wVar.H0();
        a aVar = this.c;
        if (epx.f(aVar, H0)) {
            w2wVar.O0().b("kick from dialog", new v6x(peer.b));
        }
        if (aVar instanceof a.b) {
            c3265a = new lg20.a.b(((a.b) aVar).a);
        } else {
            if (!(aVar instanceof a.C3900a)) {
                throw new NoWhenBranchMatchedException();
            }
            c3265a = new lg20.a.C3265a(((a.C3900a) aVar).a);
        }
        bz2.c(new lg20(peer, c3265a, w2wVar.Q0(), this.d), null);
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrm)) {
            return false;
        }
        vrm vrmVar = (vrm) obj;
        return epx.f(this.b, vrmVar.b) && epx.f(this.c, vrmVar.c) && this.d == vrmVar.d && epx.f(this.e, vrmVar.e);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b((this.c.hashCode() + (Long.hashCode(this.b.b) * 31)) * 31, 31, this.d);
        Object obj = this.e;
        return b + (obj == null ? 0 : obj.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsKickCmd(chatPeer=");
        sb.append(this.b);
        sb.append(", member=");
        sb.append(this.c);
        sb.append(", isAwaitNetwork=");
        sb.append(this.d);
        sb.append(", changerTag=");
        return k73.c(sb, this.e, ')');
    }

    public vrm(Peer peer, a aVar, boolean z, Object obj) {
        this.b = peer;
        this.c = aVar;
        this.d = z;
        this.e = obj;
    }
}
