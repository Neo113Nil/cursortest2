package xsna;

import java.util.Iterator;

/* compiled from: BotBtnDisableAllLoadersCmd.kt */
/* loaded from: classes2.dex */
public final class o28 extends xl6<s3q0> {
    @Override // xsna.m2w
    public final String a() {
        return "im-bot-buttons-update";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        Iterator it = w2wVar.I0().s().a().iterator();
        while (it.hasNext()) {
            w2wVar.b1(this, new s28((pq8) it.next(), false, null, "1"));
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof o28;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return 0;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "BotBtnDisableAllLoadersCmd()";
    }
}
