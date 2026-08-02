package defpackage;

import com.google.android.gms.internal.play_billing.l0;

/* loaded from: classes11.dex */
public final class nqb1 extends zfb1 {
    public final /* synthetic */ vsb1 A;

    public nqb1(vsb1 vsb1Var) {
        this.A = vsb1Var;
    }

    @Override // defpackage.zfb1
    public final String a() {
        l0 l0Var = (l0) this.A.a.get();
        return l0Var == null ? "Completer object has been garbage collected, future will fail soon" : oyr.p("tag=[", String.valueOf(l0Var.a), "]");
    }
}
