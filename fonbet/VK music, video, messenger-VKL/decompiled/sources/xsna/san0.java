package xsna;

import android.net.Uri;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: SuperAppQueueGetEventsLongPollCmd.kt */
/* loaded from: classes5.dex */
public final class san0 extends pfx<ran0> {
    public final String b;
    public final qan0 c;
    public final long d;
    public final boolean e = true;

    public san0(String str, qan0 qan0Var, long j) {
        this.b = str;
        this.c = qan0Var;
        this.d = j;
    }

    @Override // xsna.pfx
    public final ran0 g(wy2 wy2Var) {
        qan0 qan0Var = this.c;
        String valueOf = String.valueOf(qan0Var.d);
        long j = this.d;
        return (ran0) wy2Var.o(new tkv(Uri.parse(this.b + "getEvents/" + qan0Var.a).buildUpon().appendQueryParameter("wait", String.valueOf((j / 1000) - 2)).appendQueryParameter("key", qan0Var.c).appendQueryParameter("ts", valueOf).appendQueryParameter(SignalingProtocol.KEY_LIMIT, "100").build().toString(), j, this.e), new ubn0());
    }
}
