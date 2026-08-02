package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.a;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsAppEmbeddedUrlDto;
import com.vk.api.generated.utils.dto.UtilsDomainResolvedWithDataDto;
import com.vk.attachpicker.impl.gifts.ProfileGiftsFragment;
import com.vk.auth.validation.internal.PhoneValidationContract$ValidationDialogMetaInfo;
import com.vk.billing.StorePurchasesManager;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockArtistBio;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllHighlightVh;
import com.vk.catalog2.feature.music.configuration.MusicVerticalStackedListVh;
import com.vk.catalog2.feature.music.holders.artist.ArtistBiographyVh;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.util.DefaultHashMap;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.data.Subscription;
import com.vk.dto.common.id.UserId;
import com.vk.dto.gift.GiftItem;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.libvideo.adfree.impl.ui.VideoAdFreeSubscriptionFragment;
import com.vk.libvideo.bottomsheet.about.delegate.x;
import com.vk.libvideo.design.view.endview.VideoEndView;
import com.vk.music.playlist.display.presentation.MusicPlaylistPaginationState;
import com.vk.music.playlist.framework.presentation.PlaylistScreenContentType;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageButton;
import com.vk.pushes.receivers.c;
import com.vk.sharing.api.dto.Target;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioArtistClickItem;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeEndVideoClick;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import xsna.b4;
import xsna.cwb0;
import xsna.gm50;
import xsna.l110;
import xsna.lab0;
import xsna.nwb;
import xsna.oap;
import xsna.q630;
import xsna.uuf;
import xsna.v1j;
import xsna.we1;
import xsna.wzx;
import xsna.ys8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class n9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        Dialog dialog;
        String uri;
        int i = this.b;
        int i2 = 3;
        int i3 = 0;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                x.b bVar = (x.b) obj4;
                bVar.l.d(new b4.k((VideoFile) obj3, bVar.o));
                break;
            case 1:
                xe1 xe1Var = (xe1) obj4;
                final izs izsVar = (izs) obj3;
                nvy nvyVar = (nvy) obj;
                nvy.g(nvyVar, null, null, new jai(-890299869, new yzs() { // from class: xsna.re1
                    @Override // xsna.yzs
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj6;
                        int intValue = ((Integer) obj7).intValue();
                        if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-890299869, intValue, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.screen.ListStateView.<anonymous>.<anonymous>.<anonymous> (AlbumChooseViewRedesign.kt:128)");
                            }
                            q630 E = ahn.E(s200.E(txj0.f(q630.a.a, 1.0f), 16, 8), "AlbumChooseTags.ALBUMS_BUTTON_CREATE");
                            String N = d370.N(R.string.album_choose_create_album, 0, aVar);
                            ButtonSize buttonSize = ButtonSize.Medium;
                            ButtonStyle buttonStyle = ButtonStyle.Secondary;
                            ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
                            qzu0.a.getClass();
                            lg90 b = qzu0.b(aVar);
                            float f = 20;
                            izs izsVar2 = izs.this;
                            boolean J = aVar.J(izsVar2);
                            Object x = aVar.x();
                            if (J || x == a.C0011a.a) {
                                x = new se1(izsVar2, 0);
                                aVar.R(x);
                            }
                            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, b, null, new pco(f), N, null, null, null, null, false, null, null, null, aVar, 1073745328, 48, 0, 4187616);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar.h();
                        }
                        return s3q0.a;
                    }
                }, true), 3);
                List list = xe1Var.d;
                wow wowVar = new wow(list);
                nvyVar.e(list.size(), null, new we1.b(wowVar), new jai(802480018, new we1.c(wowVar, izsVar), true));
                if (xe1Var.c) {
                    nvy.g(nvyVar, null, null, qai.a, 3);
                }
                break;
            case 2:
                ArtistBiographyVh artistBiographyVh = (ArtistBiographyVh) obj4;
                UIBlockArtistBio uIBlockArtistBio = (UIBlockArtistBio) obj3;
                dw20 dw20Var = artistBiographyVh.p;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                artistBiographyVh.p = null;
                ArtistBiographyVh.a(CommonAudioStat$TypeAudioArtistClickItem.EventType.ITEM_UNFOLLOW_CLICK, artistBiographyVh.k);
                artistBiographyVh.e.a(new cfp0(uIBlockArtistBio, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Unsubscribe)));
                artistBiographyVh.n = artistBiographyVh.d.b(uIBlockArtistBio.y, uIBlockArtistBio.b).subscribe(new xz(new s53(r6, artistBiographyVh, uIBlockArtistBio), i2), kwg0.b());
                break;
            case 3:
                mih0 mih0Var = (mih0) obj3;
                yy5 yy5Var = ((BaseBadgeHolder) obj4).m;
                if (yy5Var != null) {
                    yy5Var.a(mih0Var);
                }
                break;
            case 4:
                lrf lrfVar = (lrf) obj3;
                npf x0 = ((uuf.i) obj4).x0();
                if (x0 != null) {
                    lrfVar.invoke(x0);
                }
                break;
            case 5:
                k2j k2jVar = (k2j) obj4;
                g2j g2jVar = (g2j) obj3;
                if (((View) obj).isEnabled()) {
                    k2jVar.l.invoke(new v1j.e(g2jVar.b.a.a));
                }
                break;
            case 6:
                com.vk.im.ui.components.contacts.a aVar = (com.vk.im.ui.components.contacts.a) obj4;
                wzs wzsVar = (wzs) obj3;
                pbm pbmVar = (pbm) obj;
                List<Peer> list2 = pbmVar.a;
                boolean z = pbmVar.b;
                List<Peer> list3 = list2;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((Peer) it.next()).b));
                }
                Set<Long> S0 = j5g.S0(arrayList);
                Set<Long> set = aVar.U;
                if (set != null) {
                    S0 = izi0.j(set, S0);
                }
                aVar.U = S0;
                if (S0 != null) {
                    com.vk.im.ui.components.contacts.b b1 = aVar.b1();
                    b1.getClass();
                    com.vk.im.ui.components.contacts.b.c(new km1(r2, S0, b1));
                }
                wzsVar.invoke(list2, Boolean.valueOf(z));
                break;
            case 7:
                ltl ltlVar = (ltl) obj4;
                ys8.b bVar2 = (ys8.b) obj3;
                StorePurchasesManager.BillingAvailabilityStatus billingAvailabilityStatus = (StorePurchasesManager.BillingAvailabilityStatus) obj;
                if (billingAvailabilityStatus == StorePurchasesManager.BillingAvailabilityStatus.READY) {
                    Subscription subscription = ltlVar.c;
                    if (subscription != null) {
                        bVar2.b(subscription);
                    } else {
                        bVar2.a();
                    }
                } else {
                    bVar2.onError(billingAvailabilityStatus == StorePurchasesManager.BillingAvailabilityStatus.NOT_AUTHORIZED ? 5 : 1);
                }
                break;
            case 8:
                ((asm) obj4).e().c(new cwb0.p(((DialogExt) obj3).getTitle()), new maj((io.reactivex.rxjava3.disposables.c) obj, 4));
                break;
            case 9:
                HeaderShowAllHighlightVh headerShowAllHighlightVh = (HeaderShowAllHighlightVh) obj4;
                io.reactivex.rxjava3.disposables.c c = eda.c(headerShowAllHighlightVh.u, (String) obj, new oap.a((Context) obj3), null, 12);
                View view = headerShowAllHighlightVh.f;
                hg1.b(view != null ? view : null, c);
                break;
            case 10:
                gzs gzsVar = (gzs) obj3;
                if (!((fdj0) obj4).c()) {
                    gzsVar.invoke();
                }
                break;
            case 11:
                wzx wzxVar = (wzx) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                wzxVar.b(0);
                ((Toolbar) obj3).setVisibility(8);
                wzx.a aVar2 = wzxVar.g;
                aVar2.g.setVisibility(booleanValue ? 0 : 8);
                sp.g(aVar2.h, 0);
                break;
            case 12:
                ((mdu) obj4).f(((Number) ((if2) obj).d()).floatValue());
                ((wsy) obj3).c.invoke();
                break;
            case 13:
                MarketItemCommentsFragment marketItemCommentsFragment = (MarketItemCommentsFragment) obj4;
                View view2 = (View) obj3;
                l110.a aVar3 = (l110.a) obj;
                int i4 = MarketItemCommentsFragment.j0;
                mzp0 mzp0Var = marketItemCommentsFragment.J;
                if (mzp0Var != null) {
                    mzp0Var.d(view2);
                }
                marketItemCommentsFragment.On().a();
                SwipeRefreshLayout swipeRefreshLayout = marketItemCommentsFragment.Q;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(false);
                }
                SwipeRefreshLayout swipeRefreshLayout2 = marketItemCommentsFragment.Q;
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setEnabled(true);
                }
                NestedScrollView nestedScrollView = marketItemCommentsFragment.Y;
                if (nestedScrollView != null) {
                    bwt0.p0(nestedScrollView, false);
                }
                RecyclerView recyclerView = marketItemCommentsFragment.R;
                if (recyclerView != null) {
                    bwt0.p0(recyclerView, true);
                }
                gm50.a.a(marketItemCommentsFragment, aVar3.b, new frg(marketItemCommentsFragment, 28));
                gm50.a.a(marketItemCommentsFragment, aVar3.a, new bgy(marketItemCommentsFragment, 2));
                break;
            case 14:
                ud20 ud20Var = (ud20) obj3;
                ikv0 ikv0Var = (ikv0) obj;
                PostingAction postingAction = ((PostingUserMessageButton) obj4).c;
                if (postingAction != null) {
                    ud20Var.a.invoke(postingAction);
                }
                ikv0Var.a();
                break;
            case 15:
                ojt ojtVar = (ojt) obj;
                ojtVar.d = (Drawable) obj4;
                ojtVar.h = (Drawable) obj3;
                ojtVar.b = 0;
                break;
            case 16:
                d040 d040Var = (d040) obj3;
                Iterator it2 = ((DefaultHashMap) obj4).entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    MsgFromUser msgFromUser = (MsgFromUser) entry.getKey();
                    if (!((List) entry.getValue()).isEmpty()) {
                        d040Var.o(msgFromUser);
                    }
                }
                break;
            case 17:
                final k150 k150Var = (k150) obj4;
                us2 us2Var = (us2) obj3;
                nvy nvyVar2 = (nvy) obj;
                if (us2Var.c.length() > 0) {
                    nvy.g(nvyVar2, null, PlaylistScreenContentType.SPACER, lji.a, 1);
                    nvy.g(nvyVar2, null, PlaylistScreenContentType.SUMMARY, new jai(1053251321, new sab0(i3, us2Var, k150Var), true), 1);
                }
                List<UIBlockPlaceholder> value = k150Var.g.getValue();
                if (!value.isEmpty()) {
                    nvyVar2.e(value.size(), new f150(value, 0), new ept(13), new jai(496860682, new g150(value, i3), true));
                }
                PlaylistScreenContentType playlistScreenContentType = PlaylistScreenContentType.SPACER;
                nvy.g(nvyVar2, null, playlistScreenContentType, hii.a, 1);
                if (k150Var.b.getValue().intValue() > 0) {
                    final mab0<lab0> value2 = k150Var.e.getValue();
                    mtk0<UIBlockList> mtk0Var = k150Var.f;
                    MusicPlaylistPaginationState value3 = k150Var.h.getValue();
                    boolean booleanValue2 = k150Var.i.getValue().booleanValue();
                    nvy.g(nvyVar2, null, PlaylistScreenContentType.LIST_HEADER, new jai(1484906227, new h150(k150Var, k150Var.l.getValue().booleanValue()), true), 1);
                    final f1m b = bbk0.b(new cfl(k150Var, 27));
                    int i5 = 0;
                    nvyVar2.e(value2.a.size(), new com.vk.channels.impl.channel_screen.send_msg.e(1, value2, mab0.class, "itemKey", "itemKey(I)Ljava/lang/Object;", i5, 10), new pba(1, value2, mab0.class, "contentType", "contentType(I)Lcom/vk/music/playlist/framework/presentation/PlaylistScreenContentType;", i5, 7), new jai(1274817098, new zzs() { // from class: xsna.i150
                        @Override // xsna.zzs
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int intValue = ((Integer) obj6).intValue();
                            androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj7;
                            int intValue2 = ((Integer) obj8).intValue();
                            if ((intValue2 & 48) == 0) {
                                intValue2 |= aVar4.o(intValue) ? 32 : 16;
                            }
                            if (aVar4.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1274817098, intValue2, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistListContent.playlistItems.<anonymous> (MusicPlaylistListContent.kt:162)");
                                }
                                lab0 lab0Var = (lab0) mab0.this.a.get(intValue);
                                boolean z2 = lab0Var instanceof lab0.a;
                                k150 k150Var2 = k150Var;
                                if (z2) {
                                    aVar4.K(1033555722);
                                    k150Var2.e((lab0.a) lab0Var, ((Boolean) b.getValue()).booleanValue(), aVar4, 0);
                                    aVar4.j();
                                } else {
                                    if (!(lab0Var instanceof lab0.b)) {
                                        throw alb0.c(1033553009, aVar4);
                                    }
                                    aVar4.K(1033558416);
                                    k150Var2.g(d370.O(R.string.album_playlist_part, new Object[]{((lab0.b) lab0Var).a}, aVar4), null, aVar4, 0);
                                    aVar4.j();
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar4.h();
                            }
                            return s3q0.a;
                        }
                    }, true));
                    if (value3 == MusicPlaylistPaginationState.LOADING) {
                        nvy.g(nvyVar2, null, PlaylistScreenContentType.PROGRESS, new jai(-43619845, new j150(0, k150Var, b), true), 1);
                    } else if (value3 == MusicPlaylistPaginationState.ERROR) {
                        nvy.g(nvyVar2, null, PlaylistScreenContentType.ERROR, new jai(-1285751246, new nrv(k150Var, r6), true), 1);
                    } else if (booleanValue2) {
                        nvy.g(nvyVar2, null, PlaylistScreenContentType.LIST_FOOTER, new jai(-67471629, new mj6(k150Var, r6), true), 1);
                        nvy.g(nvyVar2, null, playlistScreenContentType, hii.c, 1);
                        UIBlockList value4 = mtk0Var.getValue();
                        if (value4 != null) {
                            nvyVar2.h(value4.b, PlaylistScreenContentType.HORIZONTAL_LIST, new jai(968991672, new z1x(value4, r6), true));
                        }
                    }
                } else {
                    nvy.g(nvyVar2, null, PlaylistScreenContentType.PLACEHOLDER, hii.b, 1);
                }
                break;
            case 18:
                MusicVerticalStackedListVh musicVerticalStackedListVh = (MusicVerticalStackedListVh) obj4;
                ViewGroup viewGroup = (ViewGroup) obj3;
                UIBlockActionOpenUrl uIBlockActionOpenUrl = (UIBlockActionOpenUrl) obj;
                UIBlock uIBlock = musicVerticalStackedListVh.L;
                if (uIBlock != null) {
                    musicVerticalStackedListVh.e.b.f.a(new cfp0(uIBlock, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Broadcast)));
                    com.vk.catalog2.common.ui.mvp.util.a.e(musicVerticalStackedListVh.G, viewGroup.getContext(), uIBlock, uIBlockActionOpenUrl, null, 56);
                }
                break;
            case 19:
                ((hs50) obj4).d7((View) obj, (cjx) obj3, "DEFAULT", 3);
                break;
            case 20:
                c.a aVar4 = com.vk.pushes.receivers.c.b;
                c.a.e((Context) obj4, (Intent) obj3, (Throwable) obj);
                break;
            case 21:
                ((tgp0) obj).l((bgk0) obj4, (ur4) obj3);
                break;
            case 22:
                ((k4a0) obj4).b((PhoneValidationContract$ValidationDialogMetaInfo) obj3);
                break;
            case 23:
                UserId userId = (UserId) obj4;
                b25 b25Var = (b25) obj3;
                if (userId == null) {
                    userId = UserId.d;
                }
                break;
            case 24:
                ((ProfileGiftsFragment) obj4).Mo(((GiftItem) ((ProfileGiftsFragment.b) obj3).m).d);
                break;
            case 25:
                AtomicReference atomicReference = (AtomicReference) obj4;
                vbj0 vbj0Var = (vbj0) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                if (atomicReference.get() == null) {
                    atomicReference.set(arrayList2);
                    break;
                } else {
                    ArrayList arrayList3 = (ArrayList) atomicReference.get();
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj5 : arrayList2) {
                        Target target = (Target) obj5;
                        if (!arrayList3.contains(target)) {
                            Dialog dialog2 = target.i;
                            ProfilesSimpleInfo profilesSimpleInfo = target.j;
                            if (dialog2 != null && dialog2.bc() == Peer.Type.CONTACT && !profilesSimpleInfo.b.isEmpty()) {
                                Iterator it3 = profilesSimpleInfo.b.entrySet().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        Map.Entry entry2 = (Map.Entry) it3.next();
                                        if (((Number) entry2.getKey()).longValue() != vbj0Var.a.a().b) {
                                            Iterator it4 = arrayList3.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    obj2 = it4.next();
                                                    Target target2 = (Target) obj2;
                                                    Dialog dialog3 = target2.i;
                                                    if (dialog3 == null || dialog3.bc() != Peer.Type.USER || (dialog = target2.i) == null || dialog.ac() != ((Number) entry2.getKey()).longValue()) {
                                                    }
                                                } else {
                                                    obj2 = null;
                                                }
                                            }
                                            if (((Target) obj2) != null) {
                                            }
                                        }
                                    }
                                }
                            }
                            arrayList4.add(obj5);
                        }
                    }
                    arrayList3.addAll(arrayList4);
                    break;
                }
                break;
            case 26:
                ((crj0) obj4).m.f(((nwb.k) obj3).b);
                break;
            case 27:
                pk30 pk30Var = (pk30) obj4;
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.h hVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.h) obj3;
                if (pk30Var != null) {
                    pk30Var.P(hVar.c);
                }
                break;
            case 28:
                Uri uri2 = (Uri) obj4;
                Context context = (Context) obj3;
                UtilsDomainResolvedWithDataDto utilsDomainResolvedWithDataDto = (UtilsDomainResolvedWithDataDto) obj;
                AppsAppDto d = utilsDomainResolvedWithDataDto.d();
                if (d == null) {
                    break;
                } else {
                    new re3();
                    ApiApplication b2 = re3.b(d);
                    AppsAppEmbeddedUrlDto e = utilsDomainResolvedWithDataDto.e();
                    if (e == null || (uri = e.f()) == null) {
                        uri = uri2.toString();
                    }
                    String str = uri;
                    AppsAppEmbeddedUrlDto e2 = utilsDomainResolvedWithDataDto.e();
                    new VideoAdFreeSubscriptionFragment.a(b2, str, null, e2 != null ? e2.d() : null, 0L, false, null, 0L, null, null, null, VideoAdFreeSubscriptionFragment.class, null, false).k(context);
                    break;
                }
            default:
                int i6 = VideoEndView.z;
                ((VideoEndView) obj4).b(MobileOfficialAppsVideoStat$TypeEndVideoClick.EventType.REPLAY);
                ((View.OnClickListener) obj3).onClick((View) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ n9(kw70 kw70Var, bgk0 bgk0Var, ur4 ur4Var) {
        this.b = 21;
        this.c = bgk0Var;
        this.d = ur4Var;
    }
}
