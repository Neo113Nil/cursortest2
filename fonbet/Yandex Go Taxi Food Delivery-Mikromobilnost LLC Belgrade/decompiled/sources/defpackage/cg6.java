package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.transition.AutoTransition;
import androidx.transition.Fade;
import androidx.transition.Slide;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.BottomSheetLoadingView;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class cg6 {
    public static final /* synthetic */ kgx[] f = {new PropertyReference1Impl("card", 0, "getCard()Landroid/view/ViewGroup;", cg6.class), b64.x(qoi0.a, cg6.class, "progressView", "getProgressView()Landroid/view/View;", 0), new PropertyReference1Impl("titleTextView", 0, "getTitleTextView()Landroid/widget/TextView;", cg6.class), new PropertyReference1Impl("subtitleTextView", 0, "getSubtitleTextView()Landroid/widget/TextView;", cg6.class)};
    public final BottomSheetLoadingView a;
    public final wv5 b;
    public final wv5 c;
    public final wv5 d;
    public final wv5 e;

    public cg6(BottomSheetLoadingView bottomSheetLoadingView) {
        this.a = bottomSheetLoadingView;
        this.b = new wv5(new bg6(bottomSheetLoadingView, z9h0.loading_card, 0));
        this.c = new wv5(new bg6(bottomSheetLoadingView, z9h0.loading_progress_view, 1));
        this.d = new wv5(new bg6(bottomSheetLoadingView, z9h0.loading_title, 2));
        this.e = new wv5(new bg6(bottomSheetLoadingView, z9h0.loading_text, 3));
        ViewGroup a = a();
        ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            throw null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        Context context = bottomSheetLoadingView.getContext();
        layoutParams2.width = (context.getResources().getConfiguration().screenLayout & 15) >= 3 ? vng.s(ovg0.pay_sdk_tablet_bottom_sheet_width, context) : -1;
        a.setLayoutParams(layoutParams2);
    }

    public final ViewGroup a() {
        return (ViewGroup) this.b.a(f[0]);
    }

    public final TextView b() {
        return (TextView) this.e.a(f[3]);
    }

    public final TextView c() {
        return (TextView) this.d.a(f[2]);
    }

    public final void d() {
        e();
        BottomSheetLoadingView bottomSheetLoadingView = this.a;
        bottomSheetLoadingView.setVisibility(8);
        a().setVisibility(8);
        c().setVisibility(8);
        b().setVisibility(8);
        bottomSheetLoadingView.setOnTouchListener(null);
    }

    public final void e() {
        BottomSheetLoadingView bottomSheetLoadingView = this.a;
        ViewParent parent = bottomSheetLoadingView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            Fade fade = new Fade();
            fade.y.add(bottomSheetLoadingView);
            Slide slide = new Slide(0);
            slide.y.add(a());
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.d((View) this.c.a(f[1]));
            autoTransition.d(c());
            autoTransition.d(b());
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.Z(fade);
            transitionSet.Z(slide);
            transitionSet.Z(autoTransition);
            transitionSet.P(300L);
            TransitionManager.a(transitionSet, viewGroup);
        }
    }

    public final void f(String str, String str2) {
        e();
        BottomSheetLoadingView bottomSheetLoadingView = this.a;
        bottomSheetLoadingView.setVisibility(0);
        a().setVisibility(0);
        c().setVisibility(0);
        b().setVisibility(0);
        c().setText(str);
        b().setText(str2);
        bottomSheetLoadingView.setOnTouchListener(new cz2(2));
    }
}
