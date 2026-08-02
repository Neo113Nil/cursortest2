package gatewayprotocol.v1;

import gatewayprotocol.v1.ClientInfoKt;
import gatewayprotocol.v1.ClientInfoOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ClientInfoKt.kt */
/* loaded from: classes8.dex */
public final class ClientInfoKtKt {
    /* renamed from: -initializeclientInfo, reason: not valid java name */
    public static final ClientInfoOuterClass.ClientInfo m224initializeclientInfo(izs<? super ClientInfoKt.Dsl, s3q0> izsVar) {
        ClientInfoKt.Dsl _create = ClientInfoKt.Dsl.Companion._create(ClientInfoOuterClass.ClientInfo.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final ClientInfoOuterClass.ClientInfo copy(ClientInfoOuterClass.ClientInfo clientInfo, izs<? super ClientInfoKt.Dsl, s3q0> izsVar) {
        ClientInfoKt.Dsl _create = ClientInfoKt.Dsl.Companion._create(clientInfo.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
