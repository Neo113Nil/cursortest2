package xsna;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.ads.api.newsfeed.WallAdsEasyPromoteUrlBuilder;
import com.vk.api.generated.apps.dto.AppsPerformOnboardingPanelActionDto;
import com.vk.api.generated.notifications.dto.NotificationsGetRedesignSettingsResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingsSectionRedesignDto;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.bridges.ImageViewer;
import com.vk.catalog.mvi.section.screen.impl.ui.entity.CatalogSectionScreenState;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.ui.mvp.holder.group.FilterButtonVh;
import com.vk.clips.clipsaudio.views.ClipsAudioFragment;
import com.vk.clips.entrypoints.params.ClipsEntryPointsParams;
import com.vk.clips.entrypoints.params.ClipsMediaPickerTab;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.gift.CatalogedGift;
import com.vk.dto.group.Group;
import com.vk.dto.hints.HintId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.photo.Photo;
import com.vk.dto.profile.Occupation;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.ecomm.catalog.impl.catalog.simple.b;
import com.vk.ecomm.reviews.api.model.ReviewsActionType;
import com.vk.ecomm.reviews.ui.reviewheader.ReviewHeaderView;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.friends.api.FollowersInitialTab;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.ui.bridges.MaxButtonVariants;
import com.vk.im.ui.max.MaxRedirectHandler;
import com.vk.libvideo.api.UploadVideoAction;
import com.vk.libvideo.autoplay.b;
import com.vk.media.utils.CodecInitException;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayUserSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.profile.user.impl.ui.edit.cover.picker.CoverPickerActivity;
import com.vk.profile.user.impl.ui.f;
import com.vk.profile.user.impl.ui.scheduled_clips.UserScheduledClipsGridFragment;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.search.fragment.RestoreSearchFragment;
import com.vk.search.models.VkRelation;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipCoownersItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsClipItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsGridItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$AnotherUserProfileEvent;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stories.design.view.viewer.StoryViewHeader;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.core.js.bridge.api.events.StorageGet$Response;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.toggle.features.ComFeatures;
import com.vk.video.profile.presentation.f;
import com.vk.video.profile.presentation.h;
import com.vk.voip.ui.broadcast.list.ui.PastBroadcastsFragment;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.chromium.net.NetError;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aex;
import xsna.bhd;
import xsna.c0e0;
import xsna.d960;
import xsna.dzh;
import xsna.e6w0;
import xsna.gm50;
import xsna.h7u0;
import xsna.ikv0;
import xsna.k840;
import xsna.kyh;
import xsna.nyd0;
import xsna.oap;
import xsna.rv9;
import xsna.sum0;
import xsna.sw50;
import xsna.tzp0;
import xsna.u;
import xsna.wk50;
import xsna.y050;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class lfa implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lfa(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:229:0x0641, code lost:
    
        if (r6.equals("university") == false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x06f4, code lost:
    
        r5 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x06f9, code lost:
    
        if (r7 != null) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x06fb, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x06fd, code lost:
    
        r5.append(r7);
        r2 = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0702, code lost:
    
        if (r2 == null) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x070c, code lost:
    
        if (r2.longValue() <= 0) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x070f, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0710, code lost:
    
        if (r2 == null) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0712, code lost:
    
        r5.append(java.lang.String.format(" '%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(r2.longValue() % 100)}, r20)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0731, code lost:
    
        r2 = r5.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0739, code lost:
    
        if (xsna.myc0.f(r2) == false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x073b, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0740, code lost:
    
        if (r22 == null) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0742, code lost:
    
        r20 = new xsna.uyd0(com.vkontakte.android.R.drawable.vk_icon_education_outline_20, r22, null, null, 44);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x073e, code lost:
    
        r22 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x06f1, code lost:
    
        if (r6.equals("school") == false) goto L262;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0bf3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0421  */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v118, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v51, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v56, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        UserId c;
        int i;
        int i2;
        ArrayList<String> arrayList;
        uyd0 uyd0Var;
        final Group group;
        Group group2;
        VkRelation vkRelation;
        String a;
        String str;
        Pair pair;
        Pair pair2;
        int i3 = 4;
        int i4 = 7;
        int i5 = 3;
        int i6 = 8;
        int i7 = 0;
        int i8 = 1;
        switch (this.b) {
            case 0:
                cfa cfaVar = (cfa) this.c;
                return CatalogSectionScreenState.a((CatalogSectionScreenState) obj, null, cfaVar.b, cfaVar.c, null, (mm50) this.d, 9);
            case 1:
                s8d s8dVar = (s8d) this.c;
                ivc ivcVar = (ivc) this.d;
                Throwable th = (Throwable) obj;
                AtomicInteger atomicInteger = s8dVar.e;
                if (atomicInteger.get() > 1) {
                    for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                        if (th2.getClass().equals(MediaCodec.CodecException.class)) {
                            s8dVar.d.add(ivcVar);
                            lyd.a.d(Arrays.copyOf(new Object[]{"ClipParallelProcessor", "task " + ivcVar + " failed with codec problem, decrease pool size to " + atomicInteger.decrementAndGet()}, 2));
                            z = true;
                            return Boolean.valueOf(z);
                        }
                        if (th2.equals(th2.getCause())) {
                            while (th != null) {
                                if (th.getClass().equals(CodecInitException.class)) {
                                    s8dVar.d.add(ivcVar);
                                    lyd.a.d(Arrays.copyOf(new Object[]{"ClipParallelProcessor", "task " + ivcVar + " failed with codec problem, decrease pool size to " + atomicInteger.decrementAndGet()}, 2));
                                    z = true;
                                    return Boolean.valueOf(z);
                                }
                                if (!th.equals(th.getCause())) {
                                    th = th.getCause();
                                }
                            }
                        }
                    }
                    while (th != null) {
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 2:
                ClipsAudioFragment clipsAudioFragment = (ClipsAudioFragment) this.c;
                ClipsAudioFragment.b bVar = (ClipsAudioFragment.b) this.d;
                bhd.a aVar = (bhd.a) obj;
                int i9 = ClipsAudioFragment.Y;
                gm50.a.a(clipsAudioFragment, aVar.a, new sh3(i4, clipsAudioFragment, bVar));
                gm50.a.a(clipsAudioFragment, aVar.c, new j5(clipsAudioFragment, bVar));
                gm50.a.a(clipsAudioFragment, aVar.d, new ku1(9, clipsAudioFragment, bVar));
                gm50.a.a(clipsAudioFragment, aVar.b, new wqb(1, clipsAudioFragment, bVar));
                gm50.a.a(clipsAudioFragment, aVar.e, new ri0(i4, clipsAudioFragment, bVar));
                return s3q0.a;
            case 3:
                ryh ryhVar = (ryh) this.c;
                kyh.i iVar = (kyh.i) this.d;
                u60 u60Var = (u60) obj;
                if (u60Var == ReviewsActionType.ACTION_COPY_TEXT) {
                    ryhVar.b.c(new dzh.d(iVar.b.h.c.a.toString()));
                } else if (u60Var == ReviewsActionType.ACTION_EDIT) {
                    ryhVar.b.c(new dzh.h(iVar.b.b));
                } else if (u60Var == ReviewsActionType.ACTION_REPORT) {
                    ryhVar.b.c(new dzh.c(iVar.b));
                } else if (u60Var == ReviewsActionType.ACTION_DELETE) {
                    ryhVar.b.c(new dzh.g(iVar.b.b));
                } else if (u60Var == ReviewsActionType.ACTION_LIKE) {
                    ryhVar.b.c(new dzh.k(iVar.b.b));
                } else if (u60Var == ReviewsActionType.ACTION_REPLY) {
                    a0i<zzh> a0iVar = ryhVar.b;
                    qxh qxhVar = iVar.b;
                    a0iVar.c(new dzh.l(qxhVar.b, qxhVar.c));
                } else if (u60Var == ReviewsActionType.ACTION_PIN) {
                    ryhVar.b.c(new dzh.n.d(iVar.b.b));
                } else if (u60Var == ReviewsActionType.ACTION_UNPIN) {
                    ryhVar.b.c(new dzh.n.i(iVar.b.b));
                }
                return s3q0.a;
            case 4:
                vop vopVar = (vop) this.c;
                String str2 = (String) this.d;
                VkAuthValidatePhoneResult vkAuthValidatePhoneResult = (VkAuthValidatePhoneResult) obj;
                SignUpDataHolder signUpDataHolder = vopVar.p;
                SignUpDataHolder signUpDataHolder2 = signUpDataHolder != null ? signUpDataHolder : null;
                if (signUpDataHolder == null) {
                    signUpDataHolder = null;
                }
                signUpDataHolder2.I = VkAuthMetaInfo.zb(signUpDataHolder.I, SilentAuthSource.BY_PHONE, null, null, 55);
                tir0.b(vopVar.z, str2, vkAuthValidatePhoneResult, true, 8);
                return s3q0.a;
            case 5:
                FilterButtonVh filterButtonVh = (FilterButtonVh) this.c;
                CatalogFilterData catalogFilterData = (CatalogFilterData) this.d;
                if (!catalogFilterData.e) {
                    eda edaVar = filterButtonVh.b;
                    String str3 = catalogFilterData.b;
                    View view = filterButtonVh.c;
                    if (view == null) {
                        view = null;
                    }
                    io.reactivex.rxjava3.disposables.c c2 = eda.c(edaVar, str3, new oap.a(view.getContext()), null, 12);
                    View view2 = filterButtonVh.c;
                    hg1.b(view2 == null ? null : view2, c2);
                }
                return s3q0.a;
            case 6:
                dex.a((ImageView) ((wex) this.c).u0.getValue(), ((aex.a) this.d).b().c0);
                return s3q0.a;
            case 7:
                p3y p3yVar = (p3y) this.c;
                String str4 = (String) this.d;
                JSONArray jSONArray = (JSONArray) obj;
                y1n0 X0 = p3yVar.X0();
                X0.getClass();
                ArrayList arrayList2 = new ArrayList();
                int length = jSONArray.length();
                while (i7 < length) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i7);
                    arrayList2.add(new StorageGet$Response.Data.Keys(jSONObject.getString("key"), jSONObject.getString("value")));
                    i7++;
                }
                com.vk.superapp.base.js.bridge.b.p(X0.a, new JsMethod("VKWebAppStorageGet"), new StorageGet$Response(null, new StorageGet$Response.Data(arrayList2, str4), str4, 1, null), null, null, false, null, 60);
                return s3q0.a;
            case 8:
                b.C0929b c0929b = (b.C0929b) this.c;
                com.vk.ecomm.catalog.impl.catalog.simple.b bVar2 = (com.vk.ecomm.catalog.impl.catalog.simple.b) this.d;
                View view3 = (View) obj;
                yfc yfcVar = c0929b.a;
                if (yfcVar == null || (c = yfcVar.c()) == null) {
                    return s3q0.a;
                }
                Integer a2 = yfcVar.a();
                if (a2 == null) {
                    return s3q0.a;
                }
                bVar2.j.d(a2.intValue(), view3.getContext(), c);
                return s3q0.a;
            case 9:
                d960.b.a aVar2 = (d960.b.a) this.c;
                d960 d960Var = (d960) this.d;
                String str5 = ((gd80) aVar2.m).d;
                if (str5 != null) {
                    d960Var.o.B(new f.e.o0(null, str5));
                }
                return s3q0.a;
            case 10:
                n7p0 n7p0Var = (n7p0) this.c;
                String str6 = (String) this.d;
                ((etv0) obj).b(false);
                n7p0Var.a();
                pla.e().b().b(str6);
                hl60.d = null;
                return s3q0.a;
            case 11:
                hg70 hg70Var = (hg70) this.c;
                String str7 = (String) this.d;
                List<NotificationsNotificationSettingsSectionRedesignDto> d = ((NotificationsGetRedesignSettingsResponseDto) obj).d();
                if (d == null) {
                    return s3q0.a;
                }
                for (NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto : d) {
                    if (epx.f(notificationsNotificationSettingsSectionRedesignDto.getId(), str7)) {
                        hg70Var.l.getClass();
                        hg70Var.T(new vg70(notificationsNotificationSettingsSectionRedesignDto, Preference.j().getBoolean("showMusicSuggestNotification", false)));
                        return s3q0.a;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 12:
                TextView textView = (TextView) this.c;
                PastBroadcastsFragment pastBroadcastsFragment = (PastBroadcastsFragment) this.d;
                int i10 = PastBroadcastsFragment.U;
                textView.setText(j03.g(pastBroadcastsFragment.mo2getContext(), (Throwable) obj, R.string.error));
                return s3q0.a;
            case 13:
                izs izsVar = (izs) this.c;
                com.vk.channels.impl.post_settings.b bVar3 = (com.vk.channels.impl.post_settings.b) this.d;
                j7c0 j7c0Var = (j7c0) obj;
                j7c0 a3 = j7c0.a(j7c0Var, (ChannelMsgSendConfig) izsVar.invoke(j7c0Var.a), null, null, null, false, 30);
                bVar3.s(a3.a, null);
                return a3;
            case 14:
                umc0 umc0Var = (umc0) this.c;
                ArrayList<String> arrayList3 = (ArrayList) this.d;
                List list = (List) obj;
                if (!umc0Var.c) {
                    umc0Var.a(arrayList3, list);
                } else if (list.isEmpty()) {
                    for (String str8 : arrayList3) {
                        LinkAttachment linkAttachment = new LinkAttachment(str8);
                        umc0Var.e.put(linkAttachment, str8);
                        umc0Var.b.A1(linkAttachment);
                    }
                } else {
                    umc0Var.a(arrayList3, list);
                }
                return s3q0.a;
            case 15:
                ((wk50.a) this.c).a(new rv9.i.a((a.C0919a) this.d));
                return s3q0.a;
            case 16:
                exd0 exd0Var = (exd0) this.c;
                exd0Var.l.f((List) this.d, (List) obj);
                exd0Var.x7();
                return s3q0.a;
            case 17:
                return ReviewHeaderView.a((ReviewHeaderView) this.c, (vhg0) this.d);
            case 18:
                eyh0 eyh0Var = (eyh0) this.c;
                RestoreSearchFragment.b.a aVar3 = (RestoreSearchFragment.b.a) this.d;
                UserProfile userProfile = (UserProfile) eyh0Var.m;
                if (userProfile != null) {
                    aVar3.invoke(userProfile);
                }
                return s3q0.a;
            case 19:
                azl azlVar = (azl) this.c;
                uco ucoVar = (uco) obj;
                ((wh50) this.d).setValue(new q9x((azlVar.r0(uco.c(ucoVar.a)) << 32) | (azlVar.r0(uco.b(ucoVar.a)) & 4294967295L)));
                return s3q0.a;
            case 20:
                ((izs) this.c).invoke(((StoryViewHeader) this.d).j);
                return s3q0.a;
            case 21:
                izs izsVar2 = (izs) this.c;
                sum0.d dVar = (sum0.d) this.d;
                Integer m = arm0.m(10, (String) obj);
                if (m != null) {
                    izsVar2.invoke(sum0.d.a(dVar, null, null, null, false, null, false, null, false, m.intValue(), null, false, false, 3839));
                }
                return s3q0.a;
            case 22:
                final FragmentActivity fragmentActivity = (FragmentActivity) this.c;
                final rhq0 rhq0Var = (rhq0) this.d;
                qdz qdzVar = rhq0Var.d;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj;
                ArrayList arrayList4 = new ArrayList();
                int i11 = extendedUserProfile.s;
                if (i11 > 0) {
                    arrayList4.add(new uyd0(R.drawable.vk_icon_gift_outline_20, fragmentActivity.getString(R.string.profile_birthday, extendedUserProfile.r > 0 ? String.format("%d %s %d", Arrays.copyOf(new Object[]{Integer.valueOf(i11), fragmentActivity.getResources().getStringArray(R.array.vk_months_full)[Math.min(11, extendedUserProfile.t - 1)], Integer.valueOf(extendedUserProfile.r)}, 3)) : String.format("%d %s", Arrays.copyOf(new Object[]{Integer.valueOf(i11), fragmentActivity.getResources().getStringArray(R.array.vk_months_full)[Math.min(11, extendedUserProfile.t - 1)]}, 2))), "user_details_item_birthday_test_tag", new c0(i6, extendedUserProfile, fragmentActivity), 20));
                }
                ArrayList<String> arrayList5 = extendedUserProfile.t1;
                if ((arrayList5 == null || arrayList5.contains("city")) && !TextUtils.isEmpty(extendedUserProfile.s0)) {
                    arrayList4.add(new uyd0(R.drawable.vk_icon_home_outline_20, fragmentActivity.getString(R.string.profile_lives_in, extendedUserProfile.s0), "user_details_item_city_test_tag", null, 36));
                }
                int i12 = extendedUserProfile.u;
                if (i12 > 0) {
                    long j = i12;
                    VkRelation[] values = VkRelation.values();
                    int length2 = values.length;
                    while (true) {
                        if (i7 < length2) {
                            vkRelation = values[i7];
                            i2 = i8;
                            if (vkRelation.id != j) {
                                i7++;
                                i8 = i2;
                            }
                        } else {
                            i2 = i8;
                            vkRelation = VkRelation.none;
                        }
                    }
                    if (extendedUserProfile.v > 0) {
                        boolean z2 = !extendedUserProfile.a.K().booleanValue();
                        StringBuilder sb = new StringBuilder("[id");
                        sb.append(extendedUserProfile.v);
                        sb.append('|');
                        a = vkRelation.b(fragmentActivity, z2, ho8.a(sb, extendedUserProfile.w, ']'));
                    } else {
                        a = vkRelation.a(fragmentActivity, !extendedUserProfile.a.K().booleanValue());
                    }
                    i = 3;
                    arrayList4.add(new uyd0(R.drawable.vk_icon_like_outline_20, qdzVar.a().m(a), null, new u970(extendedUserProfile, rhq0Var, fragmentActivity, i), 24));
                } else {
                    i = 3;
                    i2 = 1;
                }
                Occupation occupation = extendedUserProfile.L;
                if (occupation != null) {
                    String str9 = occupation.b;
                    String str10 = occupation.d;
                    if (str9 != null) {
                        int hashCode = str9.hashCode();
                        if (hashCode == -907977868) {
                            break;
                        } else if (hashCode != 3655441) {
                            if (hashCode == 189328014) {
                                break;
                            }
                        } else if (str9.equals("work")) {
                            ArrayList<Group> arrayList6 = extendedUserProfile.K;
                            if (arrayList6 != null) {
                                Iterator<Group> it = arrayList6.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        group2 = it.next();
                                        if (epx.f(group2.c, new UserId(occupation.c))) {
                                        }
                                    } else {
                                        group2 = null;
                                    }
                                }
                                group = group2;
                            } else {
                                group = null;
                            }
                            if (group != null) {
                                StringBuilder sb2 = new StringBuilder("[club");
                                sb2.append(group.c);
                                sb2.append('|');
                                uyd0Var = new uyd0(R.drawable.vk_icon_work_outline_20, qdzVar.a().m(fragmentActivity.getString(R.string.profile_works_at, ho8.a(sb2, group.d, ']'))), null, null, 44);
                                uyd0Var.o.add(group.e);
                                uyd0Var.l = new Runnable() { // from class: xsna.phq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        rhq0.this.e.c().b(fragmentActivity, fkq0.e(group.c));
                                    }
                                };
                                if (uyd0Var != null) {
                                    arrayList4.add(uyd0Var);
                                }
                            } else if (str10 != null) {
                                uyd0 uyd0Var2 = new uyd0(R.drawable.vk_icon_work_outline_20, qdzVar.a().m(fragmentActivity.getString(R.string.profile_works_at, str10)), null, null, 44);
                                uyd0Var = uyd0Var2;
                                if (uyd0Var != null) {
                                }
                            }
                        }
                    }
                    uyd0Var = null;
                    if (uyd0Var != null) {
                    }
                }
                if (!extendedUserProfile.A1 && (((arrayList = extendedUserProfile.t1) == null || arrayList.contains("followers")) && extendedUserProfile.Z0.containsKey("followers") && extendedUserProfile.b("followers") > 0)) {
                    arrayList4.add(new uyd0(R.drawable.vk_icon_followers_outline_20, uqm0.k(extendedUserProfile.b("followers"), R.plurals.community_subscribers), null, new e0(9, rhq0Var, fragmentActivity), 92));
                }
                if (!arrayList4.isEmpty()) {
                    we6 we6Var = (we6) arrayList4.get(0);
                    if (!myc0.f(extendedUserProfile.k) && !myc0.f(extendedUserProfile.A0)) {
                        i = 4;
                    }
                    we6Var.j(i);
                }
                return arrayList4;
            case 23:
                UserProfileFragment userProfileFragment = (UserProfileFragment) this.c;
                ?? r2 = userProfileFragment.j0;
                bpn0 bpn0Var = userProfileFragment.f0;
                fpq0 fpq0Var = (fpq0) this.d;
                com.vk.profile.user.impl.ui.f fVar = (com.vk.profile.user.impl.ui.f) obj;
                int i13 = UserProfileFragment.p0;
                final FragmentActivity activity = userProfileFragment.getActivity();
                nbs nbsVar = userProfileFragment.T;
                if (activity == null) {
                    return s3q0.a;
                }
                if (fVar instanceof f.d.a) {
                    com.vk.profile.user.impl.ui.i iVar2 = userProfileFragment.Q;
                    if (iVar2 == null) {
                        iVar2 = null;
                    }
                    UserProfileHeaderView userProfileHeaderView = iVar2.h.e;
                    userProfileHeaderView.getClass();
                    userProfileHeaderView.post(new js6(userProfileHeaderView, i4));
                } else if (fVar.equals(f.d.c.a)) {
                    com.vk.profile.user.impl.ui.i iVar3 = userProfileFragment.Q;
                    if (iVar3 == null) {
                        iVar3 = null;
                    }
                    RecyclerView recyclerView = iVar3.f;
                    recyclerView.scrollToPosition(1);
                    recyclerView.smoothScrollToPosition(0);
                } else if (fVar instanceof f.d.b) {
                    final com.vk.profile.user.impl.ui.i iVar4 = userProfileFragment.Q;
                    if (iVar4 == null) {
                        iVar4 = null;
                    }
                    f.d.b bVar4 = (f.d.b) fVar;
                    final int i14 = bVar4.a;
                    final boolean z3 = bVar4.b;
                    wjf0.c(iVar4.f, new gzs() { // from class: xsna.ayq0
                        @Override // xsna.gzs
                        public final Object invoke() {
                            RecyclerView recyclerView2 = iVar4.f;
                            boolean z4 = z3;
                            int i15 = i14;
                            if (z4) {
                                recyclerView2.smoothScrollToPosition(i15);
                            } else {
                                recyclerView2.scrollToPosition(i15);
                            }
                            return s3q0.a;
                        }
                    });
                } else if (fVar instanceof f.i) {
                    ((jlu0) userProfileFragment.d0.getValue()).h(userProfileFragment.kn(), MultiAccountEntryPoint.ProfileMenu.d);
                } else if (fVar instanceof f.j) {
                    Context mo2getContext = userProfileFragment.mo2getContext();
                    if (mo2getContext != null) {
                        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                        if (superappUiRouterBridge == null) {
                            superappUiRouterBridge = null;
                        }
                        superappUiRouterBridge.r0(mo2getContext);
                    }
                } else {
                    if (fVar instanceof f.k.c) {
                        throw null;
                    }
                    if (fVar instanceof f.k.b) {
                        throw null;
                    }
                    if (fVar instanceof f.k.d) {
                        View view4 = ((f.k.d) fVar).a.get();
                        if (view4 != null) {
                            ((k0e0) bpn0Var.getValue()).a(nbsVar.getLifecycle(), view4);
                        }
                    } else if (fVar instanceof f.k.a) {
                        f.k.a aVar4 = (f.k.a) fVar;
                        if (!(aVar4 instanceof f.k.a.C1727a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        View view5 = aVar4.a.get();
                        if (view5 != null && !((k0e0) bpn0Var.getValue()).b(nbsVar.getLifecycle(), view5, aVar4.b)) {
                            f.k.a.C1727a c1727a = (f.k.a.C1727a) aVar4;
                            if (c1727a.c && (str = c1727a.d) != null && !((h7v) userProfileFragment.ho().o.getValue()).n() && ((h7v) userProfileFragment.ho().o.getValue()).p(HintId.USER_PROFILE_MAIN_WALL_POST_OPTIONS_ONBOARDING.getId()) == null) {
                                ((q7v0) r2.getValue()).init();
                                ((q7v0) r2.getValue()).c(new ume0(i6, userProfileFragment, str));
                            }
                        }
                    } else if (fVar instanceof f.a.C1716f) {
                        com.vk.profile.user.impl.ui.i iVar5 = userProfileFragment.Q;
                        if (iVar5 == null) {
                            iVar5 = null;
                        }
                        iVar5.h.getClass();
                    }
                }
                final xsq0 xsq0Var = fpq0Var.h;
                if (fVar instanceof f.c) {
                    UserProfileDialogs userProfileDialogs = fpq0Var.j;
                    userProfileDialogs.j.post(new rfw((f.c) fVar, userProfileDialogs, activity, i5));
                } else if (fVar instanceof f.e) {
                    final f.e eVar = (f.e) fVar;
                    xsq0Var.l.post(new Runnable() { // from class: xsna.tsq0
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r2v57, types: [java.lang.Object, kotlin.Lazy] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
                            e.b bVar5;
                            String str11;
                            UserId userId;
                            UserId userId2;
                            ww50<?> Y;
                            FragmentImpl u;
                            UserId I0;
                            boolean z4;
                            UserId userId3;
                            ww50<?> Y2;
                            FragmentImpl u2;
                            ImageViewer.c<Photo> g;
                            f.e eVar2 = f.e.this;
                            final xsq0 xsq0Var2 = xsq0Var;
                            FragmentActivity fragmentActivity2 = activity;
                            if (epx.f(eVar2, f.e.g.a)) {
                                xsq0Var2.a.a.b().t(fragmentActivity2, xsq0Var2.d.a.b, null, "profile_page", "vkapp_profile_page");
                                return;
                            }
                            if (eVar2 instanceof f.e.k1) {
                                xyd0 xyd0Var = ((f.e.k1) eVar2).a;
                                int i15 = xyd0Var.a;
                                List<Photo> list2 = xyd0Var.b;
                                izd0 izd0Var = xyd0Var.c;
                                xsq0Var2.getClass();
                                g = myc0.d().g(i15, list2, fragmentActivity2, izd0Var, o25.a().c());
                                izd0Var.h = g;
                                return;
                            }
                            if (eVar2 instanceof f.e.l) {
                                f.e.l lVar = (f.e.l) eVar2;
                                sw50.f g2 = xsq0Var2.a.g.g();
                                bc6 L = xa4.L(fragmentActivity2);
                                UserProfile userProfile2 = lVar.a.a;
                                g2.c(L, userProfile2.c, userProfile2.e, lVar.b);
                                return;
                            }
                            if (eVar2 instanceof f.e.j) {
                                ExtendedUserProfile extendedUserProfile2 = ((f.e.j) eVar2).a;
                                xsq0Var2.getClass();
                                UserProfile userProfile3 = extendedUserProfile2.a;
                                if (userProfile3 == null) {
                                    return;
                                }
                                com.vk.storycamera.builder.a aVar5 = new com.vk.storycamera.builder.a(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.PROFILE_AVATAR);
                                aVar5.E0 = true;
                                aVar5.q(userProfile3.c, userProfile3.e, userProfile3.h);
                                if (!xsq0Var2.f.m()) {
                                    aVar5.h = Collections.singletonList(StoryCameraMode.CLIPS);
                                }
                                aVar5.C(fragmentActivity2);
                                return;
                            }
                            if (eVar2 instanceof f.e.q1) {
                                xsq0Var2.c(fragmentActivity2, ((f.e.q1) eVar2).a);
                                return;
                            }
                            if (eVar2 instanceof f.e.q) {
                                xsq0Var2.c(fragmentActivity2, ((f.e.q) eVar2).a);
                                return;
                            }
                            if (eVar2 instanceof f.e.d) {
                                ExtendedUserProfile extendedUserProfile3 = ((f.e.d) eVar2).a;
                                xsq0Var2.e.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.CALL_OUT);
                                x69.c(fragmentActivity2, extendedUserProfile3.a, new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.PROFILE, MobileOfficialAppsCoreNavStat$EventScreen.PROFILE), MaxButtonVariants.ForInstalledOnly);
                                return;
                            }
                            int i16 = 0;
                            String str12 = null;
                            str12 = null;
                            if (eVar2 instanceof f.e.b) {
                                final f.e.b bVar6 = (f.e.b) eVar2;
                                xsq0Var2.getClass();
                                if (bVar6 instanceof f.e.b.a.C1720a) {
                                    khw0 a4 = a201.b().a();
                                    ((f.e.b.a.C1720a) bVar6).getClass();
                                    a4.d(null);
                                    return;
                                }
                                if (bVar6 instanceof f.e.b.a.c) {
                                    khw0 a5 = a201.b().a();
                                    ((f.e.b.a.c) bVar6).getClass();
                                    a5.d(null);
                                    return;
                                }
                                if (epx.f(bVar6, f.e.b.a.C1721b.a)) {
                                    xsq0Var2.j.j7().a(MaxRedirectHandler.Entrypoint.Calls);
                                    return;
                                }
                                if (bVar6 instanceof f.e.b.d.a) {
                                    ((f.e.b.d.a) bVar6).getClass();
                                    xsq0Var2.c(fragmentActivity2, null);
                                    return;
                                }
                                if (bVar6 instanceof f.e.b.d.C1723b) {
                                    ((f.e.b.d.C1723b) bVar6).getClass();
                                    xsq0Var2.c(fragmentActivity2, null);
                                    throw null;
                                }
                                if (bVar6 instanceof f.e.b.d.c) {
                                    ((f.e.b.d.c) bVar6).getClass();
                                    xsq0Var2.c(fragmentActivity2, null);
                                    throw null;
                                }
                                if (bVar6 instanceof f.e.b.C1722b) {
                                    sw50.d h = xsq0Var2.a.g.h();
                                    ((f.e.b.C1722b) bVar6).getClass();
                                    h.e(fragmentActivity2, 0, true, new whg0(bVar6, 16));
                                    return;
                                } else {
                                    if (!(bVar6 instanceof f.e.b.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h7u0.a aVar6 = new h7u0.a(fragmentActivity2);
                                    aVar6.g0(R.string.confirm);
                                    aVar6.U(R.string.delete_photo_confirm);
                                    aVar6.c0(R.string.yes, new DialogInterface.OnClickListener() { // from class: xsna.vsq0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i17) {
                                            kpq0 kpq0Var = xsq0.this.g;
                                            ((f.e.b.c) bVar6).getClass();
                                            kpq0Var.a(new UserProfileAction.d.a.C1674a(0));
                                        }
                                    });
                                    aVar6.W(R.string.no, null);
                                    aVar6.m();
                                    return;
                                }
                            }
                            if (epx.f(eVar2, f.e.o.a)) {
                                fl4 fl4Var = xsq0Var2.a.b;
                                int i17 = fl4.a;
                                fl4Var.x(fragmentActivity2, false);
                                return;
                            }
                            if (epx.f(eVar2, f.e.j1.a)) {
                                xsq0Var2.a.c.k(fragmentActivity2, false, false, 3235);
                                return;
                            }
                            if (epx.f(eVar2, f.e.r.a)) {
                                xsq0Var2.a.g.r().a(fragmentActivity2);
                                return;
                            }
                            if (eVar2 instanceof f.e.p1) {
                                xsq0Var2.a.f.e().l(fragmentActivity2, i5s.a(new StringBuilder("https://"), a0a.d, "/reports/?open_page=silent-info"), LaunchContext.A, null, null);
                                return;
                            }
                            if (eVar2 instanceof f.e.a) {
                                xsq0Var2.a.a.b().O(xa4.L(fragmentActivity2), "profile_screen", com.vk.dto.common.a.a(((f.e.a) eVar2).a), null);
                                return;
                            }
                            if (eVar2 instanceof f.e.o1) {
                                f.e.o1 o1Var = (f.e.o1) eVar2;
                                xsq0Var2.a.d.q(fragmentActivity2, o1Var.a, o1Var.b, o1Var.c, o1Var.d);
                                return;
                            }
                            if (eVar2 instanceof f.e.m1) {
                                UserId userId4 = ((f.e.m1) eVar2).a;
                                xsq0Var2.a.a.getClass();
                                int i18 = ReportFragment.a0;
                                ReportFragment.a a6 = ReportFragment.b.a();
                                a6.K("user");
                                a6.L(userId4);
                                a6.k(fragmentActivity2);
                                return;
                            }
                            if (eVar2 instanceof f.e.l1) {
                                ((f.e.l1) eVar2).getClass();
                                xsq0Var2.a.a.getClass();
                                throw null;
                            }
                            if (eVar2 instanceof f.e.m0) {
                                ExtendedUserProfile extendedUserProfile4 = ((f.e.m0) eVar2).a;
                                nyd0.a m2 = xsq0Var2.c.a.m();
                                m2.getClass();
                                m2.a(MobileOfficialAppsProfileStat$AnotherUserProfileEvent.AnotherUserProfileEventType.SHOW_MORE_GIFTS, null);
                                xsq0Var2.b.f(fragmentActivity2, extendedUserProfile4, "profile_button");
                                return;
                            }
                            if (eVar2 instanceof f.e.y0) {
                                ExtendedUserProfile extendedUserProfile5 = ((f.e.y0) eVar2).a;
                                xsq0Var2.b.a(fragmentActivity2, extendedUserProfile5.a, extendedUserProfile5.b);
                                return;
                            }
                            if (eVar2 instanceof f.e.z0) {
                                xsq0Var2.b.g(fragmentActivity2, ((f.e.z0) eVar2).a);
                                return;
                            }
                            if (eVar2 instanceof f.e.y) {
                                WebApiApplication webApiApplication = ((f.e.y) eVar2).a;
                                zd3.g(xsq0Var2.a.e, fragmentActivity2, chx0.b(webApiApplication), webApiApplication.D, null, 24);
                                return;
                            }
                            if (eVar2 instanceof f.e.t1) {
                                xsq0Var2.p.a(fragmentActivity2, ((f.e.t1) eVar2).a, FollowersInitialTab.FOLLOWERS);
                                return;
                            }
                            if (eVar2 instanceof f.e.u1) {
                                f.e.u1 u1Var = (f.e.u1) eVar2;
                                xsq0Var2.getClass();
                                ComFeatures comFeatures = ComFeatures.COM_FOLLOWERS_ONLINE_TAB;
                                comFeatures.getClass();
                                if (!com.vk.toggle.b.A.a(comFeatures) || xsq0Var2.a.k.a(u1Var.a.a.c)) {
                                    xsq0Var2.b.d(fragmentActivity2, u1Var.a, false);
                                    return;
                                } else {
                                    xsq0Var2.p.a(fragmentActivity2, u1Var.a, FollowersInitialTab.FRIENDS);
                                    return;
                                }
                            }
                            if (eVar2 instanceof f.e.v1) {
                                f.e.v1 v1Var = (f.e.v1) eVar2;
                                xsq0Var2.getClass();
                                ComFeatures comFeatures2 = ComFeatures.COM_FOLLOWERS_ONLINE_TAB;
                                comFeatures2.getClass();
                                if (!com.vk.toggle.b.A.a(comFeatures2) || xsq0Var2.a.k.a(v1Var.a.a.c)) {
                                    xsq0Var2.b.d(fragmentActivity2, v1Var.a, true);
                                    return;
                                } else {
                                    xsq0Var2.p.a(fragmentActivity2, v1Var.a, FollowersInitialTab.MUTUAL);
                                    return;
                                }
                            }
                            if (eVar2 instanceof f.e.m) {
                                xsq0Var2.b.c(fragmentActivity2);
                                return;
                            }
                            if (eVar2 instanceof f.e.x) {
                                xsq0Var2.o.g(fragmentActivity2, ((f.e.x) eVar2).a, false);
                                return;
                            }
                            if (eVar2 instanceof f.e.t) {
                                ExtendedUserProfile extendedUserProfile6 = ((f.e.t) eVar2).a;
                                xsq0Var2.getClass();
                                ey50 ey50Var = fragmentActivity2 instanceof ey50 ? (ey50) fragmentActivity2 : null;
                                if (ey50Var == null || (Y2 = ey50Var.Y()) == null || (u2 = Y2.u()) == null) {
                                    return;
                                }
                                xsq0Var2.o.e(u2, GalleryPickerSourceConfiguration.EntryPoint.PHOTO_FLOW);
                                return;
                            }
                            if (eVar2 instanceof f.e.w0) {
                                xsq0Var2.o.m(fragmentActivity2, xsq0Var2.d.a, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, ((f.e.w0) eVar2).a.b);
                                return;
                            }
                            if (eVar2 instanceof f.e.v0) {
                                oga0.a(xsq0Var2.o, fragmentActivity2, ((f.e.v0) eVar2).a, null, 28);
                                return;
                            }
                            if (eVar2 instanceof f.e.d0) {
                                f.e.d0 d0Var = (f.e.d0) eVar2;
                                zof zofVar = xsq0Var2.i;
                                hi70 hi70Var = d0Var.d;
                                UserProfile userProfile4 = d0Var.e;
                                View view6 = hi70Var.get();
                                ImageView imageView = view6 instanceof ImageView ? (ImageView) view6 : null;
                                if (imageView == null) {
                                    return;
                                }
                                ArrayList arrayList7 = d0Var.a;
                                VideoFile videoFile = (VideoFile) arrayList7.get(d0Var.c);
                                if (userProfile4 == null || (I0 = userProfile4.c) == null) {
                                    I0 = videoFile.I0();
                                }
                                ClipFeedTab.Profile profile = new ClipFeedTab.Profile(null, I0);
                                ArrayList arrayList8 = new ArrayList(c5g.u(arrayList7, 10));
                                Iterator it2 = arrayList7.iterator();
                                while (it2.hasNext()) {
                                    arrayList8.add(g620.f().e0().c((VideoFile) it2.next()));
                                }
                                String str13 = d0Var.b;
                                kwc kwcVar = new kwc(arrayList8, (str13 == null || str13.length() == 0 || str13.equals("null")) ? PaginationKey.LoadedFull.b : new PaginationKey.Next(str13), d0Var.c);
                                h270 h270Var = new h270(imageView, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, null, null, 252);
                                bpn0 bpn0Var2 = com.vk.libvideo.autoplay.b.B;
                                h270Var.k(videoFile, b.C1208b.a().e(videoFile, null), com.vk.libvideo.autoplay.a.t);
                                ClipsRouter a7 = g620.f().a();
                                if (zofVar.H().isEnabled() && zofVar.H().b()) {
                                    cpu a8 = xg5.a();
                                    if (userProfile4 == null || (userId3 = userProfile4.c) == null) {
                                        userId3 = UserId.d;
                                    }
                                    if (a8.e(userId3)) {
                                        z4 = true;
                                        ClipsRouter.b(a7, fragmentActivity2, profile, h270Var, kwcVar, null, null, z4, 112);
                                        return;
                                    }
                                }
                                z4 = false;
                                ClipsRouter.b(a7, fragmentActivity2, profile, h270Var, kwcVar, null, null, z4, 112);
                                return;
                            }
                            if (eVar2 instanceof f.e.f0) {
                                xsq0Var2.h.e().a(fragmentActivity2, new ClipsEntryPointsParams(MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER, null, null, false, false, ((f.e.f0) eVar2).a, false, ClipsMediaPickerTab.Drafts, 94, null));
                                return;
                            }
                            if (eVar2 instanceof f.e.a1) {
                                xsq0Var2.getClass();
                                UserId userId5 = ((f.e.a1) eVar2).a;
                                if (userId5 == null) {
                                    return;
                                }
                                UserScheduledClipsGridFragment.a aVar7 = new UserScheduledClipsGridFragment.a(UserScheduledClipsGridFragment.class, null, null);
                                Bundle bundle = aVar7.j;
                                bundle.putBoolean("UserScheduledClipsGridFragment.force_dark_theme", dhr0.a.c(fragmentActivity2));
                                bundle.putParcelable("UserScheduledClipsGridFragment.user_id", userId5);
                                aVar7.k(fragmentActivity2);
                                return;
                            }
                            if (eVar2 instanceof f.e.g0) {
                                xsq0Var2.getClass();
                                ClipsPlaylist clipsPlaylist = ((f.e.g0) eVar2).a;
                                ClipsRouter.c(g620.f().a(), fragmentActivity2, Collections.singletonList(new ClipFeedTab.Playlist.FromBeginning(clipsPlaylist)), null, null, fpf0.a(ClipFeedTab.Playlist.FromBeginning.class), null, null, true, null, 1900);
                                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIPS_PLAYLIST, Long.valueOf(clipsPlaylist.b), Long.valueOf(clipsPlaylist.f.b), null, null, null, 56, null), new MobileOfficialAppsClipsStat$TypeClipsGridItem(MobileOfficialAppsClipsStat$TypeClipsGridItem.EventType.CLICK_TO_PLAYLIST, MobileOfficialAppsClipsStat$TypeClipsGridItem.ScreenType.GRID_USER, null, null, null, 28, null), 2);
                                UiTracker uiTracker = UiTracker.a;
                                MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
                                uzp0 uzp0Var = UiTracker.h;
                                uzp0Var.getClass();
                                new bjc(c3, b, uzp0Var.a).q();
                                return;
                            }
                            if (eVar2 instanceof f.e.z) {
                                xsq0Var2.getClass();
                                String str14 = ((f.e.z) eVar2).a.i;
                                if (str14 != null) {
                                    xsq0Var2.b(fragmentActivity2, str14);
                                    return;
                                }
                                return;
                            }
                            if (eVar2 instanceof f.e.v) {
                                ExtendedUserProfile extendedUserProfile7 = ((f.e.v) eVar2).a;
                                xsq0Var2.getClass();
                                g620.f().k(extendedUserProfile7.a.c, fragmentActivity2, ClipsRouter.GridForcedTab.NONE);
                                return;
                            }
                            if (eVar2 instanceof f.e.s) {
                                xsq0Var2.h.e().a(fragmentActivity2, new ClipsEntryPointsParams(MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.PROFILE_CLIPS_BUTTON, null, null, false, false, null, ((Boolean) xsq0Var2.s.getValue()).booleanValue(), null, 190, null));
                                return;
                            }
                            if (eVar2 instanceof f.e.c) {
                                boolean z5 = ((f.e.c) eVar2).a;
                                xsq0Var2.getClass();
                                if (z5) {
                                    fragmentActivity2.onBackPressed();
                                    return;
                                }
                                ey50 ey50Var2 = fragmentActivity2 instanceof ey50 ? (ey50) fragmentActivity2 : null;
                                if (ey50Var2 == null || (Y = ey50Var2.Y()) == null || (u = Y.u()) == null) {
                                    return;
                                }
                                h3p0.b(u);
                                return;
                            }
                            if (eVar2 instanceof f.e.c1) {
                                xsq0Var2.k.f.c(((f.e.c1) eVar2).a);
                                return;
                            }
                            if (eVar2 instanceof f.e.k0) {
                                xsq0Var2.getClass();
                                maz.c(xsq0Var2.a.f.e(), fragmentActivity2, jeq0.g(f870.v(InternalVkMiniApps.PROFILE_DONUT_SETTINGS.h())).buildUpon().appendPath("donut").build().toString(), new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, Integer.valueOf(xo9.n(430, 0, 12, Integer.valueOf(Long.hashCode(xsq0Var2.d.a.b)))), null, null, null, false, false, null, null, null, 66977791), null, null, 24);
                                return;
                            }
                            if (epx.f(eVar2, f.e.t0.a)) {
                                xsq0Var2.getClass();
                                xsq0Var2.b(fragmentActivity2, f870.v(InternalVkMiniApps.CARD_APP.h()));
                                return;
                            }
                            if (epx.f(eVar2, f.e.p0.a)) {
                                xsq0Var2.getClass();
                                xsq0Var2.b(fragmentActivity2, f870.v(InternalVkMiniApps.MEMORIES.h()));
                                return;
                            }
                            if (epx.f(eVar2, f.e.d1.a)) {
                                xsq0Var2.getClass();
                                xsq0Var2.b(fragmentActivity2, "https://" + a0a.d + "/stories_archive");
                                return;
                            }
                            if (epx.f(eVar2, f.e.n0.a)) {
                                xsq0Var2.getClass();
                                xsq0Var2.b(fragmentActivity2, "https://" + a0a.d + "/support?act=home&source=faqprofile");
                                return;
                            }
                            if (eVar2 instanceof f.e.C1724e) {
                                f.e.C1724e c1724e = (f.e.C1724e) eVar2;
                                xsq0Var2.getClass();
                                bc6 L2 = xa4.L(fragmentActivity2);
                                int i19 = CoverPickerActivity.A;
                                String str15 = c1724e.a;
                                Intent intent = new Intent(fragmentActivity2, (Class<?>) CoverPickerActivity.class);
                                intent.putExtra("__avatar_url_key__", str15);
                                intent.putExtra("__avatar_rect_key__", (Parcelable) null);
                                L2.D(intent, c1724e.b, null);
                                return;
                            }
                            if (epx.f(eVar2, f.e.w.a)) {
                                xsq0Var2.m.b(xsq0Var2.d.a, MobileOfficialAppsCoreNavStat$EventScreen.PROFILE, false).k(fragmentActivity2);
                                return;
                            }
                            if (epx.f(eVar2, f.e.j0.a)) {
                                xsq0Var2.m.c(xsq0Var2.d.a, MobileOfficialAppsCoreNavStat$EventScreen.PROFILE, EmptyList.b).k(fragmentActivity2);
                                return;
                            }
                            if (eVar2 instanceof f.e.a0) {
                                ((f.e.a0) eVar2).getClass();
                                xsq0Var2.getClass();
                                xsq0Var2.b(fragmentActivity2, "https://" + a0a.d + "/@null");
                                return;
                            }
                            if (eVar2 instanceof f.e.b1) {
                                ExtendedUserProfile extendedUserProfile8 = ((f.e.b1) eVar2).a;
                                NewsfeedRouter.l(xsq0Var2.q, fragmentActivity2, null, bwd0.i(extendedUserProfile8), extendedUserProfile8.b, null, null, null, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
                                return;
                            }
                            if (eVar2 instanceof f.e.i1) {
                                ExtendedUserProfile extendedUserProfile9 = ((f.e.i1) eVar2).a;
                                xsq0Var2.getClass();
                                UserProfile userProfile5 = extendedUserProfile9.a;
                                if (userProfile5 == null || (userId2 = userProfile5.c) == null) {
                                    return;
                                }
                                xsq0Var2.b.h(fragmentActivity2, userId2);
                                return;
                            }
                            if (eVar2 instanceof f.e.n1) {
                                f.e.n1 n1Var = (f.e.n1) eVar2;
                                ExtendedUserProfile extendedUserProfile10 = n1Var.a;
                                CatalogedGift catalogedGift = n1Var.b;
                                nyd0.a m3 = xsq0Var2.c.a.m();
                                m3.getClass();
                                m3.a(MobileOfficialAppsProfileStat$AnotherUserProfileEvent.AnotherUserProfileEventType.CLICK_TO_BIRTHDAY_GIFT, null);
                                zal0 a9 = xsq0Var2.a.i.a();
                                UserProfile userProfile6 = extendedUserProfile10.a;
                                Collection singletonList = (userProfile6 == null || (userId = userProfile6.c) == null) ? null : Collections.singletonList(userId);
                                ExtendedUserProfile.h hVar = extendedUserProfile10.c1;
                                if (hVar != null && (str11 = hVar.a) != null) {
                                    str12 = "profile_tooltip__".concat(str11);
                                }
                                a9.g(fragmentActivity2, singletonList, catalogedGift, str12);
                                return;
                            }
                            if (eVar2 instanceof f.e.n) {
                                xsq0Var2.a.j.a(fragmentActivity2, ((f.e.n) eVar2).a);
                                return;
                            }
                            if (eVar2 instanceof f.e.o0) {
                                f.e.o0 o0Var = (f.e.o0) eVar2;
                                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = o0Var.b;
                                if (mobileOfficialAppsCoreNavStat$EventScreen2 != null) {
                                    xsq0Var2.getClass();
                                    new tzp0.c.a(new ysq0(mobileOfficialAppsCoreNavStat$EventScreen2), false).d();
                                }
                                xsq0Var2.b(fragmentActivity2, o0Var.a);
                                return;
                            }
                            if (eVar2 instanceof f.e.x0) {
                                xsq0Var2.q.z(fragmentActivity2, xsq0Var2.d.a);
                                return;
                            }
                            if (eVar2 instanceof f.e.l0) {
                                xsq0Var2.q.V(fragmentActivity2, xsq0Var2.d.a, NewsfeedRouter.OpenFromRef.REF_FEED);
                                return;
                            }
                            if (eVar2 instanceof f.e.e1) {
                                f.e.e1 e1Var = (f.e.e1) eVar2;
                                xsq0Var2.getClass();
                                uc ucVar = e1Var.b;
                                ucVar.w("PROFILE_VIDEO_TAB".toLowerCase(Locale.ROOT));
                                VideoFile videoFile2 = e1Var.a;
                                bpn0 bpn0Var3 = com.vk.libvideo.autoplay.b.B;
                                ucVar.k(videoFile2, b.C1208b.a().e(videoFile2, null), com.vk.libvideo.autoplay.a.t);
                                uc.r(ucVar, fragmentActivity2, true, null, null, null, null, 252);
                                return;
                            }
                            if (eVar2 instanceof f.e.f1) {
                                xsq0Var2.getClass();
                                ydt0.e(fxc0.B().Y(), fragmentActivity2, ((f.e.f1) eVar2).a, null, null, 28);
                                return;
                            }
                            if (eVar2 instanceof f.e.g1) {
                                xsq0Var2.getClass();
                                fxc0.B().Y().A(fragmentActivity2, (r27 & 2) != 0 ? null : new oap.a(jeq0.g("https://" + a0a.d + "/video/@id" + ((f.e.g1) eVar2).a + "/playlists")), null, (r27 & 8) == 0, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? false : false, (r27 & 128) == 0, (r27 & 256) != 0 ? false : true, (r27 & 512) != 0 ? null : Boolean.TRUE, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null);
                                return;
                            }
                            if (eVar2 instanceof f.e.s1) {
                                UserId userId6 = ((f.e.s1) eVar2).a;
                                xsq0Var2.getClass();
                                fxc0.B().Y().c(fragmentActivity2, UploadVideoAction.SELECT, userId6, 0, PostingCreationEntryPoint.ProfileWallButton.toString());
                                return;
                            }
                            if (eVar2 instanceof f.e.h1) {
                                f.e.h1 h1Var = (f.e.h1) eVar2;
                                xsq0Var2.b.j(fragmentActivity2, h1Var.b, h1Var.a, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE));
                                return;
                            }
                            if (eVar2 instanceof f.e.q0) {
                                ExtendedUserProfile extendedUserProfile11 = ((f.e.q0) eVar2).a;
                                xsq0Var2.getClass();
                                UserId userId7 = extendedUserProfile11.a.c;
                                if (xsq0Var2.a.k.a(userId7)) {
                                    xsq0Var2.b(fragmentActivity2, "https://" + a0a.d + "/music?section=all");
                                    return;
                                }
                                xsq0Var2.b(fragmentActivity2, "https://" + a0a.d + "/audios" + userId7);
                                return;
                            }
                            if (eVar2 instanceof f.e.s0) {
                                ExtendedUserProfile extendedUserProfile12 = ((f.e.s0) eVar2).a;
                                xsq0Var2.getClass();
                                UserId userId8 = extendedUserProfile12.a.c;
                                if (xsq0Var2.a.k.a(userId8)) {
                                    xsq0Var2.b(fragmentActivity2, "https://" + a0a.d + "/music?section=general");
                                    return;
                                }
                                xsq0Var2.b(fragmentActivity2, "https://" + a0a.d + "/audios" + userId8 + "?section=general");
                                return;
                            }
                            if (epx.f(eVar2, f.e.p.a)) {
                                xsq0Var2.a.g.V().a(fragmentActivity2);
                                return;
                            }
                            if (eVar2 instanceof f.e.b0) {
                                f.e.b0 b0Var = (f.e.b0) eVar2;
                                xsq0Var2.getClass();
                                List<MusicTrack> list3 = b0Var.c;
                                UserId userId9 = b0Var.b;
                                if (list3 != null) {
                                    int indexOf = list3.indexOf(b0Var.a);
                                    Integer valueOf = Integer.valueOf(indexOf);
                                    if (indexOf == -1) {
                                        valueOf = null;
                                    }
                                    if (valueOf != null) {
                                        i16 = valueOf.intValue() + 1;
                                    }
                                }
                                u2b0 b2 = k840.a.g().b();
                                StartPlayUserSource startPlayUserSource = new StartPlayUserSource(userId9, i16);
                                MusicTrack musicTrack = b0Var.a;
                                MusicPlaybackLaunchContext zb = MusicPlaybackLaunchContext.g.zb();
                                Bundle bundle2 = zb.b;
                                bundle2.putParcelable("__META_OWNER_ID", userId9);
                                bundle2.putString("__META_OWNER_NAME", null);
                                b2.N0(new lqk0(startPlayUserSource, musicTrack, list3, zb, 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 1008));
                                return;
                            }
                            if (eVar2 instanceof f.e.c0) {
                                xsq0Var2.a.b.U().a(fragmentActivity2, new y050.b.a(((f.e.c0) eVar2).a, MusicPlaybackLaunchContext.g.t(), null, null, null, 28));
                                return;
                            }
                            if (eVar2 instanceof f.e.r0) {
                                ExtendedUserProfile extendedUserProfile13 = ((f.e.r0) eVar2).a;
                                xsq0Var2.getClass();
                                UserId userId10 = extendedUserProfile13.a.c;
                                if (xsq0Var2.a.k.a(userId10)) {
                                    xsq0Var2.b(fragmentActivity2, "https://" + a0a.d + "/music?section=playlists");
                                    return;
                                }
                                xsq0Var2.b(fragmentActivity2, "https://" + a0a.d + "/audios" + userId10 + "?section=playlists");
                                return;
                            }
                            if (eVar2 instanceof f.e.i) {
                                f.e.i iVar6 = (f.e.i) eVar2;
                                UserProfile userProfile7 = iVar6.a;
                                List<String> list4 = iVar6.b;
                                xsq0Var2.getClass();
                                List<String> list5 = list4;
                                if (list5 != null && !list5.isEmpty()) {
                                    xsq0Var2.a.m.f(fragmentActivity2, MobileOfficialAppsCoreNavStat$EventScreen.PROFILE, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.PHOTO_PROFILE, list4);
                                    xsq0Var2.c.b.d().p(NetError.ERR_ECH_NOT_NEGOTIATED, list4.size());
                                    return;
                                } else {
                                    com.vk.storycamera.builder.a aVar8 = new com.vk.storycamera.builder.a(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.FIRST_STORY_FOR_NARRATIVE);
                                    aVar8.q(userProfile7.c, userProfile7.e, userProfile7.h);
                                    aVar8.C(fragmentActivity2);
                                    return;
                                }
                            }
                            if (eVar2 instanceof f.e.h0) {
                                xsq0Var2.getClass();
                                new c0e0.a(fragmentActivity2, ((f.e.h0) eVar2).a).I0(null);
                                return;
                            }
                            if (eVar2 instanceof f.e.u0) {
                                f.e.u0 u0Var = (f.e.u0) eVar2;
                                xsq0Var2.getClass();
                                View view7 = u0Var.b.get();
                                if (view7 == null) {
                                    return;
                                }
                                Narrative narrative = u0Var.a;
                                if (!xsq0Var2.f.a(xsq0Var2.d.a)) {
                                    Context context = view7.getContext();
                                    int l = krv0.l(R.attr.vk_ui_icon_accent);
                                    view7.getContext();
                                    e.b bVar7 = new e.b(view7, null, null, l, 6);
                                    bVar7.w = R.layout.ds_internal_context_menu_item;
                                    if (narrative.k) {
                                        bVar5 = bVar7;
                                        VkContextMenu.c.c(bVar5, R.string.favorites_remove, null, false, null, new ty0(xsq0Var2, context, narrative, 7), 30);
                                    } else {
                                        bVar5 = bVar7;
                                        VkContextMenu.c.c(bVar5, R.string.favorites_add, null, false, null, new xo8(xsq0Var2, context, narrative, 8), 30);
                                    }
                                    if (!narrative.l.isEmpty()) {
                                        VkContextMenu.c.c(bVar5, R.string.share, null, false, null, new ni0(25, context, narrative), 30);
                                    }
                                    bVar5.l(true).g();
                                    return;
                                }
                                Context context2 = view7.getContext();
                                int l2 = krv0.l(R.attr.vk_ui_icon_accent);
                                view7.getContext();
                                e.b bVar8 = new e.b(view7, null, null, l2, 6);
                                bVar8.w = R.layout.ds_internal_context_menu_item;
                                VkContextMenu.c.c(bVar8, R.string.favorites_reorder, null, false, null, new cg1(27, xsq0Var2, fragmentActivity2), 30);
                                if (narrative.k) {
                                    VkContextMenu.c.c(bVar8, R.string.favorites_remove, null, false, null, new wy0(xsq0Var2, context2, narrative, 4), 30);
                                } else {
                                    VkContextMenu.c.c(bVar8, R.string.favorites_add, null, false, null, new eo2(xsq0Var2, context2, narrative, 5), 30);
                                }
                                int i20 = 9;
                                VkContextMenu.c.c(bVar8, R.string.edit, null, false, null, new yy0(xsq0Var2, narrative, fragmentActivity2, 9), 30);
                                if (!narrative.l.isEmpty()) {
                                    VkContextMenu.c.c(bVar8, R.string.share, null, false, null, new wf9(xsq0Var2, context2, narrative, i20), 30);
                                }
                                if (narrative.j) {
                                    VkContextMenu.c.c(bVar8, R.string.narrative_delete_action, null, false, null, new p2b(context2, xsq0Var2, narrative, 3), 30);
                                }
                                bVar8.j();
                                return;
                            }
                            if (epx.f(eVar2, f.e.h.a)) {
                                xsq0Var2.o.i(fragmentActivity2, xsq0Var2.d.a, EmptyList.b);
                                return;
                            }
                            if (epx.f(eVar2, f.e.u.a)) {
                                xsq0Var2.b(fragmentActivity2, "https://" + a0a.d + "/@" + xsq0Var2.d.a);
                                return;
                            }
                            if (epx.f(eVar2, f.e.i0.a)) {
                                xsq0Var2.getClass();
                                xsq0Var2.b(fragmentActivity2, "https://" + a0a.d + "/articles/create");
                                return;
                            }
                            if (eVar2 instanceof f.e.e0) {
                                UserId userId11 = ((f.e.e0) eVar2).a;
                                xsq0Var2.getClass();
                                ClipsRouter.c(g620.f().a(), fragmentActivity2, Collections.singletonList(new ClipFeedTab.CoauthorInvitations(userId11)), null, null, fpf0.a(ClipFeedTab.CoauthorInvitations.class), null, null, true, null, 1900);
                                UiTrackingScreen b3 = UiTracker.j.b();
                                if (b3 == null || (mobileOfficialAppsCoreNavStat$EventScreen = b3.a) == null) {
                                    mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
                                }
                                new god(mobileOfficialAppsCoreNavStat$EventScreen, new MobileOfficialAppsClipsStat$TypeClipCoownersItem(MobileOfficialAppsClipsStat$TypeClipCoownersItem.Type.OPEN_MODAL_COOWNERS, new MobileOfficialAppsClipsStat$TypeClipsClipItem(0, userId11.b, null, 4, null))).q();
                                return;
                            }
                            if (eVar2 instanceof f.e.k) {
                                xsq0Var2.a.f.e().k(fragmentActivity2, er.a(HttpRequest.DEFAULT_SCHEME).authority("static.".concat(a0a.d)).appendPath("ads_easy_promote").appendEncodedPath("").appendQueryParameter("act", "profileDashboard").appendQueryParameter("from", WallAdsEasyPromoteUrlBuilder.From.PROFILE_HEADER.h()).build().toString());
                                return;
                            }
                            if (!(eVar2 instanceof f.e.r1)) {
                                if (!(eVar2 instanceof f.e.AbstractC1725f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                xsq0Var2.a(fragmentActivity2, (f.e.AbstractC1725f) eVar2);
                            } else {
                                f.e.r1 r1Var = (f.e.r1) eVar2;
                                gd60 gd60Var = xsq0Var2.a.h;
                                r1Var.getClass();
                                gd60.T0(gd60Var, fragmentActivity2, null, null, new o1k(6, xsq0Var2, r1Var), null, 48);
                            }
                        }
                    });
                } else if (fVar instanceof f.h) {
                    fpq0Var.i.a(activity, ((f.h) fVar).a);
                } else if (fVar instanceof f.g) {
                    fpq0Var.I.getClass();
                    n2i0.a(activity, hf8.a, ((f.g) fVar).a);
                } else if (fVar instanceof f.l) {
                    gvq0 gvq0Var = fpq0Var.H;
                    f.l lVar = (f.l) fVar;
                    gvq0Var.getClass();
                    if (lVar.equals(f.l.b.a)) {
                        u5p0 u5p0Var = gvq0Var.b;
                        (u5p0Var != null ? u5p0Var : null).invoke(new UserProfileAction.d0.f(true));
                    } else if (!lVar.equals(f.l.a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!(fVar instanceof f.d)) {
                    int i15 = 5;
                    if (fVar instanceof f.C1726f) {
                        dsi0 dsi0Var = fpq0Var.L;
                        long j2 = ((f.C1726f) fVar).a;
                        l36 l36Var = dsi0Var.b;
                        l36Var.getClass();
                        AppsPerformOnboardingPanelActionDto appsPerformOnboardingPanelActionDto = AppsPerformOnboardingPanelActionDto.SHOW;
                        yf3 yf3Var = ((lzd0) l36Var.b).k;
                        UserId userId = new UserId(j2);
                        ufx ufxVar = new ufx("apps.performOnboardingPanel", new en(i5), new defpackage.j0(i15));
                        ufx.n(ufxVar, "action", appsPerformOnboardingPanelActionDto.i(), 0, 12);
                        ufx.m(ufxVar, "uid", userId, 0L, 8);
                        io.reactivex.rxjava3.disposables.c l = itg0.l(new io.reactivex.rxjava3.internal.operators.observable.b1(rsg0.y0(yfb.x(ufxVar), null, null, 3)));
                        io.reactivex.rxjava3.disposables.b bVar5 = dsi0Var.c;
                        (bVar5 != null ? bVar5 : null).b(l);
                    } else if (!(fVar instanceof f.i) && !(fVar instanceof f.j) && !(fVar instanceof f.k)) {
                        if (fVar instanceof f.b) {
                            pnq0 pnq0Var = fpq0Var.P;
                            f.b bVar6 = (f.b) fVar;
                            Context context = pnq0Var.b;
                            if (bVar6 instanceof f.b.a) {
                                if (((f.b.a) bVar6).b) {
                                    pair2 = new Pair(Integer.valueOf(R.string.user_clip_uploaded_with_post_snackbar_title), new v5n0(bVar6, i15));
                                    int intValue = ((Number) pair2.d()).intValue();
                                    gzs gzsVar = (gzs) pair2.g();
                                    ikv0.a aVar5 = new ikv0.a(context);
                                    aVar5.t = ikv0.c.f.a;
                                    aVar5.u = new ikv0.d(context.getString(intValue), (String) null, (ikv0.d.a) (0 == true ? 1 : 0), 6);
                                    aVar5.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.user_content_uploaded_snackbar_action), new k82(28, pnq0Var, gzsVar));
                                    aVar5.e = 6000L;
                                    HashSet hashSet = iah0.a;
                                    if (fnj.d(context)) {
                                        aVar5.k = 1;
                                        aVar5.p = Integer.valueOf(iah0.a(48));
                                    }
                                    aVar5.n();
                                } else {
                                    pair = new Pair(Integer.valueOf(R.string.user_clip_uploaded_snackbar_title), new tsk0(bVar6, 13));
                                }
                            } else if (bVar6 instanceof f.b.c) {
                                pair = ((f.b.c) bVar6).b ? new Pair(Integer.valueOf(R.string.user_video_uploaded_with_post_snackbar_title), new wzb0(bVar6, 21)) : new Pair(Integer.valueOf(R.string.user_video_uploaded_snackbar_title), new dei0(bVar6, 19));
                            } else {
                                if (!(bVar6 instanceof f.b.C1717b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pair = new Pair(Integer.valueOf(R.string.user_story_uploaded_snackbar_title), new iml0(bVar6, i6));
                            }
                            pair2 = pair;
                            int intValue2 = ((Number) pair2.d()).intValue();
                            gzs gzsVar2 = (gzs) pair2.g();
                            ikv0.a aVar52 = new ikv0.a(context);
                            aVar52.t = ikv0.c.f.a;
                            aVar52.u = new ikv0.d(context.getString(intValue2), (String) null, (ikv0.d.a) (0 == true ? 1 : 0), 6);
                            aVar52.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.user_content_uploaded_snackbar_action), new k82(28, pnq0Var, gzsVar2));
                            aVar52.e = 6000L;
                            HashSet hashSet2 = iah0.a;
                            if (fnj.d(context)) {
                            }
                            aVar52.n();
                        } else {
                            if (!(fVar instanceof f.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f.a aVar6 = (f.a) fVar;
                            yqq0 yqq0Var = fpq0Var.k;
                            if (aVar6 instanceof f.a.c) {
                                xsq0Var.getClass();
                                int i16 = u.h1;
                                ((f.a.c) aVar6).getClass();
                                u.a.a(activity, null, new r(i7));
                            } else {
                                if (aVar6 instanceof f.a.d) {
                                    yqq0Var.getClass();
                                    ((f.a.d) aVar6).getClass();
                                    throw null;
                                }
                                if (aVar6 instanceof f.a.e) {
                                    yqq0Var.getClass();
                                    ((f.a.e) aVar6).getClass();
                                    throw null;
                                }
                                if (aVar6 instanceof f.a.b) {
                                    yqq0Var.getClass();
                                    ((f.a.b) aVar6).getClass();
                                    throw null;
                                }
                                if (aVar6 instanceof f.a.g) {
                                    yqq0Var.getClass();
                                    ((f.a.g) aVar6).getClass();
                                    throw null;
                                }
                                if (aVar6 instanceof f.a.C1715a) {
                                    yqq0Var.getClass();
                                    ((f.a.C1715a) aVar6).getClass();
                                    throw null;
                                }
                                if (aVar6 instanceof f.a.h) {
                                    yqq0Var.getClass();
                                    ((f.a.h) aVar6).getClass();
                                    throw null;
                                }
                                if (!(aVar6 instanceof f.a.C1716f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        }
                    }
                }
                return s3q0.a;
            case 24:
                return UserProfileHeaderView.U4((UserProfileHeaderView) this.c, (VkOnboardingCampaign) this.d);
            case 25:
                List list2 = (List) this.c;
                izs izsVar3 = (izs) this.d;
                wow wowVar = new wow(list2);
                ((nvy) obj).e(list2.size(), null, new ypd0(wowVar, 1), new jai(802480018, new zpd0(wowVar, izsVar3, i8), true));
                return s3q0.a;
            case 26:
                h9t0 h9t0Var = (h9t0) this.c;
                VideoNotificationsStatus videoNotificationsStatus = (VideoNotificationsStatus) this.d;
                h9t0Var.b.b(new h.w());
                h9t0Var.e.invoke(new f.h.d(videoNotificationsStatus));
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 27:
                w7k0.d(((w5v0) this.c).b(), (ContextWrapper) this.d, R.string.music_player_snack_bar_common_error);
                return s3q0.a;
            case 28:
                m6w0 m6w0Var = (m6w0) this.c;
                io.reactivex.rxjava3.disposables.b bVar7 = m6w0Var.e;
                w6w0 w6w0Var = m6w0Var.f;
                e6w0 e6w0Var = (e6w0) this.d;
                int i17 = ((brj0) obj).a;
                if (i17 == 0) {
                    y7w0 y7w0Var = m6w0Var.g;
                    y7w0Var.getClass();
                    d6w0.a(b6m.e(), y7w0Var.c, "keyboard_create", "create_new", 8);
                } else if (i17 == 1) {
                    bVar7.b(w6w0Var.e(((e6w0.j) e6w0Var).b.getId(), true).subscribe(new k6w0(new yyl0(m6w0Var, 22), i7)));
                } else if (i17 == 2) {
                    bVar7.b(w6w0Var.e(((e6w0.j) e6w0Var).b.getId(), false).subscribe(new gyq0(new lxh0(m6w0Var, 16), i3)));
                }
                return s3q0.a;
            default:
                ((s9w0) this.c).l.a.invoke(new e6w0.p(((t9w0) this.d).b));
                return s3q0.a;
        }
    }
}
