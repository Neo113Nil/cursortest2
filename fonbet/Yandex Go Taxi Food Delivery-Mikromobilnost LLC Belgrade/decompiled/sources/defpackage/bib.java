package defpackage;

import com.yandex.xplat.common.NetworkMethod;

/* loaded from: classes2.dex */
public final class bib extends l55 {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;

    public /* synthetic */ bib(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.l55, defpackage.hz50
    public wj00 a() {
        int i = this.a;
        String str = this.c;
        String str2 = this.b;
        switch (i) {
            case 0:
                wj00 wj00Var = new wj00(0);
                wj00Var.k("binding_id", str2);
                wj00Var.k("verification_id", str);
                return wj00Var;
            case 1:
            default:
                return super.a();
            case 2:
                wj00 wj00Var2 = new wj00(0);
                wj00Var2.k("binding_id", str2);
                if (str != null) {
                    wj00Var2.k("currency", str);
                }
                return wj00Var2;
        }
    }

    @Override // defpackage.hz50
    public final String c() {
        switch (this.a) {
            case 0:
                return "v1/check_verification";
            case 1:
                return "v2/feature_flags";
            default:
                return "v1/verify_binding";
        }
    }

    @Override // defpackage.l55, defpackage.hz50
    public wj00 d() {
        switch (this.a) {
            case 1:
                wj00 d = super.d();
                d.k("X-SDK-Application", this.b);
                d.k("X-USER-UUID", this.c);
                return d;
            default:
                return super.d();
        }
    }

    @Override // defpackage.hz50
    public final y5j0 encoding() {
        switch (this.a) {
            case 0:
                return new aex();
            case 1:
                return new vh21();
            default:
                return new aex();
        }
    }

    @Override // defpackage.hz50
    public final NetworkMethod method() {
        switch (this.a) {
            case 0:
                return NetworkMethod.post;
            case 1:
                return NetworkMethod.get;
            default:
                return NetworkMethod.post;
        }
    }
}
