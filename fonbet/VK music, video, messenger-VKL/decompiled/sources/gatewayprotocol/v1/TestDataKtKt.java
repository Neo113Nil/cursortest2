package gatewayprotocol.v1;

import gatewayprotocol.v1.TestDataKt;
import gatewayprotocol.v1.TestDataOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: TestDataKt.kt */
/* loaded from: classes8.dex */
public final class TestDataKtKt {
    /* renamed from: -initializetestData, reason: not valid java name */
    public static final TestDataOuterClass.TestData m273initializetestData(izs<? super TestDataKt.Dsl, s3q0> izsVar) {
        TestDataKt.Dsl _create = TestDataKt.Dsl.Companion._create(TestDataOuterClass.TestData.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final TestDataOuterClass.TestData copy(TestDataOuterClass.TestData testData, izs<? super TestDataKt.Dsl, s3q0> izsVar) {
        TestDataKt.Dsl _create = TestDataKt.Dsl.Companion._create(testData.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
