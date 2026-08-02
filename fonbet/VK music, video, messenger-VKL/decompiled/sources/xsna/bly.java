package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.i8s;
import xsna.q630;

/* compiled from: LabelCounterImpl.kt */
/* loaded from: classes17.dex */
public final class bly extends i8s.a.AbstractC3037a {
    public final rg50 a;
    public final rg50 b;
    public final wh50 c;

    public bly(int i, int i2, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.i.a(i);
        this.b = androidx.compose.runtime.i.a(i2);
        this.c = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // xsna.i8s
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-773966820);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-773966820, i2, -1, "com.vk.core.compose.component.form.LabelCounterImpl.Content (LabelCounterImpl.kt:29)");
            }
            wak0 wak0Var = (wak0) this.a;
            Integer valueOf = Integer.valueOf(wak0Var.getIntValue());
            wak0 wak0Var2 = (wak0) this.b;
            String O = d370.O(R.string.vk_form_field_counter_description, new Object[]{valueOf, Integer.valueOf(wak0Var2.getIntValue())}, M);
            String O2 = d370.O(R.string.vk_form_field_counter_template, new Object[]{Integer.valueOf(wak0Var.getIntValue()), Integer.valueOf(wak0Var2.getIntValue())}, M);
            q630 b = com.vk.core.compose.component.semantics.b.b(q630.a.a, (SemanticsConfiguration) ((zak0) this.c).getValue());
            boolean J = M.J(O);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new r6g(O, 2);
                M.R(x);
            }
            q630 b2 = egi0.b(b, false, (izs) x);
            rdi.u();
            hn20 hn20Var = hn20.a;
            M.K(643998512);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(643998512, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeFormFieldDefaults.counterTextColor (MilkshakeFormFieldDefaults.kt:41)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().s;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            rdi.u();
            M.K(-1109013550);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1109013550, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeFormFieldDefaults.counterTextStyle (MilkshakeFormFieldDefaults.kt:38)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.i0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            aVar2 = M;
            yqv0.c(O2, b2, j, null, null, 0, 2, null, 0, false, 0, 0, null, frv0Var, aVar2, 0, 0, 8120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.w(this, i, 9);
        }
    }
}
