package defpackage;

import com.yandex.xplat.common.NetworkMethod;

/* loaded from: classes2.dex */
public final class m560 extends l55 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;

    public m560(String str, Integer num, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
    }

    @Override // defpackage.l55, defpackage.hz50
    public final wj00 a() {
        wj00 wj00Var = new wj00(0);
        wj00Var.k("card_data_encrypted", this.d);
        wj00Var.k("hash_algo", this.c);
        wj00Var.k("service_token", this.b);
        Integer num = this.e;
        if (num != null) {
            wj00Var.j(num.intValue(), "region_id");
        }
        return wj00Var;
    }

    @Override // defpackage.hz50
    public final String c() {
        return "bindings/v2.0/bindings";
    }

    @Override // defpackage.l55, defpackage.hz50
    public final wj00 d() {
        wj00 d = super.d();
        d.k("X-Oauth-Token", this.a);
        d.k("X-Service-Token", this.b);
        return d;
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
