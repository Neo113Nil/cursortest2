package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import defpackage.ffx;
import defpackage.h221;
import defpackage.vng;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    private static final long serialVersionUID = 0;
    public static final ImmutableMap z = new RegularImmutableMap(0, null, new Object[0]);
    public final transient Object w;
    public final transient Object[] x;
    public final transient int y;

    /* loaded from: classes11.dex */
    public static final class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        public final transient ImmutableMap w;
        public final transient Object[] x;
        public final transient int y;

        public EntrySet(ImmutableMap immutableMap, Object[] objArr, int i) {
            this.w = immutableMap;
            this.x = objArr;
            this.y = i;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int b(int i, Object[] objArr) {
            return a().b(i, objArr);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.w.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean i() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: j */
        public final h221 iterator() {
            return a().listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableSet
        public final ImmutableList p() {
            return new ImmutableList<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // java.util.List
                public final Object get(int i) {
                    ffx.n(i, EntrySet.this.y);
                    int i2 = i * 2;
                    Object obj = EntrySet.this.x[i2];
                    Objects.requireNonNull(obj);
                    Object obj2 = EntrySet.this.x[i2 + 1];
                    Objects.requireNonNull(obj2);
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override // com.google.common.collect.ImmutableCollection
                public final boolean i() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
                    return EntrySet.this.y;
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.y;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class KeySet<K> extends ImmutableSet<K> {
        public final transient ImmutableMap w;
        public final transient ImmutableList x;

        public KeySet(ImmutableMap immutableMap, ImmutableList immutableList) {
            this.w = immutableMap;
            this.x = immutableList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public final ImmutableList a() {
            return this.x;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int b(int i, Object[] objArr) {
            return this.x.b(i, objArr);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.w.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean i() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: j */
        public final h221 iterator() {
            return this.x.listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.w.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class KeysOrValuesAsList extends ImmutableList<Object> {
        public final transient Object[] c;
        public final transient int w;
        public final transient int x;

        public KeysOrValuesAsList(int i, int i2, Object[] objArr) {
            this.c = objArr;
            this.w = i;
            this.x = i2;
        }

        @Override // java.util.List
        public final Object get(int i) {
            ffx.n(i, this.x);
            Object obj = this.c[(i * 2) + this.w];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.x;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public RegularImmutableMap(int i, Object obj, Object[] objArr) {
        this.w = obj;
        this.x = objArr;
        this.y = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x019b  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static RegularImmutableMap m(int i, Object[] objArr, ImmutableMap.a aVar) {
        boolean z2;
        int i2;
        char c;
        Object obj;
        char c2;
        short[] sArr;
        boolean z3;
        int i3;
        ?? r16;
        boolean z4;
        boolean z5;
        int i4 = i;
        Object[] objArr2 = objArr;
        if (i4 == 0) {
            return (RegularImmutableMap) z;
        }
        Object obj2 = null;
        boolean z6 = false;
        int i5 = 1;
        if (i4 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new RegularImmutableMap(1, null, objArr2);
        }
        ffx.p(i4, objArr2.length >> 1);
        int k = ImmutableSet.k(i4);
        char c3 = 2;
        if (i4 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            z5 = false;
            i2 = 1;
        } else {
            int i6 = k - 1;
            if (k <= 128) {
                byte[] bArr = new byte[k];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i7 * 2;
                    int i10 = i8 * 2;
                    Object obj3 = objArr2[i9];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i9 ^ i5];
                    Objects.requireNonNull(obj4);
                    int F = vng.F(obj3.hashCode());
                    while (true) {
                        int i11 = F & i6;
                        z3 = z6;
                        i3 = i5;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i10;
                            if (i8 < i7) {
                                objArr2[i10] = obj3;
                                objArr2[i10 ^ 1] = obj4;
                            }
                            i8++;
                        } else {
                            if (obj3.equals(objArr2[i12])) {
                                int i13 = i12 ^ 1;
                                Object obj5 = objArr2[i13];
                                Objects.requireNonNull(obj5);
                                obj2 = new r(obj3, obj4, obj5);
                                objArr2[i13] = obj4;
                                break;
                            }
                            F = i11 + 1;
                            z6 = z3;
                            i5 = i3;
                        }
                    }
                    i7++;
                    z6 = z3;
                    i5 = i3;
                }
                z2 = z6;
                i2 = i5;
                if (i8 == i4) {
                    obj2 = bArr;
                    z5 = z2;
                } else {
                    sArr = new Object[3];
                    sArr[z2 ? 1 : 0] = bArr;
                    sArr[i2] = Integer.valueOf(i8);
                    sArr[2] = obj2;
                    obj2 = sArr;
                    z5 = z2;
                }
            } else {
                z2 = false;
                i2 = 1;
                if (k > 32768) {
                    int[] iArr = new int[k];
                    Arrays.fill(iArr, -1);
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < i4) {
                        int i16 = i14 * 2;
                        int i17 = i15 * 2;
                        Object obj6 = objArr2[i16];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArr2[i16 ^ 1];
                        Objects.requireNonNull(obj7);
                        int F2 = vng.F(obj6.hashCode());
                        while (true) {
                            int i18 = F2 & i6;
                            int i19 = iArr[i18];
                            if (i19 == -1) {
                                iArr[i18] = i17;
                                if (i15 < i14) {
                                    objArr2[i17] = obj6;
                                    objArr2[i17 ^ 1] = obj7;
                                }
                                i15++;
                                c2 = c3;
                            } else {
                                c2 = c3;
                                if (obj6.equals(objArr2[i19])) {
                                    int i20 = i19 ^ 1;
                                    Object obj8 = objArr2[i20];
                                    Objects.requireNonNull(obj8);
                                    obj2 = new r(obj6, obj7, obj8);
                                    objArr2[i20] = obj7;
                                    break;
                                }
                                F2 = i18 + 1;
                                c3 = c2;
                            }
                        }
                        i14++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i15 == i4) {
                        obj = iArr;
                        r16 = z2;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i15);
                        objArr3[c] = obj2;
                        obj = objArr3;
                        r16 = z2;
                    }
                    z4 = obj instanceof Object[];
                    Object obj9 = obj;
                    if (z4) {
                        Object[] objArr4 = (Object[]) obj;
                        r rVar = (r) objArr4[c];
                        if (aVar == null) {
                            throw rVar.a();
                        }
                        aVar.c = rVar;
                        Object obj10 = objArr4[r16];
                        int intValue = ((Integer) objArr4[i2]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue * 2);
                        obj9 = obj10;
                        i4 = intValue;
                    }
                    return new RegularImmutableMap(i4, obj9, objArr2);
                }
                sArr = new short[k];
                Arrays.fill(sArr, (short) -1);
                int i21 = 0;
                for (int i22 = 0; i22 < i4; i22++) {
                    int i23 = i22 * 2;
                    int i24 = i21 * 2;
                    Object obj11 = objArr2[i23];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i23 ^ 1];
                    Objects.requireNonNull(obj12);
                    int F3 = vng.F(obj11.hashCode());
                    while (true) {
                        int i25 = F3 & i6;
                        int i26 = sArr[i25] & 65535;
                        if (i26 == 65535) {
                            sArr[i25] = (short) i24;
                            if (i21 < i22) {
                                objArr2[i24] = obj11;
                                objArr2[i24 ^ 1] = obj12;
                            }
                            i21++;
                        } else {
                            if (obj11.equals(objArr2[i26])) {
                                int i27 = i26 ^ 1;
                                Object obj13 = objArr2[i27];
                                Objects.requireNonNull(obj13);
                                obj2 = new r(obj11, obj12, obj13);
                                objArr2[i27] = obj12;
                                break;
                            }
                            F3 = i25 + 1;
                        }
                    }
                }
                if (i21 != i4) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i21), obj2};
                    z5 = z2;
                }
                obj2 = sArr;
                z5 = z2;
            }
        }
        c = 2;
        obj = obj2;
        r16 = z5;
        z4 = obj instanceof Object[];
        Object obj92 = obj;
        if (z4) {
        }
        return new RegularImmutableMap(i4, obj92, objArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            Object[] objArr = this.x;
            if (this.y == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.w;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int F = vng.F(obj.hashCode());
                        while (true) {
                            int i = F & length;
                            int i2 = bArr[i] & 255;
                            if (i2 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i2])) {
                                obj2 = objArr[i2 ^ 1];
                                break;
                            }
                            F = i + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int F2 = vng.F(obj.hashCode());
                        while (true) {
                            int i3 = F2 & length2;
                            int i4 = sArr[i3] & 65535;
                            if (i4 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[i4])) {
                                obj2 = objArr[i4 ^ 1];
                                break;
                            }
                            F2 = i3 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int F3 = vng.F(obj.hashCode());
                        while (true) {
                            int i5 = F3 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            F3 = i5 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.y;
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return super.writeReplace();
    }
}
