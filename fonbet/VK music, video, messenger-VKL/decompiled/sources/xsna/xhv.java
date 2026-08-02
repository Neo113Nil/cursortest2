package xsna;

import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;

/* compiled from: TaskQueue.kt */
/* loaded from: classes8.dex */
public final class xhv extends c5o0 {
    public final /* synthetic */ vhv e;
    public final /* synthetic */ fiv f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhv(String str, vhv vhvVar, fiv fivVar) {
        super(str, true);
        this.e = vhvVar;
        this.f = fivVar;
    }

    @Override // xsna.c5o0
    public final long a() {
        try {
            this.e.b.e(this.f);
            return -1L;
        } catch (IOException e) {
            fta0 fta0Var = fta0.a;
            fta0 fta0Var2 = fta0.a;
            String str = "Http2Connection.Listener failure for " + this.e.d;
            fta0Var2.getClass();
            fta0.i(4, str, e);
            try {
                this.f.c(ErrorCode.PROTOCOL_ERROR, e);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
