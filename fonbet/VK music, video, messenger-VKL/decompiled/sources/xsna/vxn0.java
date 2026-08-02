package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.vkontakte.android.TabletDialogActivity;

/* compiled from: TabletDialogActivity.java */
/* loaded from: classes7.dex */
public final class vxn0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public int b = 0;
    public final /* synthetic */ View c;
    public final /* synthetic */ Rect d;
    public final /* synthetic */ WindowManager.LayoutParams e;
    public final /* synthetic */ Window f;
    public final /* synthetic */ TabletDialogActivity g;

    public vxn0(TabletDialogActivity tabletDialogActivity, View view, Rect rect, WindowManager.LayoutParams layoutParams, Window window) {
        this.g = tabletDialogActivity;
        this.c = view;
        this.d = rect;
        this.e = layoutParams;
        this.f = window;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.c;
        Rect rect = this.d;
        view.getWindowVisibleDisplayFrame(rect);
        if (this.b != 0 && rect.height() < this.b) {
            int height = rect.height();
            TabletDialogActivity tabletDialogActivity = this.g;
            int min = Math.min(height, tabletDialogActivity.A) - tabletDialogActivity.K.getInsetTop();
            WindowManager.LayoutParams layoutParams = this.e;
            layoutParams.height = min;
            this.f.setAttributes(layoutParams);
            view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
        this.b = rect.height();
    }
}
