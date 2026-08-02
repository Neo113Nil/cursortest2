package xsna;

import com.vk.core.compose.component.defaults.PictureRadius;
import java.util.List;

/* compiled from: VkResizablePicture.kt */
/* loaded from: classes17.dex */
public final class dgv0 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ efj d;
    public final /* synthetic */ List e;
    public final /* synthetic */ PictureRadius f;
    public final /* synthetic */ jai g;

    public dgv0(float f, float f2, efj efjVar, List list, PictureRadius pictureRadius, jai jaiVar) {
        this.b = f;
        this.c = f2;
        this.d = efjVar;
        this.e = list;
        this.f = pictureRadius;
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
            aVar2.K(-460770530);
            gdv0.d(this.d, b, this.e, null, this.f, tgp.a, this.g, aVar2, 0, 8);
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
