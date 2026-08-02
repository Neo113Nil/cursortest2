package xsna;

import java.util.List;

/* compiled from: VkSecondaryTabRow.kt */
/* loaded from: classes17.dex */
public final class wiv0 implements zzs<b1i0, wow<dtn0>, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ mc90 b;

    public wiv0(mc90 mc90Var) {
        this.b = mc90Var;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(b1i0 b1i0Var, wow<dtn0> wowVar, androidx.compose.runtime.a aVar, Integer num) {
        int i;
        b1i0 b1i0Var2 = b1i0Var;
        List list = wowVar.b;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            i = (aVar2.J(b1i0Var2) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= aVar2.J(list) ? 32 : 16;
        }
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1521782921, i, -1, "com.vk.core.compose.component.VkSecondaryTabRow.<anonymous> (VkSecondaryTabRow.kt:88)");
            }
            b1i0Var2.b(this.b, list, aVar2, (i & 112) | ((i << 6) & 896));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
