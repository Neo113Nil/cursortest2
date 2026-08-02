package xsna;

import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: WordIterator.android.kt */
/* loaded from: classes11.dex */
public final class sux0 {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final BreakIterator d;

    /* compiled from: WordIterator.android.kt */
    public static final class a {
        public static boolean a(int i) {
            int type = Character.getType(i);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }

    public sux0(CharSequence charSequence, int i, Locale locale) {
        this.a = charSequence;
        if (charSequence.length() < 0) {
            vzw.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            vzw.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.d = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new xlb(i, charSequence));
    }

    public final void a(int i) {
        boolean z = false;
        int i2 = this.b;
        int i3 = this.c;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder a2 = odj.a(i, i2, "Invalid offset: ", ". Valid range is [", " , ");
        a2.append(i3);
        a2.append(']');
        vzw.a(a2.toString());
    }

    public final boolean b(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        CharSequence charSequence = this.a;
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!androidx.emoji2.text.c.d()) {
                    return false;
                }
                androidx.emoji2.text.c a2 = androidx.emoji2.text.c.a();
                if (a2.c() != 1 || a2.b(i3, charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean c(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return a.a(Character.codePointBefore(this.a, i));
    }

    public final boolean d(int i) {
        a(i);
        if (!this.d.isBoundary(i)) {
            return false;
        }
        if (f(i) && f(i - 1) && f(i + 1)) {
            return false;
        }
        return i <= 0 || i >= this.a.length() - 1 || !(e(i) || e(i + 1));
    }

    public final boolean e(int i) {
        int i2 = i - 1;
        CharSequence charSequence = this.a;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (epx.f(of, unicodeBlock) && epx.f(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return epx.f(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && epx.f(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public final boolean f(int i) {
        if (i >= this.c || this.b > i) {
            return false;
        }
        CharSequence charSequence = this.a;
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!androidx.emoji2.text.c.d()) {
                return false;
            }
            androidx.emoji2.text.c a2 = androidx.emoji2.text.c.a();
            if (a2.c() != 1 || a2.b(i, charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    public final boolean g(int i) {
        if (i >= this.c || this.b > i) {
            return false;
        }
        return a.a(Character.codePointAt(this.a, i));
    }

    public final int h(int i) {
        a(i);
        int following = this.d.following(i);
        return (f(following + (-1)) && f(following) && !e(following)) ? h(following) : following;
    }

    public final int i(int i) {
        a(i);
        int preceding = this.d.preceding(i);
        return (f(preceding) && b(preceding) && !e(preceding)) ? i(preceding) : preceding;
    }
}
