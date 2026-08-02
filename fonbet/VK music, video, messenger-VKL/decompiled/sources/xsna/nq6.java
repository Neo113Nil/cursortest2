package xsna;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: View.kt */
/* loaded from: classes4.dex */
public final class nq6 implements Runnable {
    public final /* synthetic */ View b;
    public final /* synthetic */ pq6 c;
    public final /* synthetic */ CharSequence d;

    public nq6(View view, pq6 pq6Var, CharSequence charSequence) {
        this.b = view;
        this.c = pq6Var;
        this.d = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pq6 pq6Var = this.c;
        TextView textView = pq6Var.A;
        textView.setBreakStrategy(0);
        lfo0 lfo0Var = pq6Var.V;
        CharSequence charSequence = this.d;
        lfo0Var.b = charSequence;
        oq6 oq6Var = new oq6(pq6Var, charSequence);
        SpannableString spannableString = new SpannableString(pq6Var.itemView.getContext().getString(R.string.more_lowercase));
        x7q x7qVar = new x7q();
        x7qVar.b(R.attr.vk_ui_text_secondary);
        x7qVar.m = new w16(oq6Var, 1);
        Typeface a = dbg0.a(R.font.vk_roboto_regular, pq6Var.itemView.getContext());
        spannableString.setSpan(new StyleSpan(a != null ? a.getStyle() : Typeface.DEFAULT.getStyle()), 0, spannableString.length(), 0);
        spannableString.setSpan(x7qVar, 0, spannableString.length(), 0);
        lfo0Var.c = new SpannableStringBuilder(spannableString);
        textView.setText(lfo0.b(lfo0Var, (textView.getMeasuredWidth() - textView.getPaddingStart()) - textView.getPaddingEnd(), 0, 6));
    }
}
