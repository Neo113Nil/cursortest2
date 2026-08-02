package xsna;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: NoResultsViewTypeDelegate.kt */
/* loaded from: classes2.dex */
public final class e470 extends p1u0<c470> {
    public final LayoutInflater a;

    public e470(LayoutInflater layoutInflater) {
        this.a = layoutInflater;
    }

    @Override // xsna.p1u0
    public final vfz<? extends c470> b(ViewGroup viewGroup) {
        return new d470(this.a.inflate(R.layout.vkim_msg_send_picker_no_results, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof c470;
    }
}
