package xsna;

import android.text.Editable;
import android.text.SpannableString;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import com.vk.log.L;
import io.jsonwebtoken.JwtParser;
import java.util.HashSet;
import java.util.regex.Pattern;
import xsna.mvu;

/* compiled from: HashtagEditTextHelper.kt */
/* loaded from: classes16.dex */
public final class evu {
    public final EditText a;
    public final Object b;
    public final kvu c;
    public final yzs<Integer, Integer, CharSequence, Boolean> d;
    public qux0 g;
    public final Pattern e = Pattern.compile("([a-zA-Zа-яА-ЯёЁ0-9_])+");
    public final HashSet<Character> f = izi0.d(' ', ',', ';', Character.valueOf(JwtParser.SEPARATOR_CHAR), '!', '?', '-', '\n', '(', ')', '[', ']', '@');
    public final io.reactivex.rxjava3.subjects.f<mvu> h = new io.reactivex.rxjava3.subjects.f<>();

    public evu(AppCompatEditText appCompatEditText, lvu lvuVar, kvu kvuVar, b4j0 b4j0Var) {
        this.a = appCompatEditText;
        this.b = lvuVar;
        this.c = kvuVar;
        this.d = b4j0Var;
    }

    public final void a(Integer num, Integer num2, String str) {
        kvu kvuVar = this.c;
        EditText editText = this.a;
        try {
            int selectionEnd = editText.getSelectionEnd();
            Editable text = editText.getText();
            int intValue = num != null ? num.intValue() : c(selectionEnd, text);
            int intValue2 = num2 != null ? num2.intValue() : b(selectionEnd, text);
            if (intValue < 0 || intValue > intValue2) {
                return;
            }
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(kvuVar.a(str), 0, str.length(), 33);
            this.g = null;
            for (Object obj : text.getSpans(intValue, intValue2, kvuVar.f())) {
                text.removeSpan(obj);
            }
            yzs<Integer, Integer, CharSequence, Boolean> yzsVar = this.d;
            if (yzsVar != null ? yzsVar.invoke(Integer.valueOf(intValue), Integer.valueOf(intValue2), spannableString).booleanValue() : false) {
                return;
            }
            text.replace(intValue, intValue2, spannableString);
            editText.setSelection(text.length());
            this.h.onNext(mvu.a.a);
        } catch (Throwable th) {
            L.g("Can't append hashtag", th);
        }
    }

    public final int b(int i, Editable editable) {
        int i2 = i;
        while (i2 >= 0 && i2 < editable.length()) {
            char charAt = editable.charAt(i2);
            if (this.f.contains(Character.valueOf(charAt)) || charAt == '#') {
                i = i2 - 1;
                break;
            }
            i2++;
        }
        return Math.max(i, i2 - 1);
    }

    public final int c(int i, Editable editable) {
        HashSet<Character> hashSet;
        do {
            i--;
            if (i < 0 || i >= editable.length()) {
                break;
            }
            char charAt = editable.charAt(i);
            hashSet = this.f;
            if (charAt == '#') {
                int i2 = i - 1;
                if (i2 < 0 || hashSet.contains(Character.valueOf(editable.charAt(i2)))) {
                    return i;
                }
                return -1;
            }
        } while (!hashSet.contains(Character.valueOf(editable.charAt(i))));
        return -1;
    }

    public final boolean d(CharSequence charSequence) {
        if (drm0.d0(charSequence, '#')) {
            charSequence = charSequence.subSequence(1, charSequence.length());
        }
        return this.e.matcher(charSequence).matches() && charSequence.length() > 0 && charSequence.length() < 50;
    }

    public final void e(int i) {
        try {
            Editable text = this.a.getText();
            int c = c(i, text);
            int b = b(i, text);
            if (c < 0 || c > b) {
                f(null);
                return;
            }
            int min = Math.min(b + 1, text.length());
            CharSequence subSequence = text.subSequence(c, min);
            qux0 qux0Var = new qux0(c, min, subSequence);
            if (drm0.d0(subSequence, '#')) {
                subSequence = subSequence.subSequence(1, subSequence.length());
            }
            if (subSequence.length() != 0 && !d(subSequence)) {
                f(null);
                return;
            }
            f(qux0Var);
        } catch (Throwable th) {
            L.g("Can't calculate hashtag position", th);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xsna.lvu] */
    public final void f(qux0 qux0Var) {
        if (epx.f(qux0Var, this.g)) {
            return;
        }
        qux0 qux0Var2 = this.g;
        this.g = qux0Var;
        io.reactivex.rxjava3.subjects.f<mvu> fVar = this.h;
        if (qux0Var == null) {
            fVar.onNext(mvu.a.a);
        } else {
            fVar.onNext(new mvu.b(qux0Var.c.toString()));
        }
        this.b.d(qux0Var2, qux0Var);
    }
}
