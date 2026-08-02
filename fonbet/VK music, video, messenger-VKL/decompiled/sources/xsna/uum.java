package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.conversations.PushSettings;

/* compiled from: DialogsNotificationChangeViaBgCmd.kt */
/* loaded from: classes2.dex */
public final class uum extends iuz {
    public final Peer b;
    public final long c;
    public final boolean d;
    public final long e;

    /* compiled from: DialogsNotificationChangeViaBgCmd.kt */
    public static final class a {
        public Peer a;
        public Long b;
        public Boolean c;

        public a() {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            this.a = Peer.Unknown.e;
        }

        public final void a(long j, boolean z) {
            this.b = z ? 0L : j <= 0 ? -1L : Long.valueOf(j);
        }
    }

    public uum(a aVar) {
        Peer peer = aVar.a;
        this.b = peer;
        peer.getClass();
        if (peer.Ab(Peer.Type.UNKNOWN)) {
            throw new IllegalStateException(yq.b(peer, "Illegal peer value: ").toString());
        }
        Long l = aVar.b;
        if (l == null) {
            throw new IllegalArgumentException("enabled is not defined");
        }
        this.c = l.longValue();
        Boolean bool = aVar.c;
        if (bool == null) {
            throw new IllegalArgumentException("useSound is not defined");
        }
        this.d = bool.booleanValue();
        this.e = peer.b;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-dialog-notifications-change";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uum)) {
            return false;
        }
        uum uumVar = (uum) obj;
        return epx.f(this.b, uumVar.b) && this.c == uumVar.c && this.d == uumVar.d;
    }

    @Override // xsna.iuz
    public final long h() {
        return this.e;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.d) + bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c);
    }

    @Override // xsna.iuz
    public final void i(w2w w2wVar) {
        w2wVar.O0().a(new bim(this.c, this.b, this.d));
    }

    @Override // xsna.iuz
    public final boolean j(w2w w2wVar) {
        xgl0 I0 = w2wVar.I0();
        w2wVar.O0().b("old change notification request", new pcg(this, 16));
        com.vk.im.engine.models.dialogs.b c = I0.b().e().c(this.e);
        PushSettings pushSettings = c != null ? c.p : null;
        PushSettings pushSettings2 = new PushSettings(this.d, this.c);
        if (pushSettings2.equals(pushSettings)) {
            return false;
        }
        I0.b().e().y(this.b.b, pushSettings2);
        return true;
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsNotificationChangeViaBgCmd(dialog=");
        sb.append(this.b);
        sb.append(", disabledUntil=");
        sb.append(this.c);
        sb.append(", isUseSound=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
