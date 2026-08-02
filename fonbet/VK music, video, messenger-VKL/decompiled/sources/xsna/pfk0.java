package xsna;

/* compiled from: SoundCaptchaViewDelegate.kt */
/* loaded from: classes15.dex */
public final class pfk0 extends xsj0 {
    public final /* synthetic */ qfk0 b;

    public pfk0(qfk0 qfk0Var) {
        this.b = qfk0Var;
    }

    @Override // xsna.xsj0, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b.l.setEnabled(charSequence.length() > 0);
    }
}
