package xsna;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.im.ui.views.dialogs.DialogItemView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.i5e0;
import xsna.xur0;

/* compiled from: PromoLinkViewHolder.kt */
/* loaded from: classes18.dex */
public final class q5e0 extends vfz<l5e0> {
    public xur0.a l;
    public i5e0.a m;

    public static DialogItemView.LinesCount h6() {
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        zdwVar.u.getClass();
        return cew.h().getInt("pref_dialogs_list_lines_number", 3) == 3 ? DialogItemView.LinesCount.LINES_3 : DialogItemView.LinesCount.LINES_2;
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(l5e0 l5e0Var) {
        i5e0.a aVar = this.m;
        i5e0.a aVar2 = l5e0Var.b;
        if (aVar == aVar2) {
            return;
        }
        this.m = aVar2;
        ((TextView) this.itemView.findViewById(R.id.promo_link_title)).setText(aVar2.b);
        TextView textView = (TextView) this.itemView.findViewById(R.id.promo_link_text);
        DialogItemView.LinesCount h6 = h6();
        DialogItemView.LinesCount linesCount = DialogItemView.LinesCount.LINES_2;
        textView.setSingleLine(h6 == linesCount);
        textView.setLines(h6() == DialogItemView.LinesCount.LINES_3 ? 2 : 1);
        textView.setText(aVar2.c);
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.promo_link_text_container);
        linearLayout.setGravity(h6() == linesCount ? 16 : 48);
        f4m.y(h6() != linesCount ? cn70.b(8) : 0, linearLayout);
        awt0.v(this.itemView.findViewById(R.id.promo_link_is_new), aVar2.e);
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.promo_link_logo);
        vKImageView.setRound(true);
        vKImageView.load(aVar2.d);
    }
}
