package xsna;

import androidx.compose.runtime.a;
import java.util.List;
import xsna.rco0;

/* compiled from: ContextMenuScreenContent.kt */
/* loaded from: classes18.dex */
public final class toj implements znj {
    public static final toj b = new toj();

    @Override // xsna.znj
    public final void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        float f;
        rco0 rco0Var;
        List list;
        wep wepVar;
        jai jaiVar;
        androidx.compose.runtime.a M = aVar.M(1030541658);
        int i3 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1030541658, i3, -1, "com.vk.design.demo.presentation.screens.legacyMenuScopeContent.<anonymous>.<no name provided>.Content (ContextMenuScreenContent.kt:1178)");
            }
            lzo0 d = nzo.d(3078, 6, M, "Avatar", false);
            rco0 b2 = rco0.a.b(new y7z(e43.l(new l5g(l5g.h), new l5g(l5g.e)), null, 0L, 9187343241974906880L, 0), "VK", M, 3126);
            float f2 = 48;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1962975051, 48, -1, "com.vk.core.compose.component.image.badge.WebOnlineBadge.Companion.invoke (WebOnlineBadge.kt:61)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new dhx0();
                M.R(x);
            }
            dhx0 dhx0Var = (dhx0) x;
            ((zak0) dhx0Var.a).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            jai jaiVar2 = crx0.g;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1393171381, 805306416, -1, "com.vk.core.compose.component.context.menu.ContextMenuItem.Left.Avatar.Companion.invoke (ContextMenuItem.kt:206)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1360908578, 390, -1, "com.vk.core.compose.component.context.menu.remember (AvatarImpl.kt:67)");
            }
            List u0 = rl3.u0(new m2k0[]{dhx0Var});
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1785227845, 390, -1, "com.vk.core.compose.component.context.menu.remember (AvatarImpl.kt:79)");
            }
            Object x2 = M.x();
            wep wepVar2 = wep.a;
            tgp tgpVar = tgp.a;
            if (x2 == c0012a) {
                rr5 rr5Var = new rr5(b2, f2, u0, wepVar2, tgpVar, jaiVar2);
                rco0Var = b2;
                f = f2;
                list = u0;
                wepVar = wepVar2;
                jaiVar = jaiVar2;
                M.R(rr5Var);
                x2 = rr5Var;
            } else {
                f = f2;
                rco0Var = b2;
                list = u0;
                wepVar = wepVar2;
                jaiVar = jaiVar2;
            }
            rr5 rr5Var2 = (rr5) x2;
            i2 = 1;
            ((zak0) rr5Var2.g).setValue(null);
            ((zak0) rr5Var2.a).setValue(rco0Var);
            ((zak0) rr5Var2.b).setValue(new pco(f));
            ((zak0) rr5Var2.f).setValue(tgpVar);
            ((zak0) rr5Var2.d).setValue(wepVar);
            ((zak0) rr5Var2.h).setValue(jaiVar);
            ((zak0) rr5Var2.e).setValue(true);
            ((zak0) rr5Var2.c).setValue(new wow(list));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new x5(13);
                M.R(x3);
            }
            aou0.d(znjVar, (gzs) x3, null, null, false, rr5Var2, d, null, M, (i3 & 14) | 48, 78);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            i2 = 1;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lug(this, znjVar, i, i2);
        }
    }
}
