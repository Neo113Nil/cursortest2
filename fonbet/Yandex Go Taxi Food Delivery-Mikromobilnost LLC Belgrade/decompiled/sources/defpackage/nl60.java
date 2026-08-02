package defpackage;

import com.yandex.xplat.common.NetworkMethod;
import com.yandex.xplat.payment.sdk.NspkMembersSource;
import com.yandex.xplat.payment.sdk.ShowSbpTokensFlag;

/* loaded from: classes2.dex */
public final class nl60 extends l55 {
    public final /* synthetic */ int a;
    public final Enum b;

    public /* synthetic */ nl60(Enum r1, int i) {
        this.a = i;
        this.b = r1;
    }

    @Override // defpackage.l55, defpackage.hz50
    public wj00 a() {
        switch (this.a) {
            case 1:
                wj00 a = super.a();
                a.i("show_sbp_tokens", jl40.l(((ShowSbpTokensFlag) this.b).getValue(), ShowSbpTokensFlag.enabled.getValue()));
                return a;
            default:
                return super.a();
        }
    }

    @Override // defpackage.l55, defpackage.hz50
    public wj00 b() {
        switch (this.a) {
            case 0:
                wj00 b = super.b();
                b.k("src", ((NspkMembersSource) this.b).getValue());
                return b;
            default:
                return super.b();
        }
    }

    @Override // defpackage.hz50
    public final String c() {
        switch (this.a) {
            case 0:
                return "v1/nspk_bank_apps_common";
            default:
                return "v1/payment_methods";
        }
    }

    @Override // defpackage.hz50
    public final y5j0 encoding() {
        switch (this.a) {
            case 0:
                return new vh21();
            default:
                return new aex();
        }
    }

    @Override // defpackage.hz50
    public final NetworkMethod method() {
        switch (this.a) {
            case 0:
                return NetworkMethod.get;
            default:
                return NetworkMethod.post;
        }
    }
}
