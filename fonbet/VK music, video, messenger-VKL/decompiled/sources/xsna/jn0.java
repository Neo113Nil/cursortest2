package xsna;

import android.text.Editable;

/* compiled from: AddRoomToCallDialogFragment.kt */
/* loaded from: classes7.dex */
public final class jn0 extends xsj0 {
    public final /* synthetic */ b0 b;

    public jn0(b0 b0Var) {
        this.b = b0Var;
    }

    @Override // xsna.xsj0, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.b.run();
    }
}
