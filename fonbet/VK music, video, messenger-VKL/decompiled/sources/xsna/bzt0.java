package xsna;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: ViewOffsetHelper.java */
/* loaded from: classes13.dex */
public final class bzt0 {
    public final View a;
    public int b;
    public int c;
    public int d;

    public bzt0(View view) {
        this.a = view;
    }

    public final void a() {
        int i = this.d;
        View view = this.a;
        int top = i - (view.getTop() - this.b);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.c));
    }

    public final int b() {
        return this.d;
    }

    public final void c() {
        View view = this.a;
        this.b = view.getTop();
        this.c = view.getLeft();
    }

    public final boolean d(int i) {
        if (this.d == i) {
            return false;
        }
        this.d = i;
        a();
        return true;
    }
}
