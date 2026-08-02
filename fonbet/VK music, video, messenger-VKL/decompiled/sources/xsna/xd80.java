package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.superapp.base.js.bridge.data.OnboardingStep;
import com.vkontakte.android.R;

/* compiled from: OnboardingItemViewHolder.kt */
/* loaded from: classes6.dex */
public final class xd80 extends RecyclerView.e0 implements tcr0 {
    public static final float v;
    public static final VKImageController.b w;
    public final VKImageController<View> l;
    public final kog0 m;
    public final TextView n;
    public final TextView o;
    public final VKReplacerView p;
    public final View q;
    public final ImageView r;
    public final View s;
    public final View t;
    public OnboardingStep u;

    static {
        float b = iah0.b(6.0f);
        v = b;
        w = new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new VKImageController.c(b, b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), false, 0, null, null, VKImageController.ScaleType.CENTER_CROP, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65405);
    }

    public xd80(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.vk_universal_onboarding_item, viewGroup, false));
        ifx0 ifx0Var = e370.c;
        VKImageController<View> create = (ifx0Var == null ? null : ifx0Var).b().create(viewGroup.getContext());
        this.l = create;
        this.m = new kog0();
        this.n = (TextView) this.itemView.findViewById(R.id.title);
        this.o = (TextView) this.itemView.findViewById(R.id.message);
        VKReplacerView vKReplacerView = (VKReplacerView) this.itemView.findViewById(R.id.image);
        this.p = vKReplacerView;
        this.q = this.itemView.findViewById(R.id.progress_placeholder);
        this.r = (ImageView) this.itemView.findViewById(R.id.error_image);
        this.s = this.itemView.findViewById(R.id.error_placeholder);
        View findViewById = this.itemView.findViewById(R.id.error_reload);
        this.t = findViewById;
        vKReplacerView.a(((com.vk.core.ui.image.c) create).getView());
        jjc.g(findViewById, new cqv(this, 27));
        this.itemView.setOutlineProvider(new t0w0(v, false, true));
        this.itemView.setClipToOutline(true);
    }

    @Override // xsna.tcr0
    public final void B4(Throwable th) {
        this.p.setVisibility(4);
        this.q.setVisibility(8);
        this.s.setVisibility(0);
    }

    public final void V5(OnboardingStep onboardingStep) {
        this.p.setVisibility(4);
        this.q.setVisibility(0);
        this.s.setVisibility(8);
        if (onboardingStep.h != null) {
            hg1.b(this.itemView, new io.reactivex.rxjava3.internal.operators.single.v(new she(onboardingStep, 3)).l(new xx40(new xsq(17), 2)).l(new iw3(new o010(this, 22), 28)).q(io.reactivex.rxjava3.schedulers.a.a()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new dh40(new p010(this, 16), 7), new s520(new qd1(25, this, onboardingStep), 5)));
        } else {
            this.l.d(onboardingStep.g, w, this);
        }
    }

    public final void W5() {
        this.p.setVisibility(0);
        this.q.setVisibility(8);
        this.s.setVisibility(8);
    }

    @Override // xsna.tcr0
    public final void onSuccess() {
        W5();
    }
}
