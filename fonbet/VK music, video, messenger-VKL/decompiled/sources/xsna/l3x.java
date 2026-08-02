package xsna;

/* compiled from: InputTextQuestionViewHolder.kt */
/* loaded from: classes16.dex */
public final class l3x extends sno0 {
    public final /* synthetic */ m3x b;

    public l3x(m3x m3xVar) {
        this.b = m3xVar;
    }

    @Override // xsna.sno0, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b.l.invoke(charSequence.toString());
    }
}
