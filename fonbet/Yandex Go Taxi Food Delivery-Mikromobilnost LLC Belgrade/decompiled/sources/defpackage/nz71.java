package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import yads.t31;

/* loaded from: classes7.dex */
public final class nz71 extends x281 {
    public final of81 y;
    public final i971 z;

    public nz71(qd81 qd81Var, t31 t31Var, n681 n681Var, ArrayList arrayList) {
        super(qd81Var, t31Var, n681Var, arrayList);
        Uri.parse(((ik71) t31Var.get(0)).a);
        long j = n681Var.e;
        of81 of81Var = j <= 0 ? null : new of81(null, n681Var.d, j);
        this.y = of81Var;
        this.z = of81Var == null ? new i971(17, new of81(null, 0L, -1L)) : null;
    }

    @Override // defpackage.x281
    public final ng61 e() {
        return this.z;
    }

    @Override // defpackage.x281
    public final of81 f() {
        return this.y;
    }
}
