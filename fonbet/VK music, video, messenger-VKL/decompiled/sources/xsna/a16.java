package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;

/* compiled from: Banner.kt */
/* loaded from: classes17.dex */
public final class a16 {
    public static pw6 a(lg90 lg90Var, long j, long j2, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i) {
        lg90 lg90Var2;
        if ((i & 2) != 0) {
            j = l5g.k;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = 9205357640488583168L;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            semanticsConfiguration = null;
        }
        SemanticsConfiguration semanticsConfiguration2 = semanticsConfiguration;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-806322855, 24584, -1, "com.vk.core.compose.component.banner.Banner.Before.Icon.Companion.invoke (Banner.kt:454)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(121761408, 70, -1, "com.vk.core.compose.component.banner.remember (BeforeIconImpl.kt:48)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            lg90Var2 = lg90Var;
            pw6 pw6Var = new pw6(lg90Var2, j3, j4, semanticsConfiguration2);
            aVar.R(pw6Var);
            x = pw6Var;
        } else {
            lg90Var2 = lg90Var;
        }
        pw6 pw6Var2 = (pw6) x;
        ((zak0) pw6Var2.a).setValue(lg90Var2);
        ((zak0) pw6Var2.b).setValue(new l5g(j3));
        ((zak0) pw6Var2.c).setValue(new uco(j4));
        ((zak0) pw6Var2.d).setValue(semanticsConfiguration2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return pw6Var2;
    }
}
