package defpackage;

import android.content.Context;
import com.yandex.payment.sdk.core.data.AppInfo;
import com.yandex.payment.sdk.core.data.CardValidationConfig;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentMethodsFilter;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.payment.sdk.model.data.AdditionalSettings;
import com.yandex.payment.sdk.model.data.PersonalInfoConfig;
import com.yandex.payment.sdk.model.data.ResultScreenClosing;
import com.yandex.payment.sdk.model.data.WidthOnLargeScreen;
import com.yandex.plus.ui.core.theme.PlusTheme;
import java.util.List;
import kotlin.a;

/* loaded from: classes8.dex */
public final class f3a0 {
    public final mhd0 a;
    public final e5o b;
    public final n4u0 c;
    public final i3y d = a.a(new ks90(9));

    public f3a0(mhd0 mhd0Var, e5o e5oVar, n4u0 n4u0Var) {
        this.a = mhd0Var;
        this.b = e5oVar;
        this.c = n4u0Var;
    }

    public final ksi0 a(Context context, ohd0 ohd0Var, String str, String str2, String str3, ev5 ev5Var, boolean z) {
        PaymentSdkEnvironment paymentSdkEnvironment;
        cvy0 cvy0Var;
        String c;
        String str4 = str2 == null ? null : str2;
        e5o e5oVar = this.b;
        Merchant merchant = new Merchant(str3 == null ? gu91.b(e5oVar.getEnvironment()) : str3);
        a0a0 a0a0Var = new a0a0();
        a0a0Var.c(context);
        int i = d3a0.a[e5oVar.getEnvironment().ordinal()];
        if (i == 1) {
            paymentSdkEnvironment = PaymentSdkEnvironment.TESTING;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            paymentSdkEnvironment = PaymentSdkEnvironment.PRODUCTION;
        }
        a0a0Var.d(paymentSdkEnvironment);
        a0a0Var.b(ConsoleLoggingMode.DISABLED);
        c0a0 a = a0a0Var.a();
        String a2 = ohd0Var.a();
        Long c2 = ohd0Var.c();
        Payer payer = new Payer(a2, null, c2 != null ? c2.toString() : null, null, null, null);
        List b = ohd0Var.b();
        AdditionalSettings.a aVar = new AdditionalSettings.a();
        aVar.b(new AppInfo(null, null, context.getPackageName()));
        CardValidationConfig.Companion.getClass();
        aVar.c(tp8.a());
        aVar.e();
        aVar.h((PersonalInfoConfig) this.d.getValue());
        aVar.k();
        aVar.l();
        boolean z2 = false;
        aVar.g(new PaymentMethodsFilter(false, false, z2, false, z2, z2, 11, null));
        aVar.d(str);
        aVar.m(WidthOnLargeScreen.COMPACT_WIDTH);
        if (z) {
            aVar.j(new ResultScreenClosing(false, 0L, true, 3, null));
        }
        if (str4 != null) {
            aVar.i(str4);
        }
        if (b != null && (c = veb1.c(b)) != null) {
            aVar.f(c);
        }
        AdditionalSettings a3 = aVar.a();
        PlusTheme plusTheme = (PlusTheme) this.c.getValue();
        mhd0 mhd0Var = this.a;
        mhd0Var.getClass();
        int i2 = oes0.a[plusTheme.ordinal()];
        if (i2 == 1) {
            cvy0Var = (cvy0) mhd0Var.c.getValue();
        } else if (i2 == 2) {
            cvy0Var = (cvy0) mhd0Var.d.getValue();
        } else {
            if (i2 != 3) {
                w511.b();
                return null;
            }
            cvy0Var = (cvy0) mhd0Var.e.getValue();
        }
        return a.a(payer, merchant, a3, cvy0Var, ev5Var);
    }
}
