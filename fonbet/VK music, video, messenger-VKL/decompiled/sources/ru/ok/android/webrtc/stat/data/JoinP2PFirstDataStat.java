package ru.ok.android.webrtc.stat.data;

import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.scheme.FirstMediaCallType;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.gzs;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class JoinP2PFirstDataStat extends FirstDataStatComponent {
    public static final Companion Companion = new Companion(null);
    public final gzs h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public FirstMediaCallType l;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public JoinP2PFirstDataStat(gzs<Boolean> gzsVar, boolean z, boolean z2, TimeProvider timeProvider, CallEventualStatSender callEventualStatSender, RTCLog rTCLog) {
        super(timeProvider, callEventualStatSender, rTCLog);
        this.h = gzsVar;
        this.i = z;
        this.j = z2;
        this.k = "JoinP2PFirstDataStat";
        this.l = FirstMediaCallType.DIRECT_JOIN;
    }

    @Override // ru.ok.android.webrtc.stat.data.FirstDataStatComponent
    public FirstMediaCallType getCallType() {
        return this.l;
    }

    @Override // ru.ok.android.webrtc.stat.data.FirstDataStatComponent
    public String getLogTag() {
        return this.k;
    }

    @Override // ru.ok.android.webrtc.stat.data.FirstDataStat
    public void onAnyOtherAccept() {
        trackStart();
    }

    @Override // ru.ok.android.webrtc.stat.data.FirstDataStatComponent, ru.ok.android.webrtc.stat.data.FirstDataStat
    public void onFirstData() {
        if (((Boolean) this.h.invoke()).booleanValue() || this.i || !this.j) {
            return;
        }
        super.onFirstData();
    }

    @Override // ru.ok.android.webrtc.stat.data.FirstDataStat
    public void onMeAccepted() {
        trackStart();
    }

    @Override // ru.ok.android.webrtc.stat.data.FirstDataStatComponent
    public void setCallType(FirstMediaCallType firstMediaCallType) {
        this.l = firstMediaCallType;
    }
}
