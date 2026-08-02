package defpackage;

import android.security.NetworkSecurityPolicy;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import okhttp3.Protocol;
import okhttp3.internal.connection.RealConnection;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes9.dex */
public final class gdi0 {
    public final mtx0 a;
    public final oci0 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final no0 i;
    public final y1l0 j;
    public final nci0 k;
    public final boolean l;
    public kdh m;
    public s8l0 n;
    public b0l0 o;
    public final x43 p = new x43();

    public gdi0(mtx0 mtx0Var, oci0 oci0Var, int i, int i2, int i3, int i4, boolean z, boolean z2, no0 no0Var, y1l0 y1l0Var, nci0 nci0Var, d5j0 d5j0Var) {
        this.a = mtx0Var;
        this.b = oci0Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = z2;
        this.i = no0Var;
        this.j = y1l0Var;
        this.k = nci0Var;
        this.l = !jl40.l(d5j0Var.b, "GET");
    }

    public final boolean a(RealConnection realConnection) {
        s8l0 s8l0Var;
        b0l0 b0l0Var;
        if (this.p.isEmpty() && this.o == null) {
            if (realConnection != null) {
                synchronized (realConnection) {
                    b0l0Var = null;
                    if (realConnection.m == 0 && realConnection.k && bg61.a(realConnection.c.a.h, this.i.h)) {
                        b0l0Var = realConnection.c;
                    }
                }
                if (b0l0Var != null) {
                    this.o = b0l0Var;
                    return true;
                }
            }
            kdh kdhVar = this.m;
            if ((kdhVar == null || kdhVar.a >= kdhVar.b.size()) && (s8l0Var = this.n) != null) {
                return s8l0Var.a();
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f7l0 b() {
        boolean z;
        Socket h;
        o2k0 o2k0Var;
        k4e c;
        String str;
        int i;
        List list;
        boolean contains;
        RealConnection realConnection = this.k.C;
        if (realConnection != null) {
            boolean g = realConnection.g(this.l);
            synchronized (realConnection) {
                boolean z2 = realConnection.k;
                try {
                    if (g) {
                        z = false;
                        if (!z2) {
                            kwu kwuVar = realConnection.c.a.h;
                            kwu kwuVar2 = this.i.h;
                            if (kwuVar.e == kwuVar2.e && jl40.l(kwuVar.d, kwuVar2.d)) {
                                h = null;
                            }
                        }
                        h = this.k.h();
                    } else {
                        z = !z2;
                        realConnection.k = true;
                        h = this.k.h();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.k.C != null) {
                if (h != null) {
                    ny61.r("Check failed.");
                    return null;
                }
                o2k0Var = new o2k0(realConnection);
                if (o2k0Var == null) {
                    return o2k0Var;
                }
                o2k0 d = d(null, null);
                if (d != null) {
                    return d;
                }
                if (!this.p.isEmpty()) {
                    return (f7l0) this.p.removeFirst();
                }
                b0l0 b0l0Var = this.o;
                if (b0l0Var != null) {
                    this.o = null;
                    c = c(b0l0Var, null);
                } else {
                    kdh kdhVar = this.m;
                    if (kdhVar == null || kdhVar.a >= kdhVar.b.size()) {
                        s8l0 s8l0Var = this.n;
                        if (s8l0Var == null) {
                            s8l0Var = new s8l0(this.i, this.j, this.k, this.h);
                            this.n = s8l0Var;
                        }
                        if (!s8l0Var.a()) {
                            ny61.v("exhausted all routes");
                            return null;
                        }
                        if (!s8l0Var.a()) {
                            ny61.p();
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        while (s8l0Var.f < s8l0Var.e.size()) {
                            no0 no0Var = s8l0Var.a;
                            if (s8l0Var.f >= s8l0Var.e.size()) {
                                throw new SocketException("No route to " + no0Var.h.d + "; exhausted proxy configurations: " + s8l0Var.e);
                            }
                            List list2 = s8l0Var.e;
                            int i2 = s8l0Var.f;
                            s8l0Var.f = i2 + 1;
                            Proxy proxy = (Proxy) list2.get(i2);
                            nci0 nci0Var = s8l0Var.c;
                            ArrayList arrayList2 = new ArrayList();
                            s8l0Var.g = arrayList2;
                            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                kwu kwuVar3 = no0Var.h;
                                str = kwuVar3.d;
                                i = kwuVar3.e;
                            } else {
                                SocketAddress address = proxy.address();
                                if (!(address instanceof InetSocketAddress)) {
                                    vg10.r(address.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                                    return null;
                                }
                                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                InetAddress address2 = inetSocketAddress.getAddress();
                                str = address2 == null ? inetSocketAddress.getHostName() : address2.getHostAddress();
                                i = inetSocketAddress.getPort();
                            }
                            if (1 > i || i >= 65536) {
                                throw new SocketException("No route to " + str + ':' + i + "; port is out of range");
                            }
                            if (proxy.type() == Proxy.Type.SOCKS) {
                                arrayList2.add(InetSocketAddress.createUnresolved(str, i));
                            } else {
                                if (wf61.a.h(str)) {
                                    list = Collections.singletonList(InetAddress.getByName(str));
                                } else {
                                    nci0Var.x.dnsStart(nci0Var, str);
                                    List a = no0Var.a.a(str);
                                    if (a.isEmpty()) {
                                        throw new UnknownHostException(no0Var.a + " returned no addresses for " + str);
                                    }
                                    nci0Var.x.dnsEnd(nci0Var, str, a);
                                    list = a;
                                }
                                if (s8l0Var.d && list.size() >= 2) {
                                    ArrayList arrayList3 = new ArrayList();
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj : list) {
                                        if (((InetAddress) obj) instanceof Inet6Address) {
                                            arrayList3.add(obj);
                                        } else {
                                            arrayList4.add(obj);
                                        }
                                    }
                                    Pair pair = new Pair(arrayList3, arrayList4);
                                    List list3 = (List) pair.getFirst();
                                    List list4 = (List) pair.getSecond();
                                    if (!list3.isEmpty() && !list4.isEmpty()) {
                                        byte[] bArr = yf61.a;
                                        Iterator it = list3.iterator();
                                        Iterator it2 = list4.iterator();
                                        ListBuilder a2 = rcc.a();
                                        while (true) {
                                            if (!it.hasNext() && !it2.hasNext()) {
                                                break;
                                            }
                                            if (it.hasNext()) {
                                                a2.add(it.next());
                                            }
                                            if (it2.hasNext()) {
                                                a2.add(it2.next());
                                            }
                                        }
                                        list = a2.j();
                                    }
                                }
                                Iterator it3 = list.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(new InetSocketAddress((InetAddress) it3.next(), i));
                                }
                            }
                            Iterator it4 = s8l0Var.g.iterator();
                            while (it4.hasNext()) {
                                b0l0 b0l0Var2 = new b0l0(s8l0Var.a, proxy, (InetSocketAddress) it4.next());
                                y1l0 y1l0Var = s8l0Var.b;
                                synchronized (y1l0Var) {
                                    contains = y1l0Var.a.contains(b0l0Var2);
                                }
                                if (contains) {
                                    s8l0Var.h.add(b0l0Var2);
                                } else {
                                    arrayList.add(b0l0Var2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                break;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            ycc.r(s8l0Var.h, arrayList);
                            s8l0Var.h.clear();
                        }
                        kdh kdhVar2 = new kdh();
                        kdhVar2.b = arrayList;
                        this.m = kdhVar2;
                        if (this.k.K) {
                            ny61.v("Canceled");
                            return null;
                        }
                        if (kdhVar2.a >= arrayList.size()) {
                            ny61.p();
                            return null;
                        }
                        int i3 = kdhVar2.a;
                        kdhVar2.a = i3 + 1;
                        c = c((b0l0) arrayList.get(i3), arrayList);
                    } else {
                        int i4 = kdhVar.a;
                        ArrayList arrayList5 = kdhVar.b;
                        if (i4 >= arrayList5.size()) {
                            ny61.p();
                            return null;
                        }
                        int i5 = kdhVar.a;
                        kdhVar.a = i5 + 1;
                        c = c((b0l0) arrayList5.get(i5), null);
                    }
                }
                o2k0 d2 = d(c, c.k);
                return d2 != null ? d2 : c;
            }
            if (h != null) {
                bg61.d(h);
            }
            nci0 nci0Var2 = this.k;
            nci0Var2.x.connectionReleased(nci0Var2, realConnection);
            realConnection.i.getClass();
            if (h != null) {
                realConnection.i.getClass();
            } else if (z) {
                realConnection.i.getClass();
            }
        }
        o2k0Var = null;
        if (o2k0Var == null) {
        }
    }

    public final k4e c(b0l0 b0l0Var, ArrayList arrayList) {
        no0 no0Var = b0l0Var.a;
        if (no0Var.c == null) {
            if (!no0Var.j.contains(j5e.f)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = b0l0Var.a.h.d;
            d72 d72Var = dvc0.a;
            dvc0.a.getClass();
            if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str)) {
                throw new UnknownServiceException(oyr.p("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (no0Var.i.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        d5j0 d5j0Var = null;
        if (b0l0Var.b.type() == Proxy.Type.HTTP) {
            no0 no0Var2 = b0l0Var.a;
            if (no0Var2.c != null || no0Var2.i.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
                t4j0 t4j0Var = new t4j0();
                t4j0Var.a = b0l0Var.a.h;
                t4j0Var.e("CONNECT", null);
                no0 no0Var3 = b0l0Var.a;
                t4j0Var.c.g("Host", bg61.j(no0Var3.h, true));
                t4j0Var.c.g("Proxy-Connection", "Keep-Alive");
                t4j0Var.c.g(ExtFunctionsKt.HEADER_USER_AGENT, "okhttp/5.3.2");
                d5j0Var = new d5j0(t4j0Var);
                cvj0 cvj0Var = new cvj0();
                cvj0Var.a = d5j0Var;
                cvj0Var.b = Protocol.HTTP_1_1;
                cvj0Var.c = 407;
                cvj0Var.d = "Preemptive Authenticate";
                cvj0Var.l = -1L;
                cvj0Var.m = -1L;
                cvj0Var.f.g("Proxy-Authenticate", "OkHttp-Preemptive");
                d5j0 a = no0Var3.f.a(b0l0Var, cvj0Var.a());
                if (a != null) {
                    d5j0Var = a;
                }
            }
        }
        return new k4e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.k, this, b0l0Var, arrayList, 0, d5j0Var, -1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0032, code lost:
    
        if ((r8.j != null) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o2k0 d(k4e k4eVar, List list) {
        RealConnection realConnection;
        boolean z;
        boolean z2;
        Socket h;
        oci0 oci0Var = this.b;
        boolean z3 = this.l;
        no0 no0Var = this.i;
        nci0 nci0Var = this.k;
        boolean z4 = k4eVar != null && k4eVar.isReady();
        Iterator it = oci0Var.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                realConnection = null;
                break;
            }
            realConnection = (RealConnection) it.next();
            synchronized (realConnection) {
                if (z4) {
                    try {
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (realConnection.f(no0Var, list)) {
                    nci0Var.b(realConnection);
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                if (realConnection.g(z3)) {
                    break;
                }
                synchronized (realConnection) {
                    z2 = realConnection.k;
                    realConnection.k = true;
                    h = nci0Var.h();
                }
                if (h != null) {
                    bg61.d(h);
                    oci0Var.b.getClass();
                } else if (!z2) {
                    oci0Var.b.getClass();
                }
            }
        }
        if (realConnection == null) {
            return null;
        }
        if (k4eVar != null) {
            this.o = k4eVar.j;
            Socket socket = k4eVar.r;
            if (socket != null) {
                bg61.d(socket);
            }
        }
        nci0 nci0Var2 = this.k;
        nci0Var2.x.connectionAcquired(nci0Var2, realConnection);
        realConnection.i.getClass();
        return new o2k0(realConnection);
    }
}
