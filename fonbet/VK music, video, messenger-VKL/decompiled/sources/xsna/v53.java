package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.shared.api.analytics.SdkClipViewerClick;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.ecomm.onlinebooking.impl.edit.a;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.im.engine.internal.storage.delegates.channels.ChannelsCountDb;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.fragment.impl.MusicAddTrackToPlaylistLauncherImpl;
import com.vk.music.playlist.display.audiobook.offline.presentation.feature.OfflineAudioBookChaptersMviState;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.impl.posting.dto.PostCommentNewsEntry;
import com.vk.profile.user.impl.ui.f;
import com.vk.superapp.api.dto.identity.WebIdentityCardData;
import com.vk.toggle.b;
import com.vk.toggle.internal.ToggleManager;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import one.video.view.OneVideoPlayerView;
import ru.ok.android.webrtc.connection.BadNetworkIndicatorConfig;
import ru.ok.android.webrtc.topology.direct.DirectCallTopology;
import xsna.ad80;
import xsna.i940;
import xsna.sum0;
import xsna.t53;
import xsna.tyg;
import xsna.u1s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class v53 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v53(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        WebApiApplication v;
        int i = 1;
        switch (this.b) {
            case 0:
                ((t53.d.a) this.c).itemView.setBackground(vjo.a((Context) this.d, 0, 0, 0, t53.j, (Bitmap) obj, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE));
                return s3q0.a;
            case 1:
                vvr vvrVar = (vvr) this.c;
                vo7 vo7Var = (vo7) this.d;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                vvrVar.y(true);
                ((izs) ((zak0) vo7Var.b).getValue()).invoke(new a.f.b(booleanValue));
                return s3q0.a;
            case 2:
                String str = (String) this.c;
                w89 w89Var = (w89) this.d;
                dz2 x = yfb.x(sg20.q((sg20) obj, str, null, null, 62));
                x.c = true;
                x.h = true;
                return rsg0.w0(x).l(new qs6(new v89(str, w89Var), i));
            case 3:
                ChannelsCountDb channelsCountDb = (ChannelsCountDb) this.c;
                Collection<com.vk.im.engine.models.channels.a> collection = (Collection) this.d;
                SQLiteStatement compileStatement = ((e0w) obj).compileStatement(channelsCountDb.a.e());
                try {
                    for (com.vk.im.engine.models.channels.a aVar : collection) {
                        compileStatement.clearBindings();
                        compileStatement.bindLong(ChannelsCountDb.Column.TYPE.ordinal() + 1, aVar.a.i());
                        compileStatement.bindLong(ChannelsCountDb.Column.COUNT.ordinal() + 1, aVar.b);
                        compileStatement.bindLong(ChannelsCountDb.Column.PHASE_ID.ordinal() + 1, aVar.c);
                        compileStatement.executeInsert();
                    }
                    s3q0 s3q0Var = s3q0.a;
                    compileStatement.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ro.e(compileStatement, th);
                        throw th2;
                    }
                }
            case 4:
                xlb0 xlb0Var = (xlb0) this.c;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.d;
                r3 = ref$BooleanRef.element || ((dot) obj).H1(xlb0Var);
                ref$BooleanRef.element = r3;
                return Boolean.valueOf(!r3);
            case 5:
                pih0 pih0Var = ((o1d) this.c).h;
                SdkClipVideoFile sdkClipVideoFile = (SdkClipVideoFile) this.d;
                pmc pmcVar = (pmc) obj;
                if (pmcVar instanceof c5u) {
                    c5u c5uVar = (c5u) pmcVar;
                    pih0Var.o2(new SdkClipViewerClick.m(sdkClipVideoFile, Long.valueOf(c5uVar.a)));
                    pih0Var.o2(new SdkClipViewerClick.n(sdkClipVideoFile, c5uVar.a, c5uVar.b.b));
                } else if (pmcVar instanceof vrv0) {
                    vrv0 vrv0Var = (vrv0) pmcVar;
                    pih0Var.o2(new SdkClipViewerClick.v(sdkClipVideoFile, vrv0Var.a, vrv0Var.e.a));
                } else {
                    if (!(pmcVar instanceof l20)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SdkActionLink m1 = sdkClipVideoFile.m1();
                    if (m1 != null) {
                        pih0Var.o2(new SdkClipViewerClick.a(sdkClipVideoFile, m1));
                    }
                }
                return s3q0.a;
            case 6:
                OneVideoPlayerView oneVideoPlayerView = (OneVideoPlayerView) this.c;
                e3b0 e3b0Var = (e3b0) this.d;
                oneVideoPlayerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                oneVideoPlayerView.setPlayer(e3b0Var.c.a());
                return oneVideoPlayerView;
            case 7:
                String str2 = (String) this.c;
                yad yadVar = (yad) this.d;
                ((ClipsDraftPersistentStore) obj).getClass();
                ClipsDraftPersistentStore.v(str2);
                ClipsDraftVk k = ClipsDraftPersistentStore.k();
                if (k == null) {
                    return s3q0.a;
                }
                yadVar.invoke(k.b.b);
                return s3q0.a;
            case 8:
                String str3 = (String) this.c;
                izs izsVar = (izs) this.d;
                ClipsDraftPersistentStore.r((ClipsDraftPersistentStore) obj, str3, 6);
                ClipsDraftPersistentStore.s();
                izsVar.invoke(str3);
                return s3q0.a;
            case 9:
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) this.c;
                gzs gzsVar = (gzs) this.d;
                extendedCommunityProfile.d3 = new ExtendedCommunityProfile.e.a((List) obj);
                gzsVar.invoke();
                return s3q0.a;
            case 10:
                nek0 nek0Var = (nek0) this.c;
                vvr vvrVar2 = (vvr) this.d;
                if (((tyg) obj) instanceof tyg.b) {
                    if (nek0Var != null) {
                        nek0Var.hide();
                    }
                    vvrVar2.y(false);
                }
                return s3q0.a;
            case 11:
                return ((DirectCallTopology) this.c).a((BadNetworkIndicatorConfig.DebugLoggingConfig) this.d, (Double) obj);
            case 12:
                a1s a1sVar = (a1s) this.c;
                m1s m1sVar = (m1s) this.d;
                xyr xyrVar = ((v1s) obj).a.get(Integer.valueOf(((z480) a1sVar).b));
                if (xyrVar != null) {
                    m1sVar.n(new u1s.h(R.string.vkim_folder_delete_failed, xyrVar.getName()));
                }
                return s3q0.a;
            case 13:
                VkTopBar vkTopBar = (VkTopBar) this.c;
                String str4 = (String) this.d;
                int i2 = FriendRequestsFragment.d0;
                vkTopBar.setContentDescription(str4);
                return s3q0.a;
            case 14:
                r6y r6yVar = (r6y) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                WebIdentityCardData webIdentityCardData = (WebIdentityCardData) obj;
                fvv0 M = r6yVar.M();
                if (M != null && (v = M.v()) != null) {
                    M.getView().U3(arrayList, webIdentityCardData, v);
                }
                return s3q0.a;
            case 15:
                ((com.vk.stickers.keyboard.navigation.f) this.c).l.a(((StickerStockItem) this.d).b);
                return s3q0.a;
            case 16:
                Throwable th3 = (Throwable) obj;
                if (!((sv9) ((ssw) this.c).c).a((Context) this.d, th3)) {
                    h03.b(th3);
                }
                return s3q0.a;
            case 17:
                MusicAddTrackToPlaylistLauncherImpl musicAddTrackToPlaylistLauncherImpl = (MusicAddTrackToPlaylistLauncherImpl) this.c;
                Activity activity = (Activity) this.d;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"success"});
                }
                musicAddTrackToPlaylistLauncherImpl.d(activity).b();
                return s3q0.a;
            case 18:
                return zi50.b(j5g.u0((ArrayList) this.d, (List) obj), (List) this.c);
            case 19:
                AudioBookChapter audioBookChapter = (AudioBookChapter) this.c;
                ib50 ib50Var = (ib50) this.d;
                OfflineAudioBookChaptersMviState offlineAudioBookChaptersMviState = (OfflineAudioBookChaptersMviState) obj;
                String str5 = audioBookChapter.b;
                DownloadingState downloadingState = ib50Var.a.J;
                DownloadingState downloadingState2 = offlineAudioBookChaptersMviState.u().get(str5);
                if (downloadingState2 != null) {
                    if (((downloadingState2 instanceof DownloadingState.Downloading) && (downloadingState instanceof DownloadingState.Downloading)) ? ((double) Math.abs(((DownloadingState.Downloading) downloadingState2).b - ((DownloadingState.Downloading) downloadingState).b)) < 0.02d : downloadingState2.getClass().equals(downloadingState.getClass())) {
                        r3 = true;
                    }
                }
                return r3 ? offlineAudioBookChaptersMviState : offlineAudioBookChaptersMviState.j(pn00.o(offlineAudioBookChaptersMviState.u(), new Pair(str5, downloadingState)));
            case 20:
                kh80 kh80Var = (kh80) this.c;
                kh80Var.d.invoke(new ad80.a(((xh80) this.d).b.b, kh80Var.e));
                return s3q0.a;
            case 21:
                ikc0 ikc0Var = (ikc0) this.c;
                PostCommentNewsEntry postCommentNewsEntry = (PostCommentNewsEntry) this.d;
                NewsComment newsComment = (NewsComment) obj;
                long j = ikc0Var.u.e;
                if (j > 0) {
                    sec0.a(j);
                }
                ikc0Var.L = true;
                ikc0Var.g.f();
                zeg zegVar = new zeg(postCommentNewsEntry.m, postCommentNewsEntry.n, newsComment);
                ce60.b.getClass();
                p870.f().e(116, zegVar);
                ikc0Var.c.Mf(-1, null);
                return s3q0.a;
            case 22:
                nbm0 nbm0Var = (nbm0) this.c;
                zjm0 zjm0Var = (zjm0) this.d;
                ((ikv0) obj).a();
                nbm0Var.g = null;
                uvl0 uvl0Var = nbm0Var.b;
                if (uvl0Var != null) {
                    uvl0Var.a(zjm0Var.a);
                }
                return s3q0.a;
            case 23:
                izs izsVar2 = (izs) this.c;
                sum0.c cVar = (sum0.c) this.d;
                ((Boolean) obj).getClass();
                izsVar2.invoke(sum0.c.a(cVar, false, null, 0, !cVar.d, 7));
                return s3q0.a;
            case 24:
                Map map = (Map) this.c;
                ToggleManager toggleManager = (ToggleManager) this.d;
                String obj2 = ((b.d) obj).b.toString();
                if (!map.containsKey(obj2)) {
                    toggleManager.h.d(obj2);
                    toggleManager.q.remove(obj2);
                }
                return s3q0.a;
            case 25:
                jmq0 jmq0Var = (jmq0) this.c;
                gj80 gj80Var = (gj80) this.d;
                VKList vKList = (VKList) obj;
                if (vKList.isEmpty()) {
                    jmq0Var.c();
                } else {
                    gj80Var.invoke(new f.e.k1(new xyd0(0, vKList, new izd0(vKList.size(), vKList.j(), vKList.i(), null, 0, new ArrayList(), new fne(jmq0Var, 10)))));
                }
                return s3q0.a;
            case 26:
                ((g0r0) this.c).l.c(((qtd0) this.d).G3());
                return s3q0.a;
            case 27:
                return xh2.c((qpp) ((mtk0) this.c).getValue(), (d5q) ((mtk0) this.d).getValue());
            default:
                ihx0 ihx0Var = (ihx0) this.c;
                String str6 = (String) this.d;
                qfx0.d.getClass();
                qfx0.A0((FragmentImpl) obj, str6, ihx0Var);
                return s3q0.a;
        }
    }

    public /* synthetic */ v53(MusicAddTrackToPlaylistLauncherImpl musicAddTrackToPlaylistLauncherImpl, Activity activity, i940.b bVar) {
        this.b = 17;
        this.c = musicAddTrackToPlaylistLauncherImpl;
        this.d = activity;
    }

    public /* synthetic */ v53(zi50 zi50Var, List list, ArrayList arrayList) {
        this.b = 18;
        this.c = list;
        this.d = arrayList;
    }
}
