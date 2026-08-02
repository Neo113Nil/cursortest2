package xsna;

import okhttp3.internal.http2.ErrorCode;

/* compiled from: TaskQueue.kt */
/* loaded from: classes8.dex */
public final class civ extends c5o0 {
    public final /* synthetic */ vhv e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public civ(String str, vhv vhvVar, int i, ErrorCode errorCode) {
        super(str, true);
        this.e = vhvVar;
        this.f = i;
    }

    @Override // xsna.c5o0
    public final long a() {
        this.e.l.getClass();
        synchronized (this.e) {
            this.e.A.remove(Integer.valueOf(this.f));
            s3q0 s3q0Var = s3q0.a;
        }
        return -1L;
    }
}
