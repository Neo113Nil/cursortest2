package xsna;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.widget.TextView;

/* compiled from: PollEditorScreen.kt */
/* loaded from: classes17.dex */
public final class kpb0 extends rno0 {
    public final /* synthetic */ hpb0 b;

    public kpb0(hpb0 hpb0Var) {
        this.b = hpb0Var;
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.b.m.onNext(s3q0.a);
        ucp ucpVar = ucp.a;
        ucp.i(editable);
    }

    @Override // xsna.rno0, android.text.TextWatcher
    @SuppressLint({"SetTextI18n"})
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int length = charSequence.length();
        hpb0 hpb0Var = this.b;
        bpn0 bpn0Var = hpb0Var.w;
        int i4 = hpb0Var.e;
        boolean z = length >= i4 + (-20);
        bwt0.p0((TextView) bpn0Var.getValue(), z);
        if (z) {
            ((TextView) bpn0Var.getValue()).setText(charSequence.length() + " / " + i4);
        }
        hpb0Var.t();
    }
}
