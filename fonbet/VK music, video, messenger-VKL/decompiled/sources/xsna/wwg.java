package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: CommunityCheckListTipsViewHolder.kt */
/* loaded from: classes18.dex */
public final class wwg extends vfz<vwg> {
    public final TextView l;
    public vwg m;

    public wwg(ViewGroup viewGroup, izs<? super vwg, s3q0> izsVar) {
        super(R.layout.community_check_list_tip_item, viewGroup);
        View view = this.itemView;
        this.l = (TextView) view;
        jjc.g(view, new defpackage.h0(9, this, izsVar));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(vwg vwgVar) {
        vwg vwgVar2 = vwgVar;
        this.m = vwgVar2;
        tlo0.h hVar = vwgVar2.c;
        TextView textView = this.l;
        ey2.h(textView, hVar);
        textView.setSelected(vwgVar2.d);
    }
}
