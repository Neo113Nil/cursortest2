package xsna;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;

/* compiled from: VideoAlertButtonsListView.kt */
/* loaded from: classes3.dex */
public final class m1s0 extends LinearLayout {
    public static final int b = iah0.a(8);
    public static final int c = iah0.a(32);

    public final void a(int i, String str) {
        String string = getContext().getString(i);
        TextView textView = new TextView(getContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setBackground(m33.a(R.drawable.ripple_8dp, textView.getContext()));
        textView.setText(string);
        textView.setClickable(true);
        textView.setFocusable(true);
        com.vk.typography.b.k(textView, FontFamily.MEDIUM, Float.valueOf(15.0f), 4);
        f4m.r(c, textView);
        int i2 = b;
        textView.setPadding(i2, i2, i2, i2);
        textView.setTextColor(e3m.f(R.attr.vk_ui_vkontakte_button_tertiary_foreground, textView.getContext()));
        textView.setTag(str);
        addView(textView);
    }

    public final void setListener(View.OnClickListener onClickListener) {
        kxt0 kxt0Var = new kxt0(this);
        while (kxt0Var.hasNext()) {
            kxt0Var.next().setOnClickListener(onClickListener);
        }
    }
}
