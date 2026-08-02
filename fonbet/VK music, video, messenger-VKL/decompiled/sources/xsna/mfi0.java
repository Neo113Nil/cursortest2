package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import xsna.plc0;

/* compiled from: SelectorSettingHolder.kt */
/* loaded from: classes4.dex */
public final class mfi0 extends vif0<plc0.b> {
    public static final SimpleDateFormat p = new SimpleDateFormat("HH:mm", Locale.getDefault());
    public final TextView n;
    public final TextView o;

    public mfi0(View view, com.vk.newsfeed.impl.posting.settings.mvi.c cVar) {
        super(view);
        this.n = (TextView) this.itemView.findViewById(R.id.tv_title);
        this.o = (TextView) this.itemView.findViewById(R.id.tv_subtitle);
        bwt0.i0(this.itemView, new aq1(19, this, cVar));
    }

    @Override // xsna.vif0
    public final void i6(plc0.b bVar) {
        int b;
        int i;
        int i2;
        plc0.b bVar2 = bVar;
        abg0 abg0Var = dhr0.t;
        int c = abg0Var.c(R.attr.vk_ui_text_primary);
        TextView textView = this.n;
        textView.setTextColor(c);
        TextView textView2 = this.o;
        bwt0.p0(textView2, false);
        textView2.setTextColor(abg0Var.c(R.attr.vk_ui_text_secondary));
        if (bVar2 instanceof plc0.b.C3517b) {
            String str = ((plc0.b.C3517b) bVar2).b;
            if (str == null) {
                i2 = cn70.b(48);
                textView.setText(g6(R.string.posting_settings_set_source));
                textView.setTextColor(abg0Var.c(R.attr.vk_ui_text_accent));
            } else {
                b = cn70.b(60);
                textView.setText(g6(R.string.posting_settings_source));
                bwt0.p0(textView2, true);
                textView2.setText(str);
                textView2.setTextColor(abg0Var.c(R.attr.vk_ui_text_accent));
                i2 = b;
            }
        } else if (bVar2 instanceof plc0.b.c) {
            int b2 = cn70.b(60);
            textView.setText(g6(R.string.posting_settings_publish));
            bwt0.p0(textView2, true);
            long j = ((plc0.b.c) bVar2).b;
            if (j > 0) {
                Date date = new Date(j);
                String g6 = g6(R.string.date_at);
                if (g6 == null) {
                    g6 = "";
                }
                textView2.setText(pvo0.j(date.getTime(), false, false) + ' ' + g6 + ' ' + p.format(date));
                textView2.setTextColor(abg0Var.c(R.attr.vk_ui_text_accent));
            } else {
                textView2.setText(g6(R.string.posting_settings_time_now));
            }
            i2 = b2;
        } else {
            if (!(bVar2 instanceof plc0.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            b = cn70.b(48);
            if (((plc0.b.a) bVar2).b) {
                textView2.setTextColor(abg0Var.c(R.attr.vk_ui_text_accent));
                i = R.string.posting_settings_advertising_ord_on;
            } else {
                i = R.string.posting_settings_advertising_ord_off;
            }
            bwt0.p0(textView2, true);
            textView.setText(g6(R.string.posting_settings_advertising_ord));
            textView2.setText(g6(i));
            i2 = b;
        }
        RecyclerView.p pVar = (RecyclerView.p) this.itemView.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) pVar).height = i2;
        this.itemView.setLayoutParams(pVar);
    }
}
