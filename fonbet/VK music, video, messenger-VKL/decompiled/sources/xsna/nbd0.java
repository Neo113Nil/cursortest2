package xsna;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PrimitiveSet.java */
/* loaded from: classes.dex */
public final class nbd0<P> {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public a<P> b;
    public final Class<P> c;

    /* compiled from: PrimitiveSet.java */
    public static final class a<P> {
        public final P a;
        public final byte[] b;
        public final KeyStatusType c;
        public final OutputPrefixType d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, byte[] bArr, KeyStatusType keyStatusType, OutputPrefixType outputPrefixType) {
            this.a = obj;
            this.b = Arrays.copyOf(bArr, bArr.length);
            this.c = keyStatusType;
            this.d = outputPrefixType;
        }

        public final byte[] a() {
            byte[] bArr = this.b;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }
    }

    /* compiled from: PrimitiveSet.java */
    public static class b implements Comparable<b> {
        public final byte[] b;

        public b(byte[] bArr) {
            this.b = Arrays.copyOf(bArr, bArr.length);
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            byte[] bArr = this.b;
            int length = bArr.length;
            byte[] bArr2 = bVar2.b;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                byte b2 = bVar2.b[i];
                if (b != b2) {
                    return b - b2;
                }
            }
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return Arrays.equals(this.b, ((b) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.b);
        }

        public final String toString() {
            return g2v.b(this.b);
        }
    }

    public nbd0(Class<P> cls) {
        this.c = cls;
    }

    public final List<a<P>> a(byte[] bArr) {
        List<a<P>> list = (List) this.a.get(new b(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }
}
