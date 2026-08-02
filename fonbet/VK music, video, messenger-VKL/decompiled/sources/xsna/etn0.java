package xsna;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.vk.core.view.components.tabs.VkTabLayout;

/* compiled from: TabProgressDrawableCallback.kt */
/* loaded from: classes17.dex */
public final class etn0 extends InsetDrawable {
    public final VkTabLayout b;

    public etn0(VkTabLayout vkTabLayout, Drawable drawable) {
        super(drawable, 0, 0, 0, 0);
        this.b = vkTabLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        VkTabLayout vkTabLayout = this.b;
        int tabCount = vkTabLayout.getTabCount();
        for (int i5 = 0; i5 < tabCount; i5++) {
            TabLayout.g b = vkTabLayout.b(i5);
            TabLayout.i iVar = b != null ? b.h : null;
            View view = b != null ? b.f : 0;
            if ((view instanceof fox) && iVar != null) {
                int left = view.getLeft() + iVar.getLeft();
                int h = swe0.h(i - left, new k9x(0, iVar.getWidth(), 1));
                int h2 = swe0.h(i3 - left, new k9x(0, iVar.getWidth(), 1));
                if (h2 >= h) {
                    ((fox) view).m0(h, h2);
                } else {
                    ((fox) view).m0(0, 0);
                }
            }
        }
    }
}
