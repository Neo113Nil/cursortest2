package xsna;

/* compiled from: SexyCell.kt */
/* loaded from: classes17.dex */
public final class f4j0 {
    public static com.vk.core.compose.component.cell.content.x a(lg90 lg90Var, float f, long j, androidx.compose.runtime.a aVar, int i, int i2) {
        float f2 = (i2 & 2) != 0 ? 28 : f;
        long j2 = (i2 & 4) != 0 ? l5g.k : j;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1450372836, i, -1, "com.vk.core.compose.component.cell.content.SexyCell.SideSlot.Icon.Companion.invoke (SexyCell.kt:382)");
        }
        long b = byc0.b(f2, f2);
        int i3 = i << 3;
        int i4 = (i & 896) | ((i >> 15) & 14) | 64 | (i3 & 112) | (57344 & i3) | (i3 & 458752);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1987254924, i4, -1, "com.vk.core.compose.component.cell.content.remember (CommonIconImpl.kt:227)");
        }
        uco ucoVar = new uco(b);
        int i5 = i4 >> 3;
        com.vk.core.compose.component.cell.content.x a = com.vk.core.compose.component.cell.content.y.a(lg90Var, j2, ucoVar, null, null, null, null, aVar, (i5 & 112) | (i5 & 14) | 8 | ((i4 << 3) & 458752) | ((i4 << 6) & 29360128), 88);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }
}
