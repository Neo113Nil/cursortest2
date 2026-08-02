package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.ImageStatus;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.kpv;
import xsna.oe60;
import xsna.phw;
import xsna.q630;

/* compiled from: NewsfeedCoownersListView.kt */
/* loaded from: classes17.dex */
public final class ne60 extends i6v0<oe60, ee60> {
    public final fe60 f;
    public final w620 g;

    public ne60(Context context, ge60 ge60Var, fe60 fe60Var, w620 w620Var) {
        super(context, ge60Var);
        this.f = fe60Var;
        this.g = w620Var;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        j((oe60) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    public final void h(oe60.a.C3451a c3451a, izs<? super ee60, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        Iterator it;
        ?? r0;
        iy5 iy5Var;
        lg90 l;
        lg90 p;
        String str;
        com.vk.core.compose.component.cell.content.x xVar;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        int i2;
        gvm0 gvm0Var;
        Image image;
        ImageSize Cb;
        androidx.compose.runtime.a M = aVar.M(-1295503377);
        int i3 = 256;
        int i4 = i | (M.J(c3451a) ? 4 : 2) | (M.y(this) ? 256 : 128);
        boolean z = true;
        boolean z2 = false;
        if (M.t(i4 & 1, (i4 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1295503377, i4, -1, "com.vk.coowners.presentation.bottomsheet.NewsfeedCoownersListView.Content (NewsfeedCoownersListView.kt:82)");
            }
            wh50 c = jk50.c(c3451a.a, M);
            q630.a aVar2 = q630.a.a;
            float f = 12;
            q630 d = rte0.d(txj0.f(aVar2, 1.0f), vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            String str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 E = ahn.E(hr80.m(d, ylu0Var.getBackground().r, androidx.compose.ui.graphics.e.a), "CoownersList");
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, E);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            i((i4 >> 6) & 14, M);
            M.K(1215739485);
            int i5 = 0;
            for (Iterator it2 = ((List) c.getValue()).iterator(); it2.hasNext(); it2 = it) {
                Object next = it2.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    e43.t();
                    throw null;
                }
                ie60 ie60Var = (ie60) next;
                UserId userId = ie60Var.a;
                Integer num = ie60Var.j;
                M.W(2023124842, userId);
                q630.a aVar4 = aVar2;
                String str3 = str2;
                int i7 = i5;
                androidx.compose.runtime.a aVar5 = M;
                phw a2 = phw.a.a(fwu0.l(null, ie60Var.b, null, null, M, 0, 61), null, null, null, null, aVar5, 196616, 30);
                androidx.compose.runtime.a aVar6 = aVar5;
                Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
                if (ie60Var.c) {
                    aVar6.K(-1707287796);
                    float f2 = 20;
                    long b = byc0.b(f2, f2);
                    qzu0.a.getClass();
                    it = it2;
                    r0 = z2;
                    iy5Var = kpv.a.a(qzu0.t1(aVar6), l5g.k, b, null, false, null, null, aVar6, 100663736, 248);
                    aVar6 = aVar6;
                    aVar6.j();
                } else {
                    it = it2;
                    r0 = z2;
                    aVar6.K(2023143545);
                    aVar6.j();
                    iy5Var = rep.a;
                }
                androidx.compose.runtime.a aVar7 = aVar6;
                com.vk.core.compose.component.cell.content.t a3 = com.vk.core.compose.component.cell.content.e.a(a2, size, iy5Var, null, null, null, null, aVar7, 100663344, 248);
                Cell$Middle.Size size2 = Cell$Middle.Size.Medium;
                String str4 = ie60Var.d;
                ImageStatus imageStatus = ie60Var.f;
                String str5 = (imageStatus == null || (image = imageStatus.d) == 0 || (Cb = image.Cb(16, r0, r0)) == null) ? null : Cb.d.d;
                if (str5 == null) {
                    aVar7.K(-1706540883);
                    aVar7.j();
                    l = null;
                } else {
                    aVar7.K(-1706540882);
                    l = fwu0.l(str5, null, null, null, aVar7, 0, 62);
                    aVar7.j();
                }
                Drawable drawable = ie60Var.e;
                if (drawable == null) {
                    aVar7.K(-1706423238);
                    aVar7.j();
                    p = null;
                } else {
                    aVar7.K(-1706423237);
                    p = w65.p(drawable, aVar7, r0);
                    aVar7.j();
                }
                com.vk.core.compose.component.cell.content.h1 a4 = Cell$Middle.d.b.a(str4, null, new kzk0(l, p), 1, null, null, aVar7, 12610560, 98);
                androidx.compose.runtime.a aVar8 = aVar7;
                String str6 = ie60Var.g;
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (str6 == null) {
                    aVar8.K(-1706220777);
                    aVar8.j();
                    h1Var = null;
                } else {
                    aVar8.K(-1706220776);
                    if (num != null) {
                        aVar8.K(-1586885753);
                        llr0 f3 = mlr0.f(slr0.b(num.intValue(), aVar8), aVar8, r0);
                        str = str3;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, r0, -1, str);
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar8.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        com.vk.core.compose.component.cell.content.x a5 = com.vk.core.compose.component.cell.content.h.a(f3, ylu0Var2.getIcon().n, aVar8, 24584, 12);
                        aVar8 = aVar8;
                        aVar8.j();
                        xVar = a5;
                    } else {
                        str = str3;
                        aVar8.K(-1586520264);
                        aVar8.j();
                        xVar = null;
                    }
                    SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
                    boolean J = aVar8.J(str6);
                    Object x = aVar8.x();
                    if (J || x == c0012a) {
                        x = new ii40(str6, 1);
                        aVar8.R(x);
                    }
                    androidx.compose.runtime.a aVar9 = aVar8;
                    str3 = str;
                    com.vk.core.compose.component.cell.content.h1 b2 = Cell$Middle.c.b.b(str6, 0, xVar, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x, 2), aVar9, 12582912, 86);
                    aVar8 = aVar9;
                    aVar8.j();
                    h1Var = b2;
                }
                com.vk.core.compose.component.cell.content.k0 a6 = Cell$Middle.a.a(a4, h1Var, null, null, aVar8, 199680, 20);
                if (ie60Var.h) {
                    aVar8.K(-1705172945);
                    int i8 = ie60Var.k;
                    int i9 = ie60Var.l;
                    boolean z3 = ie60Var.i;
                    i2 = 256;
                    boolean y = (((i4 & 896) == 256 || aVar8.y(this)) ? true : r0) | aVar8.y(ie60Var);
                    Object x2 = aVar8.x();
                    if (y || x2 == c0012a) {
                        x2 = new ig1(21, this, ie60Var);
                        aVar8.R(x2);
                    }
                    gvm0Var = new gvm0(i8, i9, (gzs) x2, z3);
                    aVar8.j();
                } else {
                    i2 = 256;
                    aVar8.K(-1704824754);
                    aVar8.j();
                    gvm0Var = null;
                }
                boolean y2 = (((i4 & 896) == i2 || aVar8.y(this)) ? true : r0) | aVar8.y(ie60Var);
                Object x3 = aVar8.x();
                if (y2 || x3 == c0012a) {
                    x3 = new p5(17, this, ie60Var);
                    aVar8.R(x3);
                }
                androidx.compose.runtime.a aVar10 = aVar8;
                wiu0.b(ahn.E(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 1, ojc.c(aVar4, false, null, null, (gzs) x3, 15)), "NewsfeedCoownersListAuthor" + i7), false, a3, a6, gvm0Var, null, null, aVar10, 0, 98);
                M = aVar10;
                M.a0();
                aVar2 = aVar4;
                i5 = i6;
                z = true;
                str2 = str3;
                i3 = i2;
                z2 = r0;
            }
            M.j();
            if (xga0.c(aVar2, 8, M, 6)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qi1(i, 2, this, c3451a, izsVar);
        }
    }

    public final void i(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(718548989);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? M.J(this) : M.y(this) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(718548989, i2, -1, "com.vk.coowners.presentation.bottomsheet.NewsfeedCoownersListView.CoownersModalTopBar (NewsfeedCoownersListView.kt:157)");
            }
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.feed_coowners_list_title, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            String N = d370.N(R.string.feed_coowners_accessibility_close, 0, M);
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && M.y(this));
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new rkt(this, 14);
                M.R(x);
            }
            TopBar$Before.d a2 = TopBar$Before.d.a.a(N, (gzs) x, null, null, M, 24576, 12);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().r;
            e.a aVar2 = androidx.compose.ui.graphics.e.a;
            q630.a aVar3 = q630.a.a;
            muv0.h(a, s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, 1, hr80.m(aVar3, j, aVar2)), null, null, null, a2, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8156);
            float f = 16;
            q630 H = s200.H(txj0.f(aVar3, 1.0f), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 6, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            dsn.a(H, ylu0Var2.p().a, (float) 0.5d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 384, 8);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new si1(this, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(oe60 oe60Var, izs<? super ee60, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1579545460);
        int i2 = (M.J(oe60Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1579545460, i2, -1, "com.vk.coowners.presentation.bottomsheet.NewsfeedCoownersListView.ThemedContent (NewsfeedCoownersListView.kt:66)");
            }
            oe60.a.b bVar = oe60.a.b.a;
            oe60.a aVar2 = (oe60.a) d(bVar, (n0u0[]) Arrays.copyOf(new n0u0[]{oe60Var.a}, 1), M, (((((i2 << 3) & 7168) | 6) >> 3) & 896) | 6).getValue();
            if (aVar2 instanceof oe60.a.C3451a) {
                M.K(825184026);
                h((oe60.a.C3451a) aVar2, izsVar, M, i2 & 1008);
                M.j();
            } else {
                if (!epx.f(aVar2, bVar)) {
                    throw alb0.c(825181536, M);
                }
                M.K(825186885);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cqg(i, 6, this, oe60Var, izsVar);
        }
    }
}
