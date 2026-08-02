package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import com.vkontakte.android.R;

/* compiled from: AnimationDelegate.kt */
/* loaded from: classes7.dex */
public final class xn2 {
    public final View a;
    public final View b;
    public final boolean c;
    public final View d;
    public final View e;
    public final View f;
    public ValueAnimator g;
    public smk0 h;

    public xn2(View view, View view2, boolean z) {
        this.a = view;
        this.b = view2;
        this.c = z;
        this.d = view.findViewById(R.id.animated_box);
        this.e = view.findViewById(R.id.voip_call_view_slide_up_onboarding_pointer);
        this.f = view.findViewById(R.id.voip_call_view_slide_up_onboarding_screen);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.g = null;
        smk0 smk0Var = this.h;
        if (smk0Var != null) {
            smk0Var.d();
        }
        this.h = null;
    }
}
