package xsna;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.tool.view.FlowLayout;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.design.view.newsfeed.discover.description.FeedDiscoverDescriptionView;
import com.vk.feed.design.view.newsfeed.discover.video.FeedVideoDiscoverItemView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.am;

/* compiled from: VideoPreviewDiscoverGridItemHolderV2.kt */
/* loaded from: classes4.dex */
public final class y5t0 extends uc6<VideoDiscoverGridItem> {
    public final FeedVideoDiscoverItemView I;
    public final Object J;

    public y5t0(ViewGroup viewGroup, m2c0 m2c0Var) {
        super(tf3.b(viewGroup, R.layout.item_discover_grid_video_v3, viewGroup, false), viewGroup);
        FeedVideoDiscoverItemView feedVideoDiscoverItemView = (FeedVideoDiscoverItemView) this.itemView;
        this.I = feedVideoDiscoverItemView;
        this.J = msy.a(LazyThreadSafetyMode.NONE, new ivs0(m2c0Var, 2));
        getContext();
        feedVideoDiscoverItemView.setOnClickListener(this);
        feedVideoDiscoverItemView.setOnLongClickListener(this);
        iut0.o(feedVideoDiscoverItemView, am.a.e, this.itemView.getContext().getString(R.string.accessibility_discover_media_go), null);
        iut0.o(feedVideoDiscoverItemView, am.a.f, this.itemView.getContext().getString(R.string.accessibility_discover_media_open_menu), null);
        feedVideoDiscoverItemView.setPreviewPlaceholder(new ColorDrawable(krv0.m(R.attr.vk_ui_image_placeholder, this.itemView.getContext())));
        feedVideoDiscoverItemView.setDontLoadAgainIfSameResource(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        feedVideoDiscoverItemView.c = 1;
        feedVideoDiscoverItemView.d = truncateAt;
        FeedDiscoverDescriptionView feedDiscoverDescriptionView = feedVideoDiscoverItemView.j;
        if (feedDiscoverDescriptionView != null) {
            feedDiscoverDescriptionView.b(1, truncateAt);
        }
        feedVideoDiscoverItemView.e = 2;
        feedVideoDiscoverItemView.f = truncateAt;
        FeedDiscoverDescriptionView feedDiscoverDescriptionView2 = feedVideoDiscoverItemView.j;
        if (feedDiscoverDescriptionView2 != null) {
            feedDiscoverDescriptionView2.a(2, truncateAt);
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.uc6
    public final void U6(VideoDiscoverGridItem videoDiscoverGridItem) {
        l3n l3nVar;
        VideoDiscoverGridItem videoDiscoverGridItem2 = videoDiscoverGridItem;
        int i = videoDiscoverGridItem2.e;
        VideoAttachment videoAttachment = videoDiscoverGridItem2.j;
        DiscoverMediaBlock discoverMediaBlock = this.C;
        int i2 = discoverMediaBlock != null ? discoverMediaBlock.l : 3;
        int i3 = i2 - 1;
        boolean z = false;
        if (i3 < 0) {
            i3 = 0;
        }
        int intValue = (((((Number) this.G.getValue()).intValue() - (i3 * this.F)) / i2) * i) / (epx.f(this.u, "wall_group") ? 3 : 1);
        Image image = videoAttachment.k.getImage();
        ImageSize imageSize = (ImageSize) ixj0.c(image.Db() ? image.c : image.b, intValue, intValue);
        String str = imageSize != null ? imageSize.d.d : null;
        FeedVideoDiscoverItemView feedVideoDiscoverItemView = this.I;
        feedVideoDiscoverItemView.g.o0(str, null);
        String str2 = videoDiscoverGridItem2.f;
        if (str2 != null) {
            str2.length();
        }
        int w = (str2 == null || str2.length() == 0) ? 0 : znk0.w(this.itemView.getContext(), str2);
        if (w != 0) {
            this.itemView.getContext();
            LinkedHashMap linkedHashMap = x1z.a;
            Drawable e = krv0.e(w, this.itemView.getContext());
            if (e == null) {
                l3nVar = null;
            } else {
                l3nVar = new l3n();
                l3nVar.a = e;
            }
            feedVideoDiscoverItemView.setForeground(l3nVar);
        } else {
            feedVideoDiscoverItemView.setForeground(null);
        }
        DiscoverGridItem.a aVar = videoDiscoverGridItem2.g;
        String str3 = aVar.a;
        String str4 = aVar.c;
        if ((str3 != null && str3.length() != 0) || (str4 != null && str4.length() != 0)) {
            z = true;
        }
        FlowLayout flowLayout = feedVideoDiscoverItemView.l;
        if (flowLayout != null) {
            f4m.j(flowLayout);
            if (flowLayout.getChildCount() != 0) {
                flowLayout.removeAllViews();
            }
        }
        ?? r4 = this.J;
        ((x1n) r4.getValue()).b();
        if (z) {
            feedVideoDiscoverItemView.setTextStyle((i < 2 || videoDiscoverGridItem2.d < 2) ? FeedVideoDiscoverItemView.TextStyle.Small : FeedVideoDiscoverItemView.TextStyle.Medium);
            feedVideoDiscoverItemView.setBottom(new FeedVideoDiscoverItemView.a.C1049a(str3, str4 != null ? str4.toString() : null));
        } else {
            feedVideoDiscoverItemView.setBottom((FeedVideoDiscoverItemView.a) null);
        }
        List<String> list = videoDiscoverGridItem2.h;
        List<String> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            x1n x1nVar = (x1n) r4.getValue();
            List<String> list3 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(new ean((String) it.next(), null, 2));
            }
            ArrayList<ean> arrayList2 = x1nVar.a.c;
            arrayList2.clear();
            if (!arrayList.isEmpty()) {
                arrayList2.addAll(arrayList);
            }
            feedVideoDiscoverItemView.a((x1n) r4.getValue());
        }
        VideoDiscoverGridItem videoDiscoverGridItem3 = (VideoDiscoverGridItem) this.D;
        feedVideoDiscoverItemView.setContentDescription(videoDiscoverGridItem3 != null ? R6(videoDiscoverGridItem3, Integer.valueOf(R.string.accessibility_discover_media_video)) : null);
    }
}
