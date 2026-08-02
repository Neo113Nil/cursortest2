package xsna;

import xsna.ij20;

/* compiled from: ContactClearCmd.kt */
/* loaded from: classes2.dex */
public final class j8j extends le6<s3q0> {
    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        ij20.a aVar = new ij20.a();
        aVar.d = bz2.m();
        aVar.c = "account.resetMessagesContacts";
        aVar.i = true;
        bz2.h(new ij20(aVar));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof j8j;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return -1318538291;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ContactClearCmd";
    }
}
