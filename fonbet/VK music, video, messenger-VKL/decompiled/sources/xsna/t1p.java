package xsna;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.EditTextPreference;

/* compiled from: EditTextPreferenceDialogFragmentCompat.java */
/* loaded from: classes12.dex */
public class t1p extends androidx.preference.a {
    public EditText F;
    public CharSequence G;
    public final a H = new a();
    public long I = -1;

    /* compiled from: EditTextPreferenceDialogFragmentCompat.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            t1p.this.Kn();
        }
    }

    @Override // androidx.preference.a
    public final boolean En() {
        return true;
    }

    @Override // androidx.preference.a
    public final void Fn(@NonNull View view) {
        super.Fn(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.F = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.F.setText(this.G);
        EditText editText2 = this.F;
        editText2.setSelection(editText2.getText().length());
        ((EditTextPreference) Dn()).getClass();
    }

    @Override // androidx.preference.a
    public final void Hn(boolean z) {
        if (z) {
            String obj = this.F.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) Dn();
            if (editTextPreference.a(obj)) {
                editTextPreference.O(obj);
            }
        }
    }

    @Override // androidx.preference.a
    public final void Jn() {
        this.I = SystemClock.currentThreadTimeMillis();
        Kn();
    }

    public final void Kn() {
        long j = this.I;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.F;
        if (editText == null || !editText.isFocused()) {
            this.I = -1L;
            return;
        }
        if (((InputMethodManager) this.F.getContext().getSystemService("input_method")).showSoftInput(this.F, 0)) {
            this.I = -1L;
            return;
        }
        EditText editText2 = this.F;
        a aVar = this.H;
        editText2.removeCallbacks(aVar);
        this.F.postDelayed(aVar, 50L);
    }

    @Override // androidx.preference.a, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.G = ((EditTextPreference) Dn()).W;
        } else {
            this.G = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.a, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.G);
    }
}
