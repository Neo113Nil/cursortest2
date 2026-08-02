package xsna;

import androidx.compose.runtime.a;
import xsna.hsk;
import xsna.p5g;
import xsna.phw;
import xsna.q630;
import xsna.v5g;
import xsna.xpv;

/* compiled from: ProfileAvatar.kt */
/* loaded from: classes5.dex */
public final class wtd0 {
    public static final void a(final lg90 lg90Var, final float f, final float f2, q630 q630Var, final lg90 lg90Var2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        efj a;
        androidx.compose.runtime.a aVar3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(15544133);
        int i5 = i | (M.y(lg90Var) ? 4 : 2);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i3 = i5 | (M.J(q630Var2) ? 2048 : 1024);
        }
        int i7 = i3 | (M.y(lg90Var2) ? 16384 : 8192);
        if (M.t(i7 & 1, (i7 & 9363) != 9362)) {
            q630 q630Var4 = i6 != 0 ? q630.a.a : q630Var2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(15544133, i7, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.photo.avatar.ProfileAvatar (ProfileAvatar.kt:25)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                pco pcoVar = new pco((2 * f2) + f);
                M.R(pcoVar);
                x = pcoVar;
            }
            float f3 = ((pco) x).b;
            z190 z190Var = null;
            if (lg90Var == null) {
                M.K(-780909372);
                M.j();
                a = null;
            } else {
                M.K(-780909371);
                a = phw.a.a(lg90Var, null, null, null, null, M, 196616, 30);
                M.j();
            }
            if (a == null) {
                M.K(-780854718);
                if (lg90Var2 == null) {
                    M.K(-780854719);
                    M.j();
                    aVar3 = M;
                    a = null;
                    i4 = 1040687336;
                } else {
                    M.K(-780854718);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var = rrv0.a;
                    ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    rek0 rek0Var = new rek0(ylu0Var.getImage().b);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    i4 = 1040687336;
                    a = xpv.a.a(lg90Var2, ylu0Var2.getIcon().a, rek0Var, M, 24584, 8);
                    aVar3 = M;
                    aVar3.j();
                }
                aVar3.j();
            } else {
                aVar3 = M;
                i4 = 1040687336;
                aVar3.K(2053019384);
                aVar3.j();
            }
            if (a == null) {
                aVar3.K(2053028344);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(i4, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) aVar3.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a = v5g.a.a(ylu0Var3.getImage().b, aVar3);
                aVar3.j();
            } else {
                aVar3.K(2053019447);
                aVar3.j();
            }
            efj efjVar = a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(i4, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var2 = rrv0.a;
            ylu0 ylu0Var4 = (ylu0) aVar3.r(iyk0Var2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            androidx.compose.runtime.a aVar4 = aVar3;
            p5g a2 = p5g.a.a(f2, 199680, 22, ylu0Var4.getBackground().g, aVar4, false);
            aVar4.K(2053037528);
            if (lg90Var != null && lg90Var2 != null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(i4, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var5 = (ylu0) aVar4.r(iyk0Var2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z190Var = hsk.a.a(lg90Var2, ylu0Var5.getIcon().c, aVar4, 3080, 4);
            }
            aVar4.j();
            if (z190Var == null) {
                z190Var = tgp.a;
            }
            q630Var3 = q630Var4;
            ldu0.b(efjVar, f3, q630Var3, null, a2, false, z190Var, null, null, aVar4, (i7 >> 3) & 896, 424);
            aVar2 = aVar4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var3 = q630Var2;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(f, f2, q630Var3, lg90Var2, i, i2) { // from class: xsna.vtd0
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ q630 e;
                public final /* synthetic */ lg90 f;
                public final /* synthetic */ int g;

                {
                    this.g = i2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(33209);
                    wtd0.a(lg90.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I, this.g);
                    return s3q0.a;
                }
            };
        }
    }
}
