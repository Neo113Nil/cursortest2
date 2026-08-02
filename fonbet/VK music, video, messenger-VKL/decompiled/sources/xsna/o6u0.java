package xsna;

import java.util.List;

/* compiled from: VkAccentTabRow.kt */
/* loaded from: classes17.dex */
public final class o6u0 implements zzs<yi, wow<dtn0>, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ yjl b;

    public o6u0(yjl yjlVar) {
        this.b = yjlVar;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(yi yiVar, wow<dtn0> wowVar, androidx.compose.runtime.a aVar, Integer num) {
        int i;
        yi yiVar2 = yiVar;
        List list = wowVar.b;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            i = (aVar2.J(yiVar2) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= aVar2.J(list) ? 32 : 16;
        }
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-605713554, i, -1, "com.vk.core.compose.component.VkAccentScrollableTabRow.<anonymous> (VkAccentTabRow.kt:171)");
            }
            yiVar2.a(this.b, list, aVar2, (i & 112) | ((i << 6) & 896));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
