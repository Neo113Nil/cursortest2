package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.soloader.MinElf;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.channels.api.ChannelEntryPoint;
import com.vk.common.links.LaunchContext;
import com.vk.core.apps.BuildInfo;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.articles.Article;
import com.vk.dto.articles.ArticleDonut;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachArtist;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachCurator;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.attaches.AttachGraffiti;
import com.vk.dto.attaches.AttachMap;
import com.vk.dto.attaches.AttachMarket;
import com.vk.dto.attaches.AttachUnsupported;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.VideoCanDownload;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.gift.GiftSticker;
import com.vk.dto.common.gift.GiftType;
import com.vk.dto.common.gift.ImageStatus;
import com.vk.dto.common.gift.ImageStatusPack;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.polls.Poll;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stories.model.HighlightStoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.attaches.AMP;
import com.vk.im.engine.models.attaches.AttachArticle;
import com.vk.im.engine.models.attaches.AttachChannelMessage;
import com.vk.im.engine.models.attaches.AttachDonutLink;
import com.vk.im.engine.models.attaches.AttachEvent;
import com.vk.im.engine.models.attaches.AttachHighlight;
import com.vk.im.engine.models.attaches.AttachLink;
import com.vk.im.engine.models.attaches.AttachPlaylist;
import com.vk.im.engine.models.attaches.AttachPodcastEpisode;
import com.vk.im.engine.models.attaches.AttachPoll;
import com.vk.im.engine.models.attaches.AttachRoom;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.attaches.AttachUgcSticker;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.attaches.AttachWallReply;
import com.vk.im.engine.models.attaches.miniapp.AttachMiniApp;
import com.vk.im.engine.models.attaches.miniapp.MiniAppSnippetDataAttach;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.content.PodcastEpisode;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.GroupCallInProgress;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.fragment.impl.MusicArtistCatalogFragment;
import com.vk.music.fragment.impl.MusicCuratorCatalogFragment;
import com.vk.music.playlist.display.presentation.DisplayMusicPlaylistFragment;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import com.vk.permission.PermissionHelper;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.poll.fragments.PollViewerFragment;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stickers.bridge.GiftData;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.superapp.browser.internal.utils.analytics.MiniAppEntryPoint;
import com.vk.toggle.Features;
import com.vk.voip.api.dto.VoipChatInfo;
import com.vk.voip.api.join.JoinData;
import com.vk.voip.stereo.api.common.di.VoipStereoRouterComponent;
import com.vk.voip.stereo.stub.common.di.VoipStereoRouterComponentStub;
import com.vk.voip.ui.VoipViewModelState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.text.Regex;
import xsna.cwb0;
import xsna.jnw0;
import xsna.khw0;
import xsna.o0r0;
import xsna.w2x0;
import xsna.zp80;

/* compiled from: ImContentOpenHelper.kt */
/* loaded from: classes7.dex */
public final class wzv implements w8i {
    public final Context b;

    public wzv(Context context) {
        this.b = context;
    }

