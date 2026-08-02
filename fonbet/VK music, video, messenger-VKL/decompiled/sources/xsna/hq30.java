package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vkontakte.android.R;

/* compiled from: MsgPartFakeNewsHolder.kt */
/* loaded from: classes2.dex */
public final class hq30 extends hr30<Attach, iq30> {
    public pk30 d;
    public final v5t e = new v5t(R.layout.vkim_msg_part_fake_news);

    @Override // xsna.hr30
    public final void p(iq30 iq30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        this.d = pk30Var;
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View c = this.e.c(layoutInflater, viewGroup);
        bwt0.i0(c, new ebx(this, 9));
        return c;
    }

    @Override // xsna.hr30
    public final void r() {
        this.d = null;
    }
}
