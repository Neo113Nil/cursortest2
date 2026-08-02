package xsna;

/* compiled from: MarketPriorityBlockModel.kt */
/* loaded from: classes17.dex */
public final class qa10 {
    public final o7d0 a;
    public final com.vk.core.compose.component.semantics.a b;

    public qa10(o7d0 o7d0Var, com.vk.core.compose.component.semantics.a aVar) {
        this.a = o7d0Var;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa10)) {
            return false;
        }
        qa10 qa10Var = (qa10) obj;
        return epx.f(this.a, qa10Var.a) && this.b.equals(qa10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlbumItem(album=" + this.a + ", semanticsConfiguration=" + this.b + ')';
    }
}
