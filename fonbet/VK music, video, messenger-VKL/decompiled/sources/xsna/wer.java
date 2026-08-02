package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.BitSet;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.function.BiConsumer;

/* compiled from: FilteredAttributes.java */
/* loaded from: classes8.dex */
public abstract class wer implements q94 {
    public final Object[] b;
    public final int c;
    public final int d;

    /* compiled from: FilteredAttributes.java */
    public static class a extends wer {
        public final BitSet e;

        public a(Object[] objArr, int i, int i2, BitSet bitSet) {
            super(objArr, i, i2);
            this.e = bitSet;
        }

        @Override // xsna.wer
        public final boolean a(int i) {
            return !this.e.get(i / 2);
        }
    }

    /* compiled from: FilteredAttributes.java */
    public static class b extends wer {
        public final int e;

        public b(Object[] objArr, int i, int i2, int i3) {
            super(objArr, i, i2);
            this.e = i3;
        }

        @Override // xsna.wer
        public final boolean a(int i) {
            return ((1 << (i / 2)) & this.e) == 0;
        }
    }

    public wer(Object[] objArr, int i, int i2) {
        this.b = objArr;
        this.c = i;
        this.d = i2;
    }

    public abstract boolean a(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof wer)) {
            wer werVar = (wer) obj;
            Object[] objArr = werVar.b;
            if (this.d != werVar.d) {
                return false;
            }
            int i = 0;
            int i2 = 0;
            while (true) {
                Object[] objArr2 = this.b;
                boolean z = i >= objArr2.length;
                boolean z2 = i2 >= objArr.length;
                if (z || a(i)) {
                    if (z2 || werVar.a(i2)) {
                        if (!z || !z2) {
                            if (z != z2 || !Objects.equals(objArr2[i], objArr[i2]) || !Objects.equals(objArr2[i + 1], objArr[i2 + 1])) {
                                break;
                            }
                            i += 2;
                        } else {
                            return true;
                        }
                    }
                    i2 += 2;
                } else {
                    i += 2;
                }
            }
        }
        return false;
    }

    @Override // xsna.q94
    public final void forEach(BiConsumer<? super i94<?>, ? super Object> biConsumer) {
        int i = 0;
        while (true) {
            Object[] objArr = this.b;
            if (i >= objArr.length) {
                return;
            }
            if (a(i)) {
                biConsumer.accept((i94) objArr[i], objArr[i + 1]);
            }
            i += 2;
        }
    }

    public final int hashCode() {
        return this.c;
    }

    @Override // xsna.q94
    public final Map<i94<?>, Object> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.d);
        int i = 0;
        while (true) {
            Object[] objArr = this.b;
            if (i >= objArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (a(i)) {
                linkedHashMap.put((i94) objArr[i], objArr[i + 1]);
            }
            i += 2;
        }
    }

    @Override // xsna.q94
    public final boolean isEmpty() {
        return false;
    }

    @Override // xsna.q94
    public final int size() {
        return this.d;
    }

    @Override // xsna.q94
    public final lk3 toBuilder() {
        lk3 lk3Var = new lk3();
        int i = 0;
        while (true) {
            Object[] objArr = this.b;
            if (i >= objArr.length) {
                return lk3Var;
            }
            if (a(i)) {
                lk3Var.f((i94) objArr[i], objArr[i + 1]);
            }
            i += 2;
        }
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(StringUtils.COMMA, "FilteredAttributes{", "}");
        int i = 0;
        while (true) {
            Object[] objArr = this.b;
            if (i >= objArr.length) {
                return stringJoiner.toString();
            }
            if (a(i)) {
                stringJoiner.add(((i94) objArr[i]).getKey() + "=" + objArr[i + 1]);
            }
            i += 2;
        }
    }
}
