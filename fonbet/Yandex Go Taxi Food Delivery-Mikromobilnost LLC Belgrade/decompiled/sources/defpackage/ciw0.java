package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;

/* loaded from: classes2.dex */
public abstract class ciw0 extends thj {
    public final String a;
    public final String b;
    public final String c;

    public ciw0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.thj, defpackage.hz50
    public final String c() {
        return "supply_payment_data";
    }

    @Override // defpackage.thj
    public wj00 e() {
        wj00 e = super.e();
        String str = this.a;
        if (str != null) {
            e.k(AuthSdkActivity.RESPONSE_TYPE_TOKEN, str);
        }
        e.k("purchase_token", this.b);
        e.k("email", this.c);
        return e;
    }
}
