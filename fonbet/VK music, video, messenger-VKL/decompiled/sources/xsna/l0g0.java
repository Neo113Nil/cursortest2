package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Locale;
import xsna.k0g0;

/* compiled from: RepeatEndSelectedDateViewTypeDelegate.kt */
/* loaded from: classes7.dex */
public final class l0g0 extends p1u0<k0g0.b> {
    public final xww0 a;

    /* compiled from: RepeatEndSelectedDateViewTypeDelegate.kt */
    public final class a extends nfz<k0g0.b> {
        public final TextView m;
        public final TextView n;
        public final ImageView o;
        public final SimpleDateFormat p;

        public a(xww0 xww0Var, ViewGroup viewGroup) {
            super(R.layout.voip_scheduled_call_modal_dialog_picker_selectable_item, viewGroup);
            this.m = (TextView) this.itemView.findViewById(R.id.voip_tv_title);
            this.n = (TextView) this.itemView.findViewById(R.id.voip_tv_subtitle);
            ImageView imageView = (ImageView) this.itemView.findViewById(R.id.voip_icon_selected);
            this.o = imageView;
            this.p = new SimpleDateFormat("dd MMMM yyyy", Locale.getDefault());
            imageView.setColorFilter(dhr0.Y(R.attr.vk_ui_icon_accent, this.itemView.getContext()));
            jjc.g(this.itemView, new or50(xww0Var, 17));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(hfz hfzVar) {
            k0g0.b bVar = (k0g0.b) hfzVar;
            this.l = bVar;
            mvo0 mvo0Var = bVar.c;
            this.m.setText(mvo0Var != null ? R.string.voip_schedule_call_repeat_end_choose_date : R.string.voip_schedule_call_repeat_end_change_date);
            boolean z = mvo0Var != null;
            TextView textView = this.n;
            bwt0.p0(textView, z);
            textView.setText(mvo0Var != null ? this.p.format(Long.valueOf(mvo0Var.a)) : null);
            bwt0.p0(this.o, bVar.b);
        }
    }

    public l0g0(xww0 xww0Var) {
        this.a = xww0Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends k0g0.b> b(ViewGroup viewGroup) {
        return new a(this.a, viewGroup);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof k0g0.b;
    }
}
