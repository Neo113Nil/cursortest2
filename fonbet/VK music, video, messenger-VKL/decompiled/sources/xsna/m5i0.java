package xsna;

import com.vk.core.compose.component.defaults.SegmentSize;

/* compiled from: VkSegmentedControlDefaults.kt */
/* loaded from: classes17.dex */
public abstract class m5i0 {
    public final float a;

    public m5i0() {
        float f = kqu0.a;
        this.a = kqu0.q;
    }

    public static float a(androidx.compose.runtime.a aVar) {
        float f;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1872115306, 0, -1, "com.vk.core.compose.component.defaults.SegmentedControlDefaults.contentAlpha (VkSegmentedControlDefaults.kt:63)");
        }
        if (((Boolean) aVar.r(bjv0.a)).booleanValue()) {
            aVar.K(-488485135);
            f = ((Number) aVar.r(hfj.a)).floatValue();
            aVar.j();
        } else {
            aVar.K(-1198803016);
            aVar.j();
            f = 0.64f;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f;
    }

    public abstract float b(androidx.compose.runtime.a aVar);

    public abstract long c(androidx.compose.runtime.a aVar);

    public abstract float d(androidx.compose.runtime.a aVar);

    public abstract float e(SegmentSize segmentSize);

    public abstract uog0 f(androidx.compose.runtime.a aVar);

    public abstract uog0 g(androidx.compose.runtime.a aVar);
}
