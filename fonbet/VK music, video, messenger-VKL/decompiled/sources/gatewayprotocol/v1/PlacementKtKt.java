package gatewayprotocol.v1;

import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.PlacementKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: PlacementKt.kt */
/* loaded from: classes8.dex */
public final class PlacementKtKt {
    /* renamed from: -initializeplacement, reason: not valid java name */
    public static final InitializationResponseOuterClass.Placement m259initializeplacement(izs<? super PlacementKt.Dsl, s3q0> izsVar) {
        PlacementKt.Dsl _create = PlacementKt.Dsl.Companion._create(InitializationResponseOuterClass.Placement.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final InitializationResponseOuterClass.Placement copy(InitializationResponseOuterClass.Placement placement, izs<? super PlacementKt.Dsl, s3q0> izsVar) {
        PlacementKt.Dsl _create = PlacementKt.Dsl.Companion._create(placement.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
