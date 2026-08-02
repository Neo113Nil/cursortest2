package xsna;

/* compiled from: VideoPage.kt */
/* loaded from: classes5.dex */
public final class t95 {
    public final izs<Boolean, s3q0> a;
    public final com.vk.repository.internal.repos.stickers.suggests.a b;
    public final gzs<s3q0> c;

    public t95(izs izsVar, com.vk.repository.internal.repos.stickers.suggests.a aVar, gzs gzsVar) {
        this.a = izsVar;
        this.b = aVar;
        this.c = gzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t95)) {
            return false;
        }
        t95 t95Var = (t95) obj;
        return epx.f(this.a, t95Var.a) && this.b.equals(t95Var.b) && epx.f(this.c, t95Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorHeaderLiveCoverPlayerCallbacks(onManualVideoPlaybackActiveChanged=");
        sb.append(this.a);
        sb.append(", onProgressChanged=");
        sb.append(this.b);
        sb.append(", onComplete=");
        return uf3.d(sb, this.c, ')');
    }
}
