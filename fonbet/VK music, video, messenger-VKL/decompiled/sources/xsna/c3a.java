package xsna;

import com.vk.catalog2.common.dto.api.channel.CatalogChannel;

/* compiled from: CatalogCatalogClickEvents.kt */
/* loaded from: classes16.dex */
public final class c3a implements l3a {
    public final CatalogChannel a;
    public final String b;

    public c3a(CatalogChannel catalogChannel, String str) {
        this.a = catalogChannel;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3a)) {
            return false;
        }
        c3a c3aVar = (c3a) obj;
        return epx.f(this.a, c3aVar.a) && epx.f(this.b, c3aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JoinChannelEvent(channel=");
        sb.append(this.a);
        sb.append(", trackCode=");
        return ho8.a(sb, this.b, ')');
    }
}
