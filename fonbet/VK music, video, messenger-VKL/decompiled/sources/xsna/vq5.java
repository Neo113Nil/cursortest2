package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.ImageSize;
import com.vkontakte.android.R;
import java.util.Collection;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.hr5;
import xsna.ir5;
import xsna.q630;
import xsna.yjq0;

/* compiled from: AvatarContainer.kt */
/* loaded from: classes5.dex */
public final class vq5 {
    public static final float a = 100;
    public static final float b = 4;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final izs izsVar, final q630 q630Var, final gzs gzsVar, final ir5 ir5Var, yjq0.b bVar, androidx.compose.runtime.a aVar, final int i) {
        yjq0.b bVar2;
        int i2;
        lg90 lg90Var;
        Object x;
        int i3;
        Object x2;
        izs izsVar2;
        boolean J;
        Object x3;
        int i4;
        Object x4;
        androidx.compose.runtime.a M = aVar.M(161412229);
        int i5 = i | (M.y(izsVar) ? 4 : 2) | (M.J(q630Var) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.J(ir5Var) ? 2048 : 1024) | (M.J(bVar) ? 16384 : 8192);
        if (M.t(i5 & 1, (i5 & 9363) != 9362)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(161412229, i5, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.photo.avatar.AvatarContainer (AvatarContainer.kt:46)");
            }
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            lg90 lg90Var2 = null;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar3 = cri.a.g;
            k9q0.w(M, valueOf, bVar3);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            ty6 ty6Var2 = dt1.a.i;
            ra8 ra8Var = ra8.a;
            q630.a aVar3 = q630.a.a;
            eq5.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 2, M, txj0.h(ra8Var.b(aVar3, ty6Var2), 52));
            azl azlVar = (azl) M.r(uvi.h);
            boolean J2 = M.J(azlVar);
            Object x5 = M.x();
            Object obj = a.C0011a.a;
            if (J2 || x5 == obj) {
                x5 = Integer.valueOf(azlVar.r0(a));
                M.R(x5);
            }
            int intValue = ((Number) x5).intValue();
            q630 b2 = ra8Var.b(aVar3, ty6Var2);
            cp10 d2 = ja8.d(ty6Var, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, b2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar3, M, c2678a);
            k9q0.w(M, c2, dVar);
            boolean o = M.o(intValue);
            Object x6 = M.x();
            if (o || x6 == obj) {
                x6 = new xev(intValue);
                M.R(x6);
            }
            gzs gzsVar2 = (gzs) x6;
            int i6 = (i5 >> 9) & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(197807933, i6, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.photo.avatar.rememberAvatarPainter (AvatarContainer.kt:141)");
            }
            if (ir5Var instanceof ir5.a) {
                M.K(201162720);
                M.j();
            } else if (ir5Var instanceof ir5.b) {
                M.K(201196728);
                ir5.b bVar4 = (ir5.b) ir5Var;
                boolean J3 = M.J(bVar4.b.a);
                Object x7 = M.x();
                if (J3 || x7 == obj) {
                    x7 = k9q0.d(bVar4.b.a);
                    M.R(x7);
                }
                lg90Var2 = (rc7) x7;
                M.j();
            } else {
                if (!(ir5Var instanceof ir5.c)) {
                    throw alb0.c(1114866783, M);
                }
                M.K(201317318);
                hr5 hr5Var = ((ir5.c) ir5Var).a;
                if (hr5Var instanceof hr5.a) {
                    M.K(201428174);
                    i2 = 0;
                    ImageSize Cb = ((hr5.a) hr5Var).a.Cb(((Number) gzsVar2.invoke()).intValue(), true, false);
                    String str = Cb != null ? Cb.d.d : null;
                    if (str == null) {
                        M.K(201495970);
                    } else {
                        M.K(201495971);
                        lg90Var2 = xus.s(str, 0L, M, 0, 2);
                    }
                    M.j();
                    M.j();
                } else {
                    i2 = 0;
                    if (!(hr5Var instanceof hr5.b)) {
                        throw alb0.c(1114873068, M);
                    }
                    M.K(201641640);
                    hr5.b bVar5 = (hr5.b) hr5Var;
                    boolean J4 = M.J(bVar5.c);
                    Object x8 = M.x();
                    if (J4 || x8 == obj) {
                        x8 = k9q0.d(bVar5.a);
                        M.R(x8);
                    }
                    M.j();
                    lg90Var2 = (rc7) x8;
                }
                M.j();
                lg90Var = lg90Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N = d370.N(R.string.user_profile_accessibility_avatar_editor, i2, M);
                boolean booleanValue = ((Boolean) gzsVar.invoke()).booleanValue();
                x = M.x();
                if (x == obj) {
                    x = ir.h(M);
                }
                sg50 sg50Var = (sg50) x;
                plg0 plg0Var = new plg0(i2);
                int i7 = i5 & 14;
                i3 = i7 != 4 ? 1 : i2;
                x2 = M.x();
                if (i3 == 0 || x2 == obj) {
                    izsVar2 = izsVar;
                    x2 = new oq5(izsVar2, 0);
                    M.R(x2);
                } else {
                    izsVar2 = izsVar;
                }
                q630 b3 = ojc.b(aVar3, sg50Var, null, booleanValue, plg0Var, (gzs) x2, 8);
                J = M.J(N);
                x3 = M.x();
                if (!J || x3 == obj) {
                    x3 = new pq5(N);
                    M.R(x3);
                }
                q630 b4 = egi0.b(b3, true, (izs) x3);
                qzu0.a.getClass();
                wtd0.a(lg90Var, a, b, b4, qzu0.m(M), M, 33208, 0);
                q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 1, aVar3);
                ty6 ty6Var3 = dt1.a.c;
                long floatToRawIntBits = (Float.floatToRawIntBits(i2) << 32) | (Float.floatToRawIntBits(94) & 4294967295L);
                bVar2 = bVar;
                boolean z = (bVar2.b || ((Collection) bVar2.a).isEmpty()) ? i2 : 1;
                i4 = i7 != 4 ? 1 : i2;
                x4 = M.x();
                if (i4 == 0 || x4 == obj) {
                    x4 = new qq5(izsVar2, 0);
                    M.R(x4);
                }
                oqu0.b(z, (gzs) x4, F, ty6Var3, floatToRawIntBits, null, null, false, null, kai.c(1891184971, new rq5(0, bVar2, izsVar2), M), M, 28032, 6, 992);
                M = M;
                if (kr.f(M)) {
                    androidx.compose.runtime.b.e();
                }
            }
            lg90Var = lg90Var2;
            i2 = 0;
            if (androidx.compose.runtime.b.d()) {
            }
            String N2 = d370.N(R.string.user_profile_accessibility_avatar_editor, i2, M);
            boolean booleanValue2 = ((Boolean) gzsVar.invoke()).booleanValue();
            x = M.x();
            if (x == obj) {
            }
            sg50 sg50Var2 = (sg50) x;
            plg0 plg0Var2 = new plg0(i2);
            int i72 = i5 & 14;
            if (i72 != 4) {
            }
            x2 = M.x();
            if (i3 == 0) {
            }
            izsVar2 = izsVar;
            x2 = new oq5(izsVar2, 0);
            M.R(x2);
            q630 b32 = ojc.b(aVar3, sg50Var2, null, booleanValue2, plg0Var2, (gzs) x2, 8);
            J = M.J(N2);
            x3 = M.x();
            if (!J) {
            }
            x3 = new pq5(N2);
            M.R(x3);
            q630 b42 = egi0.b(b32, true, (izs) x3);
            qzu0.a.getClass();
            wtd0.a(lg90Var, a, b, b42, qzu0.m(M), M, 33208, 0);
            q630 F2 = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 1, aVar3);
            ty6 ty6Var32 = dt1.a.c;
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i2) << 32) | (Float.floatToRawIntBits(94) & 4294967295L);
            bVar2 = bVar;
            if (bVar2.b) {
            }
            if (i72 != 4) {
            }
            x4 = M.x();
            if (i4 == 0) {
            }
            x4 = new qq5(izsVar2, 0);
            M.R(x4);
            oqu0.b(z, (gzs) x4, F2, ty6Var32, floatToRawIntBits2, null, null, false, null, kai.c(1891184971, new rq5(0, bVar2, izsVar2), M), M, 28032, 6, 992);
            M = M;
            if (kr.f(M)) {
            }
        } else {
            bVar2 = bVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final yjq0.b bVar6 = bVar2;
            s.d = new wzs(q630Var, gzsVar, ir5Var, bVar6, i) { // from class: xsna.sq5
                public final /* synthetic */ q630 c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ ir5 e;
                public final /* synthetic */ yjq0.b f;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(1);
                    vq5.a(izs.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(String str, final int i, biq0 biq0Var, izs<? super aiq0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(1934048146);
        int i3 = i2 | (M.J(str) ? 4 : 2) | (M.o(i) ? 32 : 16) | (M.J(biq0Var) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1934048146, i3, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.photo.avatar.SettingOption (AvatarContainer.kt:109)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            boolean z = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new ss3(1, izsVar, biq0Var);
                M.R(x);
            }
            q630 c = ojc.c(f, false, null, null, (gzs) x, 15);
            float f2 = 16;
            float f3 = 10;
            q630 G = s200.G(c, f2, f3, f2, f3);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new af2(3);
                M.R(x2);
            }
            ena.a(egi0.b(G, true, (izs) x2), kai.c(-1540498118, new yzs() { // from class: xsna.tq5
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1540498118, intValue, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.photo.avatar.SettingOption.<anonymous> (AvatarContainer.kt:117)");
                        }
                        lg90 a2 = pg90.a(i, 0, aVar2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        pzu0.b(a2, null, txj0.q(s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), 24), ylu0Var.getIcon().a, aVar2, 440, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), kai.c(-490628903, new uq5(str, 0), M), null, M, Tensorflow.FRAME_WIDTH, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new l54(str, i, biq0Var, izsVar, i2);
        }
    }
}
