package gatewayprotocol.v1;

import com.google.protobuf.Timestamp;
import gatewayprotocol.v1.TransactionDataKt;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: TransactionDataKt.kt */
/* loaded from: classes8.dex */
public final class TransactionDataKtKt {
    /* renamed from: -initializetransactionData, reason: not valid java name */
    public static final TransactionEventRequestOuterClass.TransactionData m276initializetransactionData(izs<? super TransactionDataKt.Dsl, s3q0> izsVar) {
        TransactionDataKt.Dsl _create = TransactionDataKt.Dsl.Companion._create(TransactionEventRequestOuterClass.TransactionData.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final TransactionEventRequestOuterClass.TransactionData copy(TransactionEventRequestOuterClass.TransactionData transactionData, izs<? super TransactionDataKt.Dsl, s3q0> izsVar) {
        TransactionDataKt.Dsl _create = TransactionDataKt.Dsl.Companion._create(transactionData.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final Timestamp getTimestampOrNull(TransactionEventRequestOuterClass.TransactionDataOrBuilder transactionDataOrBuilder) {
        if (transactionDataOrBuilder.hasTimestamp()) {
            return transactionDataOrBuilder.getTimestamp();
        }
        return null;
    }
}
