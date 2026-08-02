package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.PlaceholderMode;
import com.vk.core.compose.component.defaults.PlaceholderSize;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.dt1;
import xsna.q630;

/* compiled from: Placeholder.kt */
/* loaded from: classes17.dex */
public interface zra0 {

    /* compiled from: Placeholder.kt */
    public static final class a {
        public static vl20 a(String str, SemanticsConfiguration semanticsConfiguration, String str2, SemanticsConfiguration semanticsConfiguration2, androidx.compose.runtime.a aVar, int i, int i2) {
            us2 us2Var;
            us2 us2Var2 = null;
            if ((i2 & 1) != 0) {
                str = null;
            }
            SemanticsConfiguration semanticsConfiguration3 = (i2 & 2) != 0 ? null : semanticsConfiguration;
            if ((i2 & 4) != 0) {
                str2 = null;
            }
            SemanticsConfiguration semanticsConfiguration4 = (i2 & 16) != 0 ? null : semanticsConfiguration2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1264277074, i, -1, "com.vk.core.compose.component.placeholder.Placeholder.Middle.Companion.invoke (Placeholder.kt:252)");
            }
            if (str == null) {
                aVar.K(1510491540);
                aVar.j();
                us2Var = null;
            } else {
                aVar.K(-505463795);
                us2 b = ws2.b(str, aVar, i & 14);
                aVar.j();
                us2Var = b;
            }
            if (str2 == null) {
                aVar.K(1510593716);
            } else {
                aVar.K(-505460499);
                us2Var2 = ws2.b(str2, aVar, (i >> 6) & 14);
            }
            aVar.j();
            vl20 b2 = b(us2Var, semanticsConfiguration3, us2Var2, semanticsConfiguration4, aVar, i & 523376, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return b2;
        }

        public static vl20 b(us2 us2Var, SemanticsConfiguration semanticsConfiguration, us2 us2Var2, SemanticsConfiguration semanticsConfiguration2, androidx.compose.runtime.a aVar, int i, int i2) {
            us2 us2Var3;
            us2 us2Var4 = (i2 & 1) != 0 ? null : us2Var;
            SemanticsConfiguration semanticsConfiguration3 = (i2 & 2) != 0 ? null : semanticsConfiguration;
            SemanticsConfiguration semanticsConfiguration4 = (i2 & 16) != 0 ? null : semanticsConfiguration2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1680586974, i, -1, "com.vk.core.compose.component.placeholder.Placeholder.Middle.Companion.invoke (Placeholder.kt:267)");
            }
            int i3 = i << 3;
            int i4 = ((i >> 15) & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(890370957, i4, -1, "com.vk.core.compose.component.placeholder.remember (MiddleImpl.kt:135)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                us2Var3 = us2Var2;
                vl20 vl20Var = new vl20(us2Var4, semanticsConfiguration3, us2Var3, Integer.MAX_VALUE, semanticsConfiguration4);
                aVar.R(vl20Var);
                x = vl20Var;
            } else {
                us2Var3 = us2Var2;
            }
            vl20 vl20Var2 = (vl20) x;
            ((zak0) vl20Var2.a).setValue(us2Var4);
            ((zak0) vl20Var2.b).setValue(semanticsConfiguration3);
            ((zak0) vl20Var2.c).setValue(us2Var3);
            ((zak0) vl20Var2.d).setValue(Integer.MAX_VALUE);
            ((zak0) vl20Var2.e).setValue(semanticsConfiguration4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return vl20Var2;
        }
    }

    /* compiled from: Placeholder.kt */
    public static final class b {
        public static final void a(dt1.b bVar, PlaceholderMode placeholderMode, PlaceholderSize placeholderSize, zra0 zra0Var, androidx.compose.runtime.a aVar, int i, int i2) {
            int i3;
            androidx.compose.runtime.a M = aVar.M(1079528343);
            if ((i & 6) == 0) {
                i3 = (M.J(q630.a.a) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= M.J(bVar) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= M.o(placeholderMode.ordinal()) ? 256 : 128;
            }
            int i4 = i2 & 8;
            if (i4 != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= M.o(placeholderSize == null ? -1 : placeholderSize.ordinal()) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= M.J(zra0Var) ? 16384 : 8192;
            }
            if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
                if (i4 != 0) {
                    placeholderSize = null;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1079528343, i3, -1, "com.vk.core.compose.component.placeholder.Placeholder.Middle.ComposeDefaultImpls.Content$default (Placeholder.kt:-1)");
                }
                zra0Var.a(placeholderMode, M, 65534 & i3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            PlaceholderSize placeholderSize2 = placeholderSize;
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new asa0(bVar, placeholderMode, placeholderSize2, zra0Var, i, i2);
            }
        }
    }

    void a(PlaceholderMode placeholderMode, androidx.compose.runtime.a aVar, int i);
}
