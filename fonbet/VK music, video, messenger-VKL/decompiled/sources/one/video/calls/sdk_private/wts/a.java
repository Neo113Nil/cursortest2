package one.video.calls.sdk_private.wts;

import java.security.cert.X509Certificate;
import one.video.calls.sdk.net.signaling.WTSignaling;
import one.video.calls.sdk.net.signaling.wt.nal.NALHostnameVerifier;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;

/* compiled from: r8-map-id-b60fecdec90728a8a3a0c07eda950c1720c8e7dcb79a20187f93a68f412a0d42 */
/* loaded from: classes8.dex */
public final class a implements NALHostnameVerifier {
    public final /* synthetic */ WTSignaling a;

    public a(WTSignaling wTSignaling) {
        this.a = wTSignaling;
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.NALHostnameVerifier
    public final boolean verify(String str, X509Certificate x509Certificate) {
        SignalingTransport.HostnameVerifier hostnameVerifier;
        hostnameVerifier = this.a.getHostnameVerifier();
        return hostnameVerifier.verify(str, x509Certificate);
    }
}
