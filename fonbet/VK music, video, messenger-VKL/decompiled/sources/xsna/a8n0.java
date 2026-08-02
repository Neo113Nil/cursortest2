package xsna;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImage;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.api.dto.menu.BadgeInfo;
import com.vk.superapp.design.view.ExpandableMenuElementViewExpanded;
import com.vk.superapp.ext.CounterType;
import com.vk.superapp.ui.widgets.SuperAppShowcaseExpandableServiceMenu;
import com.vkontakte.android.R;

/* compiled from: SuperAppExpandableMenuElementExpandedHolder.kt */
/* loaded from: classes6.dex */
public final class a8n0 extends ucn0<j8q> {
    public final View p;
    public final u7n0 q;
    public final nl r;

    public a8n0(View view, u7n0 u7n0Var, nl nlVar) {
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
        ExpandableMenuElementViewExpanded expandableMenuElementViewExpanded = view instanceof ExpandableMenuElementViewExpanded ? (ExpandableMenuElementViewExpanded) view : null;
        if (expandableMenuElementViewExpanded == null) {
            return;
        }
        TextView textView = expandableMenuElementViewExpanded.h;
        VkImage vkImage = expandableMenuElementViewExpanded.d;
        SuperAppShowcaseExpandableServiceMenu.Payload.MenuItem menuItem = j8qVar.b;
        WebImage webImage = menuItem.g;
        String str = menuItem.f;
        SuperAppShowcaseExpandableServiceMenu.Payload.ExpandableMenuItemType expandableMenuItemType = menuItem.b;
        String str2 = (webImage == null || (f = webImage.f(expandableMenuElementViewExpanded.b)) == null) ? null : f.b;
        String str3 = menuItem.h;
        if (str2 != null) {
            vkImage.setPlaceholderImage(R.drawable.vk_expandable_menu_bg_stub_16);
            zq70.E(vkImage, 3.8d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
            vkImage.o0(str2, null);
        } else if (str3 != null) {
            vkImage.setImageDrawable(this.r.d(vkImage.getContext(), str3));
        }
        SuperAppShowcaseExpandableServiceMenu.Payload.ExpandableMenuItemType expandableMenuItemType2 = SuperAppShowcaseExpandableServiceMenu.Payload.ExpandableMenuItemType.MORE_ITEM;
        if (expandableMenuItemType == expandableMenuItemType2) {
            vkImage.clear();
            Drawable a = m33.a(R.drawable.vk_superapp_menu_more_item_bg, expandableMenuElementViewExpanded.getContext());
            Drawable a2 = m33.a(R.drawable.vk_icon_chevron_right_outline_48, expandableMenuElementViewExpanded.getContext());
            if (a2 != null) {
                a2.setColorFilter(new PorterDuffColorFilter(dhr0.t.c(R.attr.vk_ui_icon_primary), PorterDuff.Mode.SRC_IN));
                drawable = a2;
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{a, drawable});
            layerDrawable.setLayerGravity(0, 17);
            layerDrawable.setLayerGravity(1, 17);
            int i = expandableMenuElementViewExpanded.c;
            layerDrawable.setLayerSize(1, i, i);
            layerDrawable.setLayerInset(1, cn70.b(6), cn70.b(4), cn70.b(2), cn70.b(4));
            vkImage.setBackground(layerDrawable);
        } else {
            vkImage.setBackground(null);
        }
        dz5.h(menuItem.j, CounterType.WITH_PLUS, expandableMenuElementViewExpanded.e, expandableMenuElementViewExpanded.f, null, expandableMenuElementViewExpanded.g, null, null, 104);
        if (expandableMenuItemType == expandableMenuItemType2) {
            textView.setText(expandableMenuElementViewExpanded.getResources().getString(R.string.vk_service_menu_more));
        } else {
            textView.setText(str);
        }
        BadgeInfo badgeInfo = menuItem.j;
        StringBuilder sb = new StringBuilder(str);
        if (badgeInfo != null) {
            int i2 = badgeInfo.e;
            sb.append(", ");
            sb.append(badgeInfo.c ? expandableMenuElementViewExpanded.getContext().getString(R.string.vk_expandable_menu_new_accesibility) : i2 > 0 ? enj.f(R.plurals.vk_expandable_menu_counter_accesibility, i2, expandableMenuElementViewExpanded.getContext()) : badgeInfo.d ? expandableMenuElementViewExpanded.getContext().getString(R.string.vk_expandable_menu_dot_accesibility) : "");
        }
        expandableMenuElementViewExpanded.setContentDescription(sb.toString());
        bwt0.i0(expandableMenuElementViewExpanded, new k22(26, this, j8qVar));
    }
}
