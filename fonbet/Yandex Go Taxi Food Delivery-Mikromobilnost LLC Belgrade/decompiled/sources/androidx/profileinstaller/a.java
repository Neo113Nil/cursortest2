package androidx.profileinstaller;

import defpackage.cq91;
import defpackage.e7a1;
import defpackage.nil0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qv10;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes10.dex */
public abstract class a {
    public static final byte[] a = {Alerts.alert_unrecognized_name, Alerts.alert_bad_certificate_hash_value, Alerts.alert_certificate_unobtainable, 0};
    public static final byte[] b = {Alerts.alert_unrecognized_name, Alerts.alert_bad_certificate_hash_value, 109, 0};

    public static byte[] a(nil0[] nil0VarArr, byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (nil0 nil0Var : nil0VarArr) {
            i2 += ((((nil0Var.i * 2) + 7) & (-8)) / 8) + (nil0Var.f * 2) + b((String) nil0Var.b, (String) nil0Var.c, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + nil0Var.h;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, cq91.c)) {
            int length = nil0VarArr.length;
            while (i < length) {
                nil0 nil0Var2 = nil0VarArr[i];
                k(byteArrayOutputStream, nil0Var2, b((String) nil0Var2.b, (String) nil0Var2.c, bArr));
                j(byteArrayOutputStream, nil0Var2);
                i++;
            }
        } else {
            for (nil0 nil0Var3 : nil0VarArr) {
                k(byteArrayOutputStream, nil0Var3, b((String) nil0Var3.b, (String) nil0Var3.c, bArr));
            }
            int length2 = nil0VarArr.length;
            while (i < length2) {
                j(byteArrayOutputStream, nil0VarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    public static String b(String str, String str2, byte[] bArr) {
        byte[] bArr2 = cq91.e;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = cq91.d;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return oyr.t(qv10.t(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static int[] c(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) e7a1.i(2, byteArrayInputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static nil0[] d(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, nil0[] nil0VarArr) {
        byte[] bArr3 = cq91.f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, cq91.g)) {
                ny61.r("Unsupported meta version");
                return null;
            }
            int i = (int) e7a1.i(2, fileInputStream);
            byte[] h = e7a1.h(fileInputStream, (int) e7a1.i(4, fileInputStream), (int) e7a1.i(4, fileInputStream));
            if (fileInputStream.read() > 0) {
                ny61.r("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h);
            try {
                nil0[] f = f(byteArrayInputStream, bArr2, i, nil0VarArr);
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
        if (Arrays.equals(cq91.a, bArr2)) {
            ny61.r("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            ny61.r("Unsupported meta version");
            return null;
        }
        int i2 = (int) e7a1.i(1, fileInputStream);
        byte[] h2 = e7a1.h(fileInputStream, (int) e7a1.i(4, fileInputStream), (int) e7a1.i(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            ny61.r("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h2);
        try {
            nil0[] e = e(byteArrayInputStream2, i2, nil0VarArr);
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

    public static nil0[] e(ByteArrayInputStream byteArrayInputStream, int i, nil0[] nil0VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new nil0[0];
        }
        if (i != nil0VarArr.length) {
            ny61.r("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (int) e7a1.i(2, byteArrayInputStream);
            iArr[i2] = (int) e7a1.i(2, byteArrayInputStream);
            strArr[i2] = new String(e7a1.g(i3, byteArrayInputStream), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i; i4++) {
            nil0 nil0Var = nil0VarArr[i4];
            if (!((String) nil0Var.c).equals(strArr[i4])) {
                ny61.r("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            nil0Var.f = i5;
            nil0Var.d = c(byteArrayInputStream, i5);
        }
        return nil0VarArr;
    }

    public static nil0[] f(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, nil0[] nil0VarArr) {
        nil0 nil0Var;
        if (byteArrayInputStream.available() == 0) {
            return new nil0[0];
        }
        if (i != nil0VarArr.length) {
            ny61.r("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            e7a1.i(2, byteArrayInputStream);
            String str = new String(e7a1.g((int) e7a1.i(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            long i3 = e7a1.i(4, byteArrayInputStream);
            int i4 = (int) e7a1.i(2, byteArrayInputStream);
            if (nil0VarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i5 = 0; i5 < nil0VarArr.length; i5++) {
                    if (((String) nil0VarArr[i5].c).equals(substring)) {
                        nil0Var = nil0VarArr[i5];
                        break;
                    }
                }
            }
            nil0Var = null;
            if (nil0Var == null) {
                ny61.r("Missing profile key: ".concat(str));
                return null;
            }
            nil0Var.j = i3;
            int[] c = c(byteArrayInputStream, i4);
            if (Arrays.equals(bArr, cq91.e)) {
                nil0Var.f = i4;
                nil0Var.d = c;
            }
        }
        return nil0VarArr;
    }

    public static nil0[] g(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, cq91.b)) {
            ny61.r("Unsupported version");
            return null;
        }
        int i = (int) e7a1.i(1, fileInputStream);
        byte[] h = e7a1.h(fileInputStream, (int) e7a1.i(4, fileInputStream), (int) e7a1.i(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            ny61.r("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h);
        try {
            nil0[] h2 = h(byteArrayInputStream, str, i);
            byteArrayInputStream.close();
            return h2;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static nil0[] h(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new nil0[0];
        }
        nil0[] nil0VarArr = new nil0[i];
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = (int) e7a1.i(2, byteArrayInputStream);
            int i5 = (int) e7a1.i(2, byteArrayInputStream);
            nil0VarArr[i3] = new nil0(str, new String(e7a1.g(i4, byteArrayInputStream), StandardCharsets.UTF_8), e7a1.i(4, byteArrayInputStream), i5, (int) e7a1.i(4, byteArrayInputStream), (int) e7a1.i(4, byteArrayInputStream), new int[i5], new TreeMap());
        }
        int i6 = 0;
        while (i6 < i) {
            nil0 nil0Var = nil0VarArr[i6];
            int available = byteArrayInputStream.available();
            int i7 = nil0Var.h;
            int i8 = nil0Var.i;
            TreeMap treeMap = (TreeMap) nil0Var.e;
            int i9 = available - i7;
            int i10 = i2;
            while (byteArrayInputStream.available() > i9) {
                i10 += (int) e7a1.i(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(i10), 1);
                int i11 = (int) e7a1.i(2, byteArrayInputStream);
                while (i11 > 0) {
                    e7a1.i(2, byteArrayInputStream);
                    int i12 = (int) e7a1.i(1, byteArrayInputStream);
                    if (i12 != 6 && i12 != 7) {
                        while (i12 > 0) {
                            e7a1.i(1, byteArrayInputStream);
                            int i13 = i2;
                            int i14 = i6;
                            for (int i15 = (int) e7a1.i(1, byteArrayInputStream); i15 > 0; i15--) {
                                e7a1.i(2, byteArrayInputStream);
                            }
                            i12--;
                            i2 = i13;
                            i6 = i14;
                        }
                    }
                    i11--;
                    i2 = i2;
                    i6 = i6;
                }
            }
            int i16 = i2;
            int i17 = i6;
            if (byteArrayInputStream.available() != i9) {
                ny61.r("Read too much data during profile line parse");
                return null;
            }
            nil0Var.d = c(byteArrayInputStream, nil0Var.f);
            BitSet valueOf = BitSet.valueOf(e7a1.g((((i8 * 2) + 7) & (-8)) / 8, byteArrayInputStream));
            for (int i18 = i16; i18 < i8; i18++) {
                int i19 = valueOf.get(i18) ? 2 : i16;
                if (valueOf.get(i18 + i8)) {
                    i19 |= 4;
                }
                if (i19 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i18));
                    if (num == null) {
                        num = Integer.valueOf(i16);
                    }
                    treeMap.put(Integer.valueOf(i18), Integer.valueOf(i19 | num.intValue()));
                }
            }
            i6 = i17 + 1;
            i2 = i16;
        }
        return nil0VarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, nil0[] nil0VarArr) {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = cq91.a;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = cq91.b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] a2 = a(nil0VarArr, bArr3);
                e7a1.j(byteArrayOutputStream, nil0VarArr.length, 1);
                e7a1.j(byteArrayOutputStream, a2.length, 4);
                byte[] f = e7a1.f(a2);
                e7a1.j(byteArrayOutputStream, f.length, 4);
                byteArrayOutputStream.write(f);
                return true;
            }
            byte[] bArr4 = cq91.d;
            if (Arrays.equals(bArr, bArr4)) {
                e7a1.j(byteArrayOutputStream, nil0VarArr.length, 1);
                for (nil0 nil0Var : nil0VarArr) {
                    int size = ((TreeMap) nil0Var.e).size() * 4;
                    String b2 = b((String) nil0Var.b, (String) nil0Var.c, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    e7a1.k(byteArrayOutputStream, b2.getBytes(charset).length);
                    e7a1.k(byteArrayOutputStream, ((int[]) nil0Var.d).length);
                    e7a1.j(byteArrayOutputStream, size, 4);
                    e7a1.j(byteArrayOutputStream, nil0Var.g, 4);
                    byteArrayOutputStream.write(b2.getBytes(charset));
                    Iterator it = ((TreeMap) nil0Var.e).keySet().iterator();
                    while (it.hasNext()) {
                        e7a1.k(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        e7a1.k(byteArrayOutputStream, 0);
                    }
                    for (int i2 : (int[]) nil0Var.d) {
                        e7a1.k(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr5 = cq91.c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] a3 = a(nil0VarArr, bArr5);
                e7a1.j(byteArrayOutputStream, nil0VarArr.length, 1);
                e7a1.j(byteArrayOutputStream, a3.length, 4);
                byte[] f2 = e7a1.f(a3);
                e7a1.j(byteArrayOutputStream, f2.length, 4);
                byteArrayOutputStream.write(f2);
                return true;
            }
            byte[] bArr6 = cq91.e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            e7a1.k(byteArrayOutputStream, nil0VarArr.length);
            for (nil0 nil0Var2 : nil0VarArr) {
                String str = (String) nil0Var2.b;
                TreeMap treeMap = (TreeMap) nil0Var2.e;
                String b3 = b(str, (String) nil0Var2.c, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                e7a1.k(byteArrayOutputStream, b3.getBytes(charset2).length);
                e7a1.k(byteArrayOutputStream, treeMap.size());
                e7a1.k(byteArrayOutputStream, ((int[]) nil0Var2.d).length);
                e7a1.j(byteArrayOutputStream, nil0Var2.g, 4);
                byteArrayOutputStream.write(b3.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    e7a1.k(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i3 : (int[]) nil0Var2.d) {
                    e7a1.k(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            e7a1.k(byteArrayOutputStream2, nil0VarArr.length);
            int i4 = 2;
            int i5 = 2;
            for (nil0 nil0Var3 : nil0VarArr) {
                e7a1.j(byteArrayOutputStream2, nil0Var3.g, 4);
                e7a1.j(byteArrayOutputStream2, nil0Var3.j, 4);
                e7a1.j(byteArrayOutputStream2, nil0Var3.i, 4);
                String b4 = b((String) nil0Var3.b, (String) nil0Var3.c, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = b4.getBytes(charset3).length;
                e7a1.k(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(b4.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            b bVar = new b(FileSectionType.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(bVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            for (int i7 = 0; i7 < nil0VarArr.length; i7++) {
                try {
                    nil0 nil0Var4 = nil0VarArr[i7];
                    e7a1.k(byteArrayOutputStream3, i7);
                    e7a1.k(byteArrayOutputStream3, nil0Var4.f);
                    i6 = i6 + 4 + (nil0Var4.f * i4);
                    int[] iArr = (int[]) nil0Var4.d;
                    int length3 = iArr.length;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < length3) {
                        int i10 = iArr[i8];
                        e7a1.k(byteArrayOutputStream3, i10 - i9);
                        i8++;
                        i4 = i4;
                        i9 = i10;
                    }
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i6 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray2.length);
            }
            b bVar2 = new b(FileSectionType.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(bVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < nil0VarArr.length) {
                try {
                    nil0 nil0Var5 = nil0VarArr[i11];
                    Iterator it3 = ((TreeMap) nil0Var5.e).entrySet().iterator();
                    int i13 = i;
                    while (it3.hasNext()) {
                        i13 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        l(byteArrayOutputStream4, i13, nil0Var5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m(byteArrayOutputStream4, nil0Var5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            e7a1.k(byteArrayOutputStream3, i11);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i14 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            e7a1.j(byteArrayOutputStream3, length4, 4);
                            e7a1.k(byteArrayOutputStream3, i13);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i14 + length4;
                            i11++;
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
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            b bVar3 = new b(FileSectionType.METHODS, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(bVar3);
            long size2 = 12 + (arrayList2.size() * 16);
            e7a1.j(byteArrayOutputStream, arrayList2.size(), 4);
            int i15 = 0;
            while (i15 < arrayList2.size()) {
                b bVar4 = (b) arrayList2.get(i15);
                FileSectionType fileSectionType = bVar4.a;
                byte[] bArr7 = bVar4.b;
                e7a1.j(byteArrayOutputStream, fileSectionType.a(), 4);
                e7a1.j(byteArrayOutputStream, size2, 4);
                if (bVar4.c) {
                    long length5 = bArr7.length;
                    byte[] f3 = e7a1.f(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(f3);
                    e7a1.j(byteArrayOutputStream, f3.length, 4);
                    e7a1.j(byteArrayOutputStream, length5, 4);
                    length = f3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    e7a1.j(byteArrayOutputStream, bArr7.length, 4);
                    e7a1.j(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i15++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i16));
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

    public static void j(ByteArrayOutputStream byteArrayOutputStream, nil0 nil0Var) {
        m(byteArrayOutputStream, nil0Var);
        int i = nil0Var.i;
        int[] iArr = (int[]) nil0Var.d;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            e7a1.k(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : ((TreeMap) nil0Var.e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
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

    public static void k(ByteArrayOutputStream byteArrayOutputStream, nil0 nil0Var, String str) {
        Charset charset = StandardCharsets.UTF_8;
        e7a1.k(byteArrayOutputStream, str.getBytes(charset).length);
        e7a1.k(byteArrayOutputStream, nil0Var.f);
        e7a1.j(byteArrayOutputStream, nil0Var.h, 4);
        e7a1.j(byteArrayOutputStream, nil0Var.g, 4);
        e7a1.j(byteArrayOutputStream, nil0Var.i, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, int i, nil0 nil0Var) {
        int i2 = nil0Var.i;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : ((TreeMap) nil0Var.e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
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

    public static void m(ByteArrayOutputStream byteArrayOutputStream, nil0 nil0Var) {
        int i = 0;
        for (Map.Entry entry : ((TreeMap) nil0Var.e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                e7a1.k(byteArrayOutputStream, intValue - i);
                e7a1.k(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }
}
