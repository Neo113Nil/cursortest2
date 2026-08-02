package defpackage;

import android.content.Context;

/* loaded from: classes13.dex */
public final class j2s0 {
    public final Context a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public j2s0(Context context) {
        this.a = context;
        this.b = context.getResources().getDimensionPixelOffset(mug0.shortcuts_grid_min_gap);
        this.c = context.getResources().getDimensionPixelOffset(mug0.shortcuts_grid_max_gap);
        this.d = context.getResources().getDimensionPixelOffset(mug0.shortcuts_grid_min_margin);
        this.e = context.getResources().getDimensionPixelOffset(mug0.shortcuts_grid_max_margin);
        this.f = context.getResources().getDimensionPixelSize(mug0.shortcuts_grid_min_cell);
    }

    public static long a(j2s0 j2s0Var, int i) {
        int i2 = j2s0Var.a.getResources().getDisplayMetrics().widthPixels - (j2s0Var.f * i);
        int i3 = j2s0Var.e;
        int i4 = j2s0Var.c;
        return i2 >= g8e.d(i, 1, i4, i3 * 2) ? s5w.a(i4, i3) : s5w.a(j2s0Var.b, j2s0Var.d);
    }
}
