package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.xplat.common.NetworkMethod;
import com.yandex.xplat.payment.sdk.ShowSbpTokensFlag;

/* loaded from: classes2.dex */
public final class evv extends l55 {
    public final String a;
    public final String b;
    public final boolean c;
    public final ShowSbpTokensFlag d;
    public final rg7 e;
    public final boolean f;

    public evv(String str, String str2, boolean z, ShowSbpTokensFlag showSbpTokensFlag, rg7 rg7Var, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = showSbpTokensFlag;
        this.e = rg7Var;
        this.f = z2;
    }

    @Override // defpackage.l55, defpackage.hz50
    public final wj00 a() {
        wj00 wj00Var = new wj00(0);
        wj00Var.k(AuthSdkActivity.RESPONSE_TYPE_TOKEN, this.a);
        String str = this.b;
        if (str != null) {
            wj00Var.k("email", str);
        }
        rg7 rg7Var = this.e;
        String str2 = rg7Var.c;
        if (str2 != null) {
            wj00Var.k("turboapp_id", str2);
        }
        String str3 = rg7Var.a;
        if (str3 != null) {
            wj00Var.k("psuid", str3);
        }
        String str4 = rg7Var.b;
        if (str4 != null) {
            wj00Var.k("tsid", str4);
        }
        wj00Var.i("credit", this.c);
        wj00Var.i("show_sbp_tokens", jl40.l(this.d.getValue(), ShowSbpTokensFlag.enabled.getValue()));
        wj00Var.i("is_new_attempt", this.f);
        return wj00Var;
    }

    @Override // defpackage.hz50
    public final String c() {
        return "v1/init_payment";
    }

    @Override // defpackage.hz50
    public final y5j0 encoding() {
        return new aex();
    }

    @Override // defpackage.hz50
    public final NetworkMethod method() {
        return NetworkMethod.post;
    }
}
