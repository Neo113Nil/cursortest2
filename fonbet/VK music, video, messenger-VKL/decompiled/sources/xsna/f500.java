package xsna;

import xsna.akv;

/* compiled from: LongPollUrl.kt */
/* loaded from: classes3.dex */
public final class f500 {
    public final String a;
    public long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;

    public f500() {
        this(0);
    }

    public final akv.a a() {
        akv.a aVar = new akv.a();
        String str = this.a;
        if (str == null) {
            str = "";
        }
        aVar.a = str;
        aVar.b = false;
        String str2 = this.f;
        if (str2 == null) {
            str2 = "";
        }
        aVar.d("act", str2);
        String str3 = this.d;
        if (str3 == null) {
            str3 = "";
        }
        aVar.d("key", str3);
        aVar.d("wait", String.valueOf(this.c));
        aVar.d("ts", String.valueOf(this.b));
        String str4 = this.e;
        aVar.d("id", str4 != null ? str4 : "");
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f500)) {
            return false;
        }
        f500 f500Var = (f500) obj;
        return epx.f(this.a, f500Var.a) && this.b == f500Var.b && this.c == f500Var.c && epx.f(this.d, f500Var.d) && epx.f(this.e, f500Var.e) && epx.f(this.f, f500Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int a = bh10.a(bh10.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        String str2 = this.d;
        int hashCode = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return hashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LongPollUrl(baseUrl=");
        sb.append(this.a);
        sb.append(", ts=");
        sb.append(this.b);
        sb.append(", wait=");
        sb.append(this.c);
        sb.append(", key=");
        sb.append(this.d);
        sb.append(", id=");
        sb.append(this.e);
        sb.append(", act=");
        return ho8.a(sb, this.f, ')');
    }

    public /* synthetic */ f500(int i) {
        this(0L, 0L, null, null, null, null);
    }

    public f500(long j, long j2, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }
}
