package xsna;

import kotlin.random.Random;

/* compiled from: TsCompanionSeedCmd.kt */
/* loaded from: classes2.dex */
public final class qsp0 extends le6<Long> {
    public static final qsp0 b = new qsp0();

    @Override // xsna.le6
    public final Long e(w2w w2wVar) {
        long m;
        Long k = w2wVar.I0().system().k();
        if (k != null) {
            m = k.longValue();
        } else {
            Random.b.getClass();
            m = Random.c.m();
        }
        return Long.valueOf(m);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qsp0);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return -692925355;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "TsCompanionSeedCmd";
    }
}
