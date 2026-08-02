package xsna;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.source.i;
import java.io.IOException;
import java.util.Objects;
import xsna.jza0;

/* compiled from: AnalyticsListener.java */
/* loaded from: classes12.dex */
public interface by1 {

    /* compiled from: AnalyticsListener.java */
    public static final class a {
        public final long a;
        public final ewo0 b;
        public final int c;

        @Nullable
        public final i.b d;
        public final long e;
        public final ewo0 f;
        public final int g;

        @Nullable
        public final i.b h;
        public final long i;
        public final long j;

        public a(long j, ewo0 ewo0Var, int i, @Nullable i.b bVar, long j2, ewo0 ewo0Var2, int i2, @Nullable i.b bVar2, long j3, long j4) {
            this.a = j;
            this.b = ewo0Var;
            this.c = i;
            this.d = bVar;
            this.e = j2;
            this.f = ewo0Var2;
            this.g = i2;
            this.h = bVar2;
            this.i = j3;
            this.j = j4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.c == aVar.c && this.e == aVar.e && this.g == aVar.g && this.i == aVar.i && this.j == aVar.j && Objects.equals(this.b, aVar.b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f, aVar.f) && Objects.equals(this.h, aVar.h)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
        }
    }

    /* compiled from: AnalyticsListener.java */
    public static final class b {
        public final vnr a;
        public final SparseArray<a> b;

        public b(vnr vnrVar, SparseArray<a> sparseArray) {
            this.a = vnrVar;
            SparseBooleanArray sparseBooleanArray = vnrVar.a;
            SparseArray<a> sparseArray2 = new SparseArray<>(sparseBooleanArray.size());
            for (int i = 0; i < sparseBooleanArray.size(); i++) {
                fxc0.s(i, sparseBooleanArray.size());
                int keyAt = sparseBooleanArray.keyAt(i);
                a aVar = sparseArray.get(keyAt);
                aVar.getClass();
                sparseArray2.append(keyAt, aVar);
            }
            this.b = sparseArray2;
        }

        public final boolean a(int i) {
            return this.a.a.get(i);
        }
    }

    default void A() {
    }

    default void B() {
    }

    default void Y() {
    }

    default void J(g8l g8lVar) {
    }

    default void P(androidx.media3.common.a aVar) {
    }

    default void R(int i) {
    }

    default void U(String str) {
    }

    default void X(g8l g8lVar) {
    }

    default void e0(PlaybackException playbackException) {
    }

    default void h(String str) {
    }

    default void x(xgt0 xgt0Var) {
    }

    default void F(bpz bpzVar, pr10 pr10Var) {
    }

    default void K(jza0 jza0Var, b bVar) {
    }

    default void Q(int i, long j) {
    }

    default void S(a aVar, pr10 pr10Var) {
    }

    default void W(bpz bpzVar, pr10 pr10Var) {
    }

    default void b0(androidx.media3.common.a aVar, @Nullable n8l n8lVar) {
    }

    default void g0(bpz bpzVar, pr10 pr10Var) {
    }

    default void L(bpz bpzVar, pr10 pr10Var, IOException iOException) {
    }

    default void T(int i, long j, long j2) {
    }

    default void d0(int i, jza0.c cVar, jza0.c cVar2) {
    }

    default void H(a aVar, int i, long j, long j2) {
    }
}
