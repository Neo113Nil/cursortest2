package xsna;

import com.vk.ecomm.market.api.di.MarketComponent;

/* compiled from: MarketCatalogCommonExternalEventHandlerDelegate.kt */
/* loaded from: classes.dex */
public final class yu00 extends l5a implements w8i {
    public final d9a c;
    public final io.reactivex.rxjava3.disposables.b d;

    public yu00(q3a q3aVar) {
        super(q3aVar);
        this.c = new d9a(q3aVar);
        this.d = new io.reactivex.rxjava3.disposables.b();
    }

    @Override // xsna.l5a
    public final void a() {
        this.d.b(((MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class))).U1().a().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new xu00(new wu00(this), 0)));
    }
}
