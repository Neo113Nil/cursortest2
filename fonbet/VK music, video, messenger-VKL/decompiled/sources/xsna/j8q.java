package xsna;

import com.vk.superapp.ui.widgets.SuperAppShowcaseExpandableServiceMenu;
import com.vkontakte.android.R;

/* compiled from: SuperAppExpandableMenuElementItem.kt */
/* loaded from: classes6.dex */
public final class j8q extends kbn0 {
    public final SuperAppShowcaseExpandableServiceMenu.Payload.MenuItem b;

    public j8q(SuperAppShowcaseExpandableServiceMenu.Payload.MenuItem menuItem) {
        this.b = menuItem;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_showcase_expandable_menu_expanded_element_holder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j8q) && epx.f(this.b, ((j8q) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ExpandableMenuElementItem(menuItemInfo=" + this.b + ')';
    }
}
