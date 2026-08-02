package yads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class t03 extends w73 {
    public static final Object h = new Object();
    public final long c;
    public final long d;
    public final boolean e;
    public final gn1 f;
    public final zm1 g;

    static {
        wm1 wm1Var = new wm1();
        List list = Collections.EMPTY_LIST;
        tn2 tn2Var = tn2.f;
        dn1 dn1Var = dn1.d;
        Uri uri = Uri.EMPTY;
        if (wm1Var.b != null && wm1Var.a == null) {
            throw new IllegalStateException();
        }
        if (uri != null) {
            new bn1(uri, null, wm1Var.a != null ? new xm1(wm1Var) : null, list, null, tn2Var, null);
        }
        kn1 kn1Var = kn1.H;
    }

    public t03(long j, long j2, boolean z, gn1 gn1Var, zm1 zm1Var) {
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = (gn1) ni.a(gn1Var);
        this.g = zm1Var;
    }

    @Override // yads.w73
    public final int a() {
        return 1;
    }

    @Override // yads.w73
    public final int b() {
        return 1;
    }

    @Override // yads.w73
    public final t73 a(int i, t73 t73Var, boolean z) {
        ni.a(i, 1);
        Object obj = z ? h : null;
        long j = this.c;
        t73Var.getClass();
        return t73Var.a(null, obj, 0, j, 0L, e6.h, false);
    }

    @Override // yads.w73
    public final Object a(int i) {
        ni.a(i, 1);
        return h;
    }

    public t03(long j, long j2, boolean z, boolean z2, gn1 gn1Var) {
        this(j, j2, z, gn1Var, z2 ? gn1Var.d : null);
    }

    @Override // yads.w73
    public final v73 a(int i, v73 v73Var, long j) {
        ni.a(i, 1);
        return v73Var.a(v73.s, this.f, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, this.e, false, this.g, 0L, this.d, 0, 0, 0L);
    }

    @Override // yads.w73
    public final int a(Object obj) {
        return h.equals(obj) ? 0 : -1;
    }
}
