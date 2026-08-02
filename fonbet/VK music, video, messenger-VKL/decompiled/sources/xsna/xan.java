package xsna;

import xsna.bx8;

/* compiled from: DiskCacheDownloadRequest.kt */
/* loaded from: classes8.dex */
public final class xan {
    public final dbn a;
    public final bx8.a b;

    public xan(dbn dbnVar, bx8.a aVar) {
        this.a = dbnVar;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xan)) {
            return false;
        }
        xan xanVar = (xan) obj;
        return epx.f(this.a, xanVar.a) && this.b.equals(xanVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiskCacheDownloadRequest(source=" + this.a + ", cacheLoadParams=" + this.b + ")";
    }
}
