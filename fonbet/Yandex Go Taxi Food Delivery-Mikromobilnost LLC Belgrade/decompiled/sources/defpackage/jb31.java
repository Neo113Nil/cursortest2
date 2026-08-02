package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class jb31 extends RecyclerView.Adapter {
    public final cp1 a;
    public final hf31 b;
    public List c = EmptyList.a;

    public jb31(cp1 cp1Var, hf31 hf31Var) {
        this.a = cp1Var;
        this.b = hf31Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        qb31 qb31Var = (qb31) x0Var;
        ob31 ob31Var = (ob31) this.c.get(i);
        qb31Var.P.setText(ob31Var.b);
        RobotoTextView robotoTextView = qb31Var.O;
        String str = ob31Var.b;
        robotoTextView.setText(str);
        View view = qb31Var.a;
        boolean z = ob31Var.c;
        view.setSelected(z);
        view.setClickable(!z);
        robotoTextView.setTextTypeface(z ? qb31Var.T : 0);
        tf91.d(qb31Var.N, ob31Var.a, str, robotoTextView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(vrh0.vertical_header_item, viewGroup, false);
        int i2 = vfh0.vertical_header_item_title;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, inflate);
        if (robotoTextView != null) {
            i2 = vfh0.vertical_header_item_title_hidden;
            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, inflate);
            if (robotoTextView2 != null) {
                FrameLayout frameLayout = (FrameLayout) inflate;
                qb31 qb31Var = new qb31(new ho4((ViewGroup) frameLayout, (View) robotoTextView, robotoTextView2, 21), this.b);
                c.z(new zr01(24, qb31Var, this), frameLayout);
                return qb31Var;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
