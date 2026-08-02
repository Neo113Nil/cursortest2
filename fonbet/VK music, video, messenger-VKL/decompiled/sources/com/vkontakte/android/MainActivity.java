package com.vkontakte.android;

import android.app.assist.AssistContent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.f;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.auth.main.AuthActivity;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.validation.VkPassportRouterInfo;
import com.vk.billing.PurchasesManagerComponent;
import com.vk.common.links.LaunchContext;
import com.vk.common.links.contract.AnonymousLinker;
import com.vk.core.apps.BuildInfo;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.performance.network.NetworkPerformanceMeasurer;
import com.vk.core.preference.Preference;
import com.vk.core.view.FitSystemWindowsFragmentWrapperFrameLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.id.UserId;
import com.vk.fullscreen.promo.core.FullscreenPromoComponent;
import com.vk.fullscreen.promo.core.FullscreenPromoEvent;
import com.vk.im.ui.dialogs_list.ImDialogsFragment;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.location.common.LocationCommon;
import com.vk.log.L;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.AppStartReporter;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.qr.web2app.QrWebToAppComponent;
import com.vk.toggle.b;
import com.vk.toggle.d;
import com.vk.toggle.features.CoreFeatures;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.calls.join.api.di.VoipCallsJoinRouterComponent;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.R;
import com.vkontakte.android.ShortcutManagerWrapper;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.b0;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.single.u;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptySet;
import xsna.a0a;
import xsna.a1w;
import xsna.aej;
import xsna.ag7;
import xsna.asu0;
import xsna.b68;
import xsna.bd00;
import xsna.bk40;
import xsna.c2k;
import xsna.c4g0;
import xsna.cd00;
import xsna.cia;
import xsna.crw;
import xsna.d750;
import xsna.dhr0;
import xsna.dia;
import xsna.dnh0;
import xsna.dx90;
import xsna.e370;
import xsna.e43;
import xsna.f620;
import xsna.f93;
import xsna.fa00;
import xsna.fb8;
import xsna.fd00;
import xsna.fnj;
import xsna.fpf0;
import xsna.frf0;
import xsna.frw0;
import xsna.g460;
import xsna.gml;
import xsna.gs2;
import xsna.hd00;
import xsna.hg1;
import xsna.i0q0;
import xsna.i2i0;
import xsna.i460;
import xsna.i570;
import xsna.i5s;
import xsna.iah0;
import xsna.icw;
import xsna.iej;
import xsna.ikv0;
import xsna.imj0;
import xsna.itg0;
import xsna.izi0;
import xsna.j460;
import xsna.j6i;
import xsna.jcw;
import xsna.jpo;
import xsna.k03;
import xsna.k460;
import xsna.kb8;
import xsna.kcw;
import xsna.koe0;
import xsna.l140;
import xsna.l93;
import xsna.lmg0;
import xsna.lyo;
import xsna.m5j0;
import xsna.m6r0;
import xsna.m7m;
import xsna.mb8;
import xsna.mco;
import xsna.mnh0;
import xsna.msy;
import xsna.n5j0;
import xsna.nax;
import xsna.nqo0;
import xsna.nzx;
import xsna.o25;
import xsna.o2l;
import xsna.oar0;
import xsna.oax;
import xsna.oge0;
import xsna.om;
import xsna.onl;
import xsna.oqo0;
import xsna.ow90;
import xsna.oz50;
import xsna.ozx;
import xsna.p5j0;
import xsna.phw0;
import xsna.ppx0;
import xsna.ps3;
import xsna.q1w;
import xsna.q6r0;
import xsna.qaj0;
import xsna.rao;
import xsna.rsr;
import xsna.s1m;
import xsna.s3q0;
import xsna.sw90;
import xsna.t090;
import xsna.u090;
import xsna.uc00;
import xsna.v8k0;
import xsna.vdj;
import xsna.vto0;
import xsna.w9f0;
import xsna.wdw0;
import xsna.wvv;
import xsna.xdr0;
import xsna.xfl;
import xsna.xwk;
import xsna.y1z;
import xsna.y57;
import xsna.y6n0;
import xsna.ziv;

