package io.jsonwebtoken.impl.crypto;

import com.vungle.ads.internal.protos.Sdk;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Strings;
import io.jsonwebtoken.security.InvalidKeyException;
import io.jsonwebtoken.security.SignatureException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.interfaces.ECKey;
import java.security.spec.ECGenParameterSpec;
import java.util.HashMap;
import java.util.Map;
import xsna.cqi;

/* loaded from: classes8.dex */
public abstract class EllipticCurveProvider extends SignatureProvider {
    private static final Map<SignatureAlgorithm, String> EC_CURVE_NAMES = createEcCurveNames();
    protected final int fieldByteLength;
    protected final int requiredSignatureByteLength;

    /* renamed from: io.jsonwebtoken.impl.crypto.EllipticCurveProvider$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$jsonwebtoken$SignatureAlgorithm;

        static {
            int[] iArr = new int[SignatureAlgorithm.values().length];
            $SwitchMap$io$jsonwebtoken$SignatureAlgorithm = iArr;
            try {
                iArr[SignatureAlgorithm.ES256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.ES384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.ES512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public EllipticCurveProvider(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        Assert.isTrue(signatureAlgorithm.isEllipticCurve(), "SignatureAlgorithm must be an Elliptic Curve algorithm.");
        if (!(key instanceof ECKey)) {
            throw new InvalidKeyException("Elliptic Curve signatures require an ECKey. The provided key of type " + key.getClass().getName() + " is not a " + ECKey.class.getName() + " instance.");
        }
        int signatureByteArrayLength = getSignatureByteArrayLength(signatureAlgorithm);
        this.requiredSignatureByteLength = signatureByteArrayLength;
        int i = signatureByteArrayLength / 2;
        this.fieldByteLength = i;
        int bitLength = (((ECKey) key).getParams().getOrder().bitLength() + 7) / 8;
        if (bitLength * 2 == signatureByteArrayLength) {
            return;
        }
        throw new InvalidKeyException("EllipticCurve key has a field size of " + byteSizeString(bitLength) + ", but " + signatureAlgorithm.name() + " requires a field size of " + byteSizeString(i) + " per [RFC 7518, Section 3.4 (validation)](https://datatracker.ietf.org/doc/html/rfc7518#section-3.4).");
    }

    public static String byteSizeString(int i) {
        return i + " bytes (" + (i * 8) + " bits)";
    }

    private static byte[] concatToDER(byte[] bArr) throws ArrayIndexOutOfBoundsException {
        byte[] bArr2;
        int length = bArr.length / 2;
        int i = length;
        while (i > 0 && bArr[length - i] == 0) {
            i--;
        }
        int i2 = length - i;
        int i3 = bArr[i2] < 0 ? i + 1 : i;
        int i4 = length;
        while (i4 > 0 && bArr[(length * 2) - i4] == 0) {
            i4--;
        }
        int i5 = (length * 2) - i4;
        int i6 = bArr[i5] < 0 ? i4 + 1 : i4;
        int i7 = i3 + 4 + i6;
        if (i7 > 255) {
            throw new JwtException("Invalid ECDSA signature format");
        }
        int i8 = 1;
        if (i7 < 128) {
            bArr2 = new byte[i3 + 6 + i6];
        } else {
            bArr2 = new byte[i3 + 7 + i6];
            bArr2[1] = -127;
            i8 = 2;
        }
        bArr2[0] = 48;
        bArr2[i8] = (byte) i7;
        bArr2[i8 + 1] = 2;
        bArr2[i8 + 2] = (byte) i3;
        int i9 = i8 + 3 + i3;
        System.arraycopy(bArr, i2, bArr2, i9 - i, i);
        bArr2[i9] = 2;
        bArr2[i9 + 1] = (byte) i6;
        System.arraycopy(bArr, i5, bArr2, ((i9 + 2) + i6) - i4, i4);
        return bArr2;
    }

    private static Map<SignatureAlgorithm, String> createEcCurveNames() {
        HashMap hashMap = new HashMap();
        hashMap.put(SignatureAlgorithm.ES256, "secp256r1");
        hashMap.put(SignatureAlgorithm.ES384, "secp384r1");
        hashMap.put(SignatureAlgorithm.ES512, "secp521r1");
        return hashMap;
    }

    public static KeyPair generateKeyPair() {
        return generateKeyPair(SignatureAlgorithm.ES512);
    }

    public static int getSignatureByteArrayLength(SignatureAlgorithm signatureAlgorithm) throws JwtException {
        int i = AnonymousClass1.$SwitchMap$io$jsonwebtoken$SignatureAlgorithm[signatureAlgorithm.ordinal()];
        if (i == 1) {
            return 64;
        }
        if (i == 2) {
            return 96;
        }
        if (i == 3) {
            return Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE;
        }
        throw new JwtException("Unsupported Algorithm: " + signatureAlgorithm.name());
    }

    public static byte[] transcodeConcatToDER(byte[] bArr) throws JwtException {
        try {
            return concatToDER(bArr);
        } catch (Exception e) {
            throw new SignatureException("Invalid ECDSA signature format.", e);
        }
    }

    public static byte[] transcodeDERToConcat(byte[] bArr, int i) throws JwtException {
        int i2;
        if (bArr.length < 8 || bArr[0] != 48) {
            throw new JwtException("Invalid ECDSA signature format");
        }
        byte b = bArr[1];
        if (b > 0) {
            i2 = 2;
        } else {
            if (b != -127) {
                throw new JwtException("Invalid ECDSA signature format");
            }
            i2 = 3;
        }
        int i3 = bArr[i2 + 1];
        int i4 = i3;
        while (i4 > 0 && bArr[((i2 + 2) + i3) - i4] == 0) {
            i4--;
        }
        int i5 = i2 + 2 + i3;
        int i6 = bArr[i5 + 1];
        int i7 = i6;
        while (i7 > 0 && bArr[((i5 + 2) + i6) - i7] == 0) {
            i7--;
        }
        int max = Math.max(Math.max(i4, i7), i / 2);
        int i8 = bArr[i2 - 1];
        if ((i8 & 255) != bArr.length - i2 || (i8 & 255) != i3 + 4 + i6 || bArr[i2] != 2 || bArr[i5] != 2) {
            throw new JwtException("Invalid ECDSA signature format");
        }
        int i9 = max * 2;
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i5 - i4, bArr2, max - i4, i4);
        System.arraycopy(bArr, ((i5 + 2) + i6) - i7, bArr2, i9 - i7, i7);
        return bArr2;
    }

    public static KeyPair generateKeyPair(SignatureAlgorithm signatureAlgorithm) {
        return generateKeyPair(signatureAlgorithm, SignatureProvider.DEFAULT_SECURE_RANDOM);
    }

    public static KeyPair generateKeyPair(SignatureAlgorithm signatureAlgorithm, SecureRandom secureRandom) {
        return generateKeyPair("EC", null, signatureAlgorithm, secureRandom);
    }

    public static KeyPair generateKeyPair(String str, String str2, SignatureAlgorithm signatureAlgorithm, SecureRandom secureRandom) {
        KeyPairGenerator keyPairGenerator;
        Assert.notNull(signatureAlgorithm, "SignatureAlgorithm argument cannot be null.");
        Assert.isTrue(signatureAlgorithm.isEllipticCurve(), "SignatureAlgorithm argument must represent an Elliptic Curve algorithm.");
        try {
            if (Strings.hasText(str2)) {
                keyPairGenerator = KeyPairGenerator.getInstance(str, str2);
            } else {
                keyPairGenerator = KeyPairGenerator.getInstance(str);
            }
            keyPairGenerator.initialize(new ECGenParameterSpec(EC_CURVE_NAMES.get(signatureAlgorithm)), secureRandom);
            return keyPairGenerator.generateKeyPair();
        } catch (Exception e) {
            throw new IllegalStateException(cqi.b(e, new StringBuilder("Unable to generate Elliptic Curve KeyPair: ")), e);
        }
    }
}
