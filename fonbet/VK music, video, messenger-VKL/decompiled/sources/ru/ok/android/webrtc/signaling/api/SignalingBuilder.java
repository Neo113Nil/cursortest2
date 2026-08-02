package ru.ok.android.webrtc.signaling.api;

import android.os.Looper;
import ru.ok.android.webrtc.ConversationIdProvider;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.sensor.NetworkAvailabilitySensor;

/* loaded from: classes9.dex */
public final class SignalingBuilder {
    public final Signaling.Transport a;
    public final ConversationIdProvider b;
    public int d;
    public int e;
    public boolean g;
    public boolean h;
    public Signaling.MessageInterceptor i;
    public Looper j;
    public NetworkAvailabilitySensor k;
    public RTCLog c = new RTCLog.NoOp();
    public boolean f = true;

    public SignalingBuilder(Signaling.Transport transport, ConversationIdProvider conversationIdProvider) {
        this.a = transport;
        this.b = conversationIdProvider;
    }

    public final Signaling build() {
        return new Signaling(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final ConversationIdProvider getCidProvider() {
        return this.b;
    }

    public final Signaling.Transport getTransport() {
        return this.a;
    }

    public final SignalingBuilder setIsCommandMergeEnabled(boolean z) {
        this.g = z;
        return this;
    }

    public final SignalingBuilder setIsFastRecoverEnabled(boolean z) {
        this.f = z;
        return this;
    }

    public final SignalingBuilder setLogger(RTCLog rTCLog) {
        this.c = rTCLog;
        return this;
    }

    public final SignalingBuilder setLooper(Looper looper) {
        this.j = looper;
        return this;
    }

    public final SignalingBuilder setMaxRetryCount(int i) {
        this.d = i;
        return this;
    }

    public final SignalingBuilder setMaxRetryTimeout(int i) {
        this.e = i;
        return this;
    }

    public final SignalingBuilder setMessageInterceptor(Signaling.MessageInterceptor messageInterceptor) {
        this.i = messageInterceptor;
        return this;
    }

    public final SignalingBuilder setSensor(NetworkAvailabilitySensor networkAvailabilitySensor) {
        this.k = networkAvailabilitySensor;
        return this;
    }

    public final SignalingBuilder setSmartCommandsEnabled(boolean z) {
        this.h = z;
        return this;
    }
}
