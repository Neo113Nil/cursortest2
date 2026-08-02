package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import okhttp3.TlsVersion;

/* loaded from: classes9.dex */
public final class j5e {
    public static final j5e e;
    public static final j5e f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        gtb gtbVar = gtb.r;
        gtb gtbVar2 = gtb.s;
        gtb gtbVar3 = gtb.t;
        gtb gtbVar4 = gtb.l;
        gtb gtbVar5 = gtb.n;
        gtb gtbVar6 = gtb.m;
        gtb gtbVar7 = gtb.o;
        gtb gtbVar8 = gtb.q;
        gtb gtbVar9 = gtb.p;
        List g = scc.g(gtbVar, gtbVar2, gtbVar3, gtbVar4, gtbVar5, gtbVar6, gtbVar7, gtbVar8, gtbVar9);
        List g2 = scc.g(gtbVar, gtbVar2, gtbVar3, gtbVar4, gtbVar5, gtbVar6, gtbVar7, gtbVar8, gtbVar9, gtb.j, gtb.k, gtb.h, gtb.i, gtb.f, gtb.g, gtb.e);
        i5e i5eVar = new i5e();
        gtb[] gtbVarArr = (gtb[]) g.toArray(new gtb[0]);
        i5eVar.b((gtb[]) Arrays.copyOf(gtbVarArr, gtbVarArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        i5eVar.c(tlsVersion, tlsVersion2);
        i5eVar.d = true;
        i5eVar.a();
        i5e i5eVar2 = new i5e();
        List list = g2;
        gtb[] gtbVarArr2 = (gtb[]) list.toArray(new gtb[0]);
        i5eVar2.b((gtb[]) Arrays.copyOf(gtbVarArr2, gtbVarArr2.length));
        i5eVar2.c(tlsVersion, tlsVersion2);
        i5eVar2.d = true;
        e = i5eVar2.a();
        i5e i5eVar3 = new i5e();
        gtb[] gtbVarArr3 = (gtb[]) list.toArray(new gtb[0]);
        i5eVar3.b((gtb[]) Arrays.copyOf(gtbVarArr3, gtbVarArr3.length));
        i5eVar3.c(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        i5eVar3.d = true;
        i5eVar3.a();
        f = new j5e(false, false, null, null);
    }

    public j5e(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z) {
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        String[] strArr = this.c;
        if (strArr != null) {
            enabledCipherSuites = yf61.k(strArr, enabledCipherSuites, gtb.c);
        }
        String[] strArr2 = this.d;
        String[] k = strArr2 != null ? yf61.k(sSLSocket.getEnabledProtocols(), strArr2, u450.a) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        y0u y0uVar = gtb.c;
        byte[] bArr = yf61.a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (y0uVar.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.a;
        if (!z2) {
            ny61.g("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            ny61.g("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(k, k.length);
        if (!z2) {
            ny61.g("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            ny61.g("At least one TLS version is required");
            return;
        }
        j5e j5eVar = new j5e(z2, this.b, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (j5eVar.c() != null) {
            sSLSocket.setEnabledProtocols(j5eVar.d);
        }
        if (j5eVar.b() != null) {
            sSLSocket.setEnabledCipherSuites(j5eVar.c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(gtb.b.o(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            TlsVersion.Companion.getClass();
            arrayList.add(jjz0.a(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j5e)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j5e j5eVar = (j5e) obj;
        boolean z = j5eVar.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, j5eVar.c) && Arrays.equals(this.d, j5eVar.d) && this.b == j5eVar.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(b(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return unr0.u(sb, this.b, ')');
    }
}
