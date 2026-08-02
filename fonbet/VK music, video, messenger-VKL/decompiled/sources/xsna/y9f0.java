package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: RecogniseVideoMessageApiCmd.kt */
/* loaded from: classes2.dex */
public final class y9f0 extends nx2<Boolean> {
    public final int b;
    public final UserId c;
    public final UserId d;
    public final long e;
    public final boolean f;

    public y9f0(int i, UserId userId, UserId userId2, long j, boolean z) {
        this.b = i;
        this.c = userId;
        this.d = userId2;
        this.e = j;
        this.f = z;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b);
        sb.append('_');
        sb.append(this.e);
        String sb2 = sb.toString();
        tfx tfxVar = new tfx("messages.recogniseVideoMessage", new ur(23), new vr(20));
        tfx.l(tfxVar, "cmid", this.b, 0, 0, 8);
        tfx.n(tfxVar, "peer_id", this.c, 0L, 0L, 12);
        tfx.o(tfxVar, "video_message_id", sb2, 0, 0, 12);
        bz2.l(tfxVar, this.f);
        return Boolean.TRUE;
    }
}
