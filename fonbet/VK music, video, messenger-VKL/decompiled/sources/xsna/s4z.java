package xsna;

import androidx.compose.runtime.a;
import androidx.lifecycle.Lifecycle;

/* compiled from: LifecycleExt.kt */
/* loaded from: classes17.dex */
public final class s4z {
    public static final wh50 a(Lifecycle lifecycle, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(944322894, 0, -1, "com.vk.core.compose.utils.ext.observeAsState (LifecycleExt.kt:11)");
        }
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (x == c0012a) {
            x = androidx.compose.runtime.k.b(Lifecycle.Event.ON_ANY);
            aVar.R(x);
        }
        wh50 wh50Var = (wh50) x;
        boolean y = aVar.y(lifecycle);
        Object x2 = aVar.x();
        if (y || x2 == c0012a) {
            x2 = new ya(22, lifecycle, wh50Var);
            aVar.R(x2);
        }
        bap.c(lifecycle, (izs) x2, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return wh50Var;
    }
}
