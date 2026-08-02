package gatewayprotocol.v1;

import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TransactionEventRequestKt;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: TransactionEventRequestKt.kt */
/* loaded from: classes8.dex */
public final class TransactionEventRequestKtKt {
    /* renamed from: -initializetransactionEventRequest, reason: not valid java name */
    public static final TransactionEventRequestOuterClass.TransactionEventRequest m277initializetransactionEventRequest(izs<? super TransactionEventRequestKt.Dsl, s3q0> izsVar) {
        TransactionEventRequestKt.Dsl _create = TransactionEventRequestKt.Dsl.Companion._create(TransactionEventRequestOuterClass.TransactionEventRequest.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final TransactionEventRequestOuterClass.TransactionEventRequest copy(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, izs<? super TransactionEventRequestKt.Dsl, s3q0> izsVar) {
        TransactionEventRequestKt.Dsl _create = TransactionEventRequestKt.Dsl.Companion._create(transactionEventRequest.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder transactionEventRequestOrBuilder) {
        if (transactionEventRequestOrBuilder.hasDynamicDeviceInfo()) {
            return transactionEventRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder transactionEventRequestOrBuilder) {
        if (transactionEventRequestOrBuilder.hasStaticDeviceInfo()) {
            return transactionEventRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
