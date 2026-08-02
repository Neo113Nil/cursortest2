package defpackage;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import ru.yandex.taxi.widget.LetterSpacingSpan;

/* loaded from: classes13.dex */
public final class eco {
    public final zuj0 a;

    public eco(zuj0 zuj0Var) {
        this.a = zuj0Var;
    }

    public final CharSequence a(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        int i = kyh0.date_format_min;
        avj0 avj0Var = (avj0) this.a;
        SpannableString spannableString = new SpannableString(((Object) str) + "\n" + avj0Var.h(i));
        int length = str.toString().length() + 1;
        int length2 = spannableString.length();
        spannableString.setSpan(new AbsoluteSizeSpan((int) avj0Var.b(wtg0.pin_text_size_secondary)), length, length2, 18);
        spannableString.setSpan(new LetterSpacingSpan(0.06f), length, length2, 18);
        return spannableString;
    }
}
