package xsna;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: LocalViewModelStoreOwner.kt */
/* loaded from: classes12.dex */
public final class jwz {
    public static final pqo a = new pqo(new nh(18));

    public static xyt0 a(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-584162872, 6, -1, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:35)");
        }
        xyt0 xyt0Var = (xyt0) aVar.r(a);
        if (xyt0Var == null) {
            aVar.K(1260197608);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(927641011, 0, -1, "androidx.lifecycle.viewmodel.compose.findDefaultViewModelStoreOwner (LocalViewModelStoreOwner.android.kt:25)");
            }
            xyt0Var = ro.h((View) aVar.r(AndroidCompositionLocals_androidKt.f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.K(1260196492);
        }
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return xyt0Var;
    }
}
