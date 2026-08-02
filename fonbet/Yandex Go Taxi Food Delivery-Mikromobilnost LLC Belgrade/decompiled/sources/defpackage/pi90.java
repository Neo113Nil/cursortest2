package defpackage;

import android.net.Uri;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.partnerselection.api.PartnerSelectionDeeplink;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;

/* loaded from: classes3.dex */
public final class pi90 implements zh90 {
    public final /* synthetic */ a3h a;

    public pi90(a3h a3hVar) {
        this.a = a3hVar;
    }

    public final PartnerSelectionDeeplink a(String str) {
        Deeplink e = w691.e(this.a, Uri.parse(str), true, null, false, 12);
        BaseDeeplinkAction action = e != null ? e.getAction() : null;
        return action instanceof DeeplinkAction.SelectMember ? new PartnerSelectionDeeplink.SelectPartner(((DeeplinkAction.SelectMember) action).getYbId()) : action instanceof DeeplinkAction.TransferPartners ? PartnerSelectionDeeplink.AllPartners.INSTANCE : action instanceof DeeplinkAction.CrossBorderMember ? new PartnerSelectionDeeplink.SelectCrossBorderPartner(((DeeplinkAction.CrossBorderMember) action).getYbId()) : new PartnerSelectionDeeplink.RawAction(str);
    }
}
