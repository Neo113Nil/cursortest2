package xsna;

import android.content.Context;
import com.vk.api.generated.orders.dto.OrdersSubscriptionDto;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.core.analytics.tracking.VideoAnalyticsInfo;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh;
import com.vk.dto.music.MusicTrack;
import com.vk.im.engine.internal.merge.channels.ChannelsInfoMergeTask;
import com.vk.im.engine.internal.merge.messages.ChannelMsgHistoryFromServerMergeTask;
import com.vk.log.L;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.player.error.VkPlayerException;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import xsna.c5b;
import xsna.fmc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class sc5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sc5(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        byte b = 0;
        int i2 = 1;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                List list = (List) obj4;
                nvy nvyVar = (nvy) obj;
                nvy.g(nvyVar, null, null, qbi.a, 3);
                nvyVar.e(list.size(), new vc5(new ug4(b, i2), list), new wc5(list), new jai(2039820996, new xc5(list, (PostingAuthorUiModel) obj3, (izs) obj2), true));
                break;
            case 1:
                io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) obj4;
                StartPlayVkMixSource startPlayVkMixSource = (StartPlayVkMixSource) obj3;
                MusicPlaybackLaunchContext musicPlaybackLaunchContext = (MusicPlaybackLaunchContext) obj2;
                List list2 = (List) obj;
                if (list2.isEmpty()) {
                    yVar.onError(new VkPlayerException.NoVkMixException(0));
                } else {
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((xd50) it.next()).a);
                    }
                    yVar.onSuccess(new lqk0(startPlayVkMixSource, (MusicTrack) null, arrayList, musicPlaybackLaunchContext, 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 882));
                }
                break;
            case 2:
                lkb lkbVar = (lkb) obj3;
                izs izsVar = (izs) obj2;
                xgl0 xgl0Var = (xgl0) obj;
                LinkedHashMap linkedHashMap = ((c400) obj4).i;
                long j = lkbVar.e;
                eeb eebVar = (eeb) linkedHashMap.get(Long.valueOf(j));
                if (eebVar != null) {
                    w2w w2wVar = lkbVar.a;
                    boolean z = eebVar.b == null;
                    new zd20(new c5b.a(lkbVar.b, !z), new h2b(w2wVar.I0(), w2wVar.getExperiments()), true, false).a(w2wVar);
                    s3q0 s3q0Var = s3q0.a;
                    if (!((Collection) new ChannelsInfoMergeTask(Collections.singletonList(eebVar), null, lkbVar.c, Boolean.valueOf(lkbVar.d), ChannelsInfoMergeTask.InfoSource.WEBSOCKET, 2).o(w2wVar)).isEmpty()) {
                        new ChannelMsgHistoryFromServerMergeTask(lkbVar.b, eebVar.b, ChannelMsgHistoryFromServerMergeTask.HistorySource.WEBSOCKET, z, true).o(w2wVar);
                    }
                    izsVar.invoke(xgl0Var);
                    break;
                } else {
                    L.l("ChannelsSubscribeLpTaskInteractor", qlb0.a(j, "onSyncStorageChannel: failed, no channel ", " in lpInfo"));
                    break;
                }
            case 3:
                break;
            case 4:
                ((rbe0) obj4).d.V((Context) obj2, ((fmc0.m.a) obj3).b, NewsfeedRouter.OpenFromRef.REF_POSTING);
                break;
            case 5:
                ArrayList arrayList2 = (ArrayList) obj4;
                ((nvy) obj).e(arrayList2.size(), new pze0(new adf(b, 4), arrayList2), new qze0(arrayList2, 0), new jai(2039820996, new rze0(arrayList2, (mze0) obj3, (izs) obj2), true));
                break;
            case 6:
                UIBlockVideo uIBlockVideo = (UIBlockVideo) obj3;
                b5a b5aVar = (b5a) obj2;
                osp ospVar = (osp) obj;
                ((VideoItemVh) obj4).getClass();
                if (uIBlockVideo != null) {
                    b5aVar.a(new cfp0(uIBlockVideo, new VideoAnalyticsInfo(VideoAnalyticsInfo.ClickTarget.OpenEpisodes)));
                }
                ospVar.b(false);
                break;
            case 7:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj4;
                n0 n0Var = (n0) obj2;
                int i3 = ref$IntRef.element + 1;
                ref$IntRef.element = i3;
                if (i3 == ((ArrayList) obj3).size()) {
                    n0Var.invoke();
                }
                break;
            default:
                mov0 mov0Var = (mov0) obj3;
                mfu0 mfu0Var = mov0Var.c;
                JsApiMethodType jsApiMethodType = (JsApiMethodType) obj2;
                bzm0 bzm0Var = (bzm0) obj;
                bqu0 bqu0Var = (bqu0) ((Ref$ObjectRef) obj4).element;
                if (bqu0Var != null) {
                    bqu0Var.dismiss();
                }
                boolean z2 = bzm0Var.c;
                OrdersSubscriptionDto ordersSubscriptionDto = bzm0Var.a;
                if (z2 || ordersSubscriptionDto.f() == null) {
                    int id = ordersSubscriptionDto.getId();
                    com.vk.superapp.browser.internal.ui.shortcats.a aVar = ((ggu0) mov0Var.e.c).x;
                    if (aVar != null) {
                        aVar.e();
                    }
                    mfu0Var.n(jsApiMethodType, new JSONObject().put("success", true).put("subscriptionId", id));
                } else {
                    mfu0Var.m(jsApiMethodType, VkAppsErrors.Client.UNKNOWN_ERROR, null, null);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ sc5(yvj yvjVar, izs izsVar, wh50 wh50Var) {
        this.b = 3;
        this.c = yvjVar;
        this.e = izsVar;
        this.d = wh50Var;
    }
}
