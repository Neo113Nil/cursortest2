package xsna;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import xsna.kpg0;

/* compiled from: ExchangeFinder.kt */
/* loaded from: classes11.dex */
public final class x1q {
    public final l8f0 a;
    public final okhttp3.a b;
    public final f8f0 c;
    public final okhttp3.g d;
    public kpg0.a e;
    public kpg0 f;
    public int g;
    public int h;
    public int i;
    public ipg0 j;

    public x1q(l8f0 l8f0Var, okhttp3.a aVar, f8f0 f8f0Var, okhttp3.g gVar) {
        this.a = l8f0Var;
        this.b = aVar;
        this.c = f8f0Var;
        this.d = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0300 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g8f0 a(int i, int i2, int i3, int i4, boolean z, boolean z2) throws IOException {
        ArrayList arrayList;
        String str;
        int i5;
        List<InetAddress> list;
        boolean contains;
        t120 t120Var;
        boolean z3;
        Socket i6;
        while (!this.c.q) {
            g8f0 g8f0Var = this.c.k;
            if (g8f0Var != null) {
                synchronized (g8f0Var) {
                    try {
                        if (!g8f0Var.j) {
                            okhttp3.l lVar = g8f0Var.b.a.h;
                            okhttp3.l lVar2 = this.b.h;
                            if (lVar.e == lVar2.e && epx.f(lVar.d, lVar2.d)) {
                                i6 = null;
                                s3q0 s3q0Var = s3q0.a;
                            }
                        }
                        i6 = this.c.i();
                        s3q0 s3q0Var2 = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.c.k != null) {
                    if (i6 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    z3 = z2;
                    if (g8f0Var.l(z3)) {
                        return g8f0Var;
                    }
                    g8f0Var.n();
                    if (this.j == null) {
                        kpg0.a aVar = this.e;
                        if (aVar != null ? aVar.a() : true) {
                            continue;
                        } else {
                            kpg0 kpg0Var = this.f;
                            if (!(kpg0Var != null ? kpg0Var.a() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (i6 != null) {
                        x2r0.d(i6);
                    }
                    this.d.i(this.c, g8f0Var);
                }
            }
            this.g = 0;
            this.h = 0;
            this.i = 0;
            if (this.a.a(this.b, this.c, null, false)) {
                f8f0 f8f0Var = this.c;
                g8f0Var = f8f0Var.k;
                this.d.h(f8f0Var, g8f0Var);
            } else {
                ipg0 ipg0Var = this.j;
                try {
                    if (ipg0Var != null) {
                        this.j = null;
                    } else {
                        kpg0.a aVar2 = this.e;
                        if (aVar2 == null || !aVar2.a()) {
                            kpg0 kpg0Var2 = this.f;
                            if (kpg0Var2 == null) {
                                okhttp3.a aVar3 = this.b;
                                f8f0 f8f0Var2 = this.c;
                                kpg0Var2 = new kpg0(aVar3, f8f0Var2.b.C, f8f0Var2, this.d);
                                this.f = kpg0Var2;
                            }
                            if (!kpg0Var2.a()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (kpg0Var2.f < kpg0Var2.e.size()) {
                                okhttp3.a aVar4 = kpg0Var2.a;
                                if (kpg0Var2.f >= kpg0Var2.e.size()) {
                                    throw new SocketException("No route to " + aVar4.h.d + "; exhausted proxy configurations: " + kpg0Var2.e);
                                }
                                List<? extends Proxy> list2 = kpg0Var2.e;
                                int i7 = kpg0Var2.f;
                                kpg0Var2.f = i7 + 1;
                                Proxy proxy = list2.get(i7);
                                okhttp3.d dVar = kpg0Var2.c;
                                okhttp3.g gVar = kpg0Var2.d;
                                ArrayList arrayList2 = new ArrayList();
                                kpg0Var2.g = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    okhttp3.l lVar3 = aVar4.h;
                                    str = lVar3.d;
                                    i5 = lVar3.e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                    }
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    str = address2 == null ? inetSocketAddress.getHostName() : address2.getHostAddress();
                                    i5 = inetSocketAddress.getPort();
                                }
                                if (1 > i5 || i5 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i5 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i5));
                                } else {
                                    if (x2r0.g.f(str)) {
                                        list = Collections.singletonList(InetAddress.getByName(str));
                                    } else {
                                        gVar.k(dVar, str);
                                        List<InetAddress> a = aVar4.a.a(str);
                                        if (a.isEmpty()) {
                                            throw new UnknownHostException(aVar4.a + " returned no addresses for " + str);
                                        }
                                        gVar.j(dVar, str, a);
                                        list = a;
                                    }
                                    Iterator<InetAddress> it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(new InetSocketAddress(it.next(), i5));
                                    }
                                }
                                Iterator it2 = kpg0Var2.g.iterator();
                                while (it2.hasNext()) {
                                    ipg0 ipg0Var2 = new ipg0(kpg0Var2.a, proxy, (InetSocketAddress) it2.next());
                                    t120 t120Var2 = kpg0Var2.b;
                                    synchronized (t120Var2) {
                                        contains = ((LinkedHashSet) t120Var2.b).contains(ipg0Var2);
                                    }
                                    if (contains) {
                                        kpg0Var2.h.add(ipg0Var2);
                                    } else {
                                        arrayList.add(ipg0Var2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                g5g.y(kpg0Var2.h, arrayList);
                                kpg0Var2.h.clear();
                            }
                            kpg0.a aVar5 = new kpg0.a(arrayList);
                            this.e = aVar5;
                            if (this.c.q) {
                                throw new IOException("Canceled");
                            }
                            if (this.a.a(this.b, this.c, arrayList, false)) {
                                f8f0 f8f0Var3 = this.c;
                                g8f0Var = f8f0Var3.k;
                                this.d.h(f8f0Var3, g8f0Var);
                            } else {
                                if (!aVar5.a()) {
                                    throw new NoSuchElementException();
                                }
                                int i8 = aVar5.b;
                                aVar5.b = i8 + 1;
                                ipg0Var = (ipg0) arrayList.get(i8);
                                g8f0 g8f0Var2 = new g8f0(ipg0Var);
                                this.c.s = g8f0Var2;
                                g8f0Var2.f(i, i2, i3, i4, z, this.c, this.d);
                                this.c.s = null;
                                t120Var = this.c.b.C;
                                ipg0 ipg0Var3 = g8f0Var2.b;
                                synchronized (t120Var) {
                                    ((LinkedHashSet) t120Var.b).remove(ipg0Var3);
                                }
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    g8f0 g8f0Var3 = this.c.k;
                                    this.j = ipg0Var;
                                    x2r0.d(g8f0Var2.d);
                                    this.d.h(this.c, g8f0Var3);
                                    g8f0Var = g8f0Var3;
                                } else {
                                    synchronized (g8f0Var2) {
                                        l8f0 l8f0Var = this.a;
                                        l8f0Var.getClass();
                                        byte[] bArr = x2r0.a;
                                        l8f0Var.d.add(g8f0Var2);
                                        l8f0Var.b.c(l8f0Var.c, 0L);
                                        this.c.b(g8f0Var2);
                                        s3q0 s3q0Var3 = s3q0.a;
                                    }
                                    this.d.h(this.c, g8f0Var2);
                                    z3 = z2;
                                    g8f0Var = g8f0Var2;
                                    if (g8f0Var.l(z3)) {
                                    }
                                }
                            }
                        } else {
                            kpg0.a aVar6 = this.e;
                            if (!aVar6.a()) {
                                throw new NoSuchElementException();
                            }
                            ArrayList arrayList3 = aVar6.a;
                            int i9 = aVar6.b;
                            aVar6.b = i9 + 1;
                            ipg0Var = (ipg0) arrayList3.get(i9);
                        }
                    }
                    g8f0Var2.f(i, i2, i3, i4, z, this.c, this.d);
                    this.c.s = null;
                    t120Var = this.c.b.C;
                    ipg0 ipg0Var32 = g8f0Var2.b;
                    synchronized (t120Var) {
                    }
                } catch (Throwable th2) {
                    this.c.s = null;
                    throw th2;
                }
                arrayList = null;
                g8f0 g8f0Var22 = new g8f0(ipg0Var);
                this.c.s = g8f0Var22;
            }
            z3 = z2;
            if (g8f0Var.l(z3)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final void b(IOException iOException) {
        this.j = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
            this.g++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.h++;
        } else {
            this.i++;
        }
    }
}
