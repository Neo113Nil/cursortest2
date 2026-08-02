package com.ybsdk.feature.settings.internal.screens.settings.presentation;

import android.content.SharedPreferences;
import com.adjust.sdk.Constants;
import com.ybsdk.api.entities.YBSdkSettingsTheme;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.CommonEvents$ThemeChangingThemeFromSettingsEvent;
import com.ybsdk.core.analytics.generated.delegates.SettingsEvents$SettingsHidingBalancesChangeAction;
import com.ybsdk.core.analytics.generated.delegates.SettingsEvents$SettingsOpenedSource;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinFragment;
import com.ybsdk.feature.pin.internal.screens.checkpin.CheckType;
import com.ybsdk.feature.settings.api.SettingsOpeningSource;
import com.ybsdk.feature.settings.api.SettingsTheme;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import defpackage.acu;
import defpackage.b7p0;
import defpackage.bi51;
import defpackage.ci51;
import defpackage.ds31;
import defpackage.em3;
import defpackage.ew2;
import defpackage.gao;
import defpackage.gwt0;
import defpackage.gyp0;
import defpackage.h791;
import defpackage.h9g;
import defpackage.hfr0;
import defpackage.j3h;
import defpackage.j59;
import defpackage.jl40;
import defpackage.jx81;
import defpackage.kgx;
import defpackage.krl0;
import defpackage.l04;
import defpackage.n7r0;
import defpackage.nw70;
import defpackage.ny61;
import defpackage.o8r0;
import defpackage.oo31;
import defpackage.pgk0;
import defpackage.pk11;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qer0;
import defpackage.qk11;
import defpackage.qoi0;
import defpackage.qq7;
import defpackage.r8j0;
import defpackage.rab1;
import defpackage.rk11;
import defpackage.s6r0;
import defpackage.s8j0;
import defpackage.ser0;
import defpackage.sk11;
import defpackage.ter0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.txg0;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.uer0;
import defpackage.v4r0;
import defpackage.v6r0;
import defpackage.v7r0;
import defpackage.v960;
import defpackage.w511;
import defpackage.w7r0;
import defpackage.wdr0;
import defpackage.wt51;
import defpackage.x4c;
import defpackage.x7r0;
import defpackage.y7r0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.video.m3.BuildConfig;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final com.ybsdk.feature.settings.internal.screens.settings.domain.a B;
    public final gwt0 C;
    public final tfl0 D;
    public final gyp0 E;
    public final nw70 F;
    public final pgk0 G;
    public final l04 H;
    public final com.ybsdk.feature.settings.internal.domain.security.a I;
    public final v960 J;
    public final n7r0 K;
    public final AppAnalyticsReporter L;
    public final pgk0 M;
    public final SettingsOpeningSource N;
    public final x7r0 O;
    public final krl0 P;

    public a(com.ybsdk.feature.settings.internal.screens.settings.domain.a aVar, gwt0 gwt0Var, tfl0 tfl0Var, gyp0 gyp0Var, nw70 nw70Var, pgk0 pgk0Var, l04 l04Var, com.ybsdk.feature.settings.internal.domain.security.a aVar2, v960 v960Var, n7r0 n7r0Var, AppAnalyticsReporter appAnalyticsReporter, pgk0 pgk0Var2, SettingsOpeningSource settingsOpeningSource, hfr0 hfr0Var, x7r0 x7r0Var, krl0 krl0Var) {
        super(new b7p0(19, aVar), hfr0Var);
        this.B = aVar;
        this.C = gwt0Var;
        this.D = tfl0Var;
        this.E = gyp0Var;
        this.F = nw70Var;
        this.G = pgk0Var;
        this.H = l04Var;
        this.I = aVar2;
        this.J = v960Var;
        this.K = n7r0Var;
        this.L = appAnalyticsReporter;
        this.M = pgk0Var2;
        this.N = settingsOpeningSource;
        this.O = x7r0Var;
        this.P = krl0Var;
        c.a(new acu((tpr) ((krl0) pgk0Var2.b).b, 23), ds31.a(this), new qer0(this, 0));
        c.a(x7r0Var.a.c, ds31.a(this), new qer0(this, 1));
    }

    public static o8r0 d0(String str, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((o8r0) obj).a, str)) {
                break;
            }
        }
        return (o8r0) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x013c, code lost:
    
        if (r0 == r6) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b0(o8r0 o8r0Var, String str, ContinuationImpl continuationImpl) {
        SettingsViewModel$callCommonSettingsUpdate$1 settingsViewModel$callCommonSettingsUpdate$1;
        int i;
        Object c;
        o8r0 o8r0Var2;
        Object obj;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        pk11 pk11Var;
        tfl0 tfl0Var;
        r0 r0Var3;
        Object value3;
        if (continuationImpl instanceof SettingsViewModel$callCommonSettingsUpdate$1) {
            settingsViewModel$callCommonSettingsUpdate$1 = (SettingsViewModel$callCommonSettingsUpdate$1) continuationImpl;
            int i2 = settingsViewModel$callCommonSettingsUpdate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsViewModel$callCommonSettingsUpdate$1.label = i2 - Integer.MIN_VALUE;
                SettingsViewModel$callCommonSettingsUpdate$1 settingsViewModel$callCommonSettingsUpdate$12 = settingsViewModel$callCommonSettingsUpdate$1;
                Object obj2 = settingsViewModel$callCommonSettingsUpdate$12.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = settingsViewModel$callCommonSettingsUpdate$12.label;
                if (i != 0) {
                    b.b(obj2);
                    String str2 = ((wdr0) X()).d;
                    settingsViewModel$callCommonSettingsUpdate$12.L$0 = o8r0Var;
                    settingsViewModel$callCommonSettingsUpdate$12.label = 1;
                    c = this.B.c(o8r0Var, str, str2, this, settingsViewModel$callCommonSettingsUpdate$12);
                    if (c != obj3) {
                        o8r0Var2 = o8r0Var;
                    }
                    return obj3;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tfl0Var = (tfl0) settingsViewModel$callCommonSettingsUpdate$12.L$1;
                    obj = settingsViewModel$callCommonSettingsUpdate$12.L$0;
                    b.b(obj2);
                    tfl0Var.h((Screen) obj2);
                    return obj;
                }
                o8r0 o8r0Var3 = (o8r0) settingsViewModel$callCommonSettingsUpdate$12.L$0;
                b.b(obj2);
                c = ((Result) obj2).getValue();
                o8r0Var2 = o8r0Var3;
                obj = c;
                if (!(obj instanceof Result.Failure)) {
                    return obj;
                }
                sk11 sk11Var = (sk11) obj;
                if (sk11Var instanceof rk11) {
                    pz40 Y = Y();
                    do {
                        r0Var3 = (r0) Y;
                        value3 = r0Var3.getValue();
                    } while (!r0Var3.k(value3, wdr0.a((wdr0) value3, new r8j0(((rk11) sk11Var).a, null, 14), null, null, null, false, null, null, null, null, false, 4086)));
                    return obj;
                }
                if (!(sk11Var instanceof pk11)) {
                    if (!(sk11Var instanceof qk11)) {
                        w511.b();
                        return null;
                    }
                    Z(new ter0(gao.e(null, null, null, 7)));
                    pz40 Y2 = Y();
                    do {
                        r0Var = (r0) Y2;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, rab1.f(wdr0.a((wdr0) value, null, null, null, null, false, null, null, null, null, false, 4087), o8r0Var2.a, !o8r0Var2.g)));
                    x4c.g("Change setting error - denied", null, String.valueOf(sk11Var), null, 10);
                    return obj;
                }
                pz40 Y3 = Y();
                do {
                    r0Var2 = (r0) Y3;
                    value2 = r0Var2.getValue();
                    pk11Var = (pk11) sk11Var;
                } while (!r0Var2.k(value2, wdr0.a((wdr0) value2, null, null, o8r0Var2, pk11Var.b, false, null, null, null, null, false, 4083)));
                if (o8r0Var2.c == null) {
                    Text.Empty empty = Text.Empty.INSTANCE;
                }
                String str3 = pk11Var.a;
                settingsViewModel$callCommonSettingsUpdate$12.L$0 = obj;
                tfl0Var = this.D;
                settingsViewModel$callCommonSettingsUpdate$12.L$1 = tfl0Var;
                settingsViewModel$callCommonSettingsUpdate$12.label = 2;
                obj2 = com.ybsdk.screens.registration.a.e((com.ybsdk.screens.registration.a) ((h9g) ((w7r0) this.E).a).R.get(), new CodeConfirmationParams.HeaderText.UniversalText(null, 1, null), str3, new CodeConfirmationParams.HeaderImage.Resource(txg0.ybsdk_ic_transfers_sbp), null, false, null, null, null, OpenScreenRequirement.WithUid.INSTANCE, false, null, 3560);
            }
        }
        settingsViewModel$callCommonSettingsUpdate$1 = new SettingsViewModel$callCommonSettingsUpdate$1(this, continuationImpl);
        SettingsViewModel$callCommonSettingsUpdate$1 settingsViewModel$callCommonSettingsUpdate$122 = settingsViewModel$callCommonSettingsUpdate$1;
        Object obj22 = settingsViewModel$callCommonSettingsUpdate$122.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = settingsViewModel$callCommonSettingsUpdate$122.label;
        if (i != 0) {
        }
        obj = c;
        if (!(obj instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c0(o8r0 o8r0Var, String str, ContinuationImpl continuationImpl) {
        SettingsViewModel$callSettingsUpdate$1 settingsViewModel$callSettingsUpdate$1;
        int i;
        r0 r0Var;
        Object value;
        wdr0 wdr0Var;
        Object b0;
        o8r0 o8r0Var2;
        Throwable a;
        pz40 Y;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        o8r0 o8r0Var3 = o8r0Var;
        if (continuationImpl instanceof SettingsViewModel$callSettingsUpdate$1) {
            settingsViewModel$callSettingsUpdate$1 = (SettingsViewModel$callSettingsUpdate$1) continuationImpl;
            int i2 = settingsViewModel$callSettingsUpdate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsViewModel$callSettingsUpdate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = settingsViewModel$callSettingsUpdate$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = settingsViewModel$callSettingsUpdate$1.label;
                if (i != 0) {
                    b.b(obj);
                    String str2 = o8r0Var3.a;
                    pz40 Y2 = Y();
                    do {
                        r0Var = (r0) Y2;
                        value = r0Var.getValue();
                        wdr0Var = (wdr0) value;
                    } while (!r0Var.k(value, rab1.f(wdr0.a(wdr0Var, null, v4r0.i(wdr0Var.b, str2), null, null, true, null, null, null, null, false, 4077), str2, o8r0Var3.g)));
                    settingsViewModel$callSettingsUpdate$1.L$0 = o8r0Var3;
                    settingsViewModel$callSettingsUpdate$1.label = 1;
                    b0 = b0(o8r0Var3, str, settingsViewModel$callSettingsUpdate$1);
                    if (b0 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o8r0Var3 = (o8r0) settingsViewModel$callSettingsUpdate$1.L$0;
                    b.b(obj);
                    b0 = ((Result) obj).getValue();
                }
                o8r0Var2 = o8r0Var3;
                a = Result.a(b0);
                if (a != null) {
                    Z(new ter0(gao.e(null, null, a, 3)));
                    pz40 Y3 = Y();
                    do {
                        r0Var3 = (r0) Y3;
                        value3 = r0Var3.getValue();
                    } while (!r0Var3.k(value3, rab1.f((wdr0) value3, o8r0Var2.a, !o8r0Var2.g)));
                    x4c.g("Change setting error", a, "settingItem: " + o8r0Var2, null, 8);
                }
                Y = Y();
                do {
                    r0Var2 = (r0) Y;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, wdr0.a((wdr0) value2, null, v4r0.f(((wdr0) X()).b, o8r0Var2.a), null, null, false, null, null, null, null, false, 4077)));
                return zy11.a;
            }
        }
        settingsViewModel$callSettingsUpdate$1 = new SettingsViewModel$callSettingsUpdate$1(this, continuationImpl);
        Object obj3 = settingsViewModel$callSettingsUpdate$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = settingsViewModel$callSettingsUpdate$1.label;
        if (i != 0) {
        }
        o8r0Var2 = o8r0Var3;
        a = Result.a(b0);
        if (a != null) {
        }
        Y = Y();
        do {
            r0Var2 = (r0) Y;
            value2 = r0Var2.getValue();
        } while (!r0Var2.k(value2, wdr0.a((wdr0) value2, null, v4r0.f(((wdr0) X()).b, o8r0Var2.a), null, null, false, null, null, null, null, false, 4077)));
        return zy11.a;
    }

    public final pzt0 e0(boolean z) {
        return tje.N(ds31.a(this), null, null, new SettingsViewModel$loadSettings$1(z, this, null), 3);
    }

    public final void f0() {
        SettingsEvents$SettingsOpenedSource settingsEvents$SettingsOpenedSource;
        qq7 qq7Var = this.H.a.h0;
        int i = s6r0.a[this.N.ordinal()];
        if (i == 1) {
            settingsEvents$SettingsOpenedSource = SettingsEvents$SettingsOpenedSource.MENU;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            settingsEvents$SettingsOpenedSource = SettingsEvents$SettingsOpenedSource.TRANSFERS;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("source", settingsEvents$SettingsOpenedSource.getOriginalValue());
        qq7Var.a.a("settings.opened", linkedHashMap);
    }

    public final void g0(v6r0 v6r0Var) {
        this.L.h0.a.a("settings.select_icon_banner.click", null);
        String str = v6r0Var.e;
        if (str != null) {
            ((y7r0) this.K).a(str);
        }
    }

    public final void h0() {
        this.L.h0.a.a("settings.select_icon_banner.shown", null);
    }

    public final void i0() {
        String supportUrl;
        u8j0 u8j0Var = ((wdr0) X()).a;
        s8j0 s8j0Var = u8j0Var instanceof s8j0 ? (s8j0) u8j0Var : null;
        if (s8j0Var != null) {
            Throwable th = s8j0Var.a;
            FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
            if (failDataException == null || (supportUrl = failDataException.getSupportUrl()) == null) {
                return;
            }
            y7r0 y7r0Var = (y7r0) this.K;
            h791.f((j3h) y7r0Var.a.get(), supportUrl, com.ybsdk.feature.webview.api.a.b(y7r0Var.b, supportUrl, null, null, 6));
        }
    }

    public final void j0() {
        this.L.M.a.a("nfc_wipe.dialog_dismiss", null);
    }

    public final void k0() {
        e0(true);
    }

    public final void l0(String str) {
        tje.N(ds31.a(this), null, null, new SettingsViewModel$onReceiveVerificationToken$1(this, str, null), 3);
    }

    public final void m0() {
        this.L.M.a.a("nfc_wipe.dialog_show", null);
    }

    public final boolean n0(String str, boolean z) {
        o8r0 o8r0Var;
        List list;
        List list2;
        List list3;
        List list4;
        v7r0 v7r0Var = (v7r0) ((wdr0) X()).a.a();
        if (v7r0Var != null) {
            Iterator it = v7r0Var.c.iterator();
            while (it.hasNext()) {
                o8r0Var = d0(str, ((j59) it.next()).c);
                if (o8r0Var != null) {
                    break;
                }
            }
        }
        o8r0Var = null;
        if (o8r0Var == null) {
            j59 j59Var = ((wdr0) X()).g;
            o8r0Var = (j59Var == null || (list4 = j59Var.c) == null) ? null : d0(str, list4);
            if (o8r0Var == null) {
                j59 j59Var2 = ((wdr0) X()).j;
                o8r0Var = (j59Var2 == null || (list3 = j59Var2.c) == null) ? null : d0(str, list3);
                if (o8r0Var == null) {
                    j59 j59Var3 = ((wdr0) X()).f;
                    o8r0Var = (j59Var3 == null || (list2 = j59Var3.c) == null) ? null : d0(str, list2);
                    if (o8r0Var == null) {
                        j59 j59Var4 = ((wdr0) X()).i;
                        o8r0Var = (j59Var4 == null || (list = j59Var4.c) == null) ? null : d0(str, list);
                        if (o8r0Var == null) {
                            return false;
                        }
                    }
                }
            }
        }
        if (str.equals("fps_priority_bank") && o8r0Var.g) {
            Z(ser0.a);
            return false;
        }
        if (str.equals("biometric")) {
            if (!z) {
                tje.N(ds31.a(this), null, null, new SettingsViewModel$toggleBiometricSettings$1(this, null), 3);
                return true;
            }
            Object obj = this.G.b;
            this.D.h(new FragmentScreen("CheckPinCodeBiometrySetScreen", false, new CheckPinFragment.CheckPinScreenParams(CheckType.SET_BIOMETRY, null, false, 2, null), null, qoi0.a(CheckPinFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null));
            return true;
        }
        boolean equals = str.equals("hide_spoiler_on_rotation");
        x7r0 x7r0Var = this.O;
        l04 l04Var = this.H;
        if (equals) {
            com.ybsdk.persistence.b bVar = x7r0Var.a;
            com.ybsdk.persistence.b bVar2 = x7r0Var.a;
            SharedPreferences sharedPreferences = bVar.a;
            oo31.n(sharedPreferences, "prefs_is_spoiler_setting_enabled", z);
            if (!z) {
                oo31.n(sharedPreferences, "prefs_is_spoiler_visible", false);
            }
            l04Var.getClass();
            SettingsEvents$SettingsHidingBalancesChangeAction settingsEvents$SettingsHidingBalancesChangeAction = z ? SettingsEvents$SettingsHidingBalancesChangeAction.ON : SettingsEvents$SettingsHidingBalancesChangeAction.OFF;
            qq7 qq7Var = l04Var.a.h0;
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            linkedHashMap.put("action", settingsEvents$SettingsHidingBalancesChangeAction.getOriginalValue());
            qq7Var.a.a("settings.hiding_balances.change", linkedHashMap);
            if (!z && bVar2.b()) {
                ew2 ew2Var = bVar2.f;
                kgx kgxVar = com.ybsdk.persistence.b.l[3];
                ew2Var.d(false);
                l04Var.f(false);
            }
            tje.N(ds31.a(this), null, null, new SettingsViewModel$toggleHideSpoilerOnRotationSetting$1(this, null), 3);
            return true;
        }
        if (str.equals("show_spoiler_on_launch")) {
            ew2 ew2Var2 = x7r0Var.a.f;
            kgx kgxVar2 = com.ybsdk.persistence.b.l[3];
            ew2Var2.d(z);
            l04Var.f(z);
            tje.N(ds31.a(this), null, null, new SettingsViewModel$toggleShowSpoilerOnLaunchSetting$1(this, null), 3);
            return true;
        }
        if (str.equals("haptic_feedback")) {
            ew2 ew2Var3 = x7r0Var.a.b;
            kgx kgxVar3 = com.ybsdk.persistence.b.l[0];
            ew2Var3.d(z);
            qq7 qq7Var2 = l04Var.a.h0;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
            linkedHashMap2.put("is_checked", Boolean.valueOf(z));
            qq7Var2.a.a("settings.haptic_feedback.change", linkedHashMap2);
            return true;
        }
        if (!str.equals(Constants.PUSH)) {
            tje.N(ds31.a(this), null, null, new SettingsViewModel$onSwitchToggle$1(this, o8r0Var, z, null), 3);
            return true;
        }
        krl0 krl0Var = this.P;
        if (z) {
            ((com.ybsdk.feature.push.impl.data.b) ((com.ybsdk.feature.push.impl.a) ((wt51) krl0Var.a)).c.getValue()).d(true);
            return true;
        }
        ((com.ybsdk.feature.push.impl.data.b) ((com.ybsdk.feature.push.impl.a) ((wt51) krl0Var.a)).c.getValue()).d(false);
        return true;
    }

    public final void o0(SettingsTheme settingsTheme) {
        pgk0 pgk0Var;
        YBSdkSettingsTheme yBSdkSettingsTheme;
        YBSdkSettingsTheme yBSdkSettingsTheme2;
        CommonEvents$ThemeChangingThemeFromSettingsEvent commonEvents$ThemeChangingThemeFromSettingsEvent;
        pz40 Y = Y();
        while (true) {
            r0 r0Var = (r0) Y;
            Object value = r0Var.getValue();
            wdr0 wdr0Var = (wdr0) value;
            pgk0Var = this.M;
            pgk0Var.getClass();
            YBSdkSettingsTheme.Companion.getClass();
            yBSdkSettingsTheme = YBSdkSettingsTheme.DEFAULT_SETTINGS_THEME;
            pz40 pz40Var = Y;
            if (r0Var.k(value, wdr0.a(wdr0Var, null, null, null, null, false, null, null, null, null, jx81.J(yBSdkSettingsTheme) != settingsTheme, BuildConfig.VERSION_CODE))) {
                break;
            } else {
                Y = pz40Var;
            }
        }
        krl0 krl0Var = (krl0) pgk0Var.b;
        int i = ci51.c[settingsTheme.ordinal()];
        if (i == 1) {
            yBSdkSettingsTheme2 = YBSdkSettingsTheme.LIGHT;
        } else if (i == 2) {
            yBSdkSettingsTheme2 = YBSdkSettingsTheme.DARK;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            yBSdkSettingsTheme2 = YBSdkSettingsTheme.SYSTEM;
        }
        em3 em3Var = ((AppAnalyticsReporter) krl0Var.a).o;
        int i2 = bi51.a[yBSdkSettingsTheme2.ordinal()];
        if (i2 == 1) {
            commonEvents$ThemeChangingThemeFromSettingsEvent = CommonEvents$ThemeChangingThemeFromSettingsEvent.LIGHT;
        } else if (i2 == 2) {
            commonEvents$ThemeChangingThemeFromSettingsEvent = CommonEvents$ThemeChangingThemeFromSettingsEvent.DARK;
        } else {
            if (i2 != 3) {
                w511.b();
                return;
            }
            commonEvents$ThemeChangingThemeFromSettingsEvent = CommonEvents$ThemeChangingThemeFromSettingsEvent.SYSTEM;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, commonEvents$ThemeChangingThemeFromSettingsEvent.getOriginalValue());
        em3Var.a.a("theme.changing_theme_from_settings", linkedHashMap);
    }

    public final void p0() {
        r0 r0Var;
        Object value;
        if (((wdr0) X()).c != null) {
            return;
        }
        if (!((wdr0) X()).k) {
            e0(((wdr0) X()).l);
        }
        if (((wdr0) X()).k || ((wdr0) X()).l) {
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, wdr0.a((wdr0) value, null, null, null, null, false, null, null, null, null, false, 1023)));
        }
    }

    public final void q0() {
        this.L.M.a.a("nfc_wipe.settings_click", null);
        Z(uer0.a);
    }

    public final void r0() {
        this.L.M.a.a("nfc_wipe.dialog_submit", null);
        tje.N(ds31.a(this), null, null, new SettingsViewModel$wipeNfcData$1(this, null), 3);
    }
}
