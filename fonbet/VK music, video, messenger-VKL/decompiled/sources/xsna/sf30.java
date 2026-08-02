package xsna;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: Mp4Box.java */
/* loaded from: classes12.dex */
public abstract class sf30 {
    public final int a;

    /* compiled from: Mp4Box.java */
    public static final class a extends sf30 {
        public final long b;
        public final ArrayList c;
        public final ArrayList d;

        public a(int i, long j) {
            super(i);
            this.b = j;
            this.c = new ArrayList();
            this.d = new ArrayList();
        }

        @Nullable
        public final a b(int i) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = (a) arrayList.get(i2);
                if (aVar.a == i) {
                    return aVar;
                }
            }
            return null;
        }

        @Nullable
        public final b c(int i) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = (b) arrayList.get(i2);
                if (bVar.a == i) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // xsna.sf30
        public final String toString() {
            return sf30.a(this.a) + " leaves: " + Arrays.toString(this.c.toArray()) + " containers: " + Arrays.toString(this.d.toArray());
        }
    }

    /* compiled from: Mp4Box.java */
    public static final class b extends sf30 {
        public final xi90 b;

        public b(int i, xi90 xi90Var) {
            super(i);
            this.b = xi90Var;
        }
    }

    public sf30(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public String toString() {
        return a(this.a);
    }
}
