package androidx.drawerlayout.widget;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import defpackage.kq31;

/* loaded from: classes.dex */
public final class c extends kq31 {
    public final int a;
    public androidx.customview.widget.a b;
    public final b c = new Runnable() { // from class: androidx.drawerlayout.widget.b
        @Override // java.lang.Runnable
        public final void run() {
            View findDrawerWithGravity;
            int width;
            c cVar = c.this;
            DrawerLayout drawerLayout = cVar.d;
            int i = cVar.b.o;
            int i2 = cVar.a;
            boolean z = i2 == 3;
            if (z) {
                findDrawerWithGravity = drawerLayout.findDrawerWithGravity(3);
                width = (findDrawerWithGravity != null ? -findDrawerWithGravity.getWidth() : 0) + i;
            } else {
                findDrawerWithGravity = drawerLayout.findDrawerWithGravity(5);
                width = drawerLayout.getWidth() - i;
            }
            if (findDrawerWithGravity != null) {
                if (((!z || findDrawerWithGravity.getLeft() >= width) && (z || findDrawerWithGravity.getLeft() <= width)) || drawerLayout.getDrawerLockMode(findDrawerWithGravity) != 0) {
                    return;
                }
                DrawerLayout.LayoutParams layoutParams = (DrawerLayout.LayoutParams) findDrawerWithGravity.getLayoutParams();
                cVar.b.t(width, findDrawerWithGravity.getTop(), findDrawerWithGravity);
                layoutParams.isPeeking = true;
                drawerLayout.invalidate();
                View findDrawerWithGravity2 = drawerLayout.findDrawerWithGravity(i2 == 3 ? 5 : 3);
                if (findDrawerWithGravity2 != null) {
                    drawerLayout.closeDrawer(findDrawerWithGravity2);
                }
                drawerLayout.cancelChildViewTouch();
            }
        }
    };
    public final /* synthetic */ DrawerLayout d;

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.drawerlayout.widget.b] */
    public c(DrawerLayout drawerLayout, int i) {
        this.d = drawerLayout;
        this.a = i;
    }

    @Override // defpackage.kq31
    public final int a(View view, int i) {
        DrawerLayout drawerLayout = this.d;
        if (drawerLayout.checkDrawerViewAbsoluteGravity(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // defpackage.kq31
    public final int b(View view, int i, int i2) {
        return view.getTop();
    }

    @Override // defpackage.kq31
    public final int c(View view) {
        if (this.d.isDrawerView(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // defpackage.kq31
    public final void e(int i, int i2) {
        int i3 = i & 1;
        DrawerLayout drawerLayout = this.d;
        View findDrawerWithGravity = i3 == 1 ? drawerLayout.findDrawerWithGravity(3) : drawerLayout.findDrawerWithGravity(5);
        if (findDrawerWithGravity == null || drawerLayout.getDrawerLockMode(findDrawerWithGravity) != 0) {
            return;
        }
        this.b.c(i2, findDrawerWithGravity);
    }

    @Override // defpackage.kq31
    public final void f(int i) {
        this.d.postDelayed(this.c, 160L);
    }

    @Override // defpackage.kq31
    public final void g(int i, View view) {
        ((DrawerLayout.LayoutParams) view.getLayoutParams()).isPeeking = false;
        int i2 = this.a == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.d;
        View findDrawerWithGravity = drawerLayout.findDrawerWithGravity(i2);
        if (findDrawerWithGravity != null) {
            drawerLayout.closeDrawer(findDrawerWithGravity);
        }
    }

    @Override // defpackage.kq31
    public final void h(int i) {
        this.d.updateDrawerState(i, this.b.t);
    }

    @Override // defpackage.kq31
    public final void i(View view, int i, int i2) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.d;
        float width2 = (drawerLayout.checkDrawerViewAbsoluteGravity(view, 3) ? i + width : drawerLayout.getWidth() - i) / width;
        drawerLayout.setDrawerViewOffset(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // defpackage.kq31
    public final void j(View view, float f, float f2) {
        int i;
        DrawerLayout drawerLayout = this.d;
        float drawerViewOffset = drawerLayout.getDrawerViewOffset(view);
        int width = view.getWidth();
        if (drawerLayout.checkDrawerViewAbsoluteGravity(view, 3)) {
            i = (f > 0.0f || (f == 0.0f && drawerViewOffset > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f < 0.0f || (f == 0.0f && drawerViewOffset > 0.5f)) {
                width2 -= width;
            }
            i = width2;
        }
        this.b.r(i, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // defpackage.kq31
    public final boolean k(int i, View view) {
        DrawerLayout drawerLayout = this.d;
        return drawerLayout.isDrawerView(view) && drawerLayout.checkDrawerViewAbsoluteGravity(view, this.a) && drawerLayout.getDrawerLockMode(view) == 0;
    }
}
