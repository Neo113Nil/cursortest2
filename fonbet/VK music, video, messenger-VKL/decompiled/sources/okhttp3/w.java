package okhttp3;

import xsna.bn8;

/* compiled from: ResponseBody.kt */
/* loaded from: classes11.dex */
public final class w extends v {
    public final /* synthetic */ m d;
    public final /* synthetic */ long e;
    public final /* synthetic */ bn8 f;

    public w(m mVar, long j, bn8 bn8Var) {
        this.d = mVar;
        this.e = j;
        this.f = bn8Var;
    }

    @Override // okhttp3.v
    public final long contentLength() {
        return this.e;
    }

    @Override // okhttp3.v
    public final m contentType() {
        return this.d;
    }

    @Override // okhttp3.v
    public final bn8 source() {
        return this.f;
    }
}
