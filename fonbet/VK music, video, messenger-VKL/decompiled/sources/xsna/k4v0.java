package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.feature.music.dto.ui.UiBlockInteractiveVkMix;
import com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.wln0;

/* compiled from: VkMixInflaterDelegate.kt */
/* loaded from: classes16.dex */
public final class k4v0 {
    public final l4v0 a;
    public final aud b;
    public ViewGroup c;
    public yiq<VkButton> d;
    public yiq<VkButton> e;

    public k4v0(l4v0 l4v0Var, aud audVar) {
        this.a = l4v0Var;
        this.b = audVar;
    }

    public static void g(VkButton vkButton, boolean z, UIBlockActionOpenUrl uIBlockActionOpenUrl) {
        boolean z2 = false;
        boolean z3 = uIBlockActionOpenUrl != null;
        if (z && z3) {
            z2 = true;
        }
        bwt0.p0(vkButton, z2);
        if (z3) {
            vkButton.setText(uIBlockActionOpenUrl != null ? uIBlockActionOpenUrl.z : null);
            vkButton.setIconTint(ColorStateList.valueOf(vkButton.getContext().getColor(R.color.vk_white)));
            String str = uIBlockActionOpenUrl != null ? uIBlockActionOpenUrl.C : null;
            if (epx.f(str, "download_outline_16")) {
                vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_download_outline_16));
            } else if (epx.f(str, "search_16")) {
                vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_search_outline_16));
            }
        }
    }

    public final int a() {
        int i;
        ViewGroup viewGroup = this.c;
        if (viewGroup == null) {
            viewGroup = null;
        }
        Context context = viewGroup.getContext();
        HashSet hashSet = iah0.a;
        if (fnj.d(context)) {
            ViewGroup viewGroup2 = this.c;
            i = fnj.a((viewGroup2 != null ? viewGroup2 : null).getContext());
        } else {
            i = 0;
        }
        l4v0 l4v0Var = this.a;
        return (l4v0Var != null ? l4v0Var.g.P0().intValue() : 0) + i;
    }

    public final void b(MusicBaseVkMixInteractiveVh.b bVar) {
        yiq<VkButton> yiqVar = this.d;
        if (yiqVar == null) {
            yiqVar = null;
        }
        jjc.g(yiqVar.b, new ohq0(2, this, bVar));
        yiq<VkButton> yiqVar2 = this.e;
        jjc.g((yiqVar2 != null ? yiqVar2 : null).b, new vfo0(4, this, bVar));
    }

    public final String c() {
        UIBlockPlaceholder uIBlockPlaceholder;
        aud audVar = this.b;
        boolean d = audVar.d();
        UiBlockInteractiveVkMix a = audVar.a();
        if (!d) {
            if (a != null) {
                return a.A;
            }
            return null;
        }
        if (a == null || (uIBlockPlaceholder = a.D) == null) {
            return null;
        }
        return uIBlockPlaceholder.D;
    }

    public final int d(zs20 zs20Var, zs20 zs20Var2) {
        ViewGroup viewGroup = this.c;
        if (viewGroup == null) {
            viewGroup = null;
        }
        Context context = viewGroup.getContext();
        if (context == null) {
            return 0;
        }
        if (iah0.s(context) || fnj.d(context)) {
            zs20Var = zs20Var2;
        }
        return a() + e3m.a(this.b.d() ? zs20Var.d : zs20Var.c, context);
    }

    public final void e(ViewGroup viewGroup) {
        this.c = viewGroup;
        VkButton vkButton = (VkButton) bwt0.p(viewGroup, R.id.button_placeholder_first, null, null, 6);
        this.e = new yiq<>((VkButton) bwt0.p(viewGroup, R.id.button_placeholder_second, null, null, 6), true, this.a, this.b, new wln0.a(140L, 1));
        this.d = new yiq<>(vkButton, true, this.a, this.b, new wln0.a(140L, 1));
    }

    public final void f(VkButton vkButton, p01 p01Var) {
        vkButton.findViewById(R.id.ds_internal_button_trailing_icon).setOnClickListener(p01Var);
    }

    public final void h(boolean z) {
        yiq<VkButton> yiqVar = this.d;
        if (yiqVar == null) {
            yiqVar = null;
        }
        VkButton vkButton = yiqVar.b;
        aud audVar = this.b;
        g(vkButton, z, (UIBlockActionOpenUrl) j5g.a0(audVar.c()));
        yiq<VkButton> yiqVar2 = this.e;
        if (yiqVar2 == null) {
            yiqVar2 = null;
        }
        g(yiqVar2.b, z, audVar.c().size() > 1 ? (UIBlockActionOpenUrl) audVar.c().get(1) : null);
    }

    public final void i(VkButton vkButton, boolean z) {
        vkButton.setIconTint(ColorStateList.valueOf(vkButton.getContext().getColor(R.color.vk_white)));
        vkButton.setMode(z ? VkButton.Mode.Primary : VkButton.Mode.Secondary);
        vkButton.setBackgroundTint(z ? R.attr.vk_ui_background_contrast : R.attr.vk_ui_background_contrast_secondary_alpha);
        vkButton.a5(true, z ? null : Integer.valueOf(R.drawable.vk_icon_sliders_outline_16));
        vkButton.d5(z ? Integer.valueOf(R.drawable.vk_icon_cancel_16) : null);
        if (z) {
            View findViewById = vkButton.findViewById(R.id.ds_internal_button_trailing_icon);
            findViewById.setContentDescription(vkButton.getContext().getString(R.string.accessibility_cancel_vkmix_settings));
            findViewById.setImportantForAccessibility(1);
        }
    }

    public final void j(View view, zs20 zs20Var, zs20 zs20Var2, izs<? super Integer, s3q0> izsVar) {
        ViewGroup viewGroup = this.c;
        if (viewGroup == null) {
            viewGroup = null;
        }
        Context context = viewGroup.getContext();
        if (context == null) {
            return;
        }
        int d = d(zs20Var, zs20Var2);
        if (iah0.s(context) || fnj.d(context)) {
            zs20Var = zs20Var2;
        }
        izsVar.invoke(Integer.valueOf(d));
        f4m.t(a() + e3m.a(zs20Var.b, context), view);
        ViewGroup viewGroup2 = this.c;
        ViewGroup viewGroup3 = viewGroup2 != null ? viewGroup2 : null;
        ViewGroup.LayoutParams layoutParams = viewGroup3.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = a() + e3m.a(zs20Var.a, context);
        viewGroup3.setLayoutParams(layoutParams);
    }
}
