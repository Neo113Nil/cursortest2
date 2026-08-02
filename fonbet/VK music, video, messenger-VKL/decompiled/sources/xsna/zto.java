package xsna;

import com.ironsource.X3;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import one.video.calls.sdk_private.f;

/* compiled from: TlsEngineImpl.java */
/* loaded from: classes8.dex */
public abstract class zto implements xjz0 {
    public PublicKey a;
    public PrivateKey b;
    public wgq c;
    public nsu d;

    /* compiled from: TlsEngineImpl.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f.b.values().length];
            a = iArr;
            try {
                iArr[f.b.TLS_AES_128_GCM_SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[f.b.TLS_AES_256_GCM_SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[f.b.TLS_CHACHA20_POLY1305_SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[f.b.TLS_AES_128_CCM_SHA256.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[f.b.TLS_AES_128_CCM_8_SHA256.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static int a(f.b bVar) {
        int i = a.a[bVar.ordinal()];
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 48;
        }
        if (i == 3 || i == 4 || i == 5) {
            return 32;
        }
        throw new RuntimeException();
    }

    public static void d() {
        throw new RuntimeException(System.getProperty("java.vendor") != null && System.getProperty("java.vendor").contains(X3.d) ? "Missing RSASSA-PSS support. Did you set PlatformMapping.usePlatformMapping(PlatformMapping.Platform.Android)?" : "Missing RSASSA-PSS support");
    }

    public final Signature b(f.g gVar) throws one.video.calls.sdk_private.m {
        nsu nsuVar = this.d;
        if (gVar.equals(f.g.rsa_pss_rsae_sha256)) {
            try {
                Signature signature = Signature.getInstance(nsuVar.a(256));
                signature.setParameter(new PSSParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), 32, 1));
                return signature;
            } catch (InvalidAlgorithmParameterException e) {
                throw new RuntimeException(e);
            } catch (NoSuchAlgorithmException unused) {
                d();
                throw null;
            }
        }
        if (gVar.equals(f.g.rsa_pss_rsae_sha384)) {
            try {
                Signature signature2 = Signature.getInstance(nsuVar.a(384));
                signature2.setParameter(new PSSParameterSpec("SHA-384", "MGF1", new MGF1ParameterSpec("SHA-384"), 48, 1));
                return signature2;
            } catch (InvalidAlgorithmParameterException e2) {
                throw new RuntimeException(e2);
            } catch (NoSuchAlgorithmException unused2) {
                d();
                throw null;
            }
        }
        if (gVar.equals(f.g.rsa_pss_rsae_sha512)) {
            try {
                Signature signature3 = Signature.getInstance(nsuVar.a(512));
                signature3.setParameter(new PSSParameterSpec("SHA-512", "MGF1", new MGF1ParameterSpec("SHA-512"), 64, 1));
                return signature3;
            } catch (InvalidAlgorithmParameterException e3) {
                throw new RuntimeException(e3);
            } catch (NoSuchAlgorithmException unused3) {
                d();
                throw null;
            }
        }
        if (gVar.equals(f.g.ecdsa_secp256r1_sha256)) {
            try {
                return Signature.getInstance("SHA256withECDSA");
            } catch (NoSuchAlgorithmException unused4) {
                throw new RuntimeException("Missing SHA256withECDSA support");
            }
        }
        if (gVar.equals(f.g.ecdsa_secp384r1_sha384)) {
            try {
                return Signature.getInstance("SHA384withECDSA");
            } catch (NoSuchAlgorithmException unused5) {
                throw new RuntimeException("Missing SHA384withECDSA support");
            }
        }
        if (gVar.equals(f.g.ecdsa_secp521r1_sha512)) {
            try {
                return Signature.getInstance("SHA512withECDSA");
            } catch (NoSuchAlgorithmException unused6) {
                throw new RuntimeException("Missing SHA512withECDSA support");
            }
        }
        throw new one.video.calls.sdk_private.m("Signature algorithm not supported " + gVar);
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) {
        wgq wgqVar = this.c;
        short s = wgqVar.e;
        wgqVar.getClass();
        byte[] a2 = wgqVar.a(bArr2, "finished", "".getBytes(wgq.u), s);
        String a3 = lhg.a(s << 3, "HmacSHA");
        SecretKeySpec secretKeySpec = new SecretKeySpec(a2, a3);
        try {
            Mac mac = Mac.getInstance(a3);
            mac.init(secretKeySpec);
            mac.update(bArr);
            return mac.doFinal();
        } catch (InvalidKeyException unused) {
            throw new RuntimeException();
        } catch (NoSuchAlgorithmException unused2) {
            throw new RuntimeException(zr.a("Missing ", a3, " support"));
        }
    }
}
