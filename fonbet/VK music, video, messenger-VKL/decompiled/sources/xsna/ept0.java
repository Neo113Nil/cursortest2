package xsna;

import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: VideoUrlsDelegate.kt */
/* loaded from: classes2.dex */
public final class ept0 extends p1u0<fpt0> {
    public final sxl0 a;

    /* compiled from: VideoUrlsDelegate.kt */
    public static final class a extends vfz<fpt0> {
        public final TextView l;
        public final CheckBox m;
        public fpt0 n;

        public a(ViewGroup viewGroup, sxl0 sxl0Var) {
            super(R.layout.video_url_select, viewGroup);
            this.l = (TextView) this.itemView.findViewById(R.id.url_name);
            this.m = (CheckBox) this.itemView.findViewById(R.id.is_url_selected);
            this.itemView.setOnClickListener(new fn9(3, this, sxl0Var));
        }

        @Override // xsna.vfz
        public final void W5(fpt0 fpt0Var) {
            fpt0 fpt0Var2 = fpt0Var;
            this.n = fpt0Var2;
            this.l.setText(fpt0Var2.b.name());
            this.m.setChecked(fpt0Var2.c);
        }
    }

    public ept0(sxl0 sxl0Var) {
        this.a = sxl0Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends fpt0> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof fpt0;
    }
}
