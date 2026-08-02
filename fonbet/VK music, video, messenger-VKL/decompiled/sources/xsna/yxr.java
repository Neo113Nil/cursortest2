package xsna;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: FolderConfigurationNameInputVh.kt */
/* loaded from: classes18.dex */
public final class yxr implements TextWatcher {
    public final /* synthetic */ zxr b;

    public yxr(zxr zxrVar) {
        this.b = zxrVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable != null) {
            this.b.l.d(editable.toString());
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
