package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: TimeZonePickerViewTypeDelegate.kt */
/* loaded from: classes7.dex */
public final class xvo0 extends p1u0<vvo0> {
    public final u9e a;

    /* compiled from: TimeZonePickerViewTypeDelegate.kt */
    public static final class a extends nfz<vvo0> {
        public final TextView m;
        public final TextView n;
        public final ImageView o;

        public a(u9e u9eVar, ViewGroup viewGroup) {
            super(R.layout.voip_scheduled_call_timezone_picker_item, viewGroup);
            this.m = (TextView) this.itemView.findViewById(R.id.voip_timezone_title);
            this.n = (TextView) this.itemView.findViewById(R.id.voip_timezone_subtitle);
            ImageView imageView = (ImageView) this.itemView.findViewById(R.id.voip_timezone_icon_selected);
            this.o = imageView;
            imageView.setColorFilter(dhr0.Y(R.attr.vk_ui_icon_accent, this.itemView.getContext()));
            jjc.g(this.itemView, new o6i0(4, u9eVar, this));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(hfz hfzVar) {
            vvo0 vvo0Var = (vvo0) hfzVar;
            this.l = vvo0Var;
            this.m.setText(vvo0Var.c);
            this.n.setText(vvo0Var.d);
            this.o.setVisibility(vvo0Var.e ? 0 : 8);
        }
    }

    public xvo0(u9e u9eVar) {
        this.a = u9eVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends vvo0> b(ViewGroup viewGroup) {
        return new a(this.a, viewGroup);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof vvo0;
    }
}
