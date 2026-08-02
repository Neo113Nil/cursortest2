package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.fave.FaveItem;
import com.vk.fave.entities.FaveEntry;
import com.vk.fave.entities.FaveType;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.data.b;

/* compiled from: FaveReporter.kt */
/* loaded from: classes4.dex */
public final class qrq {

    /* compiled from: FaveReporter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FaveType.values().length];
            try {
                iArr[FaveType.LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(NewsEntry newsEntry, gmq gmqVar) {
        FaveItem faveItem;
        gnq.a.getClass();
        FaveType e = gnq.e(gmqVar);
        UserId d = gnq.d(gmqVar);
        String f = gnq.f(gmqVar, true);
        FaveEntry faveEntry = newsEntry instanceof FaveEntry ? (FaveEntry) newsEntry : null;
        boolean z = (((faveEntry == null || (faveItem = faveEntry.i) == null) ? null : faveItem.f) instanceof Post) || (newsEntry instanceof Post);
        if (a.$EnumSwitchMapping$0[e.ordinal()] == 1) {
            b.d dVar = new b.d("bookmarks_open_item");
            dVar.b(FaveType.LINK.h(), "type");
            dVar.b(f, "link_url");
            dVar.b(z ? "bookmarks_post" : "bookmarks", "nav_screen");
            dVar.e();
            return;
        }
        b.d a2 = io.reactivex.rxjava3.processors.b.a("bookmarks_open_item", "type", e.h());
        a2.b(d != null ? Long.valueOf(d.b) : null, "owner_id");
        a2.b(f, "item_id");
        a2.b(z ? "bookmarks_post" : "bookmarks", "nav_screen");
        a2.e();
    }
}
