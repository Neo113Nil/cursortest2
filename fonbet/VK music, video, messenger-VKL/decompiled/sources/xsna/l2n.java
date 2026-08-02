package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.h4n;

/* compiled from: DiscoverItemsReducer.kt */
/* loaded from: classes4.dex */
public final class l2n implements bm50<t4n, h4n.b> {
    @Override // xsna.bm50
    public final t4n a(t4n t4nVar, h4n.b bVar) {
        u1c0 u1c0Var;
        t4n t4nVar2 = t4nVar;
        h4n.b bVar2 = bVar;
        if (!(bVar2 instanceof h4n.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        h4n.b.a aVar = (h4n.b.a) bVar2;
        for (ol60 ol60Var : t4nVar2.b.b.a) {
            ol60 ol60Var2 = null;
            z1c0 z1c0Var = ol60Var instanceof z1c0 ? (z1c0) ol60Var : null;
            if (z1c0Var != null && (u1c0Var = z1c0Var.h) != null) {
                ol60Var2 = u1c0Var.h;
            }
            if (ol60Var2 instanceof t2n) {
                for (ol60 ol60Var3 : ((t2n) ol60Var2).h) {
                    if (ol60Var3 instanceof b6n) {
                        VideoFile videoFile = aVar.a;
                        boolean z = aVar.b;
                        DiscoverGridItem discoverGridItem = ((b6n) ol60Var3).s;
                        if (discoverGridItem instanceof VideoDiscoverGridItem) {
                            VideoDiscoverGridItem videoDiscoverGridItem = (VideoDiscoverGridItem) discoverGridItem;
                            if (epx.f(videoDiscoverGridItem.j.k.r1(), videoFile.r1())) {
                                videoDiscoverGridItem.j.k.f0(z);
                            }
                        }
                    }
                }
            }
        }
        return t4nVar2;
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(h4n.b bVar) {
        return true;
    }
}
