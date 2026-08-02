package xsna;

import android.app.Activity;
import android.view.View;
import com.mbridge.msdk.config.dynamic.baseview.ComponentHorizontalScrollView;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.ui.password.askpassword.VkAskPasswordData;
import com.vk.auth.ui.password.askpassword.VkAskPasswordForLoginData;
import com.vk.auth.ui.password.askpassword.VkAskPasswordView;
import com.vk.auth.ui.password.askpassword.VkExtendPartialTokenData;
import com.vk.auth.ui.password.askpassword.VkExtendSilentTokenData;
import com.vk.catalog2.common.dto.api.music.RadioStation;
import com.vk.catalog2.common.ui.holders.ads.AdShowCaseBannerVh;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.feature.music.dto.ui.UIBlockRadioStation;
import com.vk.catalog2.feature.music.holders.RadioStationCellVh;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.MusicTrack;
import com.vk.feed.design.view.newsfeed.ads_mytarget.bls.MyTargetAdSurveyButtonsView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayEntitySource;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.reactions.fragments.ReactionsFragment;
import com.vk.silentauth.SilentTokenProviderInfo;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioTapPlayEventItem;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.toggle.debug.BaseDebugTogglesFragment;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.video.controls20.SimpleControlsView;
import xsna.h7u0;
import xsna.zn30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ai0 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ai0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zu50 zu50Var;
        MusicTrack b;
        MusicTrack b2;
        int i = this.b;
        int i2 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                AdShowCaseBannerVh adShowCaseBannerVh = (AdShowCaseBannerVh) obj;
                c63 c63Var = c63.a;
                Activity b3 = c63.b();
                if (b3 == null || (zu50Var = adShowCaseBannerVh.q) == null) {
                    return;
                }
                zu50Var.e(b3);
                return;
            case 1:
                BaseDebugTogglesFragment baseDebugTogglesFragment = (BaseDebugTogglesFragment) obj;
                int i3 = BaseDebugTogglesFragment.X;
                itg0.c(new io.reactivex.rxjava3.internal.operators.completable.m(new lc6(baseDebugTogglesFragment, i2)).q(asu0.a.c()).g(new ig4(baseDebugTogglesFragment, r3)).subscribe(), baseDebugTogglesFragment);
                return;
            case 2:
                ((ComponentHorizontalScrollView) obj).a(view);
                return;
            case 3:
                gzs<s3q0> gzsVar = ((u1o) obj).h;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    return;
                }
                return;
            case 4:
                ((z4w) obj).dismiss();
                return;
            case 5:
                zn30.a aVar = ((yn30) obj).k;
                if (aVar != null) {
                    aVar.c();
                    return;
                }
                return;
            case 6:
                izs<? super View, s3q0> izsVar = ((MyTargetAdSurveyButtonsView) obj).f;
                if (izsVar != null) {
                    izsVar.invoke(view);
                    return;
                }
                return;
            case 7:
                RadioStationCellVh radioStationCellVh = (RadioStationCellVh) obj;
                UIBlockRadioStation uIBlockRadioStation = radioStationCellVh.g;
                if (uIBlockRadioStation != null) {
                    RadioStation radioStation = uIBlockRadioStation.y;
                    u2b0 u2b0Var = radioStationCellVh.b;
                    if (radioStation.h) {
                        MusicTrack a = qwp0.a(radioStation);
                        r3 = (u2b0Var.h() && (b = u2b0Var.b()) != null && b.Wb() && (b2 = u2b0Var.b()) != null && b2.b == radioStation.b) ? 1 : 0;
                        radioStationCellVh.d.a(new cfp0(uIBlockRadioStation, new MusicAnalyticsInfo(r3 != 0 ? MusicAnalyticsInfo.ClickTarget.Pause : MusicAnalyticsInfo.ClickTarget.Play)));
                        if (r3 == 0) {
                            radioStationCellVh.e.k(RadioStationCellVh.a(uIBlockRadioStation), CommonAudioStat$TypeAudioTapPlayEventItem.Type.START);
                        }
                        u2b0Var.N0(new lqk0((StartPlaySource) new StartPlayEntitySource(StartPlayEntitySource.PlayEntitySource.CATALOG, uIBlockRadioStation.b, false, 4, null), a, (List) null, (MusicPlaybackLaunchContext) null, 0, ShuffleMode.SHUFFLE_OFF, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) (0 == true ? 1 : 0), 0L, 956));
                        return;
                    }
                    if (radioStation.g) {
                        int i4 = h7u0.p;
                        VkCell vkCell = radioStationCellVh.f;
                        h7u0.a c = h7u0.b.c((vkCell != null ? vkCell : null).getContext());
                        c.g0(R.string.confirm);
                        c.U(R.string.music_catalog_radio_station_disabled);
                        c.c0(R.string.delete, new hj7(3, radioStationCellVh, uIBlockRadioStation));
                        c.W(R.string.cancel, new wue0());
                        c.m();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                int i5 = ReactionsFragment.j0;
                h3p0.b((ReactionsFragment) obj);
                return;
            case 9:
                int i6 = SimpleControlsView.S;
                ((SimpleControlsView) obj).getClass();
                return;
            case 10:
                ((gzs) obj).invoke();
                return;
            default:
                VkAskPasswordView vkAskPasswordView = (VkAskPasswordView) obj;
                com.vk.auth.ui.password.askpassword.a aVar2 = vkAskPasswordView.y;
                String password = vkAskPasswordView.w.getPassword();
                io.reactivex.rxjava3.disposables.b bVar = aVar2.g;
                bpn0 bpn0Var = aVar2.i;
                VkAskPasswordView vkAskPasswordView2 = aVar2.b;
                f4m.j(vkAskPasswordView2.x);
                vkAskPasswordView2.w.setPasswordBackgroundId(null);
                VkAskPasswordData vkAskPasswordData = aVar2.d;
                if (vkAskPasswordData == null) {
                    vkAskPasswordData = null;
                }
                boolean z = vkAskPasswordData instanceof VkExtendPartialTokenData;
                int i7 = 24;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                if (z) {
                    VkExtendPartialTokenData vkExtendPartialTokenData = (VkExtendPartialTokenData) vkAskPasswordData;
                    vdx0 vdx0Var = e370.e;
                    vdx0 vdx0Var2 = vdx0Var != null ? vdx0Var : null;
                    int i8 = 6;
                    bVar.b(mnh0.B(new io.reactivex.rxjava3.internal.operators.observable.c0(vdx0Var2.e().q(vkExtendPartialTokenData.d, vkExtendPartialTokenData.b, password, vkExtendPartialTokenData.c), new dbu0(new gqq0(aVar2, i8), i2), kVar).G(new bpk(aVar2, i8)), (ygg) bpn0Var.getValue(), new c3k0(aVar2, 16), new g15(aVar2, 11), new ngl(null, null, null, null, null, new r2v(aVar2, i7), null, null, null, null, 991)));
                    return;
                }
                if (!(vkAskPasswordData instanceof VkExtendSilentTokenData)) {
                    if (!(vkAskPasswordData instanceof VkAskPasswordForLoginData)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Serializer.c<VkAuthState> cVar = VkAuthState.CREATOR;
                    VkAskPasswordForLoginData vkAskPasswordForLoginData = (VkAskPasswordForLoginData) vkAskPasswordData;
                    VkAuthState b4 = VkAuthState.a.b(vkAskPasswordForLoginData.b, password, vkAskPasswordForLoginData.c, vkAskPasswordForLoginData.d);
                    q55 q55Var = q55.a;
                    q55.c().a.I = new VkAuthMetaInfo(null, null, null, SilentAuthSource.BY_LOGIN, null, null, 55, null);
                    aVar2.b(l55.c(l55.a, aVar2.a, b4, null, 12));
                    return;
                }
                VkExtendSilentTokenData vkExtendSilentTokenData = (VkExtendSilentTokenData) vkAskPasswordData;
                List<SilentTokenProviderInfo> list = vkExtendSilentTokenData.d;
                int i9 = 10;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((SilentTokenProviderInfo) it.next()).d);
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((SilentTokenProviderInfo) it2.next()).c);
                }
                vdx0 vdx0Var3 = e370.e;
                bVar.b(mnh0.B(new io.reactivex.rxjava3.internal.operators.observable.c0((vdx0Var3 != null ? vdx0Var3 : null).e().i(vkExtendSilentTokenData.b, password, vkExtendSilentTokenData.c, arrayList, arrayList2), new j7l0(new lzl0(aVar2, 14), i9), kVar).G(new bq1(aVar2, 5)), (ygg) bpn0Var.getValue(), new z4t0(aVar2, 2), new a2a(aVar2, 13), new ngl(null, null, null, null, null, new r2v(aVar2, i7), null, null, null, null, 991)));
                return;
        }
    }
}
