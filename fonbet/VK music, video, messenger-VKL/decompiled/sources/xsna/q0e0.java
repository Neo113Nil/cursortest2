package xsna;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: ProfileTranscoder.java */
/* loaded from: classes12.dex */
public final class q0e0 {
    public static final byte[] a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    @NonNull
    public static byte[] a(@NonNull z6m[] z6mVarArr, @NonNull byte[] bArr) throws IOException {
        int i = 0;
        int i2 = 0;
        for (z6m z6mVar : z6mVarArr) {
            i2 += ((((z6mVar.g * 2) + 7) & (-8)) / 8) + (z6mVar.e * 2) + b(z6mVar.a, bArr, z6mVar.b).getBytes(StandardCharsets.UTF_8).length + 16 + z6mVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, v0e0.c)) {
            int length = z6mVarArr.length;
            while (i < length) {
                z6m z6mVar2 = z6mVarArr[i];
                k(byteArrayOutputStream, z6mVar2, b(z6mVar2.a, bArr, z6mVar2.b));
                j(byteArrayOutputStream, z6mVar2);
                i++;
            }
        } else {
            for (z6m z6mVar3 : z6mVarArr) {
                k(byteArrayOutputStream, z6mVar3, b(z6mVar3.a, bArr, z6mVar3.b));
            }
            int length2 = z6mVarArr.length;
            while (i < length2) {
                j(byteArrayOutputStream, z6mVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    @NonNull
    public static String b(@NonNull String str, @NonNull byte[] bArr, @NonNull String str2) {
        byte[] bArr2 = v0e0.e;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = v0e0.d;
        Object obj = (equals || Arrays.equals(bArr, bArr3)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "!");
            }
            if (StringUtils.PROCESS_POSTFIX_DELIMITER.equals(obj)) {
                return str2.replace("!", StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                if ("!".equals(obj)) {
                    return str2.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "!");
                }
                if (StringUtils.PROCESS_POSTFIX_DELIMITER.equals(obj)) {
                    return str2.replace("!", StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
            } else if (!str2.endsWith(".apk")) {
                return i5s.a(fw3.e(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!", str2);
            }
        }
        return str2;
    }

    public static int[] c(@NonNull ByteArrayInputStream byteArrayInputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) atv0.q(byteArrayInputStream, 2);
            iArr[i3] = i2;
        }
        return iArr;
    }

    @NonNull
    public static z6m[] d(@NonNull FileInputStream fileInputStream, @NonNull byte[] bArr, @NonNull byte[] bArr2, z6m[] z6mVarArr) throws IOException {
        byte[] bArr3 = v0e0.f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, v0e0.g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int q = (int) atv0.q(fileInputStream, 2);
            byte[] p = atv0.p(fileInputStream, (int) atv0.q(fileInputStream, 4), (int) atv0.q(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(p);
            try {
                z6m[] f = f(byteArrayInputStream, bArr2, q, z6mVarArr);
                byteArrayInputStream.close();
                return f;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(v0e0.a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int q2 = (int) atv0.q(fileInputStream, 1);
        byte[] p2 = atv0.p(fileInputStream, (int) atv0.q(fileInputStream, 4), (int) atv0.q(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(p2);
        try {
            z6m[] e = e(byteArrayInputStream2, q2, z6mVarArr);
            byteArrayInputStream2.close();
            return e;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @NonNull
    public static z6m[] e(@NonNull ByteArrayInputStream byteArrayInputStream, int i, z6m[] z6mVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new z6m[0];
        }
        if (i != z6mVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int q = (int) atv0.q(byteArrayInputStream, 2);
            iArr[i2] = (int) atv0.q(byteArrayInputStream, 2);
            strArr[i2] = new String(atv0.o(byteArrayInputStream, q), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            z6m z6mVar = z6mVarArr[i3];
            if (!z6mVar.b.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            z6mVar.e = i4;
            z6mVar.h = c(byteArrayInputStream, i4);
        }
        return z6mVarArr;
    }

    @NonNull
    public static z6m[] f(@NonNull ByteArrayInputStream byteArrayInputStream, @NonNull byte[] bArr, int i, z6m[] z6mVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new z6m[0];
        }
        if (i != z6mVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            atv0.q(byteArrayInputStream, 2);
            String str = new String(atv0.o(byteArrayInputStream, (int) atv0.q(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long q = atv0.q(byteArrayInputStream, 4);
            int q2 = (int) atv0.q(byteArrayInputStream, 2);
            z6m z6mVar = null;
            if (z6mVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i3 = 0;
                while (true) {
                    if (i3 >= z6mVarArr.length) {
                        break;
                    }
                    if (z6mVarArr[i3].b.equals(substring)) {
                        z6mVar = z6mVarArr[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (z6mVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            z6mVar.d = q;
            int[] c = c(byteArrayInputStream, q2);
            if (Arrays.equals(bArr, v0e0.e)) {
                z6mVar.e = q2;
                z6mVar.h = c;
            }
        }
        return z6mVarArr;
    }

    @NonNull
    public static z6m[] g(@NonNull FileInputStream fileInputStream, @NonNull byte[] bArr, @NonNull String str) throws IOException {
        if (!Arrays.equals(bArr, v0e0.b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int q = (int) atv0.q(fileInputStream, 1);
        byte[] p = atv0.p(fileInputStream, (int) atv0.q(fileInputStream, 4), (int) atv0.q(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(p);
        try {
            z6m[] h = h(byteArrayInputStream, str, q);
            byteArrayInputStream.close();
            return h;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @NonNull
    public static z6m[] h(@NonNull ByteArrayInputStream byteArrayInputStream, @NonNull String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new z6m[0];
        }
        z6m[] z6mVarArr = new z6m[i];
        for (int i3 = 0; i3 < i; i3++) {
            int q = (int) atv0.q(byteArrayInputStream, 2);
            int q2 = (int) atv0.q(byteArrayInputStream, 2);
            z6mVarArr[i3] = new z6m(str, new String(atv0.o(byteArrayInputStream, q), StandardCharsets.UTF_8), atv0.q(byteArrayInputStream, 4), q2, (int) atv0.q(byteArrayInputStream, 4), (int) atv0.q(byteArrayInputStream, 4), new int[q2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            z6m z6mVar = z6mVarArr[i4];
            int available = byteArrayInputStream.available();
            int i5 = z6mVar.f;
            int i6 = z6mVar.g;
            TreeMap<Integer, Integer> treeMap = z6mVar.i;
            int i7 = available - i5;
            int i8 = i2;
            while (byteArrayInputStream.available() > i7) {
                i8 += (int) atv0.q(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i8), 1);
                int q3 = (int) atv0.q(byteArrayInputStream, 2);
                while (q3 > 0) {
                    atv0.q(byteArrayInputStream, 2);
                    int q4 = (int) atv0.q(byteArrayInputStream, 1);
                    if (q4 != 6 && q4 != 7) {
                        while (q4 > 0) {
                            atv0.q(byteArrayInputStream, 1);
                            int i9 = i2;
                            int i10 = i4;
                            for (int q5 = (int) atv0.q(byteArrayInputStream, 1); q5 > 0; q5--) {
                                atv0.q(byteArrayInputStream, 2);
                            }
                            q4--;
                            i2 = i9;
                            i4 = i10;
                        }
                    }
                    q3--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i11 = i2;
            int i12 = i4;
            if (byteArrayInputStream.available() != i7) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            z6mVar.h = c(byteArrayInputStream, z6mVar.e);
            BitSet valueOf = BitSet.valueOf(atv0.o(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i6; i13++) {
                int i14 = valueOf.get(i13) ? 2 : i11;
                if (valueOf.get(i13 + i6)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer num = treeMap.get(Integer.valueOf(i13));
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | num.intValue()));
                }
            }
            i4 = i12 + 1;
            i2 = i11;
        }
        return z6mVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean i(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull byte[] bArr, @NonNull z6m[] z6mVarArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = v0e0.a;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = v0e0.b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] a2 = a(z6mVarArr, bArr3);
                atv0.w(byteArrayOutputStream, z6mVarArr.length, 1);
                atv0.w(byteArrayOutputStream, a2.length, 4);
                byte[] i2 = atv0.i(a2);
                atv0.w(byteArrayOutputStream, i2.length, 4);
                byteArrayOutputStream.write(i2);
                return true;
            }
            byte[] bArr4 = v0e0.d;
            if (Arrays.equals(bArr, bArr4)) {
                atv0.w(byteArrayOutputStream, z6mVarArr.length, 1);
                for (z6m z6mVar : z6mVarArr) {
                    int size = z6mVar.i.size() * 4;
                    String b2 = b(z6mVar.a, bArr4, z6mVar.b);
                    Charset charset = StandardCharsets.UTF_8;
                    atv0.y(byteArrayOutputStream, b2.getBytes(charset).length);
                    atv0.y(byteArrayOutputStream, z6mVar.h.length);
                    atv0.w(byteArrayOutputStream, size, 4);
                    atv0.w(byteArrayOutputStream, z6mVar.c, 4);
                    byteArrayOutputStream.write(b2.getBytes(charset));
                    Iterator<Integer> it = z6mVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        atv0.y(byteArrayOutputStream, it.next().intValue());
                        atv0.y(byteArrayOutputStream, 0);
                    }
                    for (int i3 : z6mVar.h) {
                        atv0.y(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = v0e0.c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] a3 = a(z6mVarArr, bArr5);
                atv0.w(byteArrayOutputStream, z6mVarArr.length, 1);
                atv0.w(byteArrayOutputStream, a3.length, 4);
                byte[] i4 = atv0.i(a3);
                atv0.w(byteArrayOutputStream, i4.length, 4);
                byteArrayOutputStream.write(i4);
                return true;
            }
            byte[] bArr6 = v0e0.e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            atv0.y(byteArrayOutputStream, z6mVarArr.length);
            for (z6m z6mVar2 : z6mVarArr) {
                String str = z6mVar2.a;
                TreeMap<Integer, Integer> treeMap = z6mVar2.i;
                String b3 = b(str, bArr6, z6mVar2.b);
                Charset charset2 = StandardCharsets.UTF_8;
                atv0.y(byteArrayOutputStream, b3.getBytes(charset2).length);
                atv0.y(byteArrayOutputStream, treeMap.size());
                atv0.y(byteArrayOutputStream, z6mVar2.h.length);
                atv0.w(byteArrayOutputStream, z6mVar2.c, 4);
                byteArrayOutputStream.write(b3.getBytes(charset2));
                Iterator<Integer> it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    atv0.y(byteArrayOutputStream, it2.next().intValue());
                }
                for (int i5 : z6mVar2.h) {
                    atv0.y(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            atv0.y(byteArrayOutputStream2, z6mVarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (z6m z6mVar3 : z6mVarArr) {
                atv0.w(byteArrayOutputStream2, z6mVar3.c, 4);
                atv0.w(byteArrayOutputStream2, z6mVar3.d, 4);
                atv0.w(byteArrayOutputStream2, z6mVar3.g, 4);
                String b4 = b(z6mVar3.a, bArr2, z6mVar3.b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = b4.getBytes(charset3).length;
                atv0.y(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(b4.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            a0y0 a0y0Var = new a0y0(dar.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(a0y0Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            for (int i9 = 0; i9 < z6mVarArr.length; i9++) {
                try {
                    z6m z6mVar4 = z6mVarArr[i9];
                    atv0.y(byteArrayOutputStream3, i9);
                    atv0.y(byteArrayOutputStream3, z6mVar4.e);
                    i8 = i8 + 4 + (z6mVar4.e * i6);
                    int[] iArr = z6mVar4.h;
                    int length3 = iArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length3) {
                        int i12 = iArr[i10];
                        atv0.y(byteArrayOutputStream3, i12 - i11);
                        i10++;
                        i6 = i6;
                        i11 = i12;
                    }
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            a0y0 a0y0Var2 = new a0y0(dar.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(a0y0Var2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            int i14 = 0;
            while (i13 < z6mVarArr.length) {
                try {
                    z6m z6mVar5 = z6mVarArr[i13];
                    Iterator<Map.Entry<Integer, Integer>> it3 = z6mVar5.i.entrySet().iterator();
                    int i15 = i;
                    while (it3.hasNext()) {
                        i15 |= it3.next().getValue().intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        l(byteArrayOutputStream4, i15, z6mVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m(byteArrayOutputStream4, z6mVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            atv0.y(byteArrayOutputStream3, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i16 = i14 + 6;
                            ArrayList arrayList4 = arrayList3;
                            atv0.w(byteArrayOutputStream3, length4, 4);
                            atv0.y(byteArrayOutputStream3, i15);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i14 = i16 + length4;
                            i13++;
                            arrayList3 = arrayList4;
                            i = 0;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i14 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray5.length);
            }
            a0y0 a0y0Var3 = new a0y0(dar.METHODS, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(a0y0Var3);
            long j = 4;
            long size2 = j + j + 4 + (arrayList2.size() * 16);
            atv0.w(byteArrayOutputStream, arrayList2.size(), 4);
            int i17 = 0;
            while (i17 < arrayList2.size()) {
                a0y0 a0y0Var4 = (a0y0) arrayList2.get(i17);
                dar darVar = a0y0Var4.a;
                byte[] bArr7 = a0y0Var4.b;
                atv0.w(byteArrayOutputStream, darVar.h(), 4);
                atv0.w(byteArrayOutputStream, size2, 4);
                if (a0y0Var4.c) {
                    long length5 = bArr7.length;
                    byte[] i18 = atv0.i(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(i18);
                    atv0.w(byteArrayOutputStream, i18.length, 4);
                    atv0.w(byteArrayOutputStream, length5, 4);
                    length = i18.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    atv0.w(byteArrayOutputStream, bArr7.length, 4);
                    atv0.w(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i17++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i19));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void j(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull z6m z6mVar) throws IOException {
        m(byteArrayOutputStream, z6mVar);
        int i = z6mVar.g;
        int[] iArr = z6mVar.h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            atv0.y(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : z6mVar.i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                int i5 = intValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i6 = intValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void k(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull z6m z6mVar, @NonNull String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        atv0.y(byteArrayOutputStream, str.getBytes(charset).length);
        atv0.y(byteArrayOutputStream, z6mVar.e);
        atv0.w(byteArrayOutputStream, z6mVar.f, 4);
        atv0.w(byteArrayOutputStream, z6mVar.c, 4);
        atv0.w(byteArrayOutputStream, z6mVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void l(@NonNull ByteArrayOutputStream byteArrayOutputStream, int i, @NonNull z6m z6mVar) throws IOException {
        int i2 = z6mVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : z6mVar.i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & intValue2) == i4) {
                        int i5 = (i3 * i2) + intValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void m(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull z6m z6mVar) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : z6mVar.i.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                atv0.y(byteArrayOutputStream, intValue - i);
                atv0.y(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }
}
