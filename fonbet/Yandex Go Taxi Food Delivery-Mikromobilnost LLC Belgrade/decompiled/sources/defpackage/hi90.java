package defpackage;

import com.ybsdk.feature.partnerselection.internal.network.PartnerSelectionApi;
import com.ybsdk.feature.partnerselection.internal.network.PartnerSelectionTipsApi;

/* loaded from: classes14.dex */
public final class hi90 implements v7p {
    public final /* synthetic */ int a;
    public final j3g b;

    public /* synthetic */ hi90(j3g j3gVar, int i) {
        this.a = i;
        this.b = j3gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        j3g j3gVar = this.b;
        switch (i) {
            case 0:
                return (PartnerSelectionApi) ((t0k0) j3gVar.get()).b(PartnerSelectionApi.class);
            default:
                return (PartnerSelectionTipsApi) ((t0k0) j3gVar.get()).b(PartnerSelectionTipsApi.class);
        }
    }
}
