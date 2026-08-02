package xsna;

import xsna.vkw0;

/* compiled from: VoipCallsJoinToCallByPasswordView.kt */
/* loaded from: classes7.dex */
public final class nlw0 extends xsj0 {
    public final /* synthetic */ olw0 b;

    public nlw0(olw0 olw0Var) {
        this.b = olw0Var;
    }

    @Override // xsna.xsj0, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b.d.invoke(new vkw0.c(charSequence.toString()));
    }
}
