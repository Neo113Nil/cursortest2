package one.video.calls.sdk.net.signaling.wt.nal;

import java.security.cert.X509Certificate;
import java.time.Duration;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import one.video.calls.sdk.net.signaling.wt.nal.NAL;
import one.video.calls.sdk.net.signaling.wt.nal.NALSocket;
import one.video.calls.sdk.net.signaling.wt.nal.internal.WebTransportCompressorDecompressor;
import one.video.calls.sdk.net.signaling.wt.nal.internal.WebTransportSocket;
import one.video.calls.sdk_private.f;
import one.video.calls.sdk_private.z;
import xsna.bpn0;
import xsna.gzs;
import xsna.qlv;
import xsna.sp;

/* compiled from: NAL.kt */
/* loaded from: classes8.dex */
public final class NAL {
    private final Lazy client$delegate;
    private final NALLog log;

    /* compiled from: NAL.kt */
    public static final class DelegatingHostnameVerifier implements f.h {
        private final NALHostnameVerifier delegate;

        public DelegatingHostnameVerifier(NALHostnameVerifier nALHostnameVerifier) {
            this.delegate = nALHostnameVerifier;
        }

        @Override // one.video.calls.sdk_private.f.h
        public final boolean verify(String str, X509Certificate x509Certificate) {
            return this.delegate.verify(str, x509Certificate);
        }
    }

    public NAL(final NALHostnameVerifier nALHostnameVerifier, final Long l, final X509TrustManager x509TrustManager, NALLog nALLog) {
        this.log = nALLog;
        this.client$delegate = new bpn0(new gzs<z>() { // from class: one.video.calls.sdk.net.signaling.wt.nal.NAL$client$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // xsna.gzs
            public final z invoke() {
                boolean z;
                sp spVar = new sp(29);
                X509TrustManager x509TrustManager2 = x509TrustManager;
                if (x509TrustManager2 != null) {
                    z = false;
                } else {
                    x509TrustManager2 = null;
                    z = true;
                }
                X509TrustManager x509TrustManager3 = x509TrustManager2;
                boolean z2 = z;
                NAL.DelegatingHostnameVerifier delegatingHostnameVerifier = new NAL.DelegatingHostnameVerifier(NALHostnameVerifier.this);
                Long l2 = l;
                return new z(Duration.ofMillis(l2 != null ? l2.longValue() : 5000L), z2, x509TrustManager3, delegatingHostnameVerifier, spVar);
            }
        });
        int i = qlv.a;
        if (i == 0) {
            qlv.a = 2;
        } else if (2 != i) {
            throw new IllegalArgumentException("Once set, platform cannot be changed");
        }
    }

    private final z getClient() {
        return (z) this.client$delegate.getValue();
    }

    public final NALSocket createSocket(String str, String str2, NALSocket.Listener listener) {
        return new WebTransportSocket(str, str2, this.log, getClient(), new WebTransportCompressorDecompressor(this.log), listener);
    }
}
