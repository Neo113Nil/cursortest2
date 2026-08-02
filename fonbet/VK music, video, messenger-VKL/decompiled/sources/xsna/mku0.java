package xsna;

/* compiled from: VkCircularProgressIndicator.kt */
/* loaded from: classes17.dex */
public final class mku0 {
    public static final void a(float f, int i, int i2, long j, androidx.compose.runtime.a aVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        long j2;
        if ((i2 & 2) != 0) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            aVar2 = aVar;
            ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j2 = ylu0Var.getText().m;
        } else {
            aVar2 = aVar;
            j2 = j;
        }
        if ((i2 & 4) != 0) {
            f = k2e0.a;
        }
        float f2 = f;
        long j3 = l5g.j;
        int i3 = (i2 & 16) != 0 ? 2 : 1;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-476054305, i, -1, "com.vk.core.compose.component.VkCircularProgressIndicator (VkCircularProgressIndicator.kt:21)");
        }
        x2e0.b(q630Var, j2, f2, j3, i3, aVar2, i & 65534, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }
}
