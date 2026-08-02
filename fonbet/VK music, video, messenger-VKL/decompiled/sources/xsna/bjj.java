package xsna;

/* compiled from: ContentProductsAction.kt */
/* loaded from: classes18.dex */
public final class bjj implements xij {
    public final String b;

    public bjj(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bjj) && epx.f(this.b, ((bjj) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ToShop(link="), this.b, ')');
    }
}
