package xsna;

import com.vk.newsfeed.common.discover.media.cells.holders.tags.DiscoverTagType;

/* compiled from: DiscoverTag.kt */
/* loaded from: classes4.dex */
public final class ean {
    public final String a;
    public final DiscoverTagType b;

    public ean() {
        this(null, null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ean)) {
            return false;
        }
        ean eanVar = (ean) obj;
        return epx.f(this.a, eanVar.a) && this.b == eanVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiscoverTag(name=" + this.a + ", type=" + this.b + ')';
    }

    public ean(String str, DiscoverTagType discoverTagType, int i) {
        str = (i & 1) != 0 ? "" : str;
        discoverTagType = (i & 2) != 0 ? DiscoverTagType.SIMPLE_BADGE : discoverTagType;
        this.a = str;
        this.b = discoverTagType;
    }
}
