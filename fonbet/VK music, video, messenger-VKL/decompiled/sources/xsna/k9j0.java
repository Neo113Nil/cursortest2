package xsna;

import android.view.View;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;

/* compiled from: View.kt */
/* loaded from: classes2.dex */
public final class k9j0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ VkOnboardingHighlighter b;

    public k9j0(VkOnboardingHighlighter vkOnboardingHighlighter) {
        this.b = vkOnboardingHighlighter;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        VkOnboardingHighlighter.e(this.b, false, null, false, null, 12);
    }
}
