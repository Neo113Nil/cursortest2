package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.drive.vertical.ui.tariff_card.collapsed.DriveTariffCardCollapsedView;
import ru.yandex.taxi.address.design.SourceDestinationComponent;

/* loaded from: classes12.dex */
public final class ogm implements jgm {
    public final /* synthetic */ DriveTariffCardCollapsedView a;

    public ogm(DriveTariffCardCollapsedView driveTariffCardCollapsedView) {
        this.a = driveTariffCardCollapsedView;
    }

    @Override // defpackage.jgm
    public final void Ra(mct0 mct0Var) {
        fgm fgmVar;
        fgm fgmVar2;
        DriveTariffCardCollapsedView driveTariffCardCollapsedView = this.a;
        fgmVar = driveTariffCardCollapsedView.binding;
        fgmVar.b.render(mct0Var);
        fgmVar2 = driveTariffCardCollapsedView.binding;
        fgmVar2.b.setVisibility(0);
    }

    @Override // defpackage.jgm
    public final void b3(wi70 wi70Var) {
        fgm fgmVar;
        fgm fgmVar2;
        DriveTariffCardCollapsedView driveTariffCardCollapsedView = this.a;
        fgmVar = driveTariffCardCollapsedView.binding;
        fgmVar.d.render(wi70Var);
        fgmVar2 = driveTariffCardCollapsedView.binding;
        fgmVar2.d.setVisibility(0);
    }

    @Override // defpackage.jgm
    public final void s6(hx0 hx0Var) {
        fgm fgmVar;
        wdt0 wdt0Var;
        zzi zziVar;
        DriveTariffCardCollapsedView driveTariffCardCollapsedView = this.a;
        fgmVar = driveTariffCardCollapsedView.binding;
        SourceDestinationComponent sourceDestinationComponent = fgmVar.b;
        wdt0Var = driveTariffCardCollapsedView.sourcePinDrawableFactory;
        Drawable b = wdt0Var.b(hx0Var.a);
        zziVar = driveTariffCardCollapsedView.destinationPinDrawableFactory;
        sourceDestinationComponent.applyDrawables(b, zziVar.b(hx0Var.b));
    }
}
