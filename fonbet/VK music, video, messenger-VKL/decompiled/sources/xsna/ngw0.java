package xsna;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import xsna.c5v0;
import xsna.dw20;
import xsna.gm50;
import xsna.mk50;
import xsna.tlo0;

/* compiled from: VoipCallByPhoneFragment.kt */
/* loaded from: classes7.dex */
public final class ngw0 extends tl50<mgw0, tgw0, lgw0> {
    public static final /* synthetic */ int n1 = 0;
    public VkFormField i1;
    public VkButton j1;
    public VkButton k1;
    public TextView l1;
    public VkInputSelect m1;

    /* compiled from: VoipCallByPhoneFragment.kt */
    public static final class a extends dw20.b {
        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new ngw0();
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.voip_call_by_phone_dynamic_view, (ViewGroup) null, false);
        c5v0 c5v0Var = new c5v0(requireContext());
        c5v0Var.setTop(new c5v0.c.b(new gko(R.drawable.vk_icon_illustration_call_56), null, null, 12));
        c5v0Var.setMain(new c5v0.b(12, tq.h(tlo0.Companion, R.string.voip_call_by_phone_title), new tlo0.f(R.string.voip_call_by_phone_subtitle)));
        c5v0Var.setBottomContent(inflate);
        c5v0Var.setWithPaddings(true);
        return new mk50.c(c5v0Var);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        Drawable mutate;
        tgw0 tgw0Var = (tgw0) ao50Var;
        this.j1 = (VkButton) view.findViewById(R.id.voip_action_btn);
        this.k1 = (VkButton) view.findViewById(R.id.voip_alternative_btn);
        this.l1 = (TextView) view.findViewById(R.id.voip_label);
        this.i1 = (VkFormField) view.findViewById(R.id.voip_phone_form_layout);
        VkInputSelect vkInputSelect = (VkInputSelect) view.findViewById(R.id.voip_name_input);
        this.m1 = vkInputSelect;
        if (vkInputSelect == null) {
            vkInputSelect = null;
        }
        vkInputSelect.setInputType(3);
        Drawable drawable = requireContext().getDrawable(R.drawable.vk_icon_phone_outline_24);
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setTint(krv0.m(R.attr.vk_ui_icon_secondary, requireContext()));
            VkInputSelect vkInputSelect2 = this.m1;
            if (vkInputSelect2 == null) {
                vkInputSelect2 = null;
            }
            vkInputSelect2.g.setCompoundDrawablesWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        VkFormField vkFormField = this.i1;
        if (vkFormField == null) {
            vkFormField = null;
        }
        vkFormField.setOnActiveEndButtonClickListener(new olt0(this, 4));
        VkButton vkButton = this.j1;
        if (vkButton == null) {
            vkButton = null;
        }
        bwt0.i0(vkButton, new lyl0(this, 19));
        VkButton vkButton2 = this.k1;
        if (vkButton2 == null) {
            vkButton2 = null;
        }
        bwt0.i0(vkButton2, new xka0(this, 29));
        VkInputSelect vkInputSelect3 = this.m1;
        if (vkInputSelect3 == null) {
            vkInputSelect3 = null;
        }
        vkInputSelect3.b(new pcv0(new io.michaelrocks.libphonenumber.android.a(f3a0.a.a(requireContext()), f3a0.c), false, false));
        VkInputSelect vkInputSelect4 = this.m1;
        hg1.a(new io.reactivex.rxjava3.internal.operators.observable.y(new qno0((vkInputSelect4 != null ? vkInputSelect4 : null).getEditText()).U(new b630(new yjs0(7), 22)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).y(300L, TimeUnit.MILLISECONDS).subscribe(new f2u(new xim0(this, 17), 29)), this);
        gm50.a.b(this, tgw0Var.a, new tzq0(this, 7));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        mgw0 mgw0Var = (mgw0) vk50Var;
        mgw0Var.i.a(new u5p0(this, 16), this);
        mgw0Var.j.a(new qzl0(this, 19), this);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        return new mgw0(a1wVar, ((BridgeComponent) m7m.d(this).a(fpf0.a(BridgeComponent.class))).s(), (o6k) p6k.a.getValue(), new qgw0());
    }
}
