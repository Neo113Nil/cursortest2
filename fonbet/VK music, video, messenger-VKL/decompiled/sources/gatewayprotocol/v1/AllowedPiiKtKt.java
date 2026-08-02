package gatewayprotocol.v1;

import gatewayprotocol.v1.AllowedPiiKt;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: AllowedPiiKt.kt */
/* loaded from: classes8.dex */
public final class AllowedPiiKtKt {
    /* renamed from: -initializeallowedPii, reason: not valid java name */
    public static final AllowedPiiOuterClass.AllowedPii m215initializeallowedPii(izs<? super AllowedPiiKt.Dsl, s3q0> izsVar) {
        AllowedPiiKt.Dsl _create = AllowedPiiKt.Dsl.Companion._create(AllowedPiiOuterClass.AllowedPii.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final AllowedPiiOuterClass.AllowedPii copy(AllowedPiiOuterClass.AllowedPii allowedPii, izs<? super AllowedPiiKt.Dsl, s3q0> izsVar) {
        AllowedPiiKt.Dsl _create = AllowedPiiKt.Dsl.Companion._create(allowedPii.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
