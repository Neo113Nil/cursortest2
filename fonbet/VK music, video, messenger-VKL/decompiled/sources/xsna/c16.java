package xsna;

import androidx.compose.runtime.a;

/* compiled from: Banner.kt */
/* loaded from: classes17.dex */
public abstract class c16 {

    /* compiled from: Banner.kt */
    public static abstract class a extends c16 {

        /* compiled from: Banner.kt */
        /* renamed from: xsna.c16$a$a, reason: collision with other inner class name */
        public static final class C2633a {
            public static ymr a(lg90 lg90Var, androidx.compose.runtime.a aVar, int i, int i2) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1268645641, i, -1, "com.vk.core.compose.component.banner.Banner.Fixed.Illustration.Companion.invoke (Banner.kt:488)");
                }
                int i3 = ((i << 3) & 896) | 70;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-711876192, i3, -1, "com.vk.core.compose.component.banner.remember (FixedIllustrationImpl.kt:57)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = new ymr(lg90Var, null);
                    aVar.R(x);
                }
                ymr ymrVar = (ymr) x;
                ((zak0) ymrVar.a).setValue(lg90Var);
                ((zak0) ymrVar.b).setValue(null);
                ((zak0) ymrVar.c).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return ymrVar;
            }
        }
    }

    /* compiled from: Banner.kt */
    public static abstract class b extends c16 {
    }

    public abstract void a(int i, androidx.compose.runtime.a aVar);
}
