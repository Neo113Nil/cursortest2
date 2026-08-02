package xsna;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;
import xsna.ewo0;
import xsna.kr10;

/* compiled from: SinglePeriodTimeline.java */
/* loaded from: classes12.dex */
public final class zuj0 extends ewo0 {
    public static final Object o = new Object();
    public final long b;
    public final long c;
    public final long d = C.TIME_UNSET;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    @Nullable
    public final Object l;

    @Nullable
    public final kr10 m;

    @Nullable
    public final kr10.e n;

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
        if (uri != null) {
            new kr10.f(uri, null, null, list, null, gVar2, C.TIME_UNSET);
        }
        aVar.a();
        aVar2.a();
        vr10 vr10Var = vr10.B;
    }

    public zuj0(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, @Nullable alk alkVar, kr10 kr10Var, @Nullable kr10.e eVar) {
        this.b = j;
        this.c = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = alkVar;
        kr10Var.getClass();
        this.m = kr10Var;
        this.n = eVar;
    }

    @Override // xsna.ewo0
    public final int b(Object obj) {
        return o.equals(obj) ? 0 : -1;
    }

    @Override // xsna.ewo0
    public final ewo0.b f(int i, ewo0.b bVar, boolean z) {
        fxc0.s(i, 1);
        Object obj = z ? o : null;
        long j = -this.g;
        bVar.getClass();
        bVar.h(null, obj, 0, this.e, j, xg0.c, false);
        return bVar;
    }

    @Override // xsna.ewo0
    public final int h() {
        return 1;
    }

    @Override // xsna.ewo0
    public final Object l(int i) {
        fxc0.s(i, 1);
        return o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // xsna.ewo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ewo0.c m(int i, ewo0.c cVar, long j) {
        long j2;
        fxc0.s(i, 1);
        long j3 = this.h;
        boolean z = this.j;
        if (z && !this.k && j != 0) {
            long j4 = this.f;
            if (j4 != C.TIME_UNSET) {
                j3 += j;
            }
            j2 = -9223372036854775807L;
            Object obj = ewo0.c.q;
            cVar.b(this.m, this.l, this.b, this.c, this.d, this.i, z, this.n, j2, this.f, 0, this.g);
            return cVar;
        }
        j2 = j3;
        Object obj2 = ewo0.c.q;
        cVar.b(this.m, this.l, this.b, this.c, this.d, this.i, z, this.n, j2, this.f, 0, this.g);
        return cVar;
    }

    @Override // xsna.ewo0
    public final int o() {
        return 1;
    }
}