/* loaded from: classes11.dex */
public class MainActivity extends NavigationDelegateActivity implements lmg0 {
    public static final String P = i5s.a(new StringBuilder("https://"), a0a.d, "/mobile");
    public c A;
    public c B;
    public final Object C;
    public boolean D;
    public boolean E;
    public phw0 F;
    public frw0 G;
    public koe0 H;
    public oge0 I;
    public final p5j0 J;
    public c K;
    public final Object L;
    public final Object M;
    public final boolean N;
    public final a O;
    public boolean w = false;
    public boolean x = false;
    public long y = 0;
    public final Object z;

    public class a implements NetworkPerformanceMeasurer.a {
        public volatile boolean a = false;
        public volatile boolean b = false;
        public final hd00 c = new Runnable() { // from class: xsna.hd00
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.a aVar = MainActivity.a.this;
                ikv0.a aVar2 = new ikv0.a(MainActivity.this);
                String string = MainActivity.this.getString(R.string.adaptive_feed_media_enabled_title);
                String string2 = MainActivity.this.getString(R.string.adaptive_feed_media_enabled_message);
                String string3 = MainActivity.this.getString(R.string.adaptive_feed_media_enabled_action);
                VkButton.Mode mode = VkButton.Mode.Primary;
                VkButton.Appearance appearance = VkButton.Appearance.Accent;
                VkButton.Size size = VkButton.Size.Small;
                aVar2.i(new ikv0.d(string, string2, new ikv0.d.a(string3, new fgh(aVar, 26))));
                aVar2.b().c();
                aVar.a = true;
                NetworkPerformanceMeasurer.a.getClass();
                asu0.a.getClass();
                asu0.j().submit(new bv9(aVar, 7));
            }
        };

        /* JADX WARN: Type inference failed for: r1v2, types: [xsna.hd00] */
        public a() {
        }

