package okhttp3;

import xsna.an8;

/* compiled from: RequestBody.kt */
/* loaded from: classes11.dex */
public final class s extends t {
    public final /* synthetic */ m c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ int f;

    public s(m mVar, byte[] bArr, int i, int i2) {
        this.c = mVar;
        this.d = i;
        this.e = bArr;
        this.f = i2;
    }

    @Override // okhttp3.t
    public final long contentLength() {
        return this.d;
    }

    @Override // okhttp3.t
    public final m contentType() {
        return this.c;
    }

    @Override // okhttp3.t
    public final void writeTo(an8 an8Var) {
        an8Var.a4(this.f, this.d, this.e);
    }
}
