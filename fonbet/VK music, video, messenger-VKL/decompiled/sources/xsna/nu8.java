package xsna;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Bytes.java */
/* loaded from: classes13.dex */
public final class nu8 {

    /* compiled from: Bytes.java */
    public static class a extends AbstractList<Byte> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final byte[] array;
        final int end;
        final int start;

        public a(byte[] bArr, int i, int i2) {
            this.array = bArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (!(obj instanceof Byte)) {
                return false;
            }
            byte[] bArr = this.array;
            byte byteValue = ((Byte) obj).byteValue();
            int i = this.start;
            int i2 = this.end;
            while (true) {
                if (i >= i2) {
                    i = -1;
                    break;
                }
                if (bArr[i] == byteValue) {
                    break;
                }
                i++;
            }
            return i != -1;
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
            return Byte.valueOf(this.array[this.start + i]);
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
            if (obj instanceof Byte) {
                byte[] bArr = this.array;
                byte byteValue = ((Byte) obj).byteValue();
                int i = this.start;
                int i2 = this.end;
                while (true) {
                    if (i >= i2) {
                        i = -1;
                        break;
                    }
                    if (bArr[i] == byteValue) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    return i - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                byte[] bArr = this.array;
                byte byteValue = ((Byte) obj).byteValue();
                int i = this.start;
                int i2 = this.end - 1;
                while (true) {
                    if (i2 < i) {
                        i2 = -1;
                        break;
                    }
                    if (bArr[i2] == byteValue) {
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
            Byte b = (Byte) obj;
            fxc0.s(i, size());
            byte[] bArr = this.array;
            int i2 = this.start + i;
            byte b2 = bArr[i2];
            b.getClass();
            bArr[i2] = b.byteValue();
            return Byte.valueOf(b2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Byte> subList(int i, int i2) {
            fxc0.w(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            byte[] bArr = this.array;
            int i3 = this.start;
            return new a(bArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append((int) this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i >= this.end) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append((int) this.array[i]);
            }
        }
    }
}
