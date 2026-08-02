package androidx.compose.ui.graphics;

import androidx.compose.ui.platform.m;
import defpackage.c530;
import defpackage.ehr0;
import defpackage.f530;
import defpackage.jw01;
import defpackage.m2k0;
import defpackage.n0u;
import defpackage.qke;
import defpackage.tls;

/* loaded from: classes.dex */
public abstract class d {
    public static m2k0 a;

    public static final f530 a(f530 f530Var, tls tlsVar) {
        return f530Var.k(new a(tlsVar));
    }

    public static f530 b(float f, float f2, float f3, float f4, ehr0 ehr0Var, int i) {
        float f5 = (i & 1) != 0 ? 1.0f : f;
        float f6 = (i & 2) != 0 ? 1.0f : f2;
        float f7 = (i & 4) != 0 ? 1.0f : f3;
        float f8 = (i & 32) != 0 ? 0.0f : f4;
        long j = jw01.b;
        ehr0 ehr0Var2 = (i & 2048) != 0 ? qke.q : ehr0Var;
        long j2 = n0u.a;
        return new c(f5, f6, f7, 0.0f, 0.0f, f8, 0.0f, j, ehr0Var2, false, j2, j2);
    }

    public static f530 c(f530 f530Var, float f, float f2, float f3, float f4, float f5, float f6, ehr0 ehr0Var, int i) {
        float f7 = (i & 1) != 0 ? 1.0f : f;
        float f8 = (i & 2) != 0 ? 1.0f : f2;
        float f9 = (i & 4) != 0 ? 1.0f : f3;
        float f10 = (i & 8) != 0 ? 0.0f : f4;
        float f11 = (i & 16) != 0 ? 0.0f : f5;
        float f12 = (i & 256) != 0 ? 0.0f : f6;
        long j = jw01.b;
        ehr0 ehr0Var2 = (i & 2048) != 0 ? qke.q : ehr0Var;
        boolean z = (i & 4096) == 0;
        long j2 = n0u.a;
        return f530Var.k(new c(f7, f8, f9, f10, f11, 0.0f, f12, j, ehr0Var2, z, j2, j2));
    }

    public static final f530 d(f530 f530Var) {
        return m.b ? f530Var.k(c(c530.a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 524287)) : f530Var;
    }
}
