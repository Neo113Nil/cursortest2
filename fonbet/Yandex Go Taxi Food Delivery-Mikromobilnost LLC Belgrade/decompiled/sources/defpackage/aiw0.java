package defpackage;

/* loaded from: classes2.dex */
public final class aiw0 extends ciw0 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aiw0(String str, String str2, String str3, int i) {
        super(str, str2, str3);
        this.d = i;
    }

    @Override // defpackage.ciw0, defpackage.thj
    public final wj00 e() {
        switch (this.d) {
            case 0:
                wj00 e = super.e();
                e.k("payment_method", "new_sbp_token");
                e.k("cvn", "");
                return e;
            default:
                wj00 e2 = super.e();
                e2.k("payment_method", "sbp_qr");
                e2.k("cvn", "");
                return e2;
        }
    }
}
