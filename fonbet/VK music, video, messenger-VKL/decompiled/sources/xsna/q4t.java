package xsna;

/* compiled from: GalleryState.kt */
/* loaded from: classes4.dex */
public abstract class q4t {
    public abstract String a();

    public abstract int b();

    public abstract long c();

    public abstract String d();

    public abstract int e();

    public final boolean equals(Object obj) {
        q4t q4tVar = obj instanceof q4t ? (q4t) obj : null;
        return q4tVar != null && q4tVar.c() == c() && epx.f(((q4t) obj).a(), a());
    }

    public final int hashCode() {
        return a().hashCode() + Long.hashCode(c());
    }
}
