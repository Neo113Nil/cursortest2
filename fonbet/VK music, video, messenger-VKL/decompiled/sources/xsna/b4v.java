package xsna;

import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: HideMsgTranscriptCmd.kt */
/* loaded from: classes2.dex */
public final class b4v extends le6<s3q0> {
    public final int b;
    public final int c;

    public b4v(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        w2wVar.I0().u(new lf3(this, ref$BooleanRef, w2wVar, 4));
        if (ref$BooleanRef.element) {
            w2wVar.S0().s(this.b, null);
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4v)) {
            return false;
        }
        b4v b4vVar = (b4v) obj;
        return this.b == b4vVar.b && this.c == b4vVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("HideMsgTranscriptCmd(msgLocalId=");
        sb.append(this.b);
        sb.append(", attachLocalId=");
        return vu5.b(sb, this.c, ')');
    }
}
