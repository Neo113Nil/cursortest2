package xsna;

import com.vk.superapp.ui.widgets.menu.CustomMenuInfo;
import com.vkontakte.android.R;

/* compiled from: SuperAppShowcaseMenuItem.kt */
/* loaded from: classes6.dex */
public final class jbn0 extends obn0 {
    public final CustomMenuInfo b;

    public jbn0(CustomMenuInfo customMenuInfo) {
        this.b = customMenuInfo;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_showcase_menu_item;
    }

    @Override // xsna.obn0
    public final CustomMenuInfo c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jbn0) && epx.f(this.b, ((jbn0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }

    public final String toString() {
        return "SuperAppShowcaseDefaultMenuItem(customMenuInfo=" + this.b + ", shallowUiMenuInfo=null)";
    }
}
