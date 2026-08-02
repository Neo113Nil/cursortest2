package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.view.StaticMapView;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.discover.community.CommunityMediaGeoDiscoverGridItem;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.GeoAttachment;
import xsna.am;

/* compiled from: CommunityMediaGeoDiscoverGridItemHolder.kt */
/* loaded from: classes4.dex */
public final class bah extends uc6<CommunityMediaGeoDiscoverGridItem> {
    public final int I;
    public final View J;
    public final ImageView K;
    public final StaticMapView L;

    public bah(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.news_community_geo_discover_grid_item, viewGroup, false), viewGroup);
        this.I = R.string.accessibility_discover_media_geo;
        View findViewById = this.itemView.findViewById(R.id.news_community_geo_grid_item_container);
        this.J = findViewById;
        this.K = (ImageView) this.itemView.findViewById(R.id.news_community_discover_grid_item_icon);
        StaticMapView staticMapView = (StaticMapView) this.itemView.findViewById(R.id.news_community_geo_discover_grid_item_map);
        staticMapView.setEnableInternalClickListener(false);
        dhr0.a.getClass();
        staticMapView.setMapStyle(dhr0.I());
        this.L = staticMapView;
        findViewById.setOnClickListener(this);
        findViewById.setOnLongClickListener(this);
        iut0.o(findViewById, am.a.e, this.itemView.getContext().getString(R.string.accessibility_discover_media_go), null);
        iut0.o(findViewById, am.a.f, this.itemView.getContext().getString(R.string.accessibility_discover_media_open_menu), null);
    }

    @Override // xsna.uc6
    public final void U6(CommunityMediaGeoDiscoverGridItem communityMediaGeoDiscoverGridItem) {
        CommunityMediaGeoDiscoverGridItem communityMediaGeoDiscoverGridItem2 = communityMediaGeoDiscoverGridItem;
        GeoAttachment geoAttachment = communityMediaGeoDiscoverGridItem2.j;
        this.L.e(geoAttachment.f, geoAttachment.g);
        Post R = di60.R(communityMediaGeoDiscoverGridItem2.c);
        ImageView imageView = this.K;
        if (R == null || !R.mc()) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(R.drawable.vk_icon_pin_outline_shadow_28);
            imageView.setVisibility(0);
        }
        CommunityMediaGeoDiscoverGridItem communityMediaGeoDiscoverGridItem3 = (CommunityMediaGeoDiscoverGridItem) this.D;
        this.J.setContentDescription(communityMediaGeoDiscoverGridItem3 != null ? R6(communityMediaGeoDiscoverGridItem3, Integer.valueOf(this.I)) : null);
    }
}
