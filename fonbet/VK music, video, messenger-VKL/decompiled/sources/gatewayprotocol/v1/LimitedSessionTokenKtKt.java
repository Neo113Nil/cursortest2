package gatewayprotocol.v1;

import gatewayprotocol.v1.LimitedSessionTokenKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: LimitedSessionTokenKt.kt */
/* loaded from: classes8.dex */
public final class LimitedSessionTokenKtKt {
    /* renamed from: -initializelimitedSessionToken, reason: not valid java name */
    public static final UniversalRequestOuterClass.LimitedSessionToken m248initializelimitedSessionToken(izs<? super LimitedSessionTokenKt.Dsl, s3q0> izsVar) {
        LimitedSessionTokenKt.Dsl _create = LimitedSessionTokenKt.Dsl.Companion._create(UniversalRequestOuterClass.LimitedSessionToken.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final UniversalRequestOuterClass.LimitedSessionToken copy(UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken, izs<? super LimitedSessionTokenKt.Dsl, s3q0> izsVar) {
        LimitedSessionTokenKt.Dsl _create = LimitedSessionTokenKt.Dsl.Companion._create(limitedSessionToken.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
