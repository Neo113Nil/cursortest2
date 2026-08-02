package defpackage;

import android.net.Uri;
import com.ybsdk.core.transfer.utils.TransferDeeplink;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;

/* loaded from: classes3.dex */
public final class lu01 implements di01 {
    public final /* synthetic */ a3h a;

    public lu01(a3h a3hVar) {
        this.a = a3hVar;
    }

    public final TransferDeeplink a(String str) {
        Deeplink e = w691.e(this.a, Uri.parse(str), true, null, false, 12);
        BaseDeeplinkAction action = e != null ? e.getAction() : null;
        return action instanceof DeeplinkAction.SelectMember ? new TransferDeeplink.SelectTarget(((DeeplinkAction.SelectMember) action).getYbId()) : action instanceof DeeplinkAction.TransferPartners ? new TransferDeeplink.RawAction(str) : action instanceof DeeplinkAction.PhoneTransfer ? TransferDeeplink.PhoneTransfer.INSTANCE : jl40.l(action, DeeplinkAction.CrossBorderTransfer.INSTANCE) ? TransferDeeplink.CrossBorderTransfer.INSTANCE : jl40.l(action, DeeplinkAction.SelfTransfer.INSTANCE) ? TransferDeeplink.Self.Transfer.INSTANCE : jl40.l(action, DeeplinkAction.RequisitesTransfer.INSTANCE) ? TransferDeeplink.RequisitesTransfer.INSTANCE : jl40.l(action, DeeplinkAction.SelfTopup.INSTANCE) ? TransferDeeplink.Self.Topup.INSTANCE : jl40.l(action, DeeplinkAction.TransferItemsSheet.INSTANCE) ? TransferDeeplink.Self.ItemsSheet.INSTANCE : jl40.l(action, DeeplinkAction.TransferSectionsSheet.INSTANCE) ? TransferDeeplink.Self.SectionsSheet.INSTANCE : jl40.l(action, DeeplinkAction.Me2MeTopup.INSTANCE) ? TransferDeeplink.Me2MeTopup.INSTANCE : jl40.l(action, DeeplinkAction.AftTopup.INSTANCE) ? TransferDeeplink.AftTopup.INSTANCE : new TransferDeeplink.RawAction(str);
    }
}
