package xsna;

import xsna.j8h;

/* compiled from: CommunityHeaderSharedFactoryConfigurations.kt */
/* loaded from: classes5.dex */
public final class n3h {
    public final j8h.a a;
    public final j8h.c b;

    public n3h(j8h.a aVar, j8h.c cVar) {
        this.a = aVar;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3h)) {
            return false;
        }
        n3h n3hVar = (n3h) obj;
        return epx.f(this.a, n3hVar.a) && epx.f(this.b, n3hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommunityHeaderLiveCoverConfiguration(callback=" + this.a + ", dependencyProvider=" + this.b + ')';
    }
}
