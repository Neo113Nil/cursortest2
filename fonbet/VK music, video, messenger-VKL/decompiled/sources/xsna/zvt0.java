package xsna;

import android.text.Editable;

/* compiled from: ViewExt.kt */
/* loaded from: classes18.dex */
public final class zvt0 extends rno0 {
    public final /* synthetic */ io.reactivex.rxjava3.core.r<String> b;

    public zvt0(io.reactivex.rxjava3.core.r<String> rVar) {
        this.b = rVar;
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.b.onNext(editable.toString());
    }
}