    public static void b() {
        com.vk.voip.ui.c.b.getClass();
        if (com.vk.voip.ui.c.K0 != VoipViewModelState.Idle) {
            com.vk.voip.ui.c.U().b(new w2x0.a(false, 7));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(long j) {
        boolean z;
        com.vk.voip.ui.c.b.getClass();
        if (com.vk.voip.ui.c.K0 != VoipViewModelState.Idle) {
            nmw0 V = com.vk.voip.ui.c.V();
            dhw0 L = V.a.L();
            if (L != null) {
                if (L.b == j) {
                    z = true;
                } else {
                    LinkedHashMap linkedHashMap = V.g;
                    V.a.getClass();
                    Set set = (Set) linkedHashMap.get(com.vk.voip.ui.c.T0);
                    if (set != null) {
                        z = set.contains(Long.valueOf(j));
                    }
                }
                if (!z) {
                    return true;
                }
            }
            z = false;
            if (!z) {
            }
        }
        return false;
    }

    public static void d(JoinData joinData, VoipCallSource voipCallSource, boolean z, boolean z2) {
        com.vk.common.links.c.g0(joinData, voipCallSource, z, z2, null, null, 48);
    }

    public static void e(wt2 wt2Var, VoipCallSource voipCallSource, boolean z, boolean z2) {
        Regex regex = com.vk.common.links.c.a;
        a201.b().a().d(new khw0.a(jnw0.b(wt2Var, z, z2), voipCallSource, null, null, null, 28));
    }

    public static void f(JoinData joinData, VoipCallSource voipCallSource, boolean z, boolean z2, UserId userId) {
        com.vk.common.links.c.g0(joinData, voipCallSource, z, z2, userId, null, 32);
    }

    public static void g(JoinData joinData, VoipCallSource voipCallSource, boolean z, boolean z2, esa esaVar) {
        com.vk.common.links.c.g0(joinData, voipCallSource, z, z2, null, esaVar, 16);
    }

    public static void i(DialogExt dialogExt, VoipCallSource voipCallSource, boolean z, LinkedHashSet linkedHashSet) {
        zqk0 c;
        GroupCallInProgress Ob;
        ChatSettings Hb;
        ImageList imageList;
        Regex regex = com.vk.common.links.c.a;
        ProfilesInfo profilesInfo = dialogExt.b;
        if (jnw0.a.$EnumSwitchMapping$0[dialogExt.h.ordinal()] == 1) {
            List<qtd0> Mb = profilesInfo.Ob().Mb();
            el3 el3Var = new el3(0);
            Iterator it = ((ArrayList) Mb).iterator();
            while (it.hasNext()) {
                el3Var.add(String.valueOf(((qtd0) it.next()).r8()));
            }
            long j = dialogExt.e;
            String title = dialogExt.getTitle();
            Dialog Cb = dialogExt.Cb();
            Boolean bool = null;
            String Db = (Cb == null || (Hb = Cb.Hb()) == null || (imageList = Hb.c) == null) ? null : imageList.Db();
            String str = Db == null ? "" : Db;
            Dialog Cb2 = dialogExt.Cb();
            if (Cb2 != null && (Ob = Cb2.Ob()) != null) {
                bool = Boolean.valueOf(Ob.e);
            }
            VoipChatInfo voipChatInfo = new VoipChatInfo(j, title, str, bool, null, null, 48, null);
            long j2 = dialogExt.e;
            Dialog Cb3 = dialogExt.Cb();
            int Jb = Cb3 != null ? Cb3.Jb() : 0;
            String str2 = voipChatInfo.c;
            c = new zqk0(null, j2, str2, str2, voipChatInfo.d, false, false, el3Var, true, null, null, voipChatInfo, null, Jb, false, null, null, null, z, true, false, 2534912);
        } else {
            c = jnw0.c(profilesInfo.Cb(Long.valueOf(dialogExt.e)), false);
        }
        a201.b().a().d(new khw0.a(c, voipCallSource, null, "", linkedHashSet));
    }

    public static void j(VoipCallSource voipCallSource, LinkedHashSet linkedHashSet) {
        com.vk.common.links.c.f0(voipCallSource, linkedHashSet, null, false, 20);
    }

    public static void k(Contact contact, VoipCallSource voipCallSource) {
        String str;
        Regex regex = com.vk.common.links.c.a;
        String str2 = contact.p;
        if (str2 == null) {
            return;
        }
        khw0 a = a201.b().a();
        String I9 = contact.I9(UserNameCase.NOM);
        String str3 = contact.c;
        Image Ab = contact.h.Ab();
        if (Ab == null || (str = Ab.d) == null) {
            str = "";
        }
        a.d(new khw0.a(new zqk0(null, 0L, I9, str3, str, false, false, EmptySet.b, false, null, null, null, new xmw0(str2, (int) contact.b), 0, false, null, null, null, false, false, false, 3661313), voipCallSource, null, null, null, 28));
    }

    public static void r(wzv wzvVar, String str, String str2, int i) {
        String str3 = (i & 4) != 0 ? null : str2;
        xwk.d().e().l(wzvVar.b, str, new LaunchContext(false, false, false, "im", "im", null, null, null, str, str3, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67107047), null, zp80.a(wzvVar.b, str));
    }

    public final void a(String str, String str2) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        boolean z = BuildInfo.t() && com.vk.toggle.b.A.a(Features.Type.FEATURE_IM_ME_OPEN_APK_AS_APK);
        Context context = this.b;
        if (scheme == null || !(scheme.equals("http") || scheme.equals(HttpRequest.DEFAULT_SCHEME))) {
            if (vao.e(str)) {
                vao.h(context, str, !z);
                return;
            } else {
                vao.g(context, str);
                return;
            }
        }
        if (vao.j(context, parse, !z)) {
            return;
        }
        s9j s9jVar = new s9j(this, str2, str, 1);
        if (gz80.a(34)) {
            s9jVar.invoke();
            return;
        }
        PermissionHelper permissionHelper = PermissionHelper.a;
        permissionHelper.getClass();
        permissionHelper.d(this.b, PermissionHelper.e, R.string.vkim_permissions_storage, R.string.vkim_permissions_storage, s9jVar, null);
    }

    public final void h(VoipCallSource voipCallSource, UserId userId, boolean z) {
        com.vk.common.links.c.e0(this.b, userId, voipCallSource, z, null, 96);
    }

    public final void l(Attach attach, Boolean bool, long j) {
        g2v.d().a().o(this.b, attach, bool, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r40v0, types: [com.vk.im.engine.models.messages.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [xsna.zcl] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Integer] */
    public final void m(com.vk.im.engine.models.messages.a aVar, Attach attach, Long l, boolean z) {
        Action action;
        String str;
        String str2;
        PostDonut.Placeholder placeholder;
        LinkButton linkButton;
        String str3;
        String str4;
        ArticleDonut.Placeholder placeholder2;
        LinkButton linkButton2;
        if (attach == null || (attach instanceof AttachAudio) || (attach instanceof AttachAudioMsg) || (attach instanceof AttachGraffiti)) {
            return;
        }
        if (attach instanceof AttachStory) {
            AttachStory attachStory = (AttachStory) attach;
            StoryEntry storyEntry = attachStory.b;
            if (storyEntry.c == 0 || !fkq0.c(storyEntry.d)) {
                return;
            }
            StoryViewerRouter.e(((StoryViewerComponent) ((k7m) m7m.f(this)).a(fpf0.a(StoryViewerComponent.class))).tb(), this.b, attachStory.b, null, null, 28);
            return;
        }
        int i = 0;
        r8 = null;
        r8 = null;
        Action action2 = null;
        r8 = null;
        r8 = null;
        Action action3 = null;
        if (attach instanceof AttachVideo) {
            VideoFile videoFile = ((AttachVideo) attach).b;
            VideoFileOld videoFileOld = videoFile;
            if (!z) {
                VideoFileOld copy = videoFile.copy();
                copy.b2(VideoCanDownload.NO);
                copy.Z = false;
                copy.J = false;
                copy.H = false;
                copy.I = false;
                copy.C = false;
                copy.B = false;
                videoFileOld = copy;
            }
            fxc0.B().Y().k(this.b, videoFileOld, (r43 & 4) != 0 ? null : "im", (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : l != null ? l.toString() : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
            return;
        }
        boolean z2 = attach instanceof AttachArticle;
        Context context = this.b;
        if (z2) {
            AttachArticle attachArticle = (AttachArticle) attach;
            if ("available".equals(attachArticle.f) && fkq0.c(attachArticle.d)) {
                bu00.s(context, wdw.a(attachArticle), null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return;
            }
            if ("paid".equals(attachArticle.f)) {
                ArticleDonut articleDonut = attachArticle.r;
                if ((articleDonut != null ? articleDonut.c : null) != null) {
                    if (articleDonut != null && (placeholder2 = articleDonut.c) != null && (linkButton2 = placeholder2.d) != null) {
                        action2 = linkButton2.c;
                    }
                    com.vk.extensions.a.b(action2, this.b, null, null, null, null, null, null, null, 254);
                    return;
                }
            }
            if (attachArticle.j.length() == 0) {
                return;
            }
            p(attachArticle.j);
            return;
        }
        boolean z3 = attach instanceof AttachMap;
        Context context2 = this.b;
        if (z3) {
            AttachMap attachMap = (AttachMap) attach;
            try {
                context2.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(String.format(Locale.US, drm0.N(attachMap.g) ? "geo:%f,%f?z=%d" : "geo:%f,%f?z=%d(%s)", Arrays.copyOf(new Object[]{Double.valueOf(attachMap.e), Double.valueOf(attachMap.f), 18, attachMap.g}, 4)))));
                return;
            } catch (Throwable unused) {
                if (context2 instanceof Activity) {
                    tn00.a((Activity) context2);
                    return;
                }
                return;
            }
        }
        int i2 = 1;
        if (attach instanceof AttachLink) {
            AttachLink attachLink = (AttachLink) attach;
            Article article = attachLink.v;
            AMP amp = attachLink.u;
            if (article != null) {
                bu00.s(context, Article.a(article, new Owner(article.c, "", "", null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194288, null), 1048511), null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return;
            }
            if (amp == null) {
                r(this, attachLink.e, null, 4);
                return;
            }
            UserId userId = UserId.d;
            String str5 = attachLink.f;
            String str6 = attachLink.e;
            Article article2 = attachLink.v;
            if (article2 == null || !article2.g() || article2.d()) {
                AMP amp2 = attachLink.u;
                if (amp2 != null) {
                    str3 = amp2.b;
                    str4 = str3;
                }
                str4 = null;
            } else {
                Article article3 = attachLink.v;
                if (article3 != null) {
                    str3 = article3.j;
                    str4 = str3;
                }
                str4 = null;
            }
            int i3 = amp.c;
            boolean z4 = amp.d;
            Article article4 = attachLink.v;
            bu00.s(context2, new Article(0, userId, "", 0L, str5, "", null, str6, str4, "available", null, i3, z4, true, false, null, null, null, 0, article4 != null && article4.u, 65536, null), null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            return;
        }
        if (attach instanceof AttachWall) {
            AttachWall attachWall = (AttachWall) attach;
            PostDonut postDonut = attachWall.s;
            if (postDonut != null && (placeholder = postDonut.c) != null && (linkButton = placeholder.c) != null) {
                action3 = linkButton.c;
            }
            Action action4 = action3;
            AttachWall.TextLive textLive = attachWall.t;
            if ((aVar == 0 || !aVar.db()) && action4 != null) {
                com.vk.extensions.a.b(action4, this.b, null, null, null, null, null, null, null, 254);
                return;
            }
            if (textLive != null) {
                p(textLive.c);
                return;
            }
            r6m.a.getClass();
            if (!r6m.j()) {
                cvk.u(ru.mail.libverify.R.string.network_error_description, false);
            }
            ((NewsfeedRouterComponent) ((k7m) m7m.f(this)).a(fpf0.a(NewsfeedRouterComponent.class))).l0().H(this.b, attachWall.d, attachWall.e, attachWall.n, null, new zp80.a());
            return;
        }
        if (attach instanceof AttachWallReply) {
            AttachWallReply attachWallReply = (AttachWallReply) attach;
            r6m.a.getClass();
            if (!r6m.j()) {
                cvk.u(ru.mail.libverify.R.string.network_error_description, false);
            }
            zp80.a aVar2 = new zp80.a();
            int i4 = attachWallReply.f;
            if (i4 == 0) {
                ((NewsfeedRouterComponent) ((k7m) m7m.f(this)).a(fpf0.a(NewsfeedRouterComponent.class))).l0().H(this.b, attachWallReply.d, attachWallReply.g, attachWallReply.k, Integer.valueOf(attachWallReply.e), aVar2);
                return;
            } else {
                hc60.a(attachWallReply.g, i4, attachWallReply.e, this.b, attachWallReply.d, aVar2);
                return;
            }
        }
        if (attach instanceof AttachMarket) {
            AttachMarket attachMarket = (AttachMarket) attach;
            ((MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class))).Ob().d(context2, new qz00(attachMarket.e, attachMarket.d, CommonMarketStat$TypeRefSource.MESSAGES, null, null, attachMarket.r, null, null, null, null, null, null, null, 1048312));
            return;
        }
        if (attach instanceof AttachPlaylist) {
            DisplayMusicPlaylistFragment.a aVar3 = new DisplayMusicPlaylistFragment.a(((AttachPlaylist) attach).b);
            aVar3.B(MusicPlaybackLaunchContext.q.t());
            aVar3.k(context2);
            return;
        }
        if (attach instanceof AttachSticker) {
            g2v.d().a().j(this.b, ((AttachSticker) attach).f, GiftData.d, null, "message");
            return;
        }
        if (attach instanceof AttachUgcSticker) {
            return;
        }
        if (attach instanceof AttachGift) {
            AttachGift attachGift = (AttachGift) attach;
            if (attachGift.e()) {
                GiftSticker giftSticker = attachGift.h;
                if (giftSticker != null) {
                    int i5 = giftSticker.b;
                    t6g0 t6g0Var = t6g0.b;
                    StickerStockItem I = t6g0.d().I(i5);
                    if (I == null) {
                        g2v.d().a().u(this.b, false, EmptyList.b, null, "message");
                        return;
                    } else {
                        g2v.d().a().B(context, EmptyList.b, I, "message");
                        return;
                    }
                }
                return;
            }
            GiftType giftType = attachGift.l;
            if (giftType == GiftType.IMAGE_STATUS) {
                ImageStatus imageStatus = attachGift.m;
                if (imageStatus == null || (str2 = imageStatus.b) == null) {
                    return;
                }
                maz.c(xwk.d().e(), this.b, str2, LaunchContext.A, null, null, 24);
                return;
            }
            if (giftType != GiftType.IMAGE_STATUS_PACK) {
                g2v.d().a().f(context2, null, null);
                return;
            }
            ImageStatusPack imageStatusPack = attachGift.n;
            if (imageStatusPack == null || (str = imageStatusPack.b) == null) {
                return;
            }
            maz.c(xwk.d().e(), this.b, str, LaunchContext.A, null, null, 24);
            return;
        }
        if (attach instanceof AttachPoll) {
            AttachPoll attachPoll = (AttachPoll) attach;
            if (aVar == 0) {
                g2v.c().getClass();
                new PollResultsFragment.a(attachPoll.d, true).k(context2);
                return;
            } else if (aVar.A4(false) && aVar.c9().o.size() > 1) {
                g2v.c().getClass();
                Poll poll = attachPoll.d;
                new PollViewerFragment.a(poll.c, false, false, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.IM), poll.b).k(context2);
                return;
            } else {
                if (attachPoll.d.Bb()) {
                    return;
                }
                g2v.c().getClass();
                new PollResultsFragment.a(attachPoll.d, true).k(context2);
                return;
            }
        }
        if (attach instanceof AttachUnsupported) {
            gau.e(context2, 6, null);
            return;
        }
        if (attach instanceof AttachPodcastEpisode) {
            AttachPodcastEpisode attachPodcastEpisode = (AttachPodcastEpisode) attach;
            PodcastEpisode podcastEpisode = attachPodcastEpisode.d;
            if (attachPodcastEpisode.d()) {
                LinkButton linkButton3 = podcastEpisode.h;
                if (linkButton3 == null || (action = linkButton3.c) == null) {
                    return;
                }
                com.vk.extensions.a.b(action, this.b, null, null, null, null, null, null, null, 254);
                return;
            }
            g2v.c().getClass();
            PodcastEpisodeFragment.a aVar4 = new PodcastEpisodeFragment.a(podcastEpisode.c, podcastEpisode.b);
            aVar4.y(podcastEpisode.k);
            aVar4.A(MusicPlaybackLaunchContext.q);
            aVar4.k(context2);
            return;
        }
        if (attach instanceof AttachArtist) {
            new MusicArtistCatalogFragment.a(((AttachArtist) attach).b).k(context2);
            return;
        }
        if (attach instanceof AttachCurator) {
            new MusicCuratorCatalogFragment.a(((AttachCurator) attach).b).k(context2);
            return;
        }
        if (attach instanceof AttachEvent) {
            g2v.c().d().m(context, ((AttachEvent) attach).d, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
            return;
        }
        if (attach instanceof AttachMiniApp) {
            String obj = MiniAppEntryPoint.IM_CHAT.toString();
            ApiApplication apiApplication = ((AttachMiniApp) attach).b;
            hf3.c(new op20(apiApplication, this.b, new mq20((String) null, (String) null, (String) null, apiApplication.H, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, (String) null, (String) null), new iq20(apiApplication.B, "snippet", obj, null, null, null, null, null, 248), null, 16));
            return;
        }
        if (attach instanceof AttachDonutLink) {
            com.vk.extensions.a.b(((AttachDonutLink) attach).m.c, context2, null, null, null, null, null, null, null, 254);
            return;
        }
        int i6 = 2;
        if (attach instanceof AttachHighlight) {
            Narrative narrative = ((AttachHighlight) attach).b;
            if (narrative.Ab()) {
                StoryViewerRouter.d(((StoryViewerComponent) ((k7m) m7m.f(this)).a(fpf0.a(StoryViewerComponent.class))).tb(), this.b, Collections.singletonList(new HighlightStoriesContainer(narrative, i, i6, r8)), null, MobileOfficialAppsConStoriesStat$ViewEntryPoint.NARRATIVE_SNIPPET, null, null, null, null, null, 3956);
                return;
            }
            return;
        }
        if (!(attach instanceof MiniAppSnippetDataAttach)) {
            if (attach instanceof AttachRoom) {
                VoipStereoRouterComponentStub.b.a a = ((VoipStereoRouterComponent) ((k7m) m7m.f(this)).a(fpf0.a(VoipStereoRouterComponent.class))).a().a();
                xa4.L(context2);
                String str7 = ((AttachRoom) attach).b.b;
                a.getClass();
                return;
            }
            if (attach instanceof AttachChannelMessage) {
                AttachChannelMessage attachChannelMessage = (AttachChannelMessage) attach;
                com.vk.common.links.c.s(context2, attachChannelMessage.b.b, (int) attachChannelMessage.c, null, ChannelEntryPoint.ShareInMessenger.b, 8);
                return;
            } else {
                throw new UnsupportedOperationException("Unsupported attach " + attach);
            }
        }
        MiniAppSnippetDataAttach miniAppSnippetDataAttach = (MiniAppSnippetDataAttach) attach;
        Msg msg = aVar instanceof Msg ? (Msg) aVar : null;
        r8 = msg != null ? Integer.valueOf(msg.d) : 0;
        ApiApplication apiApplication2 = miniAppSnippetDataAttach.h;
        if (apiApplication2 == null) {
            return;
        }
        String obj2 = MiniAppEntryPoint.IM_CHAT.toString();
        if (r8 != 0) {
            int intValue = r8.intValue();
            UserId userId2 = new UserId(l != null ? l.longValue() : 0L);
            ufx ufxVar = new ufx("apps.addInMessengerAppAction", new bo(i6), new sr(i2));
            ufx.m(ufxVar, "peer_id", userId2, 0L, 12);
            ufx.k(ufxVar, "message_id", intValue, 0, 8);
            ver0.c(context2, itg0.m(rdx0.u(e370.e(ufxVar))));
        }
        hf3.c(new op20(apiApplication2, this.b, new mq20((String) null, (String) null, (String) null, apiApplication2.H, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, (String) null, (String) null), new iq20(null, "snippet", obj2, null, null, null, null, null, 249), null, 16));
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    public final void n(String str, String str2) {
        String host;
        j6k j6kVar = new j6k(this, str, str2, 1);
        Uri parse = Uri.parse(naz.a(str));
        String path = parse.getPath();
        if ((path == null || !brm0.B(path, "/away.php", false)) && (host = parse.getHost()) != null && host.length() != 0) {
            String m = cqm0.m(String.valueOf(parse.getHost()));
            if (naz.m(parse) || naz.k(parse) || naz.t(parse) || ((Regex) laz.E.getValue()).f(m) || ((Regex) laz.G.getValue()).f(m) || ((Regex) laz.H.getValue()).f(m) || ((Regex) laz.F.getValue()).f(m) || ((Regex) laz.L.getValue()).f(m)) {
                j6kVar.invoke();
                return;
            }
        }
        Context context = this.b;
        bzb0.d(new bzb0(context), new cwb0.p0(R.string.vkim_vk_link_dialog_title, null, 0, context.getString(R.string.vkim_vk_link_dialog_text, str), R.string.vkim_vk_link_dialog_proceed_button, null, R.string.vkim_cancel, null, null, null, 934), new cvs(j6kVar, 6), null, null, 28);
    }

    public final void o(String str) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", str, null));
        intent.putExtra("android.intent.extra.SUBJECT", "");
        intent.putExtra("android.intent.extra.TEXT", "");
        this.b.startActivity(Intent.createChooser(intent, str));
    }

    public final void p(String str) {
        zp80.b a = zp80.a(this.b, str);
        xwk.d().e().l(this.b, str, new LaunchContext(false, false, false, "im", null, null, null, null, str, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108599), null, a);
    }

    public final void s(String str) {
        this.b.startActivity(Intent.createChooser(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str))), str));
    }

    public final void t() {
        g2v.d().a().G(this.b, "gift_random_sticker", null);
    }

    public final void u(String str) {
        int K = drm0.K(0, 6, str, "@", false);
        if (K <= 1 || K >= str.length() - 1) {
            p("vk://search/".concat(str));
            return;
        }
        String encode = Uri.encode(str.substring(1, K));
        p("vk://" + a0a.d + '/' + str.substring(K + 1) + '/' + encode);
    }
}
