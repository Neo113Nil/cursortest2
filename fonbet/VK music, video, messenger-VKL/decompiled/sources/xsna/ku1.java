package xsna;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.market.dto.MarketSearchResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockFriendsLiked;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionMarketOptions;
import com.vk.catalog2.feature.music.dto.ui.UIBlockPodcastSliderItem;
import com.vk.channels.api.Channel;
import com.vk.clips.clipsaudio.views.ClipsAudioFragment;
import com.vk.clips.design.view.timeline.MultiVideoTimelineView;
import com.vk.core.view.VKTabLayout;
import com.vk.core.view.components.subnavigation.SubnavigationBarAppearance;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.podcast.FriendsLikedEpisode;
import com.vk.dto.podcast.PodcastSliderItem;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.stickers.StickerPackPreviewModel;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stories.model.HighlightStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.ecomm.catalog.impl.catalog.simple.a;
import com.vk.ecomm.catalog.impl.catalog.simple.b;
import com.vk.ecomm.market.api.search.filters.dto.MarketCatalogFilterVM;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.feed.core.models.feedback.FeedbackPoll;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.channelcreation.impl.j;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vk.music.snippet.ui.presentation.base.view.SnippetTrackItemView$Companion$ButtonAddAction;
import com.vk.mvi.binder.BinderLifecycleMode;
import com.vk.newsfeed.impl.fragments.NewsfeedFeedbackPollFragment;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stories.design.view.viewer.StoryViewHeader;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.ClipState;
import com.vk.voip.ui.broadcast.list.ui.PastBroadcastsFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.opengl.CallOpenGLContext;
import ru.ok.android.webrtc.opengl.CallOpenGLDrawer;
import ru.ok.android.webrtc.opengl.CallOpenGLRenderer;
import xsna.adk0;
import xsna.c2r0;
import xsna.d5v;
import xsna.g650;
import xsna.h2g0;
import xsna.nue;
import xsna.p810;
import xsna.sum0;
import xsna.ty4;
import xsna.u39;
import xsna.wk50;
import xsna.y2r;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ku1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ku1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        Long l;
        VideoFile videoFile;
        Object obj3;
        MultipickerProduct.Owner owner;
        boolean z;
        String string;
        int i = this.b;
        int i2 = 21;
        int i3 = 20;
        int i4 = 10;
        int i5 = 1;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                lu1 lu1Var = (lu1) obj5;
                VKList vKList = (VKList) obj;
                lu1Var.k = new ArrayList(vKList);
                lu1Var.g.a().a(new Pair<>(lu1Var.d, new d5v.d(vKList)));
                ((com.vk.lists.c) obj4).s(vKList.j());
                if (!lu1Var.m) {
                    lu1Var.c.ko(lu1Var.k);
                }
                return s3q0.a;
            case 1:
                ipe ipeVar = (ipe) obj5;
                h54 h54Var = (h54) obj4;
                AttachedClipsState attachedClipsState = (AttachedClipsState) obj;
                ArrayList<ClipVideoFile> arrayList = ipeVar.a;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                for (ClipVideoFile clipVideoFile : arrayList) {
                    String str = (String) h54Var.c.g.getValue();
                    Iterator<T> it = attachedClipsState.j().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (epx.f(((VideoFile) obj2).a1(), clipVideoFile.a1())) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    arrayList2.add(new ClipState(str, clipVideoFile, obj2 != null));
                }
                List<VideoFile> list = attachedClipsState.e;
                ArrayList j = list != null ? tci.j(ipeVar.a, list) : null;
                Collection collection = attachedClipsState.c;
                if (collection == null) {
                    collection = EmptyList.b;
                }
                return AttachedClipsState.a(attachedClipsState, null, j5g.u0(arrayList2, collection), ipeVar.b, j, null, false, false, false, false, null, 1009);
            case 2:
                ((ty4) obj5).b.invoke(new ty4.b.a((Throwable) obj, (ClipGridParams.Data.Music) obj4));
                return s3q0.a;
            case 3:
                return new io.reactivex.rxjava3.internal.operators.single.v(new h55((c2r0) obj5, (Context) obj4, (c2r0.b) obj, 0)).q(io.reactivex.rxjava3.schedulers.a.b());
            case 4:
                izs izsVar = (izs) obj5;
                Object obj6 = ((u39.a) obj4).l;
                izsVar.invoke(obj6 != null ? obj6 : null);
                return s3q0.a;
            case 5:
                return CallOpenGLRenderer.b((CallOpenGLDrawer) obj5, (CallOpenGLRenderer) obj4, (CallOpenGLContext) obj);
            case 6:
                izs izsVar2 = (izs) obj4;
                b.d dVar = (b.d) obj;
                Integer num = ((am9) obj5).b;
                if (num != null) {
                    nf9 nf9Var = nf9.b;
                    nf9.n(dVar, num);
                }
                if (izsVar2 != null) {
                    izsVar2.invoke(dVar);
                }
                return s3q0.a;
            case 7:
                UIBlockList uIBlockList = (UIBlockList) obj;
                return Boolean.valueOf(k5a.b(uIBlockList, new tb((LinkedHashSet) obj5, i2)) && !k5a.b(uIBlockList, new u8((UIBlock) obj4, 14)));
            case 8:
                Channel channel = (Channel) obj5;
                String str2 = (String) obj4;
                com.vk.im.channelcreation.impl.j jVar = (com.vk.im.channelcreation.impl.j) obj;
                String str3 = channel.d;
                Boolean bool = channel.H;
                j.a aVar = new j.a(str2, str2, str3, bool != null ? bool.booleanValue() : false);
                return com.vk.im.channelcreation.impl.j.a(jVar, aVar, aVar, 1);
            case 9:
                float floatValue = ((Float) obj).floatValue();
                int i6 = ClipsAudioFragment.Y;
                ((ClipsAudioFragment.b) obj4).c.setText(((ClipsAudioFragment) obj5).go().getString(R.string.clips_audio_dialog_track_duration_label, Integer.valueOf((int) floatValue)));
                return s3q0.a;
            case 10:
                nue.g gVar = (nue.g) obj4;
                ((uue) obj5).C(new nue.b((ShortVideoGetPlaylistsResponseDto) obj, gVar.c, gVar.b));
                return s3q0.a;
            case 11:
                jwh jwhVar = (jwh) obj5;
                jwhVar.Z(false, (vwh) obj4);
                jwhVar.k.b(new h2g0.f(zwp.a((Throwable) obj)));
                return s3q0.a;
            case 12:
                y2r.t tVar = (y2r.t) obj5;
                wk50.a aVar2 = (wk50.a) obj4;
                qih0 qih0Var = (qih0) obj;
                gbq gbqVar = tVar.c;
                tVar.f(aVar2, qih0Var, gbqVar != null ? new b3r(2, gbqVar, gbq.class, "extendFeedItemsWithBlocks", "extendFeedItemsWithBlocks(Lcom/vk/clips/sdk/shared/api/feed/data/SdkClipListResponse;Ljava/util/List;)Ljava/util/List;", 0) : null);
                return s3q0.a;
            case 13:
                a3s a3sVar = (a3s) obj5;
                StoryOwner storyOwner = (StoryOwner) obj4;
                Integer num2 = (Integer) obj;
                a3sVar.c.c();
                a3sVar.c();
                if ((storyOwner instanceof StoryOwner.User) && !((StoryOwner.User) storyOwner).g && num2.intValue() == 1) {
                    ams.a().b(a3sVar.a.i0.getContext(), a3sVar.a.i0.getWindow(), false);
                } else {
                    cmf0.a.c(a3sVar.a.i0.getContext(), a3sVar.a.i0.getWindow(), R.string.story_follow_success);
                }
                return null;
            case 14:
                ((qmu) obj5).s6((Group) obj4, (AdminLeaveAction) obj);
                return s3q0.a;
            case 15:
                NewsEntry newsEntry = (NewsEntry) obj4;
                p2r p2rVar = (p2r) ((utx) obj5).b.getValue();
                if (newsEntry instanceof Post) {
                    l = Long.valueOf(((Post) newsEntry).n);
                } else if (newsEntry instanceof PromoPost) {
                    l = Long.valueOf(((PromoPost) newsEntry).n.n);
                } else if (newsEntry instanceof Photos) {
                    l = Long.valueOf(((Photos) newsEntry).m);
                } else if (newsEntry instanceof Videos) {
                    VideoAttachment Nb = ((Videos) newsEntry).Nb();
                    l = Long.valueOf((Nb == null || (videoFile = Nb.k) == null) ? 0L : videoFile.o0());
                } else {
                    l = null;
                }
                Long valueOf = Long.valueOf(k9q0.o(newsEntry).b);
                String str4 = newsEntry.Cb().b;
                String str5 = str4 != null ? str4 : "";
                MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint entryPoint = MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint.HEADER_FOLLOW_ALERT;
                p2rVar.getClass();
                p2r.g(l, valueOf, str5, entryPoint, null);
                return s3q0.a;
            case 16:
                jjx jjxVar = (jjx) obj4;
                MarketCatalogFilterVM marketCatalogFilterVM = (MarketCatalogFilterVM) obj;
                if (!((MarketCatalogFilterVM) obj5).equals(marketCatalogFilterVM)) {
                    jjxVar.invoke(marketCatalogFilterVM);
                }
                return s3q0.a;
            case 17:
                MarketItemReviewRepliesFragment marketItemReviewRepliesFragment = (MarketItemReviewRepliesFragment) obj5;
                wsg0 wsg0Var = (wsg0) obj;
                qcy<Object>[] qcyVarArr = MarketItemReviewRepliesFragment.b0;
                nzw nzwVar = marketItemReviewRepliesFragment.P;
                qcy<Object>[] qcyVarArr2 = MarketItemReviewRepliesFragment.b0;
                qcy<Object> qcyVar = qcyVarArr2[0];
                d310 d310Var = (d310) nzwVar.getValue();
                io.reactivex.rxjava3.subjects.f fVar = new io.reactivex.rxjava3.subjects.f();
                int i7 = 5;
                io.reactivex.rxjava3.internal.operators.observable.b0 C = fVar.C(new h53(d310Var.R(new whe(1, fVar, io.reactivex.rxjava3.subjects.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 12)), i7));
                io.reactivex.rxjava3.core.w b = io.reactivex.rxjava3.android.schedulers.a.b();
                s210 s210Var = new s210(marketItemReviewRepliesFragment);
                BinderLifecycleMode binderLifecycleMode = wsg0Var.b;
                com.vk.movika.sdk.base.observable.u uVar = new com.vk.movika.sdk.base.observable.u(i7);
                io.reactivex.rxjava3.core.w wVar = wsg0Var.a;
                io.reactivex.rxjava3.disposables.c subscribe = C.a0(wVar).U(new yga0(uVar)).a0(b).subscribe(new gl30(new g84(28, binderLifecycleMode, s210Var), i3), new m4m(new d4r(26), 2));
                ArrayList arrayList3 = wsg0Var.c;
                arrayList3.add(subscribe);
                com.vk.mvi.binder.b.a(binderLifecycleMode, new odc0(subscribe, i4));
                qcy<Object> qcyVar2 = qcyVarArr2[0];
                io.reactivex.rxjava3.internal.operators.observable.b0 z2 = d370.z((d310) nzwVar.getValue());
                jnb jnbVar = new jnb((com.vk.ecomm.reviews.impl.marketitem.replies.presentation.m) obj4, 8);
                yh1 yh1Var = new yh1(marketItemReviewRepliesFragment, 25);
                io.reactivex.rxjava3.core.w b2 = io.reactivex.rxjava3.android.schedulers.a.b();
                BinderLifecycleMode binderLifecycleMode2 = wsg0Var.b;
                io.reactivex.rxjava3.disposables.c subscribe2 = new io.reactivex.rxjava3.internal.operators.observable.y(z2.a0(wVar).U(new nit(jnbVar, 17)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(b2).subscribe(new uu60(new b7(i2, binderLifecycleMode2, yh1Var), 13), new qf(new nyq(23), 4));
                arrayList3.add(subscribe2);
                com.vk.mvi.binder.b.a(binderLifecycleMode2, new zrm(subscribe2, 1));
                return s3q0.a;
            case 18:
                f810 f810Var = (f810) obj5;
                List list2 = (List) obj4;
                MarketSearchResponseDto marketSearchResponseDto = (MarketSearchResponseDto) obj;
                List<MarketMarketItemDto> d = marketSearchResponseDto.d();
                ArrayList arrayList4 = new ArrayList(c5g.u(d, 10));
                for (MarketMarketItemDto marketMarketItemDto : d) {
                    boolean z3 = f810Var.k;
                    UserId q = marketMarketItemDto.q();
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj3 = it2.next();
                            if (epx.f(((glu) obj3).b, fkq0.a(q))) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    glu gluVar = (glu) obj3;
                    if (gluVar != null) {
                        UserId userId = gluVar.b;
                        String str6 = gluVar.d;
                        Boolean bool2 = gluVar.f;
                        owner = new MultipickerProduct.Owner(userId, str6, bool2 != null ? bool2.booleanValue() : false);
                    } else {
                        owner = null;
                    }
                    arrayList4.add(new ha10(fno.a(marketMarketItemDto, z3, owner)));
                }
                return new p810.q(arrayList4, 20, marketSearchResponseDto.getCount());
            case 19:
                b.C0929b c0929b = (b.C0929b) obj5;
                View view = ((com.vk.ecomm.catalog.impl.catalog.simple.b) obj4).b;
                ArrayList arrayList5 = c0929b.f;
                yfc yfcVar = c0929b.a;
                boolean isEmpty = arrayList5.isEmpty();
                a.C0928a c0928a = com.vk.ecomm.catalog.impl.catalog.simple.a.m;
                if (isEmpty) {
                    UserId c = yfcVar != null ? yfcVar.c() : null;
                    Integer a = yfcVar != null ? yfcVar.a() : null;
                    if (c != null && a != null) {
                        Context context = view.getContext();
                        int intValue = a.intValue();
                        String string2 = yfcVar.a.getString("title");
                        wx20.c(new com.vk.ecomm.catalog.impl.catalog.simple.a(context, c, intValue, string2 == null ? "" : string2, true), view.getContext(), qjg.a(c0928a), 0, 0, 28);
                    }
                } else {
                    b.a aVar3 = (b.a) arrayList5.get(0);
                    Context context2 = view.getContext();
                    UIBlockActionMarketOptions uIBlockActionMarketOptions = aVar3.a;
                    UserId userId2 = uIBlockActionMarketOptions.g;
                    int i8 = uIBlockActionMarketOptions.z;
                    String str7 = (yfcVar == null || (string = yfcVar.a.getString("title")) == null) ? "" : string;
                    Iterator it3 = arrayList5.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z = false;
                        } else if (((b.a) it3.next()).a.A.contains("market_option_id_delete_album_and_items")) {
                            z = true;
                        }
                    }
                    wx20.c(new com.vk.ecomm.catalog.impl.catalog.simple.a(context2, userId2, i8, str7, z), view.getContext(), qjg.a(c0928a), 0, 0, 28);
                }
                return s3q0.a;
            case 20:
                MultiVideoTimelineView multiVideoTimelineView = (MultiVideoTimelineView) obj4;
                MultiVideoTimelineView.d dVar2 = (MultiVideoTimelineView.d) obj;
                int i9 = MultiVideoTimelineView.y0;
                Integer num3 = (Integer) j5g.b0(e43.h(multiVideoTimelineView.getFrames()) + 1, (ArrayList) obj5);
                int intValue2 = num3 != null ? num3.intValue() : 0;
                multiVideoTimelineView.getFrames().add(dVar2.a);
                multiVideoTimelineView.k0.add(new MultiVideoTimelineView.b(dVar2.b, intValue2));
                multiVideoTimelineView.invalidate();
                return s3q0.a;
            case 21:
                CatalogExtendedData catalogExtendedData = (CatalogExtendedData) obj5;
                bi20 bi20Var = (bi20) obj4;
                FriendsLikedEpisode friendsLikedEpisode = (FriendsLikedEpisode) obj;
                List<Integer> list3 = friendsLikedEpisode.b;
                ArrayList arrayList6 = new ArrayList(c5g.u(list3, 10));
                Iterator<T> it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(new UserId(((Number) it4.next()).intValue()));
                }
                UserId[] userIdArr = (UserId[]) arrayList6.toArray(new UserId[0]);
                UserId[] userIdArr2 = (UserId[]) Arrays.copyOf(userIdArr, userIdArr.length);
                catalogExtendedData.getClass();
                friendsLikedEpisode.c = rli0.A(rli0.t(rl3.D(userIdArr2), new h5(catalogExtendedData, 19)));
                return new UIBlockFriendsLiked(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, friendsLikedEpisode, new UIBlockPodcastSliderItem(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, new PodcastSliderItem(bi20Var.a, PodcastSliderItem.Type.EPISODE, friendsLikedEpisode.d)));
            case 22:
                NewsfeedFeedbackPollFragment newsfeedFeedbackPollFragment = (NewsfeedFeedbackPollFragment) obj5;
                FeedbackPoll.Answer answer = (FeedbackPoll.Answer) obj4;
                ri60 ri60Var = newsfeedFeedbackPollFragment.f0;
                if (ri60Var != null) {
                    ri60Var.e++;
                    String str8 = answer.b;
                    FeedbackPoll feedbackPoll = ri60Var.c;
                    oct0 oct0Var = new oct0(str8, feedbackPoll != null ? feedbackPoll.k : null);
                    oct0Var.k = true;
                    itg0.m(rsg0.y0(oct0Var, null, null, 3));
                }
                ri60 ri60Var2 = newsfeedFeedbackPollFragment.f0;
                if (ri60Var2 != null) {
                    NewsfeedFeedbackPollFragment newsfeedFeedbackPollFragment2 = ri60Var2.b;
                    FeedbackPoll feedbackPoll2 = ri60Var2.c;
                    if (feedbackPoll2 != null) {
                        FeedbackPoll.Poll poll = feedbackPoll2.j;
                        int i10 = ri60Var2.d + 1;
                        ri60Var2.d = i10;
                        List<FeedbackPoll.Question> list4 = poll.c;
                        if (i10 < list4.size()) {
                            newsfeedFeedbackPollFragment2.lo(ri60Var2.d + 1, list4.size());
                            newsfeedFeedbackPollFragment2.ko(list4.get(ri60Var2.d));
                        } else {
                            Toolbar toolbar = newsfeedFeedbackPollFragment2.T;
                            if (toolbar != null) {
                                toolbar.t(R.style.FeedbackPollTitle, newsfeedFeedbackPollFragment2.getActivity());
                            }
                            Toolbar toolbar2 = newsfeedFeedbackPollFragment2.T;
                            if (toolbar2 != null) {
                                toolbar2.setSubtitle((CharSequence) null);
                            }
                            VKTabLayout vKTabLayout = newsfeedFeedbackPollFragment2.U;
                            if (vKTabLayout != null) {
                                bwt0.p0(vKTabLayout, false);
                            }
                            ViewPager viewPager = newsfeedFeedbackPollFragment2.V;
                            if (viewPager != null) {
                                bwt0.p0(viewPager, false);
                            }
                            View view2 = newsfeedFeedbackPollFragment2.X;
                            if (view2 != null) {
                                bwt0.p0(view2, false);
                            }
                            View view3 = newsfeedFeedbackPollFragment2.b0;
                            if (view3 != null) {
                                bwt0.p0(view3, true);
                            }
                            ce60.b.getClass();
                            p870.f().e(100, feedbackPoll2);
                        }
                    }
                }
                return s3q0.a;
            case 23:
                final NewsfeedFragment newsfeedFragment = (NewsfeedFragment) obj5;
                com.vk.mvi.binder.c cVar = (com.vk.mvi.binder.c) obj;
                qcy<Object>[] qcyVarArr3 = NewsfeedFragment.J0;
                com.vk.mvi.binder.c.a(cVar, f9t.w(newsfeedFragment.io()), new iyp() { // from class: xsna.ij60
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // xsna.iyp
                    public final void a(pk50 pk50Var) {
                        NewsfeedFragment newsfeedFragment2 = NewsfeedFragment.this;
                        ((it60) newsfeedFragment2.U.getValue()).b(newsfeedFragment2.fo(), newsfeedFragment2, newsfeedFragment2.getActivity(), newsfeedFragment2.k0, (xh60) pk50Var);
                    }
                });
                com.vk.mvi.binder.c.b(cVar, f9t.F(f9t.z(newsfeedFragment.io()), new xa9((m170) obj4, 11)), new xx40(newsfeedFragment, i5));
                return s3q0.a;
            case 24:
                ko90 ko90Var = (ko90) obj;
                ((PastBroadcastsFragment) obj5).S.setItems(ko90Var.a);
                ((CustomSwipeRefreshLayout) obj4).setRefreshing(ko90Var.b);
                return s3q0.a;
            case 25:
                bgy bgyVar = ((adk0) obj5).m;
                yck0 yck0Var = (yck0) obj4;
                int i11 = adk0.a.$EnumSwitchMapping$0[((SnippetTrackItemView$Companion$ButtonAddAction) obj).ordinal()];
                if (i11 == 1) {
                    MusicTrack musicTrack = yck0Var.e;
                    if (musicTrack == null) {
                        musicTrack = yck0Var.c;
                    }
                    bgyVar.invoke(new g650.a.C2913a(musicTrack));
                } else {
                    if (i11 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MusicTrack musicTrack2 = yck0Var.e;
                    if (musicTrack2 == null) {
                        musicTrack2 = yck0Var.c;
                    }
                    bgyVar.invoke(new g650.a.d(musicTrack2));
                }
                return s3q0.a;
            case 26:
                StickersView stickersView = (StickersView) obj5;
                StickerPackPreviewModel stickerPackPreviewModel = (StickerPackPreviewModel) obj4;
                StickerStockItem stickerStockItem = (StickerStockItem) j5g.a0((List) obj);
                if (stickerStockItem == null) {
                    return s3q0.a;
                }
                stickerStockItem.O = "recommendation_keyboard";
                stickersView.j.H7(stickerStockItem, new xk6(stickersView, 12));
                StickersView.e(stickersView, stickerPackPreviewModel.e(), false);
                return s3q0.a;
            case 27:
                b.d dVar3 = (b.d) obj;
                dVar3.b((String) obj5, "reaction_name");
                StoriesContainer storiesContainer = ((ebm0) obj4).c;
                if (storiesContainer instanceof HighlightStoriesContainer) {
                    dVar3.b(Integer.valueOf(((HighlightStoriesContainer) storiesContainer).o.b), "narrative_id");
                }
                return s3q0.a;
            case 28:
                ((izs) obj5).invoke(((StoryViewHeader) obj4).h);
                return s3q0.a;
            default:
                ((izs) obj5).invoke(sum0.c.a((sum0.c) obj4, false, (SubnavigationBarAppearance) obj, 0, false, 13));
                return s3q0.a;
        }
    }

    public /* synthetic */ ku1(CatalogExtendedData catalogExtendedData, w060 w060Var, bi20 bi20Var) {
        this.b = 21;
        this.c = catalogExtendedData;
        this.d = bi20Var;
    }
}
