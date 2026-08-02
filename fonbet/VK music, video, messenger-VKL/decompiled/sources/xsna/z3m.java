package xsna;

/* compiled from: DesignEditTextExt.kt */
/* loaded from: classes.dex */
public final class z3m extends xsj0 {
    public final /* synthetic */ izs<CharSequence, s3q0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public z3m(izs<? super CharSequence, s3q0> izsVar) {
        this.b = izsVar;
    }

    @Override // xsna.xsj0, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b.invoke(charSequence);
    }
}
