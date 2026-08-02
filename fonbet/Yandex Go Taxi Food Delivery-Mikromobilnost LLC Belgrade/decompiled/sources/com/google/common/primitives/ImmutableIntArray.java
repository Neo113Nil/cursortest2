package com.google.common.primitives;

import defpackage.ffx;
import java.io.Serializable;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class ImmutableIntArray implements Serializable {
    public static final ImmutableIntArray a = new ImmutableIntArray(new int[0]);
    private final int[] array;
    private final int end;

    public ImmutableIntArray(int[] iArr) {
        int length = iArr.length;
        this.array = iArr;
        this.end = length;
    }

    public static ImmutableIntArray b(int i, int i2) {
        return new ImmutableIntArray(new int[]{i, i2});
    }

    public final int a(int i) {
        ffx.n(i, this.end);
        return this.array[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableIntArray) {
            ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
            if (this.end == immutableIntArray.end) {
                for (int i = 0; i < this.end; i++) {
                    if (a(i) == immutableIntArray.a(i)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.end; i2++) {
            i = (i * 31) + Integer.hashCode(this.array[i2]);
        }
        return i;
    }

    public Object readResolve() {
        return this.end == 0 ? a : this;
    }

    public final String toString() {
        int i = this.end;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        sb.append(this.array[0]);
        for (int i2 = 1; i2 < this.end; i2++) {
            sb.append(Extension.FIX_SPACE);
            sb.append(this.array[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public Object writeReplace() {
        int i = this.end;
        int[] iArr = this.array;
        return i < iArr.length ? new ImmutableIntArray(Arrays.copyOfRange(iArr, 0, i)) : this;
    }
}
