package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.discover.community.CommunityMediaDiscoverGridItem;
import com.vkontakte.android.R;
import xsna.am;

/* compiled from: CommunityMediaRestrictionDiscoverGridItemHolder.kt */
/* loaded from: classes4.dex */
public final class cah extends uc6<CommunityMediaDiscoverGridItem> {
    public final int I;
    public final ViewGroup J;
    public final VkImage K;
    public final View L;
    public final VkImage M;
    public final ImageView N;

    public cah(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.news_community_restriction_discover_grid_item, viewGroup, false), viewGroup);
        this.I = R.string.accessibility_discover_media_ignored_item;
        ViewGroup viewGroup2 = (ViewGroup) this.itemView.findViewById(R.id.news_community_restriction_grid_item_container);
        this.J = viewGroup2;
        VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.news_community_discover_grid_item_preview);
        this.K = vkImage;
        this.L = this.itemView.findViewById(R.id.news_community_discover_grid_item_fade);
        this.M = (VkImage) this.itemView.findViewById(R.id.news_community_discover_grid_item_restriction_icon);
        this.N = (ImageView) this.itemView.findViewById(R.id.news_community_discover_grid_item_icon);
        viewGroup2.setOnClickListener(this);
        viewGroup2.setOnLongClickListener(this);
        iut0.o(viewGroup2, am.a.e, this.itemView.getContext().getString(R.string.accessibility_discover_media_go), null);
        iut0.o(viewGroup2, am.a.f, this.itemView.getContext().getString(R.string.accessibility_discover_media_open_menu), null);
        vkImage.setOnLoadCallback(new a());
        vkImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        kci.o(vkImage, new jwx(2, 12));
    }

    @Override // xsna.uc6
    public final void U6(CommunityMediaDiscoverGridItem communityMediaDiscoverGridItem) {
        CommunityMediaDiscoverGridItem communityMediaDiscoverGridItem2 = communityMediaDiscoverGridItem;
        this.L.setVisibility(4);
        VkImage vkImage = this.M;
        omw.b(vkImage, R.attr.vk_ui_icon_medium);
        VkImage vkImage2 = this.K;
        vkImage2.clear();
        Post R = di60.R(communityMediaDiscoverGridItem2.c);
        ImageView imageView = this.N;
        if (R == null || !R.mc()) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(R.drawable.vk_icon_pin_outline_shadow_28);
            imageView.setVisibility(0);
        }
        CommunityMediaDiscoverGridItem.RestrictionState restrictionState = communityMediaDiscoverGridItem2.p;
        if (restrictionState instanceof CommunityMediaDiscoverGridItem.RestrictionState.Blocked) {
            vkImage.setImageResource(R.drawable.vk_icon_block_outline_24);
            String str = ((CommunityMediaDiscoverGridItem.RestrictionState.Blocked) restrictionState).b;
            if (str != null) {
                vkImage.o0(str, null);
            }
        } else if (restrictionState instanceof CommunityMediaDiscoverGridItem.RestrictionState.Blurred) {
            vkImage.setImageResource(R.drawable.vk_icon_hide_outline_28);
            vkImage2.o0(((CommunityMediaDiscoverGridItem.RestrictionState.Blurred) restrictionState).b, null);
        }
        CommunityMediaDiscoverGridItem communityMediaDiscoverGridItem3 = (CommunityMediaDiscoverGridItem) this.D;
        this.J.setContentDescription(communityMediaDiscoverGridItem3 != null ? R6(communityMediaDiscoverGridItem3, Integer.valueOf(this.I)) : null);
    }

    /* compiled from: CommunityMediaRestrictionDiscoverGridItemHolder.kt */
    public static final class a implements b780 {
        public a() {
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
            cah cahVar = cah.this;
            cahVar.L.setVisibility(0);
            cahVar.M.clearColorFilter();
            cahVar.M.setImageResource(R.drawable.vk_icon_hide_outline_shadow_medium_48);
        }

        @Override // xsna.b780
        public final void g(String str) {
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
        }
    }
}
