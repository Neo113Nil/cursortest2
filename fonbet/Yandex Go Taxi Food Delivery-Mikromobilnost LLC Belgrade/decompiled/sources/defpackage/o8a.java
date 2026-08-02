package defpackage;

import com.yandex.go.chargers.offer.ui.mvp.ChargersOfferModalView;
import ru.yandex.taxi.design.FloatButtonIconComponent;

/* loaded from: classes12.dex */
public final class o8a implements s8a {
    public final /* synthetic */ ChargersOfferModalView a;

    public o8a(ChargersOfferModalView chargersOfferModalView) {
        this.a = chargersOfferModalView;
    }

    @Override // defpackage.s8a
    public final void Jf(paa paaVar) {
        boolean z = paaVar instanceof oaa;
        ChargersOfferModalView chargersOfferModalView = this.a;
        if (z) {
            chargersOfferModalView.renderSuccess((oaa) paaVar);
        } else if (jl40.l(paaVar, maa.a)) {
            chargersOfferModalView.renderLoading();
        } else {
            if (paaVar instanceof laa) {
                return;
            }
            w511.b();
        }
    }

    @Override // defpackage.s8a
    public final void a2(boolean z, boolean z2) {
        int i;
        FloatButtonIconComponent floatButtonIconComponent;
        ChargersOfferModalView chargersOfferModalView = this.a;
        if (z) {
            i = z2 ? chargersOfferModalView.minOffsetWithExpandedPlaque : chargersOfferModalView.minOffsetWithCollapsedPlaque;
        } else {
            floatButtonIconComponent = chargersOfferModalView.backButton;
            i = floatButtonIconComponent.getHeight();
        }
        chargersOfferModalView.applyMinOffset(i);
    }
}
