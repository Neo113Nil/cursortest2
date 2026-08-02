package ru.ok.android.webrtc.stat.codec;

import ru.ok.android.webrtc.stat.codec.ActiveEncodersStats;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.epx;
import xsna.s3q0;
import xsna.wzs;

/* loaded from: classes9.dex */
public final class ActiveVideoEncoderStat {
    public final TimeProvider a;
    public final wzs b;
    public long c;
    public ActiveEncodersStats.NamedCodecInfo d;
    public boolean e;

    public ActiveVideoEncoderStat(TimeProvider timeProvider, wzs<? super ActiveEncodersStats.NamedCodecInfo, ? super Long, s3q0> wzsVar) {
        this.a = timeProvider;
        this.b = wzsVar;
    }

    public final void onRTCCodecInfo(ActiveEncodersStats.NamedCodecInfo namedCodecInfo) {
        if (this.e) {
            ActiveEncodersStats.NamedCodecInfo namedCodecInfo2 = this.d;
            if (epx.f(namedCodecInfo2 != null ? namedCodecInfo2.getCanonicalName() : null, namedCodecInfo != null ? namedCodecInfo.getCanonicalName() : null)) {
                return;
            }
            if (namedCodecInfo == null) {
                onStopped();
                return;
            }
            long msSinceBoot = this.a.getMsSinceBoot();
            ActiveEncodersStats.NamedCodecInfo namedCodecInfo3 = this.d;
            if (namedCodecInfo3 != null) {
                this.b.invoke(namedCodecInfo3, Long.valueOf(msSinceBoot - this.c));
            }
            this.c = msSinceBoot;
            this.d = namedCodecInfo;
            this.e = true;
        }
    }

    public final void onStarted() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.c = this.a.getMsSinceBoot();
    }

    public final void onStopped() {
        if (this.e) {
            this.e = false;
            ActiveEncodersStats.NamedCodecInfo namedCodecInfo = this.d;
            if (namedCodecInfo == null) {
                return;
            }
            this.b.invoke(namedCodecInfo, Long.valueOf(this.a.getMsSinceBoot() - this.c));
        }
    }
}
