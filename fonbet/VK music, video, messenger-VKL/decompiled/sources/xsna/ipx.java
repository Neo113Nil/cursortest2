package xsna;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import xsna.e600;

/* compiled from: Ints.java */
/* loaded from: classes13.dex */
public final class ipx extends czi {

    /* compiled from: Ints.java */
    public static class a extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final int[] array;
        final int end;
        final int start;

        public a(int i, int i2, int[] iArr) {
            this.array = iArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return ipx.v(((Integer) obj).intValue(), this.start, this.end, this.array) != -1;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != aVar.array[aVar.start + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            fxc0.s(i, size());
            return Integer.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int i = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                i = (i * 31) + this.array[i2];
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            int v = ipx.v(((Integer) obj).intValue(), this.start, this.end, this.array);
            if (v >= 0) {
                return v - this.start;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.array;
                int intValue = ((Integer) obj).intValue();
                int i = this.start;
                int i2 = this.end - 1;
                while (true) {
                    if (i2 < i) {
                        i2 = -1;
                        break;
                    }
                    if (iArr[i2] == intValue) {
                        break;
                    }
                    i2--;
                }
                if (i2 >= 0) {
                    return i2 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i, Object obj) {
            Integer num = (Integer) obj;
            fxc0.s(i, size());
            int[] iArr = this.array;
            int i2 = this.start + i;
            int i3 = iArr[i2];
            num.getClass();
            iArr[i2] = num.intValue();
            return Integer.valueOf(i3);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Integer> subList(int i, int i2) {
            fxc0.w(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            int[] iArr = this.array;
            int i3 = this.start;
            return new a(i + i3, i3 + i2, iArr);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i >= this.end) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.array[i]);
            }
        }
    }

    public static List<Integer> r(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new a(0, iArr.length, iArr);
    }

    public static int s(long j) {
        int i = (int) j;
        fxc0.n(j, "Out of range: %s", ((long) i) == j);
        return i;
    }

    public static int t(byte[] bArr) {
        fxc0.k(bArr.length, 4, "array too small: %s < %s", bArr.length >= 4);
        return u(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int u(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int v(int i, int i2, int i3, int[] iArr) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int w(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int[] x(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            a aVar = (a) collection;
            return Arrays.copyOfRange(aVar.array, aVar.start, aVar.end);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static byte[] y(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Integer z(String str) {
        byte b;
        Integer num;
        Long l;
        byte b2;
        str.getClass();
        if (!str.isEmpty()) {
            int i = str.charAt(0) == '-' ? 1 : 0;
            if (i != str.length()) {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    b = e600.a.a[charAt];
                } else {
                    byte[] bArr = e600.a.a;
                    b = -1;
                }
                if (b >= 0 && b < 10) {
                    long j = -b;
                    long j2 = 10;
                    long j3 = Long.MIN_VALUE / j2;
                    while (true) {
                        if (i2 < str.length()) {
                            int i3 = i2 + 1;
                            char charAt2 = str.charAt(i2);
                            if (charAt2 < 128) {
                                b2 = e600.a.a[charAt2];
                            } else {
                                byte[] bArr2 = e600.a.a;
                                b2 = -1;
                            }
                            if (b2 < 0 || b2 >= 10 || j < j3) {
                                break;
                            }
                            long j4 = j * j2;
                            num = null;
                            long j5 = b2;
                            if (j4 < j5 - Long.MIN_VALUE) {
                                break;
                            }
                            j = j4 - j5;
                            i2 = i3;
                        } else {
                            num = null;
                            if (i != 0) {
                                l = Long.valueOf(j);
                            } else if (j != Long.MIN_VALUE) {
                                l = Long.valueOf(-j);
                            }
                        }
                    }
                }
                num = null;
                l = num;
                return (l == 0 && l.longValue() == ((long) l.intValue())) ? Integer.valueOf(l.intValue()) : num;
            }
        }
        l = 0;
        num = null;
        if (l == 0) {
        }
    }
}