        @Override // com.vk.core.performance.network.NetworkPerformanceMeasurer.a
        public final void a(@NonNull NetworkPerformanceMeasurer.NetworkClass networkClass, boolean z) {
            if (Preference.j().getBoolean("isRoamingState", false) || !Preference.j().getBoolean("adaptive_feed_media", true) || this.a) {
                return;
            }
            if (networkClass == NetworkPerformanceMeasurer.NetworkClass.GOOD_NETWORK_CLASS) {
                this.b = false;
                i0q0.g(this.c);
            } else {
                if (this.b) {
                    return;
                }
                this.b = true;
                i0q0.d(5000L, this.c);
            }
        }
    }

    public MainActivity() {
        boolean k;
        cia ciaVar = new cia(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.z = msy.a(lazyThreadSafetyMode, ciaVar);
        this.A = null;
        this.B = null;
        int i = 3;
        this.C = msy.a(lazyThreadSafetyMode, new dia(this, i));
        this.D = false;
        this.E = false;
        this.J = new p5j0();
        this.L = msy.a(lazyThreadSafetyMode, new k03(6));
        this.M = msy.a(lazyThreadSafetyMode, new ag7(i));
        Context context = e43.a;
        if (BuildInfo.h()) {
            VKApplication vKApplication = com.vk.core.apps.a.a;
            k = BuildInfo.k();
        } else {
            VKApplication vKApplication2 = com.vk.core.apps.a.a;
            k = BuildInfo.l(context, "com.huawei.appmarket");
        }
        this.N = k;
        this.O = new a();
    }

    public static void Y1(Intent intent) {
        String s;
        Long d;
        Bundle bundle;
        sw90.a.getClass();
        if (intent == null) {
            return;
        }
        vto0 vto0Var = new vto0();
        vto0Var.c();
        Bundle extras = intent.getExtras();
        if (extras == null || (bundle = extras.getBundle("args")) == null || (s = bundle.getString("performance_track_id")) == null) {
            s = nax.b(intent) ? "launcher" : c4g0.s();
        }
        ConcurrentHashMap<String, sw90.a> concurrentHashMap = sw90.b;
        concurrentHashMap.put(s, new sw90.a(vto0Var, sw90.d && concurrentHashMap.isEmpty() && (d = vto0Var.d(sw90.c.b)) != null && d.longValue() <= 5000000));
    }

    @Override // com.vk.core.ui.themes.ThemableActivity
    public final boolean Q1() {
        return false;
    }

    @Override // com.vk.navigation.NavigationDelegateActivity
    public final boolean W1() {
        return !o25.a().b();
    }

    public final void X1() {
        fa00 fa00Var = new fa00(this, 1);
        String str = uc00.d;
        if (str != null) {
            fa00Var.invoke(str);
            uc00.d = null;
        }
    }

    public final void Z1(Intent intent) {
        String stringExtra = intent.getStringExtra("key_open_qr_auth");
        if (stringExtra != null) {
            LaunchContext.a aVar = new LaunchContext.a();
            aVar.b();
            xwk.d().e().l(this, stringExtra, aVar.a(), null, null);
            intent.removeExtra("key_open_qr_auth");
        }
    }

    public final void b2(@NonNull String str) {
        if (this.D) {
            X1();
            return;
        }
        L l = L.a;
        L.r(L.LogType.d, "AfterAuthDeeplink", "Open after auth deeplink: ".concat(str));
        xwk.d().e().a(this, str);
        this.D = true;
    }

    public final void d2(Bundle bundle, boolean z) {
        UserId userId;
        Intent intent = getIntent();
        Y1(intent);
        T1();
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_background_content)));
            HashSet hashSet = iah0.a;
            if (fnj.d(this)) {
                mnh0.w(window.getDecorView(), dhr0.C().b);
            }
        }
        boolean z2 = false;
        FitSystemWindowsFragmentWrapperFrameLayout fitSystemWindowsFragmentWrapperFrameLayout = new FitSystemWindowsFragmentWrapperFrameLayout(this, 0);
        fitSystemWindowsFragmentWrapperFrameLayout.setId(R.id.fragment_wrapper);
        Y().k0(fitSystemWindowsFragmentWrapperFrameLayout);
        dx90 dx90Var = ow90.e;
        dx90Var.getClass();
        dx90Var.g = System.currentTimeMillis();
        dx90Var.r();
        ShortcutManagerWrapper shortcutManagerWrapper = ShortcutManagerWrapper.a;
        ShortcutManagerWrapper.e(this, ShortcutManagerWrapper.ShortcutCategory.VKAPP);
        Bundle extras = intent.getExtras();
        rsr rsrVar = oz50.k;
        FragmentEntry c = oz50.b.c(extras);
        if (extras != null && c != null && (userId = (UserId) extras.getParcelable("target_user_id")) != null) {
            c.c.putParcelable("target_user_id", userId);
        }
        FragmentEntry fragmentEntry = new FragmentEntry(b68.d());
        Y().n();
        imj0.i(intent, this);
        if (z) {
            xdr0<NavigationDelegateActivity> Y = Y();
            String str = Y.h;
            SharedPreferences sharedPreferences = Y.g;
            if (c != null) {
                Bundle bundle2 = c.c;
                String str2 = c.d;
                EmptySet emptySet = EmptySet.b;
                Set<String> stringSet = sharedPreferences.getStringSet(str, emptySet);
                if (stringSet == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                }
                if (!stringSet.contains(str2) || bundle2.containsKey("open_from_widget")) {
                    Set<String> stringSet2 = sharedPreferences.getStringSet(str, emptySet);
                    if (stringSet2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    }
                    qaj0.c(sharedPreferences, str, izi0.k(stringSet2, str2));
                    Y.t(c.b, bundle2, false);
                    if (c == null && bundle == null) {
                        z2 = true;
                    }
                    this.w = z2;
                }
            }
            if (bundle == null && !sharedPreferences.getBoolean(Y.j, false)) {
                qaj0.c(sharedPreferences, str, EmptySet.b);
                Y.t(fragmentEntry.b, fragmentEntry.c, false);
            }
            if (c == null) {
                z2 = true;
            }
            this.w = z2;
        }
        s1m s1mVar = new s1m(this, 22);
        b bVar = b.A;
        if (bVar.b()) {
            s1mVar.invoke();
        } else {
            this.A = bVar.u(s1mVar, null);
        }
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        FragmentImpl u = Y().u();
        if (u != null) {
            u.Un(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e2(@Nullable Intent intent, @Nullable HashMap hashMap) {
        Intent intent2 = new Intent(this, (Class<?>) AuthActivity.class);
        if (intent != null) {
            intent2.putExtras(intent);
        }
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                intent2.putExtra((String) entry.getKey(), (Serializable) entry.getValue());
            }
        }
        startActivityForResult(intent2, 100);
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            if (i2 != -1) {
                finish();
                return;
            }
            d2(null, true);
            Y().J();
            this.x = true;
            if (intent != null) {
            }
            nzx b = this.G.b();
            if (b != null) {
                this.G.c(null);
                this.F.d(ozx.a(b, this, new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.JOIN_DEEPLINK, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_INVITE), new phw0.d.a(false, false, b.a())));
                return;
            }
            return;
        }
        if (i == 1231) {
            Intent intent2 = getIntent();
            if (i2 == -1) {
                e2(intent2, null);
                if (intent == null || !intent.hasExtra("proceedToCallJoinAfterAuth")) {
                    return;
                }
                intent2.putExtra("proceedToCallJoinAfterAuth", intent.getStringExtra("proceedToCallJoinAfterAuth"));
                return;
            }
            int intExtra = intent.getIntExtra("error_string_res_id", 0);
            int intExtra2 = intent.getIntExtra("error_details_string_res_id", 0);
            HashMap hashMap = new HashMap();
            if (intExtra != 0) {
                hashMap.put("error_string_res_id", Integer.valueOf(intExtra));
            }
            if (intExtra2 != 0) {
                hashMap.put("error_details_string_res_id", Integer.valueOf(intExtra2));
            }
            e2(intent2, hashMap);
        }
    }

    /* JADX WARN: Type inference failed for: r12v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AnonymousLinker.a a2;
        int i = 0;
        getTheme().applyStyle(R.style.OptOutEdgeToEdgeEnforcement, false);
        super.onCreate(bundle);
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        if (!isTaskRoot() && getIntent().hasCategory("android.intent.category.LAUNCHER") && getIntent().getAction() != null && getIntent().getAction().equals("android.intent.action.MAIN")) {
            finish();
            return;
        }
        CoreFeatures coreFeatures = CoreFeatures.EDGE_TO_EDGE;
        coreFeatures.getClass();
        if (b.A.a(coreFeatures)) {
            ppx0.b(getWindow(), false);
            lyo.a(this);
            getWindow().getDecorView().setSystemUiVisibility(1792);
        } else {
            int i2 = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        }
        VoipCallComponent voipCallComponent = (VoipCallComponent) j6i.b(m7m.f(this), VoipCallComponent.class);
        QrWebToAppComponent qrWebToAppComponent = (QrWebToAppComponent) j6i.b(m7m.f(this), QrWebToAppComponent.class);
        PurchasesManagerComponent purchasesManagerComponent = (PurchasesManagerComponent) j6i.b(m7m.f(this), PurchasesManagerComponent.class);
        this.F = voipCallComponent.a();
        this.G = voipCallComponent.c0();
        this.H = qrWebToAppComponent.getHandler();
        this.I = purchasesManagerComponent.J7();
        int i3 = 1;
        if (o25.a().b()) {
            d2(bundle, true);
            ((PlayerUIComponent) j6i.b(m7m.a(this), PlayerUIComponent.class)).Ne().a(getSupportFragmentManager());
            onl onlVar = e370.u;
            if (onlVar != null) {
                onlVar.a(this);
            }
            String stringExtra = getIntent().getStringExtra("reg_unauth_id");
            if (stringExtra != null) {
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.FEED_OPENED, com.vk.registration.funnels.b.e(stringExtra), null, null, null, null, null, 252);
                if (getIntent().getBooleanExtra("account_limit_reached", false)) {
                    this.H.f(this, stringExtra);
                }
            }
        } else {
            if (findViewById(R.id.fragment_wrapper) == null) {
                FitSystemWindowsFragmentWrapperFrameLayout fitSystemWindowsFragmentWrapperFrameLayout = new FitSystemWindowsFragmentWrapperFrameLayout(this, 0);
                fitSystemWindowsFragmentWrapperFrameLayout.setId(R.id.fragment_wrapper);
                Y().k0(fitSystemWindowsFragmentWrapperFrameLayout);
            }
            Intent intent = getIntent();
            String stringExtra2 = intent != null ? intent.getStringExtra("key_call_join_url") : null;
            if (stringExtra2 == null) {
                a2 = null;
            } else {
                a2 = xwk.d().g().a(this, stringExtra2);
                if (intent != null && a2 != null) {
                    intent.removeExtra("key_call_join_url");
                }
            }
            if (a2 != null) {
                wdw0.a(this, a2, ((VoipCallsJoinRouterComponent) j6i.b(m7m.f(this), VoipCallsJoinRouterComponent.class)).a(), new fb8(this, 2));
            } else {
                e2(getIntent(), null);
            }
            overridePendingTransition(0, 0);
        }
        if (BuildInfo.s()) {
            ((v8k0) this.C.getValue()).a();
        }
        HashSet hashSet = new HashSet();
        hashSet.add(fpf0.a(ImDialogsFragment.class));
        hashSet.add(fpf0.a(ChatFragment.class));
        i2i0.a aVar = new i2i0.a(hashSet, getSupportFragmentManager());
        a1w a1wVar = q1w.a;
        this.p.b(new i0(new i0(a1wVar.l.a().a0(io.reactivex.rxjava3.android.schedulers.a.b()), new hg1.a2()).u0(10L, TimeUnit.SECONDS), new jcw(new icw(new kcw(new i570(aVar, a1wVar)), i))).subscribe(new xfl(this, i3)));
        if (d.D()) {
            NetworkPerformanceMeasurer networkPerformanceMeasurer = NetworkPerformanceMeasurer.a;
            a aVar2 = this.O;
            networkPerformanceMeasurer.getClass();
            NetworkPerformanceMeasurer.a(aVar2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c cVar = this.B;
        if (cVar != null) {
            cVar.dispose();
            this.B = null;
        }
        c cVar2 = this.A;
        if (cVar2 != null) {
            cVar2.dispose();
            this.A = null;
        }
        if (BuildInfo.s()) {
            v8k0 v8k0Var = (v8k0) this.C.getValue();
            c cVar3 = v8k0Var.c;
            if (cVar3 != null) {
                cVar3.dispose();
            }
            v8k0Var.c = null;
        }
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(@NonNull Intent intent) {
        VkPassportRouterInfo vkPassportRouterInfo;
        String string;
        Parcelable parcelable;
        Object parcelable2;
        super.onNewIntent(intent);
        Y1(intent);
        f u = Y().u();
        if (u instanceof oax) {
            oax oaxVar = (oax) u;
            if (oaxVar.V7(intent)) {
                oaxVar.Wc(intent);
            }
        }
        if (intent.getBooleanExtra("key_logout", false)) {
            Bundle extras = intent.getExtras();
            if (extras == null || (string = extras.getString(CommonConstant.KEY_ACCESS_TOKEN)) == null) {
                vkPassportRouterInfo = null;
            } else {
                VkAuthMetaInfo vkAuthMetaInfo = VkAuthMetaInfo.h;
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("utilityTokens", UtilityTokens.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = extras.getParcelable("utilityTokens");
                    if (!(parcelable3 instanceof UtilityTokens)) {
                        parcelable3 = null;
                    }
                    parcelable = (UtilityTokens) parcelable3;
                }
                UtilityTokens utilityTokens = (UtilityTokens) parcelable;
                if (utilityTokens == null) {
                    UtilityTokens.CREATOR.getClass();
                    utilityTokens = UtilityTokens.c;
                }
                vkPassportRouterInfo = new VkPassportRouterInfo(string, null, vkAuthMetaInfo, utilityTokens, null, 16, null);
            }
            if (vkPassportRouterInfo != null) {
                Intent intent2 = new Intent(getApplicationContext(), (Class<?>) AuthActivity.class);
                intent2.putExtra("passportData", vkPassportRouterInfo);
                intent2.putExtra("closeOnEmptyBackStack", true);
                startActivityForResult(intent2, 18539);
            } else if (o25.a().g().isEmpty()) {
                Intent addFlags = new Intent(getApplicationContext(), (Class<?>) MainActivity.class).addFlags(268468224);
                if (extras != null) {
                    addFlags.putExtras(extras);
                }
                startActivityForResult(addFlags, 100);
            } else {
                d2(null, false);
                Y().J();
                Y().t(b68.d(), null, false);
            }
        }
        Z1(intent);
        String stringExtra = intent.getStringExtra("key_business_signup_link");
        if (stringExtra != null) {
            b2(stringExtra);
            intent.removeExtra("key_business_signup_link");
        }
        imj0.i(intent, this);
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        c cVar = this.K;
        if (cVar != null) {
            cVar.dispose();
            this.K = null;
        }
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        Uri a2;
        super.onProvideAssistContent(assistContent);
        f u = Y().u();
        if (!(u instanceof w9f0) || (a2 = ((w9f0) u).a()) == null) {
            return;
        }
        assistContent.setWebUri(a2);
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        boolean b;
        c cVar;
        c cVar2;
        super.onResume();
        if (!this.E) {
            v vVar = new v(new cd00());
            asu0 asu0Var = asu0.a;
            itg0.a(this, vVar.q(asu0Var.c()).m(asu0Var.d()).subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.dd00
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    String str = MainActivity.P;
                    if (((Boolean) obj).booleanValue()) {
                        oar0.a aVar = new oar0.a();
                        MainActivity mainActivity = MainActivity.this;
                        aVar.f(mainActivity.getString(R.string.app_update_title));
                        aVar.e(mainActivity.getString(R.string.app_update_needed));
                        aVar.c();
                        aVar.d();
                        aVar.b(new oar0.b(mainActivity.getString(R.string.update_now), new jb8(mainActivity, 4)));
                        aVar.a(mainActivity);
                        mainActivity.E = true;
                    }
                }
            }, new rao()));
        }
        int i = 0;
        if (this.x) {
            this.x = false;
            Y().t(b68.d(), null, false);
            s1m s1mVar = new s1m(this, 22);
            b bVar = b.A;
            if (bVar.b()) {
                s1mVar.invoke();
            } else {
                this.A = bVar.u(s1mVar, null);
            }
            Intent intent = getIntent();
            String stringExtra = intent != null ? intent.getStringExtra("key_call_join_url") : null;
            String b2 = stringExtra == null ? null : xwk.d().g().b(this, stringExtra);
            String stringExtra2 = getIntent().getStringExtra("key_open_after_auth_link");
            L l = L.a;
            L.r(L.LogType.d, "AfterAuthDeeplink", y57.a("After auth url: ", stringExtra2, " Unauth url : ", b2));
            if (b2 != null) {
                xwk.d().e().a(this, b2);
            } else if (stringExtra2 != null) {
                c cVar3 = this.B;
                if (cVar3 != null) {
                    cVar3.dispose();
                    this.B = null;
                }
                if (bVar.b()) {
                    b2(stringExtra2);
                } else {
                    this.B = bVar.u(new bd00(this, stringExtra2, 0), new kb8(this, 5));
                }
            } else {
                X1();
            }
        }
        Z1(getIntent());
        Intent intent2 = getIntent();
        String stringExtra3 = intent2.getStringExtra("key_business_signup_link");
        if (stringExtra3 != null) {
            b2(stringExtra3);
            intent2.removeExtra("key_business_signup_link");
        }
        if (System.currentTimeMillis() - this.y > 10000) {
            f620.c();
            this.y = System.currentTimeMillis();
        }
        if (this.N) {
            ((crw) this.z.getValue()).onResume();
        } else {
            wvv.b(wvv.a, new fd00(this, i), 0L, 0L, 14);
        }
        ((FullscreenPromoComponent) j6i.b(m7m.a(this), FullscreenPromoComponent.class)).n().c(FullscreenPromoEvent.MainActivityResume.c, null);
        Intent intent3 = getIntent();
        l93 l93Var = new l93();
        if (BuildInfo.h() || TextUtils.equals((String) q6r0.f().a(m6r0.q), "app_developer")) {
            o2l.a.getClass();
            b = o2l.b("__dbg_stat_app_starts_daily_check_", false);
        } else {
            b = false;
        }
        AppStartReporter.b(intent3, this, l93Var, b);
        om.a.getClass();
        om.b.onNext(getApplicationContext());
        oqo0 oqo0Var = (oqo0) this.L.getValue();
        int i2 = 4;
        int i3 = 1;
        if (!oqo0Var.a || oqo0.d) {
            cVar = EmptyDisposable.INSTANCE;
        } else {
            oqo0.d = true;
            m1 a0 = q.T(s3q0.a).a0(io.reactivex.rxjava3.schedulers.a.b());
            int i4 = 3;
            i460 i460Var = new i460(new ps3(oqo0Var, i4), 2);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            b0 E = a0.E(i460Var, lVar, kVar, kVar);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            cVar = q.W(E, q.B0(30L, timeUnit).a0(io.reactivex.rxjava3.schedulers.a.b()).E(new j460(new ziv(oqo0Var), i3), lVar, kVar, kVar), q.B0(120L, timeUnit).a0(io.reactivex.rxjava3.schedulers.a.b()).E(new k460(new aej(oqo0Var, i2), i2), lVar, kVar, kVar), q.P(0L, 5L, timeUnit).a0(io.reactivex.rxjava3.schedulers.a.b()).E(new jpo(new y6n0(oqo0Var, i3), i4), lVar, kVar, kVar)).subscribe(new nqo0(), new f93(new vdj(2), i3));
        }
        itg0.a(this, cVar);
        u090 u090Var = (u090) this.M.getValue();
        if (u090Var.a && u090.b.compareAndSet(false, true)) {
            io.reactivex.rxjava3.internal.operators.single.b0 m = x.k(s3q0.a).f(5L, TimeUnit.MINUTES).m(io.reactivex.rxjava3.schedulers.a.b());
            bk40 bk40Var = new bk40(new iej(u090Var), i3);
            new gml(i3);
            cVar2 = m.subscribe(bk40Var, new t090());
        } else {
            cVar2 = EmptyDisposable.INSTANCE;
        }
        itg0.a(this, cVar2);
        if (BuildInfo.h()) {
            p5j0 p5j0Var = this.J;
            xdr0<NavigationDelegateActivity> Y = Y();
            mb8 mb8Var = new mb8(i2);
            p5j0Var.getClass();
            int i5 = 0;
            u uVar = new u(new v(new m5j0(mb8Var, i5)).q(asu0.a.c()), new n5j0(new c2k(this, p5j0Var, mb8Var, i2), i5));
            int i6 = 13;
            d750 d750Var = new d750(new dnh0(i3, Y, this), i6);
            final l140 l140Var = new l140(i6);
            this.K = uVar.subscribe(d750Var, new io.reactivex.rxjava3.functions.f(l140Var) { // from class: xsna.o5j0
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    s3q0 s3q0Var = s3q0.a;
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (this.N) {
            ((crw) this.z.getValue()).onCreate();
        } else {
            wvv.b(wvv.a, new mco(this, 1), 0L, 0L, 14);
        }
        g460 g460Var = g460.o;
        g460Var.getClass();
        LocationCommon.a.getClass();
        if (LocationCommon.a(this) && g460Var.b.incrementAndGet() == 1) {
            g460Var.f = getApplicationContext();
            g460Var.b();
        }
        asu0.a.getClass();
        ExecutorService h = asu0.h();
        final oge0 oge0Var = this.I;
        Objects.requireNonNull(oge0Var);
        h.submit(new Runnable() { // from class: xsna.gd00
            @Override // java.lang.Runnable
            public final void run() {
                oge0.this.b();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        ((crw) this.z.getValue()).onPause();
        g460 g460Var = g460.o;
        AtomicInteger atomicInteger = g460Var.b;
        if (atomicInteger.get() != 0 && atomicInteger.decrementAndGet() == 0) {
            c cVar = g460Var.c;
            if (cVar != null) {
                cVar.dispose();
            }
            g460Var.c = null;
            gs2 gs2Var = g460Var.d;
            if (gs2Var != null) {
                g460Var.e.removeCallbacks(gs2Var);
            }
            g460Var.d = null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void reportFullyDrawn() {
        if (this.w) {
            super.reportFullyDrawn();
        }
    }
}
