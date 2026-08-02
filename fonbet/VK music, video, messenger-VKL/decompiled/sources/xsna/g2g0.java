package xsna;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.vk.writebar.WriteBar;

/* compiled from: RepliesController.kt */
/* loaded from: classes18.dex */
public final class g2g0 implements TextWatcher {
    public final /* synthetic */ e2g0 b;

    public g2g0(e2g0 e2g0Var) {
        this.b = e2g0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ucp ucpVar = ucp.a;
        ucp.i(editable);
        e2g0 e2g0Var = this.b;
        q420 q420Var = e2g0Var.h;
        boolean z = q420Var != null ? q420Var.n : false;
        if (q420Var != null) {
            q420Var.afterTextChanged(editable);
        }
        if (z) {
            return;
        }
        WriteBar writeBar = e2g0Var.a;
        String a = e2g0Var.a();
        EditText input = writeBar.getInput();
        if (a.length() > 2048) {
            int selectionEnd = input.getSelectionEnd();
            writeBar.setText(erm0.D0(2048, a));
            int length = input.length();
            if (selectionEnd > length) {
                selectionEnd = length;
            }
            input.setSelection(selectionEnd);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        q420 q420Var = this.b.h;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        q420 q420Var = this.b.h;
        if (q420Var != null) {
            q420Var.onTextChanged(charSequence, i, i2, i3);
        }
    }
}
