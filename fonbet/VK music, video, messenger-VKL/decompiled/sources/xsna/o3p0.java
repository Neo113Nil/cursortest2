package xsna;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.vk.core.view.components.search.VkSearchView;
import com.vkontakte.android.R;

/* compiled from: ToolbarSearchVc.kt */
/* loaded from: classes2.dex */
public final class o3p0 {
    public final View a;
    public final VkSearchView b;
    public final aiv0 c;

    public o3p0(View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        View findViewById = view.findViewById(R.id.vkim_search_shadow);
        this.a = findViewById;
        VkSearchView vkSearchView = (VkSearchView) view.findViewById(R.id.vkim_search);
        this.b = vkSearchView;
        this.c = new aiv0(findViewById, vkSearchView);
        toolbar.l(R.menu.vkim_menu_search);
        toolbar.setOnMenuItemClickListener(new b630(this, 14));
        vkSearchView.setOnBackClickListener(new wzb0(this, 18));
        orl.a(vkSearchView);
    }

    public final boolean a() {
        VkSearchView vkSearchView = this.b;
        if (!bwt0.K(vkSearchView)) {
            return false;
        }
        aiv0 aiv0Var = this.c;
        if (aiv0Var.e) {
            return false;
        }
        vkSearchView.setQuery("");
        aiv0Var.a(new k5f0(this));
        return true;
    }
}
