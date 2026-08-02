package defpackage;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okio.ByteString;

/* loaded from: classes9.dex */
public final class fuu implements pjo {
    public static final List g = bg61.l(new String[]{"connection", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List h = bg61.l(new String[]{"connection", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    public final RealConnection a;
    public final zci0 b;
    public final euu c;
    public volatile luu d;
    public final Protocol e;
    public volatile boolean f;

    public fuu(OkHttpClient okHttpClient, RealConnection realConnection, zci0 zci0Var, euu euuVar) {
        this.a = realConnection;
        this.b = zci0Var;
        this.c = euuVar;
        List list = okHttpClient.L;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // defpackage.pjo
    public final void a(d5j0 d5j0Var) {
        int i;
        luu luuVar;
        boolean z;
        if (this.d != null) {
            return;
        }
        boolean z2 = d5j0Var.d != null;
        meu meuVar = d5j0Var.c;
        ArrayList arrayList = new ArrayList(meuVar.size() + 4);
        arrayList.add(new y8u(d5j0Var.b, y8u.f));
        ByteString byteString = y8u.g;
        kwu kwuVar = d5j0Var.a;
        String b = kwuVar.b();
        String d = kwuVar.d();
        if (d != null) {
            b = oyr.f('?', b, d);
        }
        arrayList.add(new y8u(b, byteString));
        String a = meuVar.a("Host");
        if (a != null) {
            arrayList.add(new y8u(a, y8u.i));
        }
        arrayList.add(new y8u(kwuVar.a, y8u.h));
        int size = meuVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String lowerCase = meuVar.b(i2).toLowerCase(Locale.US);
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && meuVar.f(i2).equals("trailers"))) {
                arrayList.add(new y8u(lowerCase, meuVar.f(i2)));
            }
        }
        euu euuVar = this.c;
        boolean z3 = !z2;
        synchronized (euuVar.P) {
            synchronized (euuVar) {
                try {
                    if (euuVar.x > 1073741823) {
                        euuVar.e(ErrorCode.REFUSED_STREAM);
                    }
                    if (euuVar.y) {
                        throw new ConnectionShutdownException();
                    }
                    i = euuVar.x;
                    euuVar.x = i + 2;
                    luuVar = new luu(i, euuVar, z3, false, null);
                    z = !z2 || euuVar.M >= euuVar.N || luuVar.w >= luuVar.x;
                    if (luuVar.i()) {
                        euuVar.b.put(Integer.valueOf(i), luuVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            euuVar.P.k(i, arrayList, z3);
        }
        if (z) {
            euuVar.P.flush();
        }
        this.d = luuVar;
        boolean z4 = this.f;
        luu luuVar2 = this.d;
        if (z4) {
            luuVar2.f(ErrorCode.CANCEL);
            ny61.v("Canceled");
            return;
        }
        kuu kuuVar = luuVar2.C;
        long j = this.b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        kuuVar.g(j, timeUnit);
        this.d.D.g(this.b.h, timeUnit);
    }

    @Override // defpackage.pjo
    public final void b() {
        this.c.flush();
    }

    @Override // defpackage.pjo
    public final k5t0 c() {
        return this.d;
    }

    @Override // defpackage.pjo
    public final void cancel() {
        this.f = true;
        luu luuVar = this.d;
        if (luuVar != null) {
            luuVar.f(ErrorCode.CANCEL);
        }
    }

    @Override // defpackage.pjo
    public final void d() {
        this.d.B.close();
    }

    @Override // defpackage.pjo
    public final y9t0 e(kvj0 kvj0Var) {
        return this.d.A;
    }

    @Override // defpackage.pjo
    public final uis0 f(d5j0 d5j0Var, long j) {
        return this.d.B;
    }

    @Override // defpackage.pjo
    public final boolean g() {
        boolean z;
        luu luuVar = this.d;
        if (luuVar == null) {
            return false;
        }
        synchronized (luuVar) {
            juu juuVar = luuVar.A;
            if (juuVar.b) {
                if (juuVar.w.I1()) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        if (r4 == false) goto L20;
     */
    @Override // defpackage.pjo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cvj0 h(boolean z) {
        int i;
        meu meuVar;
        boolean z2;
        luu luuVar = this.d;
        if (luuVar == null) {
            ny61.v("stream wasn't created");
            return null;
        }
        synchronized (luuVar) {
            while (true) {
                i = 0;
                if (!luuVar.y.isEmpty() || luuVar.g() != null) {
                    break;
                }
                if (!z) {
                    luuVar.b.getClass();
                    iuu iuuVar = luuVar.B;
                    if (!iuuVar.c && !iuuVar.a) {
                        z2 = false;
                    }
                    z2 = true;
                }
                i = 1;
                if (i != 0) {
                    luuVar.C.i();
                }
                try {
                    try {
                        luuVar.wait();
                        if (i != 0) {
                            luuVar.C.m();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    if (i != 0) {
                        luuVar.C.m();
                    }
                    throw th;
                }
            }
            if (luuVar.y.isEmpty()) {
                IOException iOException = luuVar.F;
                if (iOException != null) {
                    throw iOException;
                }
                throw new StreamResetException(luuVar.g());
            }
            meuVar = (meu) luuVar.y.removeFirst();
        }
        Protocol protocol = this.e;
        keu keuVar = new keu();
        int size = meuVar.size();
        suu suuVar = null;
        while (i < size) {
            String b = meuVar.b(i);
            String f = meuVar.f(i);
            if (b.equals(":status")) {
                suuVar = rzo.O("HTTP/1.1 ".concat(f));
            } else if (!h.contains(b)) {
                ooc.h(keuVar, b, f);
            }
            i++;
        }
        if (suuVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        cvj0 cvj0Var = new cvj0();
        cvj0Var.b = protocol;
        cvj0Var.c = suuVar.b;
        cvj0Var.d = (String) suuVar.c;
        cvj0Var.f = keuVar.d().d();
        if (z && cvj0Var.c == 100) {
            return null;
        }
        return cvj0Var;
    }

    @Override // defpackage.pjo
    public final long i(kvj0 kvj0Var) {
        if (lvu.a(kvj0Var)) {
            return bg61.f(kvj0Var);
        }
        return 0L;
    }

    @Override // defpackage.pjo
    public final ojo j() {
        return this.a;
    }
}
