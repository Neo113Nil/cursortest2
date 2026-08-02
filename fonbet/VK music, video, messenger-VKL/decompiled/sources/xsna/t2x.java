package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;

/* compiled from: InputSelect.kt */
/* loaded from: classes17.dex */
public abstract class t2x {
    public final wh50 a = androidx.compose.runtime.k.b(Boolean.TRUE);

    /* compiled from: InputSelect.kt */
    public static abstract class a extends t2x {
    }

    /* compiled from: InputSelect.kt */
    public static abstract class b extends t2x {

        /* compiled from: InputSelect.kt */
        public static final class a {
            public static hkg0 a(lg90 lg90Var, String str, gzs gzsVar, long j, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i, int i2) {
                String str2 = (i2 & 2) != 0 ? null : str;
                if ((i2 & 8) != 0) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var.getIcon().l;
                }
                long j2 = j;
                SemanticsConfiguration semanticsConfiguration2 = (i2 & 16) != 0 ? null : semanticsConfiguration;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-965865848, i, -1, "com.vk.core.compose.component.input.InputSelect.Right.Icon.Companion.invoke (InputSelect.kt:62)");
                }
                int i3 = i << 3;
                int i4 = ((i >> 15) & 14) | 64 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2001779131, i4, -1, "com.vk.core.compose.component.input.remember (RightIconImpl.kt:55)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    hkg0 hkg0Var = new hkg0(j2, semanticsConfiguration2, str2, gzsVar, lg90Var);
                    ((zak0) hkg0Var.b).setValue(lg90Var);
                    ((zak0) hkg0Var.c).setValue(str2);
                    ((zak0) hkg0Var.d).setValue(gzsVar);
                    ((zak0) hkg0Var.e).setValue(new l5g(j2));
                    ((zak0) hkg0Var.f).setValue(semanticsConfiguration2);
                    aVar.R(hkg0Var);
                    x = hkg0Var;
                }
                hkg0 hkg0Var2 = (hkg0) x;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return hkg0Var2;
            }
        }
    }

    public abstract void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
