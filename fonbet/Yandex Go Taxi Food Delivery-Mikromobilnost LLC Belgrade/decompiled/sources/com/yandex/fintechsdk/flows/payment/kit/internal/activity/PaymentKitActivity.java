package com.yandex.fintechsdk.flows.payment.kit.internal.activity;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.view.d;
import androidx.view.fragment.NavHostFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.fintechsdk.adapters.yb.sdk.impl.c;
import com.yandex.fintechsdk.core.architecture.api.activity.ThemedActivity;
import com.yandex.fintechsdk.core.nfc.impl.api.fragment.NfcDialogFragment;
import com.yandex.fintechsdk.core.ui.impl.api.bottomsheet.CustomBottomSheetBehavior;
import com.yandex.fintechsdk.data.auth.api.TokenSource;
import com.yandex.fintechsdk.entities.config.payment.paymentkit.PaymentKitConfig;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.entities.theme.Theme;
import com.yandex.fintechsdk.entities.ui.BottomSheetMode;
import com.yandex.fintechsdk.features.bdui.internal.presentation.fragment.BduiFragment;
import com.yandex.fintechsdk.flows.payment.kit.internal.di.paymentkit.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.fintechsdk.flows.payment.kit.internal.model.Scenario;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.a2w;
import defpackage.a40;
import defpackage.ak80;
import defpackage.amp;
import defpackage.avt;
import defpackage.bl2;
import defpackage.bo90;
import defpackage.bvf0;
import defpackage.bvu0;
import defpackage.cl2;
import defpackage.cma1;
import defpackage.d240;
import defpackage.dn90;
import defpackage.dna;
import defpackage.e100;
import defpackage.e2w;
import defpackage.eja1;
import defpackage.ek;
import defpackage.eo90;
import defpackage.eyt0;
import defpackage.f550;
import defpackage.f5g;
import defpackage.fcl0;
import defpackage.fp51;
import defpackage.g8e;
import defpackage.gau;
import defpackage.gh5;
import defpackage.h2r;
import defpackage.h2t;
import defpackage.hh5;
import defpackage.hk3;
import defpackage.hn90;
import defpackage.ht10;
import defpackage.i3y;
import defpackage.ilr;
import defpackage.j4x;
import defpackage.jl40;
import defpackage.jrt0;
import defpackage.js4;
import defpackage.k7o;
import defpackage.keo;
import defpackage.krt0;
import defpackage.ktx0;
import defpackage.l180;
import defpackage.l2w;
import defpackage.l4x;
import defpackage.l95;
import defpackage.li3;
import defpackage.lz40;
import defpackage.lz70;
import defpackage.m2a0;
import defpackage.m50;
import defpackage.m7b;
import defpackage.md6;
import defpackage.mg6;
import defpackage.mkp;
import defpackage.n2a0;
import defpackage.ng6;
import defpackage.nva0;
import defpackage.ny61;
import defpackage.o0i0;
import defpackage.o4x;
import defpackage.o751;
import defpackage.o8k0;
import defpackage.og6;
import defpackage.okp;
import defpackage.p751;
import defpackage.pqt0;
import defpackage.pzj0;
import defpackage.q751;
import defpackage.qk3;
import defpackage.qzg0;
import defpackage.r2a0;
import defpackage.rbx;
import defpackage.s8b1;
import defpackage.sbx;
import defpackage.sg5;
import defpackage.soh0;
import defpackage.t3a0;
import defpackage.t7w;
import defpackage.tje;
import defpackage.tva0;
import defpackage.uo90;
import defpackage.upr;
import defpackage.uva0;
import defpackage.uvh0;
import defpackage.v50;
import defpackage.va90;
import defpackage.vng;
import defpackage.w2a0;
import defpackage.w870;
import defpackage.xen;
import defpackage.xg6;
import defpackage.xvf0;
import defpackage.xzd;
import defpackage.ygh0;
import defpackage.z22;
import defpackage.z96;
import defpackage.zn90;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlinx.coroutines.flow.r0;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0006*\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0015¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0004J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/internal/activity/PaymentKitActivity;", "Lcom/yandex/fintechsdk/core/architecture/api/activity/ThemedActivity;", "Lokp;", "<init>", "()V", "Lmkp;", "T", "resolveDependencies", "()Lmkp;", "", "isBottomSheetMode", "()Z", "Landroid/content/Context;", "context", "Lcom/yandex/fintechsdk/entities/theme/Theme;", "getThemeOverride", "(Landroid/content/Context;)Lcom/yandex/fintechsdk/entities/theme/Theme;", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "outState", "onSaveInstanceState", "onStop", "onDestroy", "Lr2a0;", "activityDelegate", "Lr2a0;", "Lt7w;", "intentArgs$delegate", "Li3y;", "getIntentArgs", "()Lt7w;", "intentArgs", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PaymentKitActivity extends ThemedActivity implements okp {
    private final r2a0 activityDelegate = new r2a0(this);

    /* renamed from: intentArgs$delegate, reason: from kotlin metadata */
    private final i3y intentArgs = kotlin.a.a(new ak80(13, this));

    private final t7w getIntentArgs() {
        return (t7w) this.intentArgs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t7w intentArgs_delegate$lambda$0(PaymentKitActivity paymentKitActivity) {
        return s8b1.c(paymentKitActivity.getIntent());
    }

    @Override // com.yandex.fintechsdk.core.architecture.api.activity.ThemedActivity
    public Theme getThemeOverride(Context context) {
        String string = context.getSharedPreferences("payment_kit_theme_prefs", 0).getString("key_theme", null);
        if (string == null) {
            return null;
        }
        try {
            return Theme.valueOf(string);
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean isBottomSheetMode() {
        return ((a2w) ((sg5) resolveDependencies()).u().b.a.getValue()).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0261  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle savedInstanceState) {
        boolean z;
        xzd xzdVar;
        AtomicReference atomicReference;
        r2a0 r2a0Var;
        View inflate;
        int i;
        View O;
        FrameLayout frameLayout;
        PaymentKitConfig a;
        Object failure;
        Object obj;
        Object b;
        Window window;
        PaymentKitConfig paymentKitConfig;
        Long m;
        long j;
        String str;
        String str2;
        r2a0 r2a0Var2 = this.activityDelegate;
        r2a0Var2.getClass();
        int i2 = 1;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        if (savedInstanceState != null && !savedInstanceState.getBoolean(BduiFragment.IS_CHANGING_CONFIGURATIONS_KEY)) {
            String string = savedInstanceState.getString("key_payer_uid");
            if (string == null || (m = bvu0.m(10, string)) == null) {
                String uid = r2a0Var2.c().e.getUid();
                m = uid != null ? bvu0.m(10, uid) : null;
            }
            if (m == null) {
                ((com.yandex.fintechsdk.core.analytics.impl.internal.a) ((f5g) r2a0Var2.a()).getAnalytics()).a(new li3(Scenario.Unbinding.INSTANCE, FinishFlowStatus.FAIL));
            } else {
                f5g f5gVar = (f5g) r2a0Var2.a();
                xvf0 xvf0Var = f5gVar.Z;
                DefaultEnvironment defaultEnvironment = f5gVar.y;
                z22 z22Var = (z22) xvf0Var.get();
                hk3 hk3Var = (hk3) f5gVar.a0.get();
                dn90 dn90Var = (dn90) f5gVar.o0.get();
                zn90 g = l180.g(defaultEnvironment);
                Context applicationContext = r2a0Var2.a.getApplicationContext();
                long longValue = m.longValue();
                if (dn90Var == null) {
                    ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new bo90("Отсутствует паспорт адаптер, подключите зависимость в вашем gradle файле"));
                    str2 = null;
                    j = longValue;
                } else {
                    m7b m7bVar = new m7b(new uo90(z22Var, i2), new uo90(z22Var, 4));
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        str = ((hn90) dn90Var).c(applicationContext, longValue, g.a, g.b, defaultEnvironment == DefaultEnvironment.TESTING, false, m7bVar);
                        j = longValue;
                    } catch (Exception e) {
                        e = e;
                        j = longValue;
                    } catch (NoSuchMethodError unused) {
                        j = longValue;
                    }
                    try {
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new eo90());
                    } catch (Exception e2) {
                        e = e2;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "Пользователь не авторизован";
                        }
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new bo90(message));
                        str = null;
                        Pair pair = new Pair(str, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                        str2 = (String) pair.getFirst();
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new nva0(((Number) pair.getSecond()).longValue(), str2 != null));
                        if (str2 != null) {
                        }
                        z = getIntentArgs().h;
                        r2a0 r2a0Var3 = this.activityDelegate;
                        if (z) {
                        }
                        if (!getIntentArgs().h) {
                        }
                        xzdVar = ((com.yandex.fintechsdk.data.config.impl.internal.a) ((f5g) this.activityDelegate.a()).t0.get()).b;
                        xzdVar.getClass();
                        atomicReference = xzdVar.b;
                        if (savedInstanceState != null) {
                            atomicReference.set(paymentKitConfig);
                            r0 r0Var = xzdVar.c;
                            r0Var.getClass();
                            r0Var.m(null, paymentKitConfig);
                        }
                        super.onCreate(savedInstanceState);
                        jl40.L(getWindow(), false);
                        if (getIntentArgs().h) {
                            window.setBackgroundDrawableResource(R.color.transparent);
                            window.setDimAmount(0.0f);
                            window.setStatusBarColor(0);
                            window.setNavigationBarColor(0);
                        }
                        r2a0Var = this.activityDelegate;
                        PaymentKitActivity paymentKitActivity = r2a0Var.a;
                        if (!r2a0Var.c().h) {
                        }
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) r2a0Var.d().b).a(new li3(r2a0Var.c().f));
                        ((uva0) ((f5g) r2a0Var.a()).l0.get()).d.set(new tva0(r2a0Var.c().f.getScenarioName(), System.nanoTime(), false));
                        inflate = paymentKitActivity.getLayoutInflater().inflate(soh0.finsdk_activity_payment_kit, (ViewGroup) null, false);
                        i = ygh0.finsdkDecorationContainer;
                        if (((FrameLayout) cma1.O(i, inflate)) != null) {
                            i = ygh0.finsdkPaymentKitContainer;
                            frameLayout = (FrameLayout) cma1.O(i, inflate);
                            if (frameLayout != null) {
                            }
                        }
                        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                    } catch (NoSuchMethodError unused2) {
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new bo90("Метод отсутствует в паспорт адаптере, проверьте версию адаптера"));
                        str = null;
                        Pair pair2 = new Pair(str, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                        str2 = (String) pair2.getFirst();
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new nva0(((Number) pair2.getSecond()).longValue(), str2 != null));
                        if (str2 != null) {
                        }
                        z = getIntentArgs().h;
                        r2a0 r2a0Var32 = this.activityDelegate;
                        if (z) {
                        }
                        if (!getIntentArgs().h) {
                        }
                        xzdVar = ((com.yandex.fintechsdk.data.config.impl.internal.a) ((f5g) this.activityDelegate.a()).t0.get()).b;
                        xzdVar.getClass();
                        atomicReference = xzdVar.b;
                        if (savedInstanceState != null) {
                        }
                        super.onCreate(savedInstanceState);
                        jl40.L(getWindow(), false);
                        if (getIntentArgs().h) {
                        }
                        r2a0Var = this.activityDelegate;
                        PaymentKitActivity paymentKitActivity2 = r2a0Var.a;
                        if (!r2a0Var.c().h) {
                        }
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) r2a0Var.d().b).a(new li3(r2a0Var.c().f));
                        ((uva0) ((f5g) r2a0Var.a()).l0.get()).d.set(new tva0(r2a0Var.c().f.getScenarioName(), System.nanoTime(), false));
                        inflate = paymentKitActivity2.getLayoutInflater().inflate(soh0.finsdk_activity_payment_kit, (ViewGroup) null, false);
                        i = ygh0.finsdkDecorationContainer;
                        if (((FrameLayout) cma1.O(i, inflate)) != null) {
                        }
                        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                    }
                    Pair pair22 = new Pair(str, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                    str2 = (String) pair22.getFirst();
                    ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new nva0(((Number) pair22.getSecond()).longValue(), str2 != null));
                }
                if (str2 != null) {
                    hk3Var.a(new qk3(new ek(str2, j), TokenSource.PASSPORT));
                }
            }
        }
        z = getIntentArgs().h;
        r2a0 r2a0Var322 = this.activityDelegate;
        if (z) {
            r2a0Var322.a.setTheme(o0i0.Finsdk_PaymentKit_BottomSheet);
        } else {
            r2a0Var322.a.setTheme(((f5g) r2a0Var322.a()).R().getTheme() == Theme.DAY ? o0i0.Finsdk_PaymentKit_Light : o0i0.Finsdk_PaymentKit_Dark);
        }
        if (!getIntentArgs().h) {
            (Build.VERSION.SDK_INT >= 31 ? new jrt0(this) : new krt0(this)).a();
        }
        xzdVar = ((com.yandex.fintechsdk.data.config.impl.internal.a) ((f5g) this.activityDelegate.a()).t0.get()).b;
        xzdVar.getClass();
        atomicReference = xzdVar.b;
        if (savedInstanceState != null && (paymentKitConfig = (PaymentKitConfig) vng.u(savedInstanceState, PaymentKitConfig.class, "PAYMENT_KIT_CONFIG")) != null && atomicReference.get() == null) {
            atomicReference.set(paymentKitConfig);
            r0 r0Var2 = xzdVar.c;
            r0Var2.getClass();
            r0Var2.m(null, paymentKitConfig);
        }
        super.onCreate(savedInstanceState);
        jl40.L(getWindow(), false);
        if (getIntentArgs().h && (window = getWindow()) != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
            window.setDimAmount(0.0f);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
        }
        r2a0Var = this.activityDelegate;
        PaymentKitActivity paymentKitActivity22 = r2a0Var.a;
        if (!r2a0Var.c().h) {
            paymentKitActivity22.getWindow().addFlags(512);
        }
        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) r2a0Var.d().b).a(new li3(r2a0Var.c().f));
        ((uva0) ((f5g) r2a0Var.a()).l0.get()).d.set(new tva0(r2a0Var.c().f.getScenarioName(), System.nanoTime(), false));
        inflate = paymentKitActivity22.getLayoutInflater().inflate(soh0.finsdk_activity_payment_kit, (ViewGroup) null, false);
        i = ygh0.finsdkDecorationContainer;
        if (((FrameLayout) cma1.O(i, inflate)) != null && (O = cma1.O((i = ygh0.finsdkDimmingBackground), inflate)) != null) {
            i = ygh0.finsdkPaymentKitContainer;
            frameLayout = (FrameLayout) cma1.O(i, inflate);
            if (frameLayout != null) {
                i = ygh0.finsdkPaymentKitHost;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) cma1.O(i, inflate);
                if (fragmentContainerView != null) {
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                    r2a0Var.c = new dna(coordinatorLayout, O, frameLayout, fragmentContainerView, coordinatorLayout, 2);
                    paymentKitActivity22.setContentView(coordinatorLayout);
                    boolean z5 = ((f5g) r2a0Var.a()).R().getTheme() == Theme.DAY;
                    Window window2 = paymentKitActivity22.getWindow();
                    dna dnaVar = r2a0Var.c;
                    if (dnaVar == null) {
                        dnaVar = null;
                    }
                    va90 va90Var = new va90(dnaVar.c);
                    int i3 = Build.VERSION.SDK_INT;
                    bvf0 q751Var = i3 >= 35 ? new q751(window2, va90Var) : i3 >= 30 ? new p751(window2, va90Var) : new o751(window2, va90Var);
                    q751Var.U(z5);
                    q751Var.T(z5);
                    eyt0 eyt0Var = (eyt0) ((f5g) r2a0Var.a()).D0.get();
                    String scenarioName = r2a0Var.c().f.getScenarioName();
                    Window window3 = paymentKitActivity22.getWindow();
                    eyt0Var.getClass();
                    try {
                        cl2 cl2Var = eyt0Var.a;
                        if (!cl2Var.c.getAndSet(true)) {
                            cl2Var.f = scenarioName;
                            Thread thread = new Thread(new bl2(cl2Var, z3 ? 1 : 0), "finsdk-anr-watchdog");
                            thread.setDaemon(true);
                            thread.start();
                            cl2Var.b = thread;
                        }
                        j4x j4xVar = eyt0Var.b;
                        j4xVar.getClass();
                        try {
                            j4xVar.b = new l4x(window3, new h2r(12, j4xVar, scenarioName));
                        } catch (Exception unused3) {
                        }
                        eyt0Var.c.start(scenarioName);
                        eyt0Var.e.a();
                        eyt0Var.d.a("scenario_started", scenarioName);
                    } catch (Exception unused4) {
                    }
                    if (r2a0Var.c().h && (a = ((com.yandex.fintechsdk.data.config.impl.internal.a) ((f5g) r2a0Var.a()).t0.get()).b.a()) != null) {
                        String str3 = a.getFlags().get("bottomSheetFullscreenEnabled");
                        if (str3 == null) {
                            obj = Boolean.FALSE;
                        } else {
                            try {
                                rbx rbxVar = sbx.d;
                                rbxVar.getClass();
                                b = rbxVar.b(z96.a, str3);
                            } catch (Throwable th) {
                                failure = new Result.Failure(th);
                            }
                            if (b == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                            }
                            failure = (Boolean) b;
                            Boolean bool = Boolean.FALSE;
                            boolean z6 = failure instanceof Result.Failure;
                            obj = failure;
                            if (z6) {
                                obj = bool;
                            }
                        }
                        if (((Boolean) obj).booleanValue()) {
                            r2a0Var.e();
                        }
                    }
                    upr a40Var = new a40(paymentKitActivity22);
                    if (r2a0Var.c().h) {
                        boolean z7 = ((a2w) r2a0Var.b().b.b.a.getValue()).a == BottomSheetMode.FULLSCREEN;
                        dna dnaVar2 = r2a0Var.c;
                        if (dnaVar2 == null) {
                            dnaVar2 = null;
                        }
                        w2a0 a2 = r2a0Var.a();
                        md6 md6Var = new md6(paymentKitActivity22, dnaVar2, a2, z7);
                        FrameLayout frameLayout2 = (FrameLayout) dnaVar2.c;
                        final og6 og6Var = new og6(paymentKitActivity22, frameLayout2, ygh0.finsdkDecorationContainer, qzg0.decoration_view_background, dnaVar2.b, new l95(28, md6Var), (CoordinatorLayout) dnaVar2.d, ((f5g) a2).R().getTheme());
                        md6Var.c = og6Var;
                        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ((CoordinatorLayout.LayoutParams) frameLayout2.getLayoutParams()).getBehavior();
                        og6Var.h = bottomSheetBehavior;
                        og6Var.i = bottomSheetBehavior instanceof CustomBottomSheetBehavior ? (CustomBottomSheetBehavior) bottomSheetBehavior : null;
                        bottomSheetBehavior.Q(false);
                        bottomSheetBehavior.f0 = true;
                        bottomSheetBehavior.g0 = true;
                        bottomSheetBehavior.T(true);
                        bottomSheetBehavior.V(0, false);
                        bottomSheetBehavior.W(5);
                        frameLayout2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.yandex.fintechsdk.core.ui.impl.api.bottomsheet.BottomSheetSetupHelper$setupLayoutObserver$1
                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public void onGlobalLayout() {
                                og6.this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                og6 og6Var2 = og6.this;
                                Theme theme = og6Var2.g;
                                View view = og6Var2.b;
                                view.setBackgroundColor(theme == Theme.DAY ? -1 : ModalContentViewContainer.BASE_SHADOW_COLOR);
                                if (og6Var2.l) {
                                    view.setOutlineProvider(null);
                                    view.setClipToOutline(false);
                                } else {
                                    view.setOutlineProvider(new BottomSheetSetupHelper$setupRoundedCornersOutline$1(og6Var2.a.getResources().getDisplayMetrics().density * 24.0f));
                                    view.setClipToOutline(true);
                                }
                                og6 og6Var3 = og6.this;
                                Activity activity = og6Var3.a;
                                FrameLayout frameLayout3 = (FrameLayout) og6Var3.f.findViewById(og6Var3.c);
                                if (frameLayout3 != null) {
                                    if (og6Var3.l) {
                                        frameLayout3.removeAllViews();
                                        frameLayout3.setVisibility(8);
                                    } else {
                                        float f = activity.getResources().getDisplayMetrics().density;
                                        int i4 = (int) (8.0f * f);
                                        int i5 = (int) (40.0f * f);
                                        int i6 = (int) (4.0f * f);
                                        ViewGroup.LayoutParams layoutParams = frameLayout3.getLayoutParams();
                                        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                                        if (layoutParams2 != null) {
                                            layoutParams2.topMargin = i4;
                                        }
                                        View view2 = new View(activity);
                                        view2.setLayoutParams(new FrameLayout.LayoutParams(i5, i6, 1));
                                        view2.setBackgroundResource(og6Var3.d);
                                        frameLayout3.removeAllViews();
                                        frameLayout3.addView(view2);
                                        frameLayout3.setVisibility(0);
                                    }
                                }
                                og6 og6Var4 = og6.this;
                                BottomSheetBehavior bottomSheetBehavior2 = og6Var4.h;
                                xg6 xg6Var = new xg6(bottomSheetBehavior2 == null ? null : bottomSheetBehavior2, og6Var4.e, new mg6(og6Var4, 0), new ng6(og6Var4, 0), new mg6(og6Var4, 1), new ng6(og6Var4, 1));
                                BottomSheetBehavior bottomSheetBehavior3 = og6Var4.h;
                                (bottomSheetBehavior3 != null ? bottomSheetBehavior3 : null).v(xg6Var);
                                og6 og6Var5 = og6.this;
                                og6Var5.b.post(new js4(20, og6Var5));
                            }
                        });
                        if (z7) {
                            og6 og6Var2 = (og6) md6Var.c;
                            if (og6Var2 == null) {
                                og6Var2 = null;
                            }
                            if (!og6Var2.l && og6Var2.h != null) {
                                og6Var2.l = true;
                                og6Var2.b.post(new js4(20, og6Var2));
                            }
                        }
                        r2a0Var.h = md6Var;
                        a40Var = new md6(i2, a40Var, new hh5(6, new m2a0(r2a0Var, z4 ? 1 : 0)));
                    } else {
                        dna dnaVar3 = r2a0Var.c;
                        if (dnaVar3 == null) {
                            dnaVar3 = null;
                        }
                        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) ((FrameLayout) dnaVar3.c).getLayoutParams();
                        layoutParams.setBehavior(null);
                        dna dnaVar4 = r2a0Var.c;
                        if (dnaVar4 == null) {
                            dnaVar4 = null;
                        }
                        ((FrameLayout) dnaVar4.c).setLayoutParams(layoutParams);
                    }
                    r2a0Var.j = a40Var;
                    dna dnaVar5 = r2a0Var.c;
                    if (dnaVar5 == null) {
                        dnaVar5 = null;
                    }
                    e100 e100Var = new e100(19, dnaVar5, r2a0Var.a(), r2a0Var.d());
                    d navController = ((NavHostFragment) paymentKitActivity22.getSupportFragmentManager().E(((FragmentContainerView) dnaVar5.e).getId())).getNavController();
                    f550 a3 = navController.i().a(uvh0.finsdk_payment_kit_graph);
                    ArrayList arrayList = new ArrayList(3);
                    arrayList.add(new gh5());
                    arrayList.add(new k7o());
                    arrayList.add(new pqt0());
                    Iterator it = (arrayList.isEmpty() ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList))).iterator();
                    while (it.hasNext()) {
                        a3.f(((amp) it.next()).a(navController));
                    }
                    ((t3a0) e100Var.w).getClass();
                    a3.k("splash");
                    navController.r(a3, null);
                    FragmentManager supportFragmentManager = paymentKitActivity22.getSupportFragmentManager();
                    com.yandex.fintechsdk.core.navigation.impl.api.router.a router = ((f5g) ((w2a0) e100Var.c)).getRouter();
                    ht10 ht10Var = new ht10(((NavHostFragment) supportFragmentManager.E(((FragmentContainerView) ((dna) e100Var.b).e).getId())).getNavController(), new d240(10, e100Var), z2, 13);
                    router.getClass();
                    o8k0 o8k0Var = new o8k0(14, router, ht10Var);
                    if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
                        o8k0Var.invoke();
                    } else {
                        router.a.post(new fcl0(1, o8k0Var));
                    }
                    boolean z8 = ((a2w) r2a0Var.b().b.b.a.getValue()).a == BottomSheetMode.FULLSCREEN;
                    dna dnaVar6 = r2a0Var.c;
                    if (dnaVar6 == null) {
                        dnaVar6 = null;
                    }
                    a2w a2wVar = (a2w) r2a0Var.b().b.b.a.getValue();
                    h2t h2tVar = new h2t();
                    l2w l2wVar = new l2w(a2wVar, (FrameLayout) dnaVar6.c, (FragmentContainerView) dnaVar6.e, (CoordinatorLayout) dnaVar6.f);
                    h2tVar.a = l2wVar;
                    if (z8) {
                        l2wVar.c();
                    }
                    r2a0Var.g = h2tVar;
                    l2w l2wVar2 = (l2w) h2tVar.a;
                    View view = l2wVar2.d;
                    xen xenVar = new xen(25, l2wVar2);
                    WeakHashMap weakHashMap = b.a;
                    ViewCompat$Api21Impl.o(view, xenVar);
                    h2t h2tVar2 = r2a0Var.g;
                    if (h2tVar2 != null) {
                        h2tVar2.l(paymentKitActivity22.getSupportFragmentManager());
                    }
                    h2t h2tVar3 = r2a0Var.g;
                    if (h2tVar3 != null) {
                        FragmentManager supportFragmentManager2 = paymentKitActivity22.getSupportFragmentManager();
                        l2w l2wVar3 = (l2w) h2tVar3.a;
                        supportFragmentManager2.d0(new e2w(l2wVar3.a.a(), new gau(18, l2wVar3)), true);
                    }
                    w2a0 a4 = r2a0Var.a();
                    t7w c = r2a0Var.c();
                    PaymentKitActivity paymentKitActivity3 = r2a0Var.a;
                    upr uprVar = r2a0Var.j;
                    tje.N(eja1.s(paymentKitActivity3), null, null, new ResultHandler$listenForResult$1(new pzj0(a4, uprVar == null ? null : uprVar, c, paymentKitActivity3, r2a0Var.d()), null), 3);
                    lz40 lz40Var = (lz40) com.yandex.fintechsdk.flows.payment.kit.internal.model.a.i.a.get(r2a0Var.c().b.a);
                    if (lz40Var != null) {
                        tje.N(eja1.s(paymentKitActivity22), null, null, new PaymentKitActivityDelegate$setupDismissHandler$1(lz40Var, r2a0Var, null), 3);
                    }
                    if (r2a0Var.c().h) {
                        tje.N(eja1.s(paymentKitActivity22), null, null, new PaymentKitActivityDelegate$setupConfigObserver$1(r2a0Var, null), 3);
                    }
                    if (r2a0Var.c().f instanceof Scenario.TransportCards) {
                        n2a0 n2a0Var = new n2a0(r2a0Var);
                        com.yandex.fintechsdk.core.nfc.impl.internal.a aVar = (com.yandex.fintechsdk.core.nfc.impl.internal.a) ((f5g) r2a0Var.a()).y0.get();
                        if (aVar != null) {
                            aVar.c = new WeakReference(paymentKitActivity22);
                            aVar.d = NfcAdapter.getDefaultAdapter(paymentKitActivity22);
                            aVar.g = new WeakReference(n2a0Var);
                        }
                        tje.N(eja1.s(paymentKitActivity22), null, null, new PaymentKitActivityDelegate$setupTroikaNfcController$1(r2a0Var, n2a0Var, null), 3);
                        com.yandex.fintechsdk.core.nfc.impl.internal.a aVar2 = (com.yandex.fintechsdk.core.nfc.impl.internal.a) ((f5g) r2a0Var.a()).y0.get();
                        if (aVar2 != null) {
                            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) aVar2.b).a(new keo("nfc_available_on_device", g8e.z(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "NFC модуль на устройстве ".concat(aVar2.d != null ? "доступен" : "недоступен"))));
                            if (aVar2.d != null) {
                                paymentKitActivity22.getSupportFragmentManager().m0(NfcDialogFragment.REQUEST_KEY, paymentKitActivity22, new lz70(9, r2a0Var));
                            }
                        }
                    }
                    if (r2a0Var.c().f instanceof Scenario.GooglePlayBinding) {
                        avt avtVar = (avt) ((f5g) r2a0Var.a()).x0.get();
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) avtVar.a).a(new keo("google_pay_init", g8e.z(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Инициализация Google Pay")));
                        avtVar.c = new WeakReference(paymentKitActivity22);
                        avtVar.e = paymentKitActivity22.registerForActivityResult(new ktx0(), new v50(2, avtVar));
                    }
                    t3a0 d = r2a0Var.d();
                    boolean z9 = ((f5g) r2a0Var.a()).R().getTheme() == Theme.NIGHT;
                    fp51 fp51Var = d.z;
                    if (fp51Var != null) {
                        c cVar = (c) fp51Var;
                        cVar.a = kotlin.a.a(new ilr(cVar, d.y, paymentKitActivity22, z9, d.c == DefaultEnvironment.TESTING, Locale.getDefault(), d.x.d()));
                        return;
                    }
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        FlexAdapter m;
        super.onDestroy();
        r2a0 r2a0Var = this.activityDelegate;
        eyt0 eyt0Var = (eyt0) ((f5g) r2a0Var.a()).D0.get();
        eyt0Var.getClass();
        boolean z = false;
        try {
            cl2 cl2Var = eyt0Var.a;
            cl2Var.c.set(false);
            Thread thread = cl2Var.b;
            if (thread != null) {
                thread.interrupt();
            }
            cl2Var.b = null;
            j4x j4xVar = eyt0Var.b;
            l4x l4xVar = j4xVar.b;
            if (l4xVar != null && l4xVar.c) {
                o4x o4xVar = l4xVar.b;
                o4xVar.j.getDecorView().post(new androidx.metrics.performance.a(z, o4xVar));
                l4xVar.c = false;
            }
            j4xVar.b = null;
            eyt0Var.c.stop();
        } catch (Exception unused) {
        }
        if (!r2a0Var.a.isChangingConfigurations() && (m = ((f5g) r2a0Var.a()).m()) != null) {
            m.clear();
        }
        Scenario scenario = ((f5g) r2a0Var.a()).w;
        if (scenario instanceof Scenario.TransportCards) {
            com.yandex.fintechsdk.core.nfc.impl.internal.a aVar = (com.yandex.fintechsdk.core.nfc.impl.internal.a) ((f5g) r2a0Var.a()).y0.get();
            if (aVar != null) {
                aVar.b();
            }
        } else if (scenario instanceof Scenario.GooglePlayBinding) {
            avt avtVar = (avt) ((f5g) r2a0Var.a()).x0.get();
            avtVar.d = null;
            m50 m50Var = avtVar.e;
            if (m50Var != null) {
                m50Var.b();
            }
            avtVar.e = null;
        }
        if (isFinishing()) {
            SharedPreferences.Editor edit = getSharedPreferences("payment_kit_theme_prefs", 0).edit();
            edit.remove("key_theme");
            edit.apply();
            com.yandex.fintechsdk.flows.payment.kit.internal.model.a.j.a.remove(getIntentArgs().b.a);
            com.yandex.fintechsdk.flows.payment.kit.internal.model.a.k.a.remove(getIntentArgs().b.a);
            com.yandex.fintechsdk.flows.payment.kit.internal.model.a.i.a.remove(getIntentArgs().b.a);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        r2a0 r2a0Var = this.activityDelegate;
        PaymentKitConfig paymentKitConfig = (PaymentKitConfig) ((com.yandex.fintechsdk.data.config.impl.internal.a) ((f5g) r2a0Var.a()).t0.get()).b.b.get();
        if (paymentKitConfig != null) {
            outState.putParcelable("PAYMENT_KIT_CONFIG", paymentKitConfig);
        }
        outState.putString("key_payer_uid", r2a0Var.c().e.getUid());
        outState.putBoolean(BduiFragment.IS_CHANGING_CONFIGURATIONS_KEY, r2a0Var.a.isChangingConfigurations());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        h2t h2tVar;
        super.onStart();
        r2a0 r2a0Var = this.activityDelegate;
        if (!r2a0Var.c().h || (h2tVar = r2a0Var.g) == null) {
            return;
        }
        h2tVar.l(r2a0Var.a.getSupportFragmentManager());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        ((w870) this.activityDelegate.b().c.V.get()).a();
    }

    @Override // defpackage.okp
    public <T extends mkp> T resolveDependencies() {
        return this.activityDelegate.a();
    }
}
