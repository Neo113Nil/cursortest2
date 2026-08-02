package xsna;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.HashSet;

/* compiled from: HashtagEditTextHelper.kt */
/* loaded from: classes4.dex */
public final class dvu implements TextWatcher {
    public final EditText b;
    public final qdc0 c;
    public final wn4 d;
    public int e = -1;

    public dvu(EditText editText, qdc0 qdc0Var, wn4 wn4Var) {
        this.b = editText;
        this.c = qdc0Var;
        this.d = wn4Var;
    }

    public static void a(dvu dvuVar, String str) {
        int i;
        i420[] i420VarArr;
        boolean z;
        EditText editText = dvuVar.b;
        wn4 wn4Var = dvuVar.d;
        String obj = editText.getText().toString();
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd >= 0 && selectionEnd < obj.length()) {
            i = aio0.a(selectionEnd, obj);
        } else if (obj.length() <= 0 || selectionEnd != obj.length()) {
            i = dvuVar.e;
            if (i == -1) {
                HashSet<Character> hashSet = aio0.a;
                i = aio0.a(obj.length() - 1, obj);
            }
        } else {
            i = aio0.a(selectionEnd - 1, obj);
        }
        int max = Math.max(0, i);
        HashSet<Character> hashSet2 = aio0.a;
        int length = obj.length();
        int i2 = (selectionEnd < 0 || selectionEnd > length) ? length - 1 : selectionEnd;
        if (max != -1) {
            int i3 = max;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (aio0.a.contains(Character.valueOf(obj.charAt(i3)))) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
        }
        boolean z2 = selectionEnd > 0 && obj.length() > selectionEnd && obj.charAt(selectionEnd) == ' ';
        Editable editableText = editText.getEditableText();
        if (editableText != null) {
            wn4Var.getClass();
            i420VarArr = (i420[]) editableText.getSpans(max, i2, i420.class);
        } else {
            i420VarArr = null;
        }
        Editable editableText2 = dvuVar.b.getEditableText();
        if (editableText2 != null) {
            wn4Var.getClass();
            i420[] i420VarArr2 = (i420[]) editableText2.getSpans(max, i2, i420.class);
            if (i420VarArr2 != null && i420VarArr2.length != 0) {
                z = false;
                if (max <= i2 || !z) {
                }
                try {
                    Editable editableText3 = editText.getEditableText();
                    if (editableText3 != null) {
                        if (i420VarArr != null) {
                            for (i420 i420Var : i420VarArr) {
                                editableText3.removeSpan(i420Var);
                            }
                        }
                        int i4 = max + 1;
                        editableText3.replace(i4, i2, str);
                        if (z2) {
                            return;
                        }
                        editableText3.insert(i4 + str.length(), " ");
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
        }
        z = true;
        if (max <= i2) {
        }
    }

    public final void b(int i) {
        String str;
        String obj = this.b.getText().toString();
        HashSet<Character> hashSet = aio0.a;
        int i2 = i;
        while (i2 > 0 && !aio0.a.contains(Character.valueOf(obj.charAt(i2 - 1)))) {
            i2--;
        }
        HashSet<Character> hashSet2 = aio0.a;
        Character z0 = erm0.z0(i2, obj);
        boolean z = (z0 != null ? z0.charValue() : ' ') == '#';
        qdc0 qdc0Var = this.c;
        if (!z || i2 >= i) {
            qdc0Var.Xl();
            return;
        }
        while (i < obj.length() && !aio0.a.contains(Character.valueOf(obj.charAt(i)))) {
            i++;
        }
        try {
            str = obj.substring(i2 + 1, i);
        } catch (IndexOutOfBoundsException unused) {
            str = "";
        }
        qdc0Var.Uk(str);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z = charSequence == null || charSequence.length() == 0;
        qdc0 qdc0Var = this.c;
        if (charSequence == null || charSequence.length() == 0) {
            qdc0Var.Xl();
            return;
        }
        EditText editText = this.b;
        String obj = editText.getText().toString();
        int length = z ? obj.length() : editText.getSelectionEnd();
        int a = aio0.a(length - 1, obj);
        this.e = a;
        if (a < 0) {
            qdc0Var.Xl();
            return;
        }
        int i4 = a - 1;
        int i5 = a + 2 < charSequence.length() ? this.e + 2 : this.e;
        Editable editableText = editText.getEditableText();
        if (editableText != null) {
            this.d.getClass();
            i420[] i420VarArr = (i420[]) editableText.getSpans(i4, i5, i420.class);
            if (i420VarArr != null && i420VarArr.length != 0) {
                return;
            }
        }
        String substring = obj.substring(this.e + 1, length);
        for (int i6 = 0; i6 < substring.length(); i6++) {
            if (ro.j(substring.charAt(i6))) {
                return;
            }
        }
        qdc0Var.Uk(substring);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
