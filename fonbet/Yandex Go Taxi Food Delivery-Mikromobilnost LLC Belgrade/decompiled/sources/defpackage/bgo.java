package defpackage;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Protocol;

/* loaded from: classes9.dex */
public abstract class bgo {
    public static final wfo Companion = new wfo();
    public static final bgo NONE = new ufo();

    public void cacheConditionalHit(yf7 yf7Var, kvj0 kvj0Var) {
    }

    public void cacheHit(yf7 yf7Var, kvj0 kvj0Var) {
    }

    public void cacheMiss(yf7 yf7Var) {
    }

    public void callEnd(yf7 yf7Var) {
    }

    public void callFailed(yf7 yf7Var, IOException iOException) {
    }

    public void callStart(yf7 yf7Var) {
    }

    public void canceled(yf7 yf7Var) {
    }

    public void connectEnd(yf7 yf7Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
    }

    public void connectFailed(yf7 yf7Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
    }

    public void connectStart(yf7 yf7Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    public void connectionAcquired(yf7 yf7Var, s4e s4eVar) {
    }

    public void connectionReleased(yf7 yf7Var, s4e s4eVar) {
    }

    public void dispatcherQueueEnd(yf7 yf7Var, ryj ryjVar) {
    }

    public void dispatcherQueueStart(yf7 yf7Var, ryj ryjVar) {
    }

    public void dnsEnd(yf7 yf7Var, String str, List list) {
    }

    public void dnsStart(yf7 yf7Var, String str) {
    }

    public void followUpDecision(yf7 yf7Var, kvj0 kvj0Var, d5j0 d5j0Var) {
    }

    public final bgo plus(bgo bgoVar) {
        bgo bgoVar2 = NONE;
        if (this == bgoVar2) {
            return bgoVar;
        }
        bgo[] a = this instanceof sfo ? ((sfo) this).a() : new bgo[]{this};
        if (bgoVar == bgoVar2) {
            return this;
        }
        return new sfo((bgo[]) f73.t(a, bgoVar instanceof sfo ? ((sfo) bgoVar).a() : new bgo[]{bgoVar}));
    }

    public void proxySelectEnd(yf7 yf7Var, kwu kwuVar, List<Proxy> list) {
    }

    public void proxySelectStart(yf7 yf7Var, kwu kwuVar) {
    }

    public void requestBodyEnd(yf7 yf7Var, long j) {
    }

    public void requestBodyStart(yf7 yf7Var) {
    }

    public void requestFailed(yf7 yf7Var, IOException iOException) {
    }

    public void requestHeadersEnd(yf7 yf7Var, d5j0 d5j0Var) {
    }

    public void requestHeadersStart(yf7 yf7Var) {
    }

    public void responseBodyEnd(yf7 yf7Var, long j) {
    }

    public void responseBodyStart(yf7 yf7Var) {
    }

    public void responseFailed(yf7 yf7Var, IOException iOException) {
    }

    public void responseHeadersEnd(yf7 yf7Var, kvj0 kvj0Var) {
    }

    public void responseHeadersStart(yf7 yf7Var) {
    }

    public void retryDecision(yf7 yf7Var, IOException iOException, boolean z) {
    }

    public void satisfactionFailure(yf7 yf7Var, kvj0 kvj0Var) {
    }

    public void secureConnectEnd(yf7 yf7Var, o6u o6uVar) {
    }

    public void secureConnectStart(yf7 yf7Var) {
    }
}
