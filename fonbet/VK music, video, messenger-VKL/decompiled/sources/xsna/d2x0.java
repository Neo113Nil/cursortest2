package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.checkbox.VkCheckboxItem;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import xsna.dw20;
import xsna.gm50;
import xsna.mk50;
import xsna.tlo0;

/* compiled from: VoipShareScreenBottomSheet.kt */
/* loaded from: classes7.dex */
public final class d2x0 extends tl50<wyw0, e2x0, vyw0> {
    public static final /* synthetic */ int j1 = 0;
    public b i1;

    /* compiled from: VoipShareScreenBottomSheet.kt */
    public static final class a extends dw20.b {
        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new d2x0();
        }
    }

    /* compiled from: VoipShareScreenBottomSheet.kt */
    public static final class b {
        public final VkCheckboxItem a;
        public final View b;

        public b(VkPlaceholder vkPlaceholder, VkCheckboxItem vkCheckboxItem, View view) {
            this.a = vkCheckboxItem;
            this.b = view;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        View inflate = LayoutInflater.from(mo2getContext()).inflate(new mk50.b(R.layout.voip_screen_share_modal).a, (ViewGroup) null, false);
        this.e0 = new d5j(inflate);
        VkPlaceholder vkPlaceholder = (VkPlaceholder) inflate.findViewById(R.id.voip_screen_share_modal_placeholder);
        this.i1 = new b(vkPlaceholder, (VkCheckboxItem) inflate.findViewById(R.id.voip_screen_share_modal_checkbox), inflate.findViewById(R.id.voip_screen_share_modal_start_btn));
        vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_arrow_up_rectangle_outline_56), new x7g(R.attr.vk_ui_icon_accent), null, 12));
        vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, R.string.voip_screen_share_title)), new VkPlaceholder.b.C0859b(14, new tlo0.f(R.string.voip_screen_share_subtitle))));
        b bVar = this.i1;
        if (bVar == null) {
            bVar = null;
        }
        bVar.a.setListener(new ugm0(this, 7));
        b bVar2 = this.i1;
        jjc.g((bVar2 != null ? bVar2 : null).b, new whw0(this, 7));
        return new mk50.c(inflate);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((e2x0) ao50Var).a, new biw0(this, 8));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        getFeature().f.a(new ljw0(this, 3), this);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new wyw0(new zyw0());
    }
}
