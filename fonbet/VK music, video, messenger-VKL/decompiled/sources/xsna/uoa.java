package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.defaults.PictureRadius;

/* compiled from: CellSkeleton.kt */
/* loaded from: classes17.dex */
public final class uoa {
    public static olg a(Cell$Left.Main.Size size, PictureRadius pictureRadius, androidx.compose.runtime.a aVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            pictureRadius = PictureRadius.Medium;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-444451187, i, -1, "com.vk.core.compose.component.cell.skeleton.CellSkeleton.Left.Main.Picture.Companion.invoke (CellSkeleton.kt:62)");
        }
        fvr.n();
        com.vk.core.compose.component.defaults.c cVar = com.vk.core.compose.component.defaults.c.a;
        float e = cVar.e(size, aVar, 6);
        int i3 = ((i << 3) & 896) | 6;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(419761678, i3, -1, "com.vk.core.compose.component.cell.skeleton.remember (CommonPictureImpl.kt:51)");
        }
        fvr.n();
        cVar.d(aVar);
        float f = kqu0.s;
        int i4 = i3 & 8064;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(390746974, i4, -1, "com.vk.core.compose.component.cell.skeleton.rememberInternal (CommonPictureImpl.kt:64)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new olg(e, pictureRadius);
            aVar.R(x);
        }
        olg olgVar = (olg) x;
        ((zak0) olgVar.b).setValue(new pco(e));
        ((zak0) olgVar.c).setValue(new pco(f));
        ((zak0) olgVar.d).setValue(pictureRadius);
        ((zak0) olgVar.a).setValue(null);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return olgVar;
    }
}
