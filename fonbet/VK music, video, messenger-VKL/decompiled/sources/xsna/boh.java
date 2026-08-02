package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: CommunityProfileEmptyContentInfoItem.kt */
/* loaded from: classes5.dex */
public final class boh extends we6 {
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    /* compiled from: CommunityProfileEmptyContentInfoItem.kt */
    public static final class a extends vif0<boh> {
        @Override // xsna.vif0
        public final void i6(boh bohVar) {
            awt0.i(this.itemView, new ji0(this, 27));
        }
    }

    public boh() {
        this(7);
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        View b = tf3.b(viewGroup, R.layout.community_profile_empty_content_item, viewGroup, false);
        a aVar = new a(b);
        VkPlaceholder vkPlaceholder = (VkPlaceholder) b.findViewById(R.id.community_empty_content_placeholder);
        vkPlaceholder.setTop(new VkPlaceholder.c.C0856c(new ulw(this.g), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new lf5("PlaceholderDisabledTabsImage", 3), 3), 62));
        vkPlaceholder.setMiddle(new VkPlaceholder.b(tq.h(tlo0.Companion, this.h), com.vk.core.compose.component.semantics.b.a(null, new lf5("PlaceholderDisabledTabsTitle", 3), 3), new tlo0.f(this.i), com.vk.core.compose.component.semantics.b.a(null, new lf5("PlaceholderDisabledTabsDescription", 3), 3)));
        return aVar;
    }

    @Override // xsna.we6
    public final int h() {
        return this.j;
    }

    public boh(int i) {
        int i2 = (i & 1) != 0 ? R.drawable.vk_icon_illustration_ufo_96 : R.drawable.vk_icon_illustration_cat_closed_wall_78h;
        int i3 = (i & 4) != 0 ? R.string.community_profile_empty_content_subtitle : R.string.community_profile_empty_publish_subtitle;
        this.g = i2;
        this.h = R.string.community_profile_empty_content_title;
        this.i = i3;
        this.j = -226;
    }
}
