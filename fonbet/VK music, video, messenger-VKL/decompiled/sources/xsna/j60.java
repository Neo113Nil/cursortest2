package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.api.generated.market.dto.MarketCommunityReviewCreateTypeHintConfigDto;
import com.vk.api.generated.market.dto.MarketGetCommunityReviewCreateConfigResponseDto;
import com.vk.api.generated.video.dto.VideoGetResponseDto;
import com.vk.core.utils.newtork.d;
import com.vk.ecomm.design.view.DiscreteProgressBar;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.fullscreenvideo.design.view.bottom.FullscreenBottomControlsView;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.posting.market_picker.presentation.base.view.e;
import com.vk.profile.community.details.impl.name_history.e;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.gte;
import xsna.lu4;
import xsna.tj50;
import xsna.wfu;
import xsna.zze;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class j60 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ j60(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ?? r1;
        switch (this.b) {
            case 0:
                com.vk.core.utils.newtork.d dVar = (com.vk.core.utils.newtork.d) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"Offline:ActionSynchronizerInteractorImpl", ho8.a(new StringBuilder("Notified network is "), dVar instanceof d.a ? "available" : "lost", JwtParser.SEPARATOR_CHAR)});
                }
                return Boolean.valueOf(dVar instanceof d.a);
            case 1:
                return s3q0.a;
            case 2:
                return lu4.a.c.a;
            case 3:
                L.i((Throwable) obj);
                return s3q0.a;
            case 4:
                return s3q0.a;
            case 5:
                return Boolean.valueOf(((it80) obj).a != null);
            case 6:
                VideoGetResponseDto videoGetResponseDto = (VideoGetResponseDto) obj;
                return ums0.e(ums0.a, videoGetResponseDto.e(), videoGetResponseDto.g(), videoGetResponseDto.d(), false, 52);
            case 7:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 8:
                String str = nad.u;
                return Boolean.FALSE;
            case 9:
                return fnd.c();
            case 10:
                return Boolean.valueOf(!(((gte.a) obj).d instanceof gte.a.InterfaceC2955a.C2956a));
            case 11:
                return new wfu.a.C3931a((fde) obj, new ild(null), null);
            case 12:
                return Boolean.valueOf(((zze.a) obj).l);
            case 13:
                MarketGetCommunityReviewCreateConfigResponseDto marketGetCommunityReviewCreateConfigResponseDto = (MarketGetCommunityReviewCreateConfigResponseDto) obj;
                String d = marketGetCommunityReviewCreateConfigResponseDto.d();
                List<MarketCommunityReviewCreateTypeHintConfigDto> d2 = marketGetCommunityReviewCreateConfigResponseDto.e().d();
                if (d2 != null) {
                    List<MarketCommunityReviewCreateTypeHintConfigDto> list = d2;
                    r1 = new ArrayList(c5g.u(list, 10));
                    for (MarketCommunityReviewCreateTypeHintConfigDto marketCommunityReviewCreateTypeHintConfigDto : list) {
                        r1.add(new dak(marketCommunityReviewCreateTypeHintConfigDto.f(), marketCommunityReviewCreateTypeHintConfigDto.e(), marketCommunityReviewCreateTypeHintConfigDto.d(), marketCommunityReviewCreateTypeHintConfigDto.g()));
                    }
                } else {
                    r1 = EmptyList.b;
                }
                return new n7k(r1, d);
            case 14:
                return new e.b(((tj50.a) obj).a(new ob(14), ao8.d));
            case 15:
                return new iig0((ViewGroup) obj, cn70.b(16));
            case 16:
                int i = CommunityReviewsFragment.o0;
                qgi0.r((tgi0) obj, "ERROR_RETRY_BUTTON");
                return s3q0.a;
            case 17:
                return s3q0.a;
            case 18:
                return Boolean.valueOf(((c9k) obj).w);
            case 19:
                wjs0.a(new fwr0(0));
                return s3q0.a;
            case 20:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_dialog_option_open_group_profile);
            case 21:
                qgi0.r((tgi0) obj, "drafts_list_delete_dialog_cancel");
                return s3q0.a;
            case 22:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 23:
                int i2 = FullscreenBottomControlsView.o;
                return s3q0.a;
            case 24:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 25:
                qgi0.r((tgi0) obj, "storefront_group_avatar");
                return s3q0.a;
            case 26:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 27:
                return new DiscreteProgressBar((Context) obj, null, 6);
            case 28:
                return k4g0.a((k4g0) obj, true, false, 3967);
            default:
                return ((e.b) obj).a;
        }
    }

    public /* synthetic */ j60(Object obj, int i) {
        this.b = i;
    }
}
