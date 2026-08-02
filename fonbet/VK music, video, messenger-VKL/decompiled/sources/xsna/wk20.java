package xsna;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: MethodSelectorTitlesController.kt */
/* loaded from: classes15.dex */
public final class wk20 {
    public final e1 a;
    public final Context b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;

    public wk20(View view, e1 e1Var) {
        this.a = e1Var;
        this.b = view.getContext();
        this.c = (ImageView) view.findViewById(R.id.icon);
        this.d = (TextView) view.findViewById(R.id.title);
        this.e = (TextView) view.findViewById(R.id.first_subtitle);
        TextView textView = (TextView) view.findViewById(R.id.second_subtitle);
        this.f = textView;
        textView.setVisibility(8);
    }

    public final SpannableString a(String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        int K = drm0.K(0, 6, str, str2, false);
        int length = str2.length() + K;
        if (K == -1) {
            return spannableString;
        }
        spannableString.setSpan(new ForegroundColorSpan(krv0.m(R.attr.vk_ui_text_primary, this.b)), K, length, 33);
        return spannableString;
    }
}
