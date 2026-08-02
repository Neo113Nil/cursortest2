package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import com.facebook.soloader.MinElf;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
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
import ru.ok.proto.PublisherConfiguration;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class of01 {
    public static X509Certificate[][] a(String str) throws com.google.android.play.core.splitinstall.internal.zzf, SecurityException, IOException {
        Pair a;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile.length() < 22) {
                a = null;
            } else {
                a = ch01.a(randomAccessFile, 0);
                if (a == null) {
                    a = ch01.a(randomAccessFile, MinElf.PN_XNUM);
                }
            }
            if (a == null) {
                throw new com.google.android.play.core.splitinstall.internal.zzf("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) a.first;
            long longValue = ((Long) a.second).longValue();
            long j = longValue - 20;
            if (j >= 0) {
                randomAccessFile.seek(j);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new com.google.android.play.core.splitinstall.internal.zzf("ZIP64 APK not supported");
                }
            }
            ch01.b(byteBuffer);
            long j2 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
            if (j2 >= longValue) {
                throw new com.google.android.play.core.splitinstall.internal.zzf("ZIP Central Directory offset out of range: " + j2 + ". ZIP End of Central Directory offset: " + longValue);
            }
            ch01.b(byteBuffer);
            if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j2 != longValue) {
                throw new com.google.android.play.core.splitinstall.internal.zzf("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (j2 < 32) {
                throw new com.google.android.play.core.splitinstall.internal.zzf("APK too small for APK Signing Block. ZIP Central Directory offset: " + j2);
            }
            ByteBuffer allocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            randomAccessFile.seek(j2 - allocate.capacity());
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                throw new com.google.android.play.core.splitinstall.internal.zzf("No APK Signing Block before ZIP Central Directory");
            }
            long j3 = allocate.getLong(0);
            long j4 = j2;
            if (j3 < allocate.capacity() || j3 > 2147483639) {
                throw new com.google.android.play.core.splitinstall.internal.zzf("APK Signing Block size out of range: " + j3);
            }
            int i = (int) (8 + j3);
            long j5 = j4 - i;
            if (j5 < 0) {
                throw new com.google.android.play.core.splitinstall.internal.zzf("APK Signing Block offset out of range: " + j5);
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i);
            allocate2.order(byteOrder);
            randomAccessFile.seek(j5);
            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
            long j6 = allocate2.getLong(0);
            if (j6 != j3) {
                throw new com.google.android.play.core.splitinstall.internal.zzf("APK Signing Block sizes in header and footer do not match: " + j6 + " vs " + j3);
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
                        throw new com.google.android.play.core.splitinstall.internal.zzf("Insufficient data to read size of APK Signing Block entry #" + i2);
                    }
                    long j7 = slice.getLong();
                    if (j7 < 4 || j7 > 2147483647L) {
                        throw new com.google.android.play.core.splitinstall.internal.zzf("APK Signing Block entry #" + i2 + " size out of range: " + j7);
                    }
                    int i3 = (int) j7;
                    int position2 = slice.position() + i3;
                    if (i3 > slice.remaining()) {
                        throw new com.google.android.play.core.splitinstall.internal.zzf("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + slice.remaining());
                    }
                    if (slice.getInt() == 1896449818) {
                        X509Certificate[][] k = k(randomAccessFile.getChannel(), new u801(e(i3 - 4, slice), longValue2, j4, longValue, byteBuffer));
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
                throw new com.google.android.play.core.splitinstall.internal.zzf("No APK Signature Scheme v2 block in APK Signing Block");
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
        throw new IllegalArgumentException(lhg.a(i, "Unknown content digest algorthm: "));
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
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
        }
    }

    public static String d(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(lhg.a(i, "Unknown content digest algorthm: "));
    }

    public static ByteBuffer e(int i, ByteBuffer byteBuffer) throws BufferUnderflowException {
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

    public static ByteBuffer f(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(lhg.a(byteBuffer.remaining(), "Remaining buffer too short to contain length of length-prefixed field. Remaining: "));
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return e(i, byteBuffer);
        }
        throw new IOException(efz.a(i, byteBuffer.remaining(), "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: "));
    }

    public static void g(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    public static byte[] h(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            throw new IOException(efz.a(i, byteBuffer.remaining(), "Underflow while reading length-prefixed value. Length: ", ", available: "));
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
    
        if (r11 == 1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r12 == 1) goto L141;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static X509Certificate[] i(ByteBuffer byteBuffer, HashMap hashMap, CertificateFactory certificateFactory) throws SecurityException, IOException {
        String str;
        Pair create;
        ByteBuffer f = f(byteBuffer);
        ByteBuffer f2 = f(byteBuffer);
        byte[] h = h(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
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
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                bArr2 = h(f3);
                i = i3;
            } catch (IOException e) {
                e = e;
                throw new SecurityException(lhg.a(i2, "Failed to parse signature record #"), e);
            } catch (BufferUnderflowException e2) {
                e = e2;
                throw new SecurityException(lhg.a(i2, "Failed to parse signature record #"), e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            create = Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            create = Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
                case 257:
                    create = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    create = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    create = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    create = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
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
            if (!signature.verify(bArr2)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            f.clear();
            ByteBuffer f4 = f(f);
            ArrayList arrayList2 = new ArrayList();
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
                        bArr = h(f5);
                    }
                } catch (IOException e3) {
                    e = e3;
                    throw new IOException(lhg.a(i4, "Failed to parse digest record #"), e);
                } catch (BufferUnderflowException e4) {
                    e = e4;
                    throw new IOException(lhg.a(i4, "Failed to parse digest record #"), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int c = c(i);
            byte[] bArr3 = (byte[]) hashMap.put(Integer.valueOf(c), bArr);
            if (bArr3 != null && !MessageDigest.isEqual(bArr3, bArr)) {
                throw new SecurityException(d(c).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer f6 = f(f);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            while (f6.hasRemaining()) {
                i6++;
                byte[] h2 = h(f6);
                try {
                    arrayList3.add(new hc01((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(h2)), h2));
                } catch (CertificateException e5) {
                    throw new SecurityException(lhg.a(i6, "Failed to decode certificate #"), e5);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(h, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e6) {
            e = e6;
            throw new SecurityException(zr.a("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e7) {
            e = e7;
            throw new SecurityException(zr.a("Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e8) {
            e = e8;
            throw new SecurityException(zr.a("Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e9) {
            e = e9;
            throw new SecurityException(zr.a("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e10) {
            e = e10;
            throw new SecurityException(zr.a("Failed to verify ", str2, " signature"), e);
        }
    }

    public static byte[][] j(int[] iArr, w101[] w101VarArr) throws DigestException {
        long j;
        int i;
        int length;
        char c;
        int i2 = 0;
        long j2 = 0;
        while (true) {
            j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            if (i2 >= 3) {
                break;
            }
            j2 += (w101VarArr[i2].zza() + PublisherConfiguration.DEFAULT_LOW_BANDWIDTH_MARK) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            i2++;
        }
        if (j2 >= 2097151) {
            throw new DigestException(defpackage.k0.a(j2, "Too many chunks: "));
        }
        byte[][] bArr = new byte[iArr.length][];
        int i3 = 0;
        while (true) {
            length = iArr.length;
            c = 5;
            if (i3 >= length) {
                break;
            }
            int i4 = (int) j2;
            byte[] bArr2 = new byte[(b(iArr[i3]) * i4) + 5];
            bArr2[0] = 90;
            g(i4, bArr2);
            bArr[i3] = bArr2;
            i3++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            String d = d(iArr[i5]);
            try {
                messageDigestArr[i5] = MessageDigest.getInstance(d);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(d.concat(" digest not supported"), e);
            }
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (i = 3; i6 < i; i = 3) {
            w101 w101Var = w101VarArr[i6];
            int i9 = i6;
            long zza = w101Var.zza();
            long j3 = 0;
            while (zza > 0) {
                char c2 = c;
                int i10 = i7;
                int min = (int) Math.min(zza, j);
                g(min, bArr3);
                for (int i11 = 0; i11 < length; i11++) {
                    messageDigestArr[i11].update(bArr3);
                }
                try {
                    w101Var.b(messageDigestArr, j3, min);
                    int i12 = 0;
                    while (i12 < iArr.length) {
                        int i13 = iArr[i12];
                        byte[] bArr4 = bArr[i12];
                        int b = b(i13);
                        w101 w101Var2 = w101Var;
                        MessageDigest messageDigest = messageDigestArr[i12];
                        long j4 = zza;
                        int digest = messageDigest.digest(bArr4, (i10 * b) + 5, b);
                        if (digest != b) {
                            throw new RuntimeException(zil0.a(digest, "Unexpected output size of ", messageDigest.getAlgorithm(), " digest: "));
                        }
                        i12++;
                        w101Var = w101Var2;
                        zza = j4;
                    }
                    w101 w101Var3 = w101Var;
                    long j5 = min;
                    j3 += j5;
                    zza -= j5;
                    i7 = i10 + 1;
                    c = c2;
                    w101Var = w101Var3;
                    j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                } catch (IOException e2) {
                    throw new DigestException(efz.a(i10, i8, "Failed to digest chunk #", " of section #"), e2);
                }
            }
            i8++;
            i6 = i9 + 1;
            j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        }
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            byte[] bArr6 = bArr[i14];
            String d2 = d(i15);
            try {
                bArr5[i14] = MessageDigest.getInstance(d2).digest(bArr6);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(d2.concat(" digest not supported"), e3);
            }
        }
        return bArr5;
    }

    public static X509Certificate[][] k(FileChannel fileChannel, u801 u801Var) throws SecurityException {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            try {
                ByteBuffer f = f(u801Var.a);
                int i = 0;
                while (f.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(i(f(f), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(tgw.b(i, "Failed to parse/verify signer #", " block"), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j = u801Var.b;
                long j2 = u801Var.c;
                long j3 = u801Var.d;
                ByteBuffer byteBuffer = u801Var.e;
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                v501 v501Var = new v501(fileChannel, 0L, j);
                v501 v501Var2 = new v501(fileChannel, j2, j3 - j2);
                ByteBuffer duplicate = byteBuffer.duplicate();
                duplicate.order(ByteOrder.LITTLE_ENDIAN);
                ch01.b(duplicate);
                int position = duplicate.position() + 16;
                if (j < 0 || j > 4294967295L) {
                    throw new IllegalArgumentException(defpackage.k0.a(j, "uint32 value of out range: "));
                }
                duplicate.putInt(duplicate.position() + position, (int) j);
                itz0 itz0Var = new itz0(duplicate);
                int size = hashMap.size();
                int[] iArr = new int[size];
                Iterator it = hashMap.keySet().iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    iArr[i2] = ((Integer) it.next()).intValue();
                    i2++;
                }
                try {
                    byte[][] j4 = j(iArr, new w101[]{v501Var, v501Var2, itz0Var});
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = iArr[i3];
                        if (!MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i4)), j4[i3])) {
                            throw new SecurityException(d(i4).concat(" digest of contents did not verify"));
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
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
        }
    }
}
