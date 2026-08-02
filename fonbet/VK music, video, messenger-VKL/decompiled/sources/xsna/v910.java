package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.vk.core.view.components.topbar.VkTopBar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class v910 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v910(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.a) {
            case 0:
                com.vk.newsfeed.posting.market_picker.presentation.base.view.e eVar = (com.vk.newsfeed.posting.market_picker.presentation.base.view.e) this.b;
                int stableInsetTop = windowInsets.getStableInsetTop();
                int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
                int stableInsetRight = windowInsets.getStableInsetRight();
                int stableInsetLeft = windowInsets.getStableInsetLeft();
                VkTopBar vkTopBar = eVar.v;
                ViewGroup.LayoutParams layoutParams = vkTopBar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = stableInsetTop;
                }
                ViewGroup.LayoutParams layoutParams2 = vkTopBar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.leftMargin = stableInsetLeft;
                }
                ViewGroup.LayoutParams layoutParams3 = vkTopBar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                if (marginLayoutParams3 != null) {
                    marginLayoutParams3.rightMargin = stableInsetRight;
                }
                int b = systemWindowInsetBottom + cn70.b(32);
                ViewGroup.LayoutParams layoutParams4 = eVar.t.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                if (marginLayoutParams4 != null) {
                    marginLayoutParams4.bottomMargin = b;
                }
                iah0.a(100);
                break;
            default:
                ((izr0) this.b).a(windowInsets);
                break;
        }
        return windowInsets;
    }
}
