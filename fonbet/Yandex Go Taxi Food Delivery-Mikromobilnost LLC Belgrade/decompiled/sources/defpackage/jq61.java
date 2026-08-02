package defpackage;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSException;
import ru.CryptoPro.CAdES.EncryptionKeyAlgorithm;
import ru.CryptoPro.CAdES.envelope.EnvelopedOptions;
import ru.CryptoPro.CAdES.exception.EnvelopedException;
import ru.CryptoPro.CAdES.exception.EnvelopedInvalidRecipientException;
import ru.CryptoPro.CAdES.exception.EnvelopedInvalidRecipientFormatException;
import ru.CryptoPro.CAdES.exception.EnvelopedWrongRecipientException;
import ru.CryptoPro.CAdES.tools.CAdESUtility;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.SubjectPublicKeyInfo;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.EllipticParamsInterface;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.SelfTester_Auxiliary;

/* loaded from: classes4.dex */
public abstract class jq61 {
    public o87 a;
    public final et61 b;
    public final l87 c;
    public final EncryptionKeyAlgorithm d;
    public EllipticParamsInterface e;
    public final nr41 f;
    public EnvelopedOptions g;

    public jq61(InputStream inputStream) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = EncryptionKeyAlgorithm.ekaDefault;
        this.e = null;
        this.f = null;
        this.g = null;
        SelfTester_Auxiliary.checkClass(jq61.class);
        try {
            l87 l87Var = new l87(inputStream);
            this.c = l87Var;
            this.f = new nr41(7, l87Var);
        } catch (IOException e) {
            throw new EnvelopedException("Decoding of encrypted data failed.", e);
        } catch (CMSException e2) {
            throw new EnvelopedException("Decoding of encrypted data failed.", e2);
        }
    }

    public static a97 a(ogi0 ogi0Var, X509Certificate x509Certificate, PrivateKey privateKey, nr41 nr41Var, EnvelopedOptions envelopedOptions) {
        JCPLogger.subEnter();
        boolean z = ogi0Var instanceof ojx;
        if (!z && !(ogi0Var instanceof qhx)) {
            throw new EnvelopedInvalidRecipientFormatException();
        }
        if (x509Certificate != null) {
            try {
                if (!ogi0Var.a.Q0(new X509CertificateHolder(x509Certificate.getEncoded()))) {
                    throw new EnvelopedWrongRecipientException();
                }
            } catch (IOException e) {
                throw new EnvelopedException("Decoding of recipient certificate failed.", e);
            } catch (CertificateEncodingException e2) {
                throw new EnvelopedException("Decoding of recipient certificate failed.", e2);
            }
        }
        try {
            c06 a = ogi0Var.a(z ? new rt61(8, privateKey, nr41Var, envelopedOptions) : new mt61(8, privateKey, nr41Var, envelopedOptions));
            JCPLogger.subExit();
            return (a97) a.b;
        } catch (IOException e3) {
            throw new EnvelopedException("Decoding of encrypted context into stream failed.", e3);
        } catch (CMSException e4) {
            throw new EnvelopedException("Decoding of encrypted context into stream failed.", e4);
        }
    }

    public static void b(ogi0 ogi0Var, X509Certificate x509Certificate, PrivateKey privateKey, OutputStream outputStream, nr41 nr41Var, EnvelopedOptions envelopedOptions) {
        JCPLogger.subEnter();
        a97 a97Var = null;
        try {
            try {
                a97Var = a(ogi0Var, x509Certificate, privateKey, nr41Var, envelopedOptions);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = a97Var.read(bArr, 0, 4096);
                    if (read < 0) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
                outputStream.write(byteArrayOutputStream.toByteArray());
                try {
                    a97Var.close();
                } catch (IOException unused) {
                }
                JCPLogger.subExit();
            } catch (IOException e) {
                throw new EnvelopedException("Decoding of encrypted context failed.", e);
            } catch (CMSException e2) {
                throw new EnvelopedException("Decoding of encrypted context failed.", e2);
            }
        } catch (Throwable th) {
            if (a97Var != null) {
                try {
                    a97Var.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static void decryptOne(ogi0 ogi0Var, X509Certificate x509Certificate, PrivateKey privateKey, OutputStream outputStream) throws EnvelopedException, EnvelopedInvalidRecipientFormatException, EnvelopedWrongRecipientException {
        b(ogi0Var, x509Certificate, privateKey, outputStream, null, null);
    }

    public void addKeyAgreeRecipient(X509Certificate x509Certificate) throws EnvelopedException {
        c(x509Certificate, false);
    }

    public void addKeyTransRecipient(X509Certificate x509Certificate) throws EnvelopedException {
        c(x509Certificate, true);
    }

    public final void c(X509Certificate x509Certificate, boolean z) {
        JCPLogger.subEnter();
        if (this.a == null) {
            throw new EnvelopedException("Enveloped generator is undefined.");
        }
        if (x509Certificate == null) {
            throw new EnvelopedException("Recipient certificate is undefined.");
        }
        if (!CAdESUtility.ifKeyUsageIsKeyAgreementInCertificate(x509Certificate)) {
            throw new EnvelopedException("Wrong key usage.");
        }
        JCPLogger.subEnter();
        if (this.e == null) {
            SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo();
            Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(x509Certificate.getPublicKey().getEncoded());
            try {
                subjectPublicKeyInfo.decode(asn1BerDecodeBuffer);
                asn1BerDecodeBuffer.reset();
                this.e = (EllipticParamsInterface) new AlgIdSpec(subjectPublicKeyInfo.algorithm).getSignParams();
            } catch (Asn1Exception e) {
                throw new EnvelopedException(e.getMessage());
            } catch (IOException e2) {
                throw new EnvelopedException(e2.getMessage());
            }
        }
        JCPLogger.subExit();
        o87 o87Var = this.a;
        et61 et61Var = this.b;
        o87Var.a(z ? new ou61(x509Certificate, et61Var, 1) : new ou61(x509Certificate, et61Var, 0));
        JCPLogger.subExit();
    }

    public void decrypt(X509Certificate x509Certificate, PrivateKey privateKey, OutputStream outputStream) throws EnvelopedException, EnvelopedInvalidRecipientException {
        JCPLogger.subEnter();
        if (outputStream == null) {
            throw new EnvelopedException("Output data stream not set.");
        }
        Iterator it = getRecipients().iterator();
        while (it.hasNext()) {
            try {
                decrypt((ogi0) it.next(), x509Certificate, privateKey, outputStream);
                JCPLogger.subExit();
                return;
            } catch (EnvelopedInvalidRecipientFormatException unused) {
                JCPLogger.warning("Invalid key transport recipient format.");
            } catch (EnvelopedWrongRecipientException unused2) {
                if (x509Certificate != null) {
                    JCPLogger.fineFormat("Wrong certificate sn {0}, subject {1}.", x509Certificate.getSerialNumber().toString(16), x509Certificate.getSubjectDN().toString());
                } else {
                    JCPLogger.fine("Wrong recipient.");
                }
            }
        }
        throw new EnvelopedInvalidRecipientException();
    }

    public Collection getRecipients() throws EnvelopedException {
        l87 l87Var = this.c;
        if (l87Var == null) {
            throw new EnvelopedException("Enveloped data decoder not set. Did you forget to open?");
        }
        pgi0 pgi0Var = l87Var.c;
        pgi0Var.getClass();
        return new ArrayList(pgi0Var.a);
    }

    public void setOptions(EnvelopedOptions envelopedOptions) {
        this.g = envelopedOptions;
    }

    public static InputStream decryptOne(ogi0 ogi0Var, X509Certificate x509Certificate, PrivateKey privateKey) throws EnvelopedException, EnvelopedInvalidRecipientFormatException, EnvelopedWrongRecipientException {
        return a(ogi0Var, x509Certificate, privateKey, null, null);
    }

    public jq61(EncryptionKeyAlgorithm encryptionKeyAlgorithm) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = EncryptionKeyAlgorithm.ekaDefault;
        this.e = null;
        this.f = null;
        this.g = null;
        SelfTester_Auxiliary.checkClass(jq61.class);
        if (encryptionKeyAlgorithm != null) {
            this.d = encryptionKeyAlgorithm;
        }
        this.b = new et61();
    }

    public InputStream decrypt(X509Certificate x509Certificate, PrivateKey privateKey) throws EnvelopedException, EnvelopedInvalidRecipientException {
        JCPLogger.subEnter();
        Iterator it = getRecipients().iterator();
        while (it.hasNext()) {
            try {
                InputStream decrypt = this.decrypt((ogi0) it.next(), x509Certificate, privateKey);
                JCPLogger.subExit();
                return decrypt;
            } catch (EnvelopedInvalidRecipientFormatException unused) {
                JCPLogger.warning("Invalid key transport recipient format (stream).");
            } catch (EnvelopedWrongRecipientException unused2) {
                if (x509Certificate != null) {
                    JCPLogger.fineFormat("Wrong certificate sn {0}, subject {1} (stream).", x509Certificate.getSerialNumber().toString(16), x509Certificate.getSubjectDN().toString());
                } else {
                    JCPLogger.fine("Wrong recipient.");
                }
            }
        }
        throw new EnvelopedInvalidRecipientException();
    }

    public void decrypt(ogi0 ogi0Var, X509Certificate x509Certificate, PrivateKey privateKey, OutputStream outputStream) throws EnvelopedException, EnvelopedInvalidRecipientFormatException, EnvelopedWrongRecipientException {
        b(ogi0Var, x509Certificate, privateKey, outputStream, this.f, this.g);
    }

    public InputStream decrypt(ogi0 ogi0Var, X509Certificate x509Certificate, PrivateKey privateKey) throws EnvelopedException, EnvelopedInvalidRecipientFormatException, EnvelopedWrongRecipientException {
        return a(ogi0Var, x509Certificate, privateKey, this.f, this.g);
    }
}
