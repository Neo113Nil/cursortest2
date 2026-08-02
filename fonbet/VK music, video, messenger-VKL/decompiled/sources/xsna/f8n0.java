package xsna;

import com.vkontakte.android.R;

/* compiled from: SuperAppExpandableMenuStubItem.kt */
/* loaded from: classes6.dex */
public final class f8n0 extends c9n0 {
    public final boolean b = true;

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_showcase_expandable_menu_stub_holder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f8n0) && this.b == ((f8n0) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("SuperAppExpandableMenuStubItem(animate="), this.b, ')');
    }
}
