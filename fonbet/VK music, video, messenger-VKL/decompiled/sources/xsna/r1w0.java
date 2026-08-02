package xsna;

import com.vk.network.websocket.internal.StatusCode;
import kotlin.Pair;

/* compiled from: VkWebSocketImpl.kt */
/* loaded from: classes3.dex */
public final class r1w0 {
    public final String a;
    public final String b;
    public final pdh0 c;
    public final long d;
    public final szp e;
    public final eul0 f;
    public final int g;
    public final Pair<Boolean, Long> h;
    public final String i;
    public volatile phx0 j = new fip(new emh0(this, 23));

    public r1w0(String str, String str2, pdh0 pdh0Var, long j, szp szpVar, eul0 eul0Var, int i, Pair pair) {
        this.a = str;
        this.b = str2;
        this.c = pdh0Var;
        this.d = j;
        this.e = szpVar;
        this.f = eul0Var;
        this.g = i;
        this.h = pair;
        this.i = lhg.a(i, "ehsp");
    }

    public final void a() {
        if (this.j instanceof fip) {
            return;
        }
        try {
            this.j.close(StatusCode.NORMAL_CLOSURE.h(), null);
        } catch (Throwable th) {
            this.j.cancel();
            this.e.b(th, "Websocket close exception: " + th);
        }
    }
}
