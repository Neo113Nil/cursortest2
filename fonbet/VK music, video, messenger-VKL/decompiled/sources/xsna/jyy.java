package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vkontakte.android.R;

/* compiled from: LeadFormAnswerViewsDelegate.kt */
/* loaded from: classes4.dex */
public final class jyy {
    public static FrameLayout a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = e3m.a(R.dimen.paddingXS, context);
        frameLayout.setLayoutParams(marginLayoutParams);
        int a = e3m.a(R.dimen.lead_form_answer_padding_horizontal, context);
        int a2 = e3m.a(R.dimen.lead_form_answer_padding_vertical, context);
        frameLayout.setPadding(a, a2, a, a2);
        frameLayout.setBackground(m33.a(R.drawable.bg_contrast_highlight_8dp, context));
        return frameLayout;
    }
}
