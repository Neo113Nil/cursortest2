package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: VoipGroupHeaderDelegate.kt */
/* loaded from: classes7.dex */
public final class mow0 extends p1u0<now0> {

    /* compiled from: VoipGroupHeaderDelegate.kt */
    public static final class a extends vfz<now0> {
        public final AppCompatTextView l;
        public final AppCompatTextView m;

        public a(View view) {
            super(view);
            this.l = (AppCompatTextView) view.findViewById(R.id.title);
            this.m = (AppCompatTextView) view.findViewById(R.id.subtitle);
        }

        @Override // xsna.vfz
        public final void W5(now0 now0Var) {
            now0 now0Var2 = now0Var;
            this.l.setText(tlo0.b.a(now0Var2.b, this.itemView.getContext()));
            this.m.setText(tlo0.b.a(now0Var2.c, this.itemView.getContext()));
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends now0> b(ViewGroup viewGroup) {
        return new a(tf3.b(viewGroup, R.layout.voip_call_services_group_header, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof now0;
    }
}
