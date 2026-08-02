package xsna;

import android.net.Uri;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import xsna.kr10;
import xsna.xg0;

/* compiled from: Timeline.java */
/* loaded from: classes12.dex */
public abstract class ewo0 {
    public static final a a = new a();

    /* compiled from: Timeline.java */
    public class a extends ewo0 {
        @Override // xsna.ewo0
        public final int b(Object obj) {
            return -1;
        }

        @Override // xsna.ewo0
        public final b f(int i, b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // xsna.ewo0
        public final int h() {
            return 0;
        }

        @Override // xsna.ewo0
        public final Object l(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // xsna.ewo0
        public final c m(int i, c cVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // xsna.ewo0
        public final int o() {
            return 0;
        }
    }

    /* compiled from: Timeline.java */
    public static final class b {

        @Nullable
        public Object a;

        @Nullable
        public Object b;
        public int c;
        public long d;
        public long e;
        public boolean f;
        public xg0 g = xg0.c;

        static {
            cq.h(0, 1, 2, 3, 4);
        }

        public final long a(int i, int i2) {
            xg0.a a = this.g.a(i);
            return a.a != -1 ? a.f[i2] : C.TIME_UNSET;
        }

        public final int b(long j) {
            xg0.a a;
            int i;
            xg0 xg0Var = this.g;
            long j2 = this.d;
            int i2 = xg0Var.a;
            if (j != Long.MIN_VALUE && (j2 == C.TIME_UNSET || j < j2)) {
                int i3 = 0;
                while (i3 < i2) {
                    xg0Var.a(i3).getClass();
                    xg0Var.a(i3).getClass();
                    if (0 > j && ((i = (a = xg0Var.a(i3)).a) == -1 || a.a(-1) < i)) {
                        break;
                    }
                    i3++;
                }
                if (i3 < i2) {
                    if (j2 != C.TIME_UNSET) {
                        xg0Var.a(i3).getClass();
                        if (0 <= j2) {
                        }
                    }
                    return i3;
                }
            }
            return -1;
        }

        public final int c(long j) {
            int i;
            xg0 xg0Var = this.g;
            int i2 = xg0Var.a;
            int i3 = i2 - 1;
            if (i3 == i2 - 1) {
                xg0Var.a(i3).getClass();
            }
            while (i3 >= 0 && j != Long.MIN_VALUE) {
                xg0Var.a(i3).getClass();
                if (j >= 0) {
                    break;
                }
                i3--;
            }
            if (i3 >= 0) {
                xg0.a a = xg0Var.a(i3);
                int i4 = a.a;
                if (i4 != -1) {
                    while (i < i4) {
                        int i5 = a.e[i];
                        i = (i5 == 0 || i5 == 1) ? 0 : i + 1;
                    }
                }
                return i3;
            }
            return -1;
        }

        public final long d(int i) {
            this.g.a(i).getClass();
            return 0L;
        }

        public final int e(int i) {
            return this.g.a(i).a(-1);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return Objects.equals(this.a, bVar.a) && Objects.equals(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && Objects.equals(this.g, bVar.g);
        }

        public final boolean f(int i) {
            xg0 xg0Var = this.g;
            int i2 = xg0Var.a;
            if (i != i2 - 1 || i != i2 - 1) {
                return false;
            }
            xg0Var.a(i).getClass();
            return false;
        }

        public final boolean g(int i) {
            this.g.a(i).getClass();
            return false;
        }

        public final void h(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j2, xg0 xg0Var, boolean z) {
            this.a = obj;
            this.b = obj2;
            this.c = i;
            this.d = j;
            this.e = j2;
            this.g = xg0Var;
            this.f = z;
        }

        public final int hashCode() {
            Object obj = this.a;
            int hashCode = (Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.b;
            int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
            long j = this.d;
            int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.e;
            return this.g.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
        }
    }

    /* compiled from: Timeline.java */
    public static final class c {
        public static final Object q = new Object();
        public static final kr10 r;

        @Nullable
        @Deprecated
        public Object b;

        @Nullable
        public Object d;
        public long e;
        public long f;
        public long g;
        public boolean h;
        public boolean i;

        @Nullable
        public kr10.e j;
        public boolean k;
        public long l;
        public long m;
        public int n;
        public int o;
        public long p;
        public Object a = q;
        public kr10 c = r;

        static {
            kr10.b.a aVar = new kr10.b.a();
            com.google.common.collect.h hVar = com.google.common.collect.h.h;
            ImmutableList.b bVar = ImmutableList.c;
            com.google.common.collect.g gVar = com.google.common.collect.g.f;
            List list = Collections.EMPTY_LIST;
            com.google.common.collect.g gVar2 = com.google.common.collect.g.f;
            kr10.e.a aVar2 = new kr10.e.a();
            kr10.g gVar3 = kr10.g.a;
            Uri uri = Uri.EMPTY;
            r = new kr10("androidx.media3.common.Timeline", new kr10.c(aVar), uri != null ? new kr10.f(uri, null, null, list, null, gVar2, C.TIME_UNSET) : null, new kr10.e(aVar2), vr10.B, gVar3);
            cq.h(1, 2, 3, 4, 5);
            cq.h(6, 7, 8, 9, 10);
            y2r0.L(11);
            y2r0.L(12);
            y2r0.L(13);
        }

        public final boolean a() {
            return this.j != null;
        }

        public final void b(@Nullable kr10 kr10Var, @Nullable Object obj, long j, long j2, long j3, boolean z, boolean z2, @Nullable kr10.e eVar, long j4, long j5, int i, long j6) {
            this.a = q;
            this.c = kr10Var != null ? kr10Var : r;
            if (kr10Var != null) {
                kr10.f fVar = kr10Var.b;
            }
            this.b = null;
            this.d = obj;
            this.e = j;
            this.f = j2;
            this.g = j3;
            this.h = z;
            this.i = z2;
            this.j = eVar;
            this.l = j4;
            this.m = j5;
            this.n = 0;
            this.o = i;
            this.p = j6;
            this.k = false;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.a, cVar.a) && Objects.equals(this.c, cVar.c) && Objects.equals(this.d, cVar.d) && Objects.equals(this.j, cVar.j) && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g && this.h == cVar.h && this.i == cVar.i && this.k == cVar.k && this.l == cVar.l && this.m == cVar.m && this.n == cVar.n && this.o == cVar.o && this.p == cVar.p;
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + vul0.a(Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 31, this.a)) * 31;
            Object obj = this.d;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            kr10.e eVar = this.j;
            int hashCode3 = (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
            long j = this.e;
            int i = (hashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.g;
            int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
            long j4 = this.l;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.m;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31;
            long j6 = this.p;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }
    }

    static {
        y2r0.L(0);
        y2r0.L(1);
        y2r0.L(2);
    }

    public int a(boolean z) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, b bVar, c cVar, int i2, boolean z) {
        int i3 = f(i, bVar, false).c;
        if (m(i3, cVar, 0L).o != i) {
            return i + 1;
        }
        int e = e(i3, i2, z);
        if (e == -1) {
            return -1;
        }
        return m(e, cVar, 0L).n;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(@Nullable Object obj) {
        int c2;
        if (this != obj) {
            if (obj instanceof ewo0) {
                ewo0 ewo0Var = (ewo0) obj;
                if (ewo0Var.o() == o() && ewo0Var.h() == h()) {
                    c cVar = new c();
                    b bVar = new b();
                    c cVar2 = new c();
                    b bVar2 = new b();
                    int i = 0;
                    while (true) {
                        if (i >= o()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= h()) {
                                    int a2 = a(true);
                                    if (a2 == ewo0Var.a(true) && (c2 = c(true)) == ewo0Var.c(true)) {
                                        while (a2 != c2) {
                                            int e = e(a2, 0, true);
                                            if (e == ewo0Var.e(a2, 0, true)) {
                                                a2 = e;
                                            }
                                        }
                                    }
                                } else {
                                    if (!f(i2, bVar, true).equals(ewo0Var.f(i2, bVar2, true))) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else {
                            if (!m(i, cVar, 0L).equals(ewo0Var.m(i, cVar2, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract b f(int i, b bVar, boolean z);

    public b g(Object obj, b bVar) {
        return f(b(obj), bVar, true);
    }

    public abstract int h();

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int o = o() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE;
        for (int i = 0; i < o(); i++) {
            o = (o * 31) + m(i, cVar, 0L).hashCode();
        }
        int h = h() + (o * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            h = (h * 31) + f(i2, bVar, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            h = (h * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return h;
    }

    public final Pair<Object, Long> i(c cVar, b bVar, int i, long j) {
        Pair<Object, Long> j2 = j(cVar, bVar, i, j, 0L);
        j2.getClass();
        return j2;
    }

    @Nullable
    public final Pair<Object, Long> j(c cVar, b bVar, int i, long j, long j2) {
        fxc0.s(i, o());
        m(i, cVar, j2);
        if (j == C.TIME_UNSET) {
            j = cVar.l;
            if (j == C.TIME_UNSET) {
                return null;
            }
        }
        int i2 = cVar.n;
        f(i2, bVar, false);
        while (i2 < cVar.o && bVar.e != j) {
            int i3 = i2 + 1;
            if (f(i3, bVar, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, bVar, true);
        long j3 = j - bVar.e;
        long j4 = bVar.d;
        if (j4 != C.TIME_UNSET) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = bVar.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i);

    public abstract c m(int i, c cVar, long j);

    public final void n(int i, c cVar) {
        m(i, cVar, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
