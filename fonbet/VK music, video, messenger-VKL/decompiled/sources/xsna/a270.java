package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collection;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.yjq0;

/* compiled from: NicknameContainer.kt */
/* loaded from: classes5.dex */
public final class a270 {
    public static final void a(String str, yjq0.d dVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1282194415);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1282194415, i2, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.name.NicknameContainer (NicknameContainer.kt:32)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new a97(izsVar, 7);
                M.R(x);
            }
            q630.a aVar4 = q630.a.a;
            q630 c2 = ojc.c(aVar4, false, null, null, (gzs) x, 15);
            String concat = "@".concat(str);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.e0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(concat, c2, ylu0Var.getText().f, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8120);
            ty6 ty6Var = dt1.a.c;
            long floatToRawIntBits = (Float.floatToRawIntBits(0) << 32) | (Float.floatToRawIntBits(((azl) M.r(uvi.h)).j1(cn70.f(14)) + 4) & 4294967295L);
            boolean z2 = dVar.b && !((Collection) dVar.a).isEmpty();
            boolean z3 = i3 == 256;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new b97(izsVar, 4);
                M.R(x2);
            }
            aVar2 = M;
            oqu0.b(z2, (gzs) x2, aVar4, ty6Var, floatToRawIntBits, null, null, false, null, kai.c(951581231, new v9a(2, dVar, izsVar), M), aVar2, 3456, 6, 992);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new z170(i, 0, str, dVar, izsVar, q630Var);
        }
    }

    public static final void b(String str, final int i, jiq0 jiq0Var, izs<? super aiq0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(-1002487587);
        int i3 = i2 | (M.J(str) ? 4 : 2) | (M.o(i) ? 32 : 16) | (M.J(jiq0Var) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1002487587, i3, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.name.SettingOption (NicknameContainer.kt:75)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            boolean z = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new fy0(14, izsVar, jiq0Var);
                M.R(x);
            }
            q630 c = ojc.c(f, false, null, null, (gzs) x, 15);
            float f2 = 16;
            float f3 = 10;
            q630 G = s200.G(c, f2, f3, f2, f3);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new p7x(11);
                M.R(x2);
            }
            ena.a(egi0.b(G, true, (izs) x2), kai.c(-930463611, new yzs() { // from class: xsna.y170
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-930463611, intValue, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.name.SettingOption.<anonymous> (NicknameContainer.kt:83)");
                        }
                        lg90 a = pg90.a(i, 0, aVar2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        pzu0.b(a, null, txj0.q(s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), 24), ylu0Var.getIcon().a, aVar2, 440, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), kai.c(16703332, new coj(str, 3), M), null, M, Tensorflow.FRAME_WIDTH, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new i3h(str, i, jiq0Var, izsVar, i2);
        }
    }
}
