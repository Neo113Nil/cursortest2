package xsna;

import com.vk.catalog2.common.dto.api.channel.CatalogChannel;

/* compiled from: CatalogCatalogClickEvents.kt */
/* loaded from: classes16.dex */
public final class b3a implements l3a {
    public final CatalogChannel a;
    public final String b;

    public b3a(CatalogChannel catalogChannel, String str) {
        this.a = catalogChannel;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3a)) {
            return false;
        }
        b3a b3aVar = (b3a) obj;
        return epx.f(this.a, b3aVar.a) && epx.f(this.b, b3aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickCatalogChannelEvent(channel=");
        sb.append(this.a);
        sb.append(", catalogTrackCode=");
        return ho8.a(sb, this.b, ')');
    }
}
