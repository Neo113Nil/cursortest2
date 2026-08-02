package xsna;

import android.text.Editable;

/* compiled from: JoinDialogViewCreator.kt */
/* loaded from: classes7.dex */
public final class g0y extends xsj0 {
    public final /* synthetic */ a1t b;

    public g0y(a1t a1tVar) {
        this.b = a1tVar;
    }

    @Override // xsna.xsj0, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.b.run();
    }
}
