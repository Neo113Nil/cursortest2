package xsna;

import okhttp3.p;
import okio.ByteString;

/* compiled from: EmptyWebSocket.kt */
/* loaded from: classes3.dex */
public final class fip implements phx0 {
    public final emh0 a;

    public fip(emh0 emh0Var) {
        this.a = emh0Var;
    }

    @Override // xsna.phx0
    public final void cancel() {
        this.a.invoke("cancel()");
    }

    @Override // xsna.phx0
    public final boolean close(int i, String str) {
        this.a.invoke(gq.b(i, "close(code=", ", reason=\"", str, "\")"));
        return false;
    }

    @Override // xsna.phx0
    public final boolean f(ByteString byteString) {
        this.a.invoke("send(bytes=\"" + byteString + "\")");
        return false;
    }

    @Override // xsna.phx0
    public final okhttp3.p request() {
        this.a.invoke("request()");
        return new p.a().b();
    }

    @Override // xsna.phx0
    public final boolean send(String str) {
        this.a.invoke("send(text=\"" + str + "\")");
        return false;
    }
}
