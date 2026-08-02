package xsna;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.my.target.common.MyTargetActivity;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class gzy0 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ krw a;

    public gzy0(krw krwVar) {
        this.a = krwVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int displayCutout;
        int systemBars;
        Insets insets;
        int i;
        int i2;
        int i3;
        int i4;
        WindowInsets windowInsets2;
        krw krwVar = this.a;
        MyTargetActivity.b bVar = (MyTargetActivity.b) krwVar.b;
        FrameLayout frameLayout = (FrameLayout) krwVar.c;
        View view2 = bVar.b;
        View view3 = bVar.e;
        View view4 = bVar.d;
        View view5 = bVar.c;
        displayCutout = WindowInsets.Type.displayCutout();
        systemBars = WindowInsets.Type.systemBars();
        insets = windowInsets.getInsets(displayCutout | systemBars);
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        wxy0 wxy0Var = (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? wxy0.e : new wxy0(i, i2, i3, i4);
        int i5 = wxy0Var.b;
        int i6 = wxy0Var.d;
        int i7 = wxy0Var.a;
        int i8 = wxy0Var.c;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view5.getLayoutParams();
        layoutParams.width = i8;
        view5.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view4.getLayoutParams();
        layoutParams2.height = i6;
        layoutParams2.leftMargin = Math.max(i7, 0);
        layoutParams2.rightMargin = Math.max(i8, 0);
        view4.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) view3.getLayoutParams();
        layoutParams3.width = i7;
        view3.setLayoutParams(layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view2.getLayoutParams();
        layoutParams4.height = i5;
        layoutParams4.leftMargin = Math.max(i7, 0);
        layoutParams4.rightMargin = Math.max(i8, 0);
        view2.setLayoutParams(layoutParams4);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams5.topMargin = i5;
        layoutParams5.leftMargin = i7;
        layoutParams5.rightMargin = i8;
        layoutParams5.bottomMargin = i6;
        frameLayout.setLayoutParams(layoutParams5);
        FrameLayout frameLayout2 = MyTargetActivity.this.c;
        if (frameLayout2 != null) {
            frameLayout2.dispatchApplyWindowInsets(windowInsets);
        }
        view.invalidate();
        windowInsets2 = WindowInsets.CONSUMED;
        return windowInsets2;
    }
}
