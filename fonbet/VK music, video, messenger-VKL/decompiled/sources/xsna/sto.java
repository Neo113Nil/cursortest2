package xsna;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.feed.core.models.dzen.DzenNews;
import com.vk.feed.core.models.dzen.DzenNewsItem;
import com.vk.feed.core.models.dzen.DzenStory;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.dzen.DzenNewsCell;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeDzenStoryClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.tlo0;
import xsna.uto;

/* compiled from: DzenNewsItemHolder.kt */
/* loaded from: classes4.dex */
public final class sto extends rp6<uto, DzenNews> implements View.OnClickListener {
    public static final /* synthetic */ int H = 0;
    public final DzenNewsCell E;
    public final int F;
    public final Object G;

    public sto(ViewGroup viewGroup) {
        super(R.layout.news_dzen_item, viewGroup);
        getContext();
        View view = this.itemView;
        DzenNewsCell dzenNewsCell = view instanceof DzenNewsCell ? (DzenNewsCell) view : null;
        this.E = dzenNewsCell;
        Context context = e43.a;
        this.F = e3m.a(R.dimen.dzen_item_icon_size, context != null ? context : null);
        this.G = msy.a(LazyThreadSafetyMode.NONE, new s1m(this, 3));
        getContext();
        if (dzenNewsCell != null) {
            bwt0.h0(this, dzenNewsCell);
        }
    }

    @Override // xsna.rp6
    public final void R6(uto utoVar) {
        uto utoVar2 = utoVar;
        uto.a aVar = utoVar2.h;
        boolean z = aVar instanceof uto.a.C3832a;
        DzenNewsCell.b bVar = null;
        DzenNewsCell dzenNewsCell = this.E;
        if (z) {
            if (dzenNewsCell != null) {
                uto.a.C3832a c3832a = (uto.a.C3832a) aVar;
                String str = c3832a.a;
                int i = this.F;
                dzenNewsCell.setLeft(new DzenNewsCell.a.C1050a(str, new Size(i, i), c3832a.b));
            }
        } else {
            if (!(aVar instanceof uto.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (dzenNewsCell != null) {
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                uto.a.b bVar2 = (uto.a.b) aVar;
                dzenNewsCell.setLeft(new DzenNewsCell.a.b(new eko(new baf0(m33.a(bVar2.a, context), dhr0.t.c(R.attr.vk_ui_icon_secondary))), bVar2.b));
            }
        }
        if (dzenNewsCell != null) {
            dzenNewsCell.setTitle(new DzenNewsCell.c(utoVar2.i));
        }
        int i2 = utoVar2.j;
        if (i2 > 0) {
            tlo0.a aVar2 = tlo0.Companion;
            String k = pvo0.k(i2, this.itemView.getContext().getResources(), false);
            aVar2.getClass();
            bVar = new DzenNewsCell.b(new tlo0.h(k));
        }
        if (dzenNewsCell != null) {
            dzenNewsCell.setSubtitle(bVar);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        uto utoVar = (uto) this.C;
        if (utoVar == null) {
            return;
        }
        DzenNewsItem dzenNewsItem = utoVar.k;
        NewsfeedRouter newsfeedRouter = (NewsfeedRouter) this.G.getValue();
        Context context = this.itemView.getContext();
        String str = dzenNewsItem.d;
        DzenStory dzenStory = dzenNewsItem.e;
        List<? extends NewsEntry> singletonList = Collections.singletonList(dzenStory);
        String a = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_DIGEST_DZEN);
        String str2 = dzenStory.i.b;
        if (str2 == null) {
            str2 = "";
        }
        newsfeedRouter.G(context, str, singletonList, str2, a);
        String str3 = dzenNewsItem.f;
        if (str3 != null) {
            int i = utoVar.l;
            UiTracker uiTracker = UiTracker.a;
            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.DZEN_STORY, null, null, null, str3, null, 46, null), Integer.valueOf(i), new MobileOfficialAppsFeedStat$TypeDzenStoryClick(str3))).q();
        }
    }
}
