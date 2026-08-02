package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;

/* compiled from: Placeholder.kt */
/* loaded from: classes17.dex */
public final class csa0 {
    public static t8p0 a(lg90 lg90Var, long j, long j2, String str, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = l5g.k;
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = 9205357640488583168L;
        }
        long j4 = j2;
        String str2 = (i2 & 8) != 0 ? null : str;
        SemanticsConfiguration semanticsConfiguration2 = (i2 & 16) != 0 ? null : semanticsConfiguration;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-28097059, i, -1, "com.vk.core.compose.component.placeholder.Placeholder.Top.Icon.Companion.invoke (Placeholder.kt:51)");
        }
        int i3 = i << 3;
        int i4 = (i3 & 57344) | (i3 & 7168) | 70;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1554717862, i4, -1, "com.vk.core.compose.component.placeholder.remember (TopIconImpl.kt:83)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            t8p0 t8p0Var = new t8p0(lg90Var, j3, j4, str2, semanticsConfiguration2);
            aVar.R(t8p0Var);
            x = t8p0Var;
        }
        t8p0 t8p0Var2 = (t8p0) x;
        ((zak0) t8p0Var2.a).setValue(lg90Var);
        ((zak0) t8p0Var2.b).setValue(new l5g(j3));
        ((zak0) t8p0Var2.c).setValue(new uco(j4));
        ((zak0) t8p0Var2.d).setValue(str2);
        ((zak0) t8p0Var2.e).setValue(semanticsConfiguration2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return t8p0Var2;
    }
}
