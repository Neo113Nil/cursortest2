package xsna;

import android.content.Context;
import android.text.Spanned;
import android.text.style.UnderlineSpan;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.video.list.c;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsRequestsCommonVh;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponent;
import com.vk.clips.edit.impl.deps.features.ClipEditVkFeatures;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.Owner;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.poll_editor.presentation.model.PollEditorMode;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.profile.community.impl.ui.profile.d;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Set;
import ru.ok.android.webrtc.Privacy;
import xsna.c3q;
import xsna.cbo;
import xsna.svq0;
import xsna.to50;
import xsna.xrh;
import xsna.zao;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class svd implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ svd(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02df  */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        xrh xrhVar;
        xrh xrhVar2;
        String sb;
        xrh aVar;
        PostingUserMessage postingUserMessage;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                Set set = (Set) obj;
                evd evdVar = new evd(((ClipsCoauthorsComponent) obj3).e(), (otc) ((uvd) obj2).q.getValue());
                if (!set.contains(ClipEditVkFeatures.All) && !set.contains(ClipEditVkFeatures.Coauthors)) {
                    break;
                } else {
                    break;
                }
                break;
            case 1:
                ClipVideoFile clipVideoFile = (ClipVideoFile) obj3;
                tlf tlfVar = (tlf) obj2;
                Context context = (Context) obj;
                Owner owner = clipVideoFile.v0;
                UserId userId = owner != null ? owner.b : null;
                if (userId == null || !tlfVar.a.o()) {
                    tlfVar.b.e(context, clipVideoFile);
                    break;
                } else {
                    ClipsRouter.b(tlfVar.b, context, new ClipFeedTab.Profile(null, userId), null, null, null, null, true, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    break;
                }
                break;
            case 2:
                yrh yrhVar = (yrh) obj3;
                hxg hxgVar = (hxg) obj2;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) obj;
                q7v0 q7v0Var = yrhVar.c;
                if (hxgVar.a) {
                    Context context2 = yrhVar.a;
                    if (((Boolean) yrhVar.g.getValue()).booleanValue()) {
                        VkOnboardingCampaign e = q7v0Var.e("com:group_menu_banner");
                        if (e == null || !q7v0Var.d(e)) {
                            e = null;
                        }
                        VkOnboardingCampaign e2 = q7v0Var.e("com:group_menu_tooltip");
                        if (e2 == null || !q7v0Var.d(e2)) {
                            e2 = null;
                        }
                        if (!yrhVar.b.n()) {
                            if (x2h.c(extendedCommunityProfile)) {
                                if (e2 != null) {
                                    aVar = new xrh.c.b(e2, context2.getString(R.string.community_menu_onboarding_tooltip));
                                    if (aVar != null) {
                                        xrhVar = aVar;
                                    }
                                }
                            } else if (e != null) {
                                bpn0 bpn0Var = v5v.c;
                                CharSequence text = context2.getText(R.string.community_menu_onboarding_banner_title);
                                if (text instanceof Spanned) {
                                    StringBuilder sb2 = new StringBuilder(text.toString());
                                    Spanned spanned = (Spanned) text;
                                    int i2 = 0;
                                    for (UnderlineSpan underlineSpan : rl3.m0(spanned.getSpans(0, text.length(), UnderlineSpan.class), new u5v((Spanned) text))) {
                                        sb2.insert(spanned.getSpanStart(underlineSpan) + i2, "<u>");
                                        sb2.insert(spanned.getSpanEnd(underlineSpan) + i2 + 3, "</u>");
                                        i2 += 7;
                                    }
                                    sb = sb2.toString();
                                } else {
                                    sb = text.toString();
                                }
                                aVar = new xrh.c.a(e, sb, context2.getString(R.string.community_menu_onboarding_banner_subtitle), context2.getString(R.string.community_menu_onboarding_banner_button));
                                if (aVar != null) {
                                }
                            }
                            if (xrhVar != null) {
                                yrhVar.e.invoke(new d.m.b(xrhVar));
                            }
                            break;
                        }
                    }
                    aVar = null;
                    if (aVar != null) {
                    }
                }
                if (extendedCommunityProfile.V2 != null) {
                    boolean z = hxgVar.b;
                    if (((Boolean) yrhVar.h.getValue()).booleanValue()) {
                        VkOnboardingCampaign e3 = q7v0Var.e(z ? "com:sections_in_about_admin" : "com:sections_in_about_user");
                        if (e3 != null) {
                            if (!q7v0Var.d(e3)) {
                                e3 = null;
                            }
                            if (e3 != null && q7v0Var.b(e3, false)) {
                                xrhVar2 = z ? xrh.d.C4044d.b : xrh.d.e.b;
                                if (xrhVar2 != null) {
                                    xrhVar = xrhVar2;
                                    if (xrhVar != null) {
                                    }
                                }
                            }
                        }
                    }
                    xrhVar2 = null;
                    if (xrhVar2 != null) {
                    }
                }
                xrhVar = null;
                if (xrhVar != null) {
                }
                break;
            case 3:
                zao.f fVar = (zao.f) ((zao) obj2);
                ((fbo) obj3).t(new cbo.d(new BlockId.Simple(fVar.b), (VideoFileOld) obj, fVar.f));
                break;
            case 4:
                FriendsRequestsCommonVh friendsRequestsCommonVh = (FriendsRequestsCommonVh) obj3;
                Context context3 = (Context) obj2;
                UIBlockProfile uIBlockProfile = (UIBlockProfile) obj;
                io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) friendsRequestsCommonVh.e.getValue();
                c3q a = c3q.a.a(uIBlockProfile.A.c, null, true);
                a.H0(uIBlockProfile.y.d);
                a.F0(Privacy.FRIENDS);
                bVar.b(hg1.m(rsg0.y0(a, null, null, 3), context3, 0L, false, 62).subscribe(new kjs(new rw(friendsRequestsCommonVh, context3, uIBlockProfile, 9), 1), new xn(new ve0(26), 21)));
                break;
            case 5:
                gzs gzsVar = (gzs) obj;
                ((l7v) obj3).d.remove((String) obj2);
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
            case 6:
                break;
            case 7:
                to50 to50Var = (to50) obj3;
                to50.d dVar = (to50.d) obj2;
                to50.d dVar2 = (to50.d) obj;
                if (to50Var.a(dVar.a, dVar.b)) {
                    float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    break;
                } else {
                    break;
                }
            case 8:
                ubb0 ubb0Var = (ubb0) obj3;
                UserId userId2 = (UserId) obj2;
                Playlist playlist = (Playlist) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + userId2.b + " query pid=" + playlist.Ib()});
                }
                break;
            case 9:
                PostingPollDto postingPollDto = (PostingPollDto) obj3;
                izs izsVar = (izs) obj2;
                ActionsAvailabilityState.AttachmentState attachmentState = (ActionsAvailabilityState.AttachmentState) obj;
                if (postingPollDto != null) {
                    ActionsAvailabilityState.Availability availability = attachmentState.c;
                    PostingAction.Navigation.OpenInCurrentStep openInCurrentStep = new PostingAction.Navigation.OpenInCurrentStep(new PostingStepScreen.RemovePollAlert(postingPollDto, PollEditorMode.Edit.b, false, false));
                    if (availability instanceof ActionsAvailabilityState.Availability.Available) {
                        izsVar.invoke(openInCurrentStep);
                    } else if ((availability instanceof ActionsAvailabilityState.Availability.NotAvailable) && (postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) availability).b) != null) {
                        izsVar.invoke(new PostingAction.ShowMessage(postingUserMessage, openInCurrentStep, 0, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null));
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
                break;
            case 10:
                ((feb0) obj3).d(((AudioPlaylistAttachment) obj2).f, (MusicPlaybackLaunchContext) obj);
                break;
            case 11:
                break;
            case 12:
                isq0 isq0Var = (isq0) obj3;
                String str = (String) obj;
                ?? r1 = isq0Var.j;
                if (((q7v0) r1.getValue()).e((String) obj2) == null) {
                    VkOnboardingCampaign e4 = ((q7v0) r1.getValue()).e(str);
                    if (e4 == null) {
                        break;
                    } else {
                        if (((q7v0) r1.getValue()).d(e4)) {
                            isq0Var.c(new svq0.b.i.a(e4));
                        }
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                }
                break;
            default:
                ((izs) obj3).invoke(new c.C0473c(((vst0) obj2).b, p490.C((tny) ((bpf0) obj).a())));
                break;
        }
        return s3q0.a;
    }
}
