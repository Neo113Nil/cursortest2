package xsna;

import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.store.dto.StoreGetStickersBonusRewardTermsResponseDto;
import com.vk.api.generated.video.dto.VideoGetResponseDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.group.Group;
import com.vk.dto.stickers.bonus.StickersBonusRewardTerms;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.miniapps.impl.picture_in_picture.overlay.MiniAppCallPiPOverlayService;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.Pair;
import xsna.erx;
import xsna.u7p0;
import xsna.v9i0;
import xsna.yl70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class viu implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ viu(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        u7p0.a aVar = null;
        int i = 1;
        switch (this.b) {
            case 0:
                return Integer.valueOf(GroupCallViewModel.p.size());
            case 1:
                L.C("Can't initialize holiday interaction", (Throwable) obj);
                return s3q0.a;
            case 2:
                qgi0.r((tgi0) obj, "home_fragment_top_bar_tag_title");
                return s3q0.a;
            case 3:
                erx erxVar = (erx) obj;
                if (erxVar instanceof erx.c) {
                    aVar = new u7p0.a(erxVar != null ? ((erx.c) erxVar).d.c : "", ((erx.c) erxVar).d.a);
                }
                return new u7p0(aVar, 1);
            case 4:
                L.j((Throwable) obj, "Managed groups update unread count unexpected pipe error");
                return s3q0.a;
            case 5:
                return mx00.a;
            case 6:
                return Boolean.valueOf(((k110) obj).e);
            case 7:
                k720.l = null;
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 8:
                VoipViewModelState voipViewModelState = (VoipViewModelState) obj;
                int i2 = MiniAppCallPiPOverlayService.e;
                return Boolean.valueOf(voipViewModelState == VoipViewModelState.Idle);
            case 9:
                qgi0.r((tgi0) obj, "trackArtist");
                return s3q0.a;
            case 10:
                return s3q0.a;
            case 11:
                return fpf0.a(((yl70.b) obj).getClass());
            case 12:
                OKVoipEngine oKVoipEngine = OKVoipEngine.b;
                p6y p6yVar = new p6y((dhw0) obj, 15);
                oKVoipEngine.getClass();
                OKVoipEngine.S(p6yVar);
                return s3q0.a;
            case 13:
                return Boolean.valueOf(((VoipViewModelState) obj) != VoipViewModelState.Idle);
            case 14:
                return Boolean.valueOf(((sy40) obj).z);
            case 15:
                Group group = (Group) obj;
                if (group == null) {
                    return null;
                }
                UserProfile userProfile = new UserProfile();
                userProfile.c = fkq0.e(group.c);
                userProfile.e = group.d;
                userProfile.g = group.f;
                userProfile.h = group.e;
                return userProfile;
            case 16:
                j03.l((Throwable) obj);
                return s3q0.a;
            case 17:
                return s3q0.a;
            case 18:
                VideoGetResponseDto videoGetResponseDto = (VideoGetResponseDto) obj;
                List e = ums0.e(ums0.a, videoGetResponseDto.e(), videoGetResponseDto.g(), videoGetResponseDto.d(), false, 52);
                ArrayList arrayList = new ArrayList(c5g.u(e, 10));
                Iterator it = e.iterator();
                while (it.hasNext()) {
                    arrayList.add(k15.B((VideoFile) it.next()));
                }
                return arrayList;
            case 19:
                return ((v9i0.d) obj).d;
            case 20:
                StoreGetStickersBonusRewardTermsResponseDto storeGetStickersBonusRewardTermsResponseDto = (StoreGetStickersBonusRewardTermsResponseDto) obj;
                return new StickersBonusRewardTerms(storeGetStickersBonusRewardTermsResponseDto.d().getTitle(), storeGetStickersBonusRewardTermsResponseDto.d().d());
            case 21:
                List singletonList = Collections.singletonList("store_new_items");
                tfx tfxVar = new tfx("store.markAsViewed", new bzk0(i), new ly80(4));
                tfx.o(tfxVar, "type", "stickers", 0, 0, 12);
                if (singletonList != null) {
                    tfxVar.i("reset", singletonList);
                }
                return new io.reactivex.rxjava3.internal.operators.observable.b1(io.reactivex.rxjava3.core.q.T(yfb.x(tfxVar)));
            case 22:
                return mol0.a((mol0) obj, null, null, null, null, null, null, 127);
            case 23:
                return Boolean.valueOf(((nov) obj) instanceof h7m0);
            case 24:
                return new Pair((VkPaginationList) obj, Boolean.TRUE);
            case 25:
                ((Boolean) obj).booleanValue();
                return s3q0.a;
            case 26:
                qgi0.d((tgi0) obj);
                return s3q0.a;
            case 27:
                return Float.valueOf(((vkr0) obj).a);
            case 28:
                return Optional.empty();
            default:
                Serializer.c<UIBlockButtons> cVar = UIBlockButtons.CREATOR;
                return ((UIBlock) obj).toString();
        }
    }

    public /* synthetic */ viu(v8l0 v8l0Var) {
        this.b = 20;
    }
}
