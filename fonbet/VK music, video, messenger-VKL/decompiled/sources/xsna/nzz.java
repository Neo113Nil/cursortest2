package xsna;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: LocationViewTypeDelegate.kt */
/* loaded from: classes2.dex */
public final class nzz extends p1u0<uxz> {
    public final LayoutInflater a;
    public final Object b;
    public final kkm c;
    public final int d;

    public nzz(LayoutInflater layoutInflater, jxz jxzVar, kkm kkmVar, int i) {
        this.a = layoutInflater;
        this.b = jxzVar;
        this.c = kkmVar;
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xsna.jxz] */
    @Override // xsna.p1u0
    public final vfz<? extends uxz> b(ViewGroup viewGroup) {
        return new mzz(this.a.inflate(R.layout.vkim_msg_send_picker_location, viewGroup, false), this.c, this.b, this.d);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof uxz;
    }
}
