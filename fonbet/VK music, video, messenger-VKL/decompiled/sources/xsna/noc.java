package xsna;

import androidx.compose.runtime.a;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.feature.news.model.UIBlockFeed;
import com.vk.clips.coauthors.list.common.mvi.entity.viewstate.ClipCoauthorListVS;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import kotlin.Triple;
import xsna.poc;
import xsna.tzp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class noc implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ noc(Object obj, boolean z, Object obj2, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
        this.e = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        pb60 pb60Var;
        s1c0 s1c0Var;
        int i = this.b;
        int i2 = 1;
        Object obj3 = this.e;
        boolean z = this.c;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ClipCoauthorListVS clipCoauthorListVS = (ClipCoauthorListVS) obj4;
                eoc eocVar = (eoc) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                tzp0.c.a aVar2 = poc.l1;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1293987524, intValue, -1, "com.vk.clips.coauthors.list.common.mvi.ClipCoauthorsListBottomSheet.Content.<anonymous>.<anonymous> (ClipCoauthorsListBottomSheet.kt:86)");
                    }
                    boolean y = aVar.y(eocVar);
                    Object x = aVar.x();
                    if (y || x == a.C0011a.a) {
                        poc.e eVar = new poc.e(1, eocVar, eoc.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                        aVar.R(eVar);
                        x = eVar;
                    }
                    pmd.a(clipCoauthorListVS, z, (izs) ((fcy) x), aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                UserId userId = (UserId) obj4;
                pb60 pb60Var2 = (pb60) obj3;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                for (UIBlock uIBlock : arrayList) {
                    if (uIBlock.e.i()) {
                        UIBlockFeed uIBlockFeed = (UIBlockFeed) uIBlock;
                        u1c0 u1c0Var = uIBlockFeed.y;
                        NewsEntry newsEntry = u1c0Var.a;
                        if (newsEntry instanceof Post) {
                            Post post = (Post) newsEntry;
                            if (epx.f(post.m, userId)) {
                                post.J = !z;
                                h170 h170Var = pb60Var2.d;
                                NewsEntry newsEntry2 = u1c0Var.b;
                                int i3 = u1c0Var.c;
                                if (i3 == i2) {
                                    s1c0 s1c0Var2 = u1c0Var.n;
                                    if (s1c0Var2 != null) {
                                        u1c0Var.h = (ol60) j5g.a0(new uy9(h170Var).l(0, new Triple(newsEntry, newsEntry2, s1c0Var2)));
                                    }
                                } else if (i3 == 302 && (s1c0Var = u1c0Var.n) != null) {
                                    u1c0Var.h = (ol60) j5g.a0(new q5w().a(0, new Triple(newsEntry, newsEntry2, s1c0Var)));
                                }
                                pb60Var = pb60Var2;
                                uIBlock = new UIBlockFeed(sua.l(uIBlockFeed), uIBlockFeed.j, uIBlockFeed.y, uIBlockFeed.A, uIBlockFeed.B, uIBlockFeed.k, uIBlockFeed.Qb());
                                arrayList2.add(uIBlock);
                                pb60Var2 = pb60Var;
                                i2 = 1;
                            }
                        }
                    }
                    pb60Var = pb60Var2;
                    arrayList2.add(uIBlock);
                    pb60Var2 = pb60Var;
                    i2 = 1;
                }
                return new UIBlockList(uIBlockList, arrayList2);
        }
    }
}
