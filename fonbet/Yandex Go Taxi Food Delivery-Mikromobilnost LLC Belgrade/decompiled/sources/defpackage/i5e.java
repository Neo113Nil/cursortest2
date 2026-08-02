package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.TlsVersion;

/* loaded from: classes9.dex */
public final class i5e {
    public final boolean a = true;
    public String[] b;
    public String[] c;
    public boolean d;

    public final j5e a() {
        return new j5e(this.a, this.d, this.b, this.c);
    }

    public final void b(gtb... gtbVarArr) {
        boolean z = this.a;
        if (!z) {
            ny61.g("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(gtbVarArr.length);
        for (gtb gtbVar : gtbVarArr) {
            arrayList.add(gtbVar.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!z) {
            ny61.g("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.b = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            ny61.g("At least one cipher suite is required");
        }
    }

    public final void c(TlsVersion... tlsVersionArr) {
        boolean z = this.a;
        if (!z) {
            ny61.g("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(tlsVersionArr.length);
        for (TlsVersion tlsVersion : tlsVersionArr) {
            arrayList.add(tlsVersion.getJavaName());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!z) {
            ny61.g("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.c = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            ny61.g("At least one TLS version is required");
        }
    }
}
