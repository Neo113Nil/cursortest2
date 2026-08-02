package xsna;

import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;

/* compiled from: DiscoverMediaDisplayContext.kt */
/* loaded from: classes4.dex */
public final class d3n {
    public final DiscoverMediaBlock a;
    public final DiscoverGridItem b;
    public final i170 c;

    public d3n(DiscoverMediaBlock discoverMediaBlock, DiscoverGridItem discoverGridItem, i170 i170Var) {
        this.a = discoverMediaBlock;
        this.b = discoverGridItem;
        this.c = i170Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3n)) {
            return false;
        }
        d3n d3nVar = (d3n) obj;
        return epx.f(this.a, d3nVar.a) && epx.f(this.b, d3nVar.b) && epx.f(this.c, d3nVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DiscoverMediaDisplayContext(block=" + this.a + ", gridItem=" + this.b + ", displayItemContext=" + this.c + ')';
    }
}
