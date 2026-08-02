package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$CastConnectOfferModalType;
import java.util.List;

/* compiled from: TvRetranslationSuggestionBottomSheet.kt */
/* loaded from: classes7.dex */
public final class ctp0 {
    public final vz9 a;
    public final List<vz9> b;
    public final veg0 c;
    public final xz9 d;
    public final mh70 e;
    public fwb0 f;

    public ctp0(FragmentActivity fragmentActivity, vz9 vz9Var, List list, veg0 veg0Var, xz9 xz9Var, mh70 mh70Var) {
        this.a = vz9Var;
        this.b = list;
        this.c = veg0Var;
        this.d = xz9Var;
        this.e = mh70Var;
    }

    public final MobileOfficialAppsVideoStat$CastConnectOfferModalType a() {
        if (this.a == null) {
            return MobileOfficialAppsVideoStat$CastConnectOfferModalType.OFFER_MODAL_FIRST;
        }
        List<vz9> list = this.b;
        return (list != null ? list.size() : 0) == 1 ? MobileOfficialAppsVideoStat$CastConnectOfferModalType.OFFER_MODAL_RECONNECT : MobileOfficialAppsVideoStat$CastConnectOfferModalType.OFFER_MODAL_RECONNECT_MULTI;
    }
}
