package xsna;

import android.content.Context;
import android.content.res.Configuration;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.tabs.Tab$Mode;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MusicProgressIndicatorVkTabContent.kt */
/* loaded from: classes16.dex */
public final class n250 extends nxv0 implements g380 {
    public final Object M;

    public n250(Context context) {
        super(context);
        this.M = msy.a(LazyThreadSafetyMode.NONE, new e9h(context, 2));
        setMode(Tab$Mode.Secondary);
        setCounterMode(VkCounter.Mode.Tertiary);
        setCounterAppearance(VkCounter.CounterAppearance.Appearance.Neutral);
        addView(getLoadingView());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkSpinner getLoadingView() {
        return (VkSpinner) this.M.getValue();
    }

    public final void Z4(boolean z) {
        bwt0.p0(getLoadingView(), z);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        setTextTint(z ? R.attr.vk_ui_text_primary : R.attr.vk_ui_text_secondary);
    }

    @Override // com.vk.core.view.components.tabs.d, xsna.too0
    public final void Ng() {
    }

    @Override // android.view.View, xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.vk.core.view.components.tabs.d, xsna.fox
    public final void m0(int i, int i2) {
    }
}
