package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: ColorResources.android.kt */
/* loaded from: classes11.dex */
public final class s7g {
    public static final long a(int i, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1777644873, 0, -1, "androidx.compose.ui.res.colorResource (ColorResources.android.kt:34)");
        }
        Context context = (Context) aVar.r(AndroidCompositionLocals_androidKt.b);
        Resources resources = (Resources) aVar.r(AndroidCompositionLocals_androidKt.c);
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = dbg0.a;
        long c = f870.c(resources.getColor(i, theme));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return c;
    }
}
