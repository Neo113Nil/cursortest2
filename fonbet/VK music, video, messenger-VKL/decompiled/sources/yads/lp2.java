package yads;

import android.net.Uri;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class lp2 extends mp2 {
    public final String f;
    public final qm2 g;
    public final z03 h;

    public lp2(long j, nx0 nx0Var, s51 s51Var, ky2 ky2Var, ArrayList arrayList) {
        super(nx0Var, s51Var, ky2Var, arrayList);
        Uri.parse(((uo) s51Var.get(0)).a);
        qm2 b = ky2Var.b();
        this.g = b;
        this.f = null;
        this.h = b == null ? new z03(new qm2(null, 0L, -1L)) : null;
    }

    @Override // yads.mp2
    public final String c() {
        return this.f;
    }

    @Override // yads.mp2
    public final i30 d() {
        return this.h;
    }

    @Override // yads.mp2
    public final qm2 e() {
        return this.g;
    }
}
