package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.appcompat.app.d;
import androidx.fragment.app.Fragment;
import com.ironsource.B5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.bridges.ImageViewer;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.donut.impl.PaidSubscriptionsFragment;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.hints.HintId;
import com.vk.dto.user.UserProfile;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.log.L;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.search.fragment.RestoreSearchFragment;
import com.vk.storycamera.screen.StoryCameraFragment;
import com.vk.superapp.api.dto.clips.WebClipBox;
import com.vk.superapp.base.js.bridge.data.VKWebAppPermission;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.VkAlertData;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import com.vk.superapp.browser.internal.utils.InternalMiniApps;
import com.vk.superapp.browser.internal.utils.VkWebFileChooserImpl;
import com.vk.superapp.core.perf.BrowserPerfState;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.superapp.miniapps.impl.AppsCatalogFragment;
import com.vk.superapp.ui.miniapp.EventsAppFragment;
import com.vk.superapp.vksteps.StepsMiniAppIds;
import com.vk.superapp.vksteps.di.VkStepsComponent;
import com.vk.superapp.vkworkout.WorkoutMiniAppIds;
import com.vk.superapp.vkworkout.di.VkWorkoutComponent;
import com.vk.toggle.features.ComFeatures;
import com.vk.webapp.fragments.AccountFragment;
import com.vk.webapp.fragments.ReportFragment;
import com.vk.webapp.fragments.VkPayFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsListFragment;
import com.vkontakte.android.fragments.friends.lists.VkUiFriendsListFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import xsna.b0m0;
import xsna.dw20;
import xsna.h7u0;
import xsna.l7v;
import xsna.oap;
import xsna.wqu;

/* compiled from: WebAppUiRouterBridge.kt */
/* loaded from: classes11.dex */
public final class qfx0 extends iok0<FragmentImpl> implements w8i {
    public static final qfx0 d = new qfx0();
    public static final bpn0 e = new bpn0(new m03(16));
    public static final bpn0 f = new bpn0(new c13(23));
    public static final bpn0 g = new bpn0(new w94(28));
    public static final bpn0 h = new bpn0(new b63(23));
    public static final bpn0 i = new bpn0(new cu2(15));

    /* compiled from: WebAppUiRouterBridge.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkAlertData.DialogType.values().length];
            try {
                iArr[VkAlertData.DialogType.CONFIRMATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: WebAppUiRouterBridge.kt */
    /* loaded from: classes7.dex */
    public static final class b implements SuperappUiRouterBridge.e {
        public final /* synthetic */ long a;
        public final /* synthetic */ int b;
        public final /* synthetic */ gzs<s3q0> c;

        public b(int i, long j, gzs gzsVar) {
            this.a = j;
            this.b = i;
            this.c = gzsVar;
        }

        @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.e
        public final void a() {
            this.c.invoke();
        }

        @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.e
        public final void b() {
            fxv0.a.a(new swv0(this.a, Collections.singletonList(VKWebAppPermission.CAMERA)));
            qfx0 qfx0Var = qfx0.d;
            qfx0Var.getClass();
            iok0.y0(qfx0Var, new ybn0(this.b, 2));
        }
    }

    /* compiled from: WebAppUiRouterBridge.kt */
    /* loaded from: classes7.dex */
    public static final class c implements SuperappUiRouterBridge.e {
        public final /* synthetic */ long a;
        public final /* synthetic */ int b;
        public final /* synthetic */ gzs<s3q0> c;

        public c(int i, long j, gzs gzsVar) {
            this.a = j;
            this.b = i;
            this.c = gzsVar;
        }

        @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.e
        public final void a() {
            this.c.invoke();
        }

        @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.e
        public final void b() {
            fxv0.a.a(new swv0(this.a, Collections.singletonList(VKWebAppPermission.STORAGE)));
            qfx0 qfx0Var = qfx0.d;
            qfx0Var.getClass();
            iok0.y0(qfx0Var, new h5g(this.b, 1));
        }
    }

