package xsna;

import android.app.Dialog;
import android.content.Context;
import android.util.Size;
import android.view.Window;
import com.vk.clips.design.view.actionlinks.holders.tip.ItemTipView;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.core.view.components.text.VkText;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.views.fragments.add.AddLinkPresenter;
import com.vkontakte.android.actionlinks.views.holders.link.ItemLinkView;
import xsna.ikv0;

/* compiled from: AddLinkView.kt */
/* loaded from: classes7.dex */
public final class cm0 implements xpj {
    public final Context b;
    public final dz20 c;
    public AddLinkPresenter d;
    public ItemTipView e;
    public VkSearchView f;
    public ItemLinkView g;
    public VkText h;
    public RecyclerPaginatedView i;
    public int j = R.string.collection_add_link_hint;
    public dw20 k;

    public cm0(Context context, dz20 dz20Var) {
        this.b = context;
        this.c = dz20Var;
    }

    public final void b(boolean z) {
        RecyclerPaginatedView recyclerPaginatedView = this.i;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        xo2.f(recyclerPaginatedView, false, z, 300L);
    }

    public final void c(boolean z) {
        ItemLinkView itemLinkView = this.g;
        if (itemLinkView == null) {
            itemLinkView = null;
        }
        xo2.f(itemLinkView, false, z, 300L);
    }

    public final void d() {
        ItemTipView itemTipView = this.e;
        if (itemTipView == null) {
            itemTipView = null;
        }
        xo2.f(itemTipView, false, true, 300L);
    }

    @Override // xsna.xpj
    public final void dismiss() {
        dw20 dw20Var = this.k;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        this.k = null;
    }

    public final void f(boolean z) {
        VkText vkText = this.h;
        if (vkText == null) {
            vkText = null;
        }
        xo2.f(vkText, false, z, 300L);
    }

    public final void h(int i) {
        Dialog dialog;
        Window window;
        if (i == 0) {
            return;
        }
        String string = this.b.getString(i);
        dw20 dw20Var = this.k;
        if (dw20Var == null || (dialog = dw20Var.s) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        ikv0.a aVar = new ikv0.a(this.b);
        aVar.u = new ikv0.d(string, (String) null, (ikv0.d.a) null, 6);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_fill_red_24, (Integer) null, (Size) null, 14);
        aVar.p(window);
    }

    public final void i(boolean z) {
        ItemTipView itemTipView = this.e;
        if (itemTipView == null) {
            itemTipView = null;
        }
        xo2.f(itemTipView, true, z, 300L);
    }
}
