package xsna;

import java.util.List;

/* compiled from: VkDefaultTabRow.kt */
/* loaded from: classes17.dex */
public final class tpu0 implements zzs<vnl, wow<dtn0>, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ int b;

    public tpu0(int i) {
        this.b = i;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(vnl vnlVar, wow<dtn0> wowVar, androidx.compose.runtime.a aVar, Integer num) {
        int i;
        vnl vnlVar2 = vnlVar;
        List<dtn0> list = wowVar.b;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            i = (aVar2.J(vnlVar2) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= aVar2.J(list) ? 32 : 16;
        }
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-655940884, i, -1, "com.vk.core.compose.component.VkDefaultTabRow.<anonymous> (VkDefaultTabRow.kt:127)");
            }
            dtn0 dtn0Var = list.get(this.b);
            vnlVar2.a(dtn0Var.a, dtn0Var.b, aVar2, (i << 6) & 896);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
