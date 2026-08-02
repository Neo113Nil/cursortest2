package xsna;

import com.vkontakte.android.R;

/* compiled from: SuperAppShowcaseMenuStubItem.kt */
/* loaded from: classes6.dex */
public final class qbn0 extends a9n0 implements d9n0 {
    public final int b = R.attr.vk_ui_background_tertiary;

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_showcase_menu_stub;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qbn0) && this.b == ((qbn0) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return h5s.c(this.b, ", animate=false)", new StringBuilder("SuperAppShowcaseMenuStubItem(colorAttr="));
    }
}
