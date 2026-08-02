package xsna;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.vk.core.view.FitSystemWindowsFrameLayout;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.stickers.views.animation.VKAnimationView;

/* compiled from: SpecialEventPopupWindow.kt */
/* loaded from: classes4.dex */
public final class mjk0 {
    public final PopupWindow a;
    public final VKAnimationView b;

    public mjk0(NavigationDelegateActivity navigationDelegateActivity, int i) {
        FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout = new FitSystemWindowsFrameLayout(navigationDelegateActivity, null);
        fitSystemWindowsFrameLayout.setFitsSystemWindows(false);
        fitSystemWindowsFrameLayout.setFocusable(false);
        fitSystemWindowsFrameLayout.setClickable(false);
        VKAnimationView vKAnimationView = new VKAnimationView(navigationDelegateActivity, null);
        this.b = vKAnimationView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(cn70.b(231), cn70.b(204));
        layoutParams.gravity = 8388693;
        layoutParams.setMarginStart(cn70.b(12));
        layoutParams.setMarginEnd(cn70.b(12));
        layoutParams.bottomMargin = i;
        s3q0 s3q0Var = s3q0.a;
        fitSystemWindowsFrameLayout.addView(vKAnimationView, layoutParams);
        PopupWindow popupWindow = new PopupWindow(fitSystemWindowsFrameLayout, -1, -1);
        popupWindow.setAnimationStyle(-1);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setTouchable(false);
        popupWindow.setOutsideTouchable(false);
        popupWindow.setFocusable(false);
        popupWindow.setInputMethodMode(2);
        this.a = popupWindow;
    }

    public final void a() {
        this.a.dismiss();
    }

    public final void b() {
        this.b.l0();
    }

    public final void c() {
        VKAnimationView vKAnimationView = this.b;
        vKAnimationView.setRepeatCount(1);
        vKAnimationView.m0();
    }

    public final void d(int i) {
        bwt0.f0(this.b, 0, 0, 0, i, 7);
    }

    public final void e(View view) {
        PopupWindow popupWindow = this.a;
        popupWindow.setWindowLayoutType(1002);
        popupWindow.showAtLocation(view, 48, 0, 0);
    }
}
