package xsna;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: CacheTargetVh.kt */
/* loaded from: classes15.dex */
public final class tx8 extends vfz<sx8> {
    public final defpackage.c l;
    public final TextView m;
    public final TextView n;
    public final CheckBox o;
    public final View p;
    public sx8 q;

    public tx8(View view, defpackage.c cVar) {
        super(view);
        this.l = cVar;
        this.m = (TextView) view.findViewById(R.id.title);
        this.n = (TextView) view.findViewById(R.id.subtitle);
        this.o = (CheckBox) view.findViewById(R.id.checkbox);
        this.p = view.findViewById(R.id.divider);
        bwt0.i0(this.itemView, new v5(this, 13));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(sx8 sx8Var) {
        sx8 sx8Var2 = sx8Var;
        this.q = sx8Var2;
        this.m.setText(sx8Var2.c);
        lar larVar = lar.a;
        long j = sx8Var2.d;
        larVar.getClass();
        this.n.setText(lar.a(j));
        this.o.setChecked(sx8Var2.f);
        bwt0.p0(this.p, sx8Var2.g);
    }
}
