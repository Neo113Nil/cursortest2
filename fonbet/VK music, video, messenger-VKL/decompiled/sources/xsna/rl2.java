package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.board.dto.BoardGetTopicsExtendedResponseDto;
import com.vk.api.generated.orders.dto.OrdersGetAutoBuyStatusResponseDto;
import com.vk.api.generated.services.dto.ServicesYcVKReviewsPublishSetResponseDto;
import com.vk.api.generated.store.dto.StoreGetStickersKeywordsResponseDto;
import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import com.vk.dto.live.LiveEventModel;
import com.vk.feed.design.view.newsfeed.link.EnhancedFeedLinkCard;
import com.vk.feed.design.view.newsfeed.link.FeedLinkCard;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkCardBind;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkPayWallet;
import com.vk.superapp.vkpay.checkout.api.dto.model.a;
import com.vk.superapp.vkpay.checkout.api.dto.response.VkCheckoutResponse;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.aue;
import xsna.cce;
import xsna.tlo0;
import xsna.ybe;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class rl2 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ rl2(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ?? r3;
        Object obj2;
        int i = 0;
        switch (this.b) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ArrayList arrayList = new ArrayList();
                int length = objArr.length;
                while (i < length) {
                    Object obj3 = objArr[i];
                    if (obj3 instanceof Pair) {
                        arrayList.add(obj3);
                    }
                    i++;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    String str = (String) pair.d();
                    Bitmap bitmap = (Bitmap) pair.g();
                    Pair pair2 = bitmap != null ? new Pair(str, bitmap) : null;
                    if (pair2 != null) {
                        arrayList2.add(pair2);
                    }
                }
                return pn00.s(arrayList2);
            case 1:
                return Boolean.valueOf(((OrdersGetAutoBuyStatusResponseDto) obj).e());
            case 2:
                int i2 = cr6.D;
                return s3q0.a;
            case 3:
                return new di7(fsk.C((BoardGetTopicsExtendedResponseDto) obj, new ci7(i), new x90(3), vx2.d.getContext().getResources().getString(R.string.attachment), null), null);
            case 4:
                return new oi8((ViewGroup) obj, R.layout.live_broadcast_settings_divider_item, 0);
            case 5:
                return s3q0.a;
            case 6:
                return (LiveEventModel) obj;
            case 7:
                kym0 kym0Var = (kym0) obj;
                return new xkh0(new vkh0(kym0Var.a), kym0Var.b, kym0Var.c);
            case 8:
                ybe.a aVar = (ybe.a) obj;
                boolean z = aVar.e;
                return new cce.a(z ? aVar.l : null, z);
            case 9:
                return Boolean.valueOf(((aue.b) obj).b instanceof ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.Reorder);
            case 10:
                ((ikv0) obj).a();
                return s3q0.a;
            case 11:
                return Float.valueOf(((Float) obj).floatValue() * 100.0f);
            case 12:
                return s3q0.a;
            case 13:
                vwh vwhVar = (vwh) obj;
                yig0 yig0Var = vwhVar.j;
                if ((yig0Var.d == null || yig0Var.c == null) && vwhVar.r == null) {
                    r2 = false;
                }
                return Boolean.valueOf(r2);
            case 14:
                return Boolean.valueOf(((ServicesYcVKReviewsPublishSetResponseDto) obj).d());
            case 15:
                return s3q0.a;
            case 16:
                ((uzh0) obj).h();
                return s3q0.a;
            case 17:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_notifications_off, (Context) obj);
            case 18:
                return Boolean.valueOf(!((Set) obj).isEmpty());
            case 19:
                L.f("DisplayLayoutSender", "sender error", (Throwable) obj);
                return s3q0.a;
            case 20:
                wyw wywVar = (wyw) obj;
                VkCheckoutResponse.VkCheckoutResponseStatus vkCheckoutResponseStatus = wywVar.a;
                mhu0 mhu0Var = wywVar.b;
                if (mhu0Var == null || (obj2 = mhu0Var.a) == null) {
                    r3 = EmptyList.b;
                } else {
                    Iterable<VkCardBind> iterable = (Iterable) obj2;
                    r3 = new ArrayList(c5g.u(iterable, 10));
                    for (VkCardBind vkCardBind : iterable) {
                        r3.add(new a.C1916a(vkCardBind.a, vkCardBind.b, vkCardBind.c, vkCardBind.d));
                    }
                }
                VkPayWallet vkPayWallet = wywVar.c;
                return new vww(vkCheckoutResponseStatus, r3, vkPayWallet == null ? a.b.C1917a.a : new a.b.C1918b(vkPayWallet.a, vkPayWallet.c, vkPayWallet.d, vkPayWallet.e), wywVar.d);
            case 21:
                EnhancedFeedLinkCard enhancedFeedLinkCard = new EnhancedFeedLinkCard((Context) obj, null, 6);
                enhancedFeedLinkCard.setContent(new FeedLinkCard.b.a("https://sun9-16.userapi.com/s/v1/ig2/C16DtmtNbwTY7LP95rHkQBWEQYvN352fIARx-LfyCzry79HMHg8zk-lcXIW6m-LdKWj32S9fn3-5ew1CxkvE645W.jpg?quality=95&as=32x18,48x27,72x40,108x61,160x90,240x135,360x202,480x270,540x304,640x360,720x405,1080x607,1280x720,1440x810,1920x1080&from=bu&cs=1920x0", null, false, "H,2:1"));
                enhancedFeedLinkCard.setBadge(FeedLinkCard.a.C1053a.a);
                enhancedFeedLinkCard.setFooter(new FeedLinkCard.c.a(oq.d(tlo0.Companion, "Очень длинный заголовок на столько, что должен не вмещаться в одну строку и, возможно, даже в три строки"), new tlo0.h("Очень длинный заголовок на столько, что должен не вмещаться в одну строку и, возможно, даже в три строки")));
                return enhancedFeedLinkCard;
            case 22:
                return s3q0.a;
            case 23:
                Throwable th = (Throwable) obj;
                h03.b(th);
                com.vk.metrics.eventtracking.b.a.a(th);
                return s3q0.a;
            case 24:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 25:
                return ((jnt) obj).b;
            case 26:
                L.e("Profile successfully added to recents");
                return s3q0.a;
            case 27:
                return yal0.b((StoreGetStickersKeywordsResponseDto) obj);
            case 28:
                Pair pair3 = (Pair) obj;
                return new utk(new n5w((d5w) pair3.i(), (ProfilesInfo) pair3.j()), ((d5w) pair3.i()).f);
            default:
                return Boolean.valueOf(((x410) obj).w != null);
        }
    }

    public /* synthetic */ rl2(ksn ksnVar) {
        this.b = 20;
    }
}
