package xsna;

import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: DialogConversationCardHideCmd.kt */
/* loaded from: classes2.dex */
public final class xcm extends le6<Boolean> {
    public final long b;
    public final String c;

    public xcm(long j, String str) {
        this.b = j;
        this.c = str;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        xgl0 I0 = w2wVar.I0();
        long j = this.b;
        I0.u(new wcm(j, ref$BooleanRef, 0));
        boolean z = ref$BooleanRef.element;
        if (z) {
            w2wVar.S0().V(j);
            bz2.c(new fnm(j, this.c), null);
        }
        return Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcm)) {
            return false;
        }
        xcm xcmVar = (xcm) obj;
        return this.b == xcmVar.b && epx.f(this.c, xcmVar.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogConversationCardHideCmd(peerId=");
        sb.append(this.b);
        sb.append(", cardId=");
        return ho8.a(sb, this.c, ')');
    }
}
