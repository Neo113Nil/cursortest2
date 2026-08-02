package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.clip.ClipSearchFragment;
import com.vk.catalog2.common.ui.mvp.clip.VideoCatalogSearchFragment;
import com.vk.clips.entrypoints.params.ClipsEntryPointsParams;
import com.vk.common.links.LaunchContext;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoAccessInfo;
import com.vk.dto.common.VideoEditForbiddenReason;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.feed.settings.api.domain.model.FilteredSourceType;
import com.vk.feed.settings.impl.presentation.filtered.d;
import com.vk.log.L;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkPayCheckoutItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsAnalyticsItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsPromoItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.ui.VkTextFieldView;
import com.vk.superapp.vkpay.checkout.api.dto.response.VkCheckoutResponse;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipVideoListFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.msf;
import xsna.o0r0;
import xsna.xn50;

/* compiled from: ArchiveChannelsComponent.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class sg3 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sg3(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04cf  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        List<VideoEditForbiddenReason> list;
        Activity h;
        StoryMusicInfo storyMusicInfo;
        l7s l7sVar;
        ww50<?> Y;
        boolean z = true;
        l7s l7sVar2 = null;
        switch (this.b) {
            case 0:
                tg3 tg3Var = (tg3) this.receiver;
                tg3Var.getClass();
                xn50.a.c(tg3Var, (eh3) obj);
                return s3q0.a;
            case 1:
                ((m8b) this.receiver).getClass();
                L.i((Throwable) obj);
                return s3q0.a;
            case 2:
                sxp sxpVar = (sxp) obj;
                long j = ((mxb) this.receiver).a;
                if (!(sxpVar instanceof z680) ? !(sxpVar instanceof y680) || ((y680) sxpVar).b != j : ((z680) sxpVar).b != j) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                msf msfVar = (msf) obj;
                ltf ltfVar = (ltf) this.receiver;
                ltfVar.getClass();
                if (msfVar instanceof msf.h) {
                    Object a = ltfVar.a();
                    ey50 ey50Var = a instanceof ey50 ? (ey50) a : null;
                    if (ey50Var != null && (Y = ey50Var.Y()) != null) {
                        Y.W();
                    }
                } else if (msfVar instanceof msf.i) {
                    ltfVar.f.invoke(Boolean.valueOf(((msf.i) msfVar).a));
                } else if (msfVar instanceof msf.k) {
                    Context a2 = ltfVar.a();
                    if (a2 != null) {
                        cn o = o25.a().o();
                        xwk.e().m(a2, o.a, new o0r0.a(false, null, null, null, null, o.b, o.c, o.j, false, false, false, null, null, null, 65055));
                    }
                } else if (msfVar instanceof msf.l) {
                    Context a3 = ltfVar.a();
                    if (a3 != null) {
                        dhr0.a.getClass();
                        l7sVar2 = new l7s(a3, dhr0.u().c);
                    }
                    if (l7sVar2 != null) {
                        ClipSearchFragment.a aVar = new ClipSearchFragment.a();
                        int color = l7sVar2.getColor(R.color.vk_black);
                        Bundle bundle = aVar.j;
                        bundle.putInt("background_color", color);
                        bundle.putBoolean("ClipSearchFragment.FORCE_DISCOVER_IN_SEARCH_KEY", true);
                        bundle.putString("ref", com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_SEARCH));
                        aVar.k(l7sVar2);
                    }
                } else if (msfVar instanceof msf.a) {
                    Context a4 = ltfVar.a();
                    if (a4 == null) {
                        l7sVar = null;
                    } else {
                        dhr0.a.getClass();
                        l7sVar = new l7s(a4, dhr0.u().c);
                    }
                    if (l7sVar != null) {
                        new VideoCatalogSearchFragment.a(VideoCatalogSearchFragment.class, null, null).k(l7sVar);
                    }
                } else if (msfVar instanceof msf.e) {
                    Context a5 = ltfVar.a();
                    if (a5 != null) {
                        ltfVar.b.e().a(a5);
                    }
                } else if (msfVar instanceof msf.g) {
                    Context a6 = ltfVar.a();
                    if (a6 != null) {
                        g620.f().k0().a(a6);
                    }
                } else if (msfVar instanceof msf.j) {
                    VkClientMultiAccountComponent vkClientMultiAccountComponent = ltfVar.a;
                    Context a7 = ltfVar.a();
                    Context h2 = a7 != null ? e3m.h(a7) : null;
                    FragmentActivity fragmentActivity = h2 instanceof FragmentActivity ? (FragmentActivity) h2 : null;
                    if (fragmentActivity != null && vkClientMultiAccountComponent.getExperiments().a()) {
                        vkClientMultiAccountComponent.a().h(fragmentActivity, MultiAccountEntryPoint.LongTap.d);
                    }
                } else if (msfVar instanceof msf.c) {
                    msf.c cVar = (msf.c) msfVar;
                    Context a8 = ltfVar.a();
                    if (a8 != null) {
                        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, null, null, null, null, null, 62, null), new SchemeStat$TypeClipViewerItem(SchemeStat$TypeClipViewerItem.ScreenType.PROFILE, SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_VIEW_ANALYTICS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$ClipsAnalyticsItem(MobileOfficialAppsClipsStat$ClipsAnalyticsItem.ObjectType.VIEWER, MobileOfficialAppsClipsStat$ClipsAnalyticsItem.EventSubtype.CLIP_ANALYTICS), null, null, null, 1006632956, null), 2);
                        UiTracker uiTracker = UiTracker.a;
                        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                        uzp0 uzp0Var = UiTracker.h;
                        uzp0Var.getClass();
                        new bjc(c, b, uzp0Var.a).q();
                        VideoFile videoFile = cVar.a;
                        if (fkq0.d(videoFile.I0())) {
                            ltfVar.e.b(videoFile.I0(), Integer.valueOf(videoFile.o0()));
                        } else {
                            jie.a(g620.f().m(), a8, videoFile.I0(), videoFile.a1(), 8);
                        }
                    }
                } else if (msfVar instanceof msf.f) {
                    ((msf.f) msfVar).getClass();
                    Context a9 = ltfVar.a();
                    if (a9 != null) {
                        fxc0.B().T().x(a9);
                        fxc0.B().T();
                        throw null;
                    }
                } else if (msfVar instanceof msf.d) {
                    msf.d dVar = (msf.d) msfVar;
                    Context a10 = ltfVar.a();
                    if (a10 != null && (h = e3m.h(a10)) != null && !g620.f().k0().a(h)) {
                        SearchStatsLoggingInfo searchStatsLoggingInfo = ltfVar.c;
                        if (searchStatsLoggingInfo != null) {
                            SchemeStat$TypeClick Ab = searchStatsLoggingInfo.Ab(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.MAKE_CLIP_OUT, dVar.a);
                            UiTracker uiTracker2 = UiTracker.a;
                            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                            uzp0 uzp0Var2 = UiTracker.h;
                            uzp0Var2.getClass();
                            new bjc(c2, Ab, uzp0Var2.a).q();
                        }
                        p1e e = ltfVar.d.e();
                        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLIPS_VIEWER;
                        String str = dVar.b;
                        MusicTrack musicTrack = dVar.c;
                        if (musicTrack != null) {
                            String str2 = musicTrack.i;
                            storyMusicInfo = new StoryMusicInfo(musicTrack, str2 == null ? "" : str2, 0, musicTrack.c0, 0, null, false, 0, false, false, null, false, false, 8032, null);
                        } else {
                            storyMusicInfo = null;
                        }
                        e.a(h, new ClipsEntryPointsParams(creationEntryPoint, storyMusicInfo, str, false, false, null, false, null, 248, null));
                    }
                } else {
                    if (!(msfVar instanceof msf.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    VideoFile videoFile2 = ((msf.b) msfVar).a;
                    Context a11 = ltfVar.a();
                    if (a11 != null) {
                        VideoAccessInfo G9 = videoFile2.G9();
                        if (G9 != null && (list = G9.b) != null) {
                            List<VideoEditForbiddenReason> list2 = list;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator<T> it = list2.iterator();
                                while (it.hasNext()) {
                                    if (((VideoEditForbiddenReason) it.next()) instanceof VideoEditForbiddenReason.Ad) {
                                        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, null, null, null, null, null, 62, null), new SchemeStat$TypeClipViewerItem(SchemeStat$TypeClipViewerItem.ScreenType.PROFILE, SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_PROMO, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$ClipsPromoItem(MobileOfficialAppsClipsStat$ClipsPromoItem.ObjectType.VIEWER, !z ? MobileOfficialAppsClipsStat$ClipsPromoItem.EventSubtype.VIEW : MobileOfficialAppsClipsStat$ClipsPromoItem.EventSubtype.START), null, null, null, null, 1040187388, null), 2);
                                        UiTracker uiTracker3 = UiTracker.a;
                                        MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
                                        uzp0 uzp0Var3 = UiTracker.h;
                                        uzp0Var3.getClass();
                                        new bjc(c3, b2, uzp0Var3.a).q();
                                        maz.c(xwk.d().e(), a11, ltf.h + videoFile2.a1(), LaunchContext.A, null, null, 24);
                                    }
                                }
                            }
                        }
                        z = false;
                        SchemeStat$TypeClick b22 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, null, null, null, null, null, 62, null), new SchemeStat$TypeClipViewerItem(SchemeStat$TypeClipViewerItem.ScreenType.PROFILE, SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_PROMO, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$ClipsPromoItem(MobileOfficialAppsClipsStat$ClipsPromoItem.ObjectType.VIEWER, !z ? MobileOfficialAppsClipsStat$ClipsPromoItem.EventSubtype.VIEW : MobileOfficialAppsClipsStat$ClipsPromoItem.EventSubtype.START), null, null, null, null, 1040187388, null), 2);
                        UiTracker uiTracker32 = UiTracker.a;
                        MobileOfficialAppsCoreNavStat$EventScreen c32 = UiTracker.c();
                        uzp0 uzp0Var32 = UiTracker.h;
                        uzp0Var32.getClass();
                        new bjc(c32, b22, uzp0Var32.a).q();
                        maz.c(xwk.d().e(), a11, ltf.h + videoFile2.a1(), LaunchContext.A, null, null, 24);
                    }
                }
                return s3q0.a;
            case 4:
                L.i((Throwable) obj);
                return s3q0.a;
            case 5:
                Throwable th = (Throwable) obj;
                pim pimVar = (pim) this.receiver;
                f9w f9wVar = pim.q;
                pimVar.getClass();
                pim.q.a(th);
                pimVar.l.e = th;
                pimVar.d1();
                return s3q0.a;
            case 6:
                ((com.vk.feed.settings.impl.presentation.filtered.d) this.receiver).getClass();
                Map<FilteredSourceType, Integer> map = ((cj60) obj).b;
                if (map.isEmpty()) {
                    return EmptyList.b;
                }
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : pn00.j(new Pair(FilteredSourceType.GROUP, Integer.valueOf(R.id.settings_filtered_sources_tab_groups)), new Pair(FilteredSourceType.USER, Integer.valueOf(R.id.settings_filtered_sources_tab_users))).entrySet()) {
                    FilteredSourceType filteredSourceType = (FilteredSourceType) entry.getKey();
                    int intValue = ((Number) entry.getValue()).intValue();
                    if (map.containsKey(filteredSourceType)) {
                        int intValue2 = map.getOrDefault(filteredSourceType, 0).intValue();
                        arrayList.add(new xer(intValue2 == 0 ? y8g0.e(d.a.$EnumSwitchMapping$0[filteredSourceType.ordinal()] == 1 ? R.string.newsfeed_filtered_users_zero : R.string.newsfeed_filtered_groups_zero) : y8g0.d(d.a.$EnumSwitchMapping$0[filteredSourceType.ordinal()] == 1 ? R.plurals.newsfeed_filtered_users : R.plurals.newsfeed_filtered_groups, intValue2, uqm0.o(intValue2)), filteredSourceType, intValue));
                    }
                }
                return arrayList;
            case 7:
                zla0 zla0Var = (zla0) obj;
                nma0 nma0Var = (nma0) this.receiver;
                kku0 kku0Var = nma0Var.g;
                ahn ahnVar = nma0Var.h;
                mma0 mma0Var = nma0Var.e;
                SchemeStatSak$TypeVkPayCheckoutItem.EventType eventType = SchemeStatSak$TypeVkPayCheckoutItem.EventType.SMS_SEND;
                shn0 shn0Var = nma0Var.i;
                shn0Var.a.a(zla0Var);
                shn0Var.a(eventType);
                shn0Var.a.a(null);
                if (zla0Var.b()) {
                    String str3 = zla0Var.c;
                    long a12 = qni0.a();
                    nma0Var.o = new x7s(str3, a12);
                    ahnVar.getClass();
                    Preference.H("com.vk.superapp.vkpay.forgot_id", "vk_pay_checkout_forgot_id", str3);
                    Preference.F(a12, "com.vk.superapp.vkpay.forgot_id", "vk_pay_checkout_forgot_id_timestamp");
                    mma0Var.wn();
                    nma0Var.h(R.string.vk_pay_checkout_code_send_timer);
                } else {
                    VkCheckoutResponse.VkCheckoutResponseStatus vkCheckoutResponseStatus = zla0Var.b;
                    if (vkCheckoutResponseStatus == VkCheckoutResponse.VkCheckoutResponseStatus.ERR_ALREADY_RECOVER_PWD) {
                        ahnVar.getClass();
                        String s = Preference.s("com.vk.superapp.vkpay.forgot_id", "vk_pay_checkout_forgot_id", "");
                        nma0Var.o = new x7s(s, Preference.m(qni0.a(), "com.vk.superapp.vkpay.forgot_id", "vk_pay_checkout_forgot_id_timestamp"));
                        if (s.length() == 0) {
                            VkTextFieldView vkTextFieldView = mma0Var.n;
                            if (vkTextFieldView == null) {
                                vkTextFieldView = null;
                            }
                            vkTextFieldView.setEnabled(false);
                            VkTextFieldView vkTextFieldView2 = mma0Var.n;
                            mhy.d((vkTextFieldView2 != null ? vkTextFieldView2 : null).getKeyboardTargetView());
                            nma0Var.h(R.string.vk_pay_checkout_code_from_sms_flood);
                        } else {
                            mma0Var.wn();
                            mma0Var.xn(R.string.vk_pay_checkout_code_from_sms_already_sent);
                            nma0Var.h(R.string.vk_pay_checkout_code_send_timer);
                        }
                    } else if (vkCheckoutResponseStatus == VkCheckoutResponse.VkCheckoutResponseStatus.ERR_AUTH_DATA_EXPIRED) {
                        mma0Var.xn(R.string.vk_pay_checkout_auth_data_expired);
                        kku0Var.i();
                    } else {
                        mma0Var.xn(R.string.vk_common_network_error);
                        kku0Var.i();
                    }
                }
                mma0Var.un();
                return s3q0.a;
            default:
                p3x0 p3x0Var = (p3x0) obj;
                VoipVideoListFragment voipVideoListFragment = (VoipVideoListFragment) this.receiver;
                int i = VoipVideoListFragment.S;
                z1h0 parentFragment = voipVideoListFragment.getParentFragment();
                t6x0 t6x0Var = parentFragment instanceof t6x0 ? (t6x0) parentFragment : null;
                if (t6x0Var != null) {
                    t6x0Var.Ab(p3x0Var);
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg3(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 5:
                super(1, obj, pim.class, "onUpdateAllByCacheError", "onUpdateAllByCacheError(Ljava/lang/Throwable;)V", 0);
                break;
            case 6:
                super(1, obj, com.vk.feed.settings.impl.presentation.filtered.d.class, "mapStateToTabs", "mapStateToTabs(Lcom/vk/feed/settings/impl/presentation/filtered/NewsfeedFilteredSourcesState;)Ljava/util/List;", 0);
                break;
            default:
                break;
        }
    }
}
