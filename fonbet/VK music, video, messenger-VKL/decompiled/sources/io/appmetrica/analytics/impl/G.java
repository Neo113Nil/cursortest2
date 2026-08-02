package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class G {
    public final int a;
    public final int b;
    public final int c;

    public G(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!G.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.id.AdvIdGetterController.CanTrackIdentifiers");
        }
        G g = (G) obj;
        return this.a == g.a && this.b == g.b && this.c == g.c;
    }

    public final int hashCode() {
        return W7.a(this.c) + ((W7.a(this.b) + (W7.a(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "CanTrackIdentifiers(canTrackGaid=" + H.a(this.a) + ", canTrackHoaid=" + H.a(this.b) + ", canTrackYandexAdvId=" + H.a(this.c) + ')';
    }
}
