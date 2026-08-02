package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class dr8 extends ye0 {
    public final Long b;
    public final Long c;
    public final Long w;
    public final long x;

    public dr8(Long l, Long l2, Long l3, long j) {
        super("care.contentWasLoaded");
        this.b = l;
        this.c = l2;
        this.w = l3;
        this.x = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr8)) {
            return false;
        }
        dr8 dr8Var = (dr8) obj;
        return jl40.l(this.b, dr8Var.b) && jl40.l(this.c, dr8Var.c) && jl40.l(this.w, dr8Var.w) && this.x == dr8Var.x;
    }

    public final int hashCode() {
        Long l = this.b;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.c;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.w;
        return Long.hashCode(this.x) + ((hashCode2 + (l3 != null ? l3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PageLoaded(urlModificationTime=" + this.b + ", careRedirectTime=" + this.c + ", webAppLoadedTime=" + this.w + ", webViewReadyTime=" + this.x + Extension.C_BRAKE;
    }
}
