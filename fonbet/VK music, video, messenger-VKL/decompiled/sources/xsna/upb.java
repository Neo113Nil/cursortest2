package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.vwb;

/* compiled from: ChatControlItemDelegateOld.kt */
/* loaded from: classes2.dex */
public final class upb extends p1u0<vwb.b> {
    public final xwb a;

    /* compiled from: ChatControlItemDelegateOld.kt */
    public static final class a extends vfz<vwb.b> {
        public final vpb l;
        public final ImageView m;
        public final TextView n;
        public final TextView o;

        public a(View view, xwb xwbVar) {
            super(view);
            this.l = xwbVar;
            this.m = (ImageView) view.findViewById(R.id.icon);
            this.n = (TextView) view.findViewById(R.id.title);
            this.o = (TextView) view.findViewById(R.id.subtitle);
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(vwb.b bVar) {
            vwb.b bVar2 = bVar;
            bwt0.i0(this.itemView, new rm0(3, this, bVar2));
            Context context = this.itemView.getContext();
            int i = bVar2.c;
            e3m.a aVar = e3m.a;
            this.m.setImageDrawable(m33.a(i, context));
            this.n.setText(this.itemView.getContext().getResources().getString(bVar2.d));
            this.o.setText(this.itemView.getContext().getResources().getString(bVar2.e));
        }
    }

    public upb(xwb xwbVar) {
        this.a = xwbVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends vwb.b> b(ViewGroup viewGroup) {
        return new a(s3j0.b(viewGroup, R.layout.vkim_chat_control_param_item, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof vwb.b;
    }
}
