package xsna;

import xsna.sox;

/* compiled from: SeekPreviewLayoutStateExtensions.kt */
/* loaded from: classes8.dex */
public final class v3i0 {
    public static u3i0 a(u3i0 u3i0Var, boolean z, boolean z2, owo0 owo0Var, sox.a aVar, long j, long j2, int i) {
        if ((i & 1) != 0) {
            z = u3i0Var.a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = u3i0Var.b;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            owo0Var = u3i0Var.c;
        }
        owo0 owo0Var2 = owo0Var;
        if ((i & 8) != 0) {
            aVar = u3i0Var.d;
        }
        sox.a aVar2 = aVar;
        long j3 = (i & 16) != 0 ? u3i0Var.e : j;
        long j4 = (i & 32) != 0 ? u3i0Var.f : j2;
        return (z3 == u3i0Var.a && z4 == u3i0Var.b && epx.f(owo0Var2, u3i0Var.c) && epx.f(aVar2, u3i0Var.d) && j3 == u3i0Var.e && j4 == u3i0Var.f) ? u3i0Var : new u3i0(z3, z4, owo0Var2, aVar2, j3, j4);
    }
}
