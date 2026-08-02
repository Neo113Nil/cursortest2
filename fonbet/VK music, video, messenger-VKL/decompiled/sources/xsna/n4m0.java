package xsna;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.drawing.gradient.StoryEditText;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.stories.design.view.HashtagHintsView;
import com.vk.stories.design.view.PrivacyHintView;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;

/* compiled from: StoryHashtagDialog.kt */
/* loaded from: classes16.dex */
public final class n4m0 extends Dialog implements p4m0 {
    public final t4m0 b;
    public final l4m0 c;
    public final View d;
    public final a52 e;
    public final ImageView f;
    public final ViewGroup g;
    public final View h;
    public final HashtagHintsView i;
    public final ViewGroup j;
    public final StoryEditText k;
    public final PrivacyHintView l;
    public boolean m;
    public final s4m0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4m0(Context context, t4m0 t4m0Var, l4m0 l4m0Var, StoryCameraTarget storyCameraTarget, cvu cvuVar, v3l0 v3l0Var, com.vk.stickers.api.styles.b bVar, c7l0 c7l0Var) {
        super(context, v3l0Var.b(true));
        int i = 1;
        this.b = t4m0Var;
        this.c = l4m0Var;
        View inflate = LayoutInflater.from(context).inflate(R.layout.story_hashtag_dialog_layout, (ViewGroup) null);
        this.d = inflate;
        this.e = !gz80.a(30) ? new a52(getWindow(), inflate) : null;
        s4m0 s4m0Var = new s4m0(this, storyCameraTarget, cvuVar, bVar, c7l0Var);
        this.n = s4m0Var;
        Window window = getWindow();
        if (window != null) {
            window.addFlags(1024);
        }
        this.f = (ImageView) inflate.findViewById(R.id.hashtag_icon);
        this.k = (StoryEditText) inflate.findViewById(R.id.hashtag_edit_view);
        this.g = (ViewGroup) inflate.findViewById(R.id.root);
        this.i = (HashtagHintsView) inflate.findViewById(R.id.hashtags_hints_view);
        this.h = inflate.findViewById(R.id.done_view);
        this.j = (ViewGroup) inflate.findViewById(R.id.edit_text_container);
        this.l = (PrivacyHintView) inflate.findViewById(R.id.hashtag_dialog_privacy_view);
        ViewGroup viewGroup = this.j;
        (viewGroup == null ? null : viewGroup).setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        StoryEditText storyEditText = this.k;
        (storyEditText == null ? null : storyEditText).getViewTreeObserver().addOnPreDrawListener(new o4m0(this, v3l0Var));
        View view = this.h;
        int i2 = 28;
        bwt0.i0(view == null ? null : view, new mi10(this, i2));
        ViewGroup viewGroup2 = this.g;
        bwt0.i0(viewGroup2 == null ? null : viewGroup2, new xd40(this, 22));
        StoryEditText storyEditText2 = this.k;
        (storyEditText2 == null ? null : storyEditText2).requestFocus();
        StoryEditText storyEditText3 = this.k;
        (storyEditText3 == null ? null : storyEditText3).setPressKey(new m6o0(this));
        PrivacyHintView privacyHintView = this.l;
        (privacyHintView == null ? null : privacyHintView).setSetupButtonClickListener(new dm7(this, 4));
        setContentView(inflate);
        Context context2 = getEditText().getContext();
        Drawable background = m1().getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        com.vk.stickers.api.styles.a aVar = s4m0Var.f;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(aVar.g(context2));
        }
        getEditText().setTextColor(aVar.h(context2));
        getEditText().setHintTextColor(aVar.h(context2));
        l7().setColorFilter(aVar.h(context2));
        StoryEditText storyEditText4 = this.k;
        (storyEditText4 == null ? null : storyEditText4).setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new kbm0("([a-zA-Zа-яА-ЯёЁ0-9_])+")});
        StoryEditText storyEditText5 = this.k;
        StoryEditText storyEditText6 = storyEditText5 != null ? storyEditText5 : null;
        StoryEditText storyEditText7 = storyEditText5 != null ? storyEditText5 : null;
        o0m0 o0m0Var = o0m0.b;
        storyEditText6.addTextChangedListener(new wg5(storyEditText7, y8g0.a(R.dimen.sticker_text_size_min), y8g0.a(R.dimen.sticker_text_size_max), o0m0.a(), null));
        StoryEditText storyEditText8 = this.k;
        (storyEditText8 != null ? storyEditText8 : null).addTextChangedListener(new d7v(storyEditText8 == null ? null : storyEditText8, R.string.sticker_hashtag_hint));
        StoryEditText storyEditText9 = this.k;
        (storyEditText9 == null ? null : storyEditText9).addTextChangedListener(new q4m0(s4m0Var));
        StoryEditText storyEditText10 = this.k;
        s4m0Var.e.b(new io.reactivex.rxjava3.internal.operators.mixed.o(new io.reactivex.rxjava3.internal.operators.observable.y(bwt0.f(storyEditText10 == null ? null : storyEditText10), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).w0(200L, TimeUnit.MILLISECONDS), new wii0(new xvl0(s4m0Var, i), 3)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new qw40(new pf40(s4m0Var, 27), 18), new rkz(new ept(i2), 26)));
        HashtagHintsView hashtagHintsView = this.i;
        (hashtagHintsView == null ? null : hashtagHintsView).setOnClick(new r4m0(s4m0Var));
        PrivacyHintView privacyHintView2 = this.l;
        PrivacyHintView privacyHintView3 = privacyHintView2 != null ? privacyHintView2 : null;
        privacyHintView3.setHintText(cvuVar.c(privacyHintView3.getContext()));
    }

    @Override // xsna.t9m0
    public final void b(boolean z) {
        this.m = z;
    }

    @Override // xsna.t9m0
    public final void c() {
        h(false);
    }

    @Override // xsna.t9m0
    public final void d() {
        h(true);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        s4m0 s4m0Var = this.n;
        if (s4m0Var != null) {
            s4m0Var.e.dispose();
        }
        a52 a52Var = this.e;
        if (a52Var != null) {
            a52Var.a.getViewTreeObserver().removeOnGlobalLayoutListener(a52Var.c);
        }
        super.dismiss();
    }

    @Override // xsna.p4m0
    public final HashtagHintsView el() {
        HashtagHintsView hashtagHintsView = this.i;
        if (hashtagHintsView != null) {
            return hashtagHintsView;
        }
        return null;
    }

    @Override // xsna.t9m0
    public final boolean f() {
        return this.m;
    }

    @Override // xsna.p4m0
    public final StoryEditText getEditText() {
        StoryEditText storyEditText = this.k;
        if (storyEditText != null) {
            return storyEditText;
        }
        return null;
    }

    @Override // xsna.dc6
    public final Object getPresenter() {
        return this.n;
    }

    @Override // xsna.t9m0
    public final PrivacyHintView i() {
        PrivacyHintView privacyHintView = this.l;
        if (privacyHintView != null) {
            return privacyHintView;
        }
        return null;
    }

    @Override // xsna.p4m0
    public final ImageView l7() {
        ImageView imageView = this.f;
        if (imageView != null) {
            return imageView;
        }
        return null;
    }

    @Override // xsna.p4m0
    public final ViewGroup m1() {
        ViewGroup viewGroup = this.j;
        if (viewGroup != null) {
            return viewGroup;
        }
        return null;
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        a52 a52Var = this.e;
        if (a52Var != null) {
            a52Var.a.getViewTreeObserver().addOnGlobalLayoutListener(a52Var.c);
        }
    }
}
