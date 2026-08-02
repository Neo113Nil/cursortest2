package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.vk.api.generated.healthCommon.dto.HealthCommonVkstartSyncBackgroundConfigDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.catalog2.common.dto.ui.UIBlockArtistBio;
import com.vk.catalog2.common.ui.holders.group.GroupInviteVh;
import com.vk.catalog2.feature.music.holders.artist.ArtistBiographyVh;
import com.vk.channels.api.Channel;
import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import com.vk.clips.playlists.model.PlaylistRawId;
import com.vk.clips.sdk.models.SdkTrendingHashtag;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.reviews.impl.replies.presentation.actionbuilder.ReplyAction;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.fragments.MsgViewFragment;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.menu.PostingMoreMenuMainButtonView;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vk.stat.model.builders.aggregate.AggregateEventBuilder;
import com.vk.stat.model.builders.aggregate.AggregateEventKey;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunityScreenLoadErrorView;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunityScreenLoadRetryClick;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import com.vk.stickers.keyboard.navigation.a;
import com.vk.stickers.keyboard.navigation.c;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.KSerializer;
import xsna.aue;
import xsna.bcb;
import xsna.gfc;
import xsna.gm50;
import xsna.kyh;
import xsna.mp90;
import xsna.p1s;
import xsna.saf;
import xsna.u1s;
import xsna.u8m;
import xsna.vte;
import xsna.wbb;
import xsna.wzr;
import xsna.xo90;
import xsna.ybb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class s53 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s53(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v62, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        SdkTrendingHashtag sdkTrendingHashtag;
        io.reactivex.rxjava3.core.k tVar;
        io.reactivex.rxjava3.core.k kVar;
        Set<PlaylistRawId> set;
        ExtendedCommunityProfile extendedCommunityProfile;
        UserProfile userProfile;
        UserId userId;
        ListBuilder g;
        List<String> d;
        int i = this.b;
        int i2 = 24;
        int i3 = 2;
        r5 = null;
        Set set2 = null;
        int i4 = 0;
        r6 = false;
        boolean z = false;
        int i5 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                t53 t53Var = (t53) obj2;
                WebApiApplication webApiApplication = (WebApiApplication) ((gzs) obj3).invoke();
                if (webApiApplication != null) {
                    t53Var.d.d(webApiApplication);
                }
                return s3q0.a;
            case 1:
                ArtistBiographyVh artistBiographyVh = (ArtistBiographyVh) obj3;
                artistBiographyVh.N6((UIBlockArtistBio) obj2);
                artistBiographyVh.b(false);
                return s3q0.a;
            case 2:
                Cipher cipher = (Cipher) obj;
                byte[] iv = cipher.getIV();
                byte[] doFinal = cipher.doFinal(((vjk) obj3).b);
                SharedPreferences.Editor edit = ((SharedPreferences) obj2).edit();
                edit.putString("DATA_ENCRYPTED", Base64.encodeToString(doFinal, 0));
                edit.putString("INITIALIZATION_VECTOR", Base64.encodeToString(iv, 0));
                edit.apply();
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            case 3:
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) obj2;
                Throwable th = (Throwable) obj;
                if (((AtomicBoolean) obj3).get()) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }
                qVar.getClass();
                return new io.reactivex.rxjava3.internal.operators.observable.m2(new io.reactivex.rxjava3.internal.operators.observable.n1(qVar, io.reactivex.rxjava3.internal.functions.a.g), io.reactivex.rxjava3.core.q.H(th));
            case 4:
                return ((com.vk.channels.impl.channel_screen.footer.d) obj3).s((Channel) obj2);
            case 5:
                ybb.f fVar = (ybb.f) obj3;
                ubb ubbVar = (ubb) obj2;
                String str = (String) obj;
                boolean z2 = fVar.d;
                ChannelMsgSendConfig channelMsgSendConfig = fVar.c;
                if (z2) {
                    ubbVar.k.a(R.string.vkim_channels_post_edit_success, null);
                }
                ubbVar.n(bcb.j.a);
                Channel P0 = ubbVar.p.P0();
                Long valueOf = P0 != null ? Long.valueOf(P0.b) : null;
                if (!ubbVar.m.b && channelMsgSendConfig.l() != null && valueOf != null) {
                    ubbVar.m(new wbb.b(valueOf.longValue()));
                }
                if (channelMsgSendConfig.e() && !fVar.d && P0.z == ChannelType.COMMUNITY_CHANNEL) {
                    ubbVar.r.put(str, fVar.b);
                }
                return s3q0.a;
            case 6:
                int i6 = rec.j1;
                gm50.a.a((rec) obj3, ((gfc.e) obj).a, new mf8((ffc) obj2, 2));
                return s3q0.a;
            case 7:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj3;
                SdkVideoFile sdkVideoFile = (SdkVideoFile) obj;
                int i7 = ClipFeedListFragment.a2;
                Context context = ((q8e) obj2).getContext();
                if ((sdkVideoFile instanceof SdkClipVideoFile) && (sdkTrendingHashtag = (SdkTrendingHashtag) j5g.a0(((SdkClipVideoFile) sdkVideoFile).R0())) != null) {
                    saf safVar = (saf) clipFeedListFragment.E0.getValue();
                    String str2 = sdkTrendingHashtag.b;
                    safVar.getClass();
                    if (epx.f(saf.e, saf.a.c.a)) {
                        spp0 spp0Var = saf.d.get(str2);
                        String str3 = spp0Var != null ? spp0Var.b : null;
                        kVar = str3 != null ? io.reactivex.rxjava3.core.k.i(str3) : io.reactivex.rxjava3.internal.operators.maybe.i.b;
                    } else {
                        io.reactivex.rxjava3.internal.operators.single.n nVar = safVar.b;
                        int i8 = 12;
                        if (nVar == null) {
                            io.reactivex.rxjava3.internal.operators.single.n a = safVar.a();
                            safVar.b = a;
                            tVar = new io.reactivex.rxjava3.internal.operators.single.t(hg1.n(a, context, false, null, 62), new pb(new rqd(str2, i5), i8));
                            clipFeedListFragment.r1.b(tVar.subscribe(new vl0(new cyc(context, sdkTrendingHashtag, clipFeedListFragment, sdkVideoFile, 0), 9)));
                        } else {
                            kVar = new io.reactivex.rxjava3.internal.operators.single.t(nVar, new pb(new rqd(str2, i5), i8));
                        }
                    }
                    tVar = kVar;
                    clipFeedListFragment.r1.b(tVar.subscribe(new vl0(new cyc(context, sdkTrendingHashtag, clipFeedListFragment, sdkVideoFile, 0), 9)));
                }
                return s3q0.a;
            case 8:
                r4g0 r4g0Var = (r4g0) obj2;
                ((kdd) obj3).getClass();
                int min = Math.min(iah0.f().widthPixels, 1080);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE);
                int min2 = Math.min(iah0.f().heightPixels, 1920);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min2, Integer.MIN_VALUE);
                r4g0Var.w0(min, min2);
                r4g0Var.getRootView().measure(makeMeasureSpec, makeMeasureSpec2);
                r4g0Var.layout(0, 0, (int) r4g0Var.getRealWidth(), (int) r4g0Var.getRealHeight());
                r4g0Var.b();
                return s3q0.a;
            case 9:
                pdo pdoVar = (pdo) obj3;
                io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) obj2;
                e1 e1Var = new e1(pdoVar, i2);
                ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
                clipsDraftPersistentStore.getClass();
                ClipsDraftVk k = ClipsDraftPersistentStore.k();
                if (k != null) {
                    e1Var.invoke(k);
                }
                eml.h(pdoVar.b);
                wxd wxdVar = new wxd(pdoVar.c, i4);
                clipsDraftPersistentStore.getClass();
                ClipsDraftVk k2 = ClipsDraftPersistentStore.k();
                if (k2 != null) {
                    wxdVar.invoke(k2);
                }
                ArrayList arrayList = pdoVar.d;
                clipsDraftPersistentStore.getClass();
                ClipsDraftVk k3 = ClipsDraftPersistentStore.k();
                if (k3 != null) {
                    k3.b.d = new ArrayList(arrayList);
                    s3q0 s3q0Var = s3q0.a;
                }
                clipsDraftPersistentStore.getClass();
                ClipsDraftPersistentStore.t();
                s3q0 s3q0Var2 = s3q0.a;
                yVar.onSuccess(s3q0Var2);
                return s3q0Var2;
            case 10:
                ste steVar = (ste) obj3;
                aue.b bVar = (aue.b) obj2;
                ShortVideoGetPlaylistsResponseDto shortVideoGetPlaylistsResponseDto = (ShortVideoGetPlaylistsResponseDto) obj;
                ClipsPlaylistsFolderLaunchParams.FoldersLaunchType foldersLaunchType = bVar.b;
                ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.SinglePick singlePick = foldersLaunchType instanceof ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.SinglePick ? (ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.SinglePick) foldersLaunchType : null;
                if (singlePick != null && (set = singlePick.c) != null) {
                    set2 = ste.U(bVar.e.b, set);
                }
                if (set2 == null) {
                    set2 = EmptySet.b;
                }
                steVar.T(new vte.g(shortVideoGetPlaylistsResponseDto, set2));
                return s3q0.a;
            case 11:
                mdg mdgVar = (mdg) obj3;
                iag iagVar = (iag) obj2;
                ListDataSet<cbg> listDataSet = mdgVar.K;
                int size = listDataSet.d.size();
                while (i4 < size) {
                    cbg c = listDataSet.c(i4);
                    if (c != null) {
                        iag iagVar2 = c.a;
                        if (iagVar2 instanceof NewsComment) {
                            NewsComment newsComment = (NewsComment) iagVar2;
                            if (epx.f(newsComment.j, iagVar.getUid())) {
                                newsComment.b0 = true;
                                listDataSet.d(i4);
                            }
                        }
                    }
                    i4++;
                }
                if (mdgVar.E7()) {
                    mdgVar.e.y5(iagVar);
                }
                return s3q0.a;
            case 12:
                Set set3 = (Set) obj2;
                cbg cbgVar = (cbg) obj;
                if (!epx.f(cbgVar, (cbg) obj3) && set3.contains(Integer.valueOf(((NewsComment) cbgVar.a).i))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                final com.vk.profile.community.impl.ui.profile.f fVar2 = (com.vk.profile.community.impl.ui.profile.f) obj2;
                final boolean booleanValue = ((Boolean) obj).booleanValue();
                CommunityProfileViewState.Data.a a2 = ((CommunityProfileViewState.Data) obj3).d.a();
                final long j = (a2 == null || (extendedCommunityProfile = a2.a) == null || (userProfile = extendedCommunityProfile.a) == null || (userId = userProfile.c) == null) ? 0L : userId.b;
                ComposeView composeView = fVar2.p;
                composeView.setContent(new jai(825899565, new wzs() { // from class: xsna.dvh
                    @Override // xsna.wzs
                    public final Object invoke(Object obj4, Object obj5) {
                        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
                        int intValue = ((Integer) obj5).intValue();
                        if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(825899565, intValue, -1, "com.vk.profile.community.impl.ui.profile.CommunityProfileView.bindErrorState.<anonymous> (CommunityProfileView.kt:353)");
                            }
                            if (booleanValue) {
                                aVar.K(-1493613609);
                                UiTracker uiTracker = UiTracker.a;
                                MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                                SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, null, null, null, null, null, 62, null);
                                String valueOf2 = String.valueOf(System.currentTimeMillis());
                                String valueOf3 = String.valueOf(System.currentTimeMillis());
                                final long j2 = j;
                                new bvt0(c2, SchemeStat$TypeView.a.b(schemeStat$EventItem, valueOf2, valueOf3, null, new CommonCommunitiesStat$TypeCommunityScreenLoadErrorView(j2), 8)).q();
                                AggregateEventBuilder aggregateEventBuilder = new AggregateEventBuilder(AggregateEventKey.COMMUNITY_SCREEN_NETWORK_ERROR);
                                aggregateEventBuilder.w(0, "type_community_screen_load_error_view");
                                aggregateEventBuilder.w(1, String.valueOf(j2));
                                aggregateEventBuilder.q();
                                final com.vk.profile.community.impl.ui.profile.f fVar3 = fVar2;
                                rrv0.d(null, null, null, null, kai.c(-876843539, new wzs() { // from class: xsna.evh
                                    @Override // xsna.wzs
                                    public final Object invoke(Object obj6, Object obj7) {
                                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj6;
                                        int intValue2 = ((Integer) obj7).intValue();
                                        if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(-876843539, intValue2, -1, "com.vk.profile.community.impl.ui.profile.CommunityProfileView.bindErrorState.<anonymous>.<anonymous> (CommunityProfileView.kt:370)");
                                            }
                                            final long j3 = j2;
                                            boolean p = aVar2.p(j3);
                                            final com.vk.profile.community.impl.ui.profile.f fVar4 = fVar3;
                                            boolean y = p | aVar2.y(fVar4);
                                            Object x = aVar2.x();
                                            if (y || x == a.C0011a.a) {
                                                x = new gzs() { // from class: xsna.bvh
                                                    @Override // xsna.gzs
                                                    public final Object invoke() {
                                                        UiTracker uiTracker2 = UiTracker.a;
                                                        MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
                                                        SchemeStat$EventItem schemeStat$EventItem2 = new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, null, null, null, null, null, 62, null);
                                                        long j4 = j3;
                                                        new bjc(c3, SchemeStat$TypeClick.a.b(schemeStat$EventItem2, new CommonCommunitiesStat$TypeCommunityScreenLoadRetryClick(j4), 2)).q();
                                                        AggregateEventBuilder aggregateEventBuilder2 = new AggregateEventBuilder(AggregateEventKey.COMMUNITY_SCREEN_NETWORK_ERROR);
                                                        aggregateEventBuilder2.w(0, "type_community_screen_load_retry_click");
                                                        aggregateEventBuilder2.w(1, String.valueOf(j4));
                                                        aggregateEventBuilder2.q();
                                                        fVar4.d.a(CommunityProfileAction.i.b);
                                                        return s3q0.a;
                                                    }
                                                };
                                                aVar2.R(x);
                                            }
                                            ldv0.b(null, false, null, (gzs) x, aVar2, 0, 7);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                        } else {
                                            aVar2.h();
                                        }
                                        return s3q0.a;
                                    }
                                }, aVar), aVar, 24576, 15);
                            } else {
                                aVar.K(-1511525099);
                            }
                            aVar.j();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar.h();
                        }
                        return s3q0.a;
                    }
                }, true));
                awt0.u(composeView, booleanValue);
                awt0.u(fVar2.o, !booleanValue);
                return s3q0.a;
            case 14:
                ryh ryhVar = (ryh) obj3;
                kyh.h hVar = (kyh.h) obj2;
                u60 u60Var = (u60) obj;
                if (u60Var instanceof ReplyAction) {
                    int ordinal = ((ReplyAction) u60Var).ordinal();
                    int i9 = hVar.a;
                    int i10 = hVar.b;
                    a0i<zzh> a0iVar = ryhVar.b;
                    if (ordinal == ReplyAction.REPLY_ACTION_REPLY.ordinal()) {
                        a0iVar.c(new cxh(i9, i10));
                    } else if (ordinal == ReplyAction.REPLY_ACTION_COPY_TEXT.ordinal()) {
                        a0iVar.c(new zwh(i9, i10));
                    } else if (ordinal == ReplyAction.REPLY_ACTION_DELETE.ordinal()) {
                        a0iVar.c(new axh(i9, i10));
                    } else if (ordinal == ReplyAction.REPLY_ACTION_EDIT.ordinal()) {
                        a0iVar.c(new bxh(i9, i10));
                    }
                }
                return s3q0.a;
            case 15:
                asm asmVar = (asm) obj3;
                DialogExt dialogExt = (DialogExt) obj2;
                io.reactivex.rxjava3.internal.operators.single.j jVar = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(asmVar.b.E(asmVar, new kj30(dialogExt.f, ((List) obj).contains(u8m.o0.b), false, false, asmVar.i, 44)), new is1(new eaa(10, asmVar, dialogExt), 22)), new sbb(asmVar, i3));
                int i11 = kwg0.a;
                asmVar.h.b(jVar.subscribe(new iwg0(), new t00(new md(25), i2)));
                return s3q0.a;
            case 16:
                q7r q7rVar = (q7r) obj3;
                izs izsVar = (izs) obj2;
                mkm0 mkm0Var = q7rVar.k0;
                mkm0Var.removeView(q7rVar.q0);
                mkm0Var.addView((View) obj);
                q7rVar.d();
                q7rVar.c0 = true;
                if (izsVar != null) {
                    izsVar.invoke(null);
                }
                return null;
            case 17:
                m1s m1sVar = (m1s) obj3;
                v1s v1sVar = (v1s) obj;
                p1s.c cVar = (p1s.c) ((p1s) obj2);
                xyr xyrVar = cVar.b;
                if (xyrVar.getId() == -1) {
                    ListBuilder e = e43.e();
                    e.add(wzr.c.a);
                    if (com.vk.toggle.b.A.a(ImFeatures.READ_ALL_IN_ALL) && m1s.u(xyrVar)) {
                        e.add(new wzr.f(xyrVar));
                    }
                    g = e.g();
                } else if (xyrVar.getType() == FolderType.CHANNELS) {
                    ListBuilder e2 = e43.e();
                    e2.add(new wzr.b(xyrVar));
                    ImFeatures imFeatures = ImFeatures.CHANNELS_IN_ALL_FOLDER;
                    imFeatures.getClass();
                    com.vk.toggle.b bVar2 = com.vk.toggle.b.A;
                    if (!bVar2.a(imFeatures)) {
                        e2.add(new wzr.e(xyrVar));
                    }
                    if (bVar2.a(ImFeatures.READ_ALL_IN_ALL) && m1s.u(xyrVar)) {
                        e2.add(new wzr.f(xyrVar));
                    }
                    g = e2.g();
                } else {
                    ListBuilder e3 = e43.e();
                    e3.add(new wzr.b(xyrVar));
                    if (com.vk.toggle.b.A.a(ImFeatures.READ_ALL_IN_ALL) && xyrVar.getType() != FolderType.MANAGED_GROUPS && m1s.u(xyrVar)) {
                        e3.add(new wzr.f(xyrVar));
                    }
                    e3.add(new wzr.e(xyrVar));
                    g = e3.g();
                }
                m1sVar.n(new u1s.f(g, cVar.b, v1sVar.d));
                return s3q0.a;
            case 18:
                GroupInviteVh groupInviteVh = (GroupInviteVh) obj2;
                h03.b((Throwable) obj);
                UserId userId2 = ((Group) obj3).c;
                Group group = groupInviteVh.j;
                if (epx.f(userId2, group != null ? group.c : null)) {
                    groupInviteVh.b();
                }
                return s3q0.a;
            case 19:
                d1v d1vVar = (d1v) obj3;
                HealthCommonVkstartSyncBackgroundConfigDto healthCommonVkstartSyncBackgroundConfigDto = (HealthCommonVkstartSyncBackgroundConfigDto) obj2;
                iyu0 iyu0Var = (iyu0) obj;
                if (jyu0.e(iyu0Var) || jyu0.f(iyu0Var)) {
                    f2w0 f2w0Var = d1vVar.b;
                    if (!healthCommonVkstartSyncBackgroundConfigDto.e() || (d = healthCommonVkstartSyncBackgroundConfigDto.d()) == null || d.isEmpty()) {
                        f2w0Var.a();
                    } else {
                        List<String> d2 = healthCommonVkstartSyncBackgroundConfigDto.d();
                        if (d2 != null) {
                            f2w0Var.c(f870.B(d2, ";", null));
                        }
                    }
                }
                return s3q0.a;
            case 20:
                ((izs) obj3).invoke((String) obj);
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj2).element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 21:
                igy igyVar = (igy) obj3;
                a.InterfaceC1801a interfaceC1801a = ((com.vk.stickers.keyboard.navigation.c) obj2).l;
                switch (c.a.$EnumSwitchMapping$0[igyVar.b.ordinal()]) {
                    case 1:
                        interfaceC1801a.a(-1);
                        break;
                    case 2:
                        interfaceC1801a.a(-3);
                        break;
                    case 3:
                        interfaceC1801a.a(-4);
                        break;
                    case 4:
                        interfaceC1801a.b(igyVar.b);
                        break;
                    case 5:
                        interfaceC1801a.a(-5);
                        break;
                    case 6:
                        interfaceC1801a.a(-6);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 22:
                ((d9j) obj3).invoke((PrivacySetting) obj);
                ((doz) obj2).i = true;
                return s3q0.a;
            case 23:
                sfc sfcVar = (sfc) obj;
                sfc.a(sfcVar, "key", ((KSerializer) obj3).getDescriptor());
                sfc.a(sfcVar, "value", ((KSerializer) obj2).getDescriptor());
                return s3q0.a;
            case 24:
                int i12 = MsgViewFragment.i0;
                ((MsgViewFragment) obj3).io((MsgFromUser) obj, (DialogExt) obj2);
                return s3q0.a;
            case 25:
                qd40 qd40Var = (qd40) obj2;
                hda hdaVar = (hda) obj;
                if (((String) obj3) == null) {
                    w2a w2aVar = qd40Var.U;
                    if (w2aVar != null) {
                        w2aVar.b(hdaVar);
                    }
                } else {
                    qd40Var.W.set(true);
                }
                return s3q0.a;
            case 26:
                fsv fsvVar = (fsv) obj2;
                View view = (View) obj;
                T t = ((ow2) obj3).l;
                if (t != 0) {
                    fsvVar.Ig(view.getId(), t);
                }
                return s3q0.a;
            case 27:
                List list = (List) obj3;
                ((nvy) obj).e(list.size(), new kg70(new aki((byte) 0, 6), list), new lg70(list), new jai(2039820996, new mg70(list, (izs) obj2), true));
                return s3q0.a;
            case 28:
                ((bp90) obj3).t.a(new mp90.b.a.C3365b(((xo90.a.b) ((xo90.a) obj2)).a));
                return s3q0.a;
            default:
                jhc0 jhc0Var = (jhc0) obj2;
                if (!((PostingMoreMenuMainButtonView) obj3).v) {
                    qdc0 qdc0Var = jhc0Var.t;
                    if (qdc0Var != null) {
                        qdc0Var.i1();
                    }
                    gzs<s3q0> gzsVar = jhc0Var.u;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ s53(vjk vjkVar, y97 y97Var, SharedPreferences sharedPreferences) {
        this.b = 2;
        this.c = vjkVar;
        this.d = sharedPreferences;
    }

    public /* synthetic */ s53(eml emlVar, pdo pdoVar, io.reactivex.rxjava3.core.y yVar) {
        this.b = 9;
        this.c = pdoVar;
        this.d = yVar;
    }
}
