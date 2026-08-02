package xsna;

import android.text.Editable;

/* compiled from: BaseWatcher.kt */
/* loaded from: classes6.dex */
public abstract class ys6 extends xsj0 {
    public String b;

    public abstract String a(String str);

    @Override // xsna.xsj0, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        if (epx.f(obj, this.b)) {
            return;
        }
        this.b = obj;
        editable.replace(0, editable.length(), a(obj));
    }
}
