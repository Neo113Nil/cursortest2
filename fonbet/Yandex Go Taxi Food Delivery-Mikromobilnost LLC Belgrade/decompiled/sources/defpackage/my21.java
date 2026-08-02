package defpackage;

import com.yandex.xplat.common.NetworkMethod;

/* loaded from: classes2.dex */
public final class my21 extends l55 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final wj00 g;
    public final boolean h;
    public final String i;
    public final String j;

    public my21(String str, String str2, String str3, String str4, String str5, String str6, wj00 wj00Var, boolean z, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = wj00Var;
        this.h = z;
        this.i = str7;
        this.j = str8;
    }

    @Override // defpackage.l55, defpackage.hz50
    public final wj00 a() {
        wj00 wj00Var = new wj00(0);
        String str = this.b;
        if (str != null) {
            wj00Var.k("currency", str);
        }
        String str2 = this.c;
        if (str2 != null) {
            wj00Var.k("pos_id", str2);
        }
        String str3 = this.d;
        if (str3 != null) {
            wj00Var.k("binding_id", str3);
        }
        wj00Var.i("is_empty_cvv", this.h);
        String str4 = this.i;
        if (str4 != null) {
            wj00Var.k("system", str4);
        }
        String str5 = this.j;
        if (str5 != null) {
            wj00Var.k("device_pubkey", str5);
        }
        wj00 wj00Var2 = new wj00(0);
        String str6 = this.e;
        if (str6 != null) {
            wj00Var2.k("pmd", str6);
        }
        String str7 = this.f;
        if (str7 != null) {
            wj00Var2.k("psd", str7);
        }
        wj00Var2.b.put("context", this.g);
        wj00Var.b.put("tokens", wj00Var2);
        return wj00Var;
    }

    @Override // defpackage.hz50
    public final String c() {
        return "v2/verify_binding";
    }

    @Override // defpackage.l55, defpackage.hz50
    public final wj00 d() {
        wj00 d = super.d();
        String str = this.a;
        if (str != null) {
            d.k("X-Request-ID", str);
        }
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
