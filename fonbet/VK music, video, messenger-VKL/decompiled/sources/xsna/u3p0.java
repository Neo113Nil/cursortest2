package xsna;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.attachpicker.widget.CustomSpinner;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;

/* compiled from: ToolbarVc.kt */
/* loaded from: classes15.dex */
public final class u3p0 {
    public final l5t a;
    public final LinearLayout b;
    public final CustomSpinner c;

    public u3p0(Context context, String str, dhr0 dhr0Var, l5t l5tVar, p3h p3hVar, nwk nwkVar, cnh cnhVar, cws cwsVar) {
        this.a = l5tVar;
        LinearLayout b = l5tVar.b(context, p3hVar, nwkVar, cwsVar);
        bwt0.i0(b, new f6m0(cnhVar, 4));
        this.b = b;
        if (str == null || str.length() == 0) {
            this.c = l5tVar.d(context, b);
            return;
        }
        this.c = null;
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setAllCaps(true);
        textView.setGravity(19);
        com.vk.typography.b.k(textView, FontFamily.MEDIUM, Float.valueOf(14.0f), 4);
        dhr0Var.m0(textView, R.attr.vk_ui_text_secondary);
        b.addView(textView, new FrameLayout.LayoutParams(-2, -1));
    }
}
