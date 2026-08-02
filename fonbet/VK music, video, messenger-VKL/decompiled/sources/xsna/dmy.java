package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: LastRecommendedItemRemovedModifier.kt */
/* loaded from: classes4.dex */
public final class dmy implements wm60 {
    public final NewsEntry a;

    public dmy(NewsEntry newsEntry) {
        this.a = newsEntry;
    }

    @Override // xsna.wm60
    public final boolean a(wm60 wm60Var) {
        return true;
    }

    @Override // xsna.wm60
    public final wm60 b(wm60 wm60Var) {
        return wm60Var != null ? new aag(wm60Var, this) : this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wm60
    public final List<u1c0> c(List<? extends u1c0> list, i170 i170Var) {
        NewsEntry newsEntry = i170Var.a;
        if (!epx.f(newsEntry, this.a)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        new com.vk.newsfeed.common.util.j();
        u1c0 u1c0Var = new u1c0(288, newsEntry);
        ListBuilder e = e43.e();
        e.add(new fwv(y8g0.e(R.string.newsfeed_block_all_recommendations_closed_title), y8g0.e(R.string.newsfeed_block_all_recommendations_closed_message), newsEntry));
        u1c0Var.h = (ol60) j5g.a0(e.g());
        newsEntry.c = false;
        u1c0Var.e = false;
        u1c0Var.d = 6;
        arrayList.add(u1c0Var);
        return arrayList;
    }
}
