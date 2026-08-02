package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: ColorChooseCell.kt */
/* loaded from: classes5.dex */
public final class s5g {
    public static final void a(int i, long j, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-2101568759);
        int i2 = i | (M.p(j) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2101568759, i2, -1, "com.vk.settings.impl.presentation.base.view.ColorChooseCell (ColorChooseCell.kt:26)");
            }
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new q5g(0, gzsVar);
                M.R(x);
            }
            q630.a aVar2 = q630.a.a;
            float f = 24;
            wiu0.b(ojc.c(aVar2, false, null, null, (gzs) x, 15), false, null, Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.sett_led_color, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, M, 196608, 30), o.c.a(null, com.vk.core.compose.component.cell.content.p.a(new qcc(j), 0L, byc0.b(f, f), null, null, null, M, 1573248, 58), null, null, null, M, 61), null, null, M, 0, 102);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new r5g(j, gzsVar, q630Var2, i);
        }
    }
}
