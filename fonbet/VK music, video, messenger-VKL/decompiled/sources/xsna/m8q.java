package xsna;

import com.vkontakte.android.R;

/* compiled from: SuperAppExpandableMenuElementItem.kt */
/* loaded from: classes6.dex */
public final class m8q extends kbn0 {
    public final boolean b;

    public m8q(boolean z) {
        this.b = z;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_showcase_expandable_menu_stub_element_holder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m8q) && this.b == ((m8q) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("ExpandableMenuStubElementItem(isAnimated="), this.b, ')');
    }
}
