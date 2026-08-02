package xsna;

/* compiled from: ClipsWrapperFeedItem.kt */
/* loaded from: classes17.dex */
public final class tqf {
    public final int a;
    public final boolean b;
    public final hfz c;

    public tqf(int i, hfz hfzVar, boolean z) {
        this.a = i;
        this.b = z;
        this.c = hfzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqf)) {
            return false;
        }
        tqf tqfVar = (tqf) obj;
        return this.a == tqfVar.a && this.b == tqfVar.b && epx.f(this.c, tqfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qoy.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "ClipsWrapperFeedItem(position=" + this.a + ", isCinemaMode=" + this.b + ", listItem=" + this.c + ')';
    }
}
