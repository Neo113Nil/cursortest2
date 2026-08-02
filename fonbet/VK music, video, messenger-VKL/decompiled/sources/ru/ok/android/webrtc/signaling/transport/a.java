package ru.ok.android.webrtc.signaling.transport;

import android.os.Process;
import kotlin.Pair;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingStat;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import ru.ok.android.webrtc.signaling.transport.exception.BadEndpointException;
import ru.ok.android.webrtc.signaling.transport.log.SignalingLogger;
import xsna.diz0;
import xsna.gp;
import xsna.s3q0;
import xsna.ylx0;

/* loaded from: classes9.dex */
public final class a implements Runnable {
    public final boolean a;
    public final /* synthetic */ SignalingTransport b;

    public a(SignalingTransport signalingTransport, boolean z) {
        this.b = signalingTransport;
        this.a = z;
    }

    public static final s3q0 a(SignalingTransport signalingTransport, String str) {
        signalingTransport.getSignalingLogger().logSocketAlreadyInUse(str);
        return s3q0.a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SignalingStat signalingStat;
        SignalingStat.SignalingType signalingType;
        Signaling.ConnectFailureListener connectFailureListener;
        String str;
        String str2;
        Pair pair;
        int threadPriority = Process.getThreadPriority(Process.myTid());
        try {
            try {
                Process.setThreadPriority(10);
                Object socketLock = this.b.getSocketLock();
                final SignalingTransport signalingTransport = this.b;
                synchronized (socketLock) {
                    try {
                        signalingTransport.safelyDoIfSocketExists(new ylx0(signalingTransport, 1));
                        SignalingLogger signalingLogger = signalingTransport.getSignalingLogger();
                        str = signalingTransport.u;
                        signalingLogger.logConnect(str);
                        SignalingTransport.access$validateEndpoint(signalingTransport);
                        str2 = signalingTransport.u;
                        pair = signalingTransport.F;
                        signalingTransport.safelyCreateNewSocket(str2, pair != null ? (String) pair.i() : null, new SignalingTransport.SocketListener() { // from class: ru.ok.android.webrtc.signaling.transport.SignalingTransport$Connect$run$1$2
                            public boolean a;

                            @Override // ru.ok.android.webrtc.signaling.transport.SignalingTransport.SocketListener
                            public void onClosed(int i, String str3) {
                                SignalingTransport.this.a(str3);
                            }

                            @Override // ru.ok.android.webrtc.signaling.transport.SignalingTransport.SocketListener
                            public void onFailure(Throwable th) {
                                SignalingTransport.FallbackParams fallbackParams;
                                long msSinceBoot;
                                long msSinceBoot2;
                                SignalingTransport.FallbackParams fallbackParams2;
                                fallbackParams = SignalingTransport.this.n;
                                if (fallbackParams != null) {
                                    boolean z = true;
                                    if (fallbackParams.getEnableTimeoutBasedFallback()) {
                                        diz0 access$getReconnectContext = SignalingTransport.access$getReconnectContext(SignalingTransport.this);
                                        access$getReconnectContext.b++;
                                        SignalingLogger signalingLogger2 = access$getReconnectContext.c.getSignalingLogger();
                                        int i = access$getReconnectContext.b;
                                        msSinceBoot = access$getReconnectContext.c.l.getMsSinceBoot();
                                        signalingLogger2.log("Reconnection registered. Total count " + i + ", total time reconnecting " + (msSinceBoot - access$getReconnectContext.a));
                                        msSinceBoot2 = access$getReconnectContext.c.l.getMsSinceBoot();
                                        long j = msSinceBoot2 - access$getReconnectContext.a;
                                        fallbackParams2 = SignalingTransport.this.n;
                                        Long timeoutMS = fallbackParams2.getTimeoutMS();
                                        long longValue = timeoutMS != null ? timeoutMS.longValue() : SignalingTransport.FALLBACK_TO_OTHER_TRANSPORT_TIMEOUT;
                                        if ((!this.a || this.a) && j < longValue) {
                                            z = false;
                                        }
                                        SignalingLogger signalingLogger3 = SignalingTransport.this.getSignalingLogger();
                                        boolean z2 = this.a;
                                        boolean z3 = this.a;
                                        StringBuilder c = gp.c("Connection failed, fallback_allowed=", ", because initial_connection=", ", did_open=", z, z2);
                                        c.append(z3);
                                        c.append(", total_time_in_reconnect=");
                                        c.append(j);
                                        signalingLogger3.log(c.toString());
                                        SignalingTransport.access$handleSocketFailure(SignalingTransport.this, z, th);
                                        return;
                                    }
                                }
                                SignalingTransport.access$handleSocketFailure(SignalingTransport.this, this.a, th);
                            }

                            @Override // ru.ok.android.webrtc.signaling.transport.SignalingTransport.SocketListener
                            public void onMessage(String str3) {
                                SignalingTransport.this.b(str3);
                            }

                            @Override // ru.ok.android.webrtc.signaling.transport.SignalingTransport.SocketListener
                            public void onOpen() {
                                this.a = true;
                                SignalingTransport.access$resetReconnectContext(SignalingTransport.this);
                                SignalingTransport.access$resetReconnectDelay(SignalingTransport.this);
                                SignalingTransport.access$handleSocketOpen(SignalingTransport.this);
                            }
                        });
                        s3q0 s3q0Var = s3q0.a;
                    } finally {
                    }
                }
                Process.setThreadPriority(threadPriority);
            } catch (Throwable th) {
                Process.setThreadPriority(threadPriority);
                throw th;
            }
        } catch (BadEndpointException e) {
            signalingStat = this.b.d;
            signalingType = this.b.k;
            signalingStat.onFailedByException(signalingType, e);
            this.b.getSignalingLogger().reportException(e.getMessage(), e);
            connectFailureListener = this.b.c;
            if (connectFailureListener != null) {
                connectFailureListener.onConnectFailed(new Signaling.ConnectFailureListener.FailureReason.BadEndpoint(e.getMessage()), this.b);
            }
            this.b.dispose();
            Process.setThreadPriority(threadPriority);
        } catch (Throwable th2) {
            SignalingTransport.access$handleSocketFailure(this.b, this.a, th2);
            Process.setThreadPriority(threadPriority);
        }
    }
}
