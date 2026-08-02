package com.google.android.play.core.splitinstall.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import defpackage.b891;
import defpackage.dac;
import defpackage.e77;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.rd71;
import defpackage.wtq0;
import defpackage.zwa1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes4.dex */
public abstract class d {
    public static X509Certificate[][] a(String str) {
        Pair c;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile.length() < 22) {
                c = null;
            } else {
                c = zwa1.c(randomAccessFile, 0);
                if (c == null) {
                    c = zwa1.c(randomAccessFile, 65535);
                }
            }
            if (c == null) {
                throw new zzf("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) c.first;
            long longValue = ((Long) c.second).longValue();
            long j = longValue - 20;
            if (j >= 0) {
                randomAccessFile.seek(j);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new zzf("ZIP64 APK not supported");
                }
            }
            zwa1.d(byteBuffer);
            long j2 = byteBuffer.getInt(byteBuffer.position() + 16) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
            if (j2 >= longValue) {
                throw new zzf("ZIP Central Directory offset out of range: " + j2 + ". ZIP End of Central Directory offset: " + longValue);
            }
            zwa1.d(byteBuffer);
            if ((byteBuffer.getInt(byteBuffer.position() + 12) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + j2 != longValue) {
                throw new zzf("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (j2 < 32) {
                throw new zzf("APK too small for APK Signing Block. ZIP Central Directory offset: " + j2);
            }
            ByteBuffer allocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            randomAccessFile.seek(j2 - allocate.capacity());
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                throw new zzf("No APK Signing Block before ZIP Central Directory");
            }
            long j3 = allocate.getLong(0);
            long j4 = j2;
            if (j3 < allocate.capacity() || j3 > 2147483639) {
                throw new zzf("APK Signing Block size out of range: " + j3);
            }
            int i = (int) (8 + j3);
            long j5 = j4 - i;
            if (j5 < 0) {
                throw new zzf("APK Signing Block offset out of range: " + j5);
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i);
            allocate2.order(byteOrder);
            randomAccessFile.seek(j5);
            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
            long j6 = allocate2.getLong(0);
            if (j6 != j3) {
                throw new zzf("APK Signing Block sizes in header and footer do not match: " + j6 + " vs " + j3);
            }
            Pair create = Pair.create(allocate2, Long.valueOf(j5));
            ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
            long longValue2 = ((Long) create.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int capacity = byteBuffer2.capacity() - 24;
            if (capacity < 8) {
                throw new IllegalArgumentException("end < start: " + capacity + " < 8");
            }
            int capacity2 = byteBuffer2.capacity();
            if (capacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
            }
            int limit = byteBuffer2.limit();
            int position = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(capacity);
                byteBuffer2.position(8);
                ByteBuffer slice = byteBuffer2.slice();
                slice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                int i2 = 0;
                while (slice.hasRemaining()) {
                    i2++;
                    if (slice.remaining() < 8) {
                        throw new zzf("Insufficient data to read size of APK Signing Block entry #" + i2);
                    }
                    long j7 = slice.getLong();
                    if (j7 < 4 || j7 > 2147483647L) {
                        throw new zzf("APK Signing Block entry #" + i2 + " size out of range: " + j7);
                    }
                    int i3 = (int) j7;
                    int position2 = slice.position() + i3;
                    if (i3 > slice.remaining()) {
                        throw new zzf("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + slice.remaining());
                    }
                    if (slice.getInt() == 1896449818) {
                        X509Certificate[][] k = k(randomAccessFile.getChannel(), new rd71(e(i3 - 4, slice), longValue2, j4, longValue, byteBuffer));
                        randomAccessFile.close();
                        return k;
                    }
                    long j8 = longValue2;
                    long j9 = longValue;
                    long j10 = j4;
                    ByteBuffer byteBuffer3 = byteBuffer;
                    slice.position(position2);
                    longValue = j9;
                    byteBuffer = byteBuffer3;
                    j4 = j10;
                    longValue2 = j8;
                }
                throw new zzf("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th) {
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                throw th;
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int b(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        ny61.g(oyr.i(i, "Unknown content digest algorthm: "));
        return 0;
    }

    public static int c(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case MSException.ERROR_NO_MORE_ITEMS /* 259 */:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                ny61.g("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                return 0;
        }
    }

    public static String d(int i) {
        if (i == 1) {
            return JCP.DIGEST_SHA_256;
        }
        if (i == 2) {
            return JCP.DIGEST_SHA_512;
        }
        ny61.g(oyr.i(i, "Unknown content digest algorthm: "));
        return null;
    }

    public static ByteBuffer e(int i, ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public static ByteBuffer f(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            ny61.v(oyr.i(byteBuffer.remaining(), "Remaining buffer too short to contain length of length-prefixed field. Remaining: "));
            return null;
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            ny61.g("Negative length");
            return null;
        }
        if (i <= byteBuffer.remaining()) {
            return e(i, byteBuffer);
        }
        ny61.v(oyr.h(i, byteBuffer.remaining(), "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: "));
        return null;
    }

    public static void g(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    public static byte[] h(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            ny61.v("Negative length");
            return null;
        }
        if (i > byteBuffer.remaining()) {
            ny61.v(oyr.h(i, byteBuffer.remaining(), "Underflow while reading length-prefixed value. Length: ", ", available: "));
            return null;
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = c(r6);
        r12 = c(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r11 == 1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r12 == 1) goto L129;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static X509Certificate[] i(ByteBuffer byteBuffer, HashMap hashMap, CertificateFactory certificateFactory) {
        String str;
        Pair create;
        ByteBuffer f = f(byteBuffer);
        ByteBuffer f2 = f(byteBuffer);
        byte[] h = h(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        int i = -1;
        int i2 = 0;
        while (f2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer f3 = f(f2);
                if (f3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = f3.getInt();
                arrayList.add(Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case 257:
                        case 258:
                        case MSException.ERROR_NO_MORE_ITEMS /* 259 */:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                bArr = h(f3);
                i = i3;
            } catch (IOException | BufferUnderflowException e) {
                throw new SecurityException(oyr.i(i2, "Failed to parse signature record #"), e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                ny61.z("No signatures found");
                return null;
            }
            ny61.z("No supported signatures found");
            return null;
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case MSException.ERROR_NO_MORE_ITEMS /* 259 */:
                case 260:
                    str = "RSA";
                    break;
                default:
                    ny61.g("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    return null;
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            create = Pair.create(JCP.SIGN_SHA256_ECDSA_NAME, null);
        } else if (i == 514) {
            create = Pair.create(JCP.SIGN_SHA512_ECDSA_NAME, null);
        } else if (i != 769) {
            switch (i) {
                case 257:
                    create = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec(JCP.DIGEST_SHA_256, "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    create = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec(JCP.DIGEST_SHA_512, "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case MSException.ERROR_NO_MORE_ITEMS /* 259 */:
                    create = Pair.create(JCP.SIGN_SHA256_RSA_NAME, null);
                    break;
                case 260:
                    create = Pair.create(JCP.SIGN_SHA512_RSA_NAME, null);
                    break;
                default:
                    ny61.g("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    return null;
            }
        } else {
            create = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) create.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) create.second;
        try {
            PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(h));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(generatePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(f);
            if (!signature.verify(bArr)) {
                ny61.z(String.valueOf(str2).concat(" signature did not verify"));
                return null;
            }
            f.clear();
            ByteBuffer f4 = f(f);
            ArrayList arrayList2 = new ArrayList();
            byte[] bArr2 = null;
            int i4 = 0;
            while (f4.hasRemaining()) {
                i4++;
                try {
                    ByteBuffer f5 = f(f4);
                    if (f5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i5 = f5.getInt();
                    arrayList2.add(Integer.valueOf(i5));
                    if (i5 == i) {
                        bArr2 = h(f5);
                    }
                } catch (IOException | BufferUnderflowException e2) {
                    dac.g(oyr.i(i4, "Failed to parse digest record #"), e2);
                    return null;
                }
            }
            if (!arrayList.equals(arrayList2)) {
                ny61.z("Signature algorithms don't match between digests and signatures records");
                return null;
            }
            int c = c(i);
            byte[] bArr3 = (byte[]) hashMap.put(Integer.valueOf(c), bArr2);
            if (bArr3 != null && !MessageDigest.isEqual(bArr3, bArr2)) {
                ny61.z(d(c).concat(" contents digest does not match the digest specified by a preceding signer"));
                return null;
            }
            ByteBuffer f6 = f(f);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            while (f6.hasRemaining()) {
                i6++;
                byte[] h2 = h(f6);
                try {
                    arrayList3.add(new zzg((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(h2)), h2));
                } catch (CertificateException e3) {
                    throw new SecurityException(oyr.i(i6, "Failed to decode certificate #"), e3);
                }
            }
            if (arrayList3.isEmpty()) {
                ny61.z("No certificates listed");
                return null;
            }
            if (Arrays.equals(h, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            ny61.z("Public key mismatch between certificate and signature record");
            return null;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
            throw new SecurityException(oyr.p("Failed to verify ", str2, " signature"), e4);
        }
    }

    public static byte[][] j(int[] iArr, b891[] b891VarArr) {
        long j;
        int i;
        int length;
        char c;
        byte[][] bArr;
        String str;
        int i2 = 0;
        int i3 = 0;
        long j2 = 0;
        while (true) {
            j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            if (i3 >= 3) {
                break;
            }
            j2 += (b891VarArr[i3].zza() + 1048575) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            i3++;
        }
        if (j2 >= 2097151) {
            throw new DigestException(qv10.j(j2, "Too many chunks: "));
        }
        byte[][] bArr2 = new byte[iArr.length][];
        int i4 = 0;
        while (true) {
            length = iArr.length;
            c = 5;
            if (i4 >= length) {
                break;
            }
            int i5 = (int) j2;
            byte[] bArr3 = new byte[(b(iArr[i4]) * i5) + 5];
            bArr3[0] = Alerts.alert_user_canceled;
            g(i5, bArr3);
            bArr2[i4] = bArr3;
            i4++;
        }
        byte[] bArr4 = new byte[5];
        bArr4[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i6 = 0;
        while (true) {
            bArr = null;
            str = " digest not supported";
            if (i6 >= iArr.length) {
                break;
            }
            String d = d(iArr[i6]);
            try {
                messageDigestArr[i6] = MessageDigest.getInstance(d);
                i6++;
            } catch (NoSuchAlgorithmException e) {
                ny61.n(d.concat(" digest not supported"), e);
                return null;
            }
        }
        int i7 = 0;
        int i8 = 0;
        for (i = 3; i7 < i; i = 3) {
            b891 b891Var = b891VarArr[i7];
            int i9 = i7;
            long zza = b891Var.zza();
            byte[][] bArr5 = bArr2;
            long j3 = 0;
            while (zza > 0) {
                byte[][] bArr6 = bArr;
                String str2 = str;
                int min = (int) Math.min(zza, j);
                g(min, bArr4);
                for (int i10 = 0; i10 < length; i10++) {
                    messageDigestArr[i10].update(bArr4);
                }
                try {
                    b891Var.a(messageDigestArr, j3, min);
                    int i11 = 0;
                    while (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        byte[] bArr7 = bArr5[i11];
                        int b = b(i12);
                        char c2 = c;
                        MessageDigest messageDigest = messageDigestArr[i11];
                        b891 b891Var2 = b891Var;
                        int digest = messageDigest.digest(bArr7, (i8 * b) + 5, b);
                        if (digest != b) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                        }
                        i11++;
                        c = c2;
                        b891Var = b891Var2;
                    }
                    long j4 = min;
                    j3 += j4;
                    zza -= j4;
                    i8++;
                    bArr = bArr6;
                    str = str2;
                    j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                } catch (IOException e2) {
                    throw new DigestException(oyr.h(i8, i2, "Failed to digest chunk #", " of section #"), e2);
                }
            }
            i2++;
            i7 = i9 + 1;
            bArr2 = bArr5;
            j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        }
        byte[][] bArr8 = bArr2;
        byte[][] bArr9 = bArr;
        String str3 = str;
        byte[][] bArr10 = new byte[iArr.length][];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            byte[] bArr11 = bArr8[i13];
            String d2 = d(i14);
            try {
                bArr10[i13] = MessageDigest.getInstance(d2).digest(bArr11);
            } catch (NoSuchAlgorithmException e3) {
                ny61.n(d2.concat(str3), e3);
                return bArr9;
            }
        }
        return bArr10;
    }

    public static X509Certificate[][] k(FileChannel fileChannel, rd71 rd71Var) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME);
            try {
                ByteBuffer f = f((ByteBuffer) rd71Var.d);
                int i = 0;
                while (f.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(i(f(f), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(oyr.j(i, "Failed to parse/verify signer #", " block"), e);
                    }
                }
                if (i <= 0) {
                    ny61.z("No signers found");
                    return null;
                }
                if (hashMap.isEmpty()) {
                    ny61.z("No content digests found");
                    return null;
                }
                long j = rd71Var.a;
                long j2 = rd71Var.b;
                long j3 = rd71Var.c;
                ByteBuffer byteBuffer = (ByteBuffer) rd71Var.e;
                if (hashMap.isEmpty()) {
                    ny61.z("No digests provided");
                    return null;
                }
                wtq0 wtq0Var = new wtq0(fileChannel, 0L, j);
                wtq0 wtq0Var2 = new wtq0(fileChannel, j2, j3 - j2);
                ByteBuffer duplicate = byteBuffer.duplicate();
                duplicate.order(ByteOrder.LITTLE_ENDIAN);
                zwa1.d(duplicate);
                int position = duplicate.position() + 16;
                if (j < 0 || j > _Gost_CryptoPro_PrivateKeyValues.maxDWORD) {
                    ny61.g(qv10.j(j, "uint32 value of out range: "));
                    return null;
                }
                duplicate.putInt(duplicate.position() + position, (int) j);
                e77 e77Var = new e77(duplicate, 2);
                int size = hashMap.size();
                int[] iArr = new int[size];
                Iterator it = hashMap.keySet().iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    iArr[i2] = ((Integer) it.next()).intValue();
                    i2++;
                }
                try {
                    byte[][] j4 = j(iArr, new b891[]{wtq0Var, wtq0Var2, e77Var});
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = iArr[i3];
                        if (!MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i4)), j4[i3])) {
                            ny61.z(d(i4).concat(" digest of contents did not verify"));
                            return null;
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e2) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e2);
                }
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            ny61.n("Failed to obtain X.509 CertificateFactory", e4);
            return null;
        }
    }
}
