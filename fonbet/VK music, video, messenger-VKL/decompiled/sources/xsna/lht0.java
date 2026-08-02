package xsna;

import android.content.Context;
import com.vk.log.L;

/* compiled from: VideoSlowNetworkHandler.kt */
/* loaded from: classes3.dex */
public final class lht0 implements b3k0 {
    public final x1o0 a;
    public final long b;
    public final ni0 c;

    public lht0(Context context) {
        nht0 nht0Var = new nht0(context);
        this.a = x1o0.e;
        Long l = fxc0.B().J().e0().c;
        if (l != null) {
            L.e("VideoSlowNetworkHandler", qlb0.a(l.longValue(), "Received time from the toggle = ", " seconds"));
        } else {
            l = null;
        }
        this.b = l != null ? l.longValue() : 10L;
        this.c = new ni0(27, this, nht0Var);
    }

    @Override // xsna.b3k0
    public final long a() {
        return this.b;
    }

    @Override // xsna.b3k0
    public final gzs<s3q0> b() {
        return this.c;
    }
}
