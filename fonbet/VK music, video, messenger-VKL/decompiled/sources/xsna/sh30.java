package xsna;

import android.content.SharedPreferences;
import com.vk.dto.common.Peer;

/* compiled from: MsgClearDraftOldCmd.kt */
/* loaded from: classes2.dex */
public final class sh30 extends le6<s3q0> {
    public final Peer b;
    public final bpn0 c = new bpn0(new com.vk.movika.sdk.android.defaultplayer.interactive.b(20));

    public sh30(Peer peer) {
        this.b = peer;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        long j = this.b.b;
        ((SharedPreferences) this.c.getValue()).edit().remove("text" + j).remove("textFormat" + j).remove("attach" + j).remove("replymsg" + j).remove("replymsgmembers" + j).apply();
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sh30) && epx.f(this.b, ((sh30) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return eq.a(new StringBuilder("MsgClearDraftOldCmd(peer="), this.b, ')');
    }
}
