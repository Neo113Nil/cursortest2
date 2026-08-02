package xsna;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: TrackOutput.java */
/* loaded from: classes12.dex */
public interface rgp0 {

    /* compiled from: TrackOutput.java */
    public static final class a {
        public final int a;
        public final byte[] b;
        public final int c;
        public final int d;

        public a(int i, byte[] bArr, int i2, int i3) {
            this.a = i;
            this.b = bArr;
            this.c = i2;
            this.d = i3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.c == aVar.c && this.d == aVar.d && Arrays.equals(this.b, aVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
        }
    }

    void a(long j, int i, int i2, int i3, @Nullable a aVar);

    void b(xi90 xi90Var, int i, int i2);

    void c(androidx.media3.common.a aVar);

    default void d(int i, xi90 xi90Var) {
        b(xi90Var, i, 0);
    }

    int f(suk sukVar, int i, boolean z) throws IOException;

    default int g(suk sukVar, int i, boolean z) throws IOException {
        return f(sukVar, i, z);
    }

    default void e(long j) {
    }
}
