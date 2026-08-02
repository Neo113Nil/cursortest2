package defpackage;

import android.view.ViewStructure;
import android.view.autofill.AutofillValue;

/* loaded from: classes10.dex */
public final class l94 {
    public static final l94 a = new l94();

    public static int a(ViewStructure viewStructure) {
        return viewStructure.addChildCount(1);
    }

    public static AutofillValue b(String str) {
        if (str.length() >= 5000) {
            str = (Character.isHighSurrogate(str.charAt(4999)) && Character.isLowSurrogate(str.charAt(5000))) ? gvu0.A0(4999, str) : gvu0.A0(5000, str);
        }
        return AutofillValue.forText(str);
    }

    public static AutofillValue c(boolean z) {
        return AutofillValue.forToggle(z);
    }

    public static ViewStructure d(ViewStructure viewStructure, int i) {
        return viewStructure.newChild(i);
    }

    public static CharSequence e(AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }
}
