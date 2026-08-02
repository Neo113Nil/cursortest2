package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes8.dex */
public final class lq20 {
    public static final kq20 Companion = new kq20();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public /* synthetic */ lq20(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, jq20.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str8;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str9;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq20)) {
            return false;
        }
        return jl40.l(this.b, ((lq20) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder v = b64.v("MobProxy(apiName=", this.a, ", proxyId=", this.b, ", baseUrl=");
        g8e.D(v, this.c, ", host=", this.d, ", ip=");
        g8e.D(v, this.e, ", baseUrlIp=", this.f, ", hostIp=");
        g8e.D(v, this.g, ", ipDefaultHost=", this.h, ", contour=");
        return oyr.t(v, this.i, Extension.C_BRAKE);
    }

    public lq20(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }
}
