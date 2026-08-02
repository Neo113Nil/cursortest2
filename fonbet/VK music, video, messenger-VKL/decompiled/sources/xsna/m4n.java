package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.newsfeed.entries.discover.PhotoDiscoverGridItem;
import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.dto.newsfeed.entries.discover.community.CommunityMediaDiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DiscoverMediaPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class m4n extends de {
    public final Object b;
    public final Object c;

    public m4n() {
        x84 x84Var = new x84(7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, x84Var);
        this.c = msy.a(lazyThreadSafetyMode, new y84(4));
    }

    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        NewsEntry newsEntry = u1c0Var.a;
        if (newsEntry instanceof DiscoverMediaBlock) {
            return ((DiscoverMediaBlock) newsEntry).j.size();
        }
        return 0;
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        u1c0 u1c0Var2;
        u1c0 u1c0Var3;
        ImageSize imageSize;
        NewsEntry newsEntry = u1c0Var.a;
        String str = null;
        if (newsEntry instanceof DiscoverMediaBlock) {
            DiscoverMediaBlock discoverMediaBlock = (DiscoverMediaBlock) newsEntry;
            DiscoverGridItem discoverGridItem = (DiscoverGridItem) j5g.b0(i, discoverMediaBlock.j);
            if (discoverGridItem != null) {
                if (discoverGridItem.c.d) {
                    if (discoverGridItem instanceof VideoDiscoverGridItem) {
                        Image image = ((VideoDiscoverGridItem) discoverGridItem).j.k.getImage();
                        ImageSize imageSize2 = (ImageSize) ixj0.m(image.Db() ? image.c : image.b);
                        if (imageSize2 != null) {
                            return imageSize2.d.d;
                        }
                    } else if ((discoverGridItem instanceof PhotoDiscoverGridItem) && (imageSize = (ImageSize) ixj0.m(((PhotoDiscoverGridItem) discoverGridItem).j.l.y.b)) != null) {
                        return imageSize.d.d;
                    }
                } else {
                    if (discoverGridItem instanceof PhotoDiscoverGridItem) {
                        if ((u1c0Var instanceof a160) && (u1c0Var3 = (u1c0) j5g.b0(i, ((a160) u1c0Var).q)) != null) {
                            str = u1c0Var3.l;
                        }
                        return ((PhotoDiscoverGridItem) discoverGridItem).j.l.Fb(q0(discoverMediaBlock, discoverGridItem, str), false).d.d;
                    }
                    if (discoverGridItem instanceof VideoDiscoverGridItem) {
                        int q0 = q0(discoverMediaBlock, discoverGridItem, ((u1c0Var instanceof a160) && (u1c0Var2 = (u1c0) j5g.b0(i, ((a160) u1c0Var).q)) != null) ? u1c0Var2.l : null);
                        Image image2 = ((VideoDiscoverGridItem) discoverGridItem).j.k.getImage();
                        ImageSize imageSize3 = (ImageSize) ixj0.c(image2.Db() ? image2.c : image2.b, q0, q0);
                        if (imageSize3 != null) {
                            return imageSize3.d.d;
                        }
                    } else if (discoverGridItem instanceof CommunityMediaDiscoverGridItem) {
                        return ((CommunityMediaDiscoverGridItem) discoverGridItem).m;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final int q0(DiscoverMediaBlock discoverMediaBlock, DiscoverGridItem discoverGridItem, String str) {
        int i = discoverMediaBlock.l;
        int i2 = i - 1;
        if (i2 < 0) {
            i2 = 0;
        }
        return (((((Number) this.c.getValue()).intValue() - (((Number) this.b.getValue()).intValue() * i2)) / i) * discoverGridItem.e) / (epx.f(str, "wall_group") ? 3 : 1);
    }
}
