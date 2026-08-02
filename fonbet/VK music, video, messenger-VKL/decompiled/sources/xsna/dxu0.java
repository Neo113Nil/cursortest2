package xsna;

import android.graphics.drawable.GradientDrawable;

/* compiled from: VkGradients.kt */
/* loaded from: classes17.dex */
public final class dxu0 {
    public static ue2 a(GradientDrawable.Orientation orientation, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1394024127, 6, -1, "com.vk.core.compose.gradients.generated.VkGradients.gradient (VkGradients.kt:366)");
        }
        l5g l5gVar = new l5g(l5g.j);
        long j = wlb0.h(aVar).getBackground().g;
        l5g l5gVar2 = new l5g(l5g.c(14, j, l5g.e(j) * 0.05f));
        long j2 = wlb0.h(aVar).getBackground().g;
        l5g l5gVar3 = new l5g(l5g.c(14, j2, l5g.e(j2) * 0.2f));
        long j3 = wlb0.h(aVar).getBackground().g;
        l5g l5gVar4 = new l5g(l5g.c(14, j3, l5g.e(j3) * 0.8f));
        long j4 = wlb0.h(aVar).getBackground().g;
        ue2 a = ve2.a(orientation, e43.l(l5gVar, l5gVar2, l5gVar3, l5gVar4, new l5g(l5g.c(14, j4, l5g.e(j4) * 0.95f)), new l5g(wlb0.h(aVar).getBackground().g)), null, 12);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }

    public static ue2 b() {
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1642487068, 6, -1, "com.vk.core.compose.gradients.generated.VkGradients.gradientBlack (VkGradients.kt:414)");
        }
        ue2 a = ve2.a(orientation, e43.l(new l5g(f870.c(0)), new l5g(f870.c(83886080)), new l5g(f870.c(335544320)), new l5g(f870.c(1375731712)), new l5g(f870.c(1627389952)), new l5g(f870.c(1711276032))), null, 12);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }
}
