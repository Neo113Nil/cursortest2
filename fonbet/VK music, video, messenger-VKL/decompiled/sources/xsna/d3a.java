package xsna;

import com.vk.catalog2.common.dto.api.channel.CatalogChannel;

/* compiled from: CatalogCatalogClickEvents.kt */
/* loaded from: classes16.dex */
public final class d3a implements l3a {
    public final CatalogChannel a;
    public final String b;

    public d3a(CatalogChannel catalogChannel, String str) {
        this.a = catalogChannel;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3a)) {
            return false;
        }
        d3a d3aVar = (d3a) obj;
        return epx.f(this.a, d3aVar.a) && epx.f(this.b, d3aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeaveChannelEvent(channel=");
        sb.append(this.a);
        sb.append(", trackCode=");
        return ho8.a(sb, this.b, ')');
    }
}
