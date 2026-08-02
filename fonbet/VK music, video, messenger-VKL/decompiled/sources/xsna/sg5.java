package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;
import java.util.List;
import xsna.q630;

/* compiled from: LazyDsl.kt */
/* loaded from: classes15.dex */
public final class sg5 implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ List b;
    public final /* synthetic */ izs c;

    public sg5(List list, izs izsVar) {
        this.b = list;
        this.c = izsVar;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
        String F;
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
                androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            ug5 ug5Var = (ug5) this.b.get(intValue);
            aVar2.K(-214223674);
            q630 f = txj0.f(q630.a.a, 1.0f);
            izs izsVar = this.c;
            boolean J = aVar2.J(izsVar) | aVar2.J(ug5Var);
            Object x = aVar2.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                x = new pg5(izsVar, ug5Var);
                aVar2.R(x);
            }
            q630 c = ojc.c(f, false, null, null, (gzs) x, 15);
            Object x2 = aVar2.x();
            if (x2 == obj) {
                x2 = qg5.c;
                aVar2.R(x2);
            }
            q630 E = s200.E(egi0.b(c, true, (izs) x2), 20, 14);
            if (ug5Var.a == 0) {
                F = zq.a(aVar2, -213931965, R.string.bl_auto_lock_time_immediate, aVar2, 0);
            } else {
                aVar2.K(-213830688);
                int i2 = ug5Var.a;
                F = d370.F(R.plurals.bl_auto_lock_time, i2, new Object[]{Integer.valueOf(i2)}, aVar2, 0);
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(F, E, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.X, aVar2, 0, 0, 8184);
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
