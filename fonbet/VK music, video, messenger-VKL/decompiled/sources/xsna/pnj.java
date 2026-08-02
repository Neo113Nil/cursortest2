package xsna;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.widget.EditText;

/* compiled from: ContextMenuDelegate.kt */
/* loaded from: classes3.dex */
public final class pnj implements TextWatcher {
    public final /* synthetic */ EditText b;
    public final /* synthetic */ EditText c;
    public final /* synthetic */ qnj d;

    public pnj(EditText editText, EditText editText2, qnj qnjVar) {
        this.b = editText;
        this.c = editText2;
        this.d = qnjVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText = this.b;
        editText.setText(editable);
        EditText editText2 = this.c;
        editText.setSelection(editText2.getSelectionStart(), editText2.getSelectionEnd());
        qnj qnjVar = this.d;
        ViewGroup viewGroup = qnjVar.e;
        if (viewGroup == null) {
            viewGroup = null;
        }
        qnjVar.b(viewGroup);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
