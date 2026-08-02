package defpackage;

import com.squareup.wire.internal.MathMethodsKt;
import java.io.IOException;
import java.net.SocketTimeoutException;
import okhttp3.internal.http2.ErrorCode;

/* loaded from: classes9.dex */
public final class kuu extends gb3 {
    public final /* synthetic */ luu n;

    public kuu(luu luuVar) {
        this.n = luuVar;
    }

    @Override // defpackage.gb3
    public final IOException k(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // defpackage.gb3
    public final void l() {
        this.n.f(ErrorCode.CANCEL);
        euu euuVar = this.n.b;
        synchronized (euuVar) {
            long j = euuVar.G;
            long j2 = euuVar.F;
            if (j < j2) {
                return;
            }
            euuVar.F = j2 + 1;
            euuVar.H = System.nanoTime() + MathMethodsKt.NANOS_PER_SECOND;
            htx0.c(euuVar.A, oyr.t(new StringBuilder(), euuVar.c, " ping"), 0L, new tzt(6, euuVar), 6);
        }
    }

    public final void m() {
        if (j()) {
            throw k(null);
        }
    }
}
