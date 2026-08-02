package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMarkerType;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import kotlin.Pair;
import xsna.q630;

/* compiled from: ClipCtaWithDonutComposeContent.kt */
/* loaded from: classes16.dex */
public final class h6v implements Cell$Middle.d {
    public final String a;

    public h6v(String str) {
        this.a = str;
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Middle.d, com.vk.core.compose.component.cell.content.Cell$Middle.c, com.vk.core.compose.component.cell.content.Cell$Middle.b
    public final void c(q630 q630Var, final Cell$Middle.Size size, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1551859785);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(size.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1551859785, i2, -1, "com.vk.clips.attachments.impl.publish.cta.donut.presentation.compose.HighlightedTitle.Content (ClipCtaWithDonutComposeContent.kt:230)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                String str = this.a;
                x = new v5v(str, new Pair(0, Integer.valueOf(str.length())));
                M.R(x);
            }
            final v5v v5vVar = (v5v) x;
            d8v0.a(v5vVar.b, q630Var, VkOnboarding$HighlighterMarkerType.Type1, VkOnboarding$TintColor.Lime, false, true, false, null, kai.c(1977071987, new zzs() { // from class: xsna.w5v
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i3;
                    izs izsVar = (izs) obj;
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        i3 = (aVar2.y(izsVar) ? 4 : 2) | intValue;
                    } else {
                        i3 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i3 |= aVar2.l(booleanValue) ? 32 : 16;
                    }
                    int i4 = i3;
                    if (aVar2.t(i4 & 1, (i4 & 147) != 146)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1977071987, i4, -1, "com.vk.clips.attachments.impl.publish.cta.donut.presentation.compose.HighlightedTitle.Content.<anonymous> (ClipCtaWithDonutComposeContent.kt:241)");
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        iyk0 iyk0Var = rrv0.a;
                        ylu0 ylu0Var = (ylu0) aVar2.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        boolean s = true ^ ylu0Var.s();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar2.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var2.getText().o;
                        bpn0 bpn0Var = v5v.c;
                        Cell$Middle.d.b.b(d8v0.c(v5v.this, booleanValue, s, j, aVar2, i4 & 112), null, null, null, 2, 2, null, null, izsVar, aVar2, ((i4 << 27) & 1879048192) | 221184, 6, 462).c(q630.a.a, size, aVar2, 6);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 << 3) & 112) | 805506432, 464);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new py9(this, q630Var, size, i);
        }
    }
}
