package defpackage;

import com.yandex.go.chargers.station.presentation.details.ChargersStationDetailsModalView;

/* loaded from: classes12.dex */
public final /* synthetic */ class nra implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChargersStationDetailsModalView b;

    public /* synthetic */ nra(ChargersStationDetailsModalView chargersStationDetailsModalView, int i) {
        this.a = i;
        this.b = chargersStationDetailsModalView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 insetsType$lambda$0;
        zy11 onAttachedToWindow$lambda$0;
        int i = this.a;
        ChargersStationDetailsModalView chargersStationDetailsModalView = this.b;
        switch (i) {
            case 0:
                insetsType$lambda$0 = ChargersStationDetailsModalView.insetsType$lambda$0(chargersStationDetailsModalView, (t1w) obj);
                return insetsType$lambda$0;
            default:
                onAttachedToWindow$lambda$0 = ChargersStationDetailsModalView.onAttachedToWindow$lambda$0(chargersStationDetailsModalView, (uj9) obj);
                return onAttachedToWindow$lambda$0;
        }
    }
}
