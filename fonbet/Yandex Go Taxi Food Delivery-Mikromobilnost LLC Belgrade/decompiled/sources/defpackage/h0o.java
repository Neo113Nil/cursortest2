package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import core.flex.ui.OrientationAwareRecyclerView;
import just.adapter.scroll.ScrollDirection;

/* loaded from: classes9.dex */
public final class h0o implements reu0 {
    public final g0o a;

    public h0o(g0o g0oVar) {
        this.a = g0oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (r3 > 0.0f) goto L26;
     */
    @Override // defpackage.reu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(OrientationAwareRecyclerView orientationAwareRecyclerView, RecyclerView.e eVar, ydu0 ydu0Var, View view, int i, int i2, ScrollDirection scrollDirection, int i3, vdu0 vdu0Var, int i4) {
        float f;
        View view2;
        int y;
        x0 findViewHolderForAdapterPosition = orientationAwareRecyclerView.findViewHolderForAdapterPosition(i);
        View view3 = findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.a : null;
        int paddingBottom = orientationAwareRecyclerView.getPaddingBottom() + i4;
        if (view3 != null) {
            float f2 = paddingBottom;
            if (view3.getY() <= f2) {
                return view3.getY() + f2;
            }
        }
        x0 findViewHolderForAdapterPosition2 = orientationAwareRecyclerView.findViewHolderForAdapterPosition(ydu0Var.a(i2 - 1));
        if (findViewHolderForAdapterPosition2 != null && (view2 = findViewHolderForAdapterPosition2.a) != null && (y = (int) view.getY()) != 0 && view2.getBottom() - y >= 0) {
            f = (((view.getHeight() - orientationAwareRecyclerView.getHeight()) + view2.getBottom()) - jgb1.c(view.getLayoutParams())) - (RecyclerView.e.b0(view2) + jgb1.c(view2.getLayoutParams()));
        }
        f = 0.0f;
        if (f != 0.0f || !vdu0Var.b.contains(Integer.valueOf(i))) {
            return f;
        }
        g0o g0oVar = this.a;
        int i5 = 0;
        if (i != g0oVar.b) {
            g0oVar.a = 0;
        }
        g0oVar.b = i;
        int y2 = (int) view.getY();
        int bottom = view.getBottom();
        if (y2 != 0 && bottom != 0) {
            int i6 = f0o.a[scrollDirection.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    i5 = Math.min((y2 - (bottom - view.getHeight())) - i3, view.getHeight());
                } else if (i6 == 3) {
                    i5 = g0oVar.a;
                } else {
                    w511.b();
                }
            } else if (y2 > bottom - view.getHeight()) {
                i5 = y2 > bottom ? Math.min(i3, view.getHeight()) : Math.max((y2 - (bottom - view.getHeight())) - i3, 0);
            }
        }
        g0oVar.a = i5;
        return i5;
    }
}
