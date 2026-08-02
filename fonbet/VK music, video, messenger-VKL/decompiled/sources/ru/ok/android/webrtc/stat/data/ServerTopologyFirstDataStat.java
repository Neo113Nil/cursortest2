package ru.ok.android.webrtc.stat.data;

import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.scheme.FirstMediaCallType;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.gzs;

/* loaded from: classes9.dex */
public final class ServerTopologyFirstDataStat extends FirstDataStatComponent {
    public final boolean h;
    public final gzs i;
    public final gzs j;
    public final String k;

    public ServerTopologyFirstDataStat(boolean z, gzs<Integer> gzsVar, gzs<Boolean> gzsVar2, TimeProvider timeProvider, CallEventualStatSender callEventualStatSender, RTCLog rTCLog) {
        super(timeProvider, callEventualStatSender, rTCLog);
        this.h = z;
        this.i = gzsVar;
        this.j = gzsVar2;
        this.k = "ServerTopologyFirstDataStat";
    }

    @Override // ru.ok.android.webrtc.stat.data.FirstDataStatComponent
    public String getLogTag() {
        return this.k;
    }

    @Override // ru.ok.android.webrtc.stat.data.FirstDataStat
    public void onAnyOtherAccept() {
        if (this.h) {
            trackStart();
            setCallType(FirstMediaCallType.SERVER_CHANGE_TOPOLOGY);
        }
    }

    @Override // ru.ok.android.webrtc.stat.data.FirstDataStatComponent, ru.ok.android.webrtc.stat.data.FirstDataStat
    public void onFirstData() {
        if (((Boolean) this.j.invoke()).booleanValue()) {
            if (((Number) this.i.invoke()).intValue() == 0) {
                setReported(true);
            } else {
                super.onFirstData();
            }
        }
    }

    @Override // ru.ok.android.webrtc.stat.data.FirstDataStat
    public void onMeAccepted() {
        if (this.h) {
            return;
        }
        trackStart();
        setCallType(FirstMediaCallType.SERVER_INCOMING);
    }

    @Override // ru.ok.android.webrtc.stat.data.FirstDataStat
    public void onSignalingConnected() {
        if (((Boolean) this.j.invoke()).booleanValue()) {
            trackStart();
            setCallType(FirstMediaCallType.SERVER_JOIN);
        }
    }
}
