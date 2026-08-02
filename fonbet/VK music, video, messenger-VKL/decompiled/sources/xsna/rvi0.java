package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: SessionRoomViewHolder.kt */
/* loaded from: classes7.dex */
public final class rvi0 extends vfz<axi0> {
    public final qjg0 l;
    public final TextView m;
    public final TextView n;
    public final View o;

    public rvi0(ViewGroup viewGroup, qjg0 qjg0Var) {
        super(R.layout.voip_session_room_list_item_view, viewGroup);
        this.l = qjg0Var;
        this.m = (TextView) this.itemView.findViewById(R.id.room_name);
        this.n = (TextView) this.itemView.findViewById(R.id.room_participants);
        this.o = this.itemView.findViewById(R.id.selected_room_indicator);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(axi0 axi0Var) {
        axi0 axi0Var2 = axi0Var;
        lvi0 lvi0Var = axi0Var2.b;
        this.m.setText(lvi0Var.a.b);
        w65.q(this.n, lvi0Var, true);
        bwt0.p0(this.o, axi0Var2.c);
        bwt0.i0(this.itemView, new ut6(29, this, axi0Var2));
    }
}
