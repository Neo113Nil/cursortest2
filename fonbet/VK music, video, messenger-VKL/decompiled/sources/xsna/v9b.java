package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.material.chip.Chip;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketGroupInfoItem;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchEntityAnswerAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.friend.FriendsRequestsIncomingVh;
import com.vk.catalog2.common.ui.holders.search.SearchEntityVideoPlaylistAnswerVh;
import com.vk.catalog2.common.ui.holders.video.VideoOnboardingVh;
import com.vk.catalog2.common.ui.mvp.holder.market.MarketGroupItemSmallVh;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchEntityVideoPlaylist;
import com.vk.core.tips.Tooltip;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.ecomm.reviews.impl.allreviews.presentation.MarketAllReviewsTabTypes;
import com.vk.im.ui.components.chat_profile.ProfileLinkActionChooser;
import com.vk.im.ui.fragments.ImSelectContactsFragment;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragment;
import com.vk.voip.ui.assessment.VoipAssessmentActivity;
import java.util.ArrayList;
import java.util.Iterator;
import one.video.ad.ux.motion.view.OneVideoMotionHeaderView;
import xsna.cs00;
import xsna.ye0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class v9b implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v9b(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        sws0 a;
        VideoAlbum videoAlbum;
        VkButton vkButton;
        int i = this.b;
        int i2 = 17;
        int i3 = 6;
        int i4 = 1;
        int i5 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                w9b w9bVar = (w9b) obj;
                ((bzb0) w9bVar.F.getValue()).b(new ProfileLinkActionChooser(), new com.vk.voip.ui.menu.feature.a(w9bVar, i2), null);
                break;
            case 1:
                ((h6h) obj).j.invoke();
                break;
            case 2:
                w2j w2jVar = (w2j) obj;
                dw20 dw20Var = w2jVar.c;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                w2jVar.b.onDismiss();
                break;
            case 3:
                zls a2 = ams.a();
                VkCell vkCell = ((FriendsRequestsIncomingVh) obj).b;
                a2.m((vkCell != null ? vkCell : null).getContext());
                break;
            case 4:
                int i6 = ImSelectContactsFragment.v0;
                ((ImSelectContactsFragment) obj).Mf(0, null);
                break;
            case 5:
                int i7 = LocalMediaPickerFragment.d0;
                efc0 go = ((LocalMediaPickerFragment) obj).go();
                if (go != null) {
                    go.C(PostingAction.MediaPicker.OpenCamera.b);
                    break;
                }
                break;
            case 6:
                ((it00) obj).l.a(new cs00.o(MarketAllReviewsTabTypes.COMMUNITY));
                break;
            case 7:
                MarketGroupItemSmallVh marketGroupItemSmallVh = (MarketGroupItemSmallVh) obj;
                m3a m3aVar = marketGroupItemSmallVh.b.b.d;
                UIBlockMarketGroupInfoItem uIBlockMarketGroupInfoItem = marketGroupItemSmallVh.d;
                m3aVar.j(new ru00(uIBlockMarketGroupInfoItem != null ? uIBlockMarketGroupInfoItem : null));
                break;
            case 8:
                xws0 xws0Var = ((OneVideoMotionHeaderView) obj).z;
                if (xws0Var != null && (a = xws0Var.a()) != null) {
                    ye0 ye0Var = ye0.this;
                    ye0.a aVar = ye0Var.z;
                    ye0Var.A.getClass();
                    aVar.c(false);
                    break;
                }
                break;
            case 9:
                SearchEntityVideoPlaylistAnswerVh searchEntityVideoPlaylistAnswerVh = (SearchEntityVideoPlaylistAnswerVh) obj;
                b5a b5aVar = searchEntityVideoPlaylistAnswerVh.b;
                UIBlockSearchEntityVideoPlaylist uIBlockSearchEntityVideoPlaylist = searchEntityVideoPlaylistAnswerVh.n;
                if (uIBlockSearchEntityVideoPlaylist != null && (videoAlbum = uIBlockSearchEntityVideoPlaylist.B) != null) {
                    io.reactivex.rxjava3.disposables.c cVar = searchEntityVideoPlaylistAnswerVh.o;
                    if ((cVar == null || cVar.h()) && (vkButton = searchEntityVideoPlaylistAnswerVh.l) != null) {
                        Context h = e3m.h(vkButton.getContext());
                        if (h == null) {
                            h = vkButton.getContext();
                        }
                        if (!videoAlbum.l) {
                            SearchEntityAnswerAnalyticsInfo.ClickTarget clickTarget = SearchEntityAnswerAnalyticsInfo.ClickTarget.Follow;
                            UIBlockSearchEntityVideoPlaylist uIBlockSearchEntityVideoPlaylist2 = searchEntityVideoPlaylistAnswerVh.n;
                            if (uIBlockSearchEntityVideoPlaylist2 != null) {
                                b5aVar.a(new cfp0(uIBlockSearchEntityVideoPlaylist2, new SearchEntityAnswerAnalyticsInfo(clickTarget)));
                            }
                            UserId userId = videoAlbum.c;
                            int i8 = videoAlbum.b;
                            UiTracker uiTracker = UiTracker.a;
                            int i9 = 4;
                            io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.l0(rsg0.y0(new a0u(userId, i8, UiTracker.d(), null, true, 40), null, null, 3), new e05(new he3(i9, h, videoAlbum), 7)).subscribe(new tra(new af0(i3), i5), new da(new g74(new ece0(i9, searchEntityVideoPlaylistAnswerVh, videoAlbum), i4), i3));
                            searchEntityVideoPlaylistAnswerVh.e.a(subscribe);
                            searchEntityVideoPlaylistAnswerVh.o = subscribe;
                            break;
                        } else {
                            SearchEntityAnswerAnalyticsInfo.ClickTarget clickTarget2 = SearchEntityAnswerAnalyticsInfo.ClickTarget.Unfollow;
                            UIBlockSearchEntityVideoPlaylist uIBlockSearchEntityVideoPlaylist3 = searchEntityVideoPlaylistAnswerVh.n;
                            if (uIBlockSearchEntityVideoPlaylist3 != null) {
                                b5aVar.a(new cfp0(uIBlockSearchEntityVideoPlaylist3, new SearchEntityAnswerAnalyticsInfo(clickTarget2)));
                            }
                            UiTracker uiTracker2 = UiTracker.a;
                            vra.a(h, videoAlbum, UiTracker.d(), new u110(searchEntityVideoPlaylistAnswerVh, videoAlbum));
                            break;
                        }
                    }
                }
                break;
            case 10:
                b5p0 b5p0Var = (b5p0) obj;
                b5p0Var.h6();
                Rect rect = new Rect();
                b5p0Var.m.getGlobalVisibleRect(rect);
                b5p0Var.l = new Tooltip(b5p0Var.itemView.getContext(), "Предпросмотре стикеров", "Удерживайте стикер, чтобы его\nполноэкранно посмотреть", null, new rg0(b5p0Var, 13), null, null, 0, 0, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, false, null, 0, false, null, null, null, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, null, null, null, null, -24, 15).j(b5p0Var.itemView.getContext(), new RectF(rect));
                break;
            case 11:
                ((gzs) obj).invoke();
                break;
            case 12:
                bsr0 bsr0Var = (bsr0) obj;
                xi10 xi10Var = bsr0Var.o;
                if (xi10Var != null) {
                    bsr0Var.l.a(xi10Var);
                    break;
                }
                break;
            case 13:
                VideoOnboardingVh videoOnboardingVh = (VideoOnboardingVh) obj;
                io.reactivex.rxjava3.disposables.c cVar2 = videoOnboardingVh.q;
                if (cVar2 == null || cVar2.h()) {
                    ProgressBar progressBar = videoOnboardingVh.l;
                    if (progressBar == null) {
                        progressBar = null;
                    }
                    bwt0.p0(progressBar, true);
                    ArrayList a3 = videoOnboardingVh.a();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = a3.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (((Chip) next).isChecked()) {
                            arrayList.add(next);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(String.valueOf(((Chip) it2.next()).getId()));
                    }
                    String str = videoOnboardingVh.d;
                    if (str == null) {
                        str = "";
                    }
                    int i10 = 5;
                    tfx tfxVar = new tfx("catalog.saveSelection", new ct(i10), new dt(i3));
                    tfxVar.i("selection_ids", arrayList2);
                    tfx.o(tfxVar, "block_id", str, 0, 0, 12);
                    videoOnboardingVh.q = new io.reactivex.rxjava3.internal.operators.observable.a0(rsg0.y0(yfb.x(tfxVar), null, null, 3), new lcb(videoOnboardingVh, i10)).subscribe(new j720(new n7b0(videoOnboardingVh, 25), i2), new zyu(new ud8(j03.a, 11), 29));
                    break;
                }
                break;
            case 14:
                int i11 = VoipAssessmentActivity.m;
                ((VoipAssessmentActivity) obj).finish();
                break;
            default:
                ydz0 ydz0Var = (ydz0) obj;
                ydz0Var.c.a(view, new viy0(8192, ydz0Var.x));
                break;
        }
    }
}
