package xsna;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.view.ExpandableTextViewGroup;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;

/* compiled from: OriginalTextViewGroup.kt */
/* loaded from: classes6.dex */
public final class fz80 extends LinearLayout {
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final ExpandableTextViewGroup d;

    public fz80(Context context) {
        super(context, null, 0);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        abg0 abg0Var = dhr0.t;
        appCompatTextView.setTextColor(abg0Var.c(R.attr.vk_legacy_text_primary));
        com.vk.typography.b.k(appCompatTextView, FontFamily.MEDIUM, Float.valueOf(16.0f), 4);
        this.b = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView2.setTextColor(abg0Var.c(R.attr.vk_legacy_text_secondary));
        com.vk.typography.b.k(appCompatTextView2, FontFamily.REGULAR, Float.valueOf(13.0f), 4);
        this.c = appCompatTextView2;
        ExpandableTextViewGroup expandableTextViewGroup = new ExpandableTextViewGroup(context, null, 6);
        expandableTextViewGroup.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        f4m.t(cn70.b(16), expandableTextViewGroup);
        this.d = expandableTextViewGroup;
        setOrientation(1);
        addView(appCompatTextView);
        addView(appCompatTextView2);
        addView(expandableTextViewGroup);
    }

    public final void setExpandListener(gzs<s3q0> gzsVar) {
        this.d.setOnExpandClickListener(new s7(gzsVar, 27));
    }

    public final void setExpandText(CharSequence charSequence) {
        this.d.setExpandText(charSequence);
    }

    public final void setMaxLinesForCollapsedText(int i) {
        this.d.setMaxLines(i);
    }

    public final void setOriginalText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public final void setSubtitle(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.c;
        appCompatTextView.setText(charSequence);
        bwt0.p0(appCompatTextView, charSequence.length() > 0);
    }

    public final void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
