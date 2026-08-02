package xsna;

import android.view.View;
import com.vk.core.view.components.bottombar.VkBottomBar;

/* compiled from: VkBottomBar.kt */
/* loaded from: classes17.dex */
public final class gfu0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ VkBottomBar b;
    public final /* synthetic */ b3m0 c;

    public gfu0(VkBottomBar vkBottomBar, b3m0 b3m0Var) {
        this.b = vkBottomBar;
        this.c = b3m0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        VkBottomBar vkBottomBar = this.b;
        vkBottomBar.removeOnLayoutChangeListener(this);
        this.c.invoke(vkBottomBar);
    }
}
