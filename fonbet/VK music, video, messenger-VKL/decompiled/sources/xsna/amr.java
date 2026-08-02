package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;

/* compiled from: FirstPinnedTabLayoutVh.kt */
/* loaded from: classes16.dex */
public final class amr implements View.OnAttachStateChangeListener {
    public final /* synthetic */ TextView b;
    public final /* synthetic */ cmr c;
    public final /* synthetic */ FirstPinnedTabLayoutVh d;
    public final /* synthetic */ VkOnboardingHighlighter e;
    public final /* synthetic */ int f;

    public amr(TextView textView, cmr cmrVar, FirstPinnedTabLayoutVh firstPinnedTabLayoutVh, VkOnboardingHighlighter vkOnboardingHighlighter, int i) {
        this.b = textView;
        this.c = cmrVar;
        this.d = firstPinnedTabLayoutVh;
        this.e = vkOnboardingHighlighter;
        this.f = i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        TextView textView = this.b;
        if (textView.getWidth() <= 0 || textView.getHeight() <= 0) {
            textView.getViewTreeObserver().addOnGlobalLayoutListener(this.c);
        } else {
            textView.post(new zlr(this.d, this.e, this.f, 0));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        TextView textView = this.b;
        textView.getViewTreeObserver().removeOnGlobalLayoutListener(this.c);
        textView.removeOnAttachStateChangeListener(this);
    }
}
