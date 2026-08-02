package xsna;

import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.Iterator;
import java.util.Set;
import xsna.svh0;

/* compiled from: DiscoverMediaBlockNewsEntryIndex.kt */
/* loaded from: classes4.dex */
public final class v2n implements svh0<a, DiscoverMediaBlock> {
    public final ph50<NewsEntry, qh50<DiscoverMediaBlock>> a = new ph50<>(0);
    public final qh50<DiscoverMediaBlock> b = new qh50<>(0);

    /* compiled from: DiscoverMediaBlockNewsEntryIndex.kt */
    public static final class a extends svh0.a {
        public final NewsEntry a;

        public a(NewsEntry newsEntry) {
            this.a = newsEntry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ck70.a(new StringBuilder("Key(entry="), this.a, ')');
        }
    }

    @Override // xsna.svh0
    public final Set<DiscoverMediaBlock> a(a aVar) {
        qh50<DiscoverMediaBlock> d = this.a.d(aVar.a);
        if (d != null) {
            return new fzi0(d);
        }
        return null;
    }

    @Override // xsna.svh0
    public final void add(Object obj) {
        if (obj instanceof DiscoverMediaBlock) {
            DiscoverMediaBlock discoverMediaBlock = (DiscoverMediaBlock) obj;
            qh50<DiscoverMediaBlock> qh50Var = this.b;
            if (qh50Var.a(discoverMediaBlock)) {
                remove(discoverMediaBlock);
            }
            qh50Var.e(discoverMediaBlock);
            Iterator<DiscoverGridItem> it = discoverMediaBlock.j.iterator();
            while (it.hasNext()) {
                NewsEntry newsEntry = it.next().c;
                qh50<DiscoverMediaBlock> qh50Var2 = new qh50<>((Object) null);
                ph50<NewsEntry, qh50<DiscoverMediaBlock>> ph50Var = this.a;
                qh50<DiscoverMediaBlock> e = ph50Var.e(newsEntry, qh50Var2);
                e.e(discoverMediaBlock);
                if (!ph50Var.b(newsEntry)) {
                    ph50Var.p(newsEntry, e);
                }
            }
        }
    }

    @Override // xsna.svh0
    public final void clear() {
        this.a.h();
        this.b.f();
    }

    @Override // xsna.svh0
    public final void remove(Object obj) {
        if (obj instanceof DiscoverMediaBlock) {
            ph50<NewsEntry, qh50<DiscoverMediaBlock>> ph50Var = this.a;
            Object[] objArr = ph50Var.c;
            long[] jArr = ph50Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ((qh50) objArr[(i << 3) + i3]).m(obj);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            this.b.m(obj);
        }
    }
}
