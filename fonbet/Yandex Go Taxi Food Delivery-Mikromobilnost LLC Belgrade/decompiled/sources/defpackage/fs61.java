package defpackage;

import com.adjust.sdk.Constants;
import java.net.Socket;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashSet;
import javax.net.ssl.ExtendedSSLSession;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import ru.CryptoPro.ssl.util.TLSSettings;

/* loaded from: classes4.dex */
public final class fs61 extends X509ExtendedTrustManager implements X509TrustManager {
    public final X509TrustManager a;

    public fs61(X509TrustManager x509TrustManager) {
        this.a = x509TrustManager;
    }

    public final void a(X509Certificate[] x509CertificateArr, es61 es61Var, boolean z) {
        try {
            int length = x509CertificateArr.length;
            int i = length - 1;
            HashSet hashSet = new HashSet();
            X509Certificate[] acceptedIssuers = this.a.getAcceptedIssuers();
            if (acceptedIssuers != null && acceptedIssuers.length > 0) {
                Collections.addAll(hashSet, acceptedIssuers);
            }
            if (hashSet.contains(x509CertificateArr[i])) {
                i = length - 2;
            }
            if (i >= 0) {
                uq61 uq61Var = new uq61(null, es61Var);
                uq61Var.init(false);
                while (i >= 0) {
                    uq61Var.check(x509CertificateArr[i], Collections.EMPTY_SET);
                    i--;
                }
            }
        } catch (CertPathValidatorException e) {
            throw new CertificateException("Certificates do not conform to algorithm constraints", e);
        }
    }

    public final void b(X509Certificate[] x509CertificateArr, Socket socket, boolean z) {
        if (socket != null && socket.isConnected() && (socket instanceof SSLSocket)) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            SSLSession handshakeSession = sSLSocket.getHandshakeSession();
            if (handshakeSession == null) {
                w511.y("No handshake session");
                return;
            }
            if (!z) {
                String endpointIdentificationAlgorithm = sSLSocket.getSSLParameters().getEndpointIdentificationAlgorithm();
                if ((endpointIdentificationAlgorithm == null || endpointIdentificationAlgorithm.length() == 0) && TLSSettings.getTlsProhibitDisabledValidation()) {
                    endpointIdentificationAlgorithm = Constants.SCHEME;
                }
                if (endpointIdentificationAlgorithm != null && endpointIdentificationAlgorithm.length() != 0) {
                    au61.c(handshakeSession.getPeerHost(), endpointIdentificationAlgorithm, x509CertificateArr[0]);
                }
            }
            a(x509CertificateArr, or61.b(handshakeSession.getProtocol()).a >= or61.B.a ? handshakeSession instanceof ExtendedSSLSession ? new es61(sSLSocket, ((ExtendedSSLSession) handshakeSession).getLocalSupportedSignatureAlgorithms(), true) : new es61(sSLSocket, true) : new es61(sSLSocket, true), z);
        }
    }

    public final void c(X509Certificate[] x509CertificateArr, SSLEngine sSLEngine, boolean z) {
        if (sSLEngine != null) {
            SSLSession handshakeSession = sSLEngine.getHandshakeSession();
            if (handshakeSession == null) {
                w511.y("No handshake session");
                return;
            }
            if (!z) {
                String endpointIdentificationAlgorithm = sSLEngine.getSSLParameters().getEndpointIdentificationAlgorithm();
                if ((endpointIdentificationAlgorithm == null || endpointIdentificationAlgorithm.length() == 0) && TLSSettings.getTlsProhibitDisabledValidation()) {
                    endpointIdentificationAlgorithm = Constants.SCHEME;
                }
                if (endpointIdentificationAlgorithm != null && endpointIdentificationAlgorithm.length() != 0) {
                    au61.c(handshakeSession.getPeerHost(), endpointIdentificationAlgorithm, x509CertificateArr[0]);
                }
            }
            a(x509CertificateArr, or61.b(handshakeSession.getProtocol()).a >= or61.B.a ? handshakeSession instanceof ExtendedSSLSession ? new es61(sSLEngine, ((ExtendedSSLSession) handshakeSession).getLocalSupportedSignatureAlgorithms(), true) : new es61(sSLEngine, true) : new es61(sSLEngine, true), z);
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        this.a.checkClientTrusted(x509CertificateArr, str);
        b(x509CertificateArr, socket, true);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        this.a.checkServerTrusted(x509CertificateArr, str);
        b(x509CertificateArr, socket, false);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.a.getAcceptedIssuers();
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.a.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.a.checkServerTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        this.a.checkClientTrusted(x509CertificateArr, str);
        c(x509CertificateArr, sSLEngine, true);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        this.a.checkServerTrusted(x509CertificateArr, str);
        c(x509CertificateArr, sSLEngine, false);
    }
}
