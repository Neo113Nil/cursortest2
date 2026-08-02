package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import yads.t31;
import yads.wk2;

/* loaded from: classes7.dex */
public final class pq81 extends yn81 {
    public static final Object A = new Object();
    public final long a;
    public final long w;
    public final boolean x;
    public final op81 y;
    public final q581 z;

    static {
        p481 p481Var = t31.b;
        wk2 wk2Var = wk2.x;
        List list = Collections.EMPTY_LIST;
        wk2 wk2Var2 = wk2.x;
        qf81 qf81Var = qf81.c;
        if (Uri.EMPTY != null) {
            p481 p481Var2 = t31.b;
            a181 a181Var = new a181();
            if (wk2Var2.size() > 0) {
                b64.D(wk2Var2.get(0));
                throw null;
            }
            a181Var.c();
        }
        oi61 oi61Var = oi61.b0;
    }

    public pq81(long j, boolean z, boolean z2, op81 op81Var) {
        q581 q581Var = z2 ? op81Var.c : null;
        this.a = j;
        this.w = j;
        this.x = z;
        op81Var.getClass();
        this.y = op81Var;
        this.z = q581Var;
    }

    @Override // defpackage.yn81
    public final uk81 a(int i, uk81 uk81Var, long j) {
        cha1.a(i, 1);
        uk81Var.a(uk81.J, this.y, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.x, false, this.z, 0L, this.w, 0, 0, 0L);
        return uk81Var;
    }

    @Override // defpackage.yn81
    public final int b() {
        return 1;
    }

    @Override // defpackage.yn81
    public final int a() {
        return 1;
    }

    @Override // defpackage.yn81
    public final ie81 a(int i, ie81 ie81Var, boolean z) {
        cha1.a(i, 1);
        Object obj = z ? A : null;
        ie81Var.getClass();
        ie81Var.d(null, obj, 0, this.a, 0L, uu71.y, false);
        return ie81Var;
    }

    @Override // defpackage.yn81
    public final int a(Object obj) {
        return A != obj ? -1 : 0;
    }

    @Override // defpackage.yn81
    public final Object a(int i) {
        cha1.a(i, 1);
        return A;
    }
}
