package xsna;

import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import xsna.tsp0;

/* compiled from: PassthroughSectionPayloadReader.java */
/* loaded from: classes12.dex */
public final class fm90 implements z1i0 {
    public androidx.media3.common.a a;
    public txo0 b;
    public rgp0 c;

    public fm90(String str) {
        a.C0043a c0043a = new a.C0043a();
        c0043a.l = io20.q("video/mp2t");
        c0043a.m = io20.q(str);
        this.a = new androidx.media3.common.a(c0043a);
    }

    @Override // xsna.z1i0
    public final void a(xi90 xi90Var) {
        long d;
        long j;
        this.b.getClass();
        String str = y2r0.a;
        txo0 txo0Var = this.b;
        synchronized (txo0Var) {
            try {
                long j2 = txo0Var.c;
                d = j2 != C.TIME_UNSET ? j2 + txo0Var.b : txo0Var.d();
            } finally {
            }
        }
        txo0 txo0Var2 = this.b;
        synchronized (txo0Var2) {
            j = txo0Var2.b;
        }
        if (d == C.TIME_UNSET || j == C.TIME_UNSET) {
            return;
        }
        androidx.media3.common.a aVar = this.a;
        if (j != aVar.s) {
            a.C0043a a = aVar.a();
            a.r = j;
            androidx.media3.common.a aVar2 = new androidx.media3.common.a(a);
            this.a = aVar2;
            this.c.c(aVar2);
        }
        int a2 = xi90Var.a();
        this.c.d(a2, xi90Var);
        this.c.a(d, 1, a2, 0, null);
    }

    @Override // xsna.z1i0
    public final void b(txo0 txo0Var, rgq rgqVar, tsp0.c cVar) {
        this.b = txo0Var;
        cVar.a();
        cVar.b();
        rgp0 track = rgqVar.track(cVar.d, 5);
        this.c = track;
        track.c(this.a);
    }
}
