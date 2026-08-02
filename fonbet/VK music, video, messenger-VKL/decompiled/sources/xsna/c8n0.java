package xsna;

import com.vk.superapp.ui.widgets.SuperAppShowcaseExpandableServiceMenu;
import com.vk.superapp.ui.widgets.SuperAppWidgetSize;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: SuperAppExpandableMenuItem.kt */
/* loaded from: classes6.dex */
public final class c8n0 extends x8n0 {
    public final String b;
    public final List<SuperAppShowcaseExpandableServiceMenu.Payload.MenuItem> c;

    public c8n0(String str, List<SuperAppShowcaseExpandableServiceMenu.Payload.MenuItem> list) {
        super(SuperAppWidgetSize.REGULAR);
        this.b = str;
        this.c = list;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_showcase_expandable_menu_holder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8n0)) {
            return false;
        }
        c8n0 c8n0Var = (c8n0) obj;
        return epx.f(this.b, c8n0Var.b) && epx.f(this.c, c8n0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppExpandableMenuItem(uid=");
        sb.append(this.b);
        sb.append(", items=");
        return ms9.a(')', sb, this.c);
    }
}
