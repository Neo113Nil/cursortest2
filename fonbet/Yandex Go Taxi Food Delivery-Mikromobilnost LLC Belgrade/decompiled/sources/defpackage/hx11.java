package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;

/* loaded from: classes2.dex */
public final class hx11 extends thj {
    public final String a;
    public final String b;

    public hx11(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.thj, defpackage.hz50
    public final String c() {
        return "unbind_card";
    }

    @Override // defpackage.thj
    public final wj00 e() {
        wj00 e = super.e();
        String str = this.a;
        if (str != null) {
            e.k(AuthSdkActivity.RESPONSE_TYPE_TOKEN, str);
        }
        e.k("card", this.b);
        return e;
    }
}
