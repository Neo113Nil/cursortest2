package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.divider.VkSeparator;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vkontakte.android.R;
import xsna.gko;
import xsna.tlo0;

/* compiled from: ProfileTabOptionsView.kt */
/* loaded from: classes5.dex */
public final class i0e0 implements gm50 {
    public final iyd0 b;
    public final c0e0 c;
    public final bpn0 d;
    public final yzd0 e;

    public i0e0(Context context, c0e0 c0e0Var, iyd0 iyd0Var) {
        this.b = iyd0Var;
        this.c = c0e0Var;
        this.d = new bpn0(new pp00(context, 28));
        bpn0 bpn0Var = new bpn0(new ln20(this, 21));
        bpn0 bpn0Var2 = new bpn0(new e550(this, 16));
        bpn0 bpn0Var3 = new bpn0(new s6y(this, 27));
        bpn0 bpn0Var4 = new bpn0(new rka0(this, 7));
        yzd0 yzd0Var = new yzd0(new b140(this, 11));
        this.e = yzd0Var;
        ((RecyclerView) bpn0Var4.getValue()).setAdapter(yzd0Var);
        ((RecyclerView) bpn0Var4.getValue()).setLayoutManager(new LinearLayoutManager());
        VkTopBar vkTopBar = (VkTopBar) bpn0Var.getValue();
        gko.b bVar = gko.Companion;
        vkTopBar.setBefore(new VkTopBar.c.f(new gko(R.drawable.vk_icon_cancel_outline_28), tq.h(tlo0.Companion, R.string.close), new lbc0(this, 6), new b8g(krv0.m(R.attr.vk_ui_icon_accent_themed, vkTopBar.getContext())), null, 40));
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.f(R.string.user_profile_tab_pin_options_header), null, null, null, null, 30), null, null, null, 14));
        vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_done_outline_28), new tlo0.f(R.string.done), new myd0(this, 1), null, new b8g(krv0.m(R.attr.vk_ui_icon_accent_themed, vkTopBar.getContext())), null, 40), null, 6));
        bwt0.p0((VkSeparator) bpn0Var3.getValue(), true);
        ViewGroup.LayoutParams layoutParams = ((TextView) bpn0Var2.getValue()).getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof ConstraintLayout.b)) {
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar2).topMargin = iah0.a(48);
            float f = 32;
            bVar2.setMarginStart(iah0.a(f));
            bVar2.setMarginEnd(iah0.a(f));
            ((TextView) bpn0Var2.getValue()).setLayoutParams(layoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = ((RecyclerView) bpn0Var4.getValue()).getLayoutParams();
        if (layoutParams2 != null && (layoutParams2 instanceof ConstraintLayout.b)) {
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.b) layoutParams2)).topMargin = iah0.a(4);
            ((RecyclerView) bpn0Var4.getValue()).setLayoutParams(layoutParams2);
        }
        ((TextView) bpn0Var2.getValue()).setText(R.string.user_profile_tab_pin_options_description_com);
        ((TextView) bpn0Var2.getValue()).setTextAppearance(R.style.VkUiTypography_TextNormal);
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.c;
    }
}
