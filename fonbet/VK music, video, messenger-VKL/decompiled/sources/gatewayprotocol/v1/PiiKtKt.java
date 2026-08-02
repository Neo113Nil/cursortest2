package gatewayprotocol.v1;

import gatewayprotocol.v1.PiiKt;
import gatewayprotocol.v1.PiiOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: PiiKt.kt */
/* loaded from: classes8.dex */
public final class PiiKtKt {
    /* renamed from: -initializepii, reason: not valid java name */
    public static final PiiOuterClass.Pii m258initializepii(izs<? super PiiKt.Dsl, s3q0> izsVar) {
        PiiKt.Dsl _create = PiiKt.Dsl.Companion._create(PiiOuterClass.Pii.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final PiiOuterClass.Pii copy(PiiOuterClass.Pii pii, izs<? super PiiKt.Dsl, s3q0> izsVar) {
        PiiKt.Dsl _create = PiiKt.Dsl.Companion._create(pii.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
