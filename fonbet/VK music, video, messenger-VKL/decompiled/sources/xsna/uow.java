package xsna;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.BiConsumer;

/* compiled from: ImmutableKeyValuePairs.java */
/* loaded from: classes11.dex */
public abstract class uow<K, V> {
    public final Object[] b;
    public int c;

    public uow() {
        throw null;
    }

    public uow(Object[] objArr) {
        this.b = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if ((r3 == null ? r4 == null ? 0 : -1 : r4 == null ? 1 : r9.compare(r3, r4)) <= 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Object[] objArr, int i, int i2, Object[] objArr2, Comparator<?> comparator) {
        if (i2 - i <= 2) {
            return;
        }
        int i3 = ((i2 + i) / 4) * 2;
        a(objArr2, i, i3, objArr, comparator);
        a(objArr2, i3, i2, objArr, comparator);
        int i4 = i;
        int i5 = i3;
        while (i < i2) {
            if (i4 < i3 - 1) {
                if (i5 < i2 - 1) {
                    Object obj = objArr[i4];
                    Object obj2 = objArr[i5];
                }
                objArr2[i] = objArr[i4];
                objArr2[i + 1] = objArr[i4 + 1];
                i4 += 2;
                i += 2;
            }
            objArr2[i] = objArr[i5];
            objArr2[i + 1] = objArr[i5 + 1];
            i5 += 2;
            i += 2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uow) {
            return Arrays.equals(this.b, ((uow) obj).b);
        }
        return false;
    }

    public final void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        if (biConsumer == null) {
            return;
        }
        int i = 0;
        while (true) {
            Object[] objArr = this.b;
            if (i >= objArr.length) {
                return;
            }
            biConsumer.accept(objArr[i], objArr[i + 1]);
            i += 2;
        }
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.b) ^ 1000003;
        this.c = hashCode;
        return hashCode;
    }

    public final Map<K, V> i() {
        return g7f0.b(Arrays.asList(this.b));
    }

    public final boolean isEmpty() {
        return this.b.length == 0;
    }

    public final int size() {
        return this.b.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        while (true) {
            Object[] objArr = this.b;
            if (i >= objArr.length) {
                break;
            }
            Object obj = objArr[i + 1];
            String a = obj instanceof String ? ho8.a(new StringBuilder("\""), (String) obj, '\"') : obj.toString();
            sb.append(objArr[i]);
            sb.append("=");
            sb.append(a);
            sb.append(", ");
            i += 2;
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("}");
        return sb.toString();
    }
}
