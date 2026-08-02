package xsna;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImage;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.api.dto.menu.BadgeInfo;
import com.vk.superapp.design.view.ExpandableMenuElementViewCollapsed;
import com.vk.superapp.ext.CounterType;
import com.vk.superapp.ui.widgets.SuperAppShowcaseExpandableServiceMenu;
import com.vkontakte.android.R;

/* compiled from: SuperAppExpandableMenuElementCollapsedHolder.kt */
/* loaded from: classes6.dex */
public final class z7n0 extends ucn0<j8q> {
    public final View p;
    public final u7n0 q;
    public final nl r;

    public z7n0(View view, u7n0 u7n0Var, nl nlVar) {
        super(view, null);
        this.p = view;
        this.q = u7n0Var;
        this.r = nlVar;
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        WebImageSize f;
        j8q j8qVar = (j8q) zif0Var;
        View view = this.itemView;
        Drawable drawable = null;
        ExpandableMenuElementViewCollapsed expandableMenuElementViewCollapsed = view instanceof ExpandableMenuElementViewCollapsed ? (ExpandableMenuElementViewCollapsed) view : null;
        if (expandableMenuElementViewCollapsed == null) {
            return;
        }
        VkImage vkImage = expandableMenuElementViewCollapsed.d;
        SuperAppShowcaseExpandableServiceMenu.Payload.MenuItem menuItem = j8qVar.b;
        WebImage webImage = menuItem.g;
        String str = (webImage == null || (f = webImage.f(expandableMenuElementViewCollapsed.b)) == null) ? null : f.b;
        String str2 = menuItem.h;
        if (str != null) {
            vkImage.setPlaceholderImage(R.drawable.vk_expandable_menu_bg_stub_16);
            zq70.E(vkImage, 3.8d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
            vkImage.o0(str, null);
        } else if (str2 != null) {
            vkImage.setImageDrawable(this.r.d(vkImage.getContext(), str2));
        }
        if (menuItem.b == SuperAppShowcaseExpandableServiceMenu.Payload.ExpandableMenuItemType.MORE_ITEM) {
            vkImage.clear();
            Drawable a = m33.a(R.drawable.vk_superapp_menu_more_item_bg, expandableMenuElementViewCollapsed.getContext());
            Drawable a2 = m33.a(R.drawable.vk_icon_chevron_right_outline_48, expandableMenuElementViewCollapsed.getContext());
            if (a2 != null) {
                a2.setColorFilter(new PorterDuffColorFilter(dhr0.t.c(R.attr.vk_ui_icon_primary), PorterDuff.Mode.SRC_IN));
                drawable = a2;
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{a, drawable});
            layerDrawable.setLayerGravity(0, 17);
            layerDrawable.setLayerGravity(1, 17);
            int i = expandableMenuElementViewCollapsed.c;
            layerDrawable.setLayerSize(1, i, i);
            layerDrawable.setLayerInset(1, cn70.b(6), cn70.b(4), cn70.b(2), cn70.b(4));
            vkImage.setBackground(layerDrawable);
        } else {
            vkImage.setBackground(null);
        }
        dz5.h(menuItem.j, CounterType.WITH_PLUS, expandableMenuElementViewCollapsed.e, expandableMenuElementViewCollapsed.f, null, expandableMenuElementViewCollapsed.g, null, null, 104);
        String str3 = menuItem.f;
        BadgeInfo badgeInfo = menuItem.j;
        StringBuilder sb = new StringBuilder(str3);
        if (badgeInfo != null) {
            int i2 = badgeInfo.e;
            sb.append(", ");
            sb.append(badgeInfo.c ? expandableMenuElementViewCollapsed.getContext().getString(R.string.vk_expandable_menu_new_accesibility) : i2 > 0 ? enj.f(R.plurals.vk_expandable_menu_counter_accesibility, i2, expandableMenuElementViewCollapsed.getContext()) : badgeInfo.d ? expandableMenuElementViewCollapsed.getContext().getString(R.string.vk_expandable_menu_dot_accesibility) : "");
        }
        expandableMenuElementViewCollapsed.setContentDescription(sb.toString());
        bwt0.i0(expandableMenuElementViewCollapsed, new kp5(28, this, j8qVar));
    }
}
