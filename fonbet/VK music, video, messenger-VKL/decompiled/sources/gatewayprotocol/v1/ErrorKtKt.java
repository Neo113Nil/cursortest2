package gatewayprotocol.v1;

import gatewayprotocol.v1.ErrorKt;
import gatewayprotocol.v1.ErrorOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ErrorKt.kt */
/* loaded from: classes8.dex */
public final class ErrorKtKt {
    /* renamed from: -initializeerror, reason: not valid java name */
    public static final ErrorOuterClass.Error m236initializeerror(izs<? super ErrorKt.Dsl, s3q0> izsVar) {
        ErrorKt.Dsl _create = ErrorKt.Dsl.Companion._create(ErrorOuterClass.Error.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final ErrorOuterClass.Error copy(ErrorOuterClass.Error error, izs<? super ErrorKt.Dsl, s3q0> izsVar) {
        ErrorKt.Dsl _create = ErrorKt.Dsl.Companion._create(error.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
