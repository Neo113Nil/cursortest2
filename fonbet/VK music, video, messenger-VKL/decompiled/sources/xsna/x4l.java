package xsna;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* compiled from: DebugDevSettingsFragment.java */
/* loaded from: classes17.dex */
public final class x4l implements TextWatcher {
    public final /* synthetic */ TextView b;

    public x4l(TextView textView) {
        this.b = textView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.b.setEnabled(editable.toString().matches("^[0-9]+$"));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
