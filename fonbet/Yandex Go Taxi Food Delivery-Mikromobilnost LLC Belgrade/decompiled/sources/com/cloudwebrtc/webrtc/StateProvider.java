package com.cloudwebrtc.webrtc;

import android.app.Activity;
import android.content.Context;
import defpackage.tt5;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnectionFactory;

/* loaded from: classes10.dex */
public interface StateProvider {
    Activity getActivity();

    Context getApplicationContext();

    LocalTrack getLocalTrack(String str);

    tt5 getMessenger();

    String getNextStreamUUID();

    String getNextTrackUUID();

    PeerConnectionFactory getPeerConnectionFactory();

    PeerConnectionObserver getPeerConnectionObserver(String str);

    boolean putLocalStream(String str, MediaStream mediaStream);

    boolean putLocalTrack(String str, LocalTrack localTrack);
}
