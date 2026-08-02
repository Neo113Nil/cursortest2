package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: ChangePublishPostponeDateMenu.kt */
/* loaded from: classes4.dex */
public final class ssa extends s770 {
    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        TextView textView = (TextView) hkpVar.f(R.id.item_text);
        int i2 = ((e520) obj).a;
        if (i2 == R.id.postpone_date_menu_change) {
            textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
            textView.setText(R.string.postpone_date_menu_change);
        } else if (i2 == R.id.postpone_date_menu_delete) {
            textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_negative));
            textView.setText(R.string.postpone_date_menu_delete);
        }
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view.findViewById(R.id.item_text));
        return hkpVar;
    }
}
