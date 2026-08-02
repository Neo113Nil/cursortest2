package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: RatingFilterItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class bye0 extends vfz<aye0> {
    public final eig0<bhg0> l;
    public final View m;
    public final TextView n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bye0(ViewGroup viewGroup, eig0 eig0Var, boolean z, int i, int i2) {
        super(e0n.a(R.layout.rating_filter_item, viewGroup, z));
        z = (i2 & 4) != 0 ? false : z;
        i = (i2 & 16) != 0 ? 0 : i;
        this.l = eig0Var;
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.filter_cl);
        View findViewById = this.itemView.findViewById(R.id.divider_top);
        this.m = findViewById;
        this.n = (TextView) this.itemView.findViewById(R.id.name_filter_tv);
        View view = this.itemView;
        view.setPadding(view.getPaddingStart() + i, this.itemView.getPaddingTop(), this.itemView.getPaddingEnd() + i, this.itemView.getPaddingBottom());
        bwt0.i0(linearLayout, new v4w(this, 22));
        bwt0.p0(findViewById, false);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void h6(aye0 aye0Var) {
        aye0 aye0Var2 = aye0Var;
        e0n.b(this.itemView, aye0Var2.c);
        ey2.h(this.n, aye0Var2.b);
    }
}
