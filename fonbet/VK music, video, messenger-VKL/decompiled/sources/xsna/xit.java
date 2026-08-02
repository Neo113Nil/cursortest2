package xsna;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class xit implements rfn0 {
    @Override // xsna.rfn0
    public final io.reactivex.rxjava3.internal.operators.single.d0 a(boolean z) {
        ufx ufxVar = new ufx("store.getReplenishBalanceLink", new cjl0(0), new sni0(3));
        ufxVar.i("no_inapp", !z);
        bx2 e = e370.e(ufxVar);
        e.s = true;
        return new io.reactivex.rxjava3.internal.operators.single.d0(rdx0.B(e).l(new io.reactivex.rxjava3.internal.operators.mixed.k(16)), new io.reactivex.rxjava3.internal.operators.mixed.n(14), null);
    }
}
