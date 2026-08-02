package ru.ok.android.webrtc.signaling.api;

import java.util.concurrent.ExecutorService;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.RTCLogConfiguration;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingTransportBuilder;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.gzs;
import xsna.swe0;
import xsna.wyg0;

/* loaded from: classes9.dex */
public abstract class SignalingTransportBuilder<T extends SignalingTransportBuilder<T>> {

    @Deprecated
    public static final long MAX_RECONNECT_DELAY_MS = 10000;
    public long a;
    public Signaling.ConnectFailureListener b;
    public SignalingStat c;
    public ExecutorService d;
    public RTCLog e;
    public RTCLogConfiguration f;
    public long g;
    public boolean h;
    public EndpointParameters i;
    public boolean j;
    public TimeProvider k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public gzs p;
    public SignalingTransport.Timeouts q;
    public wyg0 r;

    public abstract Signaling.Transport build();

    public final Signaling.ConnectFailureListener getConnectFailureListener() {
        return this.b;
    }

    public final EndpointParameters getEndpointParameters() {
        return this.i;
    }

    public final ExecutorService getExecutor() {
        return this.d;
    }

    public final RTCLog getLog() {
        return this.e;
    }

    public final RTCLogConfiguration getLogConfiguration() {
        return this.f;
    }

    public final gzs<Long> getPeerIdGenerator() {
        return this.p;
    }

    public final long getServerPingTimeoutMs() {
        return this.g;
    }

    public final SignalingStat getSignalingStat() {
        return this.c;
    }

    public final wyg0 getSslProvider() {
        return null;
    }

    public final TimeProvider getTimeProvider() {
        return this.k;
    }

    public final long getTimeoutMS() {
        return this.a;
    }

    public final SignalingTransport.Timeouts getTimeouts() {
        return this.q;
    }

    public final boolean isFastRecoverEnabled() {
        return this.h;
    }

    public final boolean isReplaceParametersInEndpointEnabled() {
        return this.j;
    }

    public final boolean isSNIEnabled() {
        return this.o;
    }

    public final boolean isSignalingLogThrottlingEnabled() {
        return this.l;
    }

    public final boolean isSummaryStatsEnabled() {
        return this.m;
    }

    public final boolean isUseOfIPEnabled() {
        return this.n;
    }

    /* renamed from: setConnectFailureListener, reason: collision with other method in class */
    public final void m377setConnectFailureListener(Signaling.ConnectFailureListener connectFailureListener) {
        this.b = connectFailureListener;
    }

    /* renamed from: setEndpointParameters, reason: collision with other method in class */
    public final void m378setEndpointParameters(EndpointParameters endpointParameters) {
        this.i = endpointParameters;
    }

    /* renamed from: setExecutor, reason: collision with other method in class */
    public final void m379setExecutor(ExecutorService executorService) {
        this.d = executorService;
    }

    /* renamed from: setFastRecoverEnabled, reason: collision with other method in class */
    public final void m380setFastRecoverEnabled(boolean z) {
        this.h = z;
    }

    public final SignalingTransportBuilder<T> setIsReplaceParametersInEndpointEnabled(boolean z) {
        this.j = z;
        return this;
    }

    public final SignalingTransportBuilder<T> setIsSignalingLogThrottlingEnabled(boolean z) {
        this.l = z;
        return this;
    }

    public final SignalingTransportBuilder<T> setIsSummaryStatsEnabled(boolean z) {
        this.m = z;
        return this;
    }

    /* renamed from: setLog, reason: collision with other method in class */
    public final void m381setLog(RTCLog rTCLog) {
        this.e = rTCLog;
    }

    /* renamed from: setLogConfiguration, reason: collision with other method in class */
    public final void m382setLogConfiguration(RTCLogConfiguration rTCLogConfiguration) {
        this.f = rTCLogConfiguration;
    }

    /* renamed from: setPeerIdGenerator, reason: collision with other method in class */
    public final void m383setPeerIdGenerator(gzs<Long> gzsVar) {
        this.p = gzsVar;
    }

    public final void setReplaceParametersInEndpointEnabled(boolean z) {
        this.j = z;
    }

