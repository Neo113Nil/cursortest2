package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BufferedChannel.kt */
/* loaded from: classes8.dex */
public final /* synthetic */ class sm8 extends FunctionReferenceImpl implements wzs<Long, qbb<Object>, qbb<Object>> {
    public static final sm8 b = new sm8(2, tm8.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);

    @Override // xsna.wzs
    public final qbb<Object> invoke(Long l, qbb<Object> qbbVar) {
        long longValue = l.longValue();
        qbb<Object> qbbVar2 = qbbVar;
        qbb<Object> qbbVar3 = tm8.a;
        return new qbb<>(longValue, qbbVar2, qbbVar2.f, 0);
    }
}
