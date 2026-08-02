package xsna;

import android.view.View;
import java.util.WeakHashMap;
import xsna.yqx0;

/* compiled from: ModalBottomSheet.kt */
/* loaded from: classes11.dex */
public final class bx20 implements wzs<androidx.compose.runtime.a, Integer, zpx0> {
    public static final bx20 b = new bx20();

    @Override // xsna.wzs
    public final zpx0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        aVar2.K(-511854661);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-511854661, intValue, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:134)");
        }
        float f = a88.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-511309409, 6, -1, "androidx.compose.material3.BottomSheetDefaults.<get-windowInsets> (SheetDefaults.kt:401)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-49441252, 6, -1, "androidx.compose.foundation.layout.<get-safeDrawing> (WindowInsets.android.kt:211)");
        }
        WeakHashMap<View, yqx0> weakHashMap = yqx0.w;
        o3q0 o3q0Var = yqx0.a.c(aVar2).l;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        h7z h7zVar = new h7z(o3q0Var, 48);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar2.j();
        return h7zVar;
    }
}
