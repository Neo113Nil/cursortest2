package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ny61;

/* loaded from: classes.dex */
public abstract class d0 {
    public final RecyclerView.e a;
    public int b = Integer.MIN_VALUE;
    public final Rect c = new Rect();

    public d0(RecyclerView.e eVar) {
        this.a = eVar;
    }

    public static d0 a(RecyclerView.e eVar, int i) {
        if (i == 0) {
            return new b0(eVar);
        }
        if (i == 1) {
            return new c0(eVar);
        }
        ny61.g("invalid orientation");
        return null;
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public final int m() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return l() - this.b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);
}
