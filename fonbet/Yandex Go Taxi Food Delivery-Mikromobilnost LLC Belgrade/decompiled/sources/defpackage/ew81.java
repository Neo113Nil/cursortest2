package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes7.dex */
public final class ew81 {
    public static final /* synthetic */ kgx[] f = {qha1.a(ew81.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;")};
    public final vt71 a;
    public final b571 b;
    public final r581 c;
    public uv71 d;
    public boolean e = true;

    public ew81(ViewPager2 viewPager2, vt71 vt71Var, b571 b571Var) {
        this.a = vt71Var;
        this.b = b571Var;
        this.c = new r581(viewPager2);
    }

    public final void a() {
        uv71 uv71Var = this.d;
        if (uv71Var != null) {
            uv71Var.a.removeCallbacksAndMessages(null);
        }
        this.d = null;
    }
}
