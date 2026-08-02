package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;

/* compiled from: LeftNotificationIconImpl.kt */
/* loaded from: classes17.dex */
public final class yzy {
    public static final xzy a(lg90 lg90Var, long j, long j2, String str, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1613340954, i, -1, "com.vk.core.compose.component.banner.remember (LeftNotificationIconImpl.kt:51)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            xzy xzyVar = new xzy(lg90Var, j, j2, str, semanticsConfiguration);
            aVar.R(xzyVar);
            x = xzyVar;
        }
        xzy xzyVar2 = (xzy) x;
        ((zak0) xzyVar2.a).setValue(lg90Var);
        ((zak0) xzyVar2.b).setValue(new l5g(j));
        ((zak0) xzyVar2.c).setValue(new uco(j2));
        ((zak0) xzyVar2.d).setValue(str);
        ((zak0) xzyVar2.e).setValue(semanticsConfiguration);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return xzyVar2;
    }
}
