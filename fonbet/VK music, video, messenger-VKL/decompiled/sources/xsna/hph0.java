package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;

/* compiled from: SearchDatabaseItemViewHolder.kt */
/* loaded from: classes5.dex */
public final class hph0 extends vfz<iph0> {
    public final u8 l;
    public final defpackage.j m;
    public final TextView n;
    public final TextView o;
    public final View p;

    public hph0(ViewGroup viewGroup, u8 u8Var, defpackage.j jVar, Integer num) {
        super(R.layout.search_params_common_database_item, viewGroup);
        this.l = u8Var;
        this.m = jVar;
        this.n = (TextView) this.itemView.findViewById(R.id.search_database_item_title);
        this.o = (TextView) this.itemView.findViewById(R.id.search_database_item_subtitle);
        this.p = this.itemView.findViewById(R.id.search_database_item_selected_indicator);
        if (num != null) {
            int intValue = num.intValue();
            View view = this.itemView;
            ConstraintLayout constraintLayout = view instanceof ConstraintLayout ? (ConstraintLayout) view : null;
            if (constraintLayout != null) {
                constraintLayout.setMinHeight(intValue);
            }
        }
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(iph0 iph0Var) {
        iph0 iph0Var2 = iph0Var;
        this.n.setText(iph0Var2.c);
        String str = iph0Var2.d;
        TextView textView = this.o;
        textView.setText(str);
        CharSequence text = textView.getText();
        textView.setVisibility((text == null || text.length() == 0) ? 8 : 0);
        this.p.setVisibility(iph0Var2.e ? 0 : 8);
        this.itemView.setOnClickListener(new hmb(5, iph0Var2, this));
    }
}
