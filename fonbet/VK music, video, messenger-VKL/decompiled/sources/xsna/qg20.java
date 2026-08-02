package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: MessagesRequestsViewHolder.kt */
/* loaded from: classes18.dex */
public final class qg20 extends fe<og20> {
    public final a m;
    public final int n;
    public final int o;

    /* compiled from: MessagesRequestsViewHolder.kt */
    public interface a {
        void H();
    }

    public qg20(ViewGroup viewGroup, a aVar) {
        super(viewGroup);
        this.m = aVar;
        this.n = R.drawable.vk_icon_messages_outline_28;
        this.o = R.string.vkim_msg_request;
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        og20 og20Var = (og20) hfzVar;
        ((njq) this.l.getValue()).V5(og20Var.b, og20Var.d, og20Var.c);
        this.itemView.setOnClickListener(new vw0(this, 11));
    }

    @Override // xsna.fe
    public final int h6() {
        return this.n;
    }

    @Override // xsna.fe
    public final int i6() {
        return this.o;
    }
}
