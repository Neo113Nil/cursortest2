package one.video.calls.sdk_private;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.security.cert.X509Certificate;

/* compiled from: QuicClientConnection.java */
/* loaded from: classes8.dex */
public interface f {

    /* compiled from: TlsConstants.java */
    public enum a {
        close_notify(0),
        unexpected_message(10),
        bad_record_mac(20),
        record_overflow(22),
        handshake_failure(40),
        bad_certificate(42),
        unsupported_certificate(43),
        certificate_revoked(44),
        certificate_expired(45),
        certificate_unknown(46),
        illegal_parameter(47),
        unknown_ca(48),
        access_denied(49),
        decode_error(50),
        decrypt_error(51),
        protocol_version(70),
        insufficient_security(71),
        internal_error(80),
        inappropriate_fallback(86),
        user_canceled(90),
        missing_extension(109),
        unsupported_extension(110),
        unrecognized_name(112),
        bad_certificate_status_response(113),
        unknown_psk_identity(Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE),
        certificate_required(116),
        no_application_protocol(120);

        public final byte k;

        a(int i) {
            this.k = (byte) i;
        }
    }

    /* compiled from: TlsConstants.java */
    public enum b {
        TLS_AES_128_GCM_SHA256(4865),
        TLS_AES_256_GCM_SHA384(4866),
        TLS_CHACHA20_POLY1305_SHA256(4867),
        TLS_AES_128_CCM_SHA256(4868),
        TLS_AES_128_CCM_8_SHA256(4869);

        public final short f;

        b(int i) {
            this.f = (short) i;
        }
    }

    /* compiled from: TlsConstants.java */
    public enum c {
        server_name(0),
        max_fragment_length(1),
        status_request(5),
        supported_groups(10),
        signature_algorithms(13),
        use_srtp(14),
        heartbeat(15),
        application_layer_protocol_negotiation(16),
        signed_certificate_timestamp(18),
        client_certificate_type(19),
        server_certificate_type(20),
        padding(21),
        pre_shared_key(41),
        early_data(42),
        supported_versions(43),
        cookie(44),
        psk_key_exchange_modes(45),
        certificate_authorities(47),
        oid_filters(48),
        post_handshake_auth(49),
        signature_algorithms_cert(50),
        key_share(51);

        public final short k;

        c(int i) {
            this.k = (short) i;
        }
    }

    /* compiled from: TlsConstants.java */
    public enum d {
        client_hello(1),
        server_hello(2),
        new_session_ticket(4),
        end_of_early_data(5),
        encrypted_extensions(8),
        certificate(11),
        certificate_request(13),
        certificate_verify(15),
        finished(20),
        key_update(24),
        message_hash(254);

        public final byte i;

        d(int i) {
            this.i = (byte) i;
        }
    }

    /* compiled from: TlsConstants.java */
    public enum e {
        secp256r1(23),
        secp384r1(24),
        secp521r1(25),
        x25519(29),
        x448(30),
        ffdhe2048(256),
        ffdhe3072(257),
        ffdhe4096(258),
        ffdhe6144(259),
        ffdhe8192(260);

        public short f;

        e(int i) {
            this.f = (short) i;
        }
    }

    /* compiled from: TlsConstants.java */
    /* renamed from: one.video.calls.sdk_private.f$f, reason: collision with other inner class name */
    public enum EnumC2174f {
        psk_ke(0),
        psk_dhe_ke(1);

        public final byte c;

        EnumC2174f(int i) {
            this.c = (byte) i;
        }
    }

    /* compiled from: TlsConstants.java */
    public enum g {
        rsa_pkcs1_sha256(IronSourceError.ERROR_LOAD_FAILED_TIMEOUT),
        rsa_pkcs1_sha384(1281),
        rsa_pkcs1_sha512(1537),
        ecdsa_secp256r1_sha256(IronSourceError.ERROR_RV_LOAD_DURING_SHOW),
        ecdsa_secp384r1_sha384(1283),
        ecdsa_secp521r1_sha512(1539),
        rsa_pss_rsae_sha256(2052),
        rsa_pss_rsae_sha384(2053),
        rsa_pss_rsae_sha512(2054),
        ed25519(2055),
        ed448(2056),
        rsa_pss_pss_sha256(2057),
        rsa_pss_pss_sha384(2058),
        rsa_pss_pss_sha512(2059),
        rsa_pkcs1_sha1(513),
        ecdsa_sha1(515);

        public final short g;

        g(int i) {
            this.g = (short) i;
        }
    }

    /* compiled from: QuicClientConnection.java */
    public interface h {
        boolean verify(String str, X509Certificate x509Certificate);
    }

    void d() throws IOException;

    boolean e();
}
