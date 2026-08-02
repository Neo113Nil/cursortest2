package xsna;

import android.content.Context;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseUploadServerDto;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.draftslist.impl.ui.entity.DraftsListState;
import com.vk.dto.live.LiveEventModel;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.video.VideoOwner;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.link.EnhancedFeedLinkCard;
import com.vk.feed.design.view.newsfeed.link.FeedLinkCard;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.profile.core.scheduled_clips.bottom_sheet.options.CommunityScheduledClipsBottomSheetSideEffectOptions;
import com.vk.reefton.literx.schedulers.ExecutorScheduler;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import xsna.a990;
import xsna.fm70;
import xsna.gn90;
import xsna.lta;
import xsna.qr60;
import xsna.tj50;
import xsna.tlo0;
import xsna.y410;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class d0k implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ d0k(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List<LiveEventModel> list;
        switch (this.b) {
            case 0:
                return lta.a.c.b.a;
            case 1:
                BaseUploadServerDto baseUploadServerDto = (BaseUploadServerDto) obj;
                return new ncq0(baseUploadServerDto.e(), baseUploadServerDto.d(), null, null, null, 28);
            case 2:
                qgi0.r((tgi0) obj, "errorRetryButton");
                return s3q0.a;
            case 3:
                tj50.a aVar = (tj50.a) obj;
                ci3 ci3Var = new ci3(19);
                ao8 ao8Var = ao8.d;
                return new v6a0(aVar.a(ci3Var, ao8Var), aVar.a(new pf(24), ao8Var), aVar.a(new nk(17), ao8Var), aVar.a(new rf(28), ao8Var), aVar.a(new gv3(15), ao8Var), aVar.a(new oa(19), ao8Var));
            case 4:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_msg_header_menu_return_to_chat);
            case 5:
                return ((x960) obj).a();
            case 6:
                return DraftsListState.a((DraftsListState) obj, null, DraftsListState.LoadingState.ERROR_INITIAL_LOAD, 0, false, false, 59);
            case 7:
                return io.reactivex.rxjava3.core.q.T(new CodeState.EmailWait(0L, 0L, 0, null, 15, null));
            case 8:
                EnhancedFeedLinkCard enhancedFeedLinkCard = new EnhancedFeedLinkCard((Context) obj, null, 6);
                enhancedFeedLinkCard.setContent(new FeedLinkCard.b.a("https://sun9-16.userapi.com/s/v1/ig2/C16DtmtNbwTY7LP95rHkQBWEQYvN352fIARx-LfyCzry79HMHg8zk-lcXIW6m-LdKWj32S9fn3-5ew1CxkvE645W.jpg?quality=95&as=32x18,48x27,72x40,108x61,160x90,240x135,360x202,480x270,540x304,640x360,720x405,1080x607,1280x720,1440x810,1920x1080&from=bu&cs=1920x0", null, false, "H,2:1"));
                enhancedFeedLinkCard.setFooter(new FeedLinkCard.c.a(oq.d(tlo0.Companion, "Название статьи"), new tlo0.h("Описание статьи с кратким содержанием")));
                return enhancedFeedLinkCard;
            case 9:
                return Boolean.valueOf(((BaseBoolIntDto) obj) == BaseBoolIntDto.YES);
            case 10:
                return String.valueOf(com.vk.im.engine.models.im_item.b.a(((v7w) obj).b));
            case 11:
                return s3q0.a;
            case 12:
                VideoOwner videoOwner = (VideoOwner) obj;
                if (!videoOwner.f.c0() && o25.a().b() && (list = videoOwner.k) != null) {
                    list.clear();
                }
                return videoOwner;
            case 13:
                return y410.c.a;
            case 14:
                y810 y810Var = (y810) obj;
                ArrayList arrayList = new ArrayList();
                q810 i = u810.i(y810Var);
                if (!y810Var.q.isEmpty() || !y810Var.g.isEmpty() || i != null) {
                    if (!y810Var.f.isEmpty()) {
                        arrayList.add(0);
                    }
                    arrayList.add(1);
                }
                return arrayList;
            case 15:
                Throwable th = (Throwable) obj;
                int i2 = MasksWrap.e0;
                L.i(th);
                j03.l(th);
                return s3q0.a;
            case 16:
                qgi0.r((tgi0) obj, "vk_top_bar_options_btn");
                return s3q0.a;
            case 17:
                return ((fm70.a) ((li2) obj).f()).a() ? xh2.c(anp.e(jq2.d(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4), 2).b(anp.g(jq2.d(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4))), anp.f(jq2.d(90, 0, null, 6), 2)) : new llj(qpp.a, d5q.a, 4);
            case 18:
                gn90.a aVar2 = (gn90.a) obj;
                ArrayList arrayList2 = new ArrayList();
                zm90 zm90Var = aVar2.b;
                a990<Integer> a990Var = aVar2.c;
                String str = "";
                int i3 = 0;
                for (Object obj2 : zm90Var.a) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        e43.t();
                        throw null;
                    }
                    ev3 ev3Var = (ev3) obj2;
                    String j = pvo0.j(ev3Var.d * 1000, false, false);
                    if (!epx.f(str, j)) {
                        if (i3 > 0) {
                            arrayList2.add(new ln90(cn70.b(8), 2));
                        }
                        arrayList2.add(new kn90(j));
                        str = j;
                    }
                    arrayList2.add(new jn90(ev3Var));
                    arrayList2.add(new mn90(cn70.b(6)));
                    i3 = i4;
                }
                a990.a aVar3 = a990Var.c;
                if (!(aVar3 instanceof a990.a.b)) {
                    if (aVar3 instanceof a990.a.c) {
                        arrayList2.add(on90.b);
                    } else {
                        if (!(aVar3 instanceof a990.a.C2530a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        arrayList2.add(new nn90(((a990.a.C2530a) aVar3).a));
                    }
                }
                return new qn90(arrayList2, a990Var.d instanceof a990.b.C2531b);
            case 19:
                return Boolean.valueOf(!((y8a0) obj).e.isEmpty());
            case 20:
                List list2 = (List) obj;
                ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(oc4.d((AudioAudioDto) it.next()));
                }
                return p4g.q(arrayList3);
            case 21:
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM polls");
                try {
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th2) {
                    V0.close();
                    throw th2;
                }
            case 22:
                usb0 usb0Var = (usb0) obj;
                if (!usb0Var.h && !usb0Var.i) {
                    r4 = false;
                }
                return Boolean.valueOf(r4);
            case 23:
                NewsEntry newsEntry = (NewsEntry) obj;
                qr.d(ce60.b, 105, newsEntry);
                iuc0 iuc0Var = iuc0.b;
                Post R = di60.R(newsEntry);
                boolean i0 = iuc0.i0(R != null ? R.m : null);
                Context context = e43.a;
                iuc0.j0(context != null ? context : null, i0);
                return s3q0.a;
            case 24:
                j03.l((Throwable) obj);
                return s3q0.a;
            case 25:
                qgi0.r((tgi0) obj, "product_preview_market_header_action_button");
                return s3q0.a;
            case 26:
                return ahn.C((io.reactivex.rxjava3.core.q) obj);
            case 27:
                i5f0 i5f0Var = (i5f0) obj;
                return new l4f0(new qr60.a.f(i5f0Var.a, i5f0Var.b, i5f0Var.d));
            case 28:
                return new ExecutorScheduler((Executor) obj);
            default:
                CommunityScheduledClipsBottomSheetSideEffectOptions communityScheduledClipsBottomSheetSideEffectOptions = CommunityScheduledClipsBottomSheetSideEffectOptions.REMOVE_FROM_OWNER;
                return s3q0.a;
        }
    }

    public /* synthetic */ d0k(dm50 dm50Var, int i) {
        this.b = i;
    }
}
