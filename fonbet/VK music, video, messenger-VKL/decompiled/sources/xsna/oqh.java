package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vungle.ads.internal.protos.Sdk;
import xsna.phw;
import xsna.q630;
import xsna.xpv;

/* compiled from: LazyDsl.kt */
/* loaded from: classes3.dex */
public final class oqh implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wow b;
    public final /* synthetic */ izs c;

    public oqh(wow wowVar, izs izsVar) {
        this.b = wowVar;
        this.c = izsVar;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
        efj a;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        ksy ksyVar2 = ksyVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= aVar2.o(intValue) ? 32 : 16;
        }
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            j9z j9zVar = (j9z) this.b.b.get(intValue);
            aVar2.K(-725656904);
            Object x = aVar2.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = ir.h(aVar2);
            }
            sg50 sg50Var = (sg50) x;
            izs izsVar = this.c;
            boolean J = aVar2.J(izsVar) | aVar2.J(j9zVar);
            Object x2 = aVar2.x();
            if (J || x2 == obj) {
                x2 = new lqh(izsVar, j9zVar);
                aVar2.R(x2);
            }
            q630 b = ojc.b(q630.a.a, sg50Var, null, false, null, (gzs) x2, 28);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1759763401, 0, -1, "com.vk.music.screens.about.provideAvatar (CommunityProfileLinksComponent.kt:99)");
            }
            String str = j9zVar.b;
            if (str == null || str.length() == 0) {
                aVar2.K(740769741);
                qzu0.a.getClass();
                lg90 f = qzu0.f(aVar2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) aVar2.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().n;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar2.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a = xpv.a.a(f, j, new rek0(ylu0Var2.getBackground().x), aVar2, 24584, 8);
                aVar2.j();
            } else {
                aVar2.K(740974062);
                a = phw.a.a(fwu0.l(null, j9zVar.b, null, null, aVar2, 0, 61), null, null, null, null, aVar2, 196616, 30);
                aVar2 = aVar2;
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            androidx.compose.runtime.a aVar3 = aVar2;
            com.vk.core.compose.component.cell.content.t a2 = com.vk.core.compose.component.cell.content.e.a(a, Cell$Left.Main.Size.Small, null, null, null, null, null, aVar3, 100663344, 252);
            androidx.compose.runtime.a aVar4 = aVar3;
            String str2 = j9zVar.c;
            com.vk.core.compose.component.cell.content.h1 h1Var2 = null;
            if (str2 == null) {
                aVar4.K(-725117227);
                aVar4.j();
                h1Var = null;
            } else {
                aVar4.K(-725117226);
                com.vk.core.compose.component.cell.content.h1 a3 = Cell$Middle.d.b.a(str2, null, null, 1, null, null, aVar4, 12610560, 102);
                aVar4 = aVar4;
                aVar4.j();
                h1Var = a3;
            }
            String str3 = j9zVar.d;
            if (str3 == null) {
                aVar4.K(-724834321);
            } else {
                aVar4.K(-724834320);
                androidx.compose.runtime.a aVar5 = aVar4;
                h1Var2 = Cell$Middle.c.b.b(str3, 1, null, null, null, aVar5, 12583344, 120);
                aVar4 = aVar5;
            }
            aVar4.j();
            androidx.compose.runtime.a aVar6 = aVar4;
            wiu0.b(b, false, a2, Cell$Middle.a.a(h1Var, h1Var2, null, null, aVar4, 196608, 28), null, null, null, aVar6, 0, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            aVar6.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
