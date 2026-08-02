package xsna;

import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.stat.scheme.SchemeStat$EventItem;

/* compiled from: FirstPinnedTabLayoutVh.kt */
/* loaded from: classes16.dex */
public final class cmr implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ TextView b;
    public final /* synthetic */ FirstPinnedTabLayoutVh c;
    public final /* synthetic */ VkOnboardingHighlighter d;
    public final /* synthetic */ int e;

    public cmr(TextView textView, FirstPinnedTabLayoutVh firstPinnedTabLayoutVh, VkOnboardingHighlighter vkOnboardingHighlighter, int i) {
        this.b = textView;
        this.c = firstPinnedTabLayoutVh;
        this.d = vkOnboardingHighlighter;
        this.e = i;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        TextView textView = this.b;
        if (textView.getWidth() <= 0 || textView.getHeight() <= 0) {
            return;
        }
        textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        final FirstPinnedTabLayoutVh firstPinnedTabLayoutVh = this.c;
        final VkOnboardingHighlighter vkOnboardingHighlighter = this.d;
        final int i = this.e;
        textView.post(new Runnable() { // from class: xsna.bmr
            @Override // java.lang.Runnable
            public final void run() {
                SchemeStat$EventItem schemeStat$EventItem = FirstPinnedTabLayoutVh.F;
                FirstPinnedTabLayoutVh.this.d(vkOnboardingHighlighter, i);
            }
        });
    }
}
