package xsna;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.topbar.d;
import xsna.q630;

/* compiled from: CatalogSectionScreenView.kt */
/* loaded from: classes16.dex */
public final class vfa {
    public static final void a(final bga bgaVar, final wfa wfaVar, final izs izsVar, final ksr ksrVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-117439434);
        if ((i & 6) == 0) {
            i2 = (M.J(bgaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(wfaVar) : M.y(wfaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(ksrVar) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-117439434, i3, -1, "com.vk.catalog.mvi.section.screen.impl.ui.CatalogSectionScreenView (CatalogSectionScreenView.kt:26)");
            }
            q630.a aVar3 = q630.a.a;
            aVar2 = M;
            phv0.b(aVar3, kai.c(-1080587121, new io7(2, izsVar, wfaVar), M), null, null, null, 0, 0L, 0L, kai.c(621187930, new yzs() { // from class: xsna.sfa
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    s890 s890Var = (s890) obj;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar4.J(s890Var) ? 4 : 2;
                    }
                    if (aVar4.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(621187930, intValue, -1, "com.vk.catalog.mvi.section.screen.impl.ui.CatalogSectionScreenView.<anonymous> (CatalogSectionScreenView.kt:56)");
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630 m = hr80.m(q630.a.a, ylu0Var.getHeader().a, androidx.compose.ui.graphics.e.a);
                        sga sgaVar = wfa.this.b;
                        izs izsVar2 = izsVar;
                        boolean J = aVar4.J(izsVar2);
                        Object x = aVar4.x();
                        if (J || x == a.C0011a.a) {
                            x = new p0(izsVar2, 2);
                            aVar4.R(x);
                        }
                        bgaVar.c(s890Var, sgaVar, (izs) x, ksrVar, m, aVar4, intValue & 14);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, ((i3 >> 12) & 14) | 805306416, IronSourceError.ERROR_CODE_INIT_FAILED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new tfa(i, 0, bgaVar, wfaVar, ksrVar, q630Var2, izsVar);
        }
    }

    public static final d.b.a b(e7a e7aVar, int i, izs izsVar, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(231620533, 48, -1, "com.vk.catalog.mvi.section.screen.impl.ui.extraIcon (CatalogSectionScreenView.kt:83)");
        }
        lg90 a = pg90.a(e7aVar.a, 0, aVar);
        String str = e7aVar.b;
        boolean J = aVar.J(izsVar);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            x = new ufa(i, 0, izsVar);
            aVar.R(x);
        }
        d.b.a a2 = d.b.a.C0757a.a(a, str, (gzs) x, null, null, null, aVar, 12582920, 120);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a2;
    }
}
