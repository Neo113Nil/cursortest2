package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.video.dto.VideoGetResponseDto;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.DialogBackground;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.posting.FriendsListPrivacyType;
import com.vk.im.ui.components.theme_chooser.ThemeChooserState;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipMaxAppView;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.StoryStatisticsStickersViewState;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.ui.model.PersonalDiscountTransitionFrom;
import com.vk.video.profile.presentation.a;
import com.vk.voip.ui.prodstat.analytics.base.common.VoipCallTypeAnalytics;
import com.vk.voip.ui.prodstat.analytics.max.view.VoipMaxAppViewAnalytics;
import com.vk.voip.ui.qr.ui.VoipQrCodeScannerFragment;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.eam0;
import xsna.eys0;
import xsna.h7u0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class z8l0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z8l0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2, types: [long] */
    /* JADX WARN: Type inference failed for: r20v3 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        zhf0 zhf0Var;
        j1z j1zVar;
        tny c;
        ?? r20;
        long j;
        float f;
        long j2;
        float f2;
        float f3;
        tny c2;
        ljo0 ljo0Var;
        tny c3;
        ljo0 ljo0Var2;
        tny c4;
        tny c5;
        Owner s;
        UserId userId;
        MobileOfficialAppsCallsStat$TypeVoipMaxAppView.Source source;
        int i = 1;
        UserId userId2 = null;
        switch (this.b) {
            case 0:
                androidx.appcompat.app.d dVar = ((b9l0) this.c).b;
                if (dVar != null) {
                    dVar.dismiss();
                }
                return s3q0.a;
            case 1:
                dhl0 dhl0Var = (dhl0) this.c;
                synchronized (dhl0Var.g) {
                    dhl0Var.g.evictAll();
                }
                return s3q0.a;
            case 2:
                mzp0 mzp0Var = ((gpl0) this.c).g;
                if (mzp0Var != null) {
                    mzp0Var.a();
                }
                return s3q0.a;
            case 3:
                d9m0 d9m0Var = (d9m0) this.c;
                bpn0 bpn0Var = d9m0Var.k1;
                eam0 eam0Var = (eam0) obj;
                int i2 = d9m0.n1;
                if (eam0Var instanceof eam0.c) {
                    eam0.c cVar = (eam0.c) eam0Var;
                    boolean z = cVar.a;
                    boolean z2 = cVar.b;
                    eam0.f fVar = cVar.c;
                    zzs<StoryPrivacyType, StoryPrivacyType, List<UserId>, List<UserId>, s3q0> zzsVar = d9m0Var.i1;
                    if (d9m0Var.m1) {
                        if (z && z2) {
                            zzsVar.invoke(fVar.a, fVar.b, fVar.c, fVar.d);
                            d9m0Var.Qn(true);
                            d9m0Var.hide();
                            s3q0 s3q0Var = s3q0.a;
                        }
                    } else if (z2) {
                        zzsVar.invoke(fVar.a, fVar.b, fVar.c, fVar.d);
                        d9m0Var.Qn(true);
                        d9m0Var.hide();
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                } else {
                    int i3 = 12;
                    if (eam0Var instanceof eam0.a) {
                        ((NewsfeedRouter) bpn0Var.getValue()).P(new bc6(d9m0Var.requireContext(), new wa5(d9m0Var, i3)), FriendsListParams.BestFriendsList.b, FriendsListPrivacyType.STORY, 1001, true);
                    } else if (eam0Var instanceof eam0.b) {
                        ((NewsfeedRouter) bpn0Var.getValue()).P(new bc6(d9m0Var.requireContext(), new ht7(d9m0Var, i3)), new FriendsListParams.HiddenFriendsList(((eam0.b) eam0Var).a), FriendsListPrivacyType.STORY, 1000, true);
                    } else if (eam0Var instanceof eam0.d) {
                        d9m0Var.Qn(true);
                        d9m0Var.hide();
                        d9m0Var.j1.invoke();
                    } else {
                        if (!(eam0Var instanceof eam0.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i4 = h7u0.p;
                        h7u0.a c6 = h7u0.b.c(d9m0Var.requireContext());
                        c6.g0(R.string.cant_move_list);
                        c6.U(R.string.try_again);
                        c6.c0(R.string.close, new uh6(i));
                        c6.m();
                    }
                }
                return s3q0.a;
            case 4:
                com.vk.stories.design.view.stats.tabs.stickers.mvi.c cVar2 = (com.vk.stories.design.view.stats.tabs.stickers.mvi.c) this.c;
                StoryStatisticsStickersViewState.c cVar3 = (StoryStatisticsStickersViewState.c) obj;
                VkButton vkButton = cVar2.f;
                StoryStatisticsStickersViewState.e eVar = cVar3.b;
                vkButton.setEnabled(eVar.c > 0);
                Context context = cVar2.d;
                ListBuilder e = e43.e();
                ual0 ual0Var = cVar3.a.a;
                if (ual0Var != null) {
                    e.add(ual0Var);
                }
                VKList<val0> vKList = eVar.a;
                if (vKList != null && !vKList.isEmpty()) {
                    int i5 = eVar.b ? R.string.story_statistics_stickers_questions_button_cancel : R.string.story_statistics_stickers_questions_button_select;
                    String f4 = enj.f(R.plurals.story_statistics_stickers_title_questions, vKList.i(), context);
                    String string = context.getString(i5);
                    if (!BuildInfo.s()) {
                        string = null;
                    }
                    e.add(new zem0(f4, string));
                    e.addAll(vKList);
                }
                cVar2.g.setItems(e.g());
                return s3q0.a;
            case 5:
                kan0 kan0Var = (kan0) this.c;
                u7n0 u7n0Var = kan0Var.p;
                Object obj2 = kan0Var.l;
                u7n0Var.z(((lan0) (obj2 != null ? obj2 : null)).e);
                return s3q0.a;
            case 6:
                gho0 gho0Var = (gho0) this.c;
                tny tnyVar = (tny) obj;
                j1z j1zVar2 = gho0Var.d;
                if (j1zVar2 != null) {
                    if (j1zVar2.p) {
                        j1zVar2 = null;
                    }
                    if (j1zVar2 != null) {
                        uv70 uv70Var = gho0Var.b;
                        long j3 = gho0Var.p().b;
                        int i6 = qko0.c;
                        int b = uv70Var.b((int) (j3 >> 32));
                        int b2 = gho0Var.b.b((int) (gho0Var.p().b & 4294967295L));
                        j1z j1zVar3 = gho0Var.d;
                        if (j1zVar3 == null || (c5 = j1zVar3.c()) == null) {
                            r20 = ' ';
                            j = 0;
                        } else {
                            r20 = ' ';
                            j = c5.D(gho0Var.n(true));
                        }
                        j1z j1zVar4 = gho0Var.d;
                        long D = (j1zVar4 == null || (c4 = j1zVar4.c()) == null) ? 0L : c4.D(gho0Var.n(false));
                        j1z j1zVar5 = gho0Var.d;
                        if (j1zVar5 == null || (c3 = j1zVar5.c()) == null) {
                            f = 0.0f;
                            j2 = 4294967295L;
                            f2 = 0.0f;
                        } else {
                            mjo0 d = j1zVar2.d();
                            f = 0.0f;
                            j2 = 4294967295L;
                            f2 = Float.intBitsToFloat((int) (c3.D((Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << r20) | (Float.floatToRawIntBits((d == null || (ljo0Var2 = d.a) == null) ? 0.0f : ljo0Var2.c(b).b) & 4294967295L)) & 4294967295L));
                        }
                        j1z j1zVar6 = gho0Var.d;
                        if (j1zVar6 == null || (c2 = j1zVar6.c()) == null) {
                            f3 = f;
                        } else {
                            mjo0 d2 = j1zVar2.d();
                            f3 = Float.intBitsToFloat((int) (c2.D((Float.floatToRawIntBits(f) << r20) | (Float.floatToRawIntBits((d2 == null || (ljo0Var = d2.a) == null) ? f : ljo0Var.c(b2).b) & j2)) & j2));
                        }
                        int i7 = (int) (j >> r20);
                        int i8 = (int) (D >> r20);
                        zhf0Var = new zhf0(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.min(f2, f3), Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), (j1zVar2.a.g.getDensity() * 25) + Math.max(Float.intBitsToFloat((int) (j & j2)), Float.intBitsToFloat((int) (D & j2))));
                        j1zVar = gho0Var.d;
                        if (j1zVar != null || (c = j1zVar.c()) == null) {
                            return null;
                        }
                        return gcd0.A(zhf0Var, c, tnyVar);
                    }
                }
                zhf0Var = zhf0.e;
                j1zVar = gho0Var.d;
                if (j1zVar != null) {
                }
                return null;
            case 7:
                return ThemeChooserState.a((ThemeChooserState) obj, ThemeChooserState.ListKind.BACKGROUND, null, null, (DialogBackground) this.c, false, null, null, null, 246);
            case 8:
                ((woq0) this.c).n.a(UserProfileAction.h.a.C1688a.b);
                return s3q0.a;
            case 9:
                ((kfr0) this.c).a(PersonalDiscountTransitionFrom.FROM_SNACK_BAR);
                ((utj) obj).b();
                return s3q0.a;
            case 10:
                VideoGetResponseDto videoGetResponseDto = (VideoGetResponseDto) obj;
                return ((com.vk.libvideo.a) this.c).h(videoGetResponseDto.getCount(), videoGetResponseDto.e());
            case 11:
                ((skj0) this.c).invoke(new rbt0(0, 50, 0, 32, EmptyList.b));
                return s3q0.a;
            case 12:
                fys0 fys0Var = (fys0) this.c;
                int i9 = fys0.j1;
                eys0.a aVar = eys0.a.b;
                fys0Var.getClass();
                xn50.a.c(fys0Var, aVar);
                return s3q0.a;
            case 13:
                com.vk.video.profile.presentation.c cVar4 = (com.vk.video.profile.presentation.c) this.c;
                bwr0 bwr0Var = (bwr0) obj;
                if (!fxc0.B().J().x()) {
                    return s3q0.a;
                }
                VideoFile videoFile = bwr0Var instanceof wxr0 ? ((wxr0) bwr0Var).a : bwr0Var instanceof fyr0 ? ((fyr0) bwr0Var).a : bwr0Var instanceof cwr0 ? ((cwr0) bwr0Var).a : null;
                if (videoFile != null && (s = videoFile.s()) != null && (userId = s.b) != null) {
                    userId2 = userId;
                } else if (videoFile != null) {
                    userId2 = videoFile.I0();
                }
                if (userId2 != null) {
                    cVar4.C(new a.m0(userId2));
                }
                return s3q0.a;
            case 14:
                return ((wpp) obj).e(Long.valueOf(((l5v0) this.c).a));
            case 15:
                ((MusicBaseVkMixInteractiveVh.a) this.c).invoke();
                return s3q0.a;
            case 16:
                Context context2 = (Context) this.c;
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                (superappUiRouterBridge != null ? superappUiRouterBridge : null).j(context2.getString(R.string.vk_common_network_error));
                return s3q0.a;
            case 17:
                ((mjw0) this.c).s();
                return s3q0.a;
            case 18:
                VoipMaxAppViewAnalytics voipMaxAppViewAnalytics = (VoipMaxAppViewAnalytics) this.c;
                VoipMaxAppViewAnalytics.Event event = (VoipMaxAppViewAnalytics.Event) obj;
                if (!(event instanceof VoipMaxAppViewAnalytics.Event.ShowCallButton)) {
                    throw new NoWhenBranchMatchedException();
                }
                VoipMaxAppViewAnalytics.Event.ShowCallButton showCallButton = (VoipMaxAppViewAnalytics.Event.ShowCallButton) event;
                int i10 = VoipMaxAppViewAnalytics.b.$EnumSwitchMapping$0[showCallButton.b.ordinal()];
                if (i10 == 1) {
                    source = MobileOfficialAppsCallsStat$TypeVoipMaxAppView.Source.CALLS_SERVICES_OTHER;
                } else if (i10 == 2) {
                    source = MobileOfficialAppsCallsStat$TypeVoipMaxAppView.Source.IM_PROFILE;
                } else if (i10 == 3) {
                    source = MobileOfficialAppsCallsStat$TypeVoipMaxAppView.Source.HISTORY_FRIENDS_LIST_SERVICES_OTHER;
                } else if (i10 == 4) {
                    source = MobileOfficialAppsCallsStat$TypeVoipMaxAppView.Source.FRIENDS_LIST;
                } else {
                    if (i10 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    source = MobileOfficialAppsCallsStat$TypeVoipMaxAppView.Source.PROFILE;
                }
                MobileOfficialAppsCallsStat$TypeVoipMaxAppView.EventType eventType = MobileOfficialAppsCallsStat$TypeVoipMaxAppView.EventType.MAX_SHOW;
                VoipCallTypeAnalytics voipCallTypeAnalytics = showCallButton.a;
                MobileOfficialAppsCallsStat$TypeVoipMaxAppView mobileOfficialAppsCallsStat$TypeVoipMaxAppView = new MobileOfficialAppsCallsStat$TypeVoipMaxAppView(eventType, source, voipCallTypeAnalytics != null ? gjw0.a(voipCallTypeAnalytics) : null);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c7 = UiTracker.c();
                String valueOf = String.valueOf(System.currentTimeMillis());
                String valueOf2 = String.valueOf(System.currentTimeMillis());
                SchemeStat$EventItem schemeStat$EventItem = voipMaxAppViewAnalytics.b;
                vk6<SchemeStat$TypeView> vk6Var = voipMaxAppViewAnalytics.a;
                SchemeStat$TypeView a = SchemeStat$TypeView.a.a(schemeStat$EventItem, valueOf, valueOf2, null, mobileOfficialAppsCallsStat$TypeVoipMaxAppView);
                vk6Var.f = c7;
                vk6Var.g = a;
                vk6Var.q();
                return s3q0.a;
            case 19:
                VoipQrCodeScannerFragment voipQrCodeScannerFragment = (VoipQrCodeScannerFragment) this.c;
                on0 on0Var = voipQrCodeScannerFragment.T;
                Context requireContext = voipQrCodeScannerFragment.requireContext();
                g8n0 g8n0Var = new g8n0(voipQrCodeScannerFragment, 19);
                on0Var.getClass();
                voipQrCodeScannerFragment.V = on0.a(requireContext, (Throwable) obj, g8n0Var);
                return s3q0.a;
            default:
                return Boolean.valueOf(((w4y0) this.c).a.isInitialized());
        }
    }
}
