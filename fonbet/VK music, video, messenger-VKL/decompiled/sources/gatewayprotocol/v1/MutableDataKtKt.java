package gatewayprotocol.v1;

import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.MutableDataKt;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: MutableDataKt.kt */
/* loaded from: classes8.dex */
public final class MutableDataKtKt {
    /* renamed from: -initializemutableData, reason: not valid java name */
    public static final MutableDataOuterClass.MutableData m253initializemutableData(izs<? super MutableDataKt.Dsl, s3q0> izsVar) {
        MutableDataKt.Dsl _create = MutableDataKt.Dsl.Companion._create(MutableDataOuterClass.MutableData.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final MutableDataOuterClass.MutableData copy(MutableDataOuterClass.MutableData mutableData, izs<? super MutableDataKt.Dsl, s3q0> izsVar) {
        MutableDataKt.Dsl _create = MutableDataKt.Dsl.Companion._create(mutableData.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final AllowedPiiOuterClass.AllowedPii getAllowedPiiOrNull(MutableDataOuterClass.MutableDataOrBuilder mutableDataOrBuilder) {
        if (mutableDataOrBuilder.hasAllowedPii()) {
            return mutableDataOrBuilder.getAllowedPii();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(MutableDataOuterClass.MutableDataOrBuilder mutableDataOrBuilder) {
        if (mutableDataOrBuilder.hasSessionCounters()) {
            return mutableDataOrBuilder.getSessionCounters();
        }
        return null;
    }
}
