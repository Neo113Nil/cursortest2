package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.banner.Banner$BackgroundMode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.dt1;

/* compiled from: Banner.kt */
/* loaded from: classes17.dex */
public abstract class z06 {
    public final wh50 a = androidx.compose.runtime.k.b(Banner$BackgroundMode.Auto);

    /* compiled from: Banner.kt */
    public static abstract class a extends z06 {

        /* compiled from: Banner.kt */
        /* renamed from: xsna.z06$a$a, reason: collision with other inner class name */
        public static final class C4145a {
            public static v61 a(gzs gzsVar, String str, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i, int i2) {
                if ((i2 & 2) != 0) {
                    str = null;
                }
                if ((i2 & 4) != 0) {
                    semanticsConfiguration = null;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-47696522, i, -1, "com.vk.core.compose.component.banner.Banner.After.Chevron.Companion.invoke (Banner.kt:310)");
                }
                int i3 = ((i << 3) & 112) | 6;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-766039071, i3, -1, "com.vk.core.compose.component.banner.remember (AfterChevronImpl.kt:61)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = new v61(semanticsConfiguration, str, gzsVar);
                    aVar.R(x);
                }
                v61 v61Var = (v61) x;
                ((zak0) v61Var.c).setValue(str);
                ((zak0) v61Var.d).setValue(gzsVar);
                ((zak0) v61Var.b).setValue(semanticsConfiguration);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return v61Var;
            }
        }
    }

    /* compiled from: Banner.kt */
    public static abstract class b extends z06 {

        /* compiled from: Banner.kt */
        public static final class a {
            public static x61 a(gzs gzsVar, String str, SemanticsConfiguration semanticsConfiguration, lg90 lg90Var, l5g l5gVar, dt1 dt1Var, androidx.compose.runtime.a aVar, int i, int i2) {
                String str2 = (i2 & 2) != 0 ? null : str;
                SemanticsConfiguration semanticsConfiguration2 = (i2 & 4) != 0 ? null : semanticsConfiguration;
                lg90 lg90Var2 = (i2 & 8) != 0 ? null : lg90Var;
                l5g l5gVar2 = (i2 & 16) != 0 ? null : l5gVar;
                if ((i2 & 32) != 0) {
                    dt1.a.getClass();
                    dt1Var = dt1.a.b;
                }
                dt1 dt1Var2 = dt1Var;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(359627147, i, -1, "com.vk.core.compose.component.banner.Banner.After.Dismiss.Companion.invoke (Banner.kt:327)");
                }
                int i3 = i << 3;
                int i4 = ((i >> 18) & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | 32768 | (57344 & i3) | (458752 & i3) | (i3 & 3670016);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1584434350, i4, -1, "com.vk.core.compose.component.banner.remember (AfterDismissImpl.kt:71)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x61 x61Var = new x61(str2, gzsVar, semanticsConfiguration2, lg90Var2, l5gVar2, dt1Var2);
                    aVar.R(x61Var);
                    x = x61Var;
                }
                x61 x61Var2 = (x61) x;
                ((zak0) x61Var2.b).setValue(str2);
                ((zak0) x61Var2.d).setValue(gzsVar);
                ((zak0) x61Var2.c).setValue(semanticsConfiguration2);
                ((zak0) x61Var2.e).setValue(lg90Var2);
                ((zak0) x61Var2.f).setValue(l5gVar2);
                ((zak0) x61Var2.g).setValue(dt1Var2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return x61Var2;
            }
        }
    }

    /* compiled from: Banner.kt */
    public static abstract class c extends z06 {

        /* compiled from: Banner.kt */
        public static final class a {
            public static d71 a(gzs gzsVar, androidx.compose.runtime.a aVar) {
                dt1.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1682000453, 196614, -1, "com.vk.core.compose.component.banner.Banner.After.More.Companion.invoke (Banner.kt:343)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1679475054, 54, -1, "com.vk.core.compose.component.banner.remember (AfterMoreImpl.kt:59)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = new d71(gzsVar);
                    aVar.R(x);
                }
                d71 d71Var = (d71) x;
                ((zak0) d71Var.b).setValue(null);
                ((zak0) d71Var.d).setValue(gzsVar);
                ((zak0) d71Var.c).setValue(null);
                ((zak0) d71Var.e).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return d71Var;
            }
        }
    }

    public abstract void a(int i, androidx.compose.runtime.a aVar);
}
