package xsna;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.c9w;

/* compiled from: MenuTitleViewTypeDelegate.kt */
/* loaded from: classes2.dex */
public final class j820 extends p1u0<g820> {
    public final LayoutInflater a;
    public final kkm b;
    public final c9w.a c;

    public j820(LayoutInflater layoutInflater, kkm kkmVar, c9w.a aVar) {
        this.a = layoutInflater;
        this.b = kkmVar;
        this.c = aVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends g820> b(ViewGroup viewGroup) {
        return new i820(this.a.inflate(R.layout.vkim_msg_send_picker_title_section, viewGroup, false), this.b, this.c);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof g820;
    }
}
