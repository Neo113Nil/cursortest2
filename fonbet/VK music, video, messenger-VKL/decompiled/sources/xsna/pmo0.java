package xsna;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.e3m;

/* compiled from: TextStyleColorPickerAdapter.kt */
/* loaded from: classes16.dex */
public final class pmo0 extends RecyclerView.Adapter<qmo0> {
    public final List<omo0> c;
    public final f6 d;

    public pmo0(ArrayList arrayList, f6 f6Var) {
        this.c = arrayList;
        this.d = f6Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(qmo0 qmo0Var, int i) {
        qmo0 qmo0Var2 = qmo0Var;
        omo0 omo0Var = this.c.get(i);
        ImageView imageView = qmo0Var2.p;
        boolean z = omo0Var.c;
        qmo0Var2.q = omo0Var;
        GradientDrawable gradientDrawable = (GradientDrawable) qmo0Var2.n.getBackground();
        boolean z2 = omo0Var.a.b;
        View view = qmo0Var2.m;
        view.setBackgroundResource(z2 ? R.drawable.bg_gray_750_circle : R.drawable.bg_white_circle);
        int i2 = R.color.vk_white;
        int i3 = (z2 && omo0Var.b) ? R.color.vk_gray_750 : R.color.vk_white;
        int b = cn70.b(2);
        Context context = qmo0Var2.itemView.getContext();
        e3m.a aVar = e3m.a;
        gradientDrawable.setStroke(b, context.getColor(i3));
        gradientDrawable.setColor(omo0Var.a.a);
        if (z) {
            bwt0.p0(imageView, true);
            if (z2) {
                i2 = R.color.vk_gray_750;
            }
            omw.a(imageView, i2);
        } else {
            bwt0.p0(imageView, false);
        }
        bwt0.p0(qmo0Var2.o, omo0Var.b);
        if (z) {
            bwt0.p0(view, true);
            ViewPropertyAnimator e = xo2.e(view, 200L, null, 13);
            if (e != null) {
                e.withEndAction(new vq3(view, 13));
            }
        } else if (!bwt0.K(view) && omo0Var.b) {
            bwt0.p0(view, false);
            ViewPropertyAnimator d = xo2.d(29, 200L, view);
            if (d != null) {
                d.withEndAction(new ep0(view, 11));
            }
        } else if (!bwt0.K(view) || omo0Var.b) {
            bwt0.p0(view, omo0Var.b);
        } else {
            bwt0.p0(view, true);
            ViewPropertyAnimator e2 = xo2.e(view, 200L, null, 13);
            if (e2 != null) {
                e2.withEndAction(new vq3(view, 13));
            }
        }
        View view2 = qmo0Var2.itemView;
        Integer num = omo0Var.a.c;
        view2.setContentDescription(num != null ? qmo0Var2.itemView.getContext().getResources().getText(num.intValue()) : null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final qmo0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new qmo0(tf3.b(viewGroup, R.layout.item_text_color, viewGroup, false), this.d);
    }
}
