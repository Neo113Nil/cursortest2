package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.voip.ui.admin_change_name.VoipAdminChangeNameConfig;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import xsna.dw20;
import xsna.gm50;
import xsna.mk50;

/* compiled from: VoipAdminChangeNameFragment.kt */
/* loaded from: classes7.dex */
public final class cdw0 extends tl50<bdw0, hdw0, adw0> {
    public static final /* synthetic */ int o1 = 0;
    public VkButton i1;
    public ImageView j1;
    public ProgressBar k1;
    public VkFormField l1;
    public VkInputSelect m1;
    public final bpn0 n1 = new bpn0(new d3j0(this, 24));

    /* compiled from: VoipAdminChangeNameFragment.kt */
    public static final class a extends dw20.b {
        public final VoipAdminChangeNameConfig e;

        public a(Context context, VoipAdminChangeNameConfig voipAdminChangeNameConfig) {
            super(context, tzp0.a(null, 3));
            this.e = voipAdminChangeNameConfig;
            c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            F0(true);
            x(0);
            u(0);
            O();
            B(cn70.b(12), true, true);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            cdw0 cdw0Var = new cdw0();
            cdw0Var.setArguments(yfb.b(new Pair("arg_config", this.e)));
            return cdw0Var;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        View inflate = LayoutInflater.from(mo2getContext()).inflate(new mk50.b(R.layout.voip_admin_change_name_bottomsheet).a, (ViewGroup) null, false);
        this.e0 = new d5j(inflate);
        return new mk50.c(inflate);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        hdw0 hdw0Var = (hdw0) ao50Var;
        this.i1 = (VkButton) view.findViewById(R.id.voip_admin_change_name_apply_btn);
        this.j1 = (ImageView) view.findViewById(R.id.voip_change_name_toolbar_close);
        this.k1 = (ProgressBar) view.findViewById(R.id.voip_admin_change_name_over_content_progress_bar);
        TextView textView = (TextView) view.findViewById(R.id.voip_change_name_toolbar_title);
        if (textView == null) {
            textView = null;
        }
        textView.setText(requireContext().getString(R.string.voip_admin_change_name_dialog_toolbar_title));
        this.l1 = (VkFormField) view.findViewById(R.id.voip_form_layout);
        VkInputSelect vkInputSelect = (VkInputSelect) view.findViewById(R.id.voip_name_input);
        this.m1 = vkInputSelect;
        if (vkInputSelect == null) {
            vkInputSelect = null;
        }
        hg1.a(new io.reactivex.rxjava3.internal.operators.observable.y(new qno0(vkInputSelect.getEditText()).U(new gwn0(new fyi0(13), 9)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).y(300L, TimeUnit.MILLISECONDS).subscribe(new hmq0(new e0w0(this, 2), 11)), this);
        VkButton vkButton = this.i1;
        if (vkButton == null) {
            vkButton = null;
        }
        bwt0.i0(vkButton, new mdm0(this, 26));
        VkFormField vkFormField = this.l1;
        if (vkFormField == null) {
            vkFormField = null;
        }
        vkFormField.setOnActiveEndButtonClickListener(new n3b0(this, 29));
        ImageView imageView = this.j1;
        bwt0.i0(imageView != null ? imageView : null, new q9i0(this, 15));
        gm50.a.b(this, hdw0Var.a, new aer0(this, 8));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        getFeature().h.a(new yyl0(this, 25), this);
        getFeature().i.a(new lbt0(this, 4), this);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        VoipAdminChangeNameConfig voipAdminChangeNameConfig = (VoipAdminChangeNameConfig) bundle.getParcelable("arg_config");
        if (voipAdminChangeNameConfig != null) {
            return new bdw0(new fdw0(), voipAdminChangeNameConfig, new jsa(new os9(new ikk0(this, 22), 2)));
        }
        throw new IllegalStateException("No config passed");
    }
}
