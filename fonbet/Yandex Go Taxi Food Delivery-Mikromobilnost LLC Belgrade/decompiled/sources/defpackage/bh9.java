package defpackage;

import com.yandex.go.yb.analytics.ChangeToYbWalletAnalytics$Button;
import java.util.HashMap;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public final class bh9 {
    public final x770 a;
    public final String b = a.X(ChangeToYbWalletAnalytics$Button.b(), null, null, null, new jv8(19), 31);

    public bh9(x770 x770Var) {
        this.a = x770Var;
    }

    public final void a(ChangeToYbWalletAnalytics$Button changeToYbWalletAnalytics$Button, String str) {
        String buttonName = changeToYbWalletAnalytics$Button.getButtonName();
        x770 x770Var = this.a;
        x770Var.getClass();
        HashMap hashMap = new HashMap();
        String str2 = this.b;
        if (str2 != null) {
            hashMap.put("button_list", str2);
        }
        if (buttonName != null) {
            hashMap.put("button_name", buttonName);
        }
        if (str != null) {
            hashMap.put("open_reason", str);
        }
        x770Var.a.a("TopUpYandexWallet.ChangePaymentMethod.Tapped", hashMap, 1, new HashMap());
    }
}
