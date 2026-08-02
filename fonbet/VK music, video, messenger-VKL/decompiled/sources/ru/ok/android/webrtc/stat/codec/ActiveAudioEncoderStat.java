package ru.ok.android.webrtc.stat.codec;

import ru.ok.android.webrtc.stat.codec.ActiveEncodersStats;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import xsna.epx;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes9.dex */
public final class ActiveAudioEncoderStat {
    public final izs a;
    public ActiveEncodersStats.NamedCodecInfo b;

    public ActiveAudioEncoderStat(izs<? super ActiveEncodersStats.NamedCodecInfo, s3q0> izsVar) {
        this.a = izsVar;
    }

    public final void onRTCCodecInfo(ActiveEncodersStats.NamedCodecInfo namedCodecInfo) {
        Ssrc.CodecInfo codecInfo;
        if (namedCodecInfo != null) {
            ActiveEncodersStats.NamedCodecInfo namedCodecInfo2 = this.b;
            if (epx.f(namedCodecInfo2 != null ? namedCodecInfo2.getCanonicalName() : null, namedCodecInfo.getCanonicalName())) {
                String str = (namedCodecInfo2 == null || (codecInfo = namedCodecInfo2.getCodecInfo()) == null) ? null : codecInfo.sdpFmtpLine;
                Ssrc.CodecInfo codecInfo2 = namedCodecInfo.getCodecInfo();
                if (epx.f(str, codecInfo2 != null ? codecInfo2.sdpFmtpLine : null)) {
                    return;
                }
            }
            this.a.invoke(namedCodecInfo);
            this.b = namedCodecInfo;
        }
    }

    public final void onStopped() {
        this.b = null;
    }

    public final void onStarted() {
    }
}
