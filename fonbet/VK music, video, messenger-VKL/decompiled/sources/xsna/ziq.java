package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import com.vk.core.view.components.button.VkButton;
import xsna.wln0;

/* compiled from: SwitchableTextDelegate.kt */
/* loaded from: classes16.dex */
public final class ziq<T extends View> extends rmn0 {
    public final T b;
    public final boolean c;
    public final wln0.a d;

    public ziq(VkButton vkButton, boolean z, wln0.a aVar) {
        this.b = vkButton;
        this.c = z;
        this.d = aVar;
    }

    @Override // xsna.rmn0
    public final void a(int i) {
        T t = this.b;
        boolean z = t.getVisibility() == 0;
        boolean z2 = this.c;
        if (z ^ z2) {
            on2 on2Var = this.a;
            ValueAnimator a = on2Var != null ? on2Var.a(t, z2, this.d, i) : null;
            if (a != null) {
                a.start();
            }
        }
    }
}
