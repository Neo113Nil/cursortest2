package xsna;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;

/* compiled from: AndroidViewHolder.android.kt */
/* loaded from: classes11.dex */
public final class yd2 {
    public static final a a = new a();

    /* compiled from: AndroidViewHolder.android.kt */
    public static final class a implements d160 {
    }

    public static final void a(View view, LayoutNode layoutNode) {
        long D = layoutNode.G.c.D(0L);
        int round = Math.round(Float.intBitsToFloat((int) (D >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (D & 4294967295L)));
        dgn.b(view, round2, round, round2, view.getMeasuredWidth() + round);
    }
}
