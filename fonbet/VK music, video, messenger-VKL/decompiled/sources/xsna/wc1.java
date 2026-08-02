package xsna;

/* compiled from: GalleryState.kt */
/* loaded from: classes4.dex */
public class wc1 {
    public final String a;
    public final int b;

    public wc1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        wc1 wc1Var = obj instanceof wc1 ? (wc1) obj : null;
        return wc1Var != null && wc1Var.b == this.b && epx.f(((wc1) obj).a, this.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
