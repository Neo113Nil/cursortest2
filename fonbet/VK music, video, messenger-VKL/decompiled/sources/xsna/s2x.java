package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.input.InputSelect$State;
import xsna.b6u0;

/* compiled from: InputSelect.kt */
/* loaded from: classes17.dex */
public abstract class s2x {
    public final wh50 a = androidx.compose.runtime.k.b(Boolean.TRUE);
    public final wh50 b = androidx.compose.runtime.k.b(InputSelect$State.Default);

    /* compiled from: InputSelect.kt */
    public static abstract class a extends s2x {

        /* compiled from: InputSelect.kt */
        /* renamed from: xsna.s2x$a$a, reason: collision with other inner class name */
        public static final class C3649a {
            /* JADX WARN: Multi-variable type inference failed */
            public static b2x a(String str, izs izsVar, String str2, rgy rgyVar, tzy tzyVar, androidx.compose.runtime.a aVar, int i, int i2) {
                uey ueyVar;
                sg50 sg50Var;
                tzy tzyVar2;
                String str3 = (i2 & 4) != 0 ? null : str2;
                s1v.k();
                on20 on20Var = on20.a;
                long u = sd9.u(aVar);
                s1v.k();
                long p = sd9.p(aVar);
                s1v.k();
                frv0 f = on20.a.f(aVar);
                rgy rgyVar2 = (i2 & 128) != 0 ? rgy.e : rgyVar;
                uey ueyVar2 = uey.d;
                Object x = aVar.x();
                Object obj = a.C0011a.a;
                if (x == obj) {
                    x = ir.h(aVar);
                }
                sg50 sg50Var2 = (sg50) x;
                tzy tzyVar3 = (i2 & 2048) != 0 ? null : tzyVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1411064042, i, 196608, "com.vk.core.compose.component.input.InputSelect.Middle.Input.Companion.invoke (InputSelect.kt:144)");
                }
                int i3 = i << 3;
                int i4 = (i3 & 1879048192) | (i3 & 112) | 6 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i) | ((i << 6) & 29360128) | (234881024 & i3);
                int i5 = (i >> 27) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1681917892, i4, i5, "com.vk.core.compose.component.input.remember (InputImpl.kt:224)");
                }
                String y = brm0.y(str, "\n", " ");
                Object x2 = aVar.x();
                if (x2 == obj) {
                    x2 = or.a(y, 0L, 6, aVar);
                }
                wh50 wh50Var = (wh50) x2;
                tho0 a = tho0.a((tho0) wh50Var.getValue(), y);
                boolean J = aVar.J(y);
                Object x3 = aVar.x();
                if (J || x3 == obj) {
                    x3 = androidx.compose.runtime.k.b(y);
                    aVar.R(x3);
                }
                wh50 wh50Var2 = (wh50) x3;
                boolean J2 = aVar.J(wh50Var2) | ((((i4 & 896) ^ 384) > 256 && aVar.J(izsVar)) || (i4 & 384) == 256);
                Object x4 = aVar.x();
                if (J2 || x4 == obj) {
                    x4 = new rw(izsVar, wh50Var, wh50Var2);
                    aVar.R(x4);
                }
                izs izsVar2 = (izs) x4;
                Object x5 = aVar.x();
                a6u0 a6u0Var = b6u0.a.a;
                if (x5 == obj) {
                    Object b2xVar = new b2x(a, izsVar2, str3, u, p, f, rgyVar2, ueyVar2, a6u0Var, sg50Var2, tzyVar3, null, false, null);
                    ueyVar = ueyVar2;
                    sg50Var = sg50Var2;
                    tzyVar2 = tzyVar3;
                    aVar.R(b2xVar);
                    x5 = b2xVar;
                } else {
                    ueyVar = ueyVar2;
                    sg50Var = sg50Var2;
                    tzyVar2 = tzyVar3;
                }
                b2x b2xVar2 = (b2x) x5;
                ((zak0) b2xVar2.c).setValue(a);
                ((zak0) b2xVar2.d).setValue(izsVar2);
                ((zak0) b2xVar2.e).setValue(str3);
                ((zak0) b2xVar2.f).setValue(new l5g(u));
                ((zak0) b2xVar2.g).setValue(new l5g(p));
                ((zak0) b2xVar2.h).setValue(f);
                ((zak0) b2xVar2.i).setValue(Boolean.FALSE);
                ((zak0) b2xVar2.j).setValue(rgyVar2);
                ((zak0) b2xVar2.k).setValue(ueyVar);
                ((zak0) b2xVar2.l).setValue(a6u0Var);
                ((zak0) b2xVar2.m).setValue(sg50Var);
                ((zak0) b2xVar2.n).setValue(tzyVar2);
                ((zak0) b2xVar2.o).setValue(null);
                ((zak0) b2xVar2.p).setValue(false);
                ((zak0) b2xVar2.q).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return b2xVar2;
            }

            public static b2x b(tho0 tho0Var, izs izsVar, String str, long j, long j2, rgy rgyVar, uey ueyVar, sg50 sg50Var, r2x r2xVar, t2x t2xVar, boolean z, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2, int i3) {
                long j3;
                long j4;
                sg50 sg50Var2;
                rgy rgyVar2;
                uey ueyVar2;
                sg50 sg50Var3;
                r2x r2xVar2;
                t2x t2xVar2;
                com.vk.core.compose.component.semantics.a aVar3;
                String str2 = (i3 & 4) != 0 ? null : str;
                if ((i3 & 8) != 0) {
                    s1v.k();
                    on20 on20Var = on20.a;
                    j3 = sd9.u(aVar2);
                } else {
                    j3 = j;
                }
                if ((i3 & 16) != 0) {
                    s1v.k();
                    on20 on20Var2 = on20.a;
                    j4 = sd9.p(aVar2);
                } else {
                    j4 = j2;
                }
                s1v.k();
                frv0 f = on20.a.f(aVar2);
                rgy rgyVar3 = (i3 & 128) != 0 ? rgy.e : rgyVar;
                uey ueyVar3 = (i3 & 256) != 0 ? uey.d : ueyVar;
                int i4 = i3 & 1024;
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (i4 != 0) {
                    Object x = aVar2.x();
                    if (x == c0012a) {
                        x = ir.h(aVar2);
                    }
                    sg50Var2 = (sg50) x;
                } else {
                    sg50Var2 = sg50Var;
                }
                r2x r2xVar3 = (i3 & 2048) != 0 ? null : r2xVar;
                t2x t2xVar3 = (i3 & 4096) != 0 ? null : t2xVar;
                boolean z2 = (i3 & 8192) != 0 ? false : z;
                com.vk.core.compose.component.semantics.a aVar4 = (i3 & 16384) != 0 ? null : aVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-481718167, i, i2, "com.vk.core.compose.component.input.InputSelect.Middle.Input.Companion.invoke (InputSelect.kt:109)");
                }
                int i5 = i << 3;
                int i6 = (i5 & 1879048192) | (i5 & 112) | 6 | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5);
                int i7 = ((i >> 27) & 14) | ((i2 << 3) & 112);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-797308527, i6, i7, "com.vk.core.compose.component.input.remember (InputImpl.kt:163)");
                }
                boolean z3 = (((i6 & 896) ^ 384) > 256 && aVar2.J(izsVar)) || (i6 & 384) == 256;
                Object x2 = aVar2.x();
                if (z3 || x2 == c0012a) {
                    x2 = new n3m(izsVar, 1);
                    aVar2.R(x2);
                }
                izs izsVar2 = (izs) x2;
                Object x3 = aVar2.x();
                a6u0 a6u0Var = b6u0.a.a;
                if (x3 == c0012a) {
                    b2x b2xVar = new b2x(tho0Var, izsVar2, str2, j3, j4, f, rgyVar3, ueyVar3, a6u0Var, sg50Var2, r2xVar3, t2xVar3, z2, aVar4);
                    rgyVar2 = rgyVar3;
                    ueyVar2 = ueyVar3;
                    sg50Var3 = sg50Var2;
                    r2xVar2 = r2xVar3;
                    t2xVar2 = t2xVar3;
                    aVar3 = aVar4;
                    aVar2.R(b2xVar);
                    x3 = b2xVar;
                } else {
                    rgyVar2 = rgyVar3;
                    ueyVar2 = ueyVar3;
                    sg50Var3 = sg50Var2;
                    r2xVar2 = r2xVar3;
                    t2xVar2 = t2xVar3;
                    aVar3 = aVar4;
                }
                b2x b2xVar2 = (b2x) x3;
                ((zak0) b2xVar2.c).setValue(tho0Var);
                ((zak0) b2xVar2.d).setValue(izsVar2);
                ((zak0) b2xVar2.e).setValue(str2);
                ((zak0) b2xVar2.f).setValue(new l5g(j3));
                ((zak0) b2xVar2.g).setValue(new l5g(j4));
                ((zak0) b2xVar2.h).setValue(f);
                ((zak0) b2xVar2.i).setValue(Boolean.FALSE);
                ((zak0) b2xVar2.j).setValue(rgyVar2);
                ((zak0) b2xVar2.k).setValue(ueyVar2);
                ((zak0) b2xVar2.l).setValue(a6u0Var);
                ((zak0) b2xVar2.m).setValue(sg50Var3);
                ((zak0) b2xVar2.n).setValue(r2xVar2);
                ((zak0) b2xVar2.o).setValue(t2xVar2);
                ((zak0) b2xVar2.p).setValue(Boolean.valueOf(z2));
                ((zak0) b2xVar2.q).setValue(aVar3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return b2xVar2;
            }
        }
    }

    /* compiled from: InputSelect.kt */
    public static abstract class b extends s2x {

        /* compiled from: InputSelect.kt */
        public static final class a {
            public static b7i0 a(String str, gzs gzsVar, String str2, long j, r2x r2xVar, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
                long j2;
                String str3 = (i2 & 4) != 0 ? null : str2;
                if ((i2 & 8) != 0) {
                    s1v.k();
                    on20 on20Var = on20.a;
                    j2 = sd9.u(aVar2);
                } else {
                    j2 = j;
                }
                s1v.k();
                on20 on20Var2 = on20.a;
                long p = sd9.p(aVar2);
                s1v.k();
                frv0 f = on20.a.f(aVar2);
                r2x r2xVar2 = (i2 & 64) != 0 ? null : r2xVar;
                com.vk.core.compose.component.semantics.a aVar3 = (i2 & 256) != 0 ? null : aVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-148843440, i, -1, "com.vk.core.compose.component.input.InputSelect.Middle.Select.Companion.invoke (InputSelect.kt:178)");
                }
                int i3 = i << 3;
                int i4 = (i & 234881024) | ((i >> 27) & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(806170458, i4, -1, "com.vk.core.compose.component.input.remember (SelectClickableImpl.kt:106)");
                }
                Object x = aVar2.x();
                if (x == a.C0011a.a) {
                    b7i0 b7i0Var = new b7i0(str, gzsVar, str3, j2, p, f, r2xVar2, aVar3);
                    aVar2.R(b7i0Var);
                    x = b7i0Var;
                }
                b7i0 b7i0Var2 = (b7i0) x;
                ((zak0) b7i0Var2.c).setValue(str);
                ((zak0) b7i0Var2.d).setValue(gzsVar);
                ((zak0) b7i0Var2.e).setValue(str3);
                ((zak0) b7i0Var2.f).setValue(new l5g(j2));
                ((zak0) b7i0Var2.g).setValue(new l5g(p));
                ((zak0) b7i0Var2.h).setValue(f);
                ((zak0) b7i0Var2.i).setValue(r2xVar2);
                ((zak0) b7i0Var2.j).setValue(aVar3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return b7i0Var2;
            }

            public static u8i0 b(String str, boolean z, izs izsVar, String str2, r2x r2xVar, long j, long j2, com.vk.core.compose.component.semantics.a aVar, jai jaiVar, androidx.compose.runtime.a aVar2, int i, int i2) {
                long j3;
                long j4;
                com.vk.core.compose.component.semantics.a aVar3;
                String str3 = (i2 & 8) != 0 ? null : str2;
                r2x r2xVar2 = (i2 & 16) != 0 ? null : r2xVar;
                if ((i2 & 64) != 0) {
                    s1v.k();
                    on20 on20Var = on20.a;
                    j3 = sd9.u(aVar2);
                } else {
                    j3 = j;
                }
                if ((i2 & 128) != 0) {
                    s1v.k();
                    on20 on20Var2 = on20.a;
                    j4 = sd9.p(aVar2);
                } else {
                    j4 = j2;
                }
                s1v.k();
                frv0 f = on20.a.f(aVar2);
                com.vk.core.compose.component.semantics.a aVar4 = (i2 & 512) != 0 ? null : aVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1407692335, i, 54, "com.vk.core.compose.component.input.InputSelect.Middle.Select.Companion.invoke (InputSelect.kt:202)");
                }
                int i3 = i << 3;
                int i4 = (i3 & 1879048192) | (i3 & 112) | 6 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (29360128 & i3) | (234881024 & i3);
                int i5 = ((i >> 27) & 14) | 48;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(984076567, i4, i5, "com.vk.core.compose.component.input.remember (SelectImpl.kt:184)");
                }
                Object x = aVar2.x();
                if (x == a.C0011a.a) {
                    u8i0 u8i0Var = new u8i0(str, z, izsVar, str3, r2xVar2, j3, j4, f, aVar4, jaiVar);
                    aVar3 = aVar4;
                    aVar2.R(u8i0Var);
                    x = u8i0Var;
                } else {
                    aVar3 = aVar4;
                }
                u8i0 u8i0Var2 = (u8i0) x;
                ((zak0) u8i0Var2.c).setValue(str);
                ((zak0) u8i0Var2.e).setValue(Boolean.valueOf(z));
                ((zak0) u8i0Var2.d).setValue(izsVar);
                ((zak0) u8i0Var2.f).setValue(str3);
                ((zak0) u8i0Var2.g).setValue(r2xVar2);
                ((zak0) u8i0Var2.h).setValue(Boolean.FALSE);
                ((zak0) u8i0Var2.i).setValue(jaiVar);
                ((zak0) u8i0Var2.j).setValue(new l5g(j3));
                ((zak0) u8i0Var2.k).setValue(new l5g(j4));
                ((zak0) u8i0Var2.l).setValue(f);
                ((zak0) u8i0Var2.m).setValue(aVar3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return u8i0Var2;
            }
        }
    }

    public abstract void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);

    public final boolean b() {
        return ((Boolean) ((zak0) this.a).getValue()).booleanValue();
    }
}
