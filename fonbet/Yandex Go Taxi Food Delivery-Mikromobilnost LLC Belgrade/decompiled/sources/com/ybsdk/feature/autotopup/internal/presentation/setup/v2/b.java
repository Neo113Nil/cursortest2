package com.ybsdk.feature.autotopup.internal.presentation.setup.v2;

import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsAccountBottomSheetClickVersion;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsAccountBottomSheetCloseVersion;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsAccountBottomSheetShowVersion;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsBackSaveVersion;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsExitVersion;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsLoadedUserType;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsLoadedVersion;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveLoadedVersion;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveResultResult;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveResultVersion;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsShortCutLimitsClickVersion;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.api.TwoFactorAuthResult;
import com.ybsdk.feature.autotopup.api.data.AutoTopupUserStatus;
import com.ybsdk.feature.autotopup.api.domain.model.AutoTopupRequestStatusPollingOption;
import com.ybsdk.feature.autotopup.api.domain.model.SettingStatus;
import com.ybsdk.feature.autotopup.internal.domain.c;
import com.ybsdk.feature.autotopup.internal.domain.d;
import com.ybsdk.feature.autotopup.internal.domain.e;
import com.ybsdk.feature.autotopup.internal.domain.f;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v2.state.AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v2.state.AutoTopupSetupV2ScreenParams;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupApiVersion;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupSettingType;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupSetupAction;
import com.ybsdk.feature.settings.api.SettingsOpeningSource;
import defpackage.b24;
import defpackage.b3z;
import defpackage.bqg;
import defpackage.c24;
import defpackage.c5a0;
import defpackage.cqg;
import defpackage.d24;
import defpackage.dqg;
import defpackage.ds31;
import defpackage.dv3;
import defpackage.e24;
import defpackage.e5a0;
import defpackage.eo1;
import defpackage.evu0;
import defpackage.f5a0;
import defpackage.g5a0;
import defpackage.g8e;
import defpackage.gao;
import defpackage.h52;
import defpackage.h5a0;
import defpackage.i14;
import defpackage.iaa0;
import defpackage.ifp0;
import defpackage.iw3;
import defpackage.jl40;
import defpackage.k4;
import defpackage.khk;
import defpackage.lrp0;
import defpackage.lu3;
import defpackage.m04;
import defpackage.mu3;
import defpackage.mv3;
import defpackage.n04;
import defpackage.n0t0;
import defpackage.n2b1;
import defpackage.nr3;
import defpackage.nu3;
import defpackage.ny61;
import defpackage.ou3;
import defpackage.ozl0;
import defpackage.p73;
import defpackage.pk11;
import defpackage.pu3;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qis;
import defpackage.qk11;
import defpackage.qu3;
import defpackage.r24;
import defpackage.r8j0;
import defpackage.rk11;
import defpackage.rsa1;
import defpackage.ru3;
import defpackage.rv3;
import defpackage.s04;
import defpackage.s24;
import defpackage.s8j0;
import defpackage.sk11;
import defpackage.su3;
import defpackage.sv3;
import defpackage.t04;
import defpackage.tfl0;
import defpackage.thq0;
import defpackage.tje;
import defpackage.u04;
import defpackage.u24;
import defpackage.uc5;
import defpackage.uda0;
import defpackage.uk11;
import defpackage.uy21;
import defpackage.uza;
import defpackage.v04;
import defpackage.v0h;
import defpackage.v5;
import defpackage.vv3;
import defpackage.w04;
import defpackage.w511;
import defpackage.x04;
import defpackage.x4c;
import defpackage.y32;
import defpackage.y5e;
import defpackage.z04;
import defpackage.z1b1;
import defpackage.z2z;
import defpackage.z94;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b extends uc5 {
    public final AutoTopupSetupV2ScreenParams B;
    public final iw3 C;
    public final e D;
    public final d E;
    public final c F;
    public final com.ybsdk.feature.banners.impl.domain.interactors.a G;
    public final uk11 H;
    public final tfl0 I;
    public final m04 J;
    public boolean K;
    public boolean L;
    public pzt0 M;
    public pzt0 N;
    public pzt0 O;
    public boolean P;
    public final f Q;

    public b(AutoTopupSetupV2ScreenParams autoTopupSetupV2ScreenParams, iw3 iw3Var, e eVar, d dVar, c cVar, com.ybsdk.feature.banners.impl.domain.interactors.a aVar, uk11 uk11Var, tfl0 tfl0Var, m04 m04Var, u24 u24Var, i14 i14Var) {
        super(new p73(17), i14Var);
        this.B = autoTopupSetupV2ScreenParams;
        this.C = iw3Var;
        this.D = eVar;
        this.E = dVar;
        this.F = cVar;
        this.G = aVar;
        this.H = uk11Var;
        this.I = tfl0Var;
        this.J = m04Var;
        int i = 1;
        this.K = true;
        int i2 = 0;
        this.P = autoTopupSetupV2ScreenParams.getSetupAction() != null;
        this.Q = new f(ds31.a(this), (com.ybsdk.feature.autotopup.internal.data.b) ((k4) u24Var.a.b).get());
        x04 x04Var = new x04(this, i2);
        sv3 sv3Var = (sv3) iw3Var;
        b3z b3zVar = sv3Var.a;
        DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType = DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN;
        b3zVar.a(new mv3(deeplinkHandleResult$DeeplinkType, x04Var, 5));
        b3zVar.a(new mv3(deeplinkHandleResult$DeeplinkType, new a(this), 6));
        int i3 = 4;
        b3zVar.a(new mv3(deeplinkHandleResult$DeeplinkType, new x04(this, i), i3));
        int i4 = 2;
        b3zVar.a(new mv3(deeplinkHandleResult$DeeplinkType, new v04(this, i), i4));
        int i5 = 3;
        b3zVar.a(new mv3(deeplinkHandleResult$DeeplinkType, new v04(this, i4), i5));
        b3zVar.a(new rv3(deeplinkHandleResult$DeeplinkType, new v04(this, i5), 1));
        b3zVar.a(new rv3(deeplinkHandleResult$DeeplinkType, new v04(this, i3), 0));
        sv3Var.b(new x04(this, i4));
        b3zVar.a(new khk(i4, new v04(this, i2)));
    }

    public static final void b0(b bVar, String str, Throwable th) {
        r0 r0Var;
        Object value;
        m04 m04Var = bVar.J;
        z94.b(m04Var.a.e, AutotopupEvents$AutoTopupSettingsLoadedResult.ERROR, str, null, null, null, null, null, bVar.B.getSource(), null, null, null, null, null, null, AutotopupEvents$AutoTopupSettingsLoadedVersion.V2, 16252);
        pz40 Y = bVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, u04.a((u04) value, new s8j0(th), null, null, null, null, null, null, null, null, null, null, null, null, null, false, 32766)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c0(b bVar, cqg cqgVar, boolean z, ContinuationImpl continuationImpl) {
        AutoTopupSetupV2ViewModel$handleSuccessSetupResult$1 autoTopupSetupV2ViewModel$handleSuccessSetupResult$1;
        int i;
        AutotopupEvents$AutoTopupSettingsLoadedUserType autotopupEvents$AutoTopupSettingsLoadedUserType;
        r0 r0Var;
        Object value;
        n04 n04Var;
        AutotopupEvents$AutoTopupSettingsLoadedUserType autotopupEvents$AutoTopupSettingsLoadedUserType2;
        Object obj;
        String str;
        AutoTopupSetupV2ScreenParams autoTopupSetupV2ScreenParams = bVar.B;
        if (continuationImpl instanceof AutoTopupSetupV2ViewModel$handleSuccessSetupResult$1) {
            autoTopupSetupV2ViewModel$handleSuccessSetupResult$1 = (AutoTopupSetupV2ViewModel$handleSuccessSetupResult$1) continuationImpl;
            int i2 = autoTopupSetupV2ViewModel$handleSuccessSetupResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupV2ViewModel$handleSuccessSetupResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = autoTopupSetupV2ViewModel$handleSuccessSetupResult$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupV2ViewModel$handleSuccessSetupResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    n04 n04Var2 = (n04) cqgVar.a;
                    m04 m04Var = bVar.J;
                    String source = autoTopupSetupV2ScreenParams.getSource();
                    AutoTopupUserStatus autoTopupUserStatus = n04Var2.j;
                    iaa0 iaa0Var = n04Var2.h;
                    h5a0 h5a0Var = n04Var2.g;
                    z94 z94Var = m04Var.a.e;
                    AutotopupEvents$AutoTopupSettingsLoadedResult autotopupEvents$AutoTopupSettingsLoadedResult = AutotopupEvents$AutoTopupSettingsLoadedResult.OK;
                    nr3 nr3Var = n04Var2.f;
                    String plainString = nr3Var.b.getAmount().toPlainString();
                    b24 b24Var = n04Var2.e;
                    String plainString2 = b24Var.b.getAmount().toPlainString();
                    String plainString3 = b24Var.c.getAmount().toPlainString();
                    Map b = h52.b(h5a0Var);
                    String e = rsa1.e(nr3Var.a);
                    String e2 = rsa1.e(b24Var.a);
                    if (autoTopupUserStatus != null) {
                        int i3 = y32.a[autoTopupUserStatus.ordinal()];
                        if (i3 == 1) {
                            autotopupEvents$AutoTopupSettingsLoadedUserType2 = AutotopupEvents$AutoTopupSettingsLoadedUserType.NOT_REGISTERED;
                        } else if (i3 == 2) {
                            autotopupEvents$AutoTopupSettingsLoadedUserType2 = AutotopupEvents$AutoTopupSettingsLoadedUserType.ANON;
                        } else if (i3 == 3) {
                            autotopupEvents$AutoTopupSettingsLoadedUserType2 = AutotopupEvents$AutoTopupSettingsLoadedUserType.NOT_ANON;
                        } else if (i3 == 4) {
                            autotopupEvents$AutoTopupSettingsLoadedUserType2 = AutotopupEvents$AutoTopupSettingsLoadedUserType.NOT_ANON;
                        } else {
                            if (i3 != 5) {
                                w511.b();
                                return null;
                            }
                            autotopupEvents$AutoTopupSettingsLoadedUserType2 = AutotopupEvents$AutoTopupSettingsLoadedUserType.NOT_ANON;
                        }
                        autotopupEvents$AutoTopupSettingsLoadedUserType = autotopupEvents$AutoTopupSettingsLoadedUserType2;
                    } else {
                        autotopupEvents$AutoTopupSettingsLoadedUserType = null;
                    }
                    h5a0 h5a0Var2 = h5a0Var;
                    iaa0 iaa0Var2 = iaa0Var;
                    z94.b(z94Var, autotopupEvents$AutoTopupSettingsLoadedResult, null, null, null, b, null, null, source, plainString, plainString2, plainString3, e, e2, autotopupEvents$AutoTopupSettingsLoadedUserType, AutotopupEvents$AutoTopupSettingsLoadedVersion.V2, 108);
                    if (!z) {
                        if (iaa0Var2.equals(((u04) bVar.X()).i)) {
                            pz40 Y = bVar.Y();
                            do {
                                r0Var = (r0) Y;
                                value = r0Var.getValue();
                            } while (!r0Var.k(value, u04.a((u04) value, new r8j0(n04Var2, null, 14), null, null, null, null, null, null, null, null, null, null, null, null, null, false, 32766)));
                        } else {
                            pz40 Y2 = bVar.Y();
                            while (true) {
                                r0 r0Var2 = (r0) Y2;
                                Object value2 = r0Var2.getValue();
                                h5a0 h5a0Var3 = h5a0Var2;
                                iaa0 iaa0Var3 = iaa0Var2;
                                if (r0Var2.k(value2, u04.a((u04) value2, new r8j0(n04Var2, null, 14), null, null, null, null, null, null, new thq0(h5a0Var3), iaa0Var3, null, null, null, null, null, false, 32382))) {
                                    break;
                                }
                                h5a0Var2 = h5a0Var3;
                                iaa0Var2 = iaa0Var3;
                            }
                        }
                        return zy11.a;
                    }
                    List list = ((n04) cqgVar.a).k;
                    autoTopupSetupV2ViewModel$handleSuccessSetupResult$1.L$0 = n04Var2;
                    autoTopupSetupV2ViewModel$handleSuccessSetupResult$1.label = 1;
                    if (bVar.A0(list, autoTopupSetupV2ViewModel$handleSuccessSetupResult$1) == obj3) {
                        return obj3;
                    }
                    n04Var = n04Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n04Var = (n04) autoTopupSetupV2ViewModel$handleSuccessSetupResult$1.L$0;
                    kotlin.b.b(obj2);
                }
                bVar.a0(new eo1(27, n04Var));
                if (bVar.P) {
                    int i4 = 0;
                    bVar.P = false;
                    lrp0 lrp0Var = lrp0.d;
                    AutoTopupSetupAction setupAction = autoTopupSetupV2ScreenParams.getSetupAction();
                    if (setupAction != null) {
                        AutoTopupSettingType setupSetting = autoTopupSetupV2ScreenParams.getSetupSetting();
                        if (setupSetting == null) {
                            x4c.g("Auto topup setup action without setting", null, "action=" + setupAction, Collections.singletonList(lrp0Var), 2);
                        } else {
                            if (setupAction.getEnables()) {
                                thq0 thq0Var = ((u04) bVar.X()).h;
                                if ((thq0Var != null ? thq0Var.a : null) == null) {
                                    int i5 = z04.a[setupSetting.ordinal()];
                                    if (i5 == 1) {
                                        n04 n04Var3 = (n04) ((u04) bVar.X()).a.a();
                                        nr3 nr3Var2 = n04Var3 != null ? n04Var3.f : null;
                                        if (nr3Var2 != null) {
                                            str = nr3Var2.d;
                                            if (str != null) {
                                            }
                                            x4c.g("Missing unselected payment method action", null, "setting=" + setupSetting, Collections.singletonList(lrp0Var), 2);
                                        }
                                        str = null;
                                        if (str != null) {
                                        }
                                        x4c.g("Missing unselected payment method action", null, "setting=" + setupSetting, Collections.singletonList(lrp0Var), 2);
                                    } else {
                                        if (i5 != 2) {
                                            w511.b();
                                            return null;
                                        }
                                        n04 n04Var4 = (n04) ((u04) bVar.X()).a.a();
                                        b24 b24Var2 = n04Var4 != null ? n04Var4.e : null;
                                        if (b24Var2 != null) {
                                            str = b24Var2.e;
                                            if (str != null || evu0.J(str)) {
                                                x4c.g("Missing unselected payment method action", null, "setting=" + setupSetting, Collections.singletonList(lrp0Var), 2);
                                            } else {
                                                ((sv3) bVar.C).c(str);
                                            }
                                        }
                                        str = null;
                                        if (str != null) {
                                        }
                                        x4c.g("Missing unselected payment method action", null, "setting=" + setupSetting, Collections.singletonList(lrp0Var), 2);
                                    }
                                }
                            }
                            if (setupAction.getEnables()) {
                                int i6 = z04.a[setupSetting.ordinal()];
                                if (i6 == 1) {
                                    n04 n04Var5 = (n04) ((u04) bVar.X()).a.a();
                                    obj = n04Var5 != null ? n04Var5.f : null;
                                    if (obj == null) {
                                        w0(setupSetting);
                                    } else {
                                        bVar.a0(new v5(29, obj, bVar));
                                    }
                                } else {
                                    if (i6 != 2) {
                                        w511.b();
                                        return null;
                                    }
                                    n04 n04Var6 = (n04) ((u04) bVar.X()).a.a();
                                    obj = n04Var6 != null ? n04Var6.e : null;
                                    if (obj == null) {
                                        w0(setupSetting);
                                    } else {
                                        bVar.a0(new w04(i4, obj, bVar));
                                    }
                                }
                            }
                            if (setupAction.getOpensEditor()) {
                                bVar.a0(new v5(28, setupSetting, bVar));
                            }
                        }
                    }
                }
                return zy11.a;
            }
        }
        autoTopupSetupV2ViewModel$handleSuccessSetupResult$1 = new AutoTopupSetupV2ViewModel$handleSuccessSetupResult$1(bVar, continuationImpl);
        Object obj22 = autoTopupSetupV2ViewModel$handleSuccessSetupResult$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupV2ViewModel$handleSuccessSetupResult$1.label;
        if (i != 0) {
        }
        bVar.a0(new eo1(27, n04Var));
        if (bVar.P) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d0(b bVar, sk11 sk11Var, boolean z, ContinuationImpl continuationImpl) {
        AutoTopupSetupV2ViewModel$onSuccessSaveAutoTopup$1 autoTopupSetupV2ViewModel$onSuccessSaveAutoTopup$1;
        int i;
        r0 r0Var;
        Object value;
        pk11 pk11Var;
        tfl0 tfl0Var;
        SettingStatus settingStatus;
        SettingStatus settingStatus2;
        MoneyEntity moneyEntity;
        MoneyEntity moneyEntity2;
        MoneyEntity moneyEntity3;
        m04 m04Var = bVar.J;
        if (continuationImpl instanceof AutoTopupSetupV2ViewModel$onSuccessSaveAutoTopup$1) {
            autoTopupSetupV2ViewModel$onSuccessSaveAutoTopup$1 = (AutoTopupSetupV2ViewModel$onSuccessSaveAutoTopup$1) continuationImpl;
            int i2 = autoTopupSetupV2ViewModel$onSuccessSaveAutoTopup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupV2ViewModel$onSuccessSaveAutoTopup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupSetupV2ViewModel$onSuccessSaveAutoTopup$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupV2ViewModel$onSuccessSaveAutoTopup$1.label;
                zy11 zy11Var = zy11.a;
                String str = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (sk11Var instanceof rk11) {
                        u04 u04Var = (u04) bVar.X();
                        r24 r24Var = u04Var.e;
                        z94 z94Var = m04Var.a.e;
                        AutotopupEvents$AutoTopupSettingsSaveLoadedResult autotopupEvents$AutoTopupSettingsSaveLoadedResult = AutotopupEvents$AutoTopupSettingsSaveLoadedResult.OK;
                        s24 s24Var = u04Var.d;
                        String formattedAmount = (s24Var == null || (moneyEntity3 = s24Var.c) == null) ? null : moneyEntity3.getFormattedAmount();
                        String formattedAmount2 = (s24Var == null || (moneyEntity2 = s24Var.d) == null) ? null : moneyEntity2.getFormattedAmount();
                        String formattedAmount3 = (r24Var == null || (moneyEntity = r24Var.b) == null) ? null : moneyEntity.getFormattedAmount();
                        thq0 thq0Var = u04Var.h;
                        Map b = h52.b(thq0Var != null ? thq0Var.a : null);
                        String d = (r24Var == null || (settingStatus2 = r24Var.a) == null) ? null : rsa1.d(settingStatus2);
                        if (s24Var != null && (settingStatus = s24Var.a) != null) {
                            str = rsa1.d(settingStatus);
                        }
                        z94.f(z94Var, autotopupEvents$AutoTopupSettingsSaveLoadedResult, null, null, null, b, null, null, formattedAmount3, formattedAmount, formattedAmount2, d, str, AutotopupEvents$AutoTopupSettingsSaveLoadedVersion.V2, 110);
                        ozl0 ozl0Var = (ozl0) ((rk11) sk11Var).a;
                        autoTopupSetupV2ViewModel$onSuccessSaveAutoTopup$1.label = 1;
                        if (bVar.C0(ozl0Var, z, autoTopupSetupV2ViewModel$onSuccessSaveAutoTopup$1) != obj2) {
                            return zy11Var;
                        }
                    } else {
                        if (!(sk11Var instanceof pk11)) {
                            if (!(sk11Var instanceof qk11)) {
                                w511.b();
                                return null;
                            }
                            qk11 qk11Var = (qk11) sk11Var;
                            String str2 = qk11Var.a;
                            m04Var.x(str2, (u04) bVar.X());
                            bVar.o0(gao.e(g8e.i(Text.Companion, str2), com.ybsdk.core.utils.text.d.f(qk11Var.b), null, 4));
                            return zy11Var;
                        }
                        pz40 Y = bVar.Y();
                        do {
                            r0Var = (r0) Y;
                            value = r0Var.getValue();
                            pk11Var = (pk11) sk11Var;
                        } while (!r0Var.k(value, u04.a((u04) value, null, null, null, null, null, null, null, null, null, null, null, pk11Var.b, null, null, false, 30719)));
                        tfl0 tfl0Var2 = bVar.I;
                        uk11 uk11Var = bVar.H;
                        String str3 = pk11Var.a;
                        autoTopupSetupV2ViewModel$onSuccessSaveAutoTopup$1.L$0 = tfl0Var2;
                        autoTopupSetupV2ViewModel$onSuccessSaveAutoTopup$1.label = 2;
                        obj = ((vv3) uk11Var).b(str3);
                        if (obj != obj2) {
                            tfl0Var = tfl0Var2;
                        }
                    }
                    return obj2;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tfl0Var = (tfl0) autoTopupSetupV2ViewModel$onSuccessSaveAutoTopup$1.L$0;
                kotlin.b.b(obj);
                tfl0Var.h((Screen) obj);
                return zy11Var;
            }
        }
        autoTopupSetupV2ViewModel$onSuccessSaveAutoTopup$1 = new AutoTopupSetupV2ViewModel$onSuccessSaveAutoTopup$1(bVar, continuationImpl);
        Object obj3 = autoTopupSetupV2ViewModel$onSuccessSaveAutoTopup$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupV2ViewModel$onSuccessSaveAutoTopup$1.label;
        zy11 zy11Var2 = zy11.a;
        String str4 = null;
        if (i != 0) {
        }
        tfl0Var.h((Screen) obj3);
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e0(b bVar, r24 r24Var, ContinuationImpl continuationImpl) {
        AutoTopupSetupV2ViewModel$validateInputAutoFund$1 autoTopupSetupV2ViewModel$validateInputAutoFund$1;
        int i;
        Object c;
        Throwable a;
        bVar.getClass();
        if (continuationImpl instanceof AutoTopupSetupV2ViewModel$validateInputAutoFund$1) {
            autoTopupSetupV2ViewModel$validateInputAutoFund$1 = (AutoTopupSetupV2ViewModel$validateInputAutoFund$1) continuationImpl;
            int i2 = autoTopupSetupV2ViewModel$validateInputAutoFund$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupV2ViewModel$validateInputAutoFund$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupSetupV2ViewModel$validateInputAutoFund$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupV2ViewModel$validateInputAutoFund$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = bVar.Q;
                    u04 u04Var = (u04) bVar.X();
                    autoTopupSetupV2ViewModel$validateInputAutoFund$1.label = 1;
                    c = fVar.c(r24Var, u04Var, autoTopupSetupV2ViewModel$validateInputAutoFund$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a != null) {
                    bVar.D0((dqg) c);
                } else {
                    bVar.o0(gao.e(null, null, a, 3));
                }
                return zy11.a;
            }
        }
        autoTopupSetupV2ViewModel$validateInputAutoFund$1 = new AutoTopupSetupV2ViewModel$validateInputAutoFund$1(bVar, continuationImpl);
        Object obj2 = autoTopupSetupV2ViewModel$validateInputAutoFund$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupV2ViewModel$validateInputAutoFund$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f0(b bVar, s24 s24Var, ContinuationImpl continuationImpl) {
        AutoTopupSetupV2ViewModel$validateInputAutoTopup$1 autoTopupSetupV2ViewModel$validateInputAutoTopup$1;
        int i;
        Object e;
        Throwable a;
        bVar.getClass();
        if (continuationImpl instanceof AutoTopupSetupV2ViewModel$validateInputAutoTopup$1) {
            autoTopupSetupV2ViewModel$validateInputAutoTopup$1 = (AutoTopupSetupV2ViewModel$validateInputAutoTopup$1) continuationImpl;
            int i2 = autoTopupSetupV2ViewModel$validateInputAutoTopup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupV2ViewModel$validateInputAutoTopup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupSetupV2ViewModel$validateInputAutoTopup$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupV2ViewModel$validateInputAutoTopup$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = bVar.Q;
                    u04 u04Var = (u04) bVar.X();
                    autoTopupSetupV2ViewModel$validateInputAutoTopup$1.label = 1;
                    e = fVar.e(s24Var, u04Var, autoTopupSetupV2ViewModel$validateInputAutoTopup$1);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    e = ((Result) obj).getValue();
                }
                a = Result.a(e);
                if (a != null) {
                    bVar.D0((dqg) e);
                } else {
                    bVar.o0(gao.e(null, null, a, 3));
                }
                return zy11.a;
            }
        }
        autoTopupSetupV2ViewModel$validateInputAutoTopup$1 = new AutoTopupSetupV2ViewModel$validateInputAutoTopup$1(bVar, continuationImpl);
        Object obj2 = autoTopupSetupV2ViewModel$validateInputAutoTopup$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupV2ViewModel$validateInputAutoTopup$1.label;
        if (i != 0) {
        }
        a = Result.a(e);
        if (a != null) {
        }
        return zy11.a;
    }

    public static void w0(AutoTopupSettingType autoTopupSettingType) {
        x4c.g("Missing auto topup setting entity", null, "setting=" + autoTopupSettingType, Collections.singletonList(lrp0.d), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A0(List list, ContinuationImpl continuationImpl) {
        AutoTopupSetupV2ViewModel$sendFullScreenSideEffect$1 autoTopupSetupV2ViewModel$sendFullScreenSideEffect$1;
        int i;
        qis qisVar;
        if (continuationImpl instanceof AutoTopupSetupV2ViewModel$sendFullScreenSideEffect$1) {
            autoTopupSetupV2ViewModel$sendFullScreenSideEffect$1 = (AutoTopupSetupV2ViewModel$sendFullScreenSideEffect$1) continuationImpl;
            int i2 = autoTopupSetupV2ViewModel$sendFullScreenSideEffect$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupV2ViewModel$sendFullScreenSideEffect$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupSetupV2ViewModel$sendFullScreenSideEffect$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupV2ViewModel$sendFullScreenSideEffect$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    autoTopupSetupV2ViewModel$sendFullScreenSideEffect$1.label = 1;
                    obj = this.G.a(list, ifp0.b);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                qisVar = (qis) obj;
                if (qisVar != null) {
                    Z(new s04(qisVar));
                }
                return zy11.a;
            }
        }
        autoTopupSetupV2ViewModel$sendFullScreenSideEffect$1 = new AutoTopupSetupV2ViewModel$sendFullScreenSideEffect$1(this, continuationImpl);
        Object obj3 = autoTopupSetupV2ViewModel$sendFullScreenSideEffect$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupV2ViewModel$sendFullScreenSideEffect$1.label;
        if (i != 0) {
        }
        qisVar = (qis) obj3;
        if (qisVar != null) {
        }
        return zy11.a;
    }

    public final void B0(qis qisVar) {
        tje.N(ds31.a(this), null, null, new AutoTopupSetupV2ViewModel$showFullScreen$1(this, qisVar, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C0(ozl0 ozl0Var, boolean z, ContinuationImpl continuationImpl) {
        AutoTopupSetupV2ViewModel$startPolling$1 autoTopupSetupV2ViewModel$startPolling$1;
        int i;
        Object a;
        boolean z2;
        Throwable a2;
        r0 r0Var;
        Object value;
        SettingStatus settingStatus;
        SettingStatus settingStatus2;
        MoneyEntity moneyEntity;
        MoneyEntity moneyEntity2;
        MoneyEntity moneyEntity3;
        ozl0 ozl0Var2 = ozl0Var;
        if (continuationImpl instanceof AutoTopupSetupV2ViewModel$startPolling$1) {
            autoTopupSetupV2ViewModel$startPolling$1 = (AutoTopupSetupV2ViewModel$startPolling$1) continuationImpl;
            int i2 = autoTopupSetupV2ViewModel$startPolling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupV2ViewModel$startPolling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupSetupV2ViewModel$startPolling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupV2ViewModel$startPolling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = ozl0Var2.a;
                    AutoTopupRequestStatusPollingOption autoTopupRequestStatusPollingOption = AutoTopupRequestStatusPollingOption.SHORT;
                    autoTopupSetupV2ViewModel$startPolling$1.L$0 = ozl0Var2;
                    autoTopupSetupV2ViewModel$startPolling$1.label = 1;
                    a = this.F.a(str, z, autoTopupRequestStatusPollingOption, autoTopupSetupV2ViewModel$startPolling$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ozl0Var2 = (ozl0) autoTopupSetupV2ViewModel$startPolling$1.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                z2 = a instanceof Result.Failure;
                m04 m04Var = this.J;
                if (!z2) {
                    dqg dqgVar = (dqg) a;
                    if (dqgVar instanceof cqg) {
                        e24 e24Var = (e24) ((cqg) dqgVar).a;
                        if (e24Var instanceof c24) {
                            o0(gao.e(null, null, null, 7));
                        } else {
                            if (!(e24Var instanceof d24)) {
                                w511.b();
                                return null;
                            }
                            u04 u04Var = (u04) X();
                            String str2 = ozl0Var2.a;
                            r24 r24Var = u04Var.e;
                            z94 z94Var = m04Var.a.e;
                            AutotopupEvents$AutoTopupSettingsSaveResultResult autotopupEvents$AutoTopupSettingsSaveResultResult = AutotopupEvents$AutoTopupSettingsSaveResultResult.OK;
                            s24 s24Var = u04Var.d;
                            String formattedAmount = (s24Var == null || (moneyEntity3 = s24Var.c) == null) ? null : moneyEntity3.getFormattedAmount();
                            String formattedAmount2 = (s24Var == null || (moneyEntity2 = s24Var.d) == null) ? null : moneyEntity2.getFormattedAmount();
                            String formattedAmount3 = (r24Var == null || (moneyEntity = r24Var.b) == null) ? null : moneyEntity.getFormattedAmount();
                            thq0 thq0Var = u04Var.h;
                            z94.g(z94Var, autotopupEvents$AutoTopupSettingsSaveResultResult, null, null, null, h52.b(thq0Var != null ? thq0Var.a : null), null, null, formattedAmount3, formattedAmount, formattedAmount2, (r24Var == null || (settingStatus2 = r24Var.a) == null) ? null : rsa1.d(settingStatus2), (s24Var == null || (settingStatus = s24Var.a) == null) ? null : rsa1.d(settingStatus), str2, AutotopupEvents$AutoTopupSettingsSaveResultVersion.V2, 110);
                            pz40 Y = Y();
                            do {
                                r0Var = (r0) Y;
                                value = r0Var.getValue();
                            } while (!r0Var.k(value, u04.a((u04) value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 30719)));
                            ((sv3) this.C).c(ozl0Var2.b);
                        }
                    } else {
                        if (!(dqgVar instanceof bqg)) {
                            w511.b();
                            return null;
                        }
                        bqg bqgVar = (bqg) dqgVar;
                        String str3 = bqgVar.a;
                        m04Var.y(str3, (u04) X(), ozl0Var2.a);
                        o0(gao.e(g8e.i(Text.Companion, str3), com.ybsdk.core.utils.text.d.f(bqgVar.b), null, 4));
                    }
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    m04Var.y(a2.getMessage(), (u04) X(), ozl0Var2.a);
                    o0(gao.e(null, null, a2, 3));
                }
                return zy11.a;
            }
        }
        autoTopupSetupV2ViewModel$startPolling$1 = new AutoTopupSetupV2ViewModel$startPolling$1(this, continuationImpl);
        Object obj2 = autoTopupSetupV2ViewModel$startPolling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupV2ViewModel$startPolling$1.label;
        if (i != 0) {
        }
        z2 = a instanceof Result.Failure;
        m04 m04Var2 = this.J;
        if (!z2) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        return zy11.a;
    }

    public final void D0(dqg dqgVar) {
        uy21 uy21Var;
        r0 r0Var;
        Object value;
        if (dqgVar instanceof bqg) {
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, u04.a((u04) value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 24575)));
            bqg bqgVar = (bqg) dqgVar;
            o0(gao.e(g8e.i(Text.Companion, bqgVar.a), com.ybsdk.core.utils.text.d.f(bqgVar.b), null, 4));
            return;
        }
        if (!(dqgVar instanceof cqg)) {
            w511.b();
            return;
        }
        uy21 uy21Var2 = (uy21) ((cqg) dqgVar).a;
        pz40 Y2 = Y();
        while (true) {
            r0 r0Var2 = (r0) Y2;
            Object value2 = r0Var2.getValue();
            pz40 pz40Var = Y2;
            u04 a = u04.a((u04) value2, null, null, null, null, null, null, null, null, null, null, null, null, null, uy21Var2, false, 24575);
            uy21Var = uy21Var2;
            if (r0Var2.k(value2, a)) {
                break;
            }
            Y2 = pz40Var;
            uy21Var2 = uy21Var;
        }
        n0t0 n0t0Var = uy21Var.a;
        if (n0t0Var != null) {
            o0(n0t0Var);
        }
    }

    public final void g0(thq0 thq0Var) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, u04.a((u04) value, null, null, null, null, null, null, new ru3(thq0Var), null, null, null, null, null, null, null, false, 32703)));
    }

    public final void h0() {
        r0 r0Var;
        Object value;
        su3 su3Var = ((u04) X()).g;
        boolean z = su3Var instanceof nu3;
        m04 m04Var = this.J;
        if (z) {
            m04Var.a.e.a("BACK", AutotopupEvents$AutoTopupSettingsBackSaveVersion.V2);
        } else if (su3Var instanceof ru3) {
            z94 z94Var = m04Var.a.e;
            AutotopupEvents$AutoTopupSettingsAccountBottomSheetCloseVersion autotopupEvents$AutoTopupSettingsAccountBottomSheetCloseVersion = AutotopupEvents$AutoTopupSettingsAccountBottomSheetCloseVersion.V2;
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            linkedHashMap.put("version", autotopupEvents$AutoTopupSettingsAccountBottomSheetCloseVersion.getOriginalValue());
            z94Var.a.a("auto_topup.settings.account.bottom_sheet.close", linkedHashMap);
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, u04.a((u04) value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 32703)));
    }

    public final void i0(boolean z) {
        this.K = false;
        pzt0 pzt0Var = this.M;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.M = tje.N(ds31.a(this), null, null, new AutoTopupSetupV2ViewModel$loadData$1(this, z, null), 3);
    }

    public final void j0(String str) {
        r0 r0Var;
        Object value;
        su3 su3Var = ((u04) X()).g;
        mu3 mu3Var = su3Var instanceof mu3 ? (mu3) su3Var : null;
        if (mu3Var == null || ((n04) ((u04) X()).a.a()) == null) {
            return;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, u04.a((u04) value, null, null, null, null, null, null, mu3.a(mu3Var, new ou3(str, false), null, AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput.AMOUNT, 2), null, null, null, null, null, null, null, false, 32703)));
    }

    public final void k0() {
        r0 r0Var;
        Object value;
        h5a0 h5a0Var;
        z94 z94Var = this.J.a.e;
        AutotopupEvents$AutoTopupSettingsExitVersion autotopupEvents$AutoTopupSettingsExitVersion = AutotopupEvents$AutoTopupSettingsExitVersion.V2;
        boolean z = true;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("version", autotopupEvents$AutoTopupSettingsExitVersion.getOriginalValue());
        z94Var.a.a("auto_topup.settings.exit", linkedHashMap);
        u04 u04Var = (u04) X();
        thq0 thq0Var = u04Var.h;
        String str = null;
        if ((thq0Var != null ? thq0Var.a : null) != null) {
            r24 r24Var = u04Var.e;
            SettingStatus settingStatus = r24Var != null ? r24Var.a : null;
            SettingStatus settingStatus2 = SettingStatus.ENABLED;
            boolean z2 = false;
            boolean z3 = settingStatus == settingStatus2;
            s24 s24Var = u04Var.d;
            boolean z4 = (s24Var != null ? s24Var.a : null) == settingStatus2;
            if (!z3 && !z4) {
                z2 = true;
            }
            if (!z2) {
                if (z2) {
                    w511.b();
                    return;
                }
                String id = thq0Var.a.getId();
                n04 n04Var = (n04) u04Var.a.a();
                if (n04Var != null && (h5a0Var = n04Var.g) != null) {
                    str = h5a0Var.getId();
                }
                z = jl40.l(id, str);
            }
            if ((!n2b1.j(u04Var) || !z) && !((u04) X()).o) {
                pz40 Y = Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, u04.a((u04) value, null, null, null, null, null, null, nu3.a, null, null, null, null, null, null, null, false, 32703)));
                return;
            }
        }
        this.I.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l0() {
        h5a0 h5a0Var;
        Object obj;
        su3 su3Var = ((u04) X()).g;
        boolean z = su3Var instanceof ru3;
        m04 m04Var = this.J;
        if (z) {
            thq0 thq0Var = ((ru3) su3Var).a;
            if (thq0Var == null) {
                return;
            }
            h5a0 h5a0Var2 = thq0Var.a;
            z94 z94Var = m04Var.a.e;
            Map b = h52.b(h5a0Var2);
            AutotopupEvents$AutoTopupSettingsAccountBottomSheetClickVersion autotopupEvents$AutoTopupSettingsAccountBottomSheetClickVersion = AutotopupEvents$AutoTopupSettingsAccountBottomSheetClickVersion.V2;
            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
            linkedHashMap.put("payment_method", b);
            linkedHashMap.put("version", autotopupEvents$AutoTopupSettingsAccountBottomSheetClickVersion.getOriginalValue());
            z94Var.a.a("auto_topup.settings.account.bottom_sheet.click", linkedHashMap);
            if (!thq0Var.equals(((u04) X()).h)) {
                z0(h5a0Var2);
            }
            h0();
            return;
        }
        if (!(su3Var instanceof pu3)) {
            if (su3Var instanceof mu3) {
                mu3 mu3Var = (mu3) su3Var;
                m04Var.a.e.i("autotopup", mu3Var.b.a, mu3Var.a.a, "save", AutotopupEvents$AutoTopupSettingsShortCutLimitsClickVersion.V2);
                pzt0 pzt0Var = this.O;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                this.O = tje.N(ds31.a(this), null, null, new AutoTopupSetupV2ViewModel$saveAutoTopupSetting$1(this, mu3Var, null), 3);
                return;
            }
            if (su3Var instanceof lu3) {
                lu3 lu3Var = (lu3) su3Var;
                z94.j(m04Var.a.e, "autofund", lu3Var.a.a, "save", AutotopupEvents$AutoTopupSettingsShortCutLimitsClickVersion.V2, 4);
                pzt0 pzt0Var2 = this.O;
                if (pzt0Var2 != null) {
                    pzt0Var2.a(null);
                }
                this.O = tje.N(ds31.a(this), null, null, new AutoTopupSetupV2ViewModel$saveAutoFundSetting$1(this, lu3Var, null), 3);
                return;
            }
            if (su3Var instanceof nu3) {
                h0();
                n04 n04Var = (n04) ((u04) X()).a.a();
                x0("ConfirmSaveBeforeExitBottomSheet action in primaryButton is null", n04Var != null ? n04Var.i.c.b : null);
                return;
            } else if (su3Var instanceof qu3) {
                h0();
                sv3 sv3Var = (sv3) this.C;
                sv3Var.d.h(sv3Var.e.d(SettingsOpeningSource.MENU));
                return;
            } else {
                if (su3Var == null) {
                    return;
                }
                w511.b();
                return;
            }
        }
        pu3 pu3Var = (pu3) su3Var;
        iaa0 iaa0Var = ((u04) X()).i;
        List list = iaa0Var != null ? iaa0Var.b.a : null;
        thq0 thq0Var2 = pu3Var.a;
        h5a0 h5a0Var3 = thq0Var2 != null ? thq0Var2.a : null;
        if ((h5a0Var3 instanceof f5a0 ? (f5a0) h5a0Var3 : null) == null) {
            g0(((u04) X()).h);
            return;
        }
        if (!jl40.l(h5a0Var3, ((u04) X()).h)) {
            f5a0 f5a0Var = (f5a0) h5a0Var3;
            z0(f5a0Var);
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((h5a0) obj) instanceof f5a0) {
                            break;
                        }
                    }
                }
                h5a0Var = (h5a0) obj;
            } else {
                h5a0Var = null;
            }
            ArrayList arrayList = list != null ? new ArrayList(list) : null;
            if (list != null && h5a0Var != null) {
                if (arrayList != null) {
                    Iterator it2 = arrayList.iterator();
                    int i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i = -1;
                            break;
                        } else if (((h5a0) it2.next()) instanceof f5a0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i != -1) {
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        arrayList2.set(i, f5a0Var);
                        r3 = arrayList2;
                    }
                }
                if (r3 != null) {
                    a0(new v5(27, this, r3));
                }
            } else if (arrayList != null) {
                arrayList.add(f5a0Var);
            }
            r3 = arrayList;
            if (r3 != null) {
            }
        }
        h0();
    }

    public final void m0() {
        dv3 dv3Var;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        su3 su3Var = ((u04) X()).g;
        boolean z = su3Var instanceof mu3;
        m04 m04Var = this.J;
        if (z) {
            z94.j(m04Var.a.e, "autotopup", null, "off", AutotopupEvents$AutoTopupSettingsShortCutLimitsClickVersion.V2, 6);
            n04 n04Var = (n04) ((u04) X()).a.a();
            if (n04Var != null) {
                b24 b24Var = n04Var.e;
                pz40 Y = Y();
                do {
                    r0Var2 = (r0) Y;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, u04.a((u04) value2, null, null, null, s24.a(z1b1.g(b24Var), SettingStatus.DISABLED), null, null, null, null, null, null, null, null, null, null, false, 32759)));
            }
        } else {
            List list = null;
            if (su3Var instanceof lu3) {
                z94.j(m04Var.a.e, "autofund", null, "off", AutotopupEvents$AutoTopupSettingsShortCutLimitsClickVersion.V2, 6);
                n04 n04Var2 = (n04) ((u04) X()).a.a();
                if (n04Var2 != null) {
                    nr3 nr3Var = n04Var2.f;
                    pz40 Y2 = Y();
                    do {
                        r0Var = (r0) Y2;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, u04.a((u04) value, null, null, null, null, r24.a(z1b1.f(nr3Var), SettingStatus.DISABLED, null, 2), null, null, null, null, null, null, null, null, null, false, 32751)));
                }
            } else if (jl40.l(su3Var, nu3.a)) {
                h0();
                n04 n04Var3 = (n04) ((u04) X()).a.a();
                if (n04Var3 != null && (dv3Var = n04Var3.i.d) != null) {
                    list = dv3Var.b;
                }
                x0("ConfirmSaveBeforeExitBottomSheet action in secondaryButton is null", list);
            } else if (!(su3Var instanceof ru3) && !(su3Var instanceof pu3) && !jl40.l(su3Var, qu3.a) && su3Var != null) {
                w511.b();
                return;
            }
        }
        h0();
    }

    public final boolean n0(Uri uri) {
        if (((u04) X()).o) {
            return false;
        }
        z2z c = ((sv3) this.C).a.c(uri.toString());
        return c.b || (c.a instanceof v0h);
    }

    public final void o0(n0t0 n0t0Var) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, u04.a((u04) value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 14335)));
        Z(new t04(n0t0Var));
    }

    public final void p0(String str) {
        r0 r0Var;
        Object value;
        su3 su3Var = ((u04) X()).g;
        if ((su3Var instanceof lu3 ? (lu3) su3Var : null) == null || ((n04) ((u04) X()).a.a()) == null) {
            return;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, u04.a((u04) value, null, null, null, null, null, null, new lu3(new ou3(str, false)), null, null, null, null, null, null, null, false, 32703)));
    }

    public final void q0(Bundle bundle) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        this.L = false;
        TwoFactorAuthResult a = ((vv3) this.H).a(bundle);
        if (jl40.l(a, TwoFactorAuthResult.Cancel.INSTANCE)) {
            pz40 Y = Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, u04.a((u04) value2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 14335)));
            return;
        }
        if (!(a instanceof TwoFactorAuthResult.Success)) {
            w511.b();
            return;
        }
        AutoTopupApiVersion autoTopupApiVersion = ((u04) X()).m;
        if (autoTopupApiVersion == null) {
            pz40 Y2 = Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
            } while (!r0Var.k(value, u04.a((u04) value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 16383)));
            return;
        }
        String verificationToken = ((TwoFactorAuthResult.Success) a).getVerificationToken();
        pzt0 pzt0Var = this.N;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.N = tje.N(ds31.a(this), null, null, new AutoTopupSetupV2ViewModel$saveSettings$1(this, verificationToken, autoTopupApiVersion, null), 3);
    }

    public final void r0() {
        if (this.L) {
            i0(this.K);
        }
        this.L = false;
    }

    public final void s0() {
        String id;
        h5a0 h5a0Var;
        iaa0 iaa0Var = ((u04) X()).i;
        thq0 thq0Var = ((u04) X()).h;
        z94 z94Var = this.J.a.e;
        uda0 uda0Var = iaa0Var != null ? iaa0Var.b : null;
        String id2 = (thq0Var == null || (h5a0Var = thq0Var.a) == null) ? null : h5a0Var.getId();
        JSONArray jSONArray = new JSONArray();
        List list = uda0Var != null ? uda0Var.a : null;
        if (list == null || list.isEmpty()) {
            new JSONObject().put("label", "new_account");
        } else {
            for (h5a0 h5a0Var2 : uda0Var.a) {
                JSONObject jSONObject = new JSONObject();
                if (h5a0Var2 instanceof f5a0) {
                    id = ((f5a0) h5a0Var2).e;
                } else {
                    if (!(h5a0Var2 instanceof e5a0) && !(h5a0Var2 instanceof g5a0) && !(h5a0Var2 instanceof c5a0)) {
                        w511.b();
                        return;
                    }
                    id = h5a0Var2.getId();
                }
                jSONObject.put("label", id);
                jSONObject.put("is_default", jl40.l(h5a0Var2.getId(), id2));
                jSONArray.put(jSONObject);
            }
        }
        String jSONArray2 = jSONArray.toString();
        AutotopupEvents$AutoTopupSettingsAccountBottomSheetShowVersion autotopupEvents$AutoTopupSettingsAccountBottomSheetShowVersion = AutotopupEvents$AutoTopupSettingsAccountBottomSheetShowVersion.V2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        byte[] bArr = y5e.n;
        byte[] bArr2 = new byte[5];
        for (int i = 0; i < 5; i++) {
            bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
        }
        linkedHashMap.put(new String(bArr2, uza.a), jSONArray2);
        linkedHashMap.put("version", autotopupEvents$AutoTopupSettingsAccountBottomSheetShowVersion.getOriginalValue());
        z94Var.a.a("auto_topup.settings.account.bottom_sheet.show", linkedHashMap);
    }

    public final void t0(String str) {
        r0 r0Var;
        Object value;
        su3 su3Var = ((u04) X()).g;
        mu3 mu3Var = su3Var instanceof mu3 ? (mu3) su3Var : null;
        if (mu3Var == null || ((n04) ((u04) X()).a.a()) == null) {
            return;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, u04.a((u04) value, null, null, null, null, null, null, mu3.a(mu3Var, null, new ou3(str, false), AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput.THRESHOLD, 1), null, null, null, null, null, null, null, false, 32703)));
    }

    public final void u0(Lifecycle lifecycle) {
        this.L = true;
        ((sv3) this.C).a(lifecycle);
    }

    public final void v0(thq0 thq0Var) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, u04.a((u04) value, null, null, null, null, null, null, new pu3(thq0Var), null, null, null, null, null, null, null, false, 32703)));
    }

    public final void x0(String str, List list) {
        if (list == null || list.isEmpty()) {
            x4c.g("Error getting a deeplink when clicking", null, str, Collections.singletonList(lrp0.d), 2);
            Z(new t04(gao.e(null, null, null, 7)));
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((sv3) this.C).c((String) it.next());
            }
        }
    }

    public final void y0() {
        g0(((u04) X()).h);
    }

    public final void z0(h5a0 h5a0Var) {
        r0 r0Var;
        Object value;
        if (h5a0Var != null) {
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, u04.a((u04) value, null, null, null, null, null, null, null, new thq0(h5a0Var), null, null, null, null, null, null, false, 32639)));
        }
    }
}
