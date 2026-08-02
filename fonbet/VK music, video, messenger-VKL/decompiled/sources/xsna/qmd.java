package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.shortVideo.dto.ShortVideoSetCoOwnerStatusStatusDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: ClipsCoauthorsRepository.kt */
/* loaded from: classes16.dex */
public final class qmd {
    public final bpn0 a = new bpn0(new qe3(10));
    public final bpn0 b = new bpn0(new com.vk.movika.sdk.base.ui.o0(9));
    public final bpn0 c = new bpn0(new lk(7));
    public final bpn0 d = new bpn0(new com.vk.movika.sdk.base.logic.interactor.l(9));

    public final io.reactivex.rxjava3.internal.operators.single.y a(int i, String str, boolean z) {
        List l = e43.l("co_ownership_enabled", "sex", "is_nft", "photo_base", "blacklisted", "blacklisted_by_me", "age_mark", "age_limits");
        tfx tfxVar = new tfx("search.getCoowners", new alb0(3), new zy60(5));
        if (str != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 0, 12);
        }
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, i, 0, 0, 8);
        tfxVar.f(20, 0, 200, SignalingProtocol.KEY_LIMIT);
        if (l != null) {
            tfxVar.i("fields", l);
        }
        tfxVar.j("without_profiles", z);
        return rsg0.W(yfb.x(tfxVar), 7).l(new bk1(new wg1(1, (com.vk.clips.coauthors.domain.model.b) this.a.getValue(), com.vk.clips.coauthors.domain.model.b.class, "mapSearchResponse", "mapSearchResponse-IoAF18A(Lcom/vk/api/generated/search/dto/SearchGetCoOwnersResponseDto;)Ljava/lang/Object;", 0, 4), 4));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.e3 b(int i, UserId userId, List list, boolean z) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(rsg0.l0(yfb.x(((mgj0) this.b.getValue()).r(userId, i, z ? ShortVideoSetCoOwnerStatusStatusDto.APPROVED : ShortVideoSetCoOwnerStatusStatusDto.REJECTED, (UserId) it.next())), null, 3));
        }
        return new io.reactivex.rxjava3.internal.operators.observable.e3(null, arrayList, new e7(new pf(14), 13), io.reactivex.rxjava3.core.g.b);
    }
}
