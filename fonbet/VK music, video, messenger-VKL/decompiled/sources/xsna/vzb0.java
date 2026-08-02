package xsna;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.concurrent.TimeUnit;

/* compiled from: PositiveIntegerTextWatcher.kt */
/* loaded from: classes7.dex */
public final class vzb0 implements TextWatcher {
    public final izs<Integer, s3q0> b;
    public final io.reactivex.rxjava3.subjects.f<Integer> c;
    public final io.reactivex.rxjava3.disposables.c d;
    public final EditText e;
    public final k9x f;
    public String g;

    /* JADX WARN: Multi-variable type inference failed */
    public vzb0(EditText editText, k9x k9xVar, io.reactivex.rxjava3.disposables.b bVar, izs<? super Integer, s3q0> izsVar) {
        this.b = izsVar;
        io.reactivex.rxjava3.subjects.f<Integer> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.c = fVar;
        io.reactivex.rxjava3.disposables.c subscribe = fVar.w0(200L, TimeUnit.MILLISECONDS).a0(asu0.a.d()).subscribe(new n1r(new m360(this, 24), 28));
        bVar.b(subscribe);
        this.d = subscribe;
        this.e = editText;
        this.f = k9xVar;
        this.g = "";
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        int length = str.length();
        io.reactivex.rxjava3.subjects.f<Integer> fVar = this.c;
        if (length == 0) {
            fVar.onNext(0);
            return;
        }
        Integer m = arm0.m(10, str);
        if (m != null && this.f.e(m.intValue())) {
            fVar.onNext(m);
            return;
        }
        String str2 = this.g;
        EditText editText = this.e;
        if (epx.f(editText.getText().toString(), str2)) {
            return;
        }
        editText.setText(str2);
        editText.setSelection(editText.getText().length());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = "";
        }
        this.g = str;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
