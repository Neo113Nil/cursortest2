package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyCharacterMap;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.view.Window;

/* compiled from: AndroidBug5497Workaround2.java */
/* loaded from: classes15.dex */
public final class a52 {
    public final View a;
    public final View b;
    public final a c;

    /* compiled from: AndroidBug5497Workaround2.java */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            Resources resources;
            int identifier;
            Rect rect = new Rect();
            a52 a52Var = a52.this;
            View view = a52Var.b;
            View view2 = a52Var.a;
            view2.getWindowVisibleDisplayFrame(rect);
            int m = (sqe0.b(view2).heightPixels - rect.bottom) + (gz80.a(28) ? iah0.m(view2) : 0);
            if (view2.getBottom() - view.getBottom() == 0 && !Build.MANUFACTURER.equalsIgnoreCase("oneplus")) {
                Context context = view.getContext();
                m += (ViewConfiguration.get(context).hasPermanentMenuKey() || KeyCharacterMap.deviceHasKey(4) || (identifier = (resources = context.getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) <= 0) ? 0 : resources.getDimensionPixelSize(identifier);
            }
            if (m != 0) {
                if (view.getPaddingBottom() != m) {
                    view.setPadding(0, 0, 0, m);
                }
            } else if (view.getPaddingBottom() != 0) {
                view.setPadding(0, 0, 0, 0);
            }
        }
    }

    public a52(Window window, View view) {
        a aVar = new a();
        this.c = aVar;
        View decorView = window.getDecorView();
        this.a = decorView;
        this.b = view;
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
    }
}
