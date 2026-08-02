package xsna;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import xsna.q630;

/* compiled from: BookingServicesBottomBar.kt */
/* loaded from: classes18.dex */
public final class ex7 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final rg50 e;
    public final q630 f;
    public final q630 g;
    public final q630 h;
    public final q630 i;

    public ex7(BookingServicesScreenState.e eVar, String str, gzs<s3q0> gzsVar, boolean z, int i) {
        this.a = androidx.compose.runtime.k.b(eVar);
        this.b = androidx.compose.runtime.k.b(str);
        this.c = androidx.compose.runtime.k.b(gzsVar);
        this.d = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.e = androidx.compose.runtime.i.a(i);
        q630.a aVar = q630.a.a;
        this.f = s200.D(aVar, 16);
        this.g = txj0.v(aVar, 8);
        this.h = txj0.h(aVar, 12);
        this.i = txj0.f(aVar, 1.0f);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-248409765);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-248409765, i2, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesBottomBarImpl.Content (BookingServicesBottomBar.kt:86)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            q630 z = txj0.z(q630Var, null, 3);
            float f = 4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            shu0.a(z, androidx.compose.ui.graphics.e.a, ylu0Var.getBackground().g, 0L, null, f, kai.c(3531562, new zw5(2, this, context), M), M, 1769520, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new dx7(this, q630Var, i, 0);
        }
    }
}
