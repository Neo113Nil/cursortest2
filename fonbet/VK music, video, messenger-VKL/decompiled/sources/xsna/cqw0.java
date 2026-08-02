package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: VoipHistoryMenuAdapter.kt */
/* loaded from: classes7.dex */
public final class cqw0 extends sxm {
    public List<? extends hfz> i;

    /* compiled from: VoipHistoryMenuAdapter.kt */
    public static final class a extends vfz<dqw0> {
        public final k7x l;
        public final TextView m;

        public a(ViewGroup viewGroup, k7x k7xVar) {
            super(R.layout.voip_history_past_calls_header_menu_item, viewGroup);
            this.l = k7xVar;
            this.m = (TextView) this.itemView;
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(dqw0 dqw0Var) {
            View view = this.itemView;
            TextView textView = this.m;
            at.d(view, R.string.voip_clear_all_history_call, textView);
            boolean z = dqw0Var.b;
            textView.setTextColor(e3m.f(z ? R.attr.vk_ui_text_primary : R.attr.vk_ui_text_tertiary, this.itemView.getContext()));
            textView.setCompoundDrawablesWithIntrinsicBounds(dhr0.x(R.drawable.vk_icon_delete_outline_24, z ? R.attr.vk_ui_icon_negative : R.attr.vk_ui_icon_tertiary, this.itemView.getContext()), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setEnabled(z);
            bwt0.i0(textView, new cim0(this, 16));
        }
    }

    @Override // xsna.sxm, xsna.qul
    public final List<hfz> getItems() {
        return this.i;
    }

    @Override // xsna.sxm, xsna.qul
    public final void setItems(List<? extends hfz> list) {
        this.i = list;
    }
}
