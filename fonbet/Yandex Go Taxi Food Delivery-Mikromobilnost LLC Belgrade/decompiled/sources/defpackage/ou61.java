package defpackage;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1OctetString;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import ru.CryptoPro.AdES.AdESConfig;
import ru.CryptoPro.CAdES.EncryptionKeyAlgorithm;
import ru.CryptoPro.CAdES.exception.EnvelopedException;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_ParamSet;
import ru.CryptoPro.JCP.ASN.GostR3410_EncryptionSyntax.Gost28147_89_KeyWrapParameters;
import ru.CryptoPro.JCP.ASN.GostR3410_EncryptionSyntax.GostR3410_12_KEG_Parameters;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.SubjectPublicKeyInfo;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.CryptoPro.JCP.params.Kexp15ParamsSpec;
import ru.CryptoPro.JCP.params.LicenseControlInfoInterface;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public final class ou61 extends xz4 implements lu61 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ou61(X509Certificate x509Certificate, et61 et61Var, int i) {
        super(x509Certificate, et61Var);
        this.c = i;
    }

    public static byte[] m(int i) {
        try {
            byte[] bArr = new byte[i];
            SecureRandom.getInstance(JCP.CP_RANDOM, AdESConfig.getDefaultDigestSignatureProvider()).nextBytes(bArr);
            return bArr;
        } catch (NoSuchAlgorithmException e) {
            throw new EnvelopedException("Random generator failed", e);
        } catch (NoSuchProviderException e2) {
            throw new EnvelopedException("Random generator failed", e2);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:(21:(40:24|(2:26|(1:28)(38:29|30|32|33|34|35|(3:140|141|(24:143|144|68|69|70|71|73|74|(9:79|80|81|(4:104|105|(3:110|(2:115|116)|117)|118)(4:85|(2:94|95)|103|95)|96|(1:98)|(1:100)|101|102)|119|(2:125|126)(1:123)|124|80|81|(1:83)|104|105|(4:107|110|(3:112|115|116)|117)|118|96|(0)|(0)|101|102))|37|38|39|40|(4:42|43|44|45)|66|67|68|69|70|71|73|74|(14:76|79|80|81|(0)|104|105|(0)|118|96|(0)|(0)|101|102)|119|(1:121)|125|126|124|80|81|(0)|104|105|(0)|118|96|(0)|(0)|101|102))|164|30|32|33|34|35|(0)|37|38|39|40|(0)|66|67|68|69|70|71|73|74|(0)|119|(0)|125|126|124|80|81|(0)|104|105|(0)|118|96|(0)|(0)|101|102)|73|74|(0)|119|(0)|125|126|124|80|81|(0)|104|105|(0)|118|96|(0)|(0)|101|102)|32|33|34|35|(0)|37|38|39|40|(0)|66|67|68|69|70|71) */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0327, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0328, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0322, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0323, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0330, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0331, code lost:
    
        r18 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x032c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x032d, code lost:
    
        r18 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0338, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0339, code lost:
    
        r19 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0334, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0335, code lost:
    
        r19 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023b A[Catch: all -> 0x0170, Exception -> 0x0174, TryCatch #15 {Exception -> 0x0174, all -> 0x0170, blocks: (B:74:0x0143, B:76:0x015e, B:79:0x0165, B:80:0x01ac, B:83:0x01c1, B:85:0x01ca, B:87:0x01d0, B:89:0x01d6, B:91:0x01dc, B:94:0x01e5, B:95:0x01fa, B:96:0x0287, B:103:0x01f1, B:105:0x022e, B:107:0x023b, B:110:0x0242, B:112:0x0248, B:115:0x024f, B:116:0x0265, B:117:0x0266, B:118:0x0268, B:119:0x0179, B:121:0x018f, B:124:0x01a6, B:126:0x019c), top: B:73:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x018f A[Catch: all -> 0x0170, Exception -> 0x0174, TryCatch #15 {Exception -> 0x0174, all -> 0x0170, blocks: (B:74:0x0143, B:76:0x015e, B:79:0x0165, B:80:0x01ac, B:83:0x01c1, B:85:0x01ca, B:87:0x01d0, B:89:0x01d6, B:91:0x01dc, B:94:0x01e5, B:95:0x01fa, B:96:0x0287, B:103:0x01f1, B:105:0x022e, B:107:0x023b, B:110:0x0242, B:112:0x0248, B:115:0x024f, B:116:0x0265, B:117:0x0266, B:118:0x0268, B:119:0x0179, B:121:0x018f, B:124:0x01a6, B:126:0x019c), top: B:73:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015e A[Catch: all -> 0x0170, Exception -> 0x0174, TryCatch #15 {Exception -> 0x0174, all -> 0x0170, blocks: (B:74:0x0143, B:76:0x015e, B:79:0x0165, B:80:0x01ac, B:83:0x01c1, B:85:0x01ca, B:87:0x01d0, B:89:0x01d6, B:91:0x01dc, B:94:0x01e5, B:95:0x01fa, B:96:0x0287, B:103:0x01f1, B:105:0x022e, B:107:0x023b, B:110:0x0242, B:112:0x0248, B:115:0x024f, B:116:0x0265, B:117:0x0266, B:118:0x0268, B:119:0x0179, B:121:0x018f, B:124:0x01a6, B:126:0x019c), top: B:73:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c1 A[Catch: all -> 0x0170, Exception -> 0x0174, TRY_ENTER, TryCatch #15 {Exception -> 0x0174, all -> 0x0170, blocks: (B:74:0x0143, B:76:0x015e, B:79:0x0165, B:80:0x01ac, B:83:0x01c1, B:85:0x01ca, B:87:0x01d0, B:89:0x01d6, B:91:0x01dc, B:94:0x01e5, B:95:0x01fa, B:96:0x0287, B:103:0x01f1, B:105:0x022e, B:107:0x023b, B:110:0x0242, B:112:0x0248, B:115:0x024f, B:116:0x0265, B:117:0x0266, B:118:0x0268, B:119:0x0179, B:121:0x018f, B:124:0x01a6, B:126:0x019c), top: B:73:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x030c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ngi0 o(fv61 fv61Var) {
        SecretKey secretKey;
        SecretKey secretKey2;
        Key key;
        Key key2;
        SecretKey secretKey3;
        Key key3;
        byte[] licenseControlInfo;
        int i;
        String str;
        String str2;
        Key key4;
        X509Certificate x509Certificate;
        byte[] m;
        int i2;
        IvParameterSpec ivParameterSpec;
        OID oid;
        String str3;
        OID oid2;
        byte[] bArr;
        String str4;
        AlgorithmParameterSpec kexp15ParamsSpec;
        Asn1BerEncodeBuffer asn1BerEncodeBuffer;
        boolean equals;
        OID oid3;
        String str5;
        a2 a2Var;
        u2 u2Var;
        int i3;
        int i4;
        et61 et61Var = (et61) this.b;
        X509Certificate x509Certificate2 = (X509Certificate) this.a;
        try {
            String defaultEncryptionProvider = AdESConfig.getDefaultEncryptionProvider();
            SecretKey secretKey4 = (SecretKey) fv61Var.a;
            EncryptionKeyAlgorithm encryptionKeyAlgorithm = fv61Var.b;
            String algorithm = secretKey4.getAlgorithm();
            KeyInterface spec = ((SpecKey) secretKey4).getSpec();
            if (spec instanceof LicenseControlInfoInterface) {
                try {
                    licenseControlInfo = ((LicenseControlInfoInterface) spec).getLicenseControlInfo();
                    if (licenseControlInfo != null) {
                        et61Var.a = new String(licenseControlInfo);
                    }
                } catch (Exception e) {
                    e = e;
                    secretKey3 = null;
                    key3 = null;
                    key2 = null;
                    try {
                        throw new EnvelopedException("Invalid recipient", e);
                    } catch (Throwable th) {
                        th = th;
                        key = key3;
                        secretKey2 = secretKey3;
                        if (secretKey2 != null) {
                            ((SpecKey) secretKey2).clear();
                        }
                        if (key != null) {
                            ((SpecKey) key).clear();
                        }
                        if (key2 != null) {
                            ((SpecKey) key2).clear();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    secretKey2 = null;
                    key = null;
                    key2 = null;
                    if (secretKey2 != null) {
                    }
                    if (key != null) {
                    }
                    if (key2 != null) {
                    }
                    throw th;
                }
            } else {
                licenseControlInfo = null;
            }
            if (licenseControlInfo == null && encryptionKeyAlgorithm != EncryptionKeyAlgorithm.ekaKuznechikMac && encryptionKeyAlgorithm != EncryptionKeyAlgorithm.ekaMagmaMac) {
                et61Var.b = false;
            }
            String str6 = "GOST28147/SIMPLE_EXPORT/NoPadding";
            if (algorithm.equals("GOST3412_2015_M")) {
                str6 = "GOST3412_2015_M/KEXP_2015_M_EXPORT/NoPadding";
                str = lu61.i5.a;
                i = 8;
            } else if (algorithm.equals("GOST3412_2015_K")) {
                str6 = "GOST3412_2015_K/KEXP_2015_K_EXPORT/NoPadding";
                str = lu61.j5.a;
                i = 16;
            } else {
                if (!algorithm.equals("GOST28147")) {
                    secretKey = null;
                    try {
                        throw new EnvelopedException("Unsupported key algorithm: ".concat(algorithm));
                    } catch (Exception e2) {
                        e = e2;
                        secretKey3 = secretKey;
                        key3 = secretKey3;
                        key2 = key3;
                        throw new EnvelopedException("Invalid recipient", e);
                    } catch (Throwable th3) {
                        th = th3;
                        secretKey2 = secretKey;
                        key = secretKey2;
                        key2 = key;
                        if (secretKey2 != null) {
                        }
                        if (key != null) {
                        }
                        if (key2 != null) {
                        }
                        throw th;
                    }
                }
                i = 0;
                str = null;
            }
            String algorithm2 = x509Certificate2.getPublicKey().getAlgorithm();
            try {
                try {
                    if (!algorithm2.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) && !algorithm2.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) {
                        if (!algorithm2.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME)) {
                            if (!algorithm2.equalsIgnoreCase(JCP.GOST_DH_2012_512_NAME)) {
                                str2 = "GOST3410DHELEPH";
                                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str2, defaultEncryptionProvider);
                                keyPairGenerator.initialize(((SpecKey) x509Certificate2.getPublicKey()).getSpec().getParams());
                                KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
                                key4 = generateKeyPair.getPrivate();
                                Key key5 = generateKeyPair.getPublic();
                                if (!algorithm.equals("GOST3412_2015_K")) {
                                    try {
                                        if (!algorithm.equals("GOST3412_2015_M")) {
                                            x509Certificate = x509Certificate2;
                                            m = m(8);
                                            i2 = i;
                                            ivParameterSpec = new IvParameterSpec(m);
                                            key2 = key5;
                                            KeyAgreement keyAgreement = KeyAgreement.getInstance(algorithm2, defaultEncryptionProvider);
                                            keyAgreement.init(key4, ivParameterSpec);
                                            key = key4;
                                            keyAgreement.doPhase(x509Certificate.getPublicKey(), true);
                                            secretKey3 = keyAgreement.generateSecret(algorithm);
                                            oid = ((SpecKey) secretKey3).getSpec().getParams().getOID();
                                            Cipher cipher = Cipher.getInstance(str6, defaultEncryptionProvider);
                                            if (!algorithm.equals("GOST3412_2015_K") && !algorithm.equals("GOST3412_2015_M")) {
                                                kexp15ParamsSpec = CryptParamsSpec.getInstance(oid);
                                                str3 = str;
                                                str4 = JCP.GOST_DH_2012_512_NAME;
                                                oid2 = oid;
                                                cipher.init(3, secretKey3, kexp15ParamsSpec);
                                                byte[] wrap = cipher.wrap(secretKey4);
                                                asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
                                                equals = algorithm.equals("GOST3412_2015_K");
                                                oid3 = lu61.n5;
                                                if (!equals || algorithm.equals("GOST3412_2015_M")) {
                                                    str5 = str4;
                                                    u2 u2Var2 = new u2(str3);
                                                    if (!algorithm2.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME) && !algorithm2.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME)) {
                                                        if (!algorithm2.equalsIgnoreCase(str5) && !algorithm2.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME)) {
                                                            throw new EnvelopedException("Invalid key algorithm: " + algorithm2);
                                                        }
                                                        oid3 = lu61.o5;
                                                    }
                                                    new GostR3410_12_KEG_Parameters(oid3.value).encode(asn1BerEncodeBuffer);
                                                    j2 j2Var = new j2(asn1BerEncodeBuffer.getMsgCopy());
                                                    b3 n = j2Var.n();
                                                    j2Var.close();
                                                    asn1BerEncodeBuffer.reset();
                                                    a2Var = n;
                                                    u2Var = u2Var2;
                                                } else {
                                                    if (!algorithm2.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) && !algorithm2.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME) && !algorithm2.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME) && !algorithm2.equalsIgnoreCase(str4)) {
                                                        u2Var = new u2(lu61.m5.toString());
                                                        new Gost28147_89_KeyWrapParameters(new Gost28147_89_ParamSet(oid2.value), (Asn1OctetString) null).encode(asn1BerEncodeBuffer);
                                                        j2 j2Var2 = new j2(asn1BerEncodeBuffer.getMsgCopy());
                                                        b3 n2 = j2Var2.n();
                                                        j2Var2.close();
                                                        asn1BerEncodeBuffer.reset();
                                                        a2Var = new xr1(new u2(lu61.h5.a), n2);
                                                    }
                                                    u2Var = new u2(oid3.toString());
                                                    new Gost28147_89_KeyWrapParameters(new Gost28147_89_ParamSet(oid2.value), (Asn1OctetString) null).encode(asn1BerEncodeBuffer);
                                                    j2 j2Var22 = new j2(asn1BerEncodeBuffer.getMsgCopy());
                                                    b3 n22 = j2Var22.n();
                                                    j2Var22.close();
                                                    asn1BerEncodeBuffer.reset();
                                                    a2Var = new xr1(new u2(lu61.h5.a), n22);
                                                }
                                                xr1 xr1Var = new xr1(u2Var, a2Var);
                                                ohx ohxVar = new ohx(new p0x(jc51.m(x509Certificate.getIssuerX500Principal().getEncoded()), x509Certificate.getSerialNumber()));
                                                dqf dqfVar = new dqf(wrap);
                                                kgi0 kgi0Var = new kgi0();
                                                kgi0Var.a = ohxVar;
                                                kgi0Var.b = dqfVar;
                                                c2 c2Var = new c2();
                                                c2Var.a(kgi0Var);
                                                j2 j2Var3 = new j2(key2.getEncoded());
                                                i3 i3Var = (i3) j2Var3.n();
                                                j2Var3.close();
                                                phx phxVar = new phx(new yq80(new ar80(i3.z(new zyu0(i3Var).toASN1Primitive()))), new dqf(m), xr1Var, new jqf(c2Var));
                                                ngi0 ngi0Var = new ngi0();
                                                ngi0Var.a = new oqf(2, 128, 1, phxVar, 0);
                                                if (secretKey3 != null) {
                                                    ((SpecKey) secretKey3).clear();
                                                }
                                                if (key != null) {
                                                    ((SpecKey) key).clear();
                                                }
                                                ((SpecKey) key2).clear();
                                                return ngi0Var;
                                            }
                                            byte[] bArr2 = new byte[i2 / 2];
                                            int i5 = i2 / 2;
                                            str3 = str;
                                            oid2 = oid;
                                            Array.copy(m, 24, bArr2, 0, i5);
                                            if (!algorithm2.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) || algorithm2.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) {
                                                bArr = new byte[8];
                                                str4 = JCP.GOST_DH_2012_512_NAME;
                                                Array.copy(m, 16, bArr, 0, 8);
                                            } else {
                                                str4 = JCP.GOST_DH_2012_512_NAME;
                                                bArr = null;
                                            }
                                            kexp15ParamsSpec = new Kexp15ParamsSpec(bArr2, bArr);
                                            cipher.init(3, secretKey3, kexp15ParamsSpec);
                                            byte[] wrap2 = cipher.wrap(secretKey4);
                                            asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
                                            equals = algorithm.equals("GOST3412_2015_K");
                                            oid3 = lu61.n5;
                                            if (equals) {
                                            }
                                            str5 = str4;
                                            u2 u2Var22 = new u2(str3);
                                            if (!algorithm2.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) {
                                                if (!algorithm2.equalsIgnoreCase(str5)) {
                                                    throw new EnvelopedException("Invalid key algorithm: " + algorithm2);
                                                }
                                                oid3 = lu61.o5;
                                            }
                                            new GostR3410_12_KEG_Parameters(oid3.value).encode(asn1BerEncodeBuffer);
                                            j2 j2Var4 = new j2(asn1BerEncodeBuffer.getMsgCopy());
                                            b3 n3 = j2Var4.n();
                                            j2Var4.close();
                                            asn1BerEncodeBuffer.reset();
                                            a2Var = n3;
                                            u2Var = u2Var22;
                                            xr1 xr1Var2 = new xr1(u2Var, a2Var);
                                            ohx ohxVar2 = new ohx(new p0x(jc51.m(x509Certificate.getIssuerX500Principal().getEncoded()), x509Certificate.getSerialNumber()));
                                            dqf dqfVar2 = new dqf(wrap2);
                                            kgi0 kgi0Var2 = new kgi0();
                                            kgi0Var2.a = ohxVar2;
                                            kgi0Var2.b = dqfVar2;
                                            c2 c2Var2 = new c2();
                                            c2Var2.a(kgi0Var2);
                                            j2 j2Var32 = new j2(key2.getEncoded());
                                            i3 i3Var2 = (i3) j2Var32.n();
                                            j2Var32.close();
                                            phx phxVar2 = new phx(new yq80(new ar80(i3.z(new zyu0(i3Var2).toASN1Primitive()))), new dqf(m), xr1Var2, new jqf(c2Var2));
                                            ngi0 ngi0Var2 = new ngi0();
                                            ngi0Var2.a = new oqf(2, 128, 1, phxVar2, 0);
                                            if (secretKey3 != null) {
                                            }
                                            if (key != null) {
                                            }
                                            ((SpecKey) key2).clear();
                                            return ngi0Var2;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        key2 = key5;
                                        key3 = key4;
                                        secretKey3 = null;
                                        throw new EnvelopedException("Invalid recipient", e);
                                    } catch (Throwable th4) {
                                        th = th4;
                                        key2 = key5;
                                        key = key4;
                                        secretKey2 = null;
                                        if (secretKey2 != null) {
                                        }
                                        if (key != null) {
                                        }
                                        if (key2 != null) {
                                        }
                                        throw th;
                                    }
                                }
                                x509Certificate = x509Certificate2;
                                i2 = i;
                                byte[] m2 = m(32);
                                byte[] bArr3 = new byte[16];
                                key2 = key5;
                                i4 = 0;
                                for (i3 = 16; i4 < i3; i3 = 16) {
                                    try {
                                        bArr3[i4] = m2[15 - i4];
                                        i4++;
                                    } catch (Exception e4) {
                                        e = e4;
                                        key3 = key4;
                                        secretKey3 = null;
                                        throw new EnvelopedException("Invalid recipient", e);
                                    } catch (Throwable th5) {
                                        th = th5;
                                        key = key4;
                                        secretKey2 = null;
                                        if (secretKey2 != null) {
                                        }
                                        if (key != null) {
                                        }
                                        if (key2 != null) {
                                        }
                                        throw th;
                                    }
                                }
                                ivParameterSpec = new IvParameterSpec(bArr3);
                                m = m2;
                                KeyAgreement keyAgreement2 = KeyAgreement.getInstance(algorithm2, defaultEncryptionProvider);
                                keyAgreement2.init(key4, ivParameterSpec);
                                key = key4;
                                keyAgreement2.doPhase(x509Certificate.getPublicKey(), true);
                                secretKey3 = keyAgreement2.generateSecret(algorithm);
                                oid = ((SpecKey) secretKey3).getSpec().getParams().getOID();
                                Cipher cipher2 = Cipher.getInstance(str6, defaultEncryptionProvider);
                                if (!algorithm.equals("GOST3412_2015_K")) {
                                    kexp15ParamsSpec = CryptParamsSpec.getInstance(oid);
                                    str3 = str;
                                    str4 = JCP.GOST_DH_2012_512_NAME;
                                    oid2 = oid;
                                    cipher2.init(3, secretKey3, kexp15ParamsSpec);
                                    byte[] wrap22 = cipher2.wrap(secretKey4);
                                    asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
                                    equals = algorithm.equals("GOST3412_2015_K");
                                    oid3 = lu61.n5;
                                    if (equals) {
                                    }
                                    str5 = str4;
                                    u2 u2Var222 = new u2(str3);
                                    if (!algorithm2.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) {
                                    }
                                    new GostR3410_12_KEG_Parameters(oid3.value).encode(asn1BerEncodeBuffer);
                                    j2 j2Var42 = new j2(asn1BerEncodeBuffer.getMsgCopy());
                                    b3 n32 = j2Var42.n();
                                    j2Var42.close();
                                    asn1BerEncodeBuffer.reset();
                                    a2Var = n32;
                                    u2Var = u2Var222;
                                    xr1 xr1Var22 = new xr1(u2Var, a2Var);
                                    ohx ohxVar22 = new ohx(new p0x(jc51.m(x509Certificate.getIssuerX500Principal().getEncoded()), x509Certificate.getSerialNumber()));
                                    dqf dqfVar22 = new dqf(wrap22);
                                    kgi0 kgi0Var22 = new kgi0();
                                    kgi0Var22.a = ohxVar22;
                                    kgi0Var22.b = dqfVar22;
                                    c2 c2Var22 = new c2();
                                    c2Var22.a(kgi0Var22);
                                    j2 j2Var322 = new j2(key2.getEncoded());
                                    i3 i3Var22 = (i3) j2Var322.n();
                                    j2Var322.close();
                                    phx phxVar22 = new phx(new yq80(new ar80(i3.z(new zyu0(i3Var22).toASN1Primitive()))), new dqf(m), xr1Var22, new jqf(c2Var22));
                                    ngi0 ngi0Var22 = new ngi0();
                                    ngi0Var22.a = new oqf(2, 128, 1, phxVar22, 0);
                                    if (secretKey3 != null) {
                                    }
                                    if (key != null) {
                                    }
                                    ((SpecKey) key2).clear();
                                    return ngi0Var22;
                                }
                                byte[] bArr22 = new byte[i2 / 2];
                                int i52 = i2 / 2;
                                str3 = str;
                                oid2 = oid;
                                Array.copy(m, 24, bArr22, 0, i52);
                                if (algorithm2.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME)) {
                                }
                                bArr = new byte[8];
                                str4 = JCP.GOST_DH_2012_512_NAME;
                                Array.copy(m, 16, bArr, 0, 8);
                                kexp15ParamsSpec = new Kexp15ParamsSpec(bArr22, bArr);
                                cipher2.init(3, secretKey3, kexp15ParamsSpec);
                                byte[] wrap222 = cipher2.wrap(secretKey4);
                                asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
                                equals = algorithm.equals("GOST3412_2015_K");
                                oid3 = lu61.n5;
                                if (equals) {
                                }
                                str5 = str4;
                                u2 u2Var2222 = new u2(str3);
                                if (!algorithm2.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) {
                                }
                                new GostR3410_12_KEG_Parameters(oid3.value).encode(asn1BerEncodeBuffer);
                                j2 j2Var422 = new j2(asn1BerEncodeBuffer.getMsgCopy());
                                b3 n322 = j2Var422.n();
                                j2Var422.close();
                                asn1BerEncodeBuffer.reset();
                                a2Var = n322;
                                u2Var = u2Var2222;
                                xr1 xr1Var222 = new xr1(u2Var, a2Var);
                                ohx ohxVar222 = new ohx(new p0x(jc51.m(x509Certificate.getIssuerX500Principal().getEncoded()), x509Certificate.getSerialNumber()));
                                dqf dqfVar222 = new dqf(wrap222);
                                kgi0 kgi0Var222 = new kgi0();
                                kgi0Var222.a = ohxVar222;
                                kgi0Var222.b = dqfVar222;
                                c2 c2Var222 = new c2();
                                c2Var222.a(kgi0Var222);
                                j2 j2Var3222 = new j2(key2.getEncoded());
                                i3 i3Var222 = (i3) j2Var3222.n();
                                j2Var3222.close();
                                phx phxVar222 = new phx(new yq80(new ar80(i3.z(new zyu0(i3Var222).toASN1Primitive()))), new dqf(m), xr1Var222, new jqf(c2Var222));
                                ngi0 ngi0Var222 = new ngi0();
                                ngi0Var222.a = new oqf(2, 128, 1, phxVar222, 0);
                                if (secretKey3 != null) {
                                }
                                if (key != null) {
                                }
                                ((SpecKey) key2).clear();
                                return ngi0Var222;
                            }
                        }
                        str2 = JCP.GOST_EPH_DH_2012_512_NAME;
                        KeyPairGenerator keyPairGenerator2 = KeyPairGenerator.getInstance(str2, defaultEncryptionProvider);
                        keyPairGenerator2.initialize(((SpecKey) x509Certificate2.getPublicKey()).getSpec().getParams());
                        KeyPair generateKeyPair2 = keyPairGenerator2.generateKeyPair();
                        key4 = generateKeyPair2.getPrivate();
                        Key key52 = generateKeyPair2.getPublic();
                        if (!algorithm.equals("GOST3412_2015_K")) {
                        }
                        x509Certificate = x509Certificate2;
                        i2 = i;
                        byte[] m22 = m(32);
                        byte[] bArr32 = new byte[16];
                        key2 = key52;
                        i4 = 0;
                        while (i4 < i3) {
                        }
                        ivParameterSpec = new IvParameterSpec(bArr32);
                        m = m22;
                        KeyAgreement keyAgreement22 = KeyAgreement.getInstance(algorithm2, defaultEncryptionProvider);
                        keyAgreement22.init(key4, ivParameterSpec);
                        key = key4;
                        keyAgreement22.doPhase(x509Certificate.getPublicKey(), true);
                        secretKey3 = keyAgreement22.generateSecret(algorithm);
                        oid = ((SpecKey) secretKey3).getSpec().getParams().getOID();
                        Cipher cipher22 = Cipher.getInstance(str6, defaultEncryptionProvider);
                        if (!algorithm.equals("GOST3412_2015_K")) {
                        }
                        byte[] bArr222 = new byte[i2 / 2];
                        int i522 = i2 / 2;
                        str3 = str;
                        oid2 = oid;
                        Array.copy(m, 24, bArr222, 0, i522);
                        if (algorithm2.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME)) {
                        }
                        bArr = new byte[8];
                        str4 = JCP.GOST_DH_2012_512_NAME;
                        Array.copy(m, 16, bArr, 0, 8);
                        kexp15ParamsSpec = new Kexp15ParamsSpec(bArr222, bArr);
                        cipher22.init(3, secretKey3, kexp15ParamsSpec);
                        byte[] wrap2222 = cipher22.wrap(secretKey4);
                        asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
                        equals = algorithm.equals("GOST3412_2015_K");
                        oid3 = lu61.n5;
                        if (equals) {
                        }
                        str5 = str4;
                        u2 u2Var22222 = new u2(str3);
                        if (!algorithm2.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) {
                        }
                        new GostR3410_12_KEG_Parameters(oid3.value).encode(asn1BerEncodeBuffer);
                        j2 j2Var4222 = new j2(asn1BerEncodeBuffer.getMsgCopy());
                        b3 n3222 = j2Var4222.n();
                        j2Var4222.close();
                        asn1BerEncodeBuffer.reset();
                        a2Var = n3222;
                        u2Var = u2Var22222;
                        xr1 xr1Var2222 = new xr1(u2Var, a2Var);
                        ohx ohxVar2222 = new ohx(new p0x(jc51.m(x509Certificate.getIssuerX500Principal().getEncoded()), x509Certificate.getSerialNumber()));
                        dqf dqfVar2222 = new dqf(wrap2222);
                        kgi0 kgi0Var2222 = new kgi0();
                        kgi0Var2222.a = ohxVar2222;
                        kgi0Var2222.b = dqfVar2222;
                        c2 c2Var2222 = new c2();
                        c2Var2222.a(kgi0Var2222);
                        j2 j2Var32222 = new j2(key2.getEncoded());
                        i3 i3Var2222 = (i3) j2Var32222.n();
                        j2Var32222.close();
                        phx phxVar2222 = new phx(new yq80(new ar80(i3.z(new zyu0(i3Var2222).toASN1Primitive()))), new dqf(m), xr1Var2222, new jqf(c2Var2222));
                        ngi0 ngi0Var2222 = new ngi0();
                        ngi0Var2222.a = new oqf(2, 128, 1, phxVar2222, 0);
                        if (secretKey3 != null) {
                        }
                        if (key != null) {
                        }
                        ((SpecKey) key2).clear();
                        return ngi0Var2222;
                    }
                    oid = ((SpecKey) secretKey3).getSpec().getParams().getOID();
                    Cipher cipher222 = Cipher.getInstance(str6, defaultEncryptionProvider);
                    if (!algorithm.equals("GOST3412_2015_K")) {
                    }
                    byte[] bArr2222 = new byte[i2 / 2];
                    int i5222 = i2 / 2;
                    str3 = str;
                    oid2 = oid;
                    Array.copy(m, 24, bArr2222, 0, i5222);
                    if (algorithm2.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME)) {
                    }
                    bArr = new byte[8];
                    str4 = JCP.GOST_DH_2012_512_NAME;
                    Array.copy(m, 16, bArr, 0, 8);
                    kexp15ParamsSpec = new Kexp15ParamsSpec(bArr2222, bArr);
                    cipher222.init(3, secretKey3, kexp15ParamsSpec);
                    byte[] wrap22222 = cipher222.wrap(secretKey4);
                    asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
                    equals = algorithm.equals("GOST3412_2015_K");
                    oid3 = lu61.n5;
                    if (equals) {
                    }
                    str5 = str4;
                    u2 u2Var222222 = new u2(str3);
                    if (!algorithm2.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) {
                    }
                    new GostR3410_12_KEG_Parameters(oid3.value).encode(asn1BerEncodeBuffer);
                    j2 j2Var42222 = new j2(asn1BerEncodeBuffer.getMsgCopy());
                    b3 n32222 = j2Var42222.n();
                    j2Var42222.close();
                    asn1BerEncodeBuffer.reset();
                    a2Var = n32222;
                    u2Var = u2Var222222;
                    xr1 xr1Var22222 = new xr1(u2Var, a2Var);
                    ohx ohxVar22222 = new ohx(new p0x(jc51.m(x509Certificate.getIssuerX500Principal().getEncoded()), x509Certificate.getSerialNumber()));
                    dqf dqfVar22222 = new dqf(wrap22222);
                    kgi0 kgi0Var22222 = new kgi0();
                    kgi0Var22222.a = ohxVar22222;
                    kgi0Var22222.b = dqfVar22222;
                    c2 c2Var22222 = new c2();
                    c2Var22222.a(kgi0Var22222);
                    j2 j2Var322222 = new j2(key2.getEncoded());
                    i3 i3Var22222 = (i3) j2Var322222.n();
                    j2Var322222.close();
                    phx phxVar22222 = new phx(new yq80(new ar80(i3.z(new zyu0(i3Var22222).toASN1Primitive()))), new dqf(m), xr1Var22222, new jqf(c2Var22222));
                    ngi0 ngi0Var22222 = new ngi0();
                    ngi0Var22222.a = new oqf(2, 128, 1, phxVar22222, 0);
                    if (secretKey3 != null) {
                    }
                    if (key != null) {
                    }
                    ((SpecKey) key2).clear();
                    return ngi0Var22222;
                } catch (Exception e5) {
                    e = e5;
                    key3 = key;
                    throw new EnvelopedException("Invalid recipient", e);
                } catch (Throwable th6) {
                    th = th6;
                    secretKey2 = secretKey3;
                    if (secretKey2 != null) {
                    }
                    if (key != null) {
                    }
                    if (key2 != null) {
                    }
                    throw th;
                }
                Key key522 = generateKeyPair2.getPublic();
                if (!algorithm.equals("GOST3412_2015_K")) {
                }
                x509Certificate = x509Certificate2;
                i2 = i;
                byte[] m222 = m(32);
                byte[] bArr322 = new byte[16];
                key2 = key522;
                i4 = 0;
                while (i4 < i3) {
                }
                ivParameterSpec = new IvParameterSpec(bArr322);
                m = m222;
                KeyAgreement keyAgreement222 = KeyAgreement.getInstance(algorithm2, defaultEncryptionProvider);
                keyAgreement222.init(key4, ivParameterSpec);
                key = key4;
                keyAgreement222.doPhase(x509Certificate.getPublicKey(), true);
                secretKey3 = keyAgreement222.generateSecret(algorithm);
            } catch (Exception e6) {
                e = e6;
                key = key4;
                secretKey3 = null;
                key2 = null;
            } catch (Throwable th7) {
                th = th7;
                key = key4;
                secretKey2 = null;
                key2 = null;
            }
            str2 = JCP.GOST_EPH_DH_2012_256_NAME;
            KeyPairGenerator keyPairGenerator22 = KeyPairGenerator.getInstance(str2, defaultEncryptionProvider);
            keyPairGenerator22.initialize(((SpecKey) x509Certificate2.getPublicKey()).getSpec().getParams());
            KeyPair generateKeyPair22 = keyPairGenerator22.generateKeyPair();
            key4 = generateKeyPair22.getPrivate();
        } catch (Exception e7) {
            e = e7;
            secretKey = null;
        } catch (Throwable th8) {
            th = th8;
            secretKey = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0160 A[Catch: Exception -> 0x018a, TryCatch #0 {Exception -> 0x018a, blocks: (B:5:0x0013, B:7:0x0069, B:9:0x0071, B:11:0x007c, B:13:0x0080, B:15:0x0084, B:16:0x0087, B:19:0x008f, B:20:0x00b6, B:22:0x00c1, B:25:0x00c8, B:26:0x010f, B:29:0x013c, B:31:0x0160, B:32:0x0167, B:33:0x0172, B:36:0x016a, B:37:0x0131, B:41:0x00d0, B:43:0x00dc, B:46:0x00e5, B:48:0x00ed, B:51:0x00f6, B:52:0x00ff, B:53:0x0100, B:54:0x0105, B:55:0x0103, B:56:0x0099, B:58:0x009f, B:59:0x00a9, B:61:0x00b1, B:62:0x0180, B:63:0x0189), top: B:4:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016a A[Catch: Exception -> 0x018a, TryCatch #0 {Exception -> 0x018a, blocks: (B:5:0x0013, B:7:0x0069, B:9:0x0071, B:11:0x007c, B:13:0x0080, B:15:0x0084, B:16:0x0087, B:19:0x008f, B:20:0x00b6, B:22:0x00c1, B:25:0x00c8, B:26:0x010f, B:29:0x013c, B:31:0x0160, B:32:0x0167, B:33:0x0172, B:36:0x016a, B:37:0x0131, B:41:0x00d0, B:43:0x00dc, B:46:0x00e5, B:48:0x00ed, B:51:0x00f6, B:52:0x00ff, B:53:0x0100, B:54:0x0105, B:55:0x0103, B:56:0x0099, B:58:0x009f, B:59:0x00a9, B:61:0x00b1, B:62:0x0180, B:63:0x0189), top: B:4:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0131 A[Catch: Exception -> 0x018a, TryCatch #0 {Exception -> 0x018a, blocks: (B:5:0x0013, B:7:0x0069, B:9:0x0071, B:11:0x007c, B:13:0x0080, B:15:0x0084, B:16:0x0087, B:19:0x008f, B:20:0x00b6, B:22:0x00c1, B:25:0x00c8, B:26:0x010f, B:29:0x013c, B:31:0x0160, B:32:0x0167, B:33:0x0172, B:36:0x016a, B:37:0x0131, B:41:0x00d0, B:43:0x00dc, B:46:0x00e5, B:48:0x00ed, B:51:0x00f6, B:52:0x00ff, B:53:0x0100, B:54:0x0105, B:55:0x0103, B:56:0x0099, B:58:0x009f, B:59:0x00a9, B:61:0x00b1, B:62:0x0180, B:63:0x0189), top: B:4:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ngi0 n(fv61 fv61Var) {
        byte[] bArr;
        u2 u2Var;
        OID oid;
        switch (this.c) {
            case 0:
                return o(fv61Var);
            default:
                et61 et61Var = (et61) this.b;
                X509Certificate x509Certificate = (X509Certificate) this.a;
                try {
                    mgi0 mgi0Var = new mgi0(new p0x(jc51.m(x509Certificate.getIssuerX500Principal().getEncoded()), x509Certificate.getSerialNumber()));
                    SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo();
                    PublicKey publicKey = x509Certificate.getPublicKey();
                    Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(publicKey.getEncoded());
                    subjectPublicKeyInfo.decode(asn1BerDecodeBuffer);
                    asn1BerDecodeBuffer.reset();
                    String oid2 = new AlgIdSpec(subjectPublicKeyInfo.algorithm).getOID().toString();
                    SecretKey secretKey = (SecretKey) fv61Var.a;
                    EncryptionKeyAlgorithm encryptionKeyAlgorithm = fv61Var.b;
                    String algorithm = secretKey.getAlgorithm();
                    KeyInterface spec = ((SpecKey) secretKey).getSpec();
                    if (spec instanceof LicenseControlInfoInterface) {
                        bArr = ((LicenseControlInfoInterface) spec).getLicenseControlInfo();
                        if (bArr != null) {
                            et61Var.a = new String(bArr);
                        }
                    } else {
                        bArr = null;
                    }
                    if (bArr == null && encryptionKeyAlgorithm != EncryptionKeyAlgorithm.ekaKuznechikMac && encryptionKeyAlgorithm != EncryptionKeyAlgorithm.ekaMagmaMac) {
                        et61Var.b = false;
                    }
                    if (algorithm.equals("GOST3412_2015_K")) {
                        u2Var = new u2(lu61.j5.a);
                    } else if (algorithm.equals("GOST3412_2015_M")) {
                        u2Var = new u2(lu61.i5.a);
                    } else {
                        if (!algorithm.equalsIgnoreCase("GOST28147")) {
                            throw new EnvelopedException("Unsupported key algorithm: ".concat(algorithm));
                        }
                        u2Var = new u2(oid2);
                    }
                    Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
                    if (!algorithm.equals("GOST3412_2015_K") && !algorithm.equals("GOST3412_2015_M")) {
                        subjectPublicKeyInfo.algorithm.parameters.encode(asn1BerEncodeBuffer);
                        j2 j2Var = new j2(asn1BerEncodeBuffer.getMsgCopy());
                        b3 n = j2Var.n();
                        j2Var.close();
                        xr1 xr1Var = new xr1(u2Var, n);
                        Cipher cipher = Cipher.getInstance(algorithm.equals("GOST3412_2015_M") ? "GostTransportM" : algorithm.equals("GOST3412_2015_K") ? "GostTransportK" : "GostTransport", AdESConfig.getDefaultEncryptionProvider());
                        cipher.init(3, x509Certificate.getPublicKey());
                        dqf dqfVar = new dqf(cipher.wrap(secretKey));
                        njx njxVar = new njx();
                        njxVar.a = mgi0Var.a.toASN1Primitive() instanceof s3 ? new l2(2L) : new l2(0L);
                        njxVar.b = mgi0Var;
                        njxVar.c = xr1Var;
                        njxVar.w = dqfVar;
                        ngi0 ngi0Var = new ngi0();
                        ngi0Var.a = njxVar;
                        return ngi0Var;
                    }
                    String algorithm2 = publicKey.getAlgorithm();
                    if (!algorithm2.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME) && !algorithm2.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME)) {
                        if (!algorithm2.equalsIgnoreCase(JCP.GOST_DH_2012_512_NAME) && !algorithm2.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME)) {
                            throw new EnvelopedException("Invalid key algorithm: ".concat(algorithm2));
                        }
                        oid = lu61.o5;
                        new GostR3410_12_KEG_Parameters(oid.value).encode(asn1BerEncodeBuffer);
                        j2 j2Var2 = new j2(asn1BerEncodeBuffer.getMsgCopy());
                        b3 n2 = j2Var2.n();
                        j2Var2.close();
                        xr1 xr1Var2 = new xr1(u2Var, n2);
                        Cipher cipher2 = Cipher.getInstance(algorithm.equals("GOST3412_2015_M") ? "GostTransportM" : algorithm.equals("GOST3412_2015_K") ? "GostTransportK" : "GostTransport", AdESConfig.getDefaultEncryptionProvider());
                        cipher2.init(3, x509Certificate.getPublicKey());
                        dqf dqfVar2 = new dqf(cipher2.wrap(secretKey));
                        njx njxVar2 = new njx();
                        njxVar2.a = mgi0Var.a.toASN1Primitive() instanceof s3 ? new l2(2L) : new l2(0L);
                        njxVar2.b = mgi0Var;
                        njxVar2.c = xr1Var2;
                        njxVar2.w = dqfVar2;
                        ngi0 ngi0Var2 = new ngi0();
                        ngi0Var2.a = njxVar2;
                        return ngi0Var2;
                    }
                    oid = lu61.n5;
                    new GostR3410_12_KEG_Parameters(oid.value).encode(asn1BerEncodeBuffer);
                    j2 j2Var22 = new j2(asn1BerEncodeBuffer.getMsgCopy());
                    b3 n22 = j2Var22.n();
                    j2Var22.close();
                    xr1 xr1Var22 = new xr1(u2Var, n22);
                    Cipher cipher22 = Cipher.getInstance(algorithm.equals("GOST3412_2015_M") ? "GostTransportM" : algorithm.equals("GOST3412_2015_K") ? "GostTransportK" : "GostTransport", AdESConfig.getDefaultEncryptionProvider());
                    cipher22.init(3, x509Certificate.getPublicKey());
                    dqf dqfVar22 = new dqf(cipher22.wrap(secretKey));
                    njx njxVar22 = new njx();
                    njxVar22.a = mgi0Var.a.toASN1Primitive() instanceof s3 ? new l2(2L) : new l2(0L);
                    njxVar22.b = mgi0Var;
                    njxVar22.c = xr1Var22;
                    njxVar22.w = dqfVar22;
                    ngi0 ngi0Var22 = new ngi0();
                    ngi0Var22.a = njxVar22;
                    return ngi0Var22;
                } catch (Exception e) {
                    throw new EnvelopedException("Invalid recipient", e);
                }
        }
    }
}
