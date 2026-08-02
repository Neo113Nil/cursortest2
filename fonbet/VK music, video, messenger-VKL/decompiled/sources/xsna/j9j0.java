package xsna;

import android.view.View;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.core.view.components.text.VkText;

/* compiled from: View.kt */
/* loaded from: classes2.dex */
public final class j9j0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ VkText b;
    public final /* synthetic */ VkOnboardingHighlighter c;

    public j9j0(VkText vkText, VkOnboardingHighlighter vkOnboardingHighlighter) {
        this.b = vkText;
        this.c = vkOnboardingHighlighter;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        this.b.addOnLayoutChangeListener(new k9j0(this.c));
    }
}
