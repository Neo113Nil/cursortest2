package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.ArrayList;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class dip extends RecyclerView.Adapter {
    public final tls a;
    public final ArrayList b = new ArrayList();

    public dip(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        cip cipVar = (cip) x0Var;
        eip eipVar = (eip) this.b.get(i);
        cipVar.getClass();
        View view = cipVar.a;
        Integer num = eipVar.c;
        ho4 ho4Var = cipVar.N;
        if (num == null) {
            ((AppCompatImageView) ho4Var.b).setImageDrawable(null);
        } else {
            ((AppCompatImageView) ho4Var.b).setImageResource(num.intValue());
        }
        RobotoTextView robotoTextView = (RobotoTextView) ho4Var.d;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ho4Var.b;
        robotoTextView.setText(eipVar.b);
        if (eipVar.d) {
            int t = qje.t(xng0.bgMain, view.getContext());
            appCompatImageView.setColorFilter(new PorterDuffColorFilter(t, PorterDuff.Mode.SRC_IN));
            robotoTextView.setTextColor(t);
            view.setBackground(vng.t(xyg0.bg_selection_categories_favorites_bubble_item, view.getContext()));
        } else {
            int t2 = qje.t(xng0.textMain, view.getContext());
            appCompatImageView.setColorFilter(new PorterDuffColorFilter(t2, PorterDuff.Mode.SRC_IN));
            robotoTextView.setTextColor(t2);
            view.setBackground(vng.t(xyg0.bg_categories_favorites_bubble_item, view.getContext()));
        }
        c.z(new ys0(this, i, 5), view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new cip(LayoutInflater.from(viewGroup.getContext()).inflate(zoh0.categories_favorites_bubble_item, viewGroup, false));
    }
}
