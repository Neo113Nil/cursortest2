package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.external.miniapp.net.app.WebImageSize;
import xsna.dt1;
import xsna.phw;

/* compiled from: MyGamesSectionHolder.kt */
/* loaded from: classes17.dex */
public final class mo50 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ko50 ko50Var, rha rhaVar, izs izsVar, xvy xvyVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        gxb0 gxb0Var;
        izs izsVar2;
        androidx.compose.runtime.a M = aVar.M(-2096932324);
        if ((i & 6) == 0) {
            i2 = (M.J(ko50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(rhaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(xvyVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2096932324, i2, -1, "com.vk.games.presentation.components.sections.MyGamesSectionHolder (MyGamesSectionHolder.kt:50)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                M.R(x2);
            }
            kg50 kg50Var = (kg50) x2;
            iyk0 iyk0Var = uvi.h;
            float k1 = ((azl) M.r(iyk0Var)).k1(kg50Var.getFloatValue());
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.i.a(0);
                M.R(x3);
            }
            rg50 rg50Var = (rg50) x3;
            float j1 = ((azl) M.r(iyk0Var)).j1(rg50Var.getIntValue());
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new nuv(wh50Var, 15);
                M.R(x4);
            }
            gzs gzsVar = (gzs) x4;
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.d;
            long floatToRawIntBits = (Float.floatToRawIntBits(-8) << 32) | (Float.floatToRawIntBits(k1 - (j1 / 2)) & 4294967295L);
            gxb0 gxb0Var2 = new gxb0(false, false, 22);
            int i3 = i2 & 896;
            int i4 = i2 & 14;
            boolean z = (i3 == 256) | (i4 == 4);
            Object x5 = M.x();
            if (z || x5 == c0012a) {
                gxb0Var = gxb0Var2;
                x5 = new eo3(izsVar, ko50Var, wh50Var, 9);
                M.R(x5);
            } else {
                gxb0Var = gxb0Var2;
            }
            aou0.g(booleanValue, gzsVar, null, ty6Var, floatToRawIntBits, gxb0Var, null, (izs) x5, M, 199728, 196);
            float f = 72;
            PictureRadius pictureRadius = PictureRadius.Large;
            WebImageSize f2 = ko50Var.a.a.d.b.f(100);
            String str = f2 != null ? f2.b : null;
            if (str == null) {
                str = "";
            }
            com.vk.core.compose.component.cell.content.z b = com.vk.core.compose.component.cell.content.g.b(phw.a.a(fwu0.l(null, str, null, null, M, 0, 61), null, null, null, null, M, 196616, 30), f, null, pictureRadius, null, null, M, 108);
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = new s1x(wh50Var, 16);
                M.R(x6);
            }
            com.vk.core.compose.component.cell.content.w0 a = com.vk.core.compose.component.cell.content.r.a(null, (gzs) x6, 0L, null, M, 24624, 13);
            com.vk.core.compose.component.cell.content.h1 a2 = Cell$Middle.d.b.a(ko50Var.c, null, null, 1, null, null, M, 12610560, 102);
            com.vk.core.compose.component.cell.content.h1 b2 = Cell$Middle.c.b.b(ko50Var.d, 1, null, null, null, M, 12583344, 120);
            q630 f3 = txj0.f(q630Var, 1.0f);
            Object x7 = M.x();
            if (x7 == c0012a) {
                x7 = new ea3(wh50Var, rg50Var, kg50Var, 6);
                M.R(x7);
            }
            q630 o = egi.o(f3, (izs) x7);
            boolean z2 = rhaVar.b;
            float f4 = rhaVar.c;
            boolean z3 = (i4 == 4) | (i3 == 256);
            Object x8 = M.x();
            if (z3 || x8 == c0012a) {
                izsVar2 = izsVar;
                x8 = new com.vk.movika.sdk.base.flow.binding.g(16, izsVar2, ko50Var);
                M.R(x8);
            } else {
                izsVar2 = izsVar;
            }
            gzs gzsVar2 = (gzs) x8;
            boolean z4 = (i3 == 256) | (i4 == 4);
            Object x9 = M.x();
            if (z4 || x9 == c0012a) {
                x9 = new defpackage.e0(16, izsVar2, ko50Var);
                M.R(x9);
            }
            izs izsVar3 = izsVar2;
            q630 f5 = vbh0.f(o, z2, xvyVar, 0.3f, f4, null, gzsVar2, (gzs) x9, 48);
            com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(a2, b2, null, null, M, 196608, 28);
            boolean z5 = (i3 == 256) | (i4 == 4);
            Object x10 = M.x();
            if (z5 || x10 == c0012a) {
                x10 = new defpackage.f0(18, izsVar3, ko50Var);
                M.R(x10);
            }
            wiu0.b(f5, false, b, a3, a, (gzs) x10, null, M, 0, 66);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xju(ko50Var, rhaVar, izsVar, xvyVar, q630Var, i);
        }
    }
}
