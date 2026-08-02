package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public final class dbm0 extends RecyclerView.d {
    public final qa3 a;
    public final sls b;
    public final int c;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public dbm0(Context context, qa3 qa3Var, sls slsVar) {
        this.a = qa3Var;
        this.b = slsVar;
        this.c = rje.d(iwg0.ybsdk_savings_dashboard_one_group_margin, context);
        this.w = rje.d(iwg0.ybsdk_savings_dashboard_different_groups_margin, context);
        this.x = rje.d(iwg0.ybsdk_savings_dashboard_account_cell_horizontal_center_padding, context);
        this.y = rje.d(iwg0.ybsdk_savings_dashboard_account_cell_horizontal_outside_padding, context);
        this.z = rje.d(iwg0.ybsdk_savings_dashboard_account_cell_bottom_padding, context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        gc5 gc5Var;
        super.c(rect, view, recyclerView, kVar);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
            Integer valueOf = Integer.valueOf(childLayoutPosition);
            if (childLayoutPosition == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                f(valueOf.intValue(), rect);
                return;
            }
            return;
        }
        List list = this.a.b.f;
        if (list == null || (gc5Var = (gc5) a.S(childAdapterPosition, list)) == null) {
            return;
        }
        String str = gc5Var.b;
        gc5 gc5Var2 = (gc5) a.S(childAdapterPosition + 1, list);
        if ((gc5Var instanceof fam0) || (gc5Var instanceof scm0)) {
            f(childAdapterPosition, rect);
            return;
        }
        if (gc5Var2 == null) {
            return;
        }
        String str2 = gc5Var2.b;
        int length = str2.length();
        int i = this.w;
        int i2 = this.c;
        if (length <= 0 || str.length() <= 0) {
            if (gc5Var2.getClass().equals(gc5Var.getClass())) {
                i = i2;
            }
            rect.bottom = i;
        } else {
            if (str2.equals(str)) {
                i = i2;
            }
            rect.bottom = i;
        }
    }

    public final void f(int i, Rect rect) {
        boolean z = ((((Number) this.b.invoke()).intValue() % 2) + i) % 2 == 0;
        int i2 = this.x;
        int i3 = this.y;
        rect.left = z ? i3 : i2;
        if (!z) {
            i2 = i3;
        }
        rect.right = i2;
        rect.bottom = this.z;
    }
}
