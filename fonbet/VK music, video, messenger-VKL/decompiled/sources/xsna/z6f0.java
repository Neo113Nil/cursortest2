package xsna;

import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.api.generated.account.dto.AccountGetPrivacySettingsResponseDto;
import com.vk.api.generated.account.dto.AccountPrivacySettingValueDto;
import com.vk.api.generated.account.dto.AccountPrivacySettingValueListDto;
import com.vk.api.generated.account.dto.AccountPrivacySettingsDto;
import com.vk.api.generated.account.dto.AccountPrivacyValueDto;
import com.vk.api.generated.apps.dto.AppsClearRecentsPlatformDto;
import com.vk.camera.editor.stories.impl.background.BackgroundEditorState;
import com.vk.catalog.mvi.section.ui.entity.CatalogBlockData;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.catalog2.common.ui.mvp.holder.search.apps.SearchMiniAppsInServiceCatalogRootVh;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.models.ads.SdkAdsChoices;
import com.vk.clips.sdk.models.ads.SdkAdsChoicesOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdInfo;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.dto.common.AdsChoices;
import com.vk.dto.common.AdsChoicesOptions;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoAdInfo;
import com.vk.dto.common.VideoAdsType;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.status.StatusImagePopup;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.dto.user.UserProfile;
import com.vk.feature.uxpolls.modalpoll.UxPollsModalFragment;
import com.vk.feature.uxpolls.modalpoll.g;
import com.vk.log.L;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.posting.presentation.video.a;
import com.vk.stickers.api.styles.MusicStickerStyle;
import com.vk.stories.design.view.stickers.music.MusicStickerStyleSwitchingView;
import com.vk.superapp.animation.SuperAppAnimation;
import com.vk.superapp.api.dto.menu.SuperAppAnimationConfig;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.uxpolls.presentation.view.PollsWebView;
import com.vk.video.design.view.VideoControlsBarView;
import com.vk.voip.ui.sessionrooms.f;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipants;
import xsna.fqq0;
import xsna.jun0;
import xsna.ljk0;
import xsna.msf0;
import xsna.osf0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class z6f0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z6f0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v55, types: [T, com.vk.api.generated.account.dto.AccountPrivacyValueDto] */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, com.vk.api.generated.account.dto.AccountPrivacyValueDto] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ?? d;
        List<Long> e;
        List<Long> e2;
        List<Long> d2;
        List<Long> d3;
        n7m0 n7m0Var;
        UserId userId;
        Object obj2;
        VideoAdInfo videoAdInfo;
        Owner owner;
        VideoAdsType videoAdsType;
        Image image;
        AdsChoices adsChoices;
        int i = this.b;
        int i2 = 6;
        int i3 = 2;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                izs izsVar = (izs) obj3;
                Throwable th = (Throwable) obj;
                if (izsVar != null) {
                    izsVar.invoke(th);
                }
                return s3q0.a;
            case 1:
                osf0.a aVar = ((rsf0) obj3).d;
                pno0 pno0Var = (pno0) obj;
                String obj4 = pno0Var.d().toString();
                if (4 == pno0Var.a()) {
                    aVar.invoke(msf0.g.b);
                } else if (4 == pno0Var.b()) {
                    aVar.invoke(new msf0.i(obj4));
                } else {
                    aVar.invoke(new msf0.k(obj4));
                }
                return s3q0.a;
            case 2:
                ((j4g0) obj3).h6();
                return s3q0.a;
            case 3:
                ((rdh0) obj3).d.invoke();
                return s3q0.a;
            case 4:
                zhh0 zhh0Var = (zhh0) obj3;
                return new ov70(zhh0Var.c(zhh0Var.k, ((ov70) obj).a, zhh0Var.j));
            case 5:
                ((tdu) obj).n(((Number) ((c1h) obj3).y.getValue()).floatValue());
                return s3q0.a;
            case 6:
                SearchMiniAppsInServiceCatalogRootVh searchMiniAppsInServiceCatalogRootVh = (SearchMiniAppsInServiceCatalogRootVh) obj3;
                if (((n3a) obj) instanceof lwf0) {
                    ((io.reactivex.rxjava3.disposables.b) searchMiniAppsInServiceCatalogRootVh.v.getValue()).b(itg0.m(rsg0.T(yfb.x(((wf3) searchMiniAppsInServiceCatalogRootVh.u.getValue()).c(AppsClearRecentsPlatformDto.VK_APPS)))));
                }
                return s3q0.a;
            case 7:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    SessionRoomParticipants.Participant participant = (SessionRoomParticipants.Participant) linkedHashMap.get(entry.getKey());
                    if (participant != null) {
                        ParticipantId id = participant.getId();
                        whr0 whr0Var = (whr0) entry.getValue();
                        ParticipantId id2 = participant.getId();
                        String str = whr0Var.q;
                        if (str == null) {
                            str = whr0Var.e();
                        }
                        linkedHashMap2.put(id, new wk90(id2, str, whr0Var.b, whr0Var.c));
                    }
                }
                return linkedHashMap2;
            case 8:
                kxi0 kxi0Var = (kxi0) obj3;
                f.a aVar2 = (f.a) obj;
                if (aVar2 instanceof f.a.b) {
                    boolean z = ((f.a.b) aVar2).c;
                    kxi0Var.c.onNext(new com.vk.voip.ui.sessionrooms.f(null, z, z, null, false, true, false, 377));
                } else {
                    kxi0Var.c.onNext(new com.vk.voip.ui.sessionrooms.f(null, false, false, null, false, false, false, 383));
                }
                return s3q0.a;
            case 9:
                pjk0 pjk0Var = (pjk0) obj3;
                pjk0Var.i = new ljk0.c((StatusImagePopup) obj);
                pjk0Var.c = null;
                u1u0.f(0L, pjk0Var.q);
                return s3q0.a;
            case 10:
                return new v690(((e7l0) obj3).i, (ViewGroup) obj);
            case 11:
                L.g("Can't delete question", (Throwable) obj);
                ((sbl0) obj3).b();
                return s3q0.a;
            case 12:
                io.reactivex.rxjava3.internal.operators.observable.f0 f0Var = (io.reactivex.rxjava3.internal.operators.observable.f0) obj3;
                AccountGetPrivacySettingsResponseDto accountGetPrivacySettingsResponseDto = (AccountGetPrivacySettingsResponseDto) obj;
                AccountPrivacySettingsDto accountPrivacySettingsDto = (AccountPrivacySettingsDto) j5g.b0(0, accountGetPrivacySettingsResponseDto.d());
                AccountPrivacySettingsDto accountPrivacySettingsDto2 = (AccountPrivacySettingsDto) j5g.b0(1, accountGetPrivacySettingsResponseDto.d());
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.element = AccountPrivacyValueDto.SOME;
                AccountPrivacySettingValueDto e3 = accountPrivacySettingsDto != null ? accountPrivacySettingsDto.e() : null;
                AccountPrivacySettingValueDto.AccountPrivacySettingValueCategoryDto accountPrivacySettingValueCategoryDto = e3 instanceof AccountPrivacySettingValueDto.AccountPrivacySettingValueCategoryDto ? (AccountPrivacySettingValueDto.AccountPrivacySettingValueCategoryDto) e3 : null;
                if (accountPrivacySettingValueCategoryDto != null) {
                    AccountPrivacySettingValueListDto f = accountPrivacySettingValueCategoryDto.f();
                    if (f != null && (d3 = f.d()) != null) {
                        arrayList.addAll(d3);
                    }
                    AccountPrivacySettingValueListDto e4 = accountPrivacySettingValueCategoryDto.e();
                    if (e4 != null && (d2 = e4.d()) != null) {
                        arrayList.addAll(d2);
                    }
                }
                AccountPrivacySettingValueDto e5 = accountPrivacySettingsDto2 != null ? accountPrivacySettingsDto2.e() : null;
                AccountPrivacySettingValueDto.AccountPrivacySettingValueCategoryDto accountPrivacySettingValueCategoryDto2 = e5 instanceof AccountPrivacySettingValueDto.AccountPrivacySettingValueCategoryDto ? (AccountPrivacySettingValueDto.AccountPrivacySettingValueCategoryDto) e5 : null;
                if (accountPrivacySettingValueCategoryDto2 != null) {
                    AccountPrivacySettingValueListDto f2 = accountPrivacySettingValueCategoryDto2.f();
                    if (f2 != null && (e2 = f2.e()) != null) {
                        arrayList2.addAll(e2);
                    }
                    AccountPrivacySettingValueListDto e6 = accountPrivacySettingValueCategoryDto2.e();
                    if (e6 != null && (e = e6.e()) != null) {
                        arrayList2.addAll(e);
                    }
                }
                if (accountGetPrivacySettingsResponseDto.e()) {
                    ref$ObjectRef.element = null;
                } else {
                    AccountPrivacySettingValueDto e7 = accountPrivacySettingsDto != null ? accountPrivacySettingsDto.e() : null;
                    AccountPrivacySettingValueDto.AccountPrivacySettingValueCategoryDto accountPrivacySettingValueCategoryDto3 = e7 instanceof AccountPrivacySettingValueDto.AccountPrivacySettingValueCategoryDto ? (AccountPrivacySettingValueDto.AccountPrivacySettingValueCategoryDto) e7 : null;
                    if (accountPrivacySettingValueCategoryDto3 != null && (d = accountPrivacySettingValueCategoryDto3.d()) != 0) {
                        ref$ObjectRef.element = d;
                    }
                }
                return f0Var.l(new vvi0(new on7(ref$ObjectRef, arrayList, arrayList2, i2), i3));
            case 13:
                com.vk.camera.editor.stories.impl.background.b bVar = (com.vk.camera.editor.stories.impl.background.b) obj3;
                if (bVar.h.b() != null) {
                    BackgroundEditorState backgroundEditorState = bVar.h;
                    if (backgroundEditorState.d == null) {
                        bVar.x(backgroundEditorState.b().a, true);
                    }
                }
                return s3q0.a;
            case 14:
                g5m0 g5m0Var = (g5m0) obj3;
                g5m0Var.g1.invoke(Integer.valueOf(g5m0Var.j1));
                g5m0Var.hide();
                return s3q0.a;
            case 15:
                f7m0 f7m0Var = (f7m0) obj3;
                int intValue = ((Integer) obj).intValue();
                MusicStickerStyleSwitchingView musicStickerStyleSwitchingView = f7m0Var.m;
                if (musicStickerStyleSwitchingView != null) {
                    MusicStickerStyle musicStickerStyle = musicStickerStyleSwitchingView.f.get(intValue);
                    musicStickerStyleSwitchingView.setCurrentStyle(musicStickerStyle);
                    if (musicStickerStyle != null && (n7m0Var = f7m0Var.x) != null) {
                        n7m0Var.w = musicStickerStyle;
                    }
                }
                return s3q0.a;
            case 16:
                xam0 xam0Var = (xam0) obj3;
                xam0Var.f.a();
                yam0 yam0Var = xam0Var.j;
                if (yam0Var != null) {
                    yam0Var.b.dismiss();
                }
                return s3q0.a;
            case 17:
                StoryQuestionEntry storyQuestionEntry = (StoryQuestionEntry) obj3;
                b.d dVar = (b.d) obj;
                UserProfile userProfile = storyQuestionEntry.g;
                if (userProfile != null && (userId = userProfile.c) != null) {
                    dVar.b(userId, "question_author_id");
                }
                dVar.b(Integer.valueOf(storyQuestionEntry.b), "question_id");
                return s3q0.a;
            case 18:
                com.vk.superapp.ui.a aVar3 = (com.vk.superapp.ui.a) obj3;
                SuperAppAnimationConfig superAppAnimationConfig = (SuperAppAnimationConfig) obj;
                if (superAppAnimationConfig.c()) {
                    Iterator it = com.vk.superapp.ui.a.t3(superAppAnimationConfig).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((SuperAppAnimation.a) obj2).d == SuperAppAnimation.Type.SHAKE) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    SuperAppAnimation.a aVar4 = (SuperAppAnimation.a) obj2;
                    if (aVar4 != null) {
                        SuperAppFragment superAppFragment = aVar3.b;
                        if (superAppFragment.getActivity() != null) {
                            SuperAppAnimation.b bVar2 = superAppFragment.i0;
                            superAppFragment.i0 = bVar2 != null ? bVar2.a(aVar4, null) : new SuperAppAnimation.b(aVar4, null);
                            SuperAppAnimation superAppAnimation = superAppFragment.f0;
                            if (superAppAnimation == null || !superAppAnimation.a()) {
                                SuperAppAnimation superAppAnimation2 = superAppFragment.f0;
                                if (superAppAnimation2 != null) {
                                    superAppAnimation2.b();
                                }
                                superAppFragment.f0 = null;
                                if (aVar4.a() != 0) {
                                    superAppFragment.qo(aVar4);
                                }
                            }
                        }
                    }
                }
                return s3q0.a;
            case 19:
                ovn0 ovn0Var = (ovn0) obj3;
                qcy<Object>[] qcyVarArr = ovn0.m1;
                ovn0Var.getClass();
                xn50.a.c(ovn0Var, jun0.g.b);
                ((ikv0) obj).a();
                return s3q0.a;
            case 20:
                ((fqq0.a) obj3).d.invoke();
                return s3q0.a;
            case 21:
                ((lsq0) obj3).d0().k(obj);
                return s3q0.a;
            case 22:
                zvq0 zvq0Var = (zvq0) obj3;
                WallWithCounters wallWithCounters = (WallWithCounters) obj;
                es60 es60Var = zvq0Var.f;
                es60Var.b.a();
                return odq.c(es60Var.a, new aic(), new xc3(wallWithCounters, null, es60Var.b, zvq0Var.g, null, true, null)).l(new vvi0(new vlc0(wallWithCounters, 23), i2));
            case 23:
                CatalogSectionState catalogSectionState = (CatalogSectionState) obj;
                List<CatalogBlockData> list = catalogSectionState.d;
                Integer j = p4g.j((CatalogBlockData) obj3, list);
                if (j != null) {
                    return CatalogSectionState.a(catalogSectionState, rdi.A(j.intValue(), list), false, false, null, null, false, null, null, null, null, 8187);
                }
                return null;
            case 24:
                UxPollsModalFragment uxPollsModalFragment = (UxPollsModalFragment) obj3;
                g.a.AbstractC1030a abstractC1030a = (g.a.AbstractC1030a) obj;
                ProgressBar progressBar = uxPollsModalFragment.d0;
                if (progressBar == null) {
                    progressBar = null;
                }
                bwt0.p0(progressBar, abstractC1030a instanceof g.a.AbstractC1030a.c);
                PollsWebView pollsWebView = uxPollsModalFragment.X;
                if (pollsWebView == null) {
                    pollsWebView = null;
                }
                pollsWebView.setVisibility(abstractC1030a instanceof g.a.AbstractC1030a.b ? 0 : 4);
                ConstraintLayout constraintLayout = uxPollsModalFragment.a0;
                if (constraintLayout == null) {
                    constraintLayout = null;
                }
                boolean z2 = abstractC1030a instanceof g.a.AbstractC1030a.C1031a;
                bwt0.p0(constraintLayout, z2);
                if (z2) {
                    TextView textView = uxPollsModalFragment.b0;
                    if (textView == null) {
                        textView = null;
                    }
                    g.a.AbstractC1030a.C1031a c1031a = (g.a.AbstractC1030a.C1031a) abstractC1030a;
                    textView.setText(c1031a.b);
                    TextView textView2 = uxPollsModalFragment.c0;
                    (textView2 == null ? null : textView2).setText(c1031a.c);
                }
                return s3q0.a;
            case 25:
                ((p8r0) obj3).j();
                return s3q0.a;
            case 26:
                VideoControlsBarView.a aVar5 = ((VideoControlsBarView) obj3).b;
                if (aVar5 != null) {
                    aVar5.c();
                }
                return s3q0.a;
            case 27:
                rwo0 rwo0Var = ((VideoEditTimelineView) obj3).F;
                if (rwo0Var != null) {
                    rwo0Var.u();
                }
                return s3q0.a;
            case 28:
                SdkVideoAdInfo sdkVideoAdInfo = (SdkVideoAdInfo) obj;
                qcy<Object>[] qcyVarArr2 = VideoFileAdapter.l;
                VideoFile d4 = ((VideoFileAdapter) obj3).d();
                if (sdkVideoAdInfo != null) {
                    String str2 = sdkVideoAdInfo.b;
                    String str3 = sdkVideoAdInfo.c;
                    String str4 = sdkVideoAdInfo.d;
                    UserId userId2 = sdkVideoAdInfo.e;
                    SdkOwner sdkOwner = sdkVideoAdInfo.f;
                    if (sdkOwner != null) {
                        Parcelable parcelable = sdkOwner.m;
                        Owner owner2 = parcelable instanceof Owner ? (Owner) parcelable : null;
                        if (owner2 == null) {
                            throw new IllegalStateException("SdkOwner.extendedOwnerModel isn't Owner model");
                        }
                        owner = owner2;
                    } else {
                        owner = null;
                    }
                    String str5 = sdkVideoAdInfo.g;
                    switch (p0s0.$EnumSwitchMapping$1[sdkVideoAdInfo.h.ordinal()]) {
                        case 1:
                            videoAdsType = VideoAdsType.VK_SHORT_VIDEO;
                            break;
                        case 2:
                            videoAdsType = VideoAdsType.MAIL_SHORT_VIDEO;
                            break;
                        case 3:
                            videoAdsType = VideoAdsType.MAIL_SHORT_VIDEO_KNOWN_OWNER;
                            break;
                        case 4:
                            videoAdsType = VideoAdsType.MAIL_PROMOTED_SHORT_VIDEO;
                            break;
                        case 5:
                            videoAdsType = VideoAdsType.MY_TARGET_VIDEO;
                            break;
                        case 6:
                            videoAdsType = VideoAdsType.UNKNOWN;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    VideoAdsType videoAdsType2 = videoAdsType;
                    boolean z3 = sdkVideoAdInfo.i;
                    String str6 = sdkVideoAdInfo.j;
                    String str7 = sdkVideoAdInfo.k;
                    String str8 = sdkVideoAdInfo.l;
                    SdkImages sdkImages = sdkVideoAdInfo.m;
                    if (sdkImages != null) {
                        Parcelable parcelable2 = sdkImages.c;
                        Image image2 = parcelable2 instanceof Image ? (Image) parcelable2 : null;
                        if (image2 == null) {
                            throw new IllegalStateException("Another source for converting was used");
                        }
                        image = image2;
                    } else {
                        image = null;
                    }
                    SdkAdsChoices sdkAdsChoices = sdkVideoAdInfo.n;
                    if (sdkAdsChoices != null) {
                        List<SdkAdsChoicesOptions> list2 = sdkAdsChoices.f;
                        ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
                        for (Iterator it2 = list2.iterator(); it2.hasNext(); it2 = it2) {
                            SdkAdsChoicesOptions sdkAdsChoicesOptions = (SdkAdsChoicesOptions) it2.next();
                            arrayList3.add(new AdsChoicesOptions(sdkAdsChoicesOptions.b, sdkAdsChoicesOptions.c, sdkAdsChoicesOptions.d, sdkAdsChoicesOptions.e, sdkAdsChoicesOptions.f, sdkAdsChoicesOptions.g, sdkAdsChoicesOptions.h));
                        }
                        adsChoices = new AdsChoices(sdkAdsChoices.b, sdkAdsChoices.c, sdkAdsChoices.d, sdkAdsChoices.e, arrayList3);
                    } else {
                        adsChoices = null;
                    }
                    videoAdInfo = new VideoAdInfo(str2, str3, str4, userId2, owner, str5, videoAdsType2, z3, str6, str7, str8, image, adsChoices);
                } else {
                    videoAdInfo = null;
                }
                d4.rb(videoAdInfo);
                return s3q0.a;
            default:
                xn50.a.c(((com.vk.posting.presentation.video.f) obj3).c, a.b.AbstractC1533a.C1534a.b);
                return s3q0.a;
        }
    }
}
