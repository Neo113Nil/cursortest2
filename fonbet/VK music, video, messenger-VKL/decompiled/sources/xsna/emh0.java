package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.zxing.client.result.ParsedResult;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoGetWatchTogetherVideosResponseDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListVh;
import com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.catalog2.feature.search.holders.SearchSpellcheckVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.core.widget.LifecycleHandler;
import com.vk.ecomm.cart.impl.search_address.ui.fragment.SearchAddressFragment;
import com.vk.friends.discover.UsersDiscoverPresenter;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.log.L;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.stories.design.view.stats.tabs.recycler.TabRecyclerPaginatedView;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.StoryStatisticsStickersViewState;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.c;
import com.vk.superapp.bridges.dto.analytics.MiniAppPolicyScreenEventType;
import com.vk.video.ad.a;
import com.vk.video.polls.entrypoint.model.UxPollEntryPointLocation;
import com.vk.video.ui.discovery.minimizable.dialog.about.VideoAboutFragment;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.c;
import com.vk.voip.ui.actions.menu.fragments.CallParticipantPermissionsFragment;
import com.vk.voip.ui.qr.ui.VoipQrCodeScannerFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.c99;
import xsna.eys0;
import xsna.ghw0;
import xsna.hmh0;
import xsna.ikv0;
import xsna.jhw0;
import xsna.lne0;
import xsna.m3p0;
import xsna.o1x0;
import xsna.oiu;
import xsna.q1x;
import xsna.qr60;
import xsna.taw0;
import xsna.xn50;
import xsna.ypr0;
import xsna.zhg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class emh0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ emh0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.vk.core.view.components.topbar.VkTopBar$Middle$d, com.vk.core.view.components.topbar.VkTopBar$c$f] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        n3p0 n3p0Var;
        Uri uri;
        int i = 4;
        switch (this.b) {
            case 0:
                SearchAddressFragment searchAddressFragment = (SearchAddressFragment) this.c;
                hmh0 hmh0Var = (hmh0) obj;
                jmh0 jmh0Var = searchAddressFragment.R;
                jmh0Var.getClass();
                if (hmh0Var instanceof hmh0.a) {
                    searchAddressFragment.kn().onBackPressed();
                } else if (hmh0Var instanceof hmh0.b) {
                    Context requireContext = searchAddressFragment.requireContext();
                    int i2 = q1x.f1;
                    k170 k170Var = new k170(jmh0Var, 21);
                    String str = ((hmh0.b) hmh0Var).a;
                    q1x.b.a(k170Var, new n8v0(1), str != null ? str : "", requireContext);
                } else if (hmh0Var instanceof hmh0.c) {
                    FragmentActivity kn = searchAddressFragment.kn();
                    if (jmh0Var.b == null) {
                        jmh0Var.b = LifecycleHandler.c(kn);
                    }
                    vtk0.d().d(jmh0Var.b, new imh0(jmh0Var));
                }
                return s3q0.a;
            case 1:
                n6i0 n6i0Var = (n6i0) this.c;
                n6i0Var.d.setIsShow(true);
                bwt0.p0(n6i0Var.e, false);
                return s3q0.a;
            case 2:
                ShowAllListVh showAllListVh = (ShowAllListVh) this.c;
                l3a l3aVar = (l3a) obj;
                if (l3aVar instanceof SearchSpellcheckVh.a.C0525a) {
                    CatalogSearchQueryViewHolder c = showAllListVh.c();
                    if (c != null) {
                        c.zf(((SearchSpellcheckVh.a.C0525a) l3aVar).a, true);
                    }
                } else if (l3aVar instanceof SearchSpellcheckVh.a.b) {
                    CatalogSearchQueryViewHolder c2 = showAllListVh.c();
                    if (c2 != null) {
                        c2.zf(((SearchSpellcheckVh.a.b) l3aVar).a, true);
                    }
                    SearchResultsVh.cb(showAllListVh.e, ((SearchSpellcheckVh.a.b) l3aVar).a, null, null, true, SearchInputMethod.Keyboard, false, 38);
                }
                return s3q0.a;
            case 3:
                h7k0 h7k0Var = (h7k0) this.c;
                ikv0.d.c cVar = (ikv0.d.c) obj;
                ey2.i(h7k0Var.w, cVar != null ? cVar.a : null);
                if ((cVar != null ? cVar.b : 0) != 0) {
                    h7k0Var.w.setMaxLines(cVar.b.intValue());
                }
                return s3q0.a;
            case 4:
                return qkk0.m((qkk0) this.c, (Context) obj, VkSpinnerContent.SpinnerState.Loading, VkScreenSpinner.SpinnerMode.Shadow, "Загрузка...", 40);
            case 5:
                return new k6l0((ViewGroup) obj, (com.vk.stickers.settings.g) this.c);
            case 6:
                d9m0 d9m0Var = (d9m0) this.c;
                int i3 = d9m0.n1;
                d9m0Var.getFeature().C((a9m0) obj);
                return s3q0.a;
            case 7:
                StoryStatisticsStickersViewState.f fVar = (StoryStatisticsStickersViewState.f) obj;
                TabRecyclerPaginatedView tabRecyclerPaginatedView = ((com.vk.stories.design.view.stats.tabs.stickers.mvi.c) this.c).e;
                int i4 = c.a.$EnumSwitchMapping$0[fVar.a.ordinal()];
                if (i4 == 1) {
                    tabRecyclerPaginatedView.z();
                } else if (i4 == 2) {
                    tabRecyclerPaginatedView.D();
                } else if (i4 == 3) {
                    tabRecyclerPaginatedView.x();
                } else {
                    if (i4 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tabRecyclerPaginatedView.C();
                }
                StoryStatisticsStickersViewState.b bVar = fVar.b;
                if (bVar instanceof StoryStatisticsStickersViewState.b.C1810b) {
                    tabRecyclerPaginatedView.B();
                } else if (bVar instanceof StoryStatisticsStickersViewState.b.a) {
                    tabRecyclerPaginatedView.A();
                } else {
                    tabRecyclerPaginatedView.j();
                }
                return s3q0.a;
            case 8:
                g0o0 g0o0Var = (g0o0) this.c;
                g0o0Var.R6();
                g620.x(g620.h - 1);
                hd60.a().F0(g0o0Var.itemView.getContext());
                return s3q0.a;
            case 9:
                ToolbarRedesignVh toolbarRedesignVh = (ToolbarRedesignVh) this.c;
                m3p0 m3p0Var = toolbarRedesignVh.A;
                m3p0.a aVar = m3p0Var.j;
                int i5 = 7;
                if (aVar.b) {
                    n3p0Var = new n3p0(new VkTopBar.c.f(new gko(R.drawable.vk_icon_arrow_left_outline_28), tq.h(tlo0.Companion, R.string.accessibility_toolbar_return_back), new dck0(m3p0Var, i5), new b8g(dhr0.Y(BuildInfo.q() ? R.attr.vk_ui_icon_accent : R.attr.vk_ui_icon_accent_themed, null)), null, 40), new VkTopBar.Middle.d((String) m3p0Var.g.invoke(), m3p0Var.j.c, true, null, new r9c0(m3p0Var, 14), new mlf0(m3p0Var, 9), null, new k7l0(m3p0Var, 11), new VkTopBar.Middle.d.b.C0874b(((ToolbarRedesignVh) m3p0Var.f.c).b().getString(R.string.accessibility_search), new dbj0(m3p0Var, 8)), null, 3656), i);
                } else if (aVar.d) {
                    n3p0Var = new n3p0((VkTopBar.c) null, (VkTopBar.Middle) null, (s7p0) m3p0Var.i.invoke(Integer.valueOf(R.drawable.vk_icon_search_outline_28), Integer.valueOf(R.string.accessibility_search), Integer.valueOf(BuildInfo.q() ? R.attr.vk_ui_icon_accent : R.attr.vk_ui_icon_accent_themed), new mcd(m3p0Var, 4)));
                } else {
                    n3p0Var = new n3p0((VkTopBar.c.f) r6, (VkTopBar.Middle.d) r6, i5);
                }
                if (m3p0Var.j.b) {
                    toolbarRedesignVh.g(new ToolbarRedesignVh.a(n3p0Var.a, n3p0Var.b, t7p0.a(toolbarRedesignVh.s.c, null, null, null, null, null, null, 62)));
                } else {
                    s3p0 e = toolbarRedesignVh.e();
                    UIBlockList uIBlockList = ((ToolbarRedesignVh) e.b.c).v;
                    if (uIBlockList != null) {
                        e.a(uIBlockList);
                    } else {
                        String str2 = e.a;
                        e.d(str2 != null ? str2 : "", false);
                    }
                    toolbarRedesignVh.j();
                    ToolbarRedesignVh.a aVar2 = toolbarRedesignVh.s;
                    toolbarRedesignVh.g(ToolbarRedesignVh.a.a(aVar2, null, null, t7p0.a(aVar2.c, n3p0Var.c, null, null, null, null, null, 62), 3));
                }
                return s3q0.a;
            case 10:
                return ((zvq0) this.c).b.e(new awq0((qr60.a) obj));
            case 11:
                ass assVar = (ass) obj;
                return new UsersDiscoverPresenter.a(null, null, ((UsersDiscoverPresenter) this.c).m, assVar.a, assVar.b, 3);
            case 12:
                return (Boolean) ((Map) obj).get((UxPollEntryPointLocation) this.c);
            case 13:
                ppr0 ppr0Var = (ppr0) this.c;
                ypr0.c cVar2 = (ypr0.c) obj;
                zpr0 zpr0Var = ppr0Var.j;
                if (zpr0Var != null) {
                    zpr0Var.a(null);
                }
                ppr0Var.l.setItems(cVar2);
                return s3q0.a;
            case 14:
                VideoAboutFragment videoAboutFragment = (VideoAboutFragment) this.c;
                int i6 = VideoAboutFragment.S;
                ((com.vk.libvideo.bottomsheet.about.delegate.c) videoAboutFragment.R.getValue()).setItems((List) obj);
                return s3q0.a;
            case 15:
                com.vk.video.ad.e eVar = (com.vk.video.ad.e) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                eVar.b.invoke(a.e.b);
                eVar.b(booleanValue);
                d3m.c(eVar.n, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                d3m.c(eVar.q, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 16:
                final VideoAutoPlay videoAutoPlay = (VideoAutoPlay) this.c;
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    final long longValue = ((Number) it.next()).longValue();
                    videoAutoPlay.z1(longValue, new Runnable() { // from class: xsna.i3s0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ye0 ye0Var = VideoAutoPlay.this.N;
                            if (ye0Var != null) {
                                ye0Var.g.c.d(longValue);
                            }
                        }
                    });
                }
                return s3q0.a;
            case 17:
                ((com.vk.video.ui.discovery.minimizable.dialog.episodes.b) this.c).T(new c.a((List) obj));
                return s3q0.a;
            case 18:
                fys0 fys0Var = (fys0) this.c;
                int i7 = fys0.j1;
                eys0.c cVar3 = eys0.c.b;
                fys0Var.getClass();
                xn50.a.c(fys0Var, cVar3);
                return s3q0.a;
            case 19:
                ((tdu) obj).b(((q4t0) this.c).a);
                return s3q0.a;
            case 20:
                grt0 grt0Var = (grt0) this.c;
                L.i((Throwable) obj);
                l7s0 l7s0Var = grt0Var.h;
                if (l7s0Var != null) {
                    l7s0Var.d();
                }
                return s3q0.a;
            case 21:
                yau0 yau0Var = (yau0) this.c;
                Context context = yau0Var.e;
                try {
                    uri = Uri.parse(context.getString(R.string.vk_privacy_policy_link));
                } catch (Throwable unused) {
                    uri = null;
                }
                if (uri != null) {
                    rex0 rex0Var = e370.j;
                    (rex0Var != null ? rex0Var : null).b(context, uri);
                }
                tau0 d = yau0Var.b.d();
                if (d != null) {
                    d.g("mini_app_vk_connect_launch_screen_view_connect_policy", MiniAppPolicyScreenEventType.LAUNCH_SCREEN_VIEW_CONNECT_POLICY);
                }
                return s3q0.a;
            case 22:
                yjv0 yjv0Var = (yjv0) this.c;
                int intValue = ((Integer) obj).intValue();
                TextView textView = yjv0Var.c;
                f4m.t(intValue, textView != null ? textView : null);
                return s3q0.a;
            case 23:
                ((r1w0) this.c).e.b(new IllegalStateException(), "EmptyWebSocket: ".concat((String) obj));
                return s3q0.a;
            case 24:
                Throwable th = (Throwable) obj;
                ((qaw0) this.c).T(new taw0.c.a(th));
                h03.b(th);
                return s3q0.a;
            case 25:
                ((ihw0) this.c).a(new ghw0.h(((jhw0.c) obj).f));
                return s3q0.a;
            case 26:
                mjw0 mjw0Var = (mjw0) this.c;
                oiu oiuVar = (oiu) obj;
                if (oiuVar instanceof oiu.a) {
                    int i8 = CallParticipantPermissionsFragment.S;
                    ze00 ze00Var = mjw0Var.T0;
                    p490 a = r99.a.a();
                    a.v().b(c99.n.a);
                    s3q0 s3q0Var = s3q0.a;
                    a.w();
                    ze00Var.d.a(new ghw0.k.c(new ld(CallParticipantPermissionsFragment.a.a(ze00Var, true), 12)));
                    ze00Var.d.a(ghw0.s.a);
                } else {
                    if (!(oiuVar instanceof oiu.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.vk.voip.ui.c.b.getClass();
                    com.vk.voip.ui.c.F0.a = true;
                    new o1x0.a(((oiu.b) oiuVar).a, null, mjw0Var.v(), 10).I0("VoipShareLinkPagerModalDialog");
                }
                return s3q0.a;
            case 27:
                ((puw0) this.c).l.b(new zhg.a((Throwable) obj));
                return s3q0.a;
            case 28:
                VoipQrCodeScannerFragment voipQrCodeScannerFragment = (VoipQrCodeScannerFragment) this.c;
                ArrayList arrayList = (ArrayList) obj;
                int i9 = VoipQrCodeScannerFragment.W;
                if (!arrayList.isEmpty()) {
                    String parsedResult = ((ParsedResult) arrayList.get(0)).toString();
                    if (!drm0.N(parsedResult)) {
                        voipQrCodeScannerFragment.S.onNext(new lne0.b(parsedResult));
                    }
                }
                return s3q0.a;
            default:
                z2x0 z2x0Var = (z2x0) this.c;
                VideoGetWatchTogetherVideosResponseDto videoGetWatchTogetherVideosResponseDto = (VideoGetWatchTogetherVideosResponseDto) obj;
                String f = videoGetWatchTogetherVideosResponseDto.f();
                iid iidVar = z2x0Var.c;
                List<VideoVideoFullDto> e2 = videoGetWatchTogetherVideosResponseDto.e();
                List<UsersUserFullDto> g = videoGetWatchTogetherVideosResponseDto.g();
                if (g == null) {
                    g = EmptyList.b;
                }
                List<GroupsGroupFullDto> d2 = videoGetWatchTogetherVideosResponseDto.d();
                if (d2 == null) {
                    d2 = EmptyList.b;
                }
                return new u6x0(f, iidVar.f(e2, g, d2), videoGetWatchTogetherVideosResponseDto.getCount());
        }
    }
}
