package xsna;

import java.util.List;

/* compiled from: VkDefaultTabRow.kt */
/* loaded from: classes17.dex */
public final class spu0 implements zzs<khx, wow<dtn0>, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ zzs<vnl, wow<dtn0>, androidx.compose.runtime.a, Integer, s3q0> d;

    /* JADX WARN: Multi-variable type inference failed */
    public spu0(boolean z, int i, zzs<? super vnl, ? super wow<dtn0>, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar) {
        this.b = z;
        this.c = i;
        this.d = zzsVar;
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
                androidx.compose.runtime.b.f(-304771365, i, -1, "com.vk.core.compose.component.VkDefaultScrollableTabRow.<anonymous>.<anonymous> (VkDefaultTabRow.kt:237)");
            }
            if (this.b && this.c == 0) {
                aVar2.K(108125639);
            } else {
                aVar2.K(117240786);
                this.d.invoke(vpu0.d(khxVar2, aVar2, i & 14), new wow<>(list), aVar2, Integer.valueOf(i & 112));
            }
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
