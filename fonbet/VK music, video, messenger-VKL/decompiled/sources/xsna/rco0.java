package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.dt1;
import xsna.zr5;

/* compiled from: TextContent.kt */
/* loaded from: classes17.dex */
public final class rco0 implements efj {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c = androidx.compose.runtime.k.b(null);

    /* compiled from: TextContent.kt */
    public static final class a {
        public static rco0 a(zr5 zr5Var, String str, androidx.compose.runtime.a aVar, int i) {
            yk8 yk8Var;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-960679397, i, -1, "com.vk.core.compose.component.image.content.TextContent.Companion.invoke (TextContent.kt:90)");
            }
            zm20 A = f870.A();
            int i2 = i & 14;
            A.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2139639381, i2, -1, "com.vk.core.compose.component.defaults.AvatarDefault.gradientBackground (VkAvatarDefault.kt:141)");
            }
            if (zr5Var instanceof zr5.b) {
                aVar.K(-1095885127);
                long j = ((zr5.b) zr5Var).a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1468860197, 0, -1, "com.vk.core.compose.component.defaults.AvatarDefault.dialogGradient (VkAvatarDefault.kt:154)");
                }
                boolean p = aVar.p(j);
                yk8 x = aVar.x();
                if (p || x == a.C0011a.a) {
                    x = A.c.get((int) (j % r6.size()));
                    aVar.R(x);
                }
                yk8Var = (yk8) x;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            } else if (zr5Var.equals(zr5.a.a)) {
                aVar.K(-1095882771);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1152204962, 0, -1, "com.vk.core.compose.component.defaults.AvatarDefault.contactProfileGradient (VkAvatarDefault.kt:151)");
                }
                yk8Var = A.b;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            } else {
                if (!zr5Var.equals(zr5.c.a)) {
                    throw alb0.c(-1095886857, aVar);
                }
                aVar.K(-1095880787);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-590527304, 0, -1, "com.vk.core.compose.component.defaults.AvatarDefault.unknownProfileGradient (VkAvatarDefault.kt:148)");
                }
                yk8Var = A.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            rco0 b = b(yk8Var, str, aVar, (i & 112) | 3072);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return b;
        }

        public static rco0 b(yk8 yk8Var, String str, androidx.compose.runtime.a aVar, int i) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1777663990, i, -1, "com.vk.core.compose.component.image.content.TextContent.Companion.invoke (TextContent.kt:80)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new rco0(yk8Var, str);
                aVar.R(x);
            }
            rco0 rco0Var = (rco0) x;
            ((zak0) rco0Var.a).setValue(yk8Var);
            ((zak0) rco0Var.b).setValue(str);
            ((zak0) rco0Var.c).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return rco0Var;
        }
    }

    public rco0(yk8 yk8Var, String str) {
        this.a = androidx.compose.runtime.k.b(yk8Var);
        this.b = androidx.compose.runtime.k.b(str);
    }

    @Override // xsna.efj
    public final void a(final int i, final long j, androidx.compose.runtime.a aVar, final q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(402708404);
        if ((i & 48) == 0) {
            i2 = (M.J(q630Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(402708404, i2, -1, "com.vk.core.compose.component.image.content.TextContent.invoke (TextContent.kt:41)");
            }
            q630 l = hr80.l(txj0.d(com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.c).getValue()), 1.0f), (yk8) ((zak0) this.a).getValue(), null, 6);
            dt1.a.getClass();
            ua8.a(l, dt1.a.f, false, kai.c(-491427318, new myq(this, 1), M), M, 3120, 4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.pco0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    rco0.this.a(I, j, (androidx.compose.runtime.a) obj, q630Var);
                    return s3q0.a;
                }
            };
        }
    }
}
