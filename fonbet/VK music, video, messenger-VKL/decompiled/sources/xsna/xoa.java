package xsna;

import androidx.compose.runtime.a;

/* compiled from: CellSkeleton.kt */
/* loaded from: classes17.dex */
public final class xoa {
    public static fio0 a(float f, androidx.compose.runtime.a aVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = Float.NaN;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1187805118, i, -1, "com.vk.core.compose.component.cell.skeleton.CellSkeleton.Middle.TextSkeleton.SingleLineSkeleton.Companion.invoke (CellSkeleton.kt:153)");
        }
        int i3 = ((i << 3) & 112) | 6;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(619500650, i3, -1, "com.vk.core.compose.component.cell.skeleton.remember (TextImpl.kt:99)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new fio0(null, 1, f);
            aVar.R(x);
        }
        fio0 fio0Var = (fio0) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return fio0Var;
    }
}
