package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.plc0;

/* compiled from: SwitchSettingHolder.kt */
/* loaded from: classes4.dex */
public final class tnn0 extends vif0<plc0.d> {
    public final TextView n;
    public final TextView o;
    public final SwitchCompat p;

    public tnn0(View view, com.vk.newsfeed.impl.posting.settings.mvi.c cVar) {
        super(view);
        this.n = (TextView) this.itemView.findViewById(R.id.tv_title);
        this.o = (TextView) this.itemView.findViewById(R.id.tv_subtitle);
        SwitchCompat switchCompat = (SwitchCompat) this.itemView.findViewById(R.id.sc_switch);
        this.p = switchCompat;
        switchCompat.setClickable(false);
        switchCompat.setFocusable(false);
        bwt0.i0(this.itemView, new eci0(6, this, cVar));
    }

    @Override // xsna.vif0
    public final void i6(plc0.d dVar) {
        int b;
        int i;
        plc0.d dVar2 = dVar;
        abg0 abg0Var = dhr0.t;
        int c = abg0Var.c(R.attr.vk_ui_text_primary);
        TextView textView = this.n;
        textView.setTextColor(c);
        int c2 = abg0Var.c(R.attr.vk_ui_text_secondary);
        TextView textView2 = this.o;
        textView2.setTextColor(c2);
        bwt0.p0(textView2, false);
        SwitchCompat switchCompat = this.p;
        switchCompat.setEnabled(true);
        this.itemView.setEnabled(true);
        if (dVar2 instanceof plc0.d.a) {
            i = cn70.b(48);
            plc0.d.a aVar = (plc0.d.a) dVar2;
            boolean z = aVar.c;
            switchCompat.setEnabled(z);
            this.itemView.setEnabled(z);
            switchCompat.setChecked(aVar.b);
            textView.setText(g6(R.string.posting_settings_disable_comments));
            textView.setTextColor(z ? abg0Var.c(R.attr.vk_ui_text_primary) : abg0Var.c(R.attr.vk_ui_text_secondary));
        } else {
            if (dVar2 instanceof plc0.d.c) {
                b = cn70.b(92);
                String g6 = g6(R.string.posting_settings_enable_notifications);
                String g62 = g6(R.string.posting_settings_notifications_hint);
                switchCompat.setChecked(((plc0.d.c) dVar2).b);
                textView.setText(g6);
                bwt0.p0(textView2, true);
                textView2.setText(g62);
            } else {
                if (!(dVar2 instanceof plc0.d.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                b = cn70.b(76);
                String g63 = g6(R.string.posting_settings_hide_my_name);
                String g64 = g6(R.string.posting_settings_hide_my_name_description);
                switchCompat.setChecked(((plc0.d.b) dVar2).b);
                textView.setText(g63);
                bwt0.p0(textView2, true);
                textView2.setText(g64);
            }
            i = b;
        }
        RecyclerView.p pVar = (RecyclerView.p) this.itemView.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) pVar).height = i;
        this.itemView.setLayoutParams(pVar);
    }
}
