package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;

/* compiled from: RecogniseAudioMessageApiCmd.kt */
/* loaded from: classes2.dex */
public final class x9f0 extends nx2<Boolean> {
    public final int b;
    public final UserId c;
    public final UserId d;
    public final long e;
    public final Peer f;
    public final boolean g;

    public x9f0(int i, UserId userId, UserId userId2, long j, Peer peer, boolean z) {
        this.b = i;
        this.c = userId;
        this.d = userId2;
        this.e = j;
        this.f = peer;
        this.g = z;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b);
        sb.append('_');
        sb.append(this.e);
        String sb2 = sb.toString();
        UserId d = fto0.d(this.f);
        tfx tfxVar = new tfx("messages.recogniseAudioMessage", new zn(18), new ao(22));
        tfx.l(tfxVar, "cmid", this.b, 0, 0, 8);
        tfx.o(tfxVar, "audio_message_id", sb2, 0, 0, 12);
        UserId userId = this.c;
        if (userId != null) {
            tfx.n(tfxVar, "peer_id", userId, 0L, 0L, 12);
        }
        if (d != null) {
            tfx.n(tfxVar, "group_id", d, 0L, 0L, 8);
        }
        bz2.l(tfxVar, this.g);
        return Boolean.TRUE;
    }
}
