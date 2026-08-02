package xsna;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Pattern;

/* compiled from: StoryRegexFilter.kt */
/* loaded from: classes16.dex */
public final class kbm0 implements InputFilter {
    public final Pattern a;

    public kbm0(String str) {
        this.a = Pattern.compile(str);
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return (epx.f(charSequence, "") || charSequence == null || this.a.matcher(charSequence).matches()) ? charSequence : "";
    }
}
