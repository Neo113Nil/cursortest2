package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.form.FormField$Style;

/* compiled from: FormField.kt */
/* loaded from: classes17.dex */
public interface f8s {

    /* compiled from: FormField.kt */
    public static final class a {
        public static vr9 a(String str, FormField$Style formField$Style, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
            if ((i2 & 2) != 0) {
                formField$Style = FormField$Style.Default;
            }
            if ((i2 & 4) != 0) {
                aVar = null;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1004693297, i, -1, "com.vk.core.compose.component.form.FormField.Caption.Companion.invoke (FormField.kt:250)");
            }
            int i3 = (i >> 9) & 14;
            int i4 = i << 3;
            int i5 = (i4 & 7168) | i3 | (i4 & 112) | (i4 & 896);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(839349926, i5, -1, "com.vk.core.compose.component.form.remember (CaptionImpl.kt:67)");
            }
            Object x = aVar2.x();
            if (x == a.C0011a.a) {
                x = new vr9(str, formField$Style, aVar);
                aVar2.R(x);
            }
            vr9 vr9Var = (vr9) x;
            ((zak0) vr9Var.a).setValue(str);
            ((zak0) vr9Var.b).setValue(formField$Style);
            ((zak0) vr9Var.c).setValue(aVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return vr9Var;
        }

        public static ljc b(us2 us2Var, izs izsVar, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i) {
            FormField$Style formField$Style = FormField$Style.Default;
            int i2 = i & 4;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (i2 != 0) {
                Object x = aVar2.x();
                if (x == c0012a) {
                    x = new byo(2);
                    aVar2.R(x);
                }
                izsVar = (izs) x;
            }
            if ((i & 8) != 0) {
                aVar = null;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(380642290, 24576, -1, "com.vk.core.compose.component.form.FormField.Caption.Companion.invoke (FormField.kt:259)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1209357749, 6, -1, "com.vk.core.compose.component.form.remember (CaptionImpl.kt:86)");
            }
            Object x2 = aVar2.x();
            if (x2 == c0012a) {
                x2 = new ljc(us2Var, formField$Style, izsVar, aVar);
                aVar2.R(x2);
            }
            ljc ljcVar = (ljc) x2;
            ((zak0) ljcVar.a).setValue(us2Var);
            ((zak0) ljcVar.b).setValue(formField$Style);
            ((zak0) ljcVar.c).setValue(izsVar);
            ((zak0) ljcVar.d).setValue(aVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return ljcVar;
        }
    }

    void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
