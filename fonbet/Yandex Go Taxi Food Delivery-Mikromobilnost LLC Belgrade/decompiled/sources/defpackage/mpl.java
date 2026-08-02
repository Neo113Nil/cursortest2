package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public abstract class mpl {
    public static final int[] a = {ogh0.div_buttons, ogh0.div_gallery};

    public static boolean a(RecyclerView recyclerView, float f, float f2, int i) {
        if (!g8a1.f(f, f2, recyclerView)) {
            return false;
        }
        if (i < 0) {
            return true;
        }
        if (i == 4) {
            return recyclerView.computeHorizontalScrollOffset() > 0;
        }
        if (i != 8) {
            return false;
        }
        return recyclerView.computeHorizontalScrollOffset() + recyclerView.computeHorizontalScrollExtent() < recyclerView.computeHorizontalScrollRange();
    }
}
