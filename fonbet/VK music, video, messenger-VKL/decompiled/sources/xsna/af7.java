package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.PostActions;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;

/* compiled from: BlockFooterHolder.kt */
/* loaded from: classes4.dex */
public final class af7 extends qi6<NewsEntry> implements View.OnClickListener {
    public final TextView C;
    public final TextView D;

    public af7(ViewGroup viewGroup) {
        super(R.layout.newsfeed_block_footer, viewGroup);
        TextView textView = (TextView) this.itemView.findViewById(R.id.newsfeed_block_footer_button);
        this.C = textView;
        this.D = (TextView) this.itemView.findViewById(R.id.newsfeed_block_footer_text);
        textView.setOnClickListener(this);
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        if (newsEntry instanceof DiscoverMediaBlock) {
            DiscoverMediaBlock discoverMediaBlock = (DiscoverMediaBlock) newsEntry;
            xo9.A(this.D, discoverMediaBlock.n);
            xo9.A(this.C, discoverMediaBlock.o);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        NewsEntry q6 = q6();
        if (q6 instanceof DiscoverMediaBlock) {
            DiscoverMediaBlock discoverMediaBlock = (DiscoverMediaBlock) q6;
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            u1c0 J0 = J0();
            new bjc(c, SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), Integer.valueOf(J0 != null ? J0.k : 0), new MobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock(discoverMediaBlock.p.b))).q();
            u1c0 J02 = J0();
            int i = J02 != null ? J02.k : 0;
            s980 s980Var = this.y;
            if (s980Var != null) {
                s980Var.d9(discoverMediaBlock, t6(), PostActions.ACTION_OPEN_DISCOVER_MEDIA.h(), i);
            }
        }
    }
}
