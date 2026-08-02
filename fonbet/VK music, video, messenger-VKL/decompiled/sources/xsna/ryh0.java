package xsna;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.vk.catalog2.feature.search.holders.SearchSpellcheckVh;

/* compiled from: ViewExt.kt */
/* loaded from: classes16.dex */
public final class ryh0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ TextView b;
    public final /* synthetic */ SearchSpellcheckVh c;

    public ryh0(TextView textView, SearchSpellcheckVh searchSpellcheckVh) {
        this.b = textView;
        this.c = searchSpellcheckVh;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        TextView textView = this.b;
        int lineCount = textView.getLineCount();
        SearchSpellcheckVh searchSpellcheckVh = this.c;
        searchSpellcheckVh.getClass();
        if (lineCount > 2) {
            Spannable spannable = (Spannable) textView.getText();
            Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) spannable.subSequence(0, textView.getLayout().getLineEnd(1)).toString());
            spannableStringBuilder.replace(spannableStringBuilder.length() - 3, spannableStringBuilder.length(), (CharSequence) "...");
            for (Object obj : spans) {
                int spanStart = spannable.getSpanStart(obj);
                int spanEnd = spannable.getSpanEnd(obj);
                if (spanStart > drm0.H(spannableStringBuilder)) {
                    spanStart = spannableStringBuilder.length();
                }
                if (spanEnd > drm0.H(spannableStringBuilder)) {
                    spanEnd = spannableStringBuilder.length();
                }
                spannableStringBuilder.setSpan(obj, spanStart, spanEnd, 18);
            }
            searchSpellcheckVh.getClass();
            textView.setMaxLines(2);
            SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
            textView.setText(new SpannableString(spannableStringBuilder));
            textView.getViewTreeObserver().addOnGlobalLayoutListener(new syh0(textView));
        }
    }
}
