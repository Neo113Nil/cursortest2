package xsna;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: MapViewTypeDelegate.kt */
/* loaded from: classes2.dex */
public final class rm00 extends p1u0<ql00> {
    public final LayoutInflater a;
    public final Object b;

    public rm00(LayoutInflater layoutInflater, wj00 wj00Var) {
        this.a = layoutInflater;
        this.b = wj00Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xsna.wj00] */
    @Override // xsna.p1u0
    public final vfz<? extends ql00> b(ViewGroup viewGroup) {
        return new im00(this.a.inflate(R.layout.vkim_msg_send_picker_map, viewGroup, false), this.b);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof ql00;
    }
}
