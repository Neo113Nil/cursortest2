package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.k0g0;

/* compiled from: RepeatEndDateNeverViewTypeDelegate.kt */
/* loaded from: classes7.dex */
public final class j0g0 extends p1u0<k0g0.a> {
    public final afl0 a;

    /* compiled from: RepeatEndDateNeverViewTypeDelegate.kt */
    public final class a extends nfz<k0g0.a> {
        public final TextView m;
        public final ImageView n;

        public a(afl0 afl0Var, ViewGroup viewGroup) {
            super(R.layout.voip_scheduled_call_modal_dialog_picker_selectable_item, viewGroup);
            bwt0.p0(this.itemView.findViewById(R.id.voip_tv_subtitle), false);
            this.m = (TextView) this.itemView.findViewById(R.id.voip_tv_title);
            ImageView imageView = (ImageView) this.itemView.findViewById(R.id.voip_icon_selected);
            this.n = imageView;
            imageView.setColorFilter(dhr0.Y(R.attr.vk_ui_icon_accent, this.itemView.getContext()));
            jjc.g(this.itemView, new jl1(2, afl0Var));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(hfz hfzVar) {
            k0g0.a aVar = (k0g0.a) hfzVar;
            this.l = aVar;
            this.m.setText(R.string.voip_schedule_call_repeat_never);
            bwt0.p0(this.n, aVar.b);
        }
    }

    public j0g0(afl0 afl0Var) {
        this.a = afl0Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends k0g0.a> b(ViewGroup viewGroup) {
        return new a(this.a, viewGroup);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof k0g0.a;
    }
}
