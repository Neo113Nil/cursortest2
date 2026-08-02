package ru.ok.android.webrtc.stat.codec;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.stat.codec.ActiveEncodersStats;
import xsna.s3q0;
import xsna.wzs;

/* loaded from: classes9.dex */
public final /* synthetic */ class b extends FunctionReferenceImpl implements wzs {
    public b(ActiveEncodersStats activeEncodersStats) {
        super(2, activeEncodersStats, ActiveEncodersStats.class, "onVideoCodec", "onVideoCodec(Lru/ok/android/webrtc/stat/codec/ActiveEncodersStats$NamedCodecInfo;J)V", 0);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj2).longValue();
        ActiveEncodersStats.access$onVideoCodec((ActiveEncodersStats) this.receiver, (ActiveEncodersStats.NamedCodecInfo) obj, longValue);
        return s3q0.a;
    }
}
