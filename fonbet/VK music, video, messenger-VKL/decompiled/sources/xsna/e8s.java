package xsna;

import androidx.compose.runtime.a;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: FormField.kt */
/* loaded from: classes17.dex */
public interface e8s {

    /* compiled from: FormField.kt */
    public static abstract class a implements e8s {

        /* compiled from: FormField.kt */
        /* renamed from: xsna.e8s$a$a, reason: collision with other inner class name */
        public static final class C2787a {
            public static z61 a(lg90 lg90Var, String str, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
                lg90 lg90Var2;
                String str2;
                gzs gzsVar2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().l;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-640529684, i, -1, "com.vk.core.compose.component.form.FormField.After.Icon.Companion.invoke (FormField.kt:234)");
                }
                int i2 = ((i << 3) & 7168) | ApiInvocationException.ErrorCodes.CENSOR_MATCH;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1997197061, i2, -1, "com.vk.core.compose.component.form.remember (AfterIconImpl.kt:53)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    lg90Var2 = lg90Var;
                    str2 = str;
                    gzsVar2 = gzsVar;
                    z61 z61Var = new z61(lg90Var2, str2, gzsVar2, j);
                    aVar.R(z61Var);
                    x = z61Var;
                } else {
                    lg90Var2 = lg90Var;
                    str2 = str;
                    gzsVar2 = gzsVar;
                }
                z61 z61Var2 = (z61) x;
                ((zak0) z61Var2.a).setValue(lg90Var2);
                ((zak0) z61Var2.b).setValue(str2);
                ((zak0) z61Var2.c).setValue(gzsVar2);
                ((zak0) z61Var2.d).setValue(new l5g(j));
                ((zak0) z61Var2.e).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return z61Var2;
            }
        }
    }

    void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
