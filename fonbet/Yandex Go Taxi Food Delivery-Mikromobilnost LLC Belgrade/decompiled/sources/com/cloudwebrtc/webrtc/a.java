package com.cloudwebrtc.webrtc;

import defpackage.da20;
import org.webrtc.RTCStatsCollectorCallback;
import org.webrtc.RTCStatsReport;

/* loaded from: classes10.dex */
public final /* synthetic */ class a implements RTCStatsCollectorCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ PeerConnectionObserver b;
    public final /* synthetic */ da20 c;

    public /* synthetic */ a(PeerConnectionObserver peerConnectionObserver, da20 da20Var, int i) {
        this.a = i;
        this.b = peerConnectionObserver;
        this.c = da20Var;
    }

    @Override // org.webrtc.RTCStatsCollectorCallback
    public final void onStatsDelivered(RTCStatsReport rTCStatsReport) {
        int i = this.a;
        da20 da20Var = this.c;
        PeerConnectionObserver peerConnectionObserver = this.b;
        switch (i) {
            case 0:
                peerConnectionObserver.lambda$getStatsForTrack$0(da20Var, rTCStatsReport);
                break;
            case 1:
                peerConnectionObserver.lambda$getStatsForTrack$1(da20Var, rTCStatsReport);
                break;
            default:
                peerConnectionObserver.lambda$getStats$2(da20Var, rTCStatsReport);
                break;
        }
    }
}
