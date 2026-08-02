package xsna;

import android.content.Context;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.market.dto.MarketGetByIdExtendedResponseDto;
import com.vk.api.generated.market.dto.MarketMarketItemFullDto;
import com.vk.clips.interests.api.ClipsInterestsStatusProvider;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.feed.design.view.newsfeed.link.EnhancedFeedLinkCard;
import com.vk.feed.design.view.newsfeed.link.FeedLinkCard;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.newsfeed.impl.feedlikes.FeedLikesFilter;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.reefton.literx.CompositeException;
import com.vk.sharing.api.dto.Target;
import com.vk.superapp.vkpay.checkout.api.dto.response.TransactionStatusResponse;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.c910;
import xsna.cce;
import xsna.r2j;
import xsna.tlo0;
import xsna.ybe;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class x90 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ x90(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Dialog dialog;
        String str;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                Target target = (Target) obj;
                String str2 = target.f;
                if (str2 != null && str2.length() != 0 && !target.h && brm0.B(str2, "http", true) && target.zb() && !target.n && (dialog = target.i) != null && !dialog.Jc() && !dialog.Va() && !dialog.E8()) {
                    r3 = true;
                }
                return Boolean.valueOf(r3);
            case 2:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 3:
                return fwx0.c().a((CharSequence) obj);
            case 4:
                MusicTrack musicTrack = (MusicTrack) obj;
                HashSet hashSet = new HashSet();
                List<Artist> list = musicTrack.t;
                if (list != null) {
                    hashSet.addAll(list);
                }
                List<Artist> list2 = musicTrack.u;
                if (list2 != null) {
                    hashSet.addAll(list2);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    String str3 = ((Artist) it.next()).c;
                    if (str3 != null) {
                        arrayList.add(str3);
                    }
                }
                return p4g.k(arrayList, "", null);
            case 5:
                ((pvw0) obj).D();
                return s3q0.a;
            case 6:
                return new cce.d(((ybe.a) obj).m);
            case 7:
                return Boolean.valueOf(((ClipsInterestsStatusProvider.Status) obj) == ClipsInterestsStatusProvider.Status.COMPLETED);
            case 8:
                int i = ClipsWrapperFragment.Q0;
                qgi0.r((tgi0) obj, "clips_wrapper_top_bar_title");
                return s3q0.a;
            case 9:
                return Float.valueOf(((Float) obj).floatValue() / 100.0f);
            case 10:
                vwh vwhVar = (vwh) obj;
                yig0 yig0Var = vwhVar.j;
                boolean f = epx.f(yig0Var.d, vwhVar.c);
                big0 big0Var = vwhVar.k.get(yig0Var.d);
                str = big0Var != null ? big0Var.g : null;
                String str4 = str != null ? str : "";
                if (vwhVar.r == null && vwhVar.e) {
                    r3 = true;
                }
                return new f4g0(str4, f, r3);
            case 11:
                return r2j.d.a;
            case 12:
                qgi0.c((tgi0) obj);
                return s3q0.a;
            case 13:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_clear_history, (Context) obj);
            case 14:
                L.i((Throwable) obj);
                return s3q0.a;
            case 15:
                qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                return ((d6n) obj).b.b;
            case 16:
                TransactionStatusResponse transactionStatusResponse = (TransactionStatusResponse) obj;
                return new ajp0(transactionStatusResponse.a, transactionStatusResponse.b, transactionStatusResponse.c, transactionStatusResponse.d);
            case 17:
                EnhancedFeedLinkCard enhancedFeedLinkCard = new EnhancedFeedLinkCard((Context) obj, null, 6);
                enhancedFeedLinkCard.setContent(new FeedLinkCard.b.a("https://sun9-16.userapi.com/s/v1/ig2/C16DtmtNbwTY7LP95rHkQBWEQYvN352fIARx-LfyCzry79HMHg8zk-lcXIW6m-LdKWj32S9fn3-5ew1CxkvE645W.jpg?quality=95&as=32x18,48x27,72x40,108x61,160x90,240x135,360x202,480x270,540x304,640x360,720x405,1080x607,1280x720,1440x810,1920x1080&from=bu&cs=1920x0", null, true, "H,2:1"));
                enhancedFeedLinkCard.setOverlayContent(new FeedLinkCard.OverlayContent.ActionButtonWithTitle("Очень длинный заголовок на столько, что должен не вмещаться в одну строку и, возможно, даже в три строки", "Подробнее", FeedLinkCard.OverlayContent.ActionButtonWithTitle.Appearance.Contrast));
                enhancedFeedLinkCard.setBadge(FeedLinkCard.a.C1053a.a);
                enhancedFeedLinkCard.setFooter(new FeedLinkCard.c.a(oq.d(tlo0.Companion, "Очень длинный заголовок на столько, что должен не вмещаться в одну строку и, возможно, даже в три строки"), new tlo0.h("Автор: Иван Иванов · 5 мин чтения")));
                return enhancedFeedLinkCard;
            case 18:
                return ((FeedLikesFilter) obj).i();
            case 19:
                return Boolean.valueOf(((k9d0) obj).b.a);
            case 20:
                return s3q0.a;
            case 21:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 22:
                return ((jnt) obj).e;
            case 23:
                return s3q0.a;
            case 24:
                throw new CompositeException(new RuntimeException("The exception was not handled due to missing onError handler in the subscribe() method call"), (Throwable) obj);
            case 25:
                long j = ((UserId) obj).b;
                if (Long.MIN_VALUE > j || j > Long.MAX_VALUE) {
                    throw new IllegalArgumentException("Param co_owner_ids not in -9223372036854775808..9223372036854775807");
                }
                return String.valueOf(j);
            case 26:
                ((Long) obj).longValue();
                return s3q0.a;
            case 27:
                return (MarketMarketItemFullDto) j5g.Y(((MarketGetByIdExtendedResponseDto) obj).d());
            case 28:
                x410 x410Var = (x410) obj;
                s410 s410Var = x410Var.B;
                boolean f2 = epx.f(s410Var.d, x410Var.A);
                big0 big0Var2 = x410Var.C.get(s410Var.d);
                str = big0Var2 != null ? big0Var2.g : null;
                return new f4g0(str != null ? str : "", f2, x410Var.m);
            default:
                return c910.d.a;
        }
    }
}
