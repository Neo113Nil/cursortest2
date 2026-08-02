package ru.ok.android.webrtc.stat.codec;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.stat.codec.ActiveEncodersStats;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes9.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements izs {
    public a(ActiveEncodersStats activeEncodersStats) {
        super(1, activeEncodersStats, ActiveEncodersStats.class, "onAudioCodec", "onAudioCodec(Lru/ok/android/webrtc/stat/codec/ActiveEncodersStats$NamedCodecInfo;)V", 0);
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ActiveEncodersStats.access$onAudioCodec((ActiveEncodersStats) this.receiver, (ActiveEncodersStats.NamedCodecInfo) obj);
        return s3q0.a;
    }
}
