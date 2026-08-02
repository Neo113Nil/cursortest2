package xsna;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: LocationViewTypeDelegate.kt */
/* loaded from: classes2.dex */
public final class zpz extends p1u0<wpz> {
    public final LayoutInflater a;
    public final kkm b;

    public zpz(LayoutInflater layoutInflater, kkm kkmVar) {
        this.a = layoutInflater;
        this.b = kkmVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends wpz> b(ViewGroup viewGroup) {
        return new ypz(this.a.inflate(R.layout.vkim_msg_send_picker_load_more, viewGroup, false), this.b);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof wpz;
    }
}
