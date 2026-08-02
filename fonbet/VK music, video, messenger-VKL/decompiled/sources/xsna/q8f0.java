package xsna;

import java.io.IOException;
import java.net.SocketTimeoutException;
import okio.ByteString;

/* compiled from: TaskQueue.kt */
/* loaded from: classes8.dex */
public final class q8f0 extends c5o0 {
    public final /* synthetic */ p8f0 e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8f0(String str, p8f0 p8f0Var, long j) {
        super(str, true);
        this.e = p8f0Var;
        this.f = j;
    }

    @Override // xsna.c5o0
    public final long a() {
        p8f0 p8f0Var = this.e;
        synchronized (p8f0Var) {
            try {
                if (!p8f0Var.u) {
                    yhx0 yhx0Var = p8f0Var.k;
                    if (yhx0Var != null) {
                        int i = p8f0Var.w ? p8f0Var.v : -1;
                        p8f0Var.v++;
                        p8f0Var.w = true;
                        s3q0 s3q0Var = s3q0.a;
                        if (i != -1) {
                            StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                            sb.append(p8f0Var.d);
                            sb.append("ms (after ");
                            p8f0Var.i(new SocketTimeoutException(h5s.c(i - 1, " successful ping/pongs)", sb)), null);
                        } else {
                            try {
                                yhx0Var.b(9, ByteString.d);
                            } catch (IOException e) {
                                p8f0Var.i(e, null);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f;
    }
}
