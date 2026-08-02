package xsna;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import com.fasterxml.jackson.core.util.InternCache;
import java.io.IOException;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CharsToNameCanonicalizer.java */
/* loaded from: classes12.dex */
public final class cmb {
    public final cmb a;
    public final AtomicReference<b> b;
    public final int c;
    public final int d;
    public boolean e;
    public String[] f;
    public a[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public BitSet m;

    /* compiled from: CharsToNameCanonicalizer.java */
    public static final class a {
        public final String a;
        public final a b;
        public final int c;

        public a(String str, a aVar) {
            this.a = str;
            this.b = aVar;
            this.c = aVar != null ? 1 + aVar.c : 1;
        }
    }

    public cmb(int i) {
        this.a = null;
        this.c = i;
        this.e = true;
        this.d = -1;
        this.l = false;
        this.k = 0;
        this.b = new AtomicReference<>(new b(new String[64], new a[32]));
    }

    public final int a(int i) {
        int i2 = i + (i >>> 15);
        int i3 = i2 ^ (i2 << 7);
        return (i3 + (i3 >>> 3)) & this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String b(int i, int i2, char[] cArr, int i3) throws IOException {
        int i4;
        int i5;
        JsonFactory.Feature feature;
        int i6;
        String[] strArr;
        String str;
        int i7 = 1;
        if (i2 < 1) {
            return "";
        }
        if (!this.e) {
            return new String(cArr, i, i2);
        }
        int a2 = a(i3);
        String str2 = this.f[a2];
        int i8 = 0;
        if (str2 != null) {
            if (str2.length() == i2) {
                int i9 = 0;
                while (str2.charAt(i9) == cArr[i + i9]) {
                    i9++;
                    if (i9 == i2) {
                        return str2;
                    }
                }
            }
            a aVar = this.g[a2 >> 1];
            if (aVar != null) {
                String str3 = aVar.a;
                if (str3.length() == i2) {
                    int i10 = 0;
                    while (str3.charAt(i10) == cArr[i + i10]) {
                        i10++;
                        if (i10 >= i2) {
                            break;
                        }
                    }
                }
                str3 = null;
                if (str3 != null) {
                    return str3;
                }
                a aVar2 = aVar.b;
                while (true) {
                    if (aVar2 == null) {
                        str = null;
                        break;
                    }
                    str = aVar2.a;
                    if (str.length() == i2) {
                        int i11 = 0;
                        while (str.charAt(i11) == cArr[i + i11]) {
                            i11++;
                            if (i11 >= i2) {
                                break;
                            }
                        }
                    }
                    str = null;
                    if (str != null) {
                        break;
                    }
                    aVar2 = aVar2.b;
                }
                if (str != null) {
                    return str;
                }
            }
        }
        if (this.l) {
            String[] strArr2 = this.f;
            this.f = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            a[] aVarArr = this.g;
            this.g = (a[]) Arrays.copyOf(aVarArr, aVarArr.length);
            this.l = false;
        } else if (this.h >= this.i) {
            String[] strArr3 = this.f;
            int length = strArr3.length;
            int i12 = length + length;
            int i13 = this.c;
            if (i12 > 65536) {
                this.h = 0;
                this.e = false;
                this.f = new String[64];
                this.g = new a[32];
                this.j = 63;
                this.l = false;
                i4 = 1;
            } else {
                a[] aVarArr2 = this.g;
                this.f = new String[i12];
                this.g = new a[i12 >> 1];
                this.j = i12 - 1;
                this.i = i12 - (i12 >> 2);
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (i14 < length) {
                    String str4 = strArr3[i14];
                    if (str4 != null) {
                        i15++;
                        int length2 = str4.length();
                        i5 = i7;
                        int i17 = i13;
                        for (int i18 = i8; i18 < length2; i18++) {
                            i17 = str4.charAt(i18) + (i17 * 33);
                        }
                        int a3 = a(i17 == 0 ? i5 : i17);
                        String[] strArr4 = this.f;
                        if (strArr4[a3] == null) {
                            strArr4[a3] = str4;
                        } else {
                            int i19 = a3 >> 1;
                            a[] aVarArr3 = this.g;
                            a aVar3 = new a(str4, aVarArr3[i19]);
                            aVarArr3[i19] = aVar3;
                            i16 = Math.max(i16, aVar3.c);
                        }
                    } else {
                        i5 = i7;
                    }
                    i14++;
                    i7 = i5;
                    i8 = 0;
                }
                i4 = i7;
                int i20 = length >> 1;
                for (int i21 = 0; i21 < i20; i21++) {
                    for (a aVar4 = aVarArr2[i21]; aVar4 != null; aVar4 = aVar4.b) {
                        i15++;
                        String str5 = aVar4.a;
                        int length3 = str5.length();
                        int i22 = i13;
                        for (int i23 = 0; i23 < length3; i23++) {
                            i22 = (i22 * 33) + str5.charAt(i23);
                        }
                        if (i22 == 0) {
                            i22 = i4;
                        }
                        int a4 = a(i22);
                        String[] strArr5 = this.f;
                        if (strArr5[a4] == null) {
                            strArr5[a4] = str5;
                        } else {
                            int i24 = a4 >> 1;
                            a[] aVarArr4 = this.g;
                            a aVar5 = new a(str5, aVarArr4[i24]);
                            aVarArr4[i24] = aVar5;
                            i16 = Math.max(i16, aVar5.c);
                        }
                    }
                }
                this.k = i16;
                this.m = null;
                if (i15 != this.h) {
                    throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", Integer.valueOf(this.h), Integer.valueOf(i15)));
                }
            }
            int i25 = i + i2;
            for (int i26 = i; i26 < i25; i26++) {
                i13 = (i13 * 33) + cArr[i26];
            }
            if (i13 == 0) {
                i13 = i4;
            }
            a2 = a(i13);
            String str6 = new String(cArr, i, i2);
            feature = JsonFactory.Feature.INTERN_FIELD_NAMES;
            i6 = this.d;
            if (feature.k(i6)) {
                str6 = InternCache.b.a(str6);
            }
            this.h++;
            strArr = this.f;
            if (strArr[a2] != null) {
                strArr[a2] = str6;
                return str6;
            }
            int i27 = a2 >> 1;
            a[] aVarArr5 = this.g;
            a aVar6 = new a(str6, aVarArr5[i27]);
            int i28 = aVar6.c;
            if (i28 <= 150) {
                aVarArr5[i27] = aVar6;
                this.k = Math.max(i28, this.k);
                return str6;
            }
            BitSet bitSet = this.m;
            if (bitSet == null) {
                BitSet bitSet2 = new BitSet();
                this.m = bitSet2;
                bitSet2.set(i27);
            } else if (!bitSet.get(i27)) {
                this.m.set(i27);
            } else {
                if (JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.k(i6)) {
                    throw new StreamConstraintsException(h5s.c(this.h, ") now exceeds maximum, 150 -- suspect a DoS attack based on hash collisions", new StringBuilder("Longest collision chain in symbol table (of size ")));
                }
                this.e = false;
            }
            this.f[a2] = str6;
            this.g[i27] = null;
            this.h -= i28;
            this.k = -1;
            return str6;
        }
        String str62 = new String(cArr, i, i2);
        feature = JsonFactory.Feature.INTERN_FIELD_NAMES;
        i6 = this.d;
        if (feature.k(i6)) {
        }
        this.h++;
        strArr = this.f;
        if (strArr[a2] != null) {
        }
    }

    /* compiled from: CharsToNameCanonicalizer.java */
    public static final class b {
        public final int a;
        public final int b;
        public final String[] c;
        public final a[] d;

        public b(String[] strArr, a[] aVarArr) {
            this.a = 0;
            this.b = 0;
            this.c = strArr;
            this.d = aVarArr;
        }

        public b(cmb cmbVar) {
            this.a = cmbVar.h;
            this.b = cmbVar.k;
            this.c = cmbVar.f;
            this.d = cmbVar.g;
        }
    }

    public cmb(cmb cmbVar, int i, int i2, b bVar) {
        this.a = cmbVar;
        this.c = i2;
        this.b = null;
        this.d = i;
        this.e = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.k(i);
        String[] strArr = bVar.c;
        this.f = strArr;
        this.g = bVar.d;
        this.h = bVar.a;
        this.k = bVar.b;
        int length = strArr.length;
        this.i = length - (length >> 2);
        this.j = length - 1;
        this.l = true;
    }
}
