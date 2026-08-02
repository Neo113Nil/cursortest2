package xsna;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Protocol;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.k;
import okhttp3.u;
import okio.ByteString;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.fiv;
import xsna.uzk0;

/* compiled from: Http2ExchangeCodec.kt */
/* loaded from: classes8.dex */
public final class eiv implements w1q {
    public static final List<String> g = x2r0.k(SignalingProtocol.NOTIFY_CONNECTION, CandidateTypeHintConfig.TYPE_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List<String> h = x2r0.k(SignalingProtocol.NOTIFY_CONNECTION, CandidateTypeHintConfig.TYPE_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final g8f0 a;
    public final RealInterceptorChain b;
    public final vhv c;
    public volatile fiv d;
    public final Protocol e;
    public volatile boolean f;

    public eiv(okhttp3.o oVar, g8f0 g8f0Var, RealInterceptorChain realInterceptorChain, vhv vhvVar) {
        this.a = g8f0Var;
        this.b = realInterceptorChain;
        this.c = vhvVar;
        List<Protocol> list = oVar.t;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // xsna.w1q
    public final agk0 a(okhttp3.u uVar) {
        return this.d.i;
    }

    @Override // xsna.w1q
    public final g8f0 b() {
        return this.a;
    }

    @Override // xsna.w1q
    public final void c() {
        this.c.flush();
    }

    @Override // xsna.w1q
    public final void cancel() {
        this.f = true;
        fiv fivVar = this.d;
        if (fivVar != null) {
            fivVar.e(ErrorCode.CANCEL);
        }
    }

    @Override // xsna.w1q
    public final long d(okhttp3.u uVar) {
        if (njv.a(uVar)) {
            return x2r0.j(uVar);
        }
        return 0L;
    }

    @Override // xsna.w1q
    public final void e(okhttp3.p pVar) {
        int i;
        fiv fivVar;
        boolean z;
        if (this.d != null) {
            return;
        }
        boolean z2 = pVar.d != null;
        okhttp3.k kVar = pVar.c;
        ArrayList arrayList = new ArrayList(kVar.size() + 4);
        arrayList.add(new wvu(pVar.b, wvu.f));
        ByteString byteString = wvu.g;
        okhttp3.l lVar = pVar.a;
        String b = lVar.b();
        String d = lVar.d();
        if (d != null) {
            b = v1v.a('?', b, d);
        }
        arrayList.add(new wvu(b, byteString));
        String a = kVar.a("Host");
        if (a != null) {
            arrayList.add(new wvu(a, wvu.i));
        }
        arrayList.add(new wvu(lVar.a, wvu.h));
        int size = kVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String lowerCase = kVar.c(i2).toLowerCase(Locale.US);
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && epx.f(kVar.f(i2), "trailers"))) {
                arrayList.add(new wvu(lowerCase, kVar.f(i2)));
            }
        }
        vhv vhvVar = this.c;
        boolean z3 = !z2;
        synchronized (vhvVar.y) {
            synchronized (vhvVar) {
                try {
                    if (vhvVar.f > 1073741823) {
                        vhvVar.k(ErrorCode.REFUSED_STREAM);
                    }
                    if (vhvVar.g) {
                        throw new ConnectionShutdownException();
                    }
                    i = vhvVar.f;
                    vhvVar.f = i + 2;
                    fivVar = new fiv(i, vhvVar, z3, false, null);
                    z = !z2 || vhvVar.v >= vhvVar.w || fivVar.e >= fivVar.f;
                    if (fivVar.h()) {
                        vhvVar.c.put(Integer.valueOf(i), fivVar);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            vhvVar.y.j(arrayList, i, z3);
        }
        if (z) {
            vhvVar.y.flush();
        }
        this.d = fivVar;
        if (this.f) {
            this.d.e(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        fiv.c cVar = this.d.k;
        long j = this.b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cVar.g(j, timeUnit);
        this.d.l.g(this.b.h, timeUnit);
    }

    @Override // xsna.w1q
    public final qwj0 f(okhttp3.p pVar, long j) {
        return this.d.f();
    }

    @Override // xsna.w1q
    public final void g() {
        this.d.f().close();
    }

    @Override // xsna.w1q
    public final u.a h(boolean z) {
        okhttp3.k removeFirst;
        fiv fivVar = this.d;
        if (fivVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (fivVar) {
            fivVar.k.i();
            while (fivVar.g.isEmpty() && fivVar.m == null) {
                try {
                    try {
                        fivVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    fivVar.k.l();
                    throw th;
                }
            }
            fivVar.k.l();
            if (fivVar.g.isEmpty()) {
                IOException iOException = fivVar.n;
                if (iOException != null) {
                    throw iOException;
                }
                throw new StreamResetException(fivVar.m);
            }
            removeFirst = fivVar.g.removeFirst();
        }
        Protocol protocol = this.e;
        k.a aVar = new k.a();
        int size = removeFirst.size();
        uzk0 uzk0Var = null;
        for (int i = 0; i < size; i++) {
            String c = removeFirst.c(i);
            String f = removeFirst.f(i);
            if (epx.f(c, ":status")) {
                uzk0Var = uzk0.a.a("HTTP/1.1 " + f);
            } else if (!h.contains(c)) {
                aVar.d(c, f);
            }
        }
        if (uzk0Var == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        u.a aVar2 = new u.a();
        aVar2.b = protocol;
        aVar2.c = uzk0Var.b;
        aVar2.d = uzk0Var.c;
        aVar2.f = aVar.e().d();
        if (z && aVar2.c == 100) {
            return null;
        }
        return aVar2;
    }
}
