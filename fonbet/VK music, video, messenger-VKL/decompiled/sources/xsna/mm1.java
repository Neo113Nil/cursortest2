package xsna;

import android.content.Context;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.vk.api.generated.audio.dto.AudioAudioRawIdTrackedDto;
import com.vk.api.generated.audio.dto.AudioFullRadioStationIdDto;
import com.vk.api.generated.audio.dto.AudioGetIdsBySourceResponseDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.questions.dto.QuestionsQuestionDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage;
import com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockVh;
import com.vk.community.design.view.donut.DonutUserStackView;
import com.vk.community.design.view.donut.DonutUserStackView.b;
import com.vk.core.tabs.SkeletonTabLayout;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.dto.search.SearchQuickInnerFilterItem;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.SocialButtonType;
import com.vk.ecomm.reviews.impl.replies.presentation.actionbuilder.ReplyAction;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.friends.recommendations.impl.presentation.FriendsRecommendationsFragment;
import com.vk.friends.recommendations.impl.presentation.Item;
import com.vk.home.HomeFragment2;
import com.vk.metrics.trackers.my.event.SingleEvent;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.newsfeed.api.data.NewsfeedList;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.posting.api.analytics.PostingMetricEntryPoint;
import com.vk.newsfeed.posting.impl.domain.model.EditingPost;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.PublicationState;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.photos.root.albums.presentation.a;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.profile.questions.impl.d;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.SetBuilder;
import xsna.d4c0;
import xsna.ec60;
import xsna.efc0;
import xsna.fmc0;
import xsna.i2g0;
import xsna.iij;
import xsna.lgj;
import xsna.mp90;
import xsna.rye;
import xsna.sq1;
import xsna.szr;
import xsna.tlo0;
import xsna.xo90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class mm1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mm1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0123, code lost:
    
        if (r4 != null) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x047d  */
    /* JADX WARN: Type inference failed for: r1v97, types: [java.lang.Object, xsna.inv] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46, types: [xsna.c6z, xsna.grj0] */
    /* JADX WARN: Type inference failed for: r3v71, types: [java.lang.Object, xsna.eig0] */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v11, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        RenderEffect createBlurEffect;
        Iterator<RequestUserProfile> it;
        NewsEntry.TrackData Cb;
        String str;
        PostingCreationEntryPoint postingCreationEntryPoint;
        Post R;
        String name;
        int i = this.b;
        int i2 = 11;
        int i3 = 8;
        int i4 = 4;
        int i5 = 10;
        int i6 = 1;
        r9 = 0;
        ?? r9 = 0;
        rju0 rju0Var = null;
        int i7 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                com.vk.photos.root.albums.presentation.b bVar = (com.vk.photos.root.albums.presentation.b) obj3;
                a.C1492a c1492a = (a.C1492a) obj2;
                tlo0.a aVar = tlo0.Companion;
                Object[] objArr = {c1492a.b.g};
                aVar.getClass();
                bVar.l.b(new sq1.g(new j7k0(tlo0.a.c(R.string.album_details_delete_album_fail, objArr), Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), Integer.valueOf(R.attr.vk_ui_accent_orange), new tlo0.f(R.string.photos_retry), new ig1(i6, bVar, c1492a), null, 32)));
                return s3q0.a;
            case 1:
                zu5 zu5Var = (zu5) obj3;
                cpi cpiVar = (cpi) obj2;
                jy50 jy50Var = zu5Var.a;
                if (jy50Var != null) {
                    jy50.a(jy50Var, cpiVar.b);
                } else {
                    p180 p180Var = zu5Var.b;
                    if (p180Var == null) {
                        throw new IllegalStateException("Unreachable");
                    }
                    p180Var.b(cpiVar.a);
                }
                return new ev5(zu5Var, cpiVar);
            case 2:
                Context context = (Context) obj2;
                ffu0 ffu0Var = (ffu0) obj;
                float a = hbh0.a(context, ((vak0) ((bh7) obj3).d).getFloatValue());
                int H = f870.H(l5g.c(14, f870.c(context.getColor(R.color.vk_white)), 0.5f));
                ffu0Var.getClass();
                ColorDrawable colorDrawable = new ColorDrawable(H);
                if (gz80.a(31)) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    createBlurEffect = RenderEffect.createBlurEffect(a, a, Shader.TileMode.CLAMP);
                    ffu0Var.setRenderEffect(createBlurEffect);
                } else {
                    ffu0Var.setOverlayImage(colorDrawable);
                }
                return s3q0.a;
            case 3:
                ((xc8) obj3).a.j((lgj.a) obj2);
                return s3q0.a;
            case 4:
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj2;
                io.reactivex.rxjava3.core.q qVar2 = (io.reactivex.rxjava3.core.q) obj;
                io.reactivex.rxjava3.internal.operators.observable.o2 t0 = qVar.t0(1L);
                a.x xVar = io.reactivex.rxjava3.internal.functions.a.g;
                io.reactivex.rxjava3.internal.operators.observable.n1 n1Var = new io.reactivex.rxjava3.internal.operators.observable.n1(t0, xVar);
                qVar2.getClass();
                io.reactivex.rxjava3.internal.operators.observable.p2 p2Var = new io.reactivex.rxjava3.internal.operators.observable.p2(n1Var, new io.reactivex.rxjava3.internal.operators.observable.n1(qVar2, xVar));
                j41 j41Var = new j41(new po1(atomicBoolean, i2), i4);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                return io.reactivex.rxjava3.core.q.X(p2Var.E(j41Var, lVar, kVar, kVar), new io.reactivex.rxjava3.internal.operators.observable.o1(qVar2, new x34(new s53(r2, atomicBoolean, qVar), i4)));
            case 5:
                LinearLayout linearLayout = new LinearLayout(((x2b) obj3).a);
                linearLayout.setOrientation(1);
                linearLayout.addView((FrameLayout) obj2);
                linearLayout.addView((View) obj);
                return linearLayout;
            case 6:
                xg5.a().s(((i9b) obj3).f, (UserId) obj2, (r13 & 4) != 0 ? null : "activity", (r13 & 8) != 0 ? null : null, (r13 & 16) == 0 ? "co_owners" : null);
                ((ikv0) obj).a();
                return s3q0.a;
            case 7:
                mdg mdgVar = (mdg) obj3;
                iag iagVar = (iag) obj2;
                if (((BaseOkResponseDto) obj).i() == BaseOkResponseDto.OK.i()) {
                    mdgVar.e8(iagVar.getUid(), false);
                }
                return s3q0.a;
            case 8:
                CommunityAddressesFragment communityAddressesFragment = (CommunityAddressesFragment) obj3;
                CommunityAddressesFragment.b bVar2 = (CommunityAddressesFragment.b) obj2;
                View view = (View) obj;
                View view2 = communityAddressesFragment.W;
                if ((view2 != null ? view2 : null).getMeasuredHeight() - view.getMeasuredHeight() > 0) {
                    int measuredHeight = view.getMeasuredHeight();
                    communityAddressesFragment.B0 = measuredHeight;
                    ndr0 ndr0Var = communityAddressesFragment.r0;
                    if (ndr0Var != null) {
                        ndr0Var.q(measuredHeight);
                    }
                    View view3 = communityAddressesFragment.Z;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                    View view4 = communityAddressesFragment.a0;
                    if (view4 != null) {
                        view4.setVisibility(8);
                    }
                }
                if (bVar2.a) {
                    CommunityAddressesFragment.ko(communityAddressesFragment, bVar2.c);
                }
                return s3q0.a;
            case 9:
                iij iijVar = (iij) obj3;
                gkh gkhVar = iijVar.e;
                Photo photo = (Photo) ((iij.a) obj2).m;
                WeakReference<View> weakReference = iijVar.f;
                iea0 iea0Var = (iea0) gkhVar.t;
                if (iea0Var != null) {
                    gkhVar.E.f(iea0Var, new t5a0(photo, iea0Var), weakReference, iea0Var.l.l() ? 3 : 0);
                }
                return s3q0.a;
            case 10:
                uu20 uu20Var = (uu20) obj2;
                ((izs) obj3).invoke(uu20.a(uu20Var, null, null, null, null, new wow(r6l.j(((Integer) obj).intValue(), uu20Var.e)), 15));
                return s3q0.a;
            case 11:
                psm psmVar = (psm) obj3;
                Map map = (Map) obj2;
                oum oumVar = (oum) obj;
                oum a2 = oum.a(oumVar, null, null, null, map, null, null, null, null, null, null, null, null, 4087);
                SetBuilder setBuilder = new SetBuilder();
                Set<Peer> keySet = oumVar.d.keySet();
                ArrayList arrayList = new ArrayList(c5g.u(keySet, 10));
                Iterator it2 = keySet.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Long.valueOf(((Peer) it2.next()).b));
                }
                setBuilder.addAll(arrayList);
                Set keySet2 = map.keySet();
                ArrayList arrayList2 = new ArrayList(c5g.u(keySet2, 10));
                Iterator it3 = keySet2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Long.valueOf(((Peer) it3.next()).b));
                }
                setBuilder.addAll(arrayList2);
                s3q0 s3q0Var = s3q0.a;
                return psmVar.w(a2, setBuilder.d());
            case 12:
                DonutUserStackView donutUserStackView = (DonutUserStackView) obj3;
                s4o s4oVar = (s4o) obj;
                s4oVar.a(donutUserStackView.getAvatarUrlsAndDonStatus(), new DonutUserStackView.a((baf0) obj2));
                if (donutUserStackView.getCount() > 0) {
                    s4oVar.b(donutUserStackView.new b());
                }
                return s3q0.a;
            case 13:
                udr udrVar = (udr) obj3;
                defpackage.v vVar = (defpackage.v) obj2;
                Iterator it4 = udrVar.b.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        ?? next = it4.next();
                        String title = ((rju0) next).getTitle();
                        SearchQuickInnerFilterItem searchQuickInnerFilterItem = udrVar.d;
                        if (epx.f(title, searchQuickInnerFilterItem != null ? searchQuickInnerFilterItem.b : null)) {
                            rju0Var = next;
                        }
                    }
                }
                rju0 rju0Var2 = rju0Var;
                if (rju0Var2 != null && !rju0Var2.t.isChecked()) {
                    rju0Var2.performClick();
                }
                vVar.invoke(udrVar.d);
                dw20 dw20Var = udrVar.a;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 14:
                szr szrVar = (szr) obj3;
                pzr pzrVar = (pzr) obj2;
                vzr vzrVar = (vzr) obj;
                if (!vzrVar.f && vzrVar.a.size() - ((szr.e) szrVar).b <= 30) {
                    pzrVar.h.a(30);
                }
                return s3q0.a;
            case 15:
                FriendsRecommendationsFragment friendsRecommendationsFragment = (FriendsRecommendationsFragment) obj3;
                String str2 = (String) obj2;
                ass assVar = (ass) obj;
                int i8 = FriendsRecommendationsFragment.b0;
                friendsRecommendationsFragment.U = assVar.b;
                VKFromList<RequestUserProfile> vKFromList = assVar.a;
                VKFromList vKFromList2 = new VKFromList(vKFromList.i());
                if ((str2 == null || str2.length() == 0) && !vKFromList.isEmpty()) {
                    if (((RequestUserProfile) j5g.Y(vKFromList)).o0) {
                        if (!friendsRecommendationsFragment.W) {
                            vKFromList2.add(new Item(Item.Type.TITLE, R.string.friends_recommendations_title_new, null, null, 12));
                        }
                        it = vKFromList.iterator();
                        while (it.hasNext()) {
                            RequestUserProfile next2 = it.next();
                            if (i6 != 0 && !next2.o0) {
                                if (!friendsRecommendationsFragment.W) {
                                    vKFromList2.add(new Item(Item.Type.TITLE, R.string.friends_recommendations_title_old, null, null, 12));
                                }
                                i6 = 0;
                            }
                            vKFromList2.add(new Item(next2.p0 ? Item.Type.REQUEST_NOT_REAL : next2.e0 == SocialButtonType.FOLLOW ? Item.Type.FOLLOW_SUGGEST : Item.Type.REQUEST, 0, next2, null, 10));
                        }
                        return vKFromList2;
                    }
                    if (!friendsRecommendationsFragment.W) {
                        vKFromList2.add(new Item(Item.Type.TITLE, R.string.friends_recommendations_title_old, null, null, 12));
                    }
                }
                i6 = 0;
                it = vKFromList.iterator();
                while (it.hasNext()) {
                }
                return vKFromList2;
            case 16:
                io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) obj3;
                m6z m6zVar = (m6z) obj2;
                d4c0.a aVar2 = (d4c0.a) obj;
                if (!yVar.h()) {
                    l6z l6zVar = m6zVar.c;
                    ?? r3 = l6zVar.a;
                    if (aVar2.d && r3.J()) {
                        NewsEntry newsEntry = r3 instanceof NewsEntry ? (NewsEntry) r3 : null;
                        if (newsEntry != null && (Cb = newsEntry.Cb()) != null) {
                            Cb.h = l6zVar.d;
                        }
                    }
                    yVar.onSuccess(aVar2);
                }
                return s3q0.a;
            case 17:
                View inflate = ((LayoutInflater) obj3).inflate(R.layout.vk_error_screen, (ViewGroup) obj, false);
                inflate.findViewById(R.id.error_retry).setOnClickListener(new p01((gzs) obj2, i2));
                return inflate;
            case 18:
                MusicPageInfoBlockVh musicPageInfoBlockVh = (MusicPageInfoBlockVh) obj3;
                UIBlockMusicPage uIBlockMusicPage = (UIBlockMusicPage) obj2;
                musicPageInfoBlockVh.c.a(new cfp0(uIBlockMusicPage, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Unsubscribe)));
                io.reactivex.rxjava3.core.q<Integer> j = musicPageInfoBlockVh.j(uIBlockMusicPage);
                musicPageInfoBlockVh.m = j != null ? j.subscribe(new c2y(new rlh(musicPageInfoBlockVh, 28), i3), new xk30(new d2y(musicPageInfoBlockVh, i5), i4)) : null;
                dw20 dw20Var2 = musicPageInfoBlockVh.n;
                if (dw20Var2 != null) {
                    dw20Var2.dismiss();
                }
                musicPageInfoBlockVh.n = null;
                return s3q0.a;
            case 19:
                ec60 ec60Var = (ec60) obj3;
                ls60 ls60Var = (ls60) ec60Var.c.c(((ec60.b) obj2).getAdapterPosition());
                if (ls60Var == null) {
                    return s3q0.a;
                }
                NewsfeedList newsfeedList = ec60Var.f;
                NewsfeedList newsfeedList2 = ls60Var.a;
                ec60Var.f = newsfeedList2;
                vob vobVar = ec60Var.g;
                if (vobVar != null) {
                    boolean f = epx.f(newsfeedList, newsfeedList2);
                    int i9 = newsfeedList2.b;
                    HomeFragment2 homeFragment2 = (HomeFragment2) vobVar.b;
                    VkContextMenu vkContextMenu = homeFragment2.Y;
                    if (vkContextMenu != null) {
                        vkContextMenu.b();
                    }
                    if (!f) {
                        SkeletonTabLayout skeletonTabLayout = homeFragment2.T;
                        if (skeletonTabLayout != null) {
                            homeFragment2.eo(skeletonTabLayout, 0);
                        }
                        ce60.b.getClass();
                        p870.f().d(127, Integer.MIN_VALUE, newsfeedList2);
                        ggc0 ggc0Var = homeFragment2.o0;
                        if (ggc0Var != null) {
                            ggc0Var.g.o7(i9);
                        }
                        ?? r1 = homeFragment2.V;
                        if (r1 != 0) {
                            r1.i(i9);
                        }
                        homeFragment2.no();
                    }
                }
                return s3q0.a;
            case 20:
                ((tgp0) obj).e((ur4) obj3, (Uri) obj2);
                return s3q0.a;
            case 21:
                Context context2 = (Context) obj3;
                ur80 ur80Var = (ur80) obj2;
                Throwable th = (Throwable) obj;
                if (ur80Var.f || ur80Var.g) {
                    com.vk.common.links.c.Q(context2, ur80Var.a, ur80Var.b, ur80Var.c, ur80Var.d, ur80Var.e, false, false, ur80Var.h);
                } else {
                    yp80 yp80Var = ur80Var.e;
                    if (yp80Var != null) {
                        yp80Var.onError(th);
                    }
                }
                return s3q0.a;
            case 22:
                ((x690) obj3).l.j0(((y690) obj2).b);
                return s3q0.a;
            case 23:
                bp90 bp90Var = (bp90) obj3;
                xo90.a.e eVar = (xo90.a.e) ((xo90.a) obj2);
                bp90Var.t.a(new mp90.b.a.e(eVar.a, eVar.b, bp90Var.u));
                return s3q0.a;
            case 24:
                com.vk.music.player.playback.d dVar = (com.vk.music.player.playback.d) obj3;
                PlaybackLaunchMeta playbackLaunchMeta = (PlaybackLaunchMeta) obj2;
                AudioGetIdsBySourceResponseDto audioGetIdsBySourceResponseDto = (AudioGetIdsBySourceResponseDto) obj;
                String e = audioGetIdsBySourceResponseDto.e();
                if (e != null) {
                    dVar.getClass();
                    str = q76.n(e, "", playbackLaunchMeta).a;
                } else {
                    str = null;
                }
                dVar.getClass();
                List<AudioAudioRawIdTrackedDto> d = audioGetIdsBySourceResponseDto.d();
                if (d == null || d.isEmpty()) {
                    List<AudioFullRadioStationIdDto> f2 = audioGetIdsBySourceResponseDto.f();
                    if (f2 == null || f2.isEmpty()) {
                        r9 = EmptyList.b;
                    } else {
                        List<AudioFullRadioStationIdDto> f3 = audioGetIdsBySourceResponseDto.f();
                        if (f3 != null) {
                            List<AudioFullRadioStationIdDto> list = f3;
                            r9 = new ArrayList(c5g.u(list, 10));
                            Iterator it5 = list.iterator();
                            while (it5.hasNext()) {
                                r9.add(q76.n(String.valueOf(((AudioFullRadioStationIdDto) it5.next()).d()), "", playbackLaunchMeta));
                            }
                        }
                    }
                } else {
                    List<AudioAudioRawIdTrackedDto> d2 = audioGetIdsBySourceResponseDto.d();
                    if (d2 != null) {
                        List<AudioAudioRawIdTrackedDto> list2 = d2;
                        r9 = new ArrayList(c5g.u(list2, 10));
                        for (AudioAudioRawIdTrackedDto audioAudioRawIdTrackedDto : list2) {
                            r9.add(q76.n(audioAudioRawIdTrackedDto.d(), audioAudioRawIdTrackedDto.r(), playbackLaunchMeta));
                        }
                    }
                }
                if (r9 == 0) {
                    r9 = EmptyList.b;
                }
                return new Pair(r9, str);
            case 25:
                Post post = (Post) obj3;
                Context context3 = (Context) obj2;
                Post post2 = (Post) obj;
                if (!post2.pc()) {
                    ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
                    jt50.a(SingleEvent.POST);
                }
                ce60.b.getClass();
                p870.f().e(100, post);
                p870.f().e(105, post2);
                iuc0 iuc0Var = iuc0.b;
                iuc0.j0(context3, iuc0.i0(post.m));
                return s3q0.a;
            case 26:
                PostingState.Editing editing = (PostingState.Editing) obj3;
                ube0 ube0Var = (ube0) obj2;
                NewsEntry newsEntry2 = (NewsEntry) obj;
                boolean z = editing.h instanceof PostEditingReason.EditRemoteDraft;
                PostingContext postingContext = editing.c;
                PostingMetricEntryPoint postingMetricEntryPoint = postingContext.h;
                EditingPost editingPost = postingContext.m;
                if (postingMetricEntryPoint != null && (name = postingMetricEntryPoint.name()) != null) {
                    PostingCreationEntryPoint.Companion.getClass();
                    postingCreationEntryPoint = PostingCreationEntryPoint.a.a(name);
                    break;
                }
                postingCreationEntryPoint = PostingCreationEntryPoint.Other;
                if (editingPost != null && ((R = di60.R(newsEntry2)) == null || editingPost.d != R.n)) {
                    p870.f().e(152, new NewsfeedExternalAction.c.w(editingPost.c, editingPost.d, editingPost.f, editingPost.e, editingPost.g, editingPost.h));
                }
                if (z) {
                    p870.f().e(101, newsEntry2);
                } else {
                    p870.f().e(105, newsEntry2);
                    Post post3 = newsEntry2 instanceof Post ? (Post) newsEntry2 : null;
                    if (post3 != null && ((Boolean) ube0Var.f.getValue()).booleanValue()) {
                        p870.f().e(157, new kb60(postingCreationEntryPoint.name(), post3));
                    }
                }
                UserId userId = postingContext.b.b;
                UserId userId2 = UserId.d;
                UserId userId3 = userId.equals(userId2) ? null : userId;
                if (userId3 == null) {
                    UserId userId4 = postingContext.p;
                    if (userId4 != null) {
                        userId2 = userId4;
                    }
                } else {
                    userId2 = userId3;
                }
                hdo hdoVar = ube0Var.d;
                efc0.a aVar3 = ube0Var.a;
                hdoVar.c(userId2);
                aVar3.a(new e.g(PublicationState.Success));
                aVar3.e(new fmc0.m.a(userId2, z));
                return s3q0.a;
            case 27:
                com.vk.profile.questions.impl.h hVar = (com.vk.profile.questions.impl.h) obj3;
                com.vk.profile.questions.impl.d dVar2 = (com.vk.profile.questions.impl.d) obj2;
                LinkedHashMap linkedHashMap = hVar.j;
                int i10 = -1;
                linkedHashMap.put(com.vk.profile.questions.impl.h.j7(dVar2), Integer.valueOf((((Integer) linkedHashMap.get(com.vk.profile.questions.impl.h.j7(dVar2))) != null ? r2.intValue() : 1) - 1));
                int id = dVar2.b().getId();
                com.vk.profile.questions.impl.c cVar = hVar.g;
                QuestionsQuestionDto b = dVar2.b();
                UsersUserFullDto a3 = dVar2.a();
                cVar.getClass();
                d.c a4 = com.vk.profile.questions.impl.c.a(b, a3);
                ArrayList arrayList3 = hVar.h;
                Iterator it6 = arrayList3.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        if (((com.vk.profile.questions.impl.d) it6.next()).b().getId() == id) {
                            i10 = i7;
                        } else {
                            i7++;
                        }
                    }
                }
                if (i10 >= 0) {
                    arrayList3.set(i10, a4);
                    hVar.i++;
                    s3q0 s3q0Var2 = s3q0.a;
                    hVar.u7();
                }
                return s3q0.a;
            case 28:
                k2g0 k2g0Var = (k2g0) obj3;
                i2g0 i2g0Var = (i2g0) obj2;
                u60 u60Var = (u60) obj;
                if (u60Var instanceof ReplyAction) {
                    int ordinal = ((ReplyAction) u60Var).ordinal();
                    int i11 = ((i2g0.a) i2g0Var).a;
                    ?? r32 = k2g0Var.d;
                    if (ordinal == ReplyAction.REPLY_ACTION_REPLY.ordinal()) {
                        r32.a(new a2g0(i11));
                    } else if (ordinal == ReplyAction.REPLY_ACTION_COPY_TEXT.ordinal()) {
                        r32.a(new x1g0(i11));
                    } else if (ordinal == ReplyAction.REPLY_ACTION_DELETE.ordinal()) {
                        r32.a(new y1g0(i11));
                    } else if (ordinal == ReplyAction.REPLY_ACTION_EDIT.ordinal()) {
                        r32.a(new z1g0(i11));
                    }
                }
                return s3q0.a;
            default:
                rye.b bVar3 = (rye.b) obj3;
                bVar3.b(((gtl) obj2).c, new stg0(bVar3, i7), false);
                return s3q0.a;
        }
    }

    public /* synthetic */ mm1(kw70 kw70Var, ur4 ur4Var, Uri uri) {
        this.b = 20;
        this.c = ur4Var;
        this.d = uri;
    }
}
