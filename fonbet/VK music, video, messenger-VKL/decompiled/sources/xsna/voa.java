package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.skeleton.TextType;

/* compiled from: CellSkeleton.kt */
/* loaded from: classes17.dex */
public interface voa {

    /* compiled from: CellSkeleton.kt */
    public static final class a {
        public static ul20 a(fio0 fio0Var, fio0 fio0Var2, fio0 fio0Var3, Cell$Middle.Size size, androidx.compose.runtime.a aVar, int i, int i2) {
            if ((i2 & 2) != 0) {
                fio0Var2 = null;
            }
            if ((i2 & 4) != 0) {
                fio0Var3 = null;
            }
            if ((i2 & 8) != 0) {
                size = Cell$Middle.Size.Medium;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1877307919, i, -1, "com.vk.core.compose.component.cell.skeleton.CellSkeleton.Middle.Companion.invoke (CellSkeleton.kt:116)");
            }
            int i3 = ((i << 3) & 57344) | 6;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1069934358, i3, -1, "com.vk.core.compose.component.cell.skeleton.remember (MiddleImpl.kt:56)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new ul20(fio0Var, fio0Var2, 28);
                aVar.R(x);
            }
            ul20 ul20Var = (ul20) x;
            ((zak0) ul20Var.a).setValue(fio0Var);
            ((zak0) ul20Var.b).setValue(fio0Var2);
            ((zak0) ul20Var.c).setValue(fio0Var3);
            ((zak0) ul20Var.e).setValue(null);
            ((zak0) ul20Var.d).setValue(size);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return ul20Var;
        }
    }

    /* compiled from: CellSkeleton.kt */
    public interface b {
        void a(TextType textType, androidx.compose.runtime.a aVar, int i);
    }

    void a(int i, androidx.compose.runtime.a aVar);
}
