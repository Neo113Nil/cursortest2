package xsna;

import xsna.cbh;

/* compiled from: CommunityProfileHeaderItemsFactoryParams.kt */
/* loaded from: classes5.dex */
public final class zoh {
    public final cbh.a a;
    public final n3h b;

    public zoh(cbh.a aVar, n3h n3hVar) {
        this.a = aVar;
        this.b = n3hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoh)) {
            return false;
        }
        zoh zohVar = (zoh) obj;
        return epx.f(this.a, zohVar.a) && epx.f(this.b, zohVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommunityProfileHeaderItemsFactoryLegacyParams(normalCoverCallback=" + this.a + ", liveCoverConfiguration=" + this.b + ')';
    }
}
