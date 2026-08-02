package gatewayprotocol.v1;

import gatewayprotocol.v1.SessionCountersKt;
import gatewayprotocol.v1.SessionCountersOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: SessionCountersKt.kt */
/* loaded from: classes8.dex */
public final class SessionCountersKtKt {
    /* renamed from: -initializesessionCounters, reason: not valid java name */
    public static final SessionCountersOuterClass.SessionCounters m268initializesessionCounters(izs<? super SessionCountersKt.Dsl, s3q0> izsVar) {
        SessionCountersKt.Dsl _create = SessionCountersKt.Dsl.Companion._create(SessionCountersOuterClass.SessionCounters.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final SessionCountersOuterClass.SessionCounters copy(SessionCountersOuterClass.SessionCounters sessionCounters, izs<? super SessionCountersKt.Dsl, s3q0> izsVar) {
        SessionCountersKt.Dsl _create = SessionCountersKt.Dsl.Companion._create(sessionCounters.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
