package xsna;

import androidx.compose.runtime.a;

/* compiled from: FormField.kt */
/* loaded from: classes17.dex */
public interface h8s {

    /* compiled from: FormField.kt */
    public static final class a {
        public static hly a(String str, boolean z, fly flyVar, bly blyVar, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
            String str2;
            if ((i2 & 2) != 0) {
                z = false;
            }
            boolean z2 = z;
            fly flyVar2 = (i2 & 4) != 0 ? null : flyVar;
            bly blyVar2 = (i2 & 8) != 0 ? null : blyVar;
            com.vk.core.compose.component.semantics.a aVar3 = (i2 & 16) != 0 ? null : aVar;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(217586211, i, -1, "com.vk.core.compose.component.form.FormField.Label.Companion.invoke (FormField.kt:37)");
            }
            int i3 = i << 3;
            int i4 = ((i >> 15) & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-343294426, i4, -1, "com.vk.core.compose.component.form.remember (LabelImpl.kt:104)");
            }
            Object x = aVar2.x();
            if (x == a.C0011a.a) {
                str2 = str;
                hly hlyVar = new hly(str2, z2, flyVar2, blyVar2, aVar3);
                aVar2.R(hlyVar);
                x = hlyVar;
            } else {
                str2 = str;
            }
            hly hlyVar2 = (hly) x;
            ((zak0) hlyVar2.a).setValue(str2);
            ((zak0) hlyVar2.b).setValue(Boolean.valueOf(z2));
            ((zak0) hlyVar2.c).setValue(flyVar2);
            ((zak0) hlyVar2.d).setValue(blyVar2);
            ((zak0) hlyVar2.e).setValue(aVar3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return hlyVar2;
        }
    }

    void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
