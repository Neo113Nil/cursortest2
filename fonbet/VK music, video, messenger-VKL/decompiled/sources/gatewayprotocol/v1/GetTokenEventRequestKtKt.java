package gatewayprotocol.v1;

import gatewayprotocol.v1.GetTokenEventRequestKt;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: GetTokenEventRequestKt.kt */
/* loaded from: classes8.dex */
public final class GetTokenEventRequestKtKt {
    /* renamed from: -initializegetTokenEventRequest, reason: not valid java name */
    public static final GetTokenEventRequestOuterClass.GetTokenEventRequest m238initializegetTokenEventRequest(izs<? super GetTokenEventRequestKt.Dsl, s3q0> izsVar) {
        GetTokenEventRequestKt.Dsl _create = GetTokenEventRequestKt.Dsl.Companion._create(GetTokenEventRequestOuterClass.GetTokenEventRequest.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final GetTokenEventRequestOuterClass.GetTokenEventRequest copy(GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest, izs<? super GetTokenEventRequestKt.Dsl, s3q0> izsVar) {
        GetTokenEventRequestKt.Dsl _create = GetTokenEventRequestKt.Dsl.Companion._create(getTokenEventRequest.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
