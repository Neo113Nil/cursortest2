package xsna;

import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* compiled from: DiscoverDisplayItemsBuilder.kt */
/* loaded from: classes4.dex */
public final class z1n {
    public final gf7 a;

    public z1n(b25 b25Var) {
        this.a = new gf7(b25Var);
    }

    public final void a(DiscoverMediaBlock discoverMediaBlock, i170 i170Var, jzf0 jzf0Var, ArrayList arrayList) {
        DiscoverMediaBlock discoverMediaBlock2;
        ArrayList<DiscoverGridItem> arrayList2 = discoverMediaBlock.j;
        if (discoverMediaBlock.Gb()) {
            arrayList.add(this.a.a(discoverMediaBlock));
        }
        if (discoverMediaBlock.e && arrayList2.isEmpty()) {
            arrayList.add(new u1c0(247, discoverMediaBlock));
            discoverMediaBlock2 = discoverMediaBlock;
        } else {
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            ArrayList arrayList4 = new ArrayList();
            Iterator<DiscoverGridItem> it = arrayList2.iterator();
            while (it.hasNext()) {
                DiscoverGridItem next = it.next();
                jzf0Var.a(next.c.Db(), new y1n(this, discoverMediaBlock, next, i170Var, arrayList4, arrayList3));
            }
            discoverMediaBlock2 = discoverMediaBlock;
            a160 a160Var = new a160(discoverMediaBlock2, discoverMediaBlock2, 233, arrayList3);
            a160Var.h = (ol60) j5g.Y(new w2n().a(0, new Pair<>(discoverMediaBlock2, arrayList4), null));
            arrayList.add(a160Var);
        }
        if (discoverMediaBlock2.Fb()) {
            arrayList.add(new u1c0(246, discoverMediaBlock2));
        }
    }
}
