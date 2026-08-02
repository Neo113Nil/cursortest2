package xsna;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: StoryHashtagDialogPresenter.kt */
/* loaded from: classes16.dex */
public final class q4m0 implements TextWatcher {
    public final /* synthetic */ s4m0 b;

    public q4m0(s4m0 s4m0Var) {
        this.b = s4m0Var;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b.g = false;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
