package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteStatement;
import com.facebook.soloader.MinElf;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.catalog.mvi.block.video.impl.video.largelisttablet.VideoLargeListTabletView;
import com.vk.channels.impl.list.c;
import com.vk.channels.impl.list.e;
import com.vk.clips.design.view.component.button.ClipActionButton;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.internal.data.LaunchForResultInfo;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.tools.VkViewStub;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.hints.HintId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.ecomm.reviews.impl.allreviews.presentation.a;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.metrics.eventtracking.Event;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsRepository;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.BaseVideoPlayer;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.e8v0;
import xsna.o0r0;
import xsna.o38;
import xsna.o9t;
import xsna.pb60;
import xsna.sga;
import xsna.ugf;
import xsna.ws00;
import xsna.xn50;
import xsna.yda;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class zv implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zv(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        String Ib;
        String str;
        boolean z;
        fvk initialize$lambda$220$lambda$16;
        int i = 16;
        String str2 = null;
        Object obj = null;
        str2 = null;
        int i2 = 1;
        int i3 = 2;
        switch (this.b) {
            case 0:
                fw fwVar = (fw) this.c;
                StoryEntry storyEntry = (StoryEntry) this.d;
                fwVar.getClass();
                VideoFile videoFile = storyEntry.n;
                if (storyEntry.Tb()) {
                    if (videoFile != null) {
                        str2 = videoFile.a1() + ".mp4";
                    }
                    Ib = videoFile != null ? videoFile.T7() : "";
                    str = "video/";
                } else {
                    Ib = storyEntry.Ib(iah0.v());
                    str = "image/";
                }
                String str3 = str2;
                String str4 = Ib;
                String str5 = str;
                fwVar.a.i0.f1(storyEntry.M ? StoryViewAction.SAVE_GENERATIVE : StoryViewAction.SAVE_STORY, new v5(storyEntry, i3));
                cmf0.a.c(fwVar.a.i0.getContext(), fwVar.a.i0.getWindow(), R.string.story_saving_story);
                if (str4 != null) {
                    fwVar.g.put(str4, str4);
                }
                vao.b(fwVar.a.i0.getContext(), str3, str4, false, str5, Boolean.FALSE, false);
                fwVar.d.c();
                return s3q0.a;
            case 1:
                ((com.vk.libvideo.b) this.c).invoke((ArrayList) this.d);
                return s3q0.a;
            case 2:
                y6b0 y6b0Var = (y6b0) this.c;
                deb0 deb0Var = (deb0) this.d;
                vw3 vw3Var = BaseVideoPlayer.H;
                return "play() playlist= " + y6b0Var + " position= " + deb0Var;
            case 3:
                ((o38.a) this.c).l.invoke(((sh00) this.d).a);
                return s3q0.a;
            case 4:
                ((izs) this.c).invoke(new yda.c((sga.c) this.d));
                return s3q0.a;
            case 5:
                ((com.vk.channels.impl.list.d) this.c).d.invoke(new e.r(((c.d) ((com.vk.channels.impl.list.c) this.d)).a));
                return s3q0.a;
            case 6:
                q7v0 q7v0Var = (q7v0) this.c;
                jlf jlfVar = (jlf) this.d;
                VkOnboardingCampaign e = q7v0Var.e(HintId.CLIPS_OPEN_CHANNEL_BUTTON_ONBOARDING.getId());
                if (e != null) {
                    q7v0Var.a(e, VkOnboardingType.Tooltip, e8v0.m.b);
                }
                jlfVar.e(ugf.h.d.a);
                return s3q0.a;
            case 7:
                f8h f8hVar = (f8h) this.c;
                g8h g8hVar = (g8h) this.d;
                f8hVar.u = ((Number) f8hVar.h.invoke()).intValue();
                zwt0.b(f8hVar.b);
                g8hVar.setPadding(0, 0, 0, 0);
                return s3q0.a;
            case 8:
                asm asmVar = (asm) this.c;
                DialogExt dialogExt = (DialogExt) this.d;
                io.reactivex.rxjava3.internal.operators.single.c C = asmVar.b.C(asmVar, new cmo(dialogExt.f, asmVar.i));
                asu0 asu0Var = asu0.a;
                int i4 = 26;
                asmVar.h.b(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(C.q(asu0Var.c()).m(asu0Var.d()), new j22(new d05(i, asmVar, dialogExt), 24)), new tra(asmVar, i3)).subscribe(new da(new b1a(11, asmVar, dialogExt), 22), new ea(new y40(i4), i4)));
                return s3q0.a;
            case 9:
                k1q k1qVar = (k1q) this.c;
                Event event = (Event) this.d;
                SQLiteStatement sQLiteStatement = (SQLiteStatement) k1qVar.g.getValue();
                sQLiteStatement.clearBindings();
                sQLiteStatement.bindString(1, event.a.c);
                sQLiteStatement.bindLong(2, k1qVar.e);
                if (sQLiteStatement.simpleQueryForString() != null) {
                    z = false;
                    return Boolean.valueOf(z);
                }
                z = true;
                return Boolean.valueOf(z);
            case 10:
                com.vk.core.fragments.e eVar = (com.vk.core.fragments.e) this.c;
                FragmentImpl fragmentImpl = (FragmentImpl) this.d;
                if (epx.f(eVar.e.d, fragmentImpl.Kn())) {
                    eVar.a0();
                } else {
                    FragmentEntry Kn = fragmentImpl.Kn();
                    if (Kn != null) {
                        Iterator<T> it = eVar.e.b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (epx.f(((LaunchForResultInfo) next).c, Kn.d)) {
                                    obj = next;
                                }
                            }
                        }
                        LaunchForResultInfo launchForResultInfo = (LaunchForResultInfo) obj;
                        if (launchForResultInfo != null) {
                            eVar.e.b.remove(launchForResultInfo);
                        }
                        eVar.K(Kn);
                        eVar.e.c.Fb(Kn);
                        eVar.e.c.Gb();
                        eVar.J();
                    }
                }
                return s3q0.a;
            case 11:
                ((izs) this.c).invoke(new o9t.a((l6t) this.d));
                return s3q0.a;
            case 12:
                VkViewStub vkViewStub = (VkViewStub) this.c;
                dq00 dq00Var = (dq00) this.d;
                ClipActionButton clipActionButton = new ClipActionButton(vkViewStub.getContext());
                jjc.g(clipActionButton, new pb00(dq00Var, i2));
                return clipActionButton;
            case 13:
                MarketAllReviewsFragment marketAllReviewsFragment = (MarketAllReviewsFragment) this.c;
                ws00.c cVar = (ws00.c) this.d;
                int i5 = MarketAllReviewsFragment.d0;
                xn50.a.c(marketAllReviewsFragment, new a.j.C1007a(cVar.b));
                return s3q0.a;
            case 14:
                new VkModal(VkModal.Mode.Card, (b.a.C0790b) this.c, null, false, 28).b((Context) this.d, null);
                return s3q0.a;
            case 15:
                ((pb60.a) this.c).b.b((buz) this.d, false);
                return s3q0.a;
            case 16:
                xwk.e().m((Activity) this.c, fkq0.e(((Group) this.d).c), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                return s3q0.a;
            case 17:
                awf awfVar = (awf) this.c;
                mtk0 mtk0Var = (mtk0) this.d;
                float f = awfVar.b;
                float floatValue = Float.valueOf(f).floatValue();
                float f2 = awfVar.c;
                return Float.valueOf(c6i0.e(floatValue, Float.valueOf(f2).floatValue(), swe0.f(((Number) mtk0Var.getValue()).floatValue(), Float.valueOf(f).floatValue(), Float.valueOf(f2).floatValue())));
            case 18:
                initialize$lambda$220$lambda$16 = ServiceProvider.initialize$lambda$220$lambda$16((UnityAdsModule) this.c, (ServicesRegistry) this.d);
                return initialize$lambda$220$lambda$16;
            case 19:
                ((slq0) this.c).a(new UserProfileAction.s.c.a.h(new pi40((olq0) this.d, 13)));
                return s3q0.a;
            case 20:
                arq0 arq0Var = (arq0) this.c;
                VkContextMenu vkContextMenu = (VkContextMenu) this.d;
                wh50 wh50Var = arq0Var.t;
                if (((VkContextMenu) ((zak0) wh50Var).getValue()) == vkContextMenu) {
                    ((zak0) wh50Var).setValue(null);
                }
                arq0Var.s6(false);
                return s3q0.a;
            case 21:
                ker0 ker0Var = (ker0) this.c;
                ((xuv0) ker0Var.U.getValue()).a(ker0Var.kn(), ((Intent) this.d).getData());
                return s3q0.a;
            case 22:
                VideoDiscoveryRecommendationsRepository videoDiscoveryRecommendationsRepository = (VideoDiscoveryRecommendationsRepository) this.c;
                VideoDiscoveryRecommendationsRepository.Params.Recommendations recommendations = (VideoDiscoveryRecommendationsRepository.Params.Recommendations) ((VideoDiscoveryRecommendationsRepository.Params) this.d);
                videoDiscoveryRecommendationsRepository.getClass();
                VideoDiscoveryRecommendationsRepository.Params.Recommendations.RecommendationType recommendationType = recommendations.h;
                int i6 = recommendations.f;
                int i7 = recommendations.e;
                int i8 = VideoDiscoveryRecommendationsRepository.b.$EnumSwitchMapping$0[recommendationType.ordinal()];
                int i9 = 8;
                if (i8 != 1) {
                    if (i8 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i10 = 6;
                    if (((Boolean) videoDiscoveryRecommendationsRepository.f.getValue()).booleanValue()) {
                        fz2 y = yfb.y(tft0.f(new uft0(), recommendations.b, recommendations.a, Integer.valueOf(i7), Integer.valueOf(i6), recommendations.g, recommendations.c, tby.d(UsersFieldsDto.FRIEND_STATUS, GroupsFieldsDto.MEMBER_STATUS, UsersFieldsDto.VERIFIED, UsersFieldsDto.TRENDING, BaseUserGroupFieldsDto.IS_NFT, BaseUserGroupFieldsDto.IS_NFT_PHOTO, GroupsFieldsDto.MEMBERS_COUNT, GroupsFieldsDto.VIDEO_NOTIFICATIONS_STATUS, UsersFieldsDto.FOLLOWERS_COUNT, UsersFieldsDto.PHOTO_BASE), recommendations.d, null, 2372), new fvq0(videoDiscoveryRecommendationsRepository, i10));
                        ahn.D(y);
                        return rsg0.T(y);
                    }
                    fz2 y2 = yfb.y(((Boolean) videoDiscoveryRecommendationsRepository.e.getValue()).booleanValue() ? tft0.p(new uft0(), recommendations.b, recommendations.a, Integer.valueOf(i7), Integer.valueOf(i6), recommendations.g, recommendations.c, tby.d(UsersFieldsDto.FRIEND_STATUS, GroupsFieldsDto.MEMBER_STATUS, UsersFieldsDto.VERIFIED, UsersFieldsDto.TRENDING, BaseUserGroupFieldsDto.IS_NFT, BaseUserGroupFieldsDto.IS_NFT_PHOTO, GroupsFieldsDto.MEMBERS_COUNT, GroupsFieldsDto.VIDEO_NOTIFICATIONS_STATUS, UsersFieldsDto.FOLLOWERS_COUNT, UsersFieldsDto.PHOTO_BASE), recommendations.d, 2372) : tft0.k(new uft0(), recommendations.b, recommendations.a, Integer.valueOf(i7), Integer.valueOf(i6), recommendations.g, recommendations.c, tby.d(UsersFieldsDto.FRIEND_STATUS, GroupsFieldsDto.MEMBER_STATUS, UsersFieldsDto.VERIFIED, UsersFieldsDto.TRENDING, BaseUserGroupFieldsDto.IS_NFT, BaseUserGroupFieldsDto.IS_NFT_PHOTO, GroupsFieldsDto.MEMBERS_COUNT, GroupsFieldsDto.VIDEO_NOTIFICATIONS_STATUS, UsersFieldsDto.FOLLOWERS_COUNT, UsersFieldsDto.PHOTO_BASE), recommendations.d, null, 2372), new rtg0(videoDiscoveryRecommendationsRepository, 19));
                    ahn.D(y2);
                    return rsg0.T(y2);
                }
                UserId userId = recommendations.b;
                int i11 = recommendations.a;
                String str6 = recommendations.g;
                String str7 = recommendations.c;
                String str8 = recommendations.d;
                tfx tfxVar = new tfx("video.getVideoMusicDiscover", new hub0(i9), new zy60(i));
                tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
                tfx.l(tfxVar, "video_id", i11, 0, 0, 8);
                tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, i7, 0, 0, 8);
                tfxVar.f(i6, 0, 50, "count");
                if (str8 != null) {
                    tfx.o(tfxVar, "payload", str8, 0, 0, 12);
                }
                if (str6 != null) {
                    tfx.o(tfxVar, "ref", str6, 0, 0, 12);
                }
                if (str7 != null) {
                    tfx.o(tfxVar, "track_code", str7, 0, 0, 12);
                }
                fz2 y3 = yfb.y(tfxVar, new e750(28));
                ahn.D(y3);
                return rsg0.T(y3);
            default:
                ((izs) this.c).invoke(new VideoLargeListTabletView.c.b(((VideoLargeListTabletView.d) this.d).b));
                return s3q0.a;
        }
    }
}
