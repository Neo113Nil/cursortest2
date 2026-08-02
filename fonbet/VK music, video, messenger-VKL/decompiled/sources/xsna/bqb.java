package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.iqb;
import xsna.spb;

/* compiled from: ChatControlsAdapter.kt */
/* loaded from: classes2.dex */
public final class bqb extends vfz<spb.a> {
    public static final /* synthetic */ int r = 0;
    public final View l;
    public final iqb.a m;
    public final ImageView n;
    public final TextView o;
    public final TextView p;
    public spb.a q;

    public bqb(View view, iqb.a aVar) {
        super(view);
        this.l = view;
        this.m = aVar;
        this.n = (ImageView) view.findViewById(R.id.icon);
        this.o = (TextView) view.findViewById(R.id.title);
        this.p = (TextView) view.findViewById(R.id.subtitle);
        bwt0.i0(view, new x7(this, 22));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(spb.a aVar) {
        spb.a aVar2 = aVar;
        this.q = aVar2;
        this.l.setId(aVar2.b);
        Context context = this.itemView.getContext();
        int i = aVar2.c;
        e3m.a aVar3 = e3m.a;
        this.n.setImageDrawable(m33.a(i, context));
        this.o.setText(this.itemView.getContext().getResources().getString(aVar2.d));
        this.p.setText(this.itemView.getContext().getResources().getString(aVar2.e));
    }
}