    /* renamed from: setSNIEnabled, reason: collision with other method in class */
    public final void m384setSNIEnabled(boolean z) {
        this.o = z;
    }

    /* renamed from: setServerPingTimeoutMs, reason: collision with other method in class */
    public final void m385setServerPingTimeoutMs(long j) {
        this.g = j;
    }

    public final void setSignalingLogThrottlingEnabled(boolean z) {
        this.l = z;
    }

    /* renamed from: setSignalingStat, reason: collision with other method in class */
    public final void m386setSignalingStat(SignalingStat signalingStat) {
        this.c = signalingStat;
    }

    public final void setSummaryStatsEnabled(boolean z) {
        this.m = z;
    }

    /* renamed from: setTimeProvider, reason: collision with other method in class */
    public final void m387setTimeProvider(TimeProvider timeProvider) {
        this.k = timeProvider;
    }

    /* renamed from: setTimeoutMS, reason: collision with other method in class */
    public final void m388setTimeoutMS(long j) {
        this.a = j;
    }

    /* renamed from: setTimeouts, reason: collision with other method in class */
    public final void m389setTimeouts(SignalingTransport.Timeouts timeouts) {
        this.q = timeouts;
    }

    /* renamed from: setUseOfIPEnabled, reason: collision with other method in class */
    public final void m390setUseOfIPEnabled(boolean z) {
        this.n = z;
    }

    public final SignalingTransportBuilder<T> setConnectFailureListener(Signaling.ConnectFailureListener connectFailureListener) {
        this.b = connectFailureListener;
        return this;
    }

    public final SignalingTransportBuilder<T> setEndpointParameters(EndpointParameters endpointParameters) {
        this.i = endpointParameters;
        return this;
    }

    public final SignalingTransportBuilder<T> setExecutor(ExecutorService executorService) {
        this.d = executorService;
        return this;
    }

    public final SignalingTransportBuilder<T> setFastRecoverEnabled(boolean z) {
        this.h = z;
        return this;
    }

    public final SignalingTransportBuilder<T> setLog(RTCLog rTCLog) {
        this.e = rTCLog;
        return this;
    }

    public final SignalingTransportBuilder<T> setLogConfiguration(RTCLogConfiguration rTCLogConfiguration) {
        this.f = rTCLogConfiguration;
        return this;
    }

    public final SignalingTransportBuilder<T> setPeerIdGenerator(gzs<Long> gzsVar) {
        this.p = gzsVar;
        return this;
    }

    public final SignalingTransportBuilder<T> setSNIEnabled(boolean z) {
        this.o = z;
        return this;
    }

    public final SignalingTransportBuilder<T> setServerPingTimeoutMs(long j) {
        this.g = j;
        return this;
    }

    public final SignalingTransportBuilder<T> setSignalingStat(SignalingStat signalingStat) {
        this.c = signalingStat;
        return this;
    }

    public final SignalingTransportBuilder<T> setTimeProvider(TimeProvider timeProvider) {
        this.k = timeProvider;
        return this;
    }

    public final SignalingTransportBuilder<T> setTimeoutMS(long j) {
        this.a = j;
        return this;
    }

    public final SignalingTransportBuilder<T> setTimeouts(SignalingTransport.Timeouts timeouts) {
        SignalingTransport.Timeouts timeouts2;
        if (timeouts != null) {
            timeouts2 = timeouts.copy(swe0.i(timeouts.getConnectTimeout(), 0L, Long.MAX_VALUE), swe0.i(timeouts.getInitialReconnectDelay(), 0L, Math.min(10000L, timeouts.getMaxReconnectDelay())), swe0.f(timeouts.getReconnectDelayScaleFactor(), 1.0f, 10.0f), swe0.i(timeouts.getMaxReconnectDelay(), 0L, 60000L));
        } else {
            timeouts2 = null;
        }
        this.q = timeouts2;
        return this;
    }

    public final SignalingTransportBuilder<T> setUseOfIPEnabled(boolean z) {
        this.n = z;
        return this;
    }

    public final SignalingTransportBuilder<T> setSSLProvider(wyg0 wyg0Var) {
        return this;
    }

    public final void setSslProvider(wyg0 wyg0Var) {
    }
}
