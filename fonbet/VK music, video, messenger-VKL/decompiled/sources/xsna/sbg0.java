package xsna;

import androidx.compose.runtime.a;
import xsna.us2;

/* compiled from: ResponseTimeMessageHelper.kt */
/* loaded from: classes18.dex */
public final class sbg0 {
    public static final us2 a(String str, String str2, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1985353195, 0, -1, "com.vk.ecomm.market.good.buildResponseTimeMessage (ResponseTimeMessageHelper.kt:10)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = ylu0Var.getText().l;
        boolean J = aVar.J(str) | aVar.J(str2);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            us2.b bVar = new us2.b();
            bVar.m(new hik0(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            bVar.g(str);
            bVar.j();
            bVar.g(str2);
            x = bVar.n();
            aVar.R(x);
        }
        us2 us2Var = (us2) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return us2Var;
    }
}
