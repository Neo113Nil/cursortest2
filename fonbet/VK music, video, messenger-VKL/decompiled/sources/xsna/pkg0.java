package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: MusicTrackCell.kt */
/* loaded from: classes4.dex */
public final class pkg0 implements com.vk.core.compose.component.cell.content.o {
    public final wh50 a;
    public final wh50 b;
    public final kg50 c;

    public pkg0(us2 us2Var, String str, float f) {
        this.a = androidx.compose.runtime.k.b(us2Var);
        this.b = androidx.compose.runtime.k.b(str);
        this.c = androidx.compose.runtime.d.a(f);
    }

    @Override // com.vk.core.compose.component.cell.content.o
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(243530675);
        if ((i & 384) == 0) {
            i2 = (M.J(this) ? 256 : 128) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 129) != 128)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(243530675, i2, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.RightText.Content (MusicTrackCell.kt:215)");
            }
            us2 us2Var = (us2) ((zak0) this.a).getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.i0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            boolean z = (i2 & 896) == 256;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new rxz(this, 23);
                M.R(x);
            }
            com.vk.core.compose.component.semantics.a a = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
            q630.a aVar3 = q630.a.a;
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar3, a);
            q630 g = b.g(o19.a(aVar3, ((vak0) this.c).getFloatValue()));
            if (g == null) {
                g = b;
            }
            aVar2 = M;
            yqv0.d(us2Var, g, j, 0, null, 0, false, 0, null, null, frv0Var, aVar2, 0, 0, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new nx9(this, spg0Var, q630Var, i, 2);
        }
    }
}
