package xsna;

import android.text.Editable;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* compiled from: DebugDevSettingsFragment.java */
/* loaded from: classes17.dex */
public final class t4l extends sno0 {
    public final /* synthetic */ TextView b;

    public t4l(TextView textView) {
        this.b = textView;
    }

    @Override // xsna.sno0, android.text.TextWatcher
    public final void afterTextChanged(@NonNull Editable editable) {
        String obj = editable.toString();
        boolean z = true;
        if (!obj.isEmpty()) {
            try {
                Long.parseLong(obj);
            } catch (NumberFormatException unused) {
                z = false;
            }
        }
        this.b.setEnabled(z);
    }
}
