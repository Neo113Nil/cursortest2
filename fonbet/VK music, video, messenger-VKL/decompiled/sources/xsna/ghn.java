package xsna;

/* compiled from: EditAlbumView.kt */
/* loaded from: classes3.dex */
public final class ghn extends rno0 {
    public final izs<CharSequence, s3q0> b;
    public String c;

    /* JADX WARN: Multi-variable type inference failed */
    public ghn(izs<? super CharSequence, s3q0> izsVar) {
        this.b = izsVar;
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.c == null) {
            this.c = charSequence.toString();
        }
        if (epx.f(this.c, charSequence)) {
            return;
        }
        this.c = charSequence.toString();
        this.b.invoke(charSequence);
    }
}
