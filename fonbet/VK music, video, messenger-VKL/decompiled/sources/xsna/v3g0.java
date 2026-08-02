package xsna;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: ReplyBarView.kt */
/* loaded from: classes18.dex */
public final class v3g0 extends FrameLayout {
    public TextView b;
    public TextView c;

    public final SpannableStringBuilder a(int i, String str, boolean z) {
        if (str.length() == 0) {
            return null;
        }
        String string = getContext().getResources().getString(i, str);
        int K = drm0.K(0, 6, string, str, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        if (z) {
            spannableStringBuilder.insert(K, (CharSequence) "👥 ");
            dhr0.a.getClass();
            baf0 b = dhr0.t.b(R.drawable.vk_icon_users_16, R.attr.vk_ui_icon_accent);
            Drawable drawable = b.b;
            b.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            spannableStringBuilder.setSpan(new ImageSpan(b, 0), K, K + 2, 0);
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(dhr0.t.c(R.attr.vk_ui_text_link)), K, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final void b() {
        TextView textView = this.b;
        if (textView == null) {
            textView = null;
        }
        int maxWidth = textView.getMaxWidth();
        TextView textView2 = this.b;
        if (textView2 == null) {
            textView2 = null;
        }
        if (textView2.getText().length() > 0) {
            TextView textView3 = this.c;
            if (textView3 == null) {
                textView3 = null;
            }
            if (textView3.getText().length() > 0) {
                int i = (int) (iah0.f().widthPixels * 0.65d);
                if (i != maxWidth) {
                    TextView textView4 = this.b;
                    (textView4 != null ? textView4 : null).setMaxWidth(i);
                    return;
                }
                return;
            }
        }
        if (Integer.MAX_VALUE != maxWidth) {
            TextView textView5 = this.b;
            (textView5 != null ? textView5 : null).setMaxWidth(Integer.MAX_VALUE);
        }
    }

    public final void setOnReplyFromClickListener(gzs<s3q0> gzsVar) {
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        textView.setOnClickListener(new mna(3, this, gzsVar));
    }

    public final void setOnReplyToClickListener(gzs<s3q0> gzsVar) {
        TextView textView = this.b;
        if (textView == null) {
            textView = null;
        }
        textView.setOnClickListener(new q3g0(0, gzsVar));
    }

    public final void setOnReplyViewClickListener(gzs<s3q0> gzsVar) {
        setOnClickListener(new ed80(1, gzsVar));
    }

    public final void setReplyFromVisibility(boolean z) {
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        textView.setVisibility(z ? 0 : 8);
    }

    public final void setReplyToVisibility(boolean z) {
        TextView textView = this.b;
        if (textView == null) {
            textView = null;
        }
        textView.setVisibility(z ? 0 : 8);
    }
}
