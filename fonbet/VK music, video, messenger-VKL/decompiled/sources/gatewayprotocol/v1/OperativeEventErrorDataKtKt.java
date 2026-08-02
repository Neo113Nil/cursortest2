package gatewayprotocol.v1;

import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: OperativeEventErrorDataKt.kt */
/* loaded from: classes8.dex */
public final class OperativeEventErrorDataKtKt {
    /* renamed from: -initializeoperativeEventErrorData, reason: not valid java name */
    public static final OperativeEventRequestOuterClass.OperativeEventErrorData m256initializeoperativeEventErrorData(izs<? super OperativeEventErrorDataKt.Dsl, s3q0> izsVar) {
        OperativeEventErrorDataKt.Dsl _create = OperativeEventErrorDataKt.Dsl.Companion._create(OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final OperativeEventRequestOuterClass.OperativeEventErrorData copy(OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorData, izs<? super OperativeEventErrorDataKt.Dsl, s3q0> izsVar) {
        OperativeEventErrorDataKt.Dsl _create = OperativeEventErrorDataKt.Dsl.Companion._create(operativeEventErrorData.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