    /* compiled from: WebAppUiRouterBridge.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public d(Object obj) {
            super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    @SuppressLint({"CheckResult"})
    public static void A0(FragmentImpl fragmentImpl, String str, ihx0 ihx0Var) {
        io.reactivex.rxjava3.core.x k;
        if (fkq0.b(ihx0Var.a())) {
            ComFeatures comFeatures = ComFeatures.COM_GROUPS_GETBYID_CODEGEN;
            comFeatures.getClass();
            if (com.vk.toggle.b.A.a(comFeatures)) {
                fz2 y = yfb.y(wqu.a.b(new zqu(), Collections.singletonList(fkq0.a(ihx0Var.a())), e43.l(GroupsFieldsDto.MEMBERS_COUNT, GroupsFieldsDto.IS_CLOSED, GroupsFieldsDto.START_DATE, GroupsFieldsDto.CAN_MESSAGE, GroupsFieldsDto.IS_MESSAGES_BLOCKED, GroupsFieldsDto.MEMBER_STATUS, GroupsFieldsDto.BAN_INFO, GroupsFieldsDto.IS_MARKET_CART_ENABLED, GroupsFieldsDto.ENABLED_FEATURES), null, 4), new ev60(26));
                ahn.D(y);
                k = rsg0.w0(y).m(io.reactivex.rxjava3.android.schedulers.a.b());
            } else {
                k = rsg0.w0(new rpu(fkq0.e(ihx0Var.a()))).m(io.reactivex.rxjava3.android.schedulers.a.b());
            }
        } else {
            k = io.reactivex.rxjava3.core.x.k(new Group());
        }
        k.subscribe(new fsq0(new vkb(fragmentImpl, str, ihx0Var), 7), new pw40(new d(L.a), 25));
    }

    public static String z0(Map map) {
        if (map.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("https://" + a0a.d + "/account");
        int i2 = 0;
        if (map.size() == 1) {
            String str = (String) j5g.O0(map.keySet()).get(0);
            sb.append("?" + str + B5.U + ((String) map.get(str)));
            return sb.toString();
        }
        for (Object obj : j5g.O0(map.keySet())) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            String str2 = (String) obj;
            if (i2 == 0) {
                sb.append("?" + str2 + B5.U + ((String) map.get(str2)));
            } else {
                sb.append("&" + str2 + B5.U + ((String) map.get(str2)));
            }
            i2 = i3;
        }
        return sb.toString();
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void A(final long j) {
        iok0.y0(this, new izs() { // from class: xsna.mfx0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                int i2 = ReportFragment.a0;
                ReportFragment.a a2 = ReportFragment.b.a();
                a2.K(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                a2.B(j);
                a2.l((FragmentImpl) obj);
                return s3q0.a;
            }
        });
    }

    @Override // xsna.iok0, com.vk.superapp.bridges.SuperappUiRouterBridge
    public final boolean B(WebView webView) {
        return kjx0.a(webView);
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void D(int i2, Context context) {
        new a2(i2).k(context);
    }

    @Override // xsna.iok0, com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void E(Context context, String str) {
        cvk.w(str, false);
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final Fragment F(WebApiApplication webApiApplication, String str, String str2, String str3) {
        return bis.e(new bis(), n34.C(webApiApplication), str, str2, str3, new BrowserPerfState()).f();
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void H(List list) {
        iok0.y0(this, new d720(list, 1));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final io.reactivex.rxjava3.disposables.c I(JSONObject jSONObject, zhx0 zhx0Var, ufg0 ufg0Var) {
        io.reactivex.rxjava3.core.q a2 = b0m0.a.a(new oap.a(jSONObject));
        FragmentImpl w0 = w0();
        io.reactivex.rxjava3.core.q m = hg1.m(a2, w0 != null ? w0.mo2getContext() : null, 0L, false, 62);
        asu0.a.getClass();
        return m.r0(asu0.r()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new zk30(new gqw0(zhx0Var, 2), 28), new wbs0(new l6w0(ufg0Var, 3), 7));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void K(mk mkVar, maj majVar) {
        Context mo2getContext;
        FragmentImpl w0 = w0();
        if (w0 == null || (mo2getContext = w0.mo2getContext()) == null) {
            return;
        }
        new dw20.b(mo2getContext).M(R.drawable.vk_icon_phone_outline_56, Integer.valueOf(R.attr.vk_ui_icon_accent)).v0(R.string.vk_apps_call_join_title).r0(R.string.vk_apps_call_join_description).h0(R.string.vk_apps_call_join_button_positive, new yqd0(mkVar, 27)).T(R.string.vk_apps_call_join_button_negative, new uyq0(majVar, 11)).X(new d8t0(majVar, 13)).I0(null);
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void L(Activity activity) {
        if (o25.a().i().y) {
            int i2 = VkPayFragment.g0;
            VkPayFragment.b.b(null).h(activity, 1004);
        }
    }

    @Override // xsna.iok0, com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void M(Context context, UserId userId, Map<String, String> map) {
        int i2 = AccountFragment.a0;
        AccountFragment.b.a(null, z0(map), o25.a().s(userId), null, false, false, null, null, 249).k(context);
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void N(final int i2) {
        iok0.y0(this, new izs() { // from class: xsna.lfx0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a("", "");
                aVar.s();
                aVar.C = true;
                new StoryCameraFragment.a(aVar.a()).g(i2, (FragmentImpl) obj);
                return s3q0.a;
            }
        });
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final VkWebFileChooserImpl P(Fragment fragment) {
        return fragment instanceof FragmentImpl ? new hgx0((FragmentImpl) fragment) : fragment.getParentFragment() instanceof FragmentImpl ? new hgx0((FragmentImpl) fragment.getParentFragment()) : new VkWebFileChooserImpl(fragment, "com.vk.common.VKFileProvider");
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void Q(Context context) {
        new AppsCatalogFragment.a().k(context);
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final SuperappUiRouterBridge.c S(Activity activity, Rect rect, wzb0 wzb0Var) {
        l7v b2 = pla.e().b();
        String id = HintId.INFO_MINI_APPS_THIRD_PARTY_BUTTONS.getId();
        b2.getClass();
        l7v.b bVar = new l7v.b(id, b2, rect);
        bVar.i(new wz5(wzb0Var, 15));
        dcn j = bVar.j(activity);
        if (j == null) {
            return null;
        }
        return new wfx0(j);
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final boolean T(final long j, final String str, final String str2, final boolean z, final boolean z2) {
        iok0.y0(this, new izs() { // from class: xsna.pfx0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                q6c0 q6c0Var = new q6c0();
                q6c0Var.y(j, str, str2, z, z2);
                q6c0Var.g(112, (FragmentImpl) obj);
                return s3q0.a;
            }
        });
        return true;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void U(String str) {
        iok0.y0(this, new ak2(str, 4));
    }

    @Override // xsna.iok0, com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void V(Context context, Map map) {
        int i2 = AccountFragment.a0;
        AccountFragment.b.a(null, z0(map), null, null, false, false, null, null, 253).k(context);
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void W(WebApiApplication webApiApplication, String str) {
        iok0.y0(this, new q7a0(16, webApiApplication, str));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void Y(String str, String str2, String str3) {
        Handler handler = x93.a;
        c63 c63Var = c63.a;
        Activity b2 = c63.b();
        if (b2 == null || p90.e(b2)) {
            return;
        }
        iok0.y0(this, new fwg(b2, str, str2, str3, 2));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void a(WebApiApplication webApiApplication, int i2, int i3, im80 im80Var, e1s0 e1s0Var, pnr0 pnr0Var, Context context) {
        gau.c().a(webApiApplication, i2, i3, im80Var, e1s0Var, pnr0Var, context);
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void a0(Context context) {
        context.startActivity(((qct) e.getValue()).b().n(context).addFlags(268435456));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final boolean b(long j) {
        return a201.b().P().b(j);
    }

    @Override // xsna.iok0, com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void b0(Context context) {
        ww50 v = s200.v(context);
        nx50 nx50Var = v instanceof nx50 ? (nx50) v : null;
        if (nx50Var != null) {
            nx50Var.o0(false);
        }
    }

    @Override // xsna.iok0, com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void c0(final long j, final WebApiApplication webApiApplication, final SuperappUiRouterBridge.f fVar, final Integer num, final nex0 nex0Var) {
        iok0.y0(this, new izs() { // from class: xsna.nfx0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                Context mo2getContext = ((FragmentImpl) obj).mo2getContext();
                SuperappUiRouterBridge.f fVar2 = fVar;
                if (mo2getContext == null) {
                    fVar2.a();
                    return s3q0.a;
                }
                WebApiApplication webApiApplication2 = webApiApplication;
                ApiApplication b2 = chx0.b(webApiApplication2);
                long j2 = webApiApplication2.b;
                nex0 nex0Var2 = nex0Var;
                String str = nex0Var2.a;
                String str2 = nex0Var2.b;
                op20 op20Var = new op20(b2, mo2getContext, new mq20(str, str2 == null ? str : str2, (String) null, str2 == null ? str : str2, 116, (String) null, (String) null), new iq20(null, "link", null, null, null, null, new sfx0(fVar2), null, PsExtractor.PRIVATE_STREAM_1), new aq20(null, null, null, null, num, null, null, false, null, false, 4079));
                if (webApiApplication2.f() || (webApiApplication2.g() && !webApiApplication2.B)) {
                    hf3.c(op20Var);
                } else {
                    if (!webApiApplication2.B) {
                        InternalMiniApps.Companion.getClass();
                        if (j2 != InternalMiniApps.VK_PAY_OLD.h().a && j2 != EventsAppFragment.a0) {
                            com.vk.common.links.c.g(fkq0.e(new UserId(j)), webApiApplication2.c, op20Var);
                        }
                    }
                    com.vk.common.links.c.K(op20Var);
                }
                fVar2.onSuccess();
                return s3q0.a;
            }
        });
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void d(Context context) {
        gau.c().d(context);
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void d0(String str, r8r0 r8r0Var) {
        o19.s(str, new mwm0(r8r0Var, 25));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final Long e() {
        return gau.c().e();
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void f(long j, String str) {
        q19 q19Var = q19.a;
        a201.b().P().a(j, str, new xa4());
    }

    @Override // xsna.iok0, com.vk.superapp.bridges.SuperappUiRouterBridge
    public final Object f0(long j) {
        z1w0 je = ((VkWorkoutComponent) ((k7m) m7m.f(this)).a(fpf0.a(VkWorkoutComponent.class))).je();
        cmv0 I5 = ((VkStepsComponent) ((k7m) m7m.f(this)).a(fpf0.a(VkStepsComponent.class))).I5();
        HashMap hashMap = new HashMap();
        FragmentImpl w0 = d.w0();
        if (w0 != null) {
            hashMap.put(VkUiCommand.FRIENDS_SEARCH, new dwv0(w0));
            hashMap.put(VkUiCommand.INSTALL_BUNDLE, new avv0());
            hashMap.put(VkUiCommand.UPDATE_MARKET_ITEM, new oxv0(w0));
            hashMap.put(VkUiCommand.OPEN_VMOJI_CAPTURE, new uxv0(j));
            hashMap.put(VkUiCommand.UPDATE_FOLLOWERS_MODE, new zvv0());
            zrp<StepsMiniAppIds> h2 = StepsMiniAppIds.h();
            if (h2 == null || !h2.isEmpty()) {
                Iterator<E> it = h2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((StepsMiniAppIds) it.next()).i() == j) {
                        VkUiCommand vkUiCommand = VkUiCommand.GET_STEPS;
                        hashMap.put(vkUiCommand, I5.a(w0, vkUiCommand));
                        VkUiCommand vkUiCommand2 = VkUiCommand.GET_HEALTH_CONNECT_STEPS;
                        hashMap.put(vkUiCommand2, I5.a(w0, vkUiCommand2));
                        VkUiCommand vkUiCommand3 = VkUiCommand.GET_HEALTH_CONNECT_INFO;
                        hashMap.put(vkUiCommand3, I5.a(w0, vkUiCommand3));
                        VkUiCommand vkUiCommand4 = VkUiCommand.GET_GOOGLE_FIT_STEPS_PERMISSIONS;
                        hashMap.put(vkUiCommand4, I5.a(w0, vkUiCommand4));
                        VkUiCommand vkUiCommand5 = VkUiCommand.GET_HEALTH_CONNECT_STEPS_PERMISSIONS;
                        hashMap.put(vkUiCommand5, I5.a(w0, vkUiCommand5));
                        break;
                    }
                }
            }
            zrp<WorkoutMiniAppIds> h3 = WorkoutMiniAppIds.h();
            if (h3 == null || !h3.isEmpty()) {
                Iterator<E> it2 = h3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((WorkoutMiniAppIds) it2.next()).i() == j) {
                        VkUiCommand vkUiCommand6 = VkUiCommand.GET_GOOGLE_FIT_WORKOUTS;
                        hashMap.put(vkUiCommand6, je.a(w0, vkUiCommand6));
                        VkUiCommand vkUiCommand7 = VkUiCommand.GET_GOOGLE_FIT_WORKOUT_PERMISSIONS;
                        hashMap.put(vkUiCommand7, je.a(w0, vkUiCommand7));
                        VkUiCommand vkUiCommand8 = VkUiCommand.ASK_GOOGLE_FIT_WORKOUT_PERMISSIONS;
                        hashMap.put(vkUiCommand8, je.a(w0, vkUiCommand8));
                        VkUiCommand vkUiCommand9 = VkUiCommand.GET_HEALTH_CONNECT_WORKOUTS;
                        hashMap.put(vkUiCommand9, je.a(w0, vkUiCommand9));
                        VkUiCommand vkUiCommand10 = VkUiCommand.GET_HEALTH_CONNECT_WORKOUT_PERMISSIONS;
                        hashMap.put(vkUiCommand10, je.a(w0, vkUiCommand10));
                        VkUiCommand vkUiCommand11 = VkUiCommand.ASK_HEALTH_CONNECT_WORKOUT_PERMISSIONS;
                        hashMap.put(vkUiCommand11, je.a(w0, vkUiCommand11));
                        break;
                    }
                }
            }
        }
        return hashMap;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void g(WebApiApplication webApiApplication, String str, q7j0 q7j0Var, String str2) {
        iok0.y0(this, new t97(webApiApplication, str, q7j0Var, str2, 1));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final ViewGroup h(long j, LayoutInflater layoutInflater, ViewGroup viewGroup, qjo0 qjo0Var) {
        hmv0 l3 = ((VkStepsComponent) ((k7m) m7m.f(this)).a(fpf0.a(VkStepsComponent.class))).l3();
        if (j == InternalVkMiniApps.STEPS.h().a || j == InternalVkMiniApps.STEPS_STAGE.h().a) {
            return l3.i(layoutInflater, viewGroup, qjo0Var);
        }
        return null;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void i0(Context context, UserId userId) {
        ProfileFragmentProviderComponent profileFragmentProviderComponent = (ProfileFragmentProviderComponent) g.getValue();
        ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
        profileFragmentProviderComponent.ye(userId, null).k(context);
    }

    @Override // xsna.iok0, com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void k(Context context, WebApiApplication webApiApplication, nex0 nex0Var, String str, String str2, Integer num, String str3, boolean z) {
        hf3.c(new op20(n34.C(webApiApplication), context, new mq20(nex0Var.a(), (String) null, (String) null, (String) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (String) null, (String) null), new iq20(str2, str == null ? "" : str, null, null, num, str3, null, null, 204), new aq20(null, null, null, null, null, null, null, false, null, z, 2047)));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final boolean l(String str) {
        FragmentImpl w0 = w0();
        if (w0 == null) {
            return false;
        }
        new RestoreSearchFragment.a(str).g(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, w0);
        return true;
    }

    @Override // xsna.iok0, com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void l0(l5g0 l5g0Var, defpackage.l lVar) {
        p870.f().a(9, 1010, new vfx0(lVar));
        iok0.y0(this, new fvq0(l5g0Var, 23));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final SuperappUiRouterBridge.c m(Activity activity, Rect rect, vf1 vf1Var) {
        l7v b2 = pla.e().b();
        String id = HintId.INFO_MINI_APPS_BADGES_ACTION_MENU.getId();
        b2.getClass();
        l7v.b bVar = new l7v.b(id, b2, rect);
        bVar.i(new s01(vf1Var, 17));
        return new tfx0(d370.K(new ofx0(0, bVar, activity)));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final io.reactivex.rxjava3.disposables.c m0(WebClipBox webClipBox, Long l, String str) {
        io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new she(webClipBox, 5));
        FragmentImpl w0 = w0();
        io.reactivex.rxjava3.core.q m = hg1.m(s0Var, w0 != null ? w0.mo2getContext() : null, 0L, false, 62);
        asu0.a.getClass();
        return m.r0(asu0.r()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new whm0(new qum0(9, l, str), 13), new jfx0(new een0(10, l, str), 0));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void n(final boolean z) {
        iok0.y0(this, new izs() { // from class: xsna.kfx0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                FragmentImpl fragmentImpl = (FragmentImpl) obj;
                VkUiFriendsListFragment.a aVar = new VkUiFriendsListFragment.a(VkUiFriendsListFragment.class, null, null);
                aVar.y();
                if (z) {
                    aVar.z();
                }
                aVar.D(!BuildInfo.s());
                aVar.j.putBoolean("ignore_blacklisted", true);
                aVar.A();
                aVar.B(fragmentImpl.getString(R.string.vk_apps_select_friends));
                aVar.g(108, fragmentImpl);
                return s3q0.a;
            }
        });
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final boolean n0(int i2, ArrayList arrayList) {
        Handler handler = x93.a;
        c63 c63Var = c63.a;
        Activity b2 = c63.b();
        if (b2 == null || p90.e(b2)) {
            L.G("can't route on empty activity!");
            return false;
        }
        ImageViewer d2 = myc0.d();
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(n34.B((WebImage) it.next()));
        }
        ImageViewer.b(d2, i2, arrayList2, b2, new rfx0(), false, null, 496);
        return true;
    }

    @Override // xsna.iok0, com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void o(Context context) {
        ((mh70) i.getValue()).c(context);
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final boolean p() {
        return a201.b().isCallActive();
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final SuperappUiRouterBridge.c p0(Activity activity, Rect rect, tsk0 tsk0Var) {
        l7v b2 = pla.e().b();
        String id = HintId.INFO_MINI_APPS_BADGES_INTRO.getId();
        b2.getClass();
        l7v.b bVar = new l7v.b(id, b2, rect);
        bVar.i(new t01(tsk0Var, 14));
        dcn j = bVar.j(activity);
        if (j == null) {
            return null;
        }
        return new ufx0(j);
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final boolean q(String str) {
        iok0.y0(this, new yw(str, 2));
        return true;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void q0(co0 co0Var) {
        iok0.y0(this, new mrw0(co0Var, 4));
    }

    @Override // xsna.iok0, com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void r(Context context) {
        ww50 v = s200.v(context);
        nx50 nx50Var = v instanceof nx50 ? (nx50) v : null;
        if (nx50Var != null) {
            nx50Var.o0(true);
        }
    }

    @Override // xsna.iok0, com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void r0(Context context) {
        new oz50(SettingsListFragment.class, null, null).k(context);
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final boolean s(int i2, long j, boolean z, gzs<s3q0> gzsVar) {
        if (z) {
            k0(SuperappUiRouterBridge.Permission.CAMERA_VMOJI, new b(i2, j, gzsVar));
            return true;
        }
        k0(SuperappUiRouterBridge.Permission.DISK, new c(i2, j, gzsVar));
        return true;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final List<UserId> s0(Intent intent) {
        Collection parcelableArrayListExtra = intent.getParcelableArrayListExtra("result");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = EmptyList.b;
        }
        UserId userId = (UserId) intent.getParcelableExtra("uid");
        if (parcelableArrayListExtra.isEmpty()) {
            if (userId != null) {
                return Collections.singletonList(userId);
            }
            return null;
        }
        Collection collection = parcelableArrayListExtra;
        ArrayList arrayList = new ArrayList(c5g.u(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((UserProfile) it.next()).c);
        }
        return arrayList;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final boolean t(ihx0 ihx0Var) {
        iok0.y0(this, new cus0(ihx0Var, 13));
        return true;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void t0(Context context) {
        context.startActivity(new PaidSubscriptionsFragment.a().n(context));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final boolean v(ihx0 ihx0Var, String str) {
        iok0.y0(this, new v53(28, ihx0Var, str));
        return true;
    }

    @Override // xsna.iok0
    public final d.a v0(Context context, VkAlertData.DialogType dialogType) {
        h7u0.a c2;
        if ((dialogType == null ? -1 : a.$EnumSwitchMapping$0[dialogType.ordinal()]) != 1) {
            return new h7u0.a(context);
        }
        int i2 = h7u0.p;
        c2 = h7u0.b.c(context);
        return c2;
    }

    @Override // xsna.iok0, com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void w(String str, String str2, String str3) {
        if (o25.a().i().y) {
            iok0.y0(this, new ihb(str, str2, str3, 11));
        }
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void y(g5i g5iVar) {
        iok0.y0(this, new ujm0(g5iVar, 24));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void z(String str) {
        o19.d(str);
    }
}
