package xsna;

import com.vk.superapp.ui.widgets.menu.CustomMenuInfo;
import com.vkontakte.android.R;

/* compiled from: SuperAppShowcaseMenuItem.kt */
/* loaded from: classes6.dex */
public final class lbn0 extends obn0 {
    public final CustomMenuInfo b;

    public lbn0(CustomMenuInfo customMenuInfo) {
        this.b = customMenuInfo;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_showcase_footer_menu_item;
    }

    @Override // xsna.obn0
    public final CustomMenuInfo c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lbn0) && epx.f(this.b, ((lbn0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }

    public final String toString() {
        return "SuperAppShowcaseFooterItem(customMenuInfo=" + this.b + ", shallowUiMenuInfo=null)";
    }
}
