package xsna;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.o4i0;

/* compiled from: Representation.java */
/* loaded from: classes12.dex */
public abstract class e7g0 {
    public final androidx.media3.common.a b;
    public final ImmutableList<tp6> c;
    public final long d;
    public final List<y2m> e;
    public final List<y2m> f;
    public final List<y2m> g;

    @Nullable
    public final rwe0 h;

    /* compiled from: Representation.java */
    public static class b extends e7g0 {

        @Nullable
        public final rwe0 i;

        @Nullable
        public final rob j;

        /* JADX WARN: Multi-variable type inference failed */
        public b(androidx.media3.common.a aVar, ImmutableList immutableList, o4i0.e eVar, @Nullable ArrayList arrayList, List list, List list2) {
            super(aVar, immutableList, eVar, arrayList, list, list2);
            Uri.parse(((tp6) immutableList.get(0)).a);
            long j = eVar.e;
            rwe0 rwe0Var = j <= 0 ? null : new rwe0(null, eVar.d, j);
            this.i = rwe0Var;
            this.j = rwe0Var == null ? new rob(new rwe0(null, 0L, -1L)) : null;
        }

        @Override // xsna.e7g0
        @Nullable
        public final String c() {
            return null;
        }

        @Override // xsna.e7g0
        @Nullable
        public final btk e() {
            return this.j;
        }

        @Override // xsna.e7g0
        @Nullable
        public final rwe0 g() {
            return this.i;
        }
    }

    public e7g0() {
        throw null;
    }

    public e7g0(androidx.media3.common.a aVar, List list, o4i0 o4i0Var, List list2, List list3, List list4) {
        fxc0.p(!list.isEmpty());
        this.b = aVar;
        this.c = ImmutableList.m(list);
        this.e = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f = list3;
        this.g = list4;
        this.h = o4i0Var.a(this);
        long j = o4i0Var.c;
        long j2 = o4i0Var.b;
        String str = y2r0.a;
        this.d = y2r0.d0(j, 1000000L, j2, RoundingMode.DOWN);
    }

    @Nullable
    public abstract String c();

    @Nullable
    public abstract btk e();

    @Nullable
    public abstract rwe0 g();

    /* compiled from: Representation.java */
    public static class a extends e7g0 implements btk {
        public final o4i0.a i;

        public a(androidx.media3.common.a aVar, ImmutableList immutableList, o4i0.a aVar2, @Nullable ArrayList arrayList, List list, List list2) {
            super(aVar, immutableList, aVar2, arrayList, list, list2);
            this.i = aVar2;
        }

        @Override // xsna.btk
        public final long a(long j, long j2) {
            return this.i.e(j, j2);
        }

        @Override // xsna.btk
        public final long b(long j, long j2) {
            o4i0.a aVar = this.i;
            if (aVar.f != null) {
                return C.TIME_UNSET;
            }
            long b = aVar.b(j, j2) + aVar.c(j, j2);
            return (aVar.e(b, j) + aVar.g(b)) - aVar.i;
        }

        @Override // xsna.e7g0
        @Nullable
        public final String c() {
            return null;
        }

        @Override // xsna.btk
        public final boolean d() {
            return this.i.i();
        }

        @Override // xsna.btk
        public final long f(long j, long j2) {
            return this.i.c(j, j2);
        }

        @Override // xsna.e7g0
        @Nullable
        public final rwe0 g() {
            return null;
        }

        @Override // xsna.btk
        public final long getTimeUs(long j) {
            return this.i.g(j);
        }

        @Override // xsna.btk
        public final long h(long j, long j2) {
            return this.i.f(j, j2);
        }

        @Override // xsna.btk
        public final long i(long j) {
            return this.i.d(j);
        }

        @Override // xsna.btk
        public final long k() {
            return this.i.d;
        }

        @Override // xsna.btk
        public final rwe0 l(long j) {
            return this.i.h(this, j);
        }

        @Override // xsna.btk
        public final long n(long j, long j2) {
            return this.i.b(j, j2);
        }

        @Override // xsna.e7g0
        public final btk e() {
            return this;
        }
    }
}
