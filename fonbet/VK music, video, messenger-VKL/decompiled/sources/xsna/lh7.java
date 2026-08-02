package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.Image;
import com.vk.dto.newsfeed.entries.discover.PhotoDiscoverGridItem;
import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedBlurredPhotoView;
import com.vkontakte.android.R;
import xsna.am;
import xsna.e3m;

/* compiled from: BlurredDiscoverGridItemHolderV2.kt */
/* loaded from: classes4.dex */
public class lh7 extends uc6<DiscoverGridItem> {
    public static final int J = cn70.b(48);
    public final RestrictedBlurredPhotoView I;

    static {
        cn70.b(36);
    }

    public lh7(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.blurred_discover_grid_item_v2, viewGroup, false), viewGroup);
        RestrictedBlurredPhotoView restrictedBlurredPhotoView = (RestrictedBlurredPhotoView) this.itemView;
        this.I = restrictedBlurredPhotoView;
        restrictedBlurredPhotoView.setOnClickListener(this);
        restrictedBlurredPhotoView.setOnLongClickListener(this);
        iut0.o(restrictedBlurredPhotoView, am.a.e, this.itemView.getContext().getString(R.string.accessibility_discover_media_ignored_item_show), new y34(this, 4));
        iut0.o(restrictedBlurredPhotoView, am.a.f, this.itemView.getContext().getString(R.string.accessibility_discover_media_open_menu), null);
        restrictedBlurredPhotoView.setDontLoadAgainIfSameResource(true);
        getContext();
        Context context = this.itemView.getContext();
        e3m.a aVar = e3m.a;
        restrictedBlurredPhotoView.c(R.drawable.vk_icon_hide_outline_48, context.getColor(R.color.vk_white), J);
    }

    @Override // xsna.uc6
    public final void U6(DiscoverGridItem discoverGridItem) {
        String n;
        boolean z = discoverGridItem instanceof VideoDiscoverGridItem;
        if (z) {
            Image image = ((VideoDiscoverGridItem) discoverGridItem).j.k.getImage();
            n = ixj0.n(image.Db() ? image.c : image.b);
        } else {
            n = discoverGridItem instanceof PhotoDiscoverGridItem ? ixj0.n(((PhotoDiscoverGridItem) discoverGridItem).j.l.y.b) : null;
        }
        String F5 = z ? ((VideoDiscoverGridItem) discoverGridItem).j.k.F5() : discoverGridItem instanceof PhotoDiscoverGridItem ? ((PhotoDiscoverGridItem) discoverGridItem).j.l.P : null;
        RestrictedBlurredPhotoView restrictedBlurredPhotoView = this.I;
        restrictedBlurredPhotoView.h(n, F5);
        DiscoverGridItem discoverGridItem2 = this.D;
        restrictedBlurredPhotoView.setContentDescription(discoverGridItem2 != null ? R6(discoverGridItem2, Integer.valueOf(R.string.accessibility_discover_media_ignored_item)) : null);
    }

    @Override // xsna.uc6, android.view.View.OnClickListener
    public void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        W6(view);
    }

    public lh7(View view, ViewGroup viewGroup) {
        super(view, viewGroup);
        RestrictedBlurredPhotoView restrictedBlurredPhotoView = (RestrictedBlurredPhotoView) this.itemView;
        this.I = restrictedBlurredPhotoView;
        restrictedBlurredPhotoView.setOnClickListener(this);
        restrictedBlurredPhotoView.setOnLongClickListener(this);
        iut0.o(restrictedBlurredPhotoView, am.a.e, this.itemView.getContext().getString(R.string.accessibility_discover_media_ignored_item_show), new zj0((qh7) this, 2));
        iut0.o(restrictedBlurredPhotoView, am.a.f, this.itemView.getContext().getString(R.string.accessibility_discover_media_open_menu), null);
        restrictedBlurredPhotoView.setDontLoadAgainIfSameResource(true);
        getContext();
        Context context = this.itemView.getContext();
        e3m.a aVar = e3m.a;
        restrictedBlurredPhotoView.c(R.drawable.vk_icon_hide_outline_48, context.getColor(R.color.vk_white), J);
    }
}
