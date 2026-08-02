package xsna;

/* compiled from: ImItemListIntractors.kt */
/* loaded from: classes2.dex */
public final class a6w {
    public final z5w a;
    public final com.vk.ecomm.catalog.impl.geo.a b;
    public final g8w c;
    public final tta d;
    public final r8w e;
    public final jsm f;

    public a6w(z5w z5wVar, com.vk.ecomm.catalog.impl.geo.a aVar, g8w g8wVar, tta ttaVar, r8w r8wVar, jsm jsmVar) {
        this.a = z5wVar;
        this.b = aVar;
        this.c = g8wVar;
        this.d = ttaVar;
        this.e = r8wVar;
        this.f = jsmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6w)) {
            return false;
        }
        a6w a6wVar = (a6w) obj;
        return this.a.equals(a6wVar.a) && this.b.equals(a6wVar.b) && this.c.equals(a6wVar.c) && this.d.equals(a6wVar.d) && this.e.equals(a6wVar.e) && epx.f(this.f, a6wVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImItemListIntractors(imItemListInteractor=" + this.a + ", imItemsMetaInteractor=" + this.b + ", imItemsHeaderInteractor=" + this.c + ", channelInteractor=" + this.d + ", imItemsStoriesInteractor=" + this.e + ", dialogsListDependencies=" + this.f + ')';
    }
}
