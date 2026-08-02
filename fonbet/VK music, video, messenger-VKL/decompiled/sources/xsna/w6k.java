package xsna;

import xsna.t6k;

/* compiled from: CreateChatAdapter.kt */
/* loaded from: classes2.dex */
public final class w6k extends rno0 {
    public final /* synthetic */ v230 b;
    public final /* synthetic */ t6k.h c;

    public w6k(v230 v230Var, t6k.h hVar) {
        this.b = v230Var;
        this.c = hVar;
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ucp ucpVar = ucp.a;
        ucp.i(charSequence);
        this.b.i = charSequence;
        nkr0 nkr0Var = this.c.l;
        drm0.N(charSequence);
        nkr0Var.getClass();
    }
}
