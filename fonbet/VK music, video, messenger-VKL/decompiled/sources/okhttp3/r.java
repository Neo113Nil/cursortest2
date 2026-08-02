package okhttp3;

import okio.ByteString;
import xsna.an8;

/* compiled from: RequestBody.kt */
/* loaded from: classes8.dex */
public final class r extends t {
    public final /* synthetic */ m c;
    public final /* synthetic */ ByteString d;

    public r(m mVar, ByteString byteString) {
        this.c = mVar;
        this.d = byteString;
    }

    @Override // okhttp3.t
    public final long contentLength() {
        return this.d.n();
    }

    @Override // okhttp3.t
    public final m contentType() {
        return this.c;
    }

    @Override // okhttp3.t
    public final void writeTo(an8 an8Var) {
        an8Var.P0(this.d);
    }
}
