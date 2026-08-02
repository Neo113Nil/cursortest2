package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public final class fr31 {
    public final View a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList b = new ArrayList();
    public final Rect g = new Rect();
    public final Rect h = new Rect();

    public fr31(View view) {
        this.a = view;
        a();
    }

    public final void a() {
        boolean z;
        boolean z2 = false;
        if (this.e) {
            View view = this.a;
            if (view.isShown() && this.d && this.f) {
                if (view.getWidth() == 0 || view.getHeight() == 0 || view.willNotDraw()) {
                    z = false;
                } else {
                    Rect rect = this.g;
                    view.getGlobalVisibleRect(rect);
                    DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
                    int i = displayMetrics.widthPixels;
                    int i2 = displayMetrics.heightPixels;
                    Rect rect2 = this.h;
                    rect2.set(0, 0, i, i2);
                    z = rect2.intersect(rect);
                }
                if (z) {
                    z2 = true;
                }
            }
        }
        if (this.c == z2) {
            return;
        }
        this.c = z2;
        Iterator it = a.J0(this.b).iterator();
        while (it.hasNext()) {
            ((tls) it.next()).invoke(Boolean.valueOf(z2));
        }
    }
}
