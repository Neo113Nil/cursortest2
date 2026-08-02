package xsna;

import androidx.compose.runtime.a;

/* compiled from: FormField.kt */
/* loaded from: classes17.dex */
public interface i8s {

    /* compiled from: FormField.kt */
    public interface a extends i8s {

        /* compiled from: FormField.kt */
        /* renamed from: xsna.i8s$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC3037a implements a {

            /* compiled from: FormField.kt */
            /* renamed from: xsna.i8s$a$a$a, reason: collision with other inner class name */
            public static final class C3038a {
                public static bly a(int i, int i2, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i3, int i4) {
                    if ((i4 & 4) != 0) {
                        aVar = null;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2022215678, i3, -1, "com.vk.core.compose.component.form.FormField.LabelItem.After.Counter.Companion.invoke (FormField.kt:70)");
                    }
                    int i5 = i3 << 3;
                    int i6 = (i5 & 896) | (i5 & 112) | 6;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1102506998, i6, -1, "com.vk.core.compose.component.form.remember (LabelCounterImpl.kt:50)");
                    }
                    Object x = aVar2.x();
                    if (x == a.C0011a.a) {
                        x = new bly(i, i2, aVar);
                        aVar2.R(x);
                    }
                    bly blyVar = (bly) x;
                    ((wak0) blyVar.a).C(i);
                    ((wak0) blyVar.b).C(i2);
                    ((zak0) blyVar.c).setValue(aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return blyVar;
                }
            }
        }
    }

    /* compiled from: FormField.kt */
    public static abstract class b implements i8s {

        /* compiled from: FormField.kt */
        public static final class a {
            public static fly a(lg90 lg90Var, gzs gzsVar, androidx.compose.runtime.a aVar) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().n;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(154630017, 197048, -1, "com.vk.core.compose.component.form.FormField.LabelItem.Icon.Companion.invoke (FormField.kt:56)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1764661475, 3526, -1, "com.vk.core.compose.component.form.remember (LabelIconImpl.kt:52)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = new fly(j, gzsVar, lg90Var);
                    aVar.R(x);
                }
                fly flyVar = (fly) x;
                ((zak0) flyVar.a).setValue(lg90Var);
                ((zak0) flyVar.b).setValue("Help");
                ((zak0) flyVar.c).setValue(gzsVar);
                ((zak0) flyVar.d).setValue(new l5g(j));
                ((zak0) flyVar.e).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return flyVar;
            }
        }
    }

    void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
