package xsna;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.Z3;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.vk.api.generated.market.dto.MarketGetItemReviewCreateConfigResponseDto;
import com.vk.api.generated.market.dto.MarketItemReviewCreateTypeHintConfigDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosResponseDto;
import com.vk.appredirects.ui.AppRedirectsSettingsFragment;
import com.vk.clips.favorites.impl.ui.folders.picker.a;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.snackbar.HideReason;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.dto.stickers.ugc.UGCChatSettingsModel;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.log.L;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.video.ui.upload.api.router.AttachedClipsArguments;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorArguments;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorModalInternalComponent;
import com.vk.voip.ui.onboarding.ui.CallOnboardingView;
import com.vk.voip.ui.settings.participants_view.CallParticipantsViewModel;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.StickerAttachment;
import com.vkontakte.android.data.b;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.am9;
import xsna.e37;
import xsna.ea6;
import xsna.eqe;
import xsna.gnd;
import xsna.ite;
import xsna.iya;
import xsna.rre;
import xsna.sn4;
import xsna.t69;
import xsna.tj50;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class go1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ go1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v30, types: [xsna.j8i, xsna.smb$a] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        DiagnosticEventRequestOuterClass.DiagnosticEvent flush$lambda$4;
        izs<? super View, s3q0> izsVar;
        List list;
        List list2;
        List list3;
        int i = this.b;
        int i2 = 12;
        int i3 = 16;
        int i4 = 10;
        int i5 = 1;
        int i6 = 11;
        int i7 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((io.reactivex.rxjava3.subjects.f) obj2).onNext((List) obj);
                return s3q0.a;
            case 1:
                View view = (View) obj;
                VkRecyclerPaginatedView vkRecyclerPaginatedView = ((AllHighlightsFragment) obj2).U;
                if (vkRecyclerPaginatedView == null) {
                    vkRecyclerPaginatedView = null;
                }
                RecyclerView.e0 findContainingViewHolder = vkRecyclerPaginatedView.getRecyclerView().findContainingViewHolder(view);
                if (findContainingViewHolder instanceof m5v) {
                    return (m5v) findContainingViewHolder;
                }
                return null;
            case 2:
                flush$lambda$4 = AndroidDiagnosticEventRepository.flush$lambda$4((AndroidDiagnosticEventRepository) obj2, (DiagnosticEventRequestOuterClass.DiagnosticEvent) obj);
                return flush$lambda$4;
            case 3:
                ((w43) obj2).q1();
                return s3q0.a;
            case 4:
                VkTopBar vkTopBar = (VkTopBar) obj2;
                int i8 = AppRedirectsSettingsFragment.L0;
                qgi0.r((tgi0) obj, "AppRedirectsSettingsFragment_topbar_tag");
                vkTopBar.setContentDescription(vkTopBar.getContext().getString(R.string.app_redirects_preference_title));
                return s3q0.a;
            case 5:
                ((rh3) obj2).C((ig3) obj);
                return s3q0.a;
            case 6:
                mn3 mn3Var = (mn3) obj2;
                VkButton vkButton = mn3Var.d;
                if (vkButton != null && (izsVar = mn3Var.b) != null) {
                    izsVar.invoke(vkButton);
                }
                return s3q0.a;
            case 7:
                wy3 wy3Var = (wy3) obj2;
                wy3Var.a.m = true;
                wy3Var.b.h();
                return s3q0.a;
            case 8:
                AttachedClipsArguments attachedClipsArguments = ((h54) obj2).c;
                AttachedClipsState attachedClipsState = (AttachedClipsState) obj;
                List<VideoFile> list4 = attachedClipsState.b;
                if (list4 == null) {
                    list4 = attachedClipsArguments.d;
                }
                List<VideoFile> list5 = attachedClipsState.e;
                if (list5 == null) {
                    list5 = attachedClipsArguments.d;
                }
                return AttachedClipsState.a(attachedClipsState, list4, null, null, list5, null, false, false, false, false, null, Z3.j);
            case 9:
                qcy<Object>[] qcyVarArr = com.vk.video.ui.upload.impl.publish.presentation.author.fragment.b.j1;
                final AuthorModalInternalComponent authorModalInternalComponent = (AuthorModalInternalComponent) ((com.vk.video.ui.upload.impl.publish.presentation.author.fragment.b) obj2).h1.getValue();
                final AuthorArguments authorArguments = authorModalInternalComponent.a.a;
                return new cn50(up2.d(new ty0((gzs) obj, authorArguments, authorModalInternalComponent, i5), new wb0() { // from class: xsna.bc5
                    @Override // xsna.izs
                    /* renamed from: j */
                    public final qj50 invoke(sj50 sj50Var) {
                        AuthorModalInternalComponent.a aVar = AuthorModalInternalComponent.i;
                        AuthorModalInternalComponent authorModalInternalComponent2 = authorModalInternalComponent;
                        nwy nwyVar = authorModalInternalComponent2.e;
                        qcy<Object>[] qcyVarArr2 = AuthorModalInternalComponent.j;
                        qcy<Object> qcyVar = qcyVarArr2[1];
                        fks0 fks0Var = (fks0) nwyVar.c();
                        nwy nwyVar2 = authorModalInternalComponent2.g;
                        qcy<Object> qcyVar2 = qcyVarArr2[3];
                        kee0 kee0Var = (kee0) nwyVar2.c();
                        nwy nwyVar3 = authorModalInternalComponent2.f;
                        qcy<Object> qcyVar3 = qcyVarArr2[2];
                        return new sb5(AuthorArguments.this, fks0Var, kee0Var, (h7v) nwyVar3.c(), sj50Var);
                    }
                }, new tti(new cd4(authorArguments, i5))));
            case 10:
                ((r46) obj2).I((UGCChatSettingsModel) obj);
                return s3q0.a;
            case 11:
                ea6.a aVar = (ea6.a) obj2;
                e1b e1bVar = aVar.d;
                ea6.e eVar = (ea6.e) obj;
                if (eVar instanceof ea6.e.b) {
                    e1bVar.i(((ea6.e.b) eVar).a);
                } else if (eVar instanceof ea6.e.c) {
                    ea6.e.c cVar = (ea6.e.c) eVar;
                    e1bVar.f(cVar.b, cVar.a);
                } else if (eVar instanceof ea6.e.d) {
                    e1bVar.b(aVar.b, aVar.c, aVar.a);
                } else {
                    e1bVar.d(new UnsupportedOperationException("Unsupported type: " + eVar));
                }
                return s3q0.a;
            case 12:
                return new l660((ViewGroup) obj, (e37.a) obj2);
            case 13:
                return new kot((ViewGroup) obj, (q69) obj2);
            case 14:
                d39 d39Var = ((CallOnboardingView) obj2).e;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj) {
                    if (!((t69.a) obj3).c) {
                        arrayList.add(obj3);
                    }
                }
                d39Var.setItems(arrayList);
                return s3q0.a;
            case 15:
                ((i330) obj2).b((CallParticipantsViewModel.c) obj);
                return s3q0.a;
            case 16:
                ((com.vk.cameraui.impl.a) obj2).g0(((Integer) obj).intValue());
                return s3q0.a;
            case 17:
                return new iya.a(((tj50.a) obj).a(new gya(1, (fya) obj2, fya.class, "composeContent", "composeContent(Lcom/vk/channels/impl/donut/ChannelDonutSupportState;)Lcom/vk/channels/impl/donut/ui/state/ChannelDonutSupportViewState$Data$Content;", 0), sd9.d));
            case 18:
                Throwable th = (Throwable) obj;
                ?? r2 = ((smb) obj2).c;
                if (r2 != 0) {
                    r2.L(th);
                }
                return s3q0.a;
            case 19:
                return new ew8((FragmentActivity) ((Activity) obj2), (List) obj);
            case 20:
                rgd rgdVar = (rgd) obj2;
                ClipsEditorMusicInfo clipsEditorMusicInfo = (ClipsEditorMusicInfo) obj;
                if (clipsEditorMusicInfo.j) {
                    MusicTrack c = hxd.c(clipsEditorMusicInfo.b);
                    io.reactivex.rxjava3.subjects.f fVar = new io.reactivex.rxjava3.subjects.f();
                    final Uri parse = Uri.parse(c.i);
                    final long j = c.c0;
                    final Context context = rgdVar.a;
                    io.reactivex.rxjava3.internal.operators.observable.q qVar = new io.reactivex.rxjava3.internal.operators.observable.q(new io.reactivex.rxjava3.core.s() { // from class: xsna.pgd
                        @Override // io.reactivex.rxjava3.core.s
                        public final void subscribe(io.reactivex.rxjava3.core.r rVar) {
                            long j2 = j;
                            File i9 = com.vk.core.files.a.i(context, parse);
                            File e = PrivateFiles.e(e8r.a, PrivateSubdir.CLIPS_AUDIO, System.currentTimeMillis() + "_audio", "aac", 24);
                            if (e.exists() && e.length() > 0) {
                                rVar.onNext(new sn4.b(e));
                                rVar.onComplete();
                                return;
                            }
                            try {
                                new pn4(new qn4(i9, e, j2), new a8(rVar, 27)).a();
                            } catch (Exception e2) {
                                L.i(e2);
                                vhk0.b(e);
                                rVar.onError(e2);
                            }
                            rVar.onNext(new sn4.b(e));
                            rVar.onComplete();
                        }
                    });
                    asu0.a.getClass();
                    rgdVar.g = cug0.a(qVar.r0(asu0.i()).F(new fu0(new pt(i3), i6)).a0(io.reactivex.rxjava3.android.schedulers.a.b()), context, new gtl(3), fVar, new com.vk.movika.sdk.base.model.b(rgdVar, 21)).subscribe(new tf1(new ogd(clipsEditorMusicInfo, rgdVar, fVar, i7), i6), new um0(new dsc(rgdVar, 2), i3));
                } else {
                    rgdVar.a(clipsEditorMusicInfo);
                }
                nf9 nf9Var = nf9.b;
                nf9Var.getClass();
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA_CLIPS;
                StoryPublishEvent storyPublishEvent = StoryPublishEvent.APPLY_MUSIC_CAMERA;
                am9.a aVar2 = new am9.a();
                aVar2.j = com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen);
                nf9.b(nf9Var, storyPublishEvent, aVar2, null, null, true, null, 108).e();
                return s3q0.a;
            case 21:
                tj50.a aVar3 = (tj50.a) obj;
                fnd fndVar = (fnd) ((dnd) obj2).d.getValue();
                fndVar.getClass();
                j60 j60Var = new j60(fndVar, 9);
                ao8 ao8Var = ao8.d;
                return new gnd.a.C2950a(aVar3.a(j60Var, ao8Var), aVar3.a(new x4(fndVar, i3), ao8Var), aVar3.a(new k60(fndVar), ao8Var), aVar3.a(new n82(fndVar, i6), ao8Var), aVar3.a(new ob(fndVar, i4), ao8Var), aVar3.a(new mo1(fndVar, i2), ao8Var), aVar3.a(new qb(13), ao8Var), aVar3.a(new com.vk.movika.sdk.base.observable.q(fndVar, 23), ao8Var), aVar3.a(new com.vk.movika.sdk.base.observable.s(fndVar), ao8Var));
            case 22:
                ((p4e) obj2).b.invoke(a.C0604a.b);
                return s3q0.a;
            case 23:
                nre nreVar = (nre) obj2;
                ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto = (ShortVideoGetOwnerVideosResponseDto) obj;
                nreVar.q = false;
                List e = ums0.e(ums0.a, shortVideoGetOwnerVideosResponseDto.e(), shortVideoGetOwnerVideosResponseDto.j(), shortVideoGetOwnerVideosResponseDto.d(), false, 52);
                nreVar.T(new rre.a(19, shortVideoGetOwnerVideosResponseDto.i(), shortVideoGetOwnerVideosResponseDto.g(), null, e));
                hqe hqeVar = nreVar.o;
                if (hqeVar != null) {
                    List list6 = e;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list6, 10));
                    Iterator it = list6.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(nreVar.j.c((VideoFile) it.next()));
                    }
                    hqeVar.b(new eqe.b(shortVideoGetOwnerVideosResponseDto.g(), arrayList2, true));
                }
                return s3q0.a;
            case 24:
                tj50.a aVar4 = (tj50.a) obj;
                hte hteVar = (hte) ((fte) obj2).d.getValue();
                hteVar.getClass();
                bz bzVar = new bz(i6);
                ao8 ao8Var2 = ao8.d;
                return new ite.a.C3080a(aVar4.a(bzVar, ao8Var2), aVar4.a(new dz(i2), ao8Var2), aVar4.a(new g8(hteVar), ao8Var2), aVar4.a(new i8(22), ao8Var2), aVar4.a(new com.vk.movika.sdk.base.observable.i(hteVar, 14), ao8Var2), aVar4.a(new j60(i4), ao8Var2), aVar4.a(new x4(19), ao8Var2));
            case 25:
                ((tpg) obj2).i.invoke((String) obj);
                return s3q0.a;
            case 26:
                jtg jtgVar = (jtg) obj2;
                if (((HideReason) obj) == HideReason.Swipe) {
                    jtgVar.g.a(4, false);
                    jtgVar.d.b();
                    CatchUpBanner catchUpBanner = jtgVar.b;
                    b.d a = io.reactivex.rxjava3.processors.b.a("catch_up_link_action", "action", "hide");
                    a.b(catchUpBanner.j, "track_code");
                    a.e();
                } else {
                    jtgVar.d.b();
                }
                return s3q0.a;
            case 27:
                ((d3h) ((m3h) obj2).c.invoke()).h(null, ((Boolean) obj).booleanValue());
                return s3q0.a;
            case 28:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) obj2;
                int i9 = CommunityReviewsFragment.o0;
                c.u.h hVar = new c.u.h("", Collections.singletonList((StickerAttachment) obj));
                communityReviewsFragment.getClass();
                xn50.a.c(communityReviewsFragment, hVar);
                return s3q0.a;
            default:
                iq6 iq6Var = (iq6) obj2;
                MarketGetItemReviewCreateConfigResponseDto marketGetItemReviewCreateConfigResponseDto = (MarketGetItemReviewCreateConfigResponseDto) obj;
                String d = marketGetItemReviewCreateConfigResponseDto.d();
                List<MarketItemReviewCreateTypeHintConfigDto> d2 = marketGetItemReviewCreateConfigResponseDto.e().d();
                if (d2 != null) {
                    iq6Var.getClass();
                    list = iq6.c(d2);
                } else {
                    list = EmptyList.b;
                }
                List<MarketItemReviewCreateTypeHintConfigDto> e2 = marketGetItemReviewCreateConfigResponseDto.e().e();
                if (e2 != null) {
                    iq6Var.getClass();
                    list2 = iq6.c(e2);
                } else {
                    list2 = EmptyList.b;
                }
                List<MarketItemReviewCreateTypeHintConfigDto> f = marketGetItemReviewCreateConfigResponseDto.e().f();
                if (f != null) {
                    iq6Var.getClass();
                    list3 = iq6.c(f);
                } else {
                    list3 = EmptyList.b;
                }
                return new a8k(list, list2, list3, d);
        }
    }
}
