package xsna;

import java.util.List;

/* compiled from: VkSecondaryTabRow.kt */
/* loaded from: classes17.dex */
public final class yiv0 implements zzs<khx, wow<dtn0>, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ zzs<b1i0, wow<dtn0>, androidx.compose.runtime.a, Integer, s3q0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public yiv0(zzs<? super b1i0, ? super wow<dtn0>, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar) {
        this.b = zzsVar;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(khx khxVar, wow<dtn0> wowVar, androidx.compose.runtime.a aVar, Integer num) {
        int i;
        khx khxVar2 = khxVar;
        List<dtn0> list = wowVar.b;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            i = (aVar2.J(khxVar2) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= aVar2.J(list) ? 32 : 16;
        }
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(443366034, i, -1, "com.vk.core.compose.component.VkSecondaryTabRow.<anonymous>.<anonymous> (VkSecondaryTabRow.kt:135)");
            }
            aVar2.K(1293145355);
            this.b.invoke(ziv0.e(khxVar2, aVar2, i & 14), new wow<>(list), aVar2, Integer.valueOf(i & 112));
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
