package defpackage;

/* loaded from: classes12.dex */
public final class pm6 implements hmm {
    public final String a;

    public pm6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pm6) && jl40.l(this.a, ((pm6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }

    public final String toString() {
        return oyr.p("BubbleContent(title=", this.a, ", iconStartResId=null, onClick=null)");
    }
}
