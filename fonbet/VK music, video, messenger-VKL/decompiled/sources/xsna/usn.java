package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import io.jsonwebtoken.JwtParser;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import okhttp3.Protocol;
import okhttp3.c;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okhttp3.l;
import okhttp3.m;
import okhttp3.o;
import okhttp3.p;
import ru.ok.android.commons.http.Http;

/* compiled from: DnsOverHttps.kt */
/* loaded from: classes8.dex */
public final class usn implements tsn {
    public static final okhttp3.m e;
    public final okhttp3.o b;
    public final okhttp3.l c;
    public final boolean d;

    /* compiled from: DnsOverHttps.kt */
    public static final class a {
        public okhttp3.o a;
        public okhttp3.l b;
        public boolean c = true;
        public List<? extends InetAddress> d;

        public final usn a() {
            okhttp3.o oVar = this.a;
            if (oVar == null) {
                throw new NullPointerException("client not set");
            }
            o.a e = oVar.e();
            okhttp3.m mVar = usn.e;
            List<? extends InetAddress> list = this.d;
            e.d(list != null ? new h18(this.b.d, list) : tsn.l7);
            okhttp3.o oVar2 = new okhttp3.o(e);
            okhttp3.l lVar = this.b;
            if (lVar != null) {
                return new usn(oVar2, lVar, this.c);
            }
            throw new IllegalStateException("url not set");
        }
    }

    static {
        Pattern pattern = okhttp3.m.e;
        e = m.a.a("application/dns-message");
    }

    public usn(okhttp3.o oVar, okhttp3.l lVar, boolean z) {
        this.b = oVar;
        this.c = lVar;
        this.d = z;
    }

    public static void c(okhttp3.u uVar, String str, ArrayList arrayList, ArrayList arrayList2) {
        try {
            ArrayList d = d(str, uVar);
            synchronized (arrayList) {
                arrayList.addAll(d);
            }
        } catch (Exception e2) {
            synchronized (arrayList2) {
                arrayList2.add(e2);
            }
        }
    }

    public static ArrayList d(String str, okhttp3.u uVar) throws Exception {
        if (uVar.j == null && uVar.c != Protocol.HTTP_2) {
            fta0 fta0Var = fta0.a;
            fta0.j(fta0.a, "Incorrect protocol: " + uVar.c, 4);
        }
        try {
            if (!uVar.t()) {
                throw new IOException("response: " + uVar.e + ' ' + uVar.d);
            }
            okhttp3.v vVar = uVar.h;
            if (vVar.contentLength() <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                ArrayList a2 = wsn.a(str, vVar.source().H0());
                uVar.close();
                return a2;
            }
            throw new IOException("response size exceeds limit (65536 bytes): " + vVar.contentLength() + " bytes");
        } finally {
        }
    }

    @Override // xsna.tsn
    public final List<InetAddress> a(String str) throws UnknownHostException {
        if (PublicSuffixDatabase.g.a(str) == null) {
            throw new UnknownHostException("private hosts not resolved");
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(2);
        ArrayList arrayList3 = new ArrayList(5);
        b(str, arrayList, arrayList3, arrayList2, 1);
        if (this.d) {
            b(str, arrayList, arrayList3, arrayList2, 28);
        }
        CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ArrayList arrayList4 = arrayList3;
            arrayList3 = arrayList4;
            ((okhttp3.d) it.next()).f9(new vsn(arrayList2, countDownLatch, this, str, arrayList4));
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            arrayList2.add(e2);
        }
        if (!arrayList3.isEmpty()) {
            return arrayList3;
        }
        if (arrayList2.isEmpty()) {
            throw new UnknownHostException(str);
        }
        Exception exc = (Exception) arrayList2.get(0);
        if (exc instanceof UnknownHostException) {
            throw exc;
        }
        UnknownHostException unknownHostException = new UnknownHostException(str);
        unknownHostException.initCause(exc);
        int size = arrayList2.size();
        for (int i = 1; i < size; i++) {
            mnh0.d(unknownHostException, (Throwable) arrayList2.get(i));
        }
        throw unknownHostException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0108, code lost:
    
        if (r2.e != 504) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i) {
        List<String> list;
        okhttp3.u execute;
        p.a aVar = new p.a();
        aVar.c.h(Http.Header.ACCEPT, e.a);
        int i2 = wsn.a;
        vl8 vl8Var = new vl8();
        vl8Var.P(0);
        vl8Var.P(256);
        vl8Var.P(1);
        vl8Var.P(0);
        vl8Var.P(0);
        vl8Var.P(0);
        vl8 vl8Var2 = new vl8();
        List b0 = drm0.b0(str, new char[]{JwtParser.SEPARATOR_CHAR}, 0, 6);
        if (!b0.isEmpty()) {
            ListIterator listIterator = b0.listIterator(b0.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    list = j5g.H0(b0, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        list = EmptyList.b;
        for (String str2 : list) {
            long s = s1v.s(str2);
            if (s != str2.length()) {
                throw new IllegalArgumentException("non-ascii hostname: ".concat(str).toString());
            }
            vl8Var2.I((int) s);
            vl8Var2.Q(0, str2.length(), str2);
        }
        vl8Var2.I(0);
        vl8Var2.p(vl8Var, 0L, vl8Var2.c);
        vl8Var.P(i);
        vl8Var.P(1);
        String y = brm0.y(vl8Var.F0(vl8Var.c).i(), "=", "");
        l.a f = this.c.f();
        f.a("dns", y);
        aVar.a = f.b();
        okhttp3.p b = aVar.b();
        okhttp3.o oVar = this.b;
        if (oVar.l != null) {
            try {
                c.a aVar2 = new c.a();
                aVar2.d = true;
                okhttp3.c a2 = aVar2.a();
                p.a b2 = b.b();
                b2.c(a2);
                execute = ((f8f0) oVar.a(b2.b())).execute();
            } catch (IOException unused) {
            }
        }
        execute = null;
        if (execute != null) {
            c(execute, str, arrayList2, arrayList3);
        } else {
            arrayList.add(oVar.a(b));
        }
    }

    public final okhttp3.l e() {
        return this.c;
    }
}
