package xsna;

/* compiled from: SearchPlaylistCardCallbacks.kt */
/* loaded from: classes16.dex */
public final class hxh0 {
    public final gzs<s3q0> a;
    public final gzs<s3q0> b;
    public final izs<String, s3q0> c;
    public final gzs<s3q0> d;
    public final izs<Boolean, s3q0> e;

    /* JADX WARN: Multi-variable type inference failed */
    public hxh0(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, izs<? super String, s3q0> izsVar, gzs<s3q0> gzsVar3, izs<? super Boolean, s3q0> izsVar2) {
        this.a = gzsVar;
        this.b = gzsVar2;
        this.c = izsVar;
        this.d = gzsVar3;
        this.e = izsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxh0)) {
            return false;
        }
        hxh0 hxh0Var = (hxh0) obj;
        return epx.f(this.a, hxh0Var.a) && epx.f(this.b, hxh0Var.b) && epx.f(this.c, hxh0Var.c) && epx.f(this.d, hxh0Var.d) && epx.f(this.e, hxh0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + sf3.a(dq.c(sf3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchPlaylistCardCallbacks(onClick=");
        sb.append(this.a);
        sb.append(", onMenuClick=");
        sb.append(this.b);
        sb.append(", onVideoClick=");
        sb.append(this.c);
        sb.append(", onAuthorClick=");
        sb.append(this.d);
        sb.append(", onVideosExpanded=");
        return up.c(sb, this.e, ')');
    }
}
