package gatewayprotocol.v1;

import com.google.protobuf.Timestamp;
import gatewayprotocol.v1.TimestampsKt;
import gatewayprotocol.v1.TimestampsOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: TimestampsKt.kt */
/* loaded from: classes8.dex */
public final class TimestampsKtKt {
    /* renamed from: -initializetimestamps, reason: not valid java name */
    public static final TimestampsOuterClass.Timestamps m274initializetimestamps(izs<? super TimestampsKt.Dsl, s3q0> izsVar) {
        TimestampsKt.Dsl _create = TimestampsKt.Dsl.Companion._create(TimestampsOuterClass.Timestamps.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final TimestampsOuterClass.Timestamps copy(TimestampsOuterClass.Timestamps timestamps, izs<? super TimestampsKt.Dsl, s3q0> izsVar) {
        TimestampsKt.Dsl _create = TimestampsKt.Dsl.Companion._create(timestamps.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final Timestamp getTimestampOrNull(TimestampsOuterClass.TimestampsOrBuilder timestampsOrBuilder) {
        if (timestampsOrBuilder.hasTimestamp()) {
            return timestampsOrBuilder.getTimestamp();
        }
        return null;
    }
}
