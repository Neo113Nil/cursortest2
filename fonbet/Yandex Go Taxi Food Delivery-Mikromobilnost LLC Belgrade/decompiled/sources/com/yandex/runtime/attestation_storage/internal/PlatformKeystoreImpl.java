package com.yandex.runtime.attestation_storage.internal;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.google.android.gms.tasks.zzw;
import com.yandex.runtime.Runtime;
import com.yandex.runtime.attestation.EcPublicKey;
import com.yandex.runtime.logging.Logger;
import defpackage.cvw;
import defpackage.iy60;
import defpackage.ny61;
import defpackage.r7w;
import defpackage.s7w;
import defpackage.t070;
import defpackage.ti61;
import defpackage.yci0;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.ECDSAParamsSpec;

/* loaded from: classes8.dex */
public class PlatformKeystoreImpl implements PlatformKeystore {
    private static final int CERTIFICATE_VALID_YEARS = 10;
    private String alias;
    private KeyStore keyStore;
    private KeyStore.PrivateKeyEntry privateKeyEntry;

    private PlatformKeystoreImpl(String str) throws IOException, CertificateException {
        this.alias = str;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.keyStore = keyStore;
            try {
                keyStore.load(null);
                if (hasEntry()) {
                    tryLoadEntry();
                }
            } catch (NoSuchAlgorithmException e) {
                yci0.t(e.getMessage(), "Can't check the integrity of keystore: ");
                throw null;
            }
        } catch (KeyStoreException e2) {
            yci0.t(e2.getMessage(), "No Android Key Store in the system: ");
            throw null;
        }
    }

    public static boolean attestationAvailable() {
        Provider provider = Security.getProvider("AndroidKeyStore");
        if (provider == null || provider.getService("KeyPairGenerator", "EC") == null || provider.getService("KeyFactory", "EC") == null || Security.getProviders("Signature.NONEwithECDSA").length == 0) {
            return false;
        }
        try {
            CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME);
            return Security.getProviders("MessageDigest.SHA-256").length != 0;
        } catch (CertificateException unused) {
            return false;
        }
    }

    public static void cleanupUnusedKeys(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            try {
                keyStore.load(null);
                try {
                    Iterator it = Collections.list(keyStore.aliases()).iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (str2.startsWith(getKeyAliasBase())) {
                            if (str != null) {
                                if (str2.equals(getKeyAliasBase() + str)) {
                                }
                            }
                            keyStore.deleteEntry(str2);
                        }
                    }
                } catch (KeyStoreException e) {
                    Logger.error("Could not delete entry: " + e.getMessage());
                }
            } catch (IOException e2) {
                Logger.error("Could not load keystore for key cleanup. I/O error: " + e2.getMessage());
            } catch (NoSuchAlgorithmException e3) {
                Logger.error("Could not load keystore for key cleanup. No such algorithm for checking keystore integrity: " + e3.getMessage());
            } catch (CertificateException e4) {
                Logger.error("Could not load keystore for key cleanup. Could not load certificate: " + e4.getMessage());
            }
        } catch (KeyStoreException e5) {
            Logger.error("Could not get keystore implementation for key cleanup: " + e5.getMessage());
        }
    }

    public static PlatformKeystore createKeystore(String str) {
        try {
            return new PlatformKeystoreImpl(getKeyAliasBase() + str);
        } catch (IOException | CertificateException unused) {
            return null;
        }
    }

    private String createNonce(byte[] bArr) {
        try {
            byte[] certificateChain = getCertificateChain();
            if (certificateChain == null) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance(JCP.DIGEST_SHA_256);
            messageDigest.update(bArr);
            messageDigest.update(certificateChain);
            return Base64.encodeToString(messageDigest.digest(), 10);
        } catch (NoSuchAlgorithmException e) {
            yci0.t(e.getMessage(), "No SHA-256 algorithm in the environment: ");
            return null;
        }
    }

    private byte[] getCertificateChain() {
        if (this.privateKeyEntry == null) {
            ny61.r("Key entry is null. Generate key first.");
            return null;
        }
        try {
            try {
                return CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME).generateCertPath(Arrays.asList(this.privateKeyEntry.getCertificateChain())).getEncoded();
            } catch (CertificateEncodingException | CertificateException unused) {
                return null;
            }
        } catch (CertificateException e) {
            yci0.t(e.getMessage(), "X.509 is unsupported in the system: ");
            return null;
        }
    }

    private static native String getKeyAliasBase();

    private boolean hasEntry() {
        try {
            return this.keyStore.containsAlias(this.alias);
        } catch (KeyStoreException e) {
            yci0.t(e.getMessage(), "Keystore is not initialized: ");
            return false;
        }
    }

    private void tryLoadEntry() {
        try {
            KeyStore.Entry entry = this.keyStore.getEntry(this.alias, null);
            if (entry == null) {
                return;
            }
            if (!(entry instanceof KeyStore.PrivateKeyEntry)) {
                ny61.r("Key entry is not an instance of a KeyStore.PrivateKeyEntry");
                return;
            }
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) entry;
            this.privateKeyEntry = privateKeyEntry;
            if (privateKeyEntry.getPrivateKey().getAlgorithm() != "EC") {
                removeKey();
            }
        } catch (KeyStoreException e) {
            yci0.t(e.getMessage(), "Keystore has not been loaded: ");
        } catch (NoSuchAlgorithmException e2) {
            yci0.t(e2.getMessage(), "No such algorithm in the environment: ");
        } catch (UnrecoverableEntryException e3) {
            yci0.t(e3.getMessage(), "Entry is protected: ");
        }
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public byte[] ecSign(byte[] bArr) {
        if (this.privateKeyEntry == null) {
            ny61.r("Key entry is null. Generate key first.");
            return null;
        }
        try {
            Signature signature = Signature.getInstance("NONEwithECDSA");
            try {
                signature.initSign(this.privateKeyEntry.getPrivateKey());
                try {
                    signature.update(bArr);
                    return signature.sign();
                } catch (SignatureException e) {
                    yci0.t(e.getMessage(), "Could not sign provided data: ");
                    return null;
                }
            } catch (InvalidKeyException e2) {
                yci0.t(e2.getMessage(), "Key provided for signing is invalid: ");
                return null;
            }
        } catch (NoSuchAlgorithmException e3) {
            yci0.t(e3.getMessage(), "No NONEwithECDSA support: ");
            return null;
        }
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public void generateKey(byte[] bArr) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            try {
                Calendar calendar = Calendar.getInstance();
                Date time = calendar.getTime();
                calendar.add(1, 10);
                keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(this.alias, 4).setDigests(JCP.RAW_PREFIX).setAlgorithmParameterSpec(new ECGenParameterSpec(ECDSAParamsSpec.ECDSA_P256_NAME)).setAttestationChallenge(bArr).setKeySize(256).setCertificateNotBefore(time).setCertificateNotAfter(calendar.getTime()).build());
                keyPairGenerator.generateKeyPair();
                tryLoadEntry();
            } catch (InvalidAlgorithmParameterException e) {
                yci0.t(e.getMessage(), "Arguments for initialization of EC algorithm are invalid: ");
            }
        } catch (NoSuchAlgorithmException e2) {
            yci0.t(e2.getMessage(), "EC algorithm is unsupported in AndroidKeyStore: ");
        } catch (NoSuchProviderException e3) {
            yci0.t(e3.getMessage(), "No Android Key Store in the system: ");
        }
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public byte[] getAppAttestKeyAssertion() {
        throw new UnsupportedOperationException("No AppAttest for Android");
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public String getAppAttestKeyId() {
        throw new UnsupportedOperationException("No AppAttest for Android");
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public String getApplicationId() {
        throw new UnsupportedOperationException("Should not be used for Android");
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public EcPublicKey getEcPublicKey() {
        try {
            ECPoint w = ((ECPublicKeySpec) KeyFactory.getInstance("EC").getKeySpec(this.privateKeyEntry.getCertificate().getPublicKey(), ECPublicKeySpec.class)).getW();
            return new EcPublicKey(w.getAffineX().toByteArray(), w.getAffineY().toByteArray());
        } catch (NoSuchAlgorithmException e) {
            yci0.t(e.getMessage(), "EC algorithm is unsupported in AndroidKeyStore: ");
            return null;
        } catch (InvalidKeySpecException e2) {
            yci0.t(e2.getMessage(), "Invalid KeySpec or key could not be processed: ");
            return null;
        }
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public byte[] getKeystoreProof() {
        return getCertificateChain();
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public boolean hasKey() {
        return this.privateKeyEntry != null;
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public void removeKey() {
        this.privateKeyEntry = null;
        if (hasEntry()) {
            try {
                this.keyStore.deleteEntry(this.alias);
            } catch (KeyStoreException e) {
                yci0.t(e.getMessage(), "Keystore is not initialized: ");
            }
        }
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public void requestAttestKey(byte[] bArr, long j, final AttestationListener attestationListener) {
        String createNonce = createNonce(bArr);
        if (createNonce == null) {
            attestationListener.onAttestationFailed("Could not create nonce");
        }
        ti61 a = r7w.a();
        a.c(createNonce);
        a.b(j);
        zzw a2 = cvw.p(Runtime.getApplicationContext()).a(a.a());
        a2.f(new t070(this) { // from class: com.yandex.runtime.attestation_storage.internal.PlatformKeystoreImpl.1
            @Override // defpackage.t070
            public void onSuccess(s7w s7wVar) {
                attestationListener.onAttestationReceived(s7wVar.a().getBytes());
            }
        });
        a2.d(new iy60(this) { // from class: com.yandex.runtime.attestation_storage.internal.PlatformKeystoreImpl.2
            @Override // defpackage.iy60
            public void onFailure(Exception exc) {
                attestationListener.onAttestationFailed(exc.getMessage());
            }
        });
    }
}
