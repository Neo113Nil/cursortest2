package ru.ok.android.sdk.api.config;

import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.lang.Comparable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import xsna.h5s;

/* loaded from: classes9.dex */
class SimpleSnapshotMap<K extends Comparable<K>, V> {
    private static final SimpleSnapshotMap EMPTY;
    private final K[] keys;
    public final int size;
    private final V[] values;

    static {
        Comparable[] comparableArr = new Comparable[0];
        EMPTY = new SimpleSnapshotMap(comparableArr, comparableArr);
    }

    private SimpleSnapshotMap(K[] kArr, V[] vArr) {
        if (kArr.length == vArr.length) {
            this.keys = kArr;
            this.values = vArr;
            this.size = kArr.length;
        } else {
            StringBuilder sb = new StringBuilder("different array sizes: ");
            sb.append(kArr.length);
            sb.append(" keys and ");
            throw new IllegalArgumentException(h5s.c(vArr.length, " values", sb));
        }
    }

    public static <K extends Comparable<K>, V> SimpleSnapshotMap<K, V> empty() {
        return EMPTY;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleSnapshotMap)) {
            return false;
        }
        SimpleSnapshotMap simpleSnapshotMap = (SimpleSnapshotMap) obj;
        return simpleSnapshotMap.size == this.size && Arrays.equals(simpleSnapshotMap.keys, this.keys) && Arrays.equals(simpleSnapshotMap.values, this.values);
    }

    @Nullable
    public V get(K k) {
        int binarySearch = Arrays.binarySearch(this.keys, k);
        if (binarySearch < 0) {
            return null;
        }
        return this.values[binarySearch];
    }

    public int hashCode() {
        return (Arrays.hashCode(this.values) * 31) + Arrays.hashCode(this.keys);
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(X3.j.d);
        for (int i = 0; i < this.size; i++) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append("{");
            sb.append(this.keys[i]);
            sb.append(" : ");
            sb.append(this.values[i]);
            sb.append('}');
        }
        sb.append(']');
        return sb.toString();
    }

    @CheckResult
    public SimpleSnapshotMap<K, V> with(K k, V v) {
        K[] kArr = this.keys;
        V[] vArr = this.values;
        int binarySearch = Arrays.binarySearch(kArr, k);
        if (binarySearch >= 0) {
            if (Objects.equals(vArr[binarySearch], v)) {
                return this;
            }
            Object[] copyOf = Arrays.copyOf(vArr, vArr.length);
            copyOf[binarySearch] = v;
            return new SimpleSnapshotMap<>(kArr, copyOf);
        }
        int i = -binarySearch;
        int i2 = i - 1;
        Comparable[] comparableArr = (Comparable[]) Array.newInstance(kArr.getClass().getComponentType(), this.size + 1);
        Object[] objArr = (Object[]) Array.newInstance(vArr.getClass().getComponentType(), this.size + 1);
        System.arraycopy(kArr, 0, comparableArr, 0, i2);
        comparableArr[i2] = k;
        System.arraycopy(kArr, i2, comparableArr, i, kArr.length - i2);
        System.arraycopy(vArr, 0, objArr, 0, i2);
        objArr[i2] = v;
        System.arraycopy(vArr, i2, objArr, i, vArr.length - i2);
        return new SimpleSnapshotMap<>(comparableArr, objArr);
    }

    @CheckResult
    public SimpleSnapshotMap<K, V> without(K k) {
        K[] kArr = this.keys;
        V[] vArr = this.values;
        int binarySearch = Arrays.binarySearch(kArr, k);
        if (binarySearch < 0) {
            return this;
        }
        if (this.size == 1) {
            return empty();
        }
        Comparable[] comparableArr = (Comparable[]) Array.newInstance(kArr.getClass().getComponentType(), this.size - 1);
        Object[] objArr = (Object[]) Array.newInstance(vArr.getClass().getComponentType(), this.size - 1);
        System.arraycopy(kArr, 0, comparableArr, 0, binarySearch);
        int i = binarySearch + 1;
        System.arraycopy(kArr, i, comparableArr, binarySearch, (this.size - binarySearch) - 1);
        System.arraycopy(vArr, 0, objArr, 0, binarySearch);
        System.arraycopy(vArr, i, objArr, binarySearch, (this.size - binarySearch) - 1);
        return new SimpleSnapshotMap<>(comparableArr, objArr);
    }
}
