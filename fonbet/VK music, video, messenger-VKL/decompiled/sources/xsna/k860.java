package xsna;

import android.R;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: NewPosterColorAdapter.kt */
/* loaded from: classes4.dex */
public final class k860 extends vif0<Integer> implements View.OnClickListener {
    public final fux<Integer> n;
    public final j860 o;
    public final g860 p;

    public k860(ViewGroup viewGroup, fux fuxVar, j860 j860Var) {
        super(new g860(viewGroup.getContext()));
        this.n = fuxVar;
        this.o = j860Var;
        g860 g860Var = (g860) this.itemView;
        this.p = g860Var;
        TypedValue typedValue = new TypedValue();
        g860Var.getContext().getTheme().resolveAttribute(R.attr.selectableItemBackgroundBorderless, typedValue, true);
        g860Var.setBackgroundResource(typedValue.resourceId);
        g860Var.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        g860Var.setOnClickListener(this);
    }

    @Override // xsna.vif0
    public final void i6(Integer num) {
        Integer num2 = num;
        if (num2 != null) {
            int intValue = num2.intValue();
            g860 g860Var = this.p;
            g860Var.b.setColor(intValue);
            g860Var.d.setColor(l8g.e(intValue & 16777215) < 0.75f ? -1 : -16777216);
            g860Var.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        T t = this.m;
        this.n.li(getAdapterPosition(), t);
        T t2 = this.m;
        int adapterPosition = getAdapterPosition();
        j860 j860Var = this.o;
        j860Var.getClass();
        j860Var.f = adapterPosition;
        j860Var.notifyDataSetChanged();
    }
}
