package xsna;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class kpp implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        kpp kppVar = opp.T;
        StringBuilder sb = new StringBuilder();
        for (int i5 = i; i5 < i2; i5++) {
            int type = Character.getType(charSequence.charAt(i5));
            if (type != 19 && type != 28) {
                sb.append(charSequence.charAt(i5));
            }
        }
        if (sb.length() == i2 - i) {
            return null;
        }
        return sb.toString();
    }
}
