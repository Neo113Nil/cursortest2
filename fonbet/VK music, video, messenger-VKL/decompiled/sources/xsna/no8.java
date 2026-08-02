package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: BusinessNotificationsViewHolder.kt */
/* loaded from: classes18.dex */
public final class no8 extends fe<jo8> {
    public final a m;
    public final int n;
    public final int o;

    /* compiled from: BusinessNotificationsViewHolder.kt */
    public interface a {
        void q();
    }

    public no8(ViewGroup viewGroup, a aVar) {
        super(viewGroup);
        this.m = aVar;
        this.n = R.drawable.vk_icon_work_outline_28;
        this.o = R.string.vkim_business_notify_count_default;
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        jo8 jo8Var = (jo8) hfzVar;
        ((njq) this.l.getValue()).V5(jo8Var.b, jo8Var.d, jo8Var.c);
        this.itemView.setOnClickListener(new pj8(this, 1));
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
