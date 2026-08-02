package xsna;

import android.content.Context;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.api.generated.podcasts.dto.PodcastsBlockPodcastDto;
import com.vk.api.generated.podcasts.dto.PodcastsGetPodcastResponseDto;
import com.vk.api.generated.wall.dto.WallActionButtonTypeDto;
import com.vk.api.generated.wall.dto.WallAttachmentsActionButtonDto;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsSuggestsVh;
import com.vk.channels.impl.monetization.presentation.ChannelMonetizationFragment;
import com.vk.clips.design.view.camera.controls.ClipsControlsView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.music.Thumb;
import com.vk.dto.notifications.NotificationItem;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.podcast.Podcast;
import com.vk.dto.podcast.PodcastInfo;
import com.vk.dto.stories.model.web.StoryBoxPrepared;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.internal.storage.delegates.channel_messages.ChannelMessageHistoryMetaColumn;
import com.vk.log.L;
import com.vk.movika.impl.onboarding.InteractiveOnboardingModalBottomSheet;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixCategory;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState;
import com.vk.newsfeed.posting.impl.domain.model.PostingHints;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.pushes.receivers.c;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.core.view.TargetSendActionView;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.viewer.impl.presentation.ideas.ui.IdeasStoryAvatarView;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.common.js.bridge.api.events.AccelerometerChanged$Response;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.efc0;
import xsna.gm50;
import xsna.hgj;
import xsna.hxe;
import xsna.l4b;
import xsna.ln50;
import xsna.rye;
import xsna.saj;
import xsna.upb;
import xsna.vwb;
import xsna.znc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class rm0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rm0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x02c2, code lost:
    
        if (r2 != r10) goto L113;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v33, types: [xsna.bj70, xsna.iwu] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ChannelMessageHistoryMetaColumn[] channelMessageHistoryMetaColumnArr;
        ChannelMessageHistoryMetaColumn[] channelMessageHistoryMetaColumnArr2;
        HintId hintId;
        Hint p;
        WallActionButtonTypeDto wallActionButtonTypeDto;
        WallAttachmentsActionButtonDto wallAttachmentsActionButtonDto;
        wzs<? super StoryBoxPrepared, ? super Throwable, s3q0> wzsVar;
        int i = this.b;
        int i2 = 3;
        int i3 = 1;
        int i4 = 0;
        vqt vqtVar = null;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ym0 ym0Var = (ym0) obj3;
                TextView textView = (TextView) obj2;
                String str = (String) obj;
                int i5 = ym0.k1;
                if (str.length() == 0 || str.length() > 50) {
                    bwt0.p0(textView, false);
                    return io.reactivex.rxjava3.core.x.k(Boolean.FALSE);
                }
                if (ym0Var.i1.matcher(str).matches()) {
                    com.vk.voip.ui.c.b.getClass();
                    return new io.reactivex.rxjava3.internal.operators.single.d0(new io.reactivex.rxjava3.internal.operators.single.o(com.vk.voip.ui.c.B0.l().K().l(new bl(new xm0(str, ym0Var), i3)), new um0(new jy(textView, i3), i4)), new pm0(i4), null);
                }
                bwt0.p0(textView, true);
                textView.setText(R.string.voip_session_room_admin_room_error_wrong_name);
                return io.reactivex.rxjava3.core.x.k(Boolean.FALSE);
            case 1:
                Collection<yj30> collection = (Collection) obj2;
                ChannelMessageHistoryMetaColumn.a aVar = ChannelMessageHistoryMetaColumn.Companion;
                String str2 = ((com.vk.im.engine.internal.storage.delegates.channel_messages.a) obj3).a.a;
                aVar.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("REPLACE INTO " + str2 + " (");
                channelMessageHistoryMetaColumnArr = ChannelMessageHistoryMetaColumn.allColumns;
                sb.append(rl3.Z(channelMessageHistoryMetaColumnArr, null, null, null, new qm0(7), 31));
                sb.append(") VALUES (");
                uki0 f = dli0.f(new ig(i2));
                channelMessageHistoryMetaColumnArr2 = ChannelMessageHistoryMetaColumn.allColumns;
                sb.append(rli0.r(rli0.y(f, channelMessageHistoryMetaColumnArr2.length), null, null, 63));
                sb.append(')');
                SQLiteStatement compileStatement = ((e0w) obj).compileStatement(sb.toString());
                try {
                    for (yj30 yj30Var : collection) {
                        compileStatement.bindLong(ChannelMessageHistoryMetaColumn.CHANNEL_ID.ordinal() + 1, yj30Var.a);
                        rdi.i(compileStatement, ChannelMessageHistoryMetaColumn.SERVER_IS_EMPTY_VALUE.ordinal() + 1, yj30Var.b);
                        compileStatement.bindLong(ChannelMessageHistoryMetaColumn.SERVER_IS_EMPTY_PHASE.ordinal() + 1, yj30Var.c);
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
            case 2:
                int i6 = ChannelMonetizationFragment.T;
                gm50.a.a((ChannelMonetizationFragment) obj3, ((l4b.a) obj).a, new a4b(1, (k4b) obj2, k4b.class, "accept", "accept(Lcom/vk/channels/impl/monetization/presentation/ui/state/ChannelMonetizationViewState$Data$Content;)V", 0));
                return s3q0.a;
            case 3:
                ((upb.a) obj3).l.h((vwb.b) obj2);
                return s3q0.a;
            case 4:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, ((znc.a) obj3).b);
                qgi0.q(tgi0Var, (String) obj2);
                return s3q0.a;
            case 5:
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = (MobileOfficialAppsCoreNavStat$EventScreen) obj2;
                kid presenter = ((pid) obj3).getPresenter();
                if (presenter != null) {
                    presenter.b(mobileOfficialAppsCoreNavStat$EventScreen);
                }
                return s3q0.a;
            case 6:
                ClipsControlsView.a aVar2 = (ClipsControlsView.a) obj2;
                int i7 = ClipsControlsView.P;
                if (((VkImage) obj3).isClickable()) {
                    if (aVar2.e().equals(Boolean.TRUE)) {
                        aVar2.k();
                    } else {
                        aVar2.g();
                    }
                }
                return s3q0.a;
            case 7:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                ((kp5) obj3).invoke((hxe.a) obj);
                VkContextMenu vkContextMenu = (VkContextMenu) ref$ObjectRef.element;
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
                ref$ObjectRef.element = null;
                return s3q0.a;
            case 8:
                return new g960(((LayoutInflater) obj3).inflate(R.layout.vkim_contacts_new_users_vh, (ViewGroup) obj, false), (saj.a) obj2);
            case 9:
                ((izs) obj3).invoke(((hgj.b) obj2).m);
                return s3q0.a;
            case 10:
                vqt vqtVar2 = (vqt) obj;
                try {
                    ((ocl) obj3).t((List) obj2, vqtVar2);
                    vqtVar = vqtVar2;
                } catch (Throwable unused) {
                }
                return vqtVar == null ? vqtVar2 : vqtVar;
            case 11:
                m6r m6rVar = (m6r) obj3;
                PostingState postingState = (PostingState) obj2;
                Map map = (Map) obj;
                efc0.a aVar3 = m6rVar.a;
                h7v h7vVar = m6rVar.f;
                aVar3.a(new e.a.g(map));
                if (!p4g.h(map).isEmpty()) {
                    if (postingState.x().g == null || (hintId = HintId.FEED_POSTING_ACTIONS_PROFILE) == null) {
                        hintId = HintId.FEED_POSTING_ACTIONS_COMMUNITY;
                    }
                    if (h7vVar.m(hintId)) {
                        PostingState.Editing editing = (PostingState.Editing) postingState;
                        PostingHints postingHints = editing.o;
                        if (postingHints.c == null && postingHints.d == null) {
                            List<ActionButton> list = editing.d.i;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        WallActionButtonTypeDto f2 = ((ActionButton) it.next()).b.f();
                                        WallActionButtonTypeDto wallActionButtonTypeDto2 = WallActionButtonTypeDto.OPEN_MARKET;
                                        if (f2 == wallActionButtonTypeDto2) {
                                            ActionButton actionButton = editing.i.t;
                                            if (actionButton != null && (wallAttachmentsActionButtonDto = actionButton.b) != null) {
                                                wallActionButtonTypeDto = wallAttachmentsActionButtonDto.f();
                                                break;
                                            } else {
                                                wallActionButtonTypeDto = null;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    hintId = null;
                    m6rVar.a.a(new e.a.k(PostingHints.a(((PostingState.Editing) postingState).o, (hintId == null || (p = h7vVar.p(hintId.getId())) == null) ? null : p.d, null, false, 1015)));
                }
                return s3q0.a;
            case 12:
                ((UIBlockProfile) obj3).E = 2;
                ((FriendsSuggestsVh) obj2).h(FriendsSuggestsVh.b.SUGGEST_HIDDEN, false);
                return s3q0.a;
            case 13:
                lsv lsvVar = (lsv) obj3;
                StoryBoxPrepared storyBoxPrepared = (StoryBoxPrepared) obj2;
                Throwable th3 = (Throwable) obj;
                L.C("ideas: render failed", th3);
                if (lsvVar.h == storyBoxPrepared) {
                    lsvVar.h = null;
                }
                ca6 ca6Var = lsvVar.f;
                if (ca6Var != null && (wzsVar = ((IdeasStoryAvatarView) ca6Var.c).f) != null) {
                    wzsVar.invoke(storyBoxPrepared, th3);
                }
                return s3q0.a;
            case 14:
                InteractiveOnboardingModalBottomSheet interactiveOnboardingModalBottomSheet = (InteractiveOnboardingModalBottomSheet) obj3;
                b33 b33Var = (b33) obj2;
                interactiveOnboardingModalBottomSheet.m1 = true;
                InteractiveOnboardingModalBottomSheet.b bVar = interactiveOnboardingModalBottomSheet.l1;
                if (bVar != null) {
                    bVar.onClose();
                }
                b33Var.dismiss();
                return s3q0.a;
            case 15:
                String str3 = (String) obj2;
                vkr0 vkr0Var = (vkr0) obj;
                ((c1y) obj3).b.a.n(new JsMethod("VKWebAppAccelerometerChanged"), new AccelerometerChanged$Response(null, new AccelerometerChanged$Response.Data(-vkr0Var.a, -vkr0Var.c, -vkr0Var.b, str3), str3, 1, null));
                return s3q0.a;
            case 16:
                Uri uri = (Uri) obj3;
                Context context = (Context) obj2;
                MediaMetadataRetriever mediaMetadataRetriever = (MediaMetadataRetriever) obj;
                if (epx.f(uri.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)) {
                    mediaMetadataRetriever.setDataSource(context, uri);
                } else {
                    String path = uri.getPath();
                    if (path == null) {
                        return s3q0.a;
                    }
                    mediaMetadataRetriever.setDataSource(path);
                }
                return s3q0.a;
            case 17:
                AttachGift attachGift = (AttachGift) obj2;
                pk30 pk30Var = ((wq30) obj3).u;
                if (pk30Var != null) {
                    pk30Var.Z(attachGift);
                }
                return s3q0.a;
            case 18:
                PodcastInfo podcastInfo = (PodcastInfo) obj3;
                UserId userId = (UserId) obj2;
                PodcastsBlockPodcastDto d = ((PodcastsGetPodcastResponseDto) obj).d();
                int i8 = podcastInfo.n;
                Thumb thumb = podcastInfo.h;
                List singletonList = thumb != null ? Collections.singletonList(thumb) : null;
                return new Podcast(i8, userId, d.getTitle(), i8, singletonList != null ? new ArrayList(singletonList) : null, null, false, d.d(), null, d.h1(), d.U(), null, false);
            case 19:
                c.a aVar4 = com.vk.pushes.receivers.c.b;
                c.a.f((Context) obj3, (Intent) obj2, true);
                return s3q0.a;
            case 20:
                li70 li70Var = (li70) obj3;
                Context context2 = (Context) obj2;
                c970 c970Var = li70Var.N;
                if (c970Var != 0) {
                    NotificationItem notificationItem = li70Var.c;
                    c970Var.c(context2, li70Var, notificationItem != null ? notificationItem.l : null, notificationItem, li70Var.b);
                }
                li70Var.d("cell");
                return s3q0.a;
            case 21:
                UserId userId2 = (UserId) obj2;
                el50 el50Var = (el50) obj;
                el50Var.f(el50Var, new rn50("load_episodes"), ln50.a.c, new swe((wu70) obj3, userId2, ((OfflinePodcastEpisodesMviState) el50Var.W().getCurrentState()).f(), el50Var, 4));
                el50Var.f(el50Var, new rn50("download_progress"), ln50.a.a, new c2u(el50Var, 27));
                return s3q0.a;
            case 22:
                ((dn80) obj3).i.remove(((Pair) obj2).i());
                return s3q0.a;
            case 23:
                PhotoAlbum photoAlbum = (PhotoAlbum) obj3;
                f5a0 f5a0Var = (f5a0) obj2;
                VKList vKList = (VKList) obj;
                if (photoAlbum.f != vKList.i()) {
                    photoAlbum.f = vKList.i();
                    ((u4a0) f5a0Var.c).C1(photoAlbum);
                }
                return s3q0.a;
            case 24:
                roc0 roc0Var = new roc0((Context) obj);
                roc0Var.setId(R.id.posting_step2_attachments_view);
                roc0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                roc0Var.setSendAction((izs) obj3);
                roc0Var.setAddPostingSideEffectListener((izs) obj2);
                return roc0Var;
            case 25:
                ((com.vk.newsfeed.impl.presenters.b) obj3).h1((Bundle) obj2, (NewsEntry) obj);
                return s3q0.a;
            case 26:
                rye.b bVar2 = (rye.b) obj3;
                bVar2.b(((gtl) obj2).c, new z4d0(bVar2, 5), false);
                return s3q0.a;
            case 27:
                c1j0 c1j0Var = (c1j0) obj3;
                c1j0Var.m.invoke((String) obj, ((MixCategory) obj2).b, Integer.valueOf(c1j0Var.getLayoutPosition()));
                return s3q0.a;
            case 28:
                com.vk.sharing.core.view.j jVar = (com.vk.sharing.core.view.j) obj3;
                jVar.a();
                jVar.m.b(new a4o0((Target) obj), TargetSendActionView.State.OPEN, (pq9) obj2);
                return s3q0.a;
            default:
                yvj yvjVar = (yvj) obj2;
                gzs gzsVar = (gzs) obj;
                if (obj3 == Thread.currentThread()) {
                    gzsVar.invoke();
                } else {
                    myc0.h(yvjVar, null, null, new smp0(gzsVar, null), 3);
                }
                return s3q0.a;
        }
    }
}
