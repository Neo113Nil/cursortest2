package defpackage;

/* loaded from: classes15.dex */
public final class mu5 implements wfd, t070, mdq0 {
    public final /* synthetic */ tls a;

    public /* synthetic */ mu5(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // defpackage.wfd
    public zfd a(Object obj, chd chdVar) {
        agd agdVar = new agd(obj, chdVar);
        this.a.invoke(agdVar);
        return agdVar.a();
    }

    @Override // defpackage.mdq0
    public void onAddMethodClicked() {
    }

    @Override // defpackage.mdq0
    public void onAdditionalButtonClicked(el0 el0Var) {
    }

    @Override // defpackage.mdq0
    public void onBackPressedFromSbp() {
    }

    @Override // defpackage.mdq0
    public void onCreditPaymentMethodChanged(saf safVar) {
    }

    @Override // defpackage.mdq0
    public void onSbpMethodClicked() {
    }

    @Override // defpackage.mdq0
    public void onSbpWidgetClicked() {
    }

    @Override // defpackage.mdq0
    public void onSelectedAccountChanged(sl slVar) {
        this.a.invoke(slVar.a);
    }

    @Override // defpackage.mdq0
    public void onSelectedPaymentMethodChanged(h5a0 h5a0Var) {
    }

    @Override // defpackage.t070
    public /* synthetic */ void onSuccess(Object obj) {
        this.a.invoke(obj);
    }
}
