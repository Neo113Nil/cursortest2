package okhttp3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import okhttp3.TlsVersion;
import xsna.gw50;
import xsna.j5g;
import xsna.x2r0;

/* compiled from: ConnectionSpec.kt */
/* loaded from: classes11.dex */
public final class f {
    public static final f e;
    public static final f f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    /* compiled from: ConnectionSpec.kt */
    public static final class a {
        public boolean a = true;
        public String[] b;
        public String[] c;
        public boolean d;

        public final f a() {
            return new f(this.a, this.d, this.b, this.c);
        }

        public final void b(String... strArr) {
            if (!this.a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.b = (String[]) strArr.clone();
        }

        public final void c(e... eVarArr) {
            if (!this.a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(eVarArr.length);
            for (e eVar : eVarArr) {
                arrayList.add(eVar.a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final void d(String... strArr) {
            if (!this.a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.c = (String[]) strArr.clone();
        }

        public final void e(TlsVersion... tlsVersionArr) {
            if (!this.a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersionArr.length);
            for (TlsVersion tlsVersion : tlsVersionArr) {
                arrayList.add(tlsVersion.h());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            d((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    static {
        e eVar = e.r;
        e eVar2 = e.s;
        e eVar3 = e.t;
        e eVar4 = e.l;
        e eVar5 = e.n;
        e eVar6 = e.m;
        e eVar7 = e.o;
        e eVar8 = e.q;
        e eVar9 = e.p;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9};
        e[] eVarArr2 = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, e.j, e.k, e.h, e.i, e.f, e.g, e.e};
        a aVar = new a();
        aVar.c((e[]) Arrays.copyOf(eVarArr, 9));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        aVar.e(tlsVersion, tlsVersion2);
        if (!aVar.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        aVar.d = true;
        aVar.a();
        a aVar2 = new a();
        aVar2.c((e[]) Arrays.copyOf(eVarArr2, 16));
        aVar2.e(tlsVersion, tlsVersion2);
        if (!aVar2.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        aVar2.d = true;
        e = aVar2.a();
        a aVar3 = new a();
        aVar3.c((e[]) Arrays.copyOf(eVarArr2, 16));
        aVar3.e(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        if (!aVar3.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        aVar3.d = true;
        aVar3.a();
        f = new f(false, false, null, null);
    }

    public f(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final List<e> a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(e.b.b(str));
        }
        return j5g.O0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null) {
            if (!x2r0.i(gw50.b, strArr, sSLSocket.getEnabledProtocols())) {
                return false;
            }
        }
        String[] strArr2 = this.c;
        if (strArr2 != null) {
            return x2r0.i(e.c, strArr2, sSLSocket.getEnabledCipherSuites());
        }
        return true;
    }

    public final List<TlsVersion> c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            TlsVersion.Companion.getClass();
            arrayList.add(TlsVersion.a.a(str));
        }
        return j5g.O0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        f fVar = (f) obj;
        boolean z = fVar.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, fVar.c) && Arrays.equals(this.d, fVar.d) && this.b == fVar.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(a(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return q0.a(sb, this.b, ')');
    }
}
