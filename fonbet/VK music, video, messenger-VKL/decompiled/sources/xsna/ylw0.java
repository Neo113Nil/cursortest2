package xsna;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.voip.ui.change_name.VoipChangeNameConfig;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.dw20;
import xsna.gm50;
import xsna.gmw0;
import xsna.mk50;
import xsna.tlw0;
import xsna.xn50;

/* compiled from: VoipChangeNameFragment.kt */
/* loaded from: classes7.dex */
public final class ylw0 extends tl50<vlw0, imw0, tlw0> {
    public static final /* synthetic */ int x1 = 0;
    public ViewFlipper i1;
    public VkButton j1;
    public RecyclerView k1;
    public TextView l1;
    public TextView m1;
    public ImageView n1;
    public TextView o1;
    public ProgressBar p1;
    public VkFormField q1;
    public VkInputSelect r1;
    public VoipChangeNameConfig t1;
    public io.reactivex.rxjava3.disposables.c s1 = EmptyDisposable.INSTANCE;
    public final b u1 = new b();
    public final Object v1 = msy.a(LazyThreadSafetyMode.NONE, new i6m0(this, 16));
    public final bpn0 w1 = new bpn0(new mwm0(this, 22));

    /* compiled from: VoipChangeNameFragment.kt */
    public static final class a extends dw20.b {
        public final VoipChangeNameConfig e;

        public a(Context context, VoipChangeNameConfig voipChangeNameConfig) {
            super(context, tzp0.a(null, 3));
            this.e = voipChangeNameConfig;
            c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            F0(true);
            x(0);
            u(0);
            O();
            B(cn70.b(12), true, true);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            ylw0 ylw0Var = new ylw0();
            ylw0Var.setArguments(yfb.b(new Pair("arg_config", this.e)));
            return ylw0Var;
        }
    }

    /* compiled from: VoipChangeNameFragment.kt */
    public static final class b implements hmw0<gmw0> {
        public b() {
        }

        @Override // xsna.hmw0
        public final void a(gmw0 gmw0Var) {
            boolean z = gmw0Var instanceof gmw0.b;
            ylw0 ylw0Var = ylw0.this;
            if (z) {
                xn50.a.c(ylw0Var, tlw0.e.b.b);
            } else if (gmw0Var instanceof gmw0.c) {
                xn50.a.c(ylw0Var, new tlw0.e.c(((gmw0.c) gmw0Var).a));
            } else {
                if (!(gmw0Var instanceof gmw0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                xn50.a.c(ylw0Var, tlw0.e.a.b);
            }
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        View inflate = LayoutInflater.from(mo2getContext()).inflate(new mk50.b(R.layout.voip_change_name_bottomsheet).a, (ViewGroup) null, false);
        this.e0 = new d5j(inflate);
        return new mk50.c(inflate);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        imw0 imw0Var = (imw0) ao50Var;
        this.j1 = (VkButton) view.findViewById(R.id.voip_change_name_save_btn);
        ViewFlipper viewFlipper = (ViewFlipper) view.findViewById(R.id.voip_change_name_view_flipper);
        AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        alphaAnimation.setDuration(200L);
        viewFlipper.setInAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        alphaAnimation2.setDuration(200L);
        viewFlipper.setOutAnimation(alphaAnimation2);
        this.i1 = viewFlipper;
        this.j1 = (VkButton) view.findViewById(R.id.voip_change_name_save_btn);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        this.k1 = recyclerView;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter((ulw0) this.v1.getValue());
        recyclerView.addItemDecoration(new zgk0(0, iah0.a(8), 0));
        this.l1 = (TextView) view.findViewById(R.id.voip_change_name_error_state_title);
        this.n1 = (ImageView) view.findViewById(R.id.voip_change_name_toolbar_close);
        this.o1 = (TextView) view.findViewById(R.id.voip_change_name_error_state_retry_button);
        this.m1 = (TextView) view.findViewById(R.id.voip_change_name_toolbar_title);
        this.p1 = (ProgressBar) view.findViewById(R.id.voip_change_name_over_content_progress_bar);
        this.q1 = (VkFormField) view.findViewById(R.id.voip_form_layout);
        this.r1 = (VkInputSelect) view.findViewById(R.id.voip_name_input);
        VkFormField vkFormField = this.q1;
        if (vkFormField == null) {
            vkFormField = null;
        }
        vkFormField.setOnActiveEndButtonClickListener(new mdk0(this, 26));
        VkInputSelect vkInputSelect = this.r1;
        if (vkInputSelect == null) {
            vkInputSelect = null;
        }
        vkInputSelect.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.xlw0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                if (!z) {
                    int i = ylw0.x1;
                    return;
                }
                VkInputSelect vkInputSelect2 = ylw0.this.r1;
                VkInputSelect vkInputSelect3 = vkInputSelect2 == null ? null : vkInputSelect2;
                if (vkInputSelect2 == null) {
                    vkInputSelect2 = null;
                }
                Editable text = vkInputSelect2.getText();
                vkInputSelect3.setSelection(text != null ? text.length() : 0);
            }
        });
        VkButton vkButton = this.j1;
        if (vkButton == null) {
            vkButton = null;
        }
        bwt0.i0(vkButton, new kvm0(this, 18));
        ImageView imageView = this.n1;
        if (imageView == null) {
            imageView = null;
        }
        bwt0.i0(imageView, new qjm0(this, 13));
        TextView textView = this.o1;
        if (textView == null) {
            textView = null;
        }
        bwt0.i0(textView, new cus0(this, 10));
        VoipChangeNameConfig voipChangeNameConfig = this.t1;
        if (voipChangeNameConfig != null) {
            int i = voipChangeNameConfig.h;
            TextView textView2 = this.m1;
            if (textView2 == null) {
                textView2 = null;
            }
            Context mo2getContext = mo2getContext();
            textView2.setText(mo2getContext != null ? mo2getContext.getText(i) : null);
        }
        gm50.a.b(this, imw0Var.a, new fuc0(this, 29));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        getFeature().k.a(new r0r0(this, 20), this);
        getFeature().l.a(new xvl0(this, 21), this);
        getFeature().m.a(new wlw0(this, 0), this);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.s1.dispose();
        super.onDestroyView();
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        VoipChangeNameConfig voipChangeNameConfig = (VoipChangeNameConfig) bundle.getParcelable("arg_config");
        if (voipChangeNameConfig == null) {
            throw new IllegalStateException("No config passed");
        }
        this.t1 = voipChangeNameConfig;
        return new vlw0(new cmw0(voipChangeNameConfig), voipChangeNameConfig, new iq6(new vg20()), new jsa(new os9(new p9s0(2, voipChangeNameConfig, this), 2)), new j79(), a201.b().b());
    }
}
