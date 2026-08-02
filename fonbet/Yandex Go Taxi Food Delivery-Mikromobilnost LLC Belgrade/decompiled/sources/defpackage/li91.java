package defpackage;

import android.animation.Animator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.ybsdk.core.design.animation.AnimUtils;
import com.ybsdk.core.utils.animation.DefaultAnimatorListener;
import defpackage.sls;
import defpackage.tje;
import defpackage.tka1;

/* loaded from: classes3.dex */
public abstract class li91 {
    public static final String[] a = {"🍏️", "🍎️", "🍐️", "🍊️", "🍋️", "🍌️", "🍉️", "🍇️", "🍓️", "🍈️", "🍒️", "🍑️", "🍍️", "🥝️", "🥑️", "🍅️", "🍆️", "🥒️", "🥕️", "🌽️", "🌶️", "🥔️", "🍠️", "🌰️", "🥜️", "🍯️", "🥐️", "🍞️", "🥖️", "🧀️", "🥚️", "🍳️", "🥓️", "🥞️", "🍤️", "🍗️", "🍖️", "🍕️", "🌭️", "🍔️", "🍟️", "🥙️", "🌮️", "🌯️", "🥗️", "🥘️", "🍝️", "🍜️", "🍲️", "🍥️", "🍣️", "🍱️", "🍛️", "🍚️", "🍙️", "🍘️", "🍢️", "🍡️", "🍧️", "🍨️", "🍦️", "🍰️", "🎂️", "🍮️", "🍭️", "🍬️", "🍫️", "🍿️", "🍩️", "🍪️", "🥛️", "🍼️", "☕️", "🍵️", "🍶️", "🍺️", "🍻️", "🥂️", "🍷️", "🥃️", "🍸️", "🍹️", "🍾️", "🥄️", "🍴️", "🍽"};

    public static final void a(View view, boolean z, final sls slsVar) {
        ViewPropertyAnimator withEndAction;
        if (z) {
            withEndAction = AnimUtils.g(view);
            view.setAlpha(0.0f);
        } else {
            withEndAction = AnimUtils.a(0.0f, view).withEndAction(new ce0(view, 4));
        }
        withEndAction.setDuration(450L);
        withEndAction.setInterpolator(AnimationUtils.loadInterpolator(view.getContext(), ylg0.ybsdk_default_interpolator));
        withEndAction.setListener(new DefaultAnimatorListener() { // from class: com.ybsdk.feature.pfm.internal.ui.animators.PfmAnimationHelpersKt$animateFade$2$1
            @Override // com.ybsdk.core.utils.animation.DefaultAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                sls.this.invoke();
            }

            @Override // com.ybsdk.core.utils.animation.DefaultAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                sls.this.invoke();
            }
        });
        withEndAction.start();
    }

    public static final View c(View view, String str) {
        if (jl40.l(d(view), str)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View c = c(viewGroup.getChildAt(i), str);
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    public static final String d(View view) {
        Object tag = view.getTag(nah0.ybsdk_educations_view_tag_id);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public static final void e(final tls tlsVar, final View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: com.lightside.visum.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tje.N(tka1.h(tka1.g(view)), null, null, new ViewHelpersKt$onClick$1$1(tlsVar, null), 3);
            }
        });
    }

    public static final void f(View view) {
        view.setBackgroundColor(0);
    }

    public static final void g(int i, View view) {
        Resources resources = view.getResources();
        ThreadLocal threadLocal = wuj0.a;
        view.setBackgroundColor(resources.getColor(i, null));
    }

    public static final void h(int i, View view) {
        view.setBackgroundResource(i);
    }

    public static final void i(View view, String str) {
        view.setTag(nah0.ybsdk_educations_ignore_shadow_draw_id, str);
    }

    public static final void j(View view, String str) {
        view.setTag(nah0.ybsdk_educations_view_tag_id, str);
    }

    public static final void k(TextView textView, int i) {
        textView.setTypeface(wuj0.b(i, textView.getContext()));
    }

    public static final void l(TextView textView, int i) {
        textView.setTextColor(textView.getContext().getResources().getColor(i, null));
    }
}
