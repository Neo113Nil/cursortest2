package xsna;

import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;

/* compiled from: AudioGetCatalogBlockById.java */
/* loaded from: classes14.dex */
public final class bp4 {
    public int a;
    public final Object b;
    public final CharSequence c;

    public bp4(String str, String str2, int i) {
        this.c = str;
        this.b = str2;
        this.a = i;
    }

    public void a(SpannableStringBuilder spannableStringBuilder, int i) {
        int i2 = this.a;
        Matcher matcher = (Matcher) this.b;
        int start = matcher.start();
        CharSequence charSequence = this.c;
        spannableStringBuilder.append(charSequence, i2, start);
        spannableStringBuilder.append(charSequence, matcher.start(i), matcher.end(i));
        this.a = matcher.end();
    }

    public void b(SpannableStringBuilder spannableStringBuilder) {
        int i = this.a;
        Matcher matcher = (Matcher) this.b;
        if (i < matcher.regionEnd()) {
            spannableStringBuilder.append(this.c, this.a, matcher.regionEnd());
        }
    }

    public void c(rsg0 rsg0Var) {
        rsg0Var.K("block_id", (String) this.c);
        String str = (String) this.b;
        if (str != null) {
            rsg0Var.K("start_from", str);
        }
        int i = this.a;
        if (i > 0) {
            rsg0Var.C(i, "count");
        }
        rsg0Var.C(1, "extended");
    }

    public CharSequence d(int i) {
        Matcher matcher = (Matcher) this.b;
        int start = matcher.start(i);
        int end = matcher.end(i);
        if (start < 0) {
            return "";
        }
        CharSequence charSequence = this.c;
        return (end > charSequence.length() || end - start < 0) ? "" : charSequence.subSequence(start, end);
    }

    public int e(int i) {
        Matcher matcher = (Matcher) this.b;
        return matcher.end(i) - matcher.start(i);
    }

    public bp4(Matcher matcher, CharSequence charSequence) {
        this.b = matcher;
        this.c = charSequence;
    }
}
