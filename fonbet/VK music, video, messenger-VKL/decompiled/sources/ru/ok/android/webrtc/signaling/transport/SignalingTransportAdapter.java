package ru.ok.android.webrtc.signaling.transport;

import java.util.concurrent.locks.ReentrantLock;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.TransportType;
import ru.ok.android.webrtc.signaling.transport.SignalingTransportAdapter;
import xsna.epx;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class SignalingTransportAdapter implements Signaling.Transport {
    public final izs a;
    public final SignalingTransportAdapter$fallbackListener$1 b;
    public Signaling.Transport c;
    public Signaling.Transport.Listener d;
    public Long e;
    public final ReentrantLock f;

    public static final class Builder {
        public final izs a;

        public Builder(izs<? super Params, ? extends Signaling.Transport> izsVar) {
            this.a = izsVar;
        }

        public final Signaling.Transport build() {
            return new SignalingTransportAdapter(this.a, null);
        }
    }

    public interface FallbackAwareSignalingTransport {

        public interface Listener {
            void onFallbackNeeded(Signaling.Transport transport, Params params);
        }

        void setListener(Listener listener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [ru.ok.android.webrtc.signaling.transport.SignalingTransportAdapter$FallbackAwareSignalingTransport$Listener, ru.ok.android.webrtc.signaling.transport.SignalingTransportAdapter$fallbackListener$1] */
    public SignalingTransportAdapter(izs izsVar, zcl zclVar) {
        this.a = izsVar;
        ?? r10 = new FallbackAwareSignalingTransport.Listener() { // from class: ru.ok.android.webrtc.signaling.transport.SignalingTransportAdapter$fallbackListener$1
            @Override // ru.ok.android.webrtc.signaling.transport.SignalingTransportAdapter.FallbackAwareSignalingTransport.Listener
            public void onFallbackNeeded(Signaling.Transport transport, SignalingTransportAdapter.Params params) {
                ReentrantLock reentrantLock;
                Signaling.Transport transport2;
                izs izsVar2;
                Signaling.Transport.Listener listener;
                Long l;
                reentrantLock = SignalingTransportAdapter.this.f;
                SignalingTransportAdapter signalingTransportAdapter = SignalingTransportAdapter.this;
                reentrantLock.lock();
                try {
                    transport2 = signalingTransportAdapter.c;
                    if (transport != transport2) {
                        reentrantLock.unlock();
                        return;
                    }
                    SignalingTransportAdapter.FallbackAwareSignalingTransport fallbackAwareSignalingTransport = transport instanceof SignalingTransportAdapter.FallbackAwareSignalingTransport ? (SignalingTransportAdapter.FallbackAwareSignalingTransport) transport : null;
                    if (fallbackAwareSignalingTransport != null) {
                        fallbackAwareSignalingTransport.setListener(null);
                    }
                    transport.registerListener(null);
                    transport.dispose();
                    izsVar2 = signalingTransportAdapter.a;
                    Object invoke = izsVar2.invoke(params);
                    Signaling.Transport transport3 = (Signaling.Transport) invoke;
                    listener = signalingTransportAdapter.d;
                    if (listener != null) {
                        transport3.registerListener(listener);
                    }
                    l = signalingTransportAdapter.e;
                    if (l != null) {
                        transport3.updateActivityTimeout(l.longValue());
                    }
                    SignalingTransportAdapter.access$setUpFallbackListener(signalingTransportAdapter, transport3);
                    signalingTransportAdapter.c = (Signaling.Transport) invoke;
                    s3q0 s3q0Var = s3q0.a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        };
        this.b = r10;
        Signaling.Transport transport = (Signaling.Transport) izsVar.invoke(new Params(false, null, null, 0L, 14, null));
        FallbackAwareSignalingTransport fallbackAwareSignalingTransport = transport instanceof FallbackAwareSignalingTransport ? (FallbackAwareSignalingTransport) transport : 0;
        if (fallbackAwareSignalingTransport != 0) {
            fallbackAwareSignalingTransport.setListener(r10);
        }
        this.c = transport;
        this.f = new ReentrantLock();
    }

    public static final void access$setUpFallbackListener(SignalingTransportAdapter signalingTransportAdapter, Signaling.Transport transport) {
        signalingTransportAdapter.getClass();
        FallbackAwareSignalingTransport fallbackAwareSignalingTransport = transport instanceof FallbackAwareSignalingTransport ? (FallbackAwareSignalingTransport) transport : null;
        if (fallbackAwareSignalingTransport != null) {
            fallbackAwareSignalingTransport.setListener(signalingTransportAdapter.b);
        }
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Transport
    public void dispose() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            Signaling.Transport transport = this.c;
            if (transport != null) {
                transport.dispose();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Transport
    public void registerListener(Signaling.Transport.Listener listener) {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            this.d = listener;
            Signaling.Transport transport = this.c;
            if (transport != null) {
                transport.registerListener(listener);
                s3q0 s3q0Var = s3q0.a;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Transport
    public /* bridge */ /* synthetic */ void restart(String str, Long l) {
        restart(str, l.longValue());
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Transport
    public void send(String str) {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            Signaling.Transport transport = this.c;
            if (transport != null) {
                transport.send(str);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Transport
    public void tryReconnectNow() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            Signaling.Transport transport = this.c;
            if (transport != null) {
                transport.tryReconnectNow();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Transport
    public TransportType type() {
        Signaling.Transport transport = this.c;
        if (transport != null) {
            return transport.type();
        }
        return null;
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Transport
    public void updateActivityTimeout(long j) {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            this.e = Long.valueOf(j);
            Signaling.Transport transport = this.c;
            if (transport != null) {
                transport.updateActivityTimeout(j);
                s3q0 s3q0Var = s3q0.a;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void restart(String str, long j) {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            Signaling.Transport transport = this.c;
            if (transport != null) {
                transport.restart(str, Long.valueOf(j));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final class Params {
        public final boolean a;
        public final String b;
        public final Long c;
        public final long d;

        public Params(boolean z, String str, Long l, long j) {
            this.a = z;
            this.b = str;
            this.c = l;
            this.d = j;
        }

        public static /* synthetic */ Params copy$default(Params params, boolean z, String str, Long l, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                z = params.a;
            }
            if ((i & 2) != 0) {
                str = params.b;
            }
            if ((i & 4) != 0) {
                l = params.c;
            }
            if ((i & 8) != 0) {
                j = params.d;
            }
            Long l2 = l;
            return params.copy(z, str, l2, j);
        }

        public final boolean component1() {
            return this.a;
        }

        public final String component2() {
            return this.b;
        }

        public final Long component3() {
            return this.c;
        }

        public final long component4() {
            return this.d;
        }

        public final Params copy(boolean z, String str, Long l, long j) {
            return new Params(z, str, l, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return this.a == params.a && epx.f(this.b, params.b) && epx.f(this.c, params.c) && this.d == params.d;
        }

        public final String getConversationId() {
            return this.b;
        }

        public final boolean getForceWebSocket() {
            return this.a;
        }

        public final Long getPeerId() {
            return this.c;
        }

        public final long getRecoverTs() {
            return this.d;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.c;
            return Long.hashCode(this.d) + ((hashCode2 + (l != null ? l.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "Params(forceWebSocket=" + this.a + ", conversationId=" + this.b + ", peerId=" + this.c + ", recoverTs=" + this.d + ")";
        }

        public /* synthetic */ Params(boolean z, String str, Long l, long j, int i, zcl zclVar) {
            this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? 0L : j);
        }
    }
}
