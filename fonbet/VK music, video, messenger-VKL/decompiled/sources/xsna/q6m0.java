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
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.drawing.gradient.StoryEditText;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.stories.design.view.PrivacyHintView;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* compiled from: StoryMentionDialog.kt */
/* loaded from: classes16.dex */
public final class q6m0 extends Dialog implements s6m0 {
    public final v6m0 b;
    public final n6m0 c;
    public final View d;
    public final a52 e;
    public final ImageView f;
    public final CoordinatorLayout g;
    public final View h;
    public final View i;
    public final StoryEditText j;
    public final ViewGroup k;
    public final View l;
    public final h420 m;
    public final PrivacyHintView n;
    public boolean o;
    public final u6m0 p;

    public q6m0(Context context, v6m0 v6m0Var, n6m0 n6m0Var, StoryCameraTarget storyCameraTarget, cvu cvuVar, v3l0 v3l0Var, com.vk.stickers.api.styles.b bVar, c7l0 c7l0Var) {
        super(context, v3l0Var.b(true));
        a420 a420Var;
        this.b = v6m0Var;
        this.c = n6m0Var;
        View inflate = LayoutInflater.from(context).inflate(R.layout.story_mention_dialog_layout, (ViewGroup) null);
        this.d = inflate;
        this.e = !gz80.a(30) ? new a52(getWindow(), inflate) : null;
        u6m0 u6m0Var = new u6m0(this, storyCameraTarget, cvuVar, bVar, c7l0Var);
        this.p = u6m0Var;
        Window window = getWindow();
        if (window != null) {
            window.addFlags(1024);
        }
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.h = viewGroup.findViewById(R.id.story_mention_click_area);
        this.f = (ImageView) viewGroup.findViewById(R.id.mention_icon);
        this.j = (StoryEditText) viewGroup.findViewById(R.id.mention_edit_view);
        this.k = (ViewGroup) viewGroup.findViewById(R.id.edit_text_container);
        this.g = (CoordinatorLayout) viewGroup.findViewById(R.id.story_mentions_container);
        this.i = viewGroup.findViewById(R.id.done_view);
        this.n = (PrivacyHintView) viewGroup.findViewById(R.id.mention_dialog_privacy_view);
        int i = 0;
        h420 h420Var = new h420(this.p, 0);
        this.m = h420Var;
        CoordinatorLayout coordinatorLayout = this.g;
        View d = h420Var.d(coordinatorLayout == null ? null : coordinatorLayout, yfb.b(new Pair("key_rounded_top_without_shadow", Boolean.TRUE)));
        this.l = d;
        CoordinatorLayout coordinatorLayout2 = this.g;
        (coordinatorLayout2 == null ? null : coordinatorLayout2).addView(d);
        ViewGroup viewGroup2 = this.k;
        (viewGroup2 == null ? null : viewGroup2).setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        StoryEditText storyEditText = this.j;
        (storyEditText == null ? null : storyEditText).getViewTreeObserver().addOnPreDrawListener(new r6m0(this, v3l0Var));
        View view = this.i;
        int i2 = 12;
        (view == null ? null : view).setOnClickListener(new gi8(this, i2));
        View view2 = this.h;
        (view2 == null ? null : view2).setOnClickListener(new be6(this, 11));
        StoryEditText storyEditText2 = this.j;
        (storyEditText2 == null ? null : storyEditText2).requestFocus();
        StoryEditText storyEditText3 = this.j;
        (storyEditText3 == null ? null : storyEditText3).setPressKey(new vay0(this));
        PrivacyHintView privacyHintView = this.n;
        (privacyHintView == null ? null : privacyHintView).setSetupButtonClickListener(new a50(this, 10));
        setContentView(inflate);
        q6m0 q6m0Var = u6m0Var.b;
        StoryEditText storyEditText4 = q6m0Var.j;
        Context context2 = (storyEditText4 == null ? null : storyEditText4).getContext();
        ViewGroup viewGroup3 = q6m0Var.k;
        Drawable background = (viewGroup3 == null ? null : viewGroup3).getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        com.vk.stickers.api.styles.a aVar = u6m0Var.h;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(aVar.g(context2));
        }
        StoryEditText storyEditText5 = q6m0Var.j;
        (storyEditText5 == null ? null : storyEditText5).setTextColor(aVar.h(context2));
        StoryEditText storyEditText6 = q6m0Var.j;
        (storyEditText6 == null ? null : storyEditText6).setHintTextColor(aVar.h(context2));
        ImageView imageView = q6m0Var.f;
        (imageView == null ? null : imageView).setColorFilter(aVar.h(context2));
        StoryEditText storyEditText7 = q6m0Var.j;
        (storyEditText7 == null ? null : storyEditText7).setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new kbm0("[^\\@]*")});
        StoryEditText storyEditText8 = q6m0Var.j;
        u6m0Var.i = new com.vk.ecomm.catalog.impl.geo.a((storyEditText8 == null ? null : storyEditText8).getPaint());
        StoryEditText storyEditText9 = q6m0Var.j;
        StoryEditText storyEditText10 = storyEditText9 != null ? storyEditText9 : null;
        StoryEditText storyEditText11 = storyEditText9 != null ? storyEditText9 : null;
        o0m0 o0m0Var = o0m0.b;
        int a = y8g0.a(R.dimen.sticker_text_size_min);
        int a2 = y8g0.a(R.dimen.sticker_text_size_max);
        int a3 = o0m0.a();
        com.vk.ecomm.catalog.impl.geo.a aVar2 = u6m0Var.i;
        storyEditText10.addTextChangedListener(new wg5(storyEditText11, a, a2, a3, aVar2 == null ? null : aVar2));
        StoryEditText storyEditText12 = q6m0Var.j;
        (storyEditText12 != null ? storyEditText12 : null).addTextChangedListener(new d7v(storyEditText12 == null ? null : storyEditText12, R.string.sticker_mention_hint));
        StoryEditText storyEditText13 = q6m0Var.j;
        u6m0Var.e.b(bwt0.f(storyEditText13 == null ? null : storyEditText13).w0(200L, TimeUnit.MILLISECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new t6m0(new pod0(u6m0Var, i2), i), new n1r(new av70(16), 24)));
        PrivacyHintView privacyHintView2 = q6m0Var.n;
        privacyHintView2 = privacyHintView2 == null ? null : privacyHintView2;
        privacyHintView2.setHintText(cvuVar.a(privacyHintView2.getContext()));
        h420 h420Var2 = q6m0Var.m;
        (h420Var2 != null ? h420Var2 : null).j("");
        v6m0 v6m0Var2 = q6m0Var.b;
        if (v6m0Var2 == null || (a420Var = v6m0Var2.c) == null) {
            return;
        }
        UserId userId = a420Var.a;
        String str = v6m0Var2.d;
        u6m0Var.g.put(userId, str != null ? str : "");
    }

    @Override // xsna.s6m0
    public final View A8() {
        View view = this.l;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // xsna.t9m0
    public final void b(boolean z) {
        this.o = z;
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
        a52 a52Var = this.e;
        if (a52Var != null) {
            a52Var.a.getViewTreeObserver().removeOnGlobalLayoutListener(a52Var.c);
        }
        h420 h420Var = this.m;
        if (h420Var == null) {
            h420Var = null;
        }
        h420Var.onDestroyView();
        super.dismiss();
    }

    @Override // xsna.t9m0
    public final boolean f() {
        return this.o;
    }

    @Override // xsna.s6m0
    public final StoryEditText getEditText() {
        StoryEditText storyEditText = this.j;
        if (storyEditText != null) {
            return storyEditText;
        }
        return null;
    }

    @Override // xsna.dc6
    public final Object getPresenter() {
        return this.p;
    }

    @Override // xsna.t9m0
    public final PrivacyHintView i() {
        PrivacyHintView privacyHintView = this.n;
        if (privacyHintView != null) {
            return privacyHintView;
        }
        return null;
    }

    @Override // xsna.s6m0
    public final ViewGroup m1() {
        ViewGroup viewGroup = this.k;
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
