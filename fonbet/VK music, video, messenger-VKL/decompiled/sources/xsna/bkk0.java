package xsna;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.avatar.api.VKAvatarView;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.links.LinkedTextView;
import com.vk.dto.common.VerifyInfo;
import com.vkontakte.android.R;
import xsna.kr5;
import xsna.wjk0;

/* compiled from: SpectatorsViewNew.kt */
/* loaded from: classes3.dex */
public final class bkk0 extends ConstraintLayout implements wjk0 {
    public final ImageView A;
    public final ImageView B;
    public final LottieAnimationView C;
    public CharSequence D;
    public SpannableStringBuilder E;
    public final int F;
    public vjk0 G;
    public final bpn0 H;
    public View I;
    public a J;
    public final TextView t;
    public final FrameLayout u;
    public final VKAvatarView v;
    public final LinkedTextView w;
    public final TextView x;
    public final TextView y;
    public final ImageView z;

    /* compiled from: SpectatorsViewNew.kt */
    public static final class a {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("MuteState(isMuted="), this.a, ')');
        }
    }

    /* compiled from: SpectatorsViewNew.kt */
    public static final class b implements pjw {
        public final /* synthetic */ String b;

        public b(String str) {
            this.b = str;
        }

        @Override // xsna.pjw
        public final String f(int i) {
            return this.b;
        }
    }

    public bkk0(Context context) {
        super(context, null, 0);
        this.F = iah0.f().widthPixels - iah0.a(32);
        this.H = new bpn0(new vv20(this, 25));
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.live_spectators_new, (ViewGroup) this, true);
        TextView textView = (TextView) inflate.findViewById(R.id.live_spectators_name);
        this.t = textView;
        this.u = (FrameLayout) inflate.findViewById(R.id.live_spectators_owner_subscribe_container);
        VKAvatarView vKAvatarView = (VKAvatarView) inflate.findViewById(R.id.live_spectators_avatar);
        this.v = vKAvatarView;
        this.w = (LinkedTextView) inflate.findViewById(R.id.live_spectators_description);
        this.x = (TextView) inflate.findViewById(R.id.live_spectators_balance);
        TextView textView2 = (TextView) inflate.findViewById(R.id.live_spectators_viewers);
        this.y = textView2;
        this.z = (ImageView) inflate.findViewById(R.id.live_spectators_viewers_icon);
        this.A = (ImageView) inflate.findViewById(R.id.live_spectators_balance_icon);
        this.B = (ImageView) inflate.findViewById(R.id.live_spectators_live_badge_new);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.live_spectators_mute_icon);
        this.C = lottieAnimationView;
        lottieAnimationView.setOnClickListener(new j870(1));
        jjc.g(textView, new wug0(this, 5));
        jjc.g(vKAvatarView, new w620(this, 27));
        jjc.g(inflate.findViewById(R.id.live_spectators_viewers_container), new b8e0(this, 7));
        iut0.q(textView2, new dgj(0));
    }

    private final AppCompatTextView getPreComputeDescrView() {
        return (AppCompatTextView) this.H.getValue();
    }

    public final void P4(String str, SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.setSpan(new StyleSpan(1), (spannableStringBuilder.length() - str.length()) + 1, spannableStringBuilder.length(), 18);
        ckk0 ckk0Var = new ckk0(this);
        ckk0Var.b = true;
        ckk0Var.c(R.color.vk_black_alpha24);
        spannableStringBuilder.setSpan(ckk0Var, spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 18);
    }

    @Override // xsna.wjk0
    public final void Q3() {
        bwt0.p0(this.y, false);
        bwt0.p0(this.z, false);
    }

    @Override // xsna.wjk0
    public final void T1(boolean z) {
        ImageView imageView = this.B;
        if (z) {
            imageView.setColorFilter((ColorFilter) null);
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        colorMatrix.postConcat(new ColorMatrix(new float[]{1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 55.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 66.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 78.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}));
        imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    @Override // xsna.wjk0
    public final void X() {
        this.x.setVisibility(8);
        this.A.setVisibility(8);
    }

    @Override // xsna.wjk0
    public final void Y(boolean z, boolean z2) {
        a aVar = this.J;
        if (aVar == null || aVar.a != z) {
            LottieAnimationView lottieAnimationView = this.C;
            lottieAnimationView.setContentDescription(z ? lottieAnimationView.getContext().getString(R.string.video_accessibility_sound_on) : lottieAnimationView.getContext().getString(R.string.video_accessibility_sound_off));
            if (z) {
                lottieAnimationView.setAnimation(R.raw.volume_to_mute_shadow_24);
            } else {
                lottieAnimationView.setAnimation(R.raw.mute_to_volume_shadow_24);
            }
            if (this.J == null || !z2) {
                lottieAnimationView.setProgress(1.0f);
            } else {
                lottieAnimationView.m0();
            }
            this.J = new a(z);
        }
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.rr6
    public final void pause() {
        vjk0 vjk0Var = this.G;
        if (vjk0Var != null) {
            vjk0Var.pause();
        }
    }

    @Override // xsna.rr6
    public final void release() {
        vjk0 vjk0Var = this.G;
        if (vjk0Var != null) {
            vjk0Var.release();
        }
    }

    @Override // xsna.rr6
    public final void resume() {
        vjk0 vjk0Var = this.G;
        if (vjk0Var != null) {
            vjk0Var.resume();
        }
    }

    public final void setClipsMode(View view) {
        View view2 = this.I;
        FrameLayout frameLayout = this.u;
        frameLayout.removeView(view2);
        frameLayout.addView(view, new ConstraintLayout.b(-2, -2));
        f4m.t(iah0.a(-4), frameLayout);
        this.I = view;
    }

    @Override // xsna.wjk0
    public void setCurrentViewers(int i) {
        String y = brm0.y(crx0.l(i), " ", " ");
        TextView textView = this.y;
        textView.setText(y);
        textView.setContentDescription(enj.f(R.plurals.video_spectators_count, i, getContext()));
    }

    @Override // xsna.wjk0
    public void setUser(wjk0.a aVar) {
        String str = aVar.c;
        String str2 = aVar.b;
        String str3 = aVar.a;
        if (str3 != null) {
            ucp ucpVar = ucp.a;
            CharSequence i = ucp.i(brm0.y(str3, " ", " "));
            TextView textView = this.t;
            textView.setText(i);
            kr5.a aVar2 = new kr5.a(new b(aVar.d));
            s3q0 s3q0Var = s3q0.a;
            kr5 a2 = aVar2.a();
            VKAvatarView vKAvatarView = this.v;
            vKAvatarView.Y0(a2);
            vKAvatarView.setContentDescription(getContext().getString(R.string.accessibility_video_avatar_with_name, str3));
            VerifyInfo verifyInfo = aVar.e;
            CharSequence charSequence = null;
            charSequence = null;
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (verifyInfo == null || !verifyInfo.b) ? null : VerifyInfoHelper.h(VerifyInfoHelper.a, new VerifyInfo(true, false, false, false, false, false, 62, null), getContext(), VerifyInfoHelper.ColorTheme.white, 24), (Drawable) null);
            String a3 = (str2.length() <= 0 || str.length() <= 0) ? (str2.equals("Live") && str.length() == 0) ? "" : fo8.a(str2, str) : v1v.a('\n', str2, str);
            int length = a3.length();
            LinkedTextView linkedTextView = this.w;
            if (length <= 0) {
                linkedTextView.setVisibility(8);
                this.D = null;
                this.E = null;
                return;
            }
            linkedTextView.setVisibility(0);
            String string = getContext().getString(R.string.clip_description_expand);
            AppCompatTextView preComputeDescrView = getPreComputeDescrView();
            if (preComputeDescrView != null && a3.length() != 0) {
                lfo0 lfo0Var = new lfo0(preComputeDescrView);
                lfo0Var.c = string;
                lfo0Var.b = a3;
                int measuredWidth = preComputeDescrView.getMeasuredWidth();
                Integer valueOf = measuredWidth > 0 ? Integer.valueOf(measuredWidth) : null;
                charSequence = lfo0.b(lfo0Var, valueOf != null ? valueOf.intValue() : this.F, preComputeDescrView.getMaxLines(), 4);
            }
            this.D = charSequence;
            String string2 = getContext().getString(R.string.clip_description_collapse);
            this.E = new SpannableStringBuilder(a3).append((CharSequence) string2);
            CharSequence charSequence2 = this.D;
            if (charSequence2 != null && drm0.F(charSequence2, string)) {
                P4(string, (SpannableStringBuilder) this.D);
                P4(string2, this.E);
            }
            linkedTextView.setSelected(false);
            linkedTextView.setText(this.D);
            linkedTextView.setContentDescription(a3);
        }
    }

    @Override // xsna.wjk0
    public final void v2(int i, boolean z) {
        if (!z) {
            X();
            return;
        }
        TextView textView = this.x;
        textView.setVisibility(0);
        this.A.setVisibility(0);
        textView.setText(brm0.y(crx0.l(i), " ", " "));
    }

    @Override // xsna.rr6
    public vjk0 getPresenter() {
        return this.G;
    }

    @Override // xsna.rr6
    public void setPresenter(vjk0 vjk0Var) {
        this.G = vjk0Var;
    }

    @Override // xsna.wjk0
    public final void Y2() {
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }

    @Override // xsna.wjk0
    public void setTimeText(int i) {
    }
}
