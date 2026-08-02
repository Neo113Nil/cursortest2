package defpackage;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersLocationCardCloseReason;
import com.yandex.go.chargers.station.presentation.details.ChargersStationDetailsModalView;
import com.yandex.go.chargers.station.presentation.details.components.ChargersStationAboutLocationView;
import com.yandex.go.chargers.station.presentation.details.components.ChargersStationFooterView;
import com.yandex.go.design.divider.CardDivider;

/* loaded from: classes12.dex */
public final class pra implements rra {
    public final /* synthetic */ ChargersStationDetailsModalView a;

    public pra(ChargersStationDetailsModalView chargersStationDetailsModalView) {
        this.a = chargersStationDetailsModalView;
    }

    @Override // defpackage.rra
    public final void G6(lra lraVar) {
        ChargersStationFooterView chargersStationFooterView;
        chargersStationFooterView = this.a.chargersStationFooterView;
        chargersStationFooterView.updateButtons(lraVar.a);
    }

    @Override // defpackage.rra
    public final void g8(lsa lsaVar) {
        msa binding;
        msa binding2;
        msa binding3;
        msa binding4;
        msa binding5;
        msa binding6;
        msa binding7;
        ChargersStationFooterView chargersStationFooterView;
        msa binding8;
        msa binding9;
        msa binding10;
        msa binding11;
        sra sraVar;
        msa binding12;
        msa binding13;
        msa binding14;
        msa binding15;
        msa binding16;
        ChargersStationFooterView chargersStationFooterView2;
        msa binding17;
        msa binding18;
        boolean z = lsaVar instanceof jsa;
        ChargersStationDetailsModalView chargersStationDetailsModalView = this.a;
        if (z) {
            chargersStationDetailsModalView.setBehaviorState(4);
            binding12 = chargersStationDetailsModalView.getBinding();
            binding12.h.loading();
            binding13 = chargersStationDetailsModalView.getBinding();
            binding13.b.loading();
            binding14 = chargersStationDetailsModalView.getBinding();
            binding14.k.loading();
            binding15 = chargersStationDetailsModalView.getBinding();
            binding15.j.loading();
            binding16 = chargersStationDetailsModalView.getBinding();
            binding16.e.setVisibility(4);
            chargersStationFooterView2 = chargersStationDetailsModalView.chargersStationFooterView;
            chargersStationFooterView2.loading();
            binding17 = chargersStationDetailsModalView.getBinding();
            binding17.g.setVisibility(8);
            binding18 = chargersStationDetailsModalView.getBinding();
            binding18.i.setVisibility(8);
            return;
        }
        if (lsaVar instanceof isa) {
            sraVar = chargersStationDetailsModalView.presenter;
            cy9 cy9Var = ((isa) lsaVar).a;
            sraVar.z.b = ChargersAnalytics$ChargersLocationCardCloseReason.Error;
            ((hsa) sraVar.H.a).r(new j1a(cy9Var, 5));
            return;
        }
        if (!(lsaVar instanceof ksa)) {
            w511.b();
            return;
        }
        gra graVar = ((ksa) lsaVar).a;
        binding = chargersStationDetailsModalView.getBinding();
        binding.h.success(graVar);
        binding2 = chargersStationDetailsModalView.getBinding();
        ChargersStationAboutLocationView chargersStationAboutLocationView = binding2.b;
        ara araVar = graVar.d;
        swa swaVar = graVar.e;
        chargersStationAboutLocationView.success(araVar);
        binding3 = chargersStationDetailsModalView.getBinding();
        binding3.j.success(swaVar);
        binding4 = chargersStationDetailsModalView.getBinding();
        binding4.e.setVisibility(swaVar != null ? 0 : 8);
        binding5 = chargersStationDetailsModalView.getBinding();
        binding5.k.success(graVar.g);
        binding6 = chargersStationDetailsModalView.getBinding();
        CardDivider cardDivider = binding6.f;
        binding7 = chargersStationDetailsModalView.getBinding();
        cardDivider.setVisibility(binding7.k.getVisibility() == 0 ? 0 : 8);
        chargersStationFooterView = chargersStationDetailsModalView.chargersStationFooterView;
        chargersStationFooterView.success(graVar.b, graVar.f);
        binding8 = chargersStationDetailsModalView.getBinding();
        binding8.c.submitBadges(graVar.h);
        chargersStationDetailsModalView.updateCardAnchorHeight();
        binding9 = chargersStationDetailsModalView.getBinding();
        chargersStationDetailsModalView.success(binding9.i, graVar.j);
        binding10 = chargersStationDetailsModalView.getBinding();
        CardDivider cardDivider2 = binding10.g;
        binding11 = chargersStationDetailsModalView.getBinding();
        cardDivider2.setVisibility(binding11.i.getVisibility() == 0 ? 0 : 8);
    }
}
