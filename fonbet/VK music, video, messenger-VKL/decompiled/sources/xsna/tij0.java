package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: ShowMoreItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class tij0 extends vfz<sij0> {
    public sij0 l;

    public tij0(ViewGroup viewGroup, boolean z, wzs<? super Integer, ? super b2g0, s3q0> wzsVar, int i) {
        super(e0n.a(R.layout.show_more_view_holder, viewGroup, z));
        View view = this.itemView;
        view.setPadding(view.getPaddingStart() + i, this.itemView.getPaddingTop(), this.itemView.getPaddingEnd() + i, this.itemView.getPaddingBottom());
        this.itemView.setOnClickListener(new yew(2, this, wzsVar));
    }

    @Override // xsna.vfz
    public final void W5(sij0 sij0Var) {
        sij0 sij0Var2 = sij0Var;
        e0n.b(this.itemView, sij0Var2.c);
        this.l = sij0Var2;
    }
}
