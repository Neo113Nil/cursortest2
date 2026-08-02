package xsna;

import java.util.List;

/* compiled from: VkResizablePicture.kt */
/* loaded from: classes17.dex */
public final class yfv0 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ efj d;
    public final /* synthetic */ List e;
    public final /* synthetic */ k18 f;
    public final /* synthetic */ jai g;

    public yfv0(float f, float f2, efj efjVar, List list, k18 k18Var, jai jaiVar) {
        this.b = f;
        this.c = f2;
        this.d = efjVar;
        this.e = list;
        this.f = k18Var;
        this.g = jaiVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1790324248, intValue, -1, "com.vk.core.compose.component.image.ResizableSubcomposable.<anonymous>.<anonymous> (VkResizablePicture.kt:80)");
            }
            long b = byc0.b(this.b, this.c);
            aVar2.K(191004886);
            ldu0.a(this.d, Math.min(uco.c(b), uco.b(b)), this.e, null, this.f, false, tgp.a, null, this.g, aVar2, 196608, 8);
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
