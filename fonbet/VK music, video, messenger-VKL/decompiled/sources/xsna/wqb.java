package xsna;

import android.net.Uri;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.groups.dto.GroupsGetFriendsInvitationListResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoChallengeDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetChallengeResponseDto;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.camera.clips.core.drafts.ClipsDraftVkExtraData;
import com.vk.camera.clips.core.drafts.DraftUserRelatedData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.channels.impl.channel_screen.exceptions.PostDeletedException;
import com.vk.clips.clipsaudio.views.ClipsAudioFragment;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftOrdDataInfo;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipAttachedVideoInfo;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsPreviewData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadAuthorRelatedData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadStaticData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.CoauthorsData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ProductsData;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.clips.ClipsGeoLocationAttachment;
import com.vk.dto.common.clips.ClipsMarketAttachment;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.geo.GeoLocation;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.stories.entities.OrdData;
import com.vk.dto.stories.model.HighlightStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.stories.design.view.editor.SelectRangeWaveFormView;
import com.vk.stories.design.view.viewer.StoryViewHeader;
import com.vk.superapp.api.exceptions.AuthException;
import com.vk.superapp.api.internal.requests.app.ConfirmResult;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.gl.ScalablePlainGLScene;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.view.OneVideoPlayerView;
import xsna.akv;
import xsna.drz;
import xsna.dt1;
import xsna.efc0;
import xsna.erx;
import xsna.fmc0;
import xsna.jto0;
import xsna.kol0;
import xsna.ngd;
import xsna.orx;
import xsna.rwz;
import xsna.tra0;
import xsna.xn50;
import xsna.zp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class wqb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wqb(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v147, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r28v0, types: [one.video.player.BaseVideoPlayer, one.video.player.OneVideoPlayer, xsna.xk80] */
    /* JADX WARN: Type inference failed for: r7v0, types: [one.video.transform.TransformController] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        String str;
        int i = 3;
        int i2 = 1;
        switch (this.b) {
            case 0:
                ChatFragment chatFragment = (ChatFragment) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                chatFragment.B0.I0().g(ChatFragment.y1, false).subscribe();
                ikv0 ikv0Var = (ikv0) ref$ObjectRef.element;
                if (ikv0Var != null) {
                    ikv0Var.a();
                }
                return s3q0.a;
            case 1:
                ClipsAudioFragment clipsAudioFragment = (ClipsAudioFragment) this.c;
                ClipsAudioFragment.b bVar = (ClipsAudioFragment.b) this.d;
                SelectRangeWaveFormView selectRangeWaveFormView = bVar.d;
                ahd ahdVar = (ahd) obj;
                ?? r7 = clipsAudioFragment.V;
                int i3 = ahdVar.b;
                boolean z2 = ahdVar.e;
                MusicTrack musicTrack = ahdVar.a;
                int i4 = ahdVar.c;
                if (i3 != 0 || i4 != 0) {
                    if (!ahdVar.f) {
                        selectRangeWaveFormView.r(musicTrack != null ? musicTrack.f : 0, z2 ? ynd.f : ynd.d);
                        selectRangeWaveFormView.q(0, i3, i4);
                        selectRangeWaveFormView.setRecommendedTime(ahdVar.d);
                        selectRangeWaveFormView.s(i3);
                    }
                    OneVideoPlayerView oneVideoPlayerView = bVar.e;
                    if (selectRangeWaveFormView.getVisibility() != 4) {
                        selectRangeWaveFormView = null;
                    }
                    if (selectRangeWaveFormView != null) {
                        selectRangeWaveFormView.setVisibility(0);
                    }
                    if (z2) {
                        xk80 xk80Var = clipsAudioFragment.U;
                        if (xk80Var != null) {
                            xk80Var.seekTo(i3);
                            xn50.a.c(clipsAudioFragment, ngd.h.b);
                        } else {
                            lpj go = clipsAudioFragment.go();
                            int i5 = wn80.a;
                            rhh0 rhh0Var = new rhh0(8);
                            xgp0 xgp0Var = xgp0.j;
                            boolean z3 = wn80.e;
                            r8l r8lVar = new r8l(false, false, 7);
                            o3i0 o3i0Var = new o3i0(0L, 0L);
                            psm0 psm0Var = new psm0(0);
                            VideoFeatures videoFeatures = VideoFeatures.REVERSE_EXP_RENDERER_THREAD;
                            videoFeatures.getClass();
                            com.vk.toggle.b bVar2 = com.vk.toggle.b.A;
                            if (!bVar2.a(videoFeatures)) {
                                s3q0 s3q0Var = s3q0.a;
                                z = true;
                            } else {
                                z = false;
                            }
                            ?? xk80Var2 = new xk80(go.getApplicationContext(), null, null, null, null, z, rhh0Var, xgp0Var, z3, r8lVar, 2000L, null, null, false, o3i0Var, psm0Var);
                            xk80Var2.R(RepeatMode.OFF);
                            xk80Var2.setVolume(1.0f);
                            if (!bVar2.a(videoFeatures)) {
                                ScalablePlainGLScene scalablePlainGLScene = new ScalablePlainGLScene();
                                ScalablePlainGLScene.e(scalablePlainGLScene, ScalablePlainGLScene.ScaleType.CROP);
                                xk80Var2.G(scalablePlainGLScene);
                            }
                            xk80Var2.s((OneVideoPlayer.d) clipsAudioFragment.X.getValue());
                            clipsAudioFragment.U = xk80Var2;
                            if (r7 != 0) {
                                r7.e(xk80Var2);
                                r7.j(oneVideoPlayerView);
                            }
                            oneVideoPlayerView.setVisibility(0);
                            bwt0.i0(oneVideoPlayerView, new mz(clipsAudioFragment, 26));
                            oneVideoPlayerView.setPlayer(clipsAudioFragment.U);
                            if (r7 != 0) {
                                r7.a = oneVideoPlayerView.getTransformConsumer();
                                str = null;
                                r7.l = null;
                                r7.m = null;
                                r7.n = null;
                                r7.o = null;
                                if (r7.f.e()) {
                                    r7.b();
                                }
                            } else {
                                str = null;
                            }
                            if (musicTrack != null) {
                                str = musicTrack.i;
                            }
                            hwz hwzVar = new hwz(Uri.parse(str));
                            xk80 xk80Var3 = clipsAudioFragment.U;
                            if (xk80Var3 != null) {
                                xk80Var3.n0(hwzVar, i3);
                            }
                        }
                    } else {
                        MusicTrack musicTrack2 = ahdVar.a;
                        int i6 = ahdVar.b;
                        if (epx.f(clipsAudioFragment.fo().b(), musicTrack2)) {
                            clipsAudioFragment.fo().G0(i6, new PlaybackActionMeta(17, 0L, 2, null));
                            clipsAudioFragment.fo().f(new PlaybackActionMeta(6, 0L, 2, null));
                        } else {
                            clipsAudioFragment.fo().N0(new lqk0((StartPlaySource) null, musicTrack2, (List) null, (MusicPlaybackLaunchContext) null, i6, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 989));
                        }
                    }
                }
                return s3q0.a;
            case 2:
                ClipsUploadDataInternal clipsUploadDataInternal = (ClipsUploadDataInternal) this.c;
                UserId userId = (UserId) this.d;
                ClipsDraftVk clipsDraftVk = (ClipsDraftVk) obj;
                ClipsDraftCommonData clipsDraftCommonData = clipsDraftVk.b;
                ClipsUploadStaticData clipsUploadStaticData = clipsUploadDataInternal.d;
                ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData = clipsUploadDataInternal.e;
                clipsDraftCommonData.e = clipsUploadStaticData.b;
                ClipsPreviewData clipsPreviewData = clipsUploadStaticData.h;
                clipsDraftCommonData.f = clipsPreviewData.c;
                clipsDraftCommonData.i = clipsPreviewData.d;
                clipsDraftCommonData.j = Uri.fromFile(clipsUploadDataInternal.b.f).toString();
                ClipsUploadStaticData clipsUploadStaticData2 = clipsUploadDataInternal.d;
                OrdData ordData = clipsUploadStaticData2.i;
                clipsDraftCommonData.n = ordData != null ? new ClipsDraftOrdDataInfo(ordData.b, ordData.c, ordData.d) : null;
                clipsDraftCommonData.o = clipsUploadAuthorRelatedData.j.d();
                ClipsDraftVkExtraData clipsDraftVkExtraData = clipsDraftVk.c;
                GeoLocation geoLocation = clipsUploadStaticData2.j;
                clipsDraftVkExtraData.d = geoLocation != null ? new ClipsGeoLocationAttachment(geoLocation.b, geoLocation.d, geoLocation.e, geoLocation.g, geoLocation.h, geoLocation.i, geoLocation.j, geoLocation.k, geoLocation.l, geoLocation.m) : null;
                clipsDraftVkExtraData.e = clipsUploadAuthorRelatedData.b.b;
                ProductsData d = clipsUploadStaticData2.l.d();
                List<Good> list = d != null ? d.b : null;
                if (list == null) {
                    list = EmptyList.b;
                }
                clipsDraftVkExtraData.f = new ClipsMarketAttachment(null, list, null);
                clipsDraftVkExtraData.g = clipsUploadAuthorRelatedData.f.d();
                if (clipsDraftVkExtraData.j == null) {
                    new DraftUserRelatedData(userId, null, null, null, null, 30, null);
                }
                CoauthorsData d2 = clipsUploadAuthorRelatedData.d.d();
                List<CoOwnerItem> list2 = d2 != null ? d2.b : null;
                ClipsDraftablePlaylist d3 = clipsUploadAuthorRelatedData.e.d();
                ClipAttachedVideoInfo clipAttachedVideoInfo = clipsUploadAuthorRelatedData.h.b;
                clipsDraftVkExtraData.j = new DraftUserRelatedData(userId, list2, d3, clipAttachedVideoInfo != null ? clipAttachedVideoInfo.d : null, clipAttachedVideoInfo != null ? clipAttachedVideoInfo.e : null);
                return s3q0.a;
            case 3:
                fde fdeVar = (fde) this.c;
                ShortVideoGetChallengeResponseDto shortVideoGetChallengeResponseDto = (ShortVideoGetChallengeResponseDto) this.d;
                Image image = (Image) obj;
                ClipGridParams.Data data = fdeVar.a;
                ClipGridParams.Data.Hashtag hashtag = data instanceof ClipGridParams.Data.Hashtag ? (ClipGridParams.Data.Hashtag) data : null;
                String str2 = hashtag != null ? hashtag.b : null;
                ShortVideoChallengeDto i7 = shortVideoGetChallengeResponseDto.i();
                return new io.reactivex.rxjava3.internal.operators.maybe.p(new t30(image, i7 != null ? i7.f() : null, str2, i2));
            case 4:
                lme lmeVar = (lme) this.c;
                PostingStepScreen postingStepScreen = (PostingStepScreen) this.d;
                efc0.a aVar = lmeVar.a;
                aVar.e(fmc0.e.a);
                aVar.d(new PostingAction.Navigation.RedirectFailed(postingStepScreen));
                return s3q0.a;
            case 5:
                VkContextMenu vkContextMenu = (VkContextMenu) this.c;
                dt1 dt1Var = (dt1) this.d;
                dt1.a.getClass();
                if (epx.f(dt1Var, dt1.a.b) || epx.f(dt1Var, dt1.a.c) || epx.f(dt1Var, dt1.a.d)) {
                    vkContextMenu.i(epx.f(dt1Var, dt1.a.c));
                } else if (epx.f(dt1Var, dt1.a.e) || epx.f(dt1Var, dt1.a.f) || epx.f(dt1Var, dt1.a.g)) {
                    vkContextMenu.h(epx.f(dt1Var, dt1.a.f));
                } else if (epx.f(dt1Var, dt1.a.h) || epx.f(dt1Var, dt1.a.i) || epx.f(dt1Var, dt1.a.j)) {
                    vkContextMenu.j(epx.f(dt1Var, dt1.a.i));
                } else {
                    vkContextMenu.g();
                }
                return new roj(vkContextMenu);
            case 6:
                Map map = (Map) this.c;
                avm avmVar = (avm) this.d;
                for (Map.Entry entry : map.entrySet()) {
                    avmVar.b((PinnedMsg) entry.getValue(), ((Number) entry.getKey()).longValue());
                }
                return s3q0.a;
            case 7:
                drz.a aVar2 = (drz.a) this.c;
                pzr pzrVar = (pzr) this.d;
                vzr vzrVar = (vzr) obj;
                List<Dialog> k = ((xrm) aVar2.a).b.k();
                f1e0 f1e0Var = new f1e0();
                Iterator it = k.iterator();
                while (it.hasNext()) {
                    ijm.b((Dialog) it.next(), f1e0Var);
                }
                pzrVar.k.a(f1e0Var.h());
                LinkedHashMap z4 = pzr.z(((xrm) aVar2.a).b.k(), vzrVar);
                return vzr.a(vzrVar, null, null, z4, pzr.u(z4, aVar2.b, true), null, false, null, null, null, null, 8179);
            case 8:
                a3s a3sVar = (a3s) this.c;
                StoryOwner storyOwner = (StoryOwner) this.d;
                a3sVar.c();
                a3sVar.c.c();
                if (storyOwner instanceof StoryOwner.Community) {
                    a3sVar.a.i0.f1(StoryViewAction.AUTHOR_UNSUBSCRIBE, null);
                }
                return null;
            case 9:
                drx drxVar = (drx) this.c;
                erx erxVar = (erx) this.d;
                GroupsGetFriendsInvitationListResponseDto groupsGetFriendsInvitationListResponseDto = (GroupsGetFriendsInvitationListResponseDto) obj;
                drxVar.T(new orx.d.e(false));
                ArrayList W = drxVar.W(groupsGetFriendsInvitationListResponseDto.i());
                List<UserId> d4 = frx.d(erxVar);
                lps lpsVar = erxVar instanceof erx.c ? ((erx.c) erxVar).c : null;
                drxVar.T(new orx.d.a(s101.j(d4.size(), Integer.valueOf(lpsVar != null ? lpsVar.a : Integer.MAX_VALUE), s101.i(W, d4)), groupsGetFriendsInvitationListResponseDto.g()));
                return s3q0.a;
            case 10:
                ((p3y) this.c).L0().f(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), (String) this.d, 1, null));
                return s3q0.a;
            case 11:
                zfy zfyVar = (zfy) this.c;
                agy agyVar = (agy) this.d;
                y4l0 y4l0Var = zfyVar.l;
                if (y4l0Var != null) {
                    y4l0Var.p(agyVar.d);
                }
                return s3q0.a;
            case 12:
                unt untVar = (unt) this.c;
                Object obj2 = ((rwz.b) this.d).l;
                untVar.w1((uwz) (obj2 != null ? obj2 : null));
                return s3q0.a;
            case 13:
                i910 i910Var = (i910) this.c;
                fh9 fh9Var = (fh9) this.d;
                i910Var.a((UIBlock) fh9Var.b, (Good) fh9Var.c, true, i910Var.e);
                return s3q0.a;
            case 14:
                vfk vfkVar = (vfk) this.c;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.d;
                vfkVar.invoke(Boolean.valueOf(((brj0) obj).a == 1));
                dw20 dw20Var = (dw20) ref$ObjectRef2.element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 15:
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                qyg0 V0 = ((hyg0) obj).V0("UPDATE audio_track SET storage = ? WHERE mid = ?");
                try {
                    V0.D3(1, str3);
                    V0.D3(2, str4);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 16:
                Narrative narrative = (Narrative) this.c;
                mu50 mu50Var = (mu50) this.d;
                if (((gmq) obj).equals(narrative)) {
                    mu50Var.b7();
                }
                return s3q0.a;
            case 17:
                vv70 vv70Var = (vv70) this.c;
                tra0 tra0Var = (tra0) this.d;
                tra0.a aVar3 = (tra0.a) obj;
                if (vv70Var.r) {
                    tra0.a.x(aVar3, tra0Var, aVar3.r0(vv70Var.p), aVar3.r0(vv70Var.q));
                } else {
                    aVar3.q(tra0Var, aVar3.r0(vv70Var.p), aVar3.r0(vv70Var.q), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return s3q0.a;
            case 18:
                gzs gzsVar = (gzs) this.c;
                c4a0 c4a0Var = (c4a0) this.d;
                ConfirmResult confirmResult = (ConfirmResult) obj;
                par0.a.getClass();
                par0.a("Phone validation skip result: " + confirmResult);
                if (confirmResult == ConfirmResult.OK) {
                    gzsVar.invoke();
                } else {
                    c4a0Var.f(new AuthException.UnknownException(null, null));
                }
                return s3q0.a;
            case 19:
                exd0 exd0Var = (exd0) this.c;
                gxd0.g(exd0Var.l, (List) this.d);
                exd0Var.x7();
                return s3q0.a;
            case 20:
                ((fil0) this.c).a.S0().l((DialogsFilter) this.d, (xpp) obj);
                return s3q0.a;
            case 21:
                ool0 ool0Var = (ool0) this.c;
                nol0 nol0Var = (nol0) this.d;
                g47 g47Var = (g47) obj;
                l370.o(g47Var, new xq1(12, nol0Var, ool0Var), f9t.z(ool0Var), new mcj0(nol0Var, i));
                l370.m(g47Var, f9t.w(ool0Var));
                g47Var.d(new kol0.a(ool0Var));
                return s3q0.a;
            case 22:
                b8m0 b8m0Var = (b8m0) this.c;
                Uri uri = (Uri) this.d;
                akv.a aVar4 = new akv.a();
                aVar4.a = (String) obj;
                aVar4.c(uri, "photo", "image.jpg");
                aVar4.f = true;
                aVar4.e = b8m0Var.b.getConfig().v;
                aVar4.d = 3;
                return new akv(aVar4);
            case 23:
                ebm0 ebm0Var = (ebm0) this.c;
                y0f0 y0f0Var = (y0f0) this.d;
                b.d dVar = (b.d) obj;
                StoriesContainer storiesContainer = ebm0Var.c;
                if (storiesContainer instanceof HighlightStoriesContainer) {
                    dVar.b(Integer.valueOf(((HighlightStoriesContainer) storiesContainer).o.b), "narrative_id");
                }
                dVar.b(y0f0Var.e, "reaction_name");
                return s3q0.a;
            case 24:
                ((izs) this.c).invoke(((StoryViewHeader) this.d).i);
                return s3q0.a;
            case 25:
                ((iqo0) this.c).p.invoke(((zp0.b.c) this.d).e, UserProfileDialogs.ItemCallPlace.THIRD_PARTY_HOLDER);
                return s3q0.a;
            case 26:
                ((i0b0) this.c).invoke(jto0.b.a((jto0.b) this.d, null, null, null, (tho0) obj, false, null, false, false, false, false, null, false, false, false, null, false, 65527));
                return s3q0.a;
            default:
                jju0 jju0Var = (jju0) this.c;
                jbs jbsVar = (jbs) this.d;
                List list3 = (List) obj;
                Post post = (Post) j5g.a0(list3);
                if (post != null && post.ic()) {
                    return io.reactivex.rxjava3.core.a.k(new PostDeletedException());
                }
                ((NewsfeedRouterComponent) jju0Var.c.getValue()).l0().x(jbsVar, (NewsEntry) j5g.Y(list3));
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
    }

    public /* synthetic */ wqb(ShortVideoGetChallengeResponseDto shortVideoGetChallengeResponseDto, jae jaeVar, fde fdeVar) {
        this.b = 3;
        this.c = fdeVar;
        this.d = shortVideoGetChallengeResponseDto;
    }
}
