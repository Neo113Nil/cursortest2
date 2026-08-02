package xsna;

import android.view.View;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;

/* compiled from: ViewExt.kt */
/* loaded from: classes17.dex */
public final class t5f implements View.OnLayoutChangeListener {
    public final /* synthetic */ VkOnboardingHighlighter b;
    public final /* synthetic */ u5f c;
    public final /* synthetic */ String d;

    public t5f(VkOnboardingHighlighter vkOnboardingHighlighter, u5f u5fVar, String str) {
        this.b = vkOnboardingHighlighter;
        this.c = u5fVar;
        this.d = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        VkOnboardingHighlighter.e(this.b, false, null, false, null, 12);
        ((h7v) this.c.e).b(this.d);
    }
}
