package com.ybsdk.feature.pin.internal;

import androidx.fragment.app.Fragment;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.common.repositiories.auth.g;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.PinEvents$PinStateNeedAskForPinResultResult;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.pin.api.PinRemoteConfigStatus;
import com.ybsdk.feature.pin.internal.domain.b;
import com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinFragment;
import com.ybsdk.feature.pin.internal.screens.checkpin.CheckType;
import com.ybsdk.feature.pinstorage.internal.data.c;
import defpackage.di51;
import defpackage.dnz0;
import defpackage.em3;
import defpackage.kcs;
import defpackage.lz70;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.tc9;
import defpackage.ux5;
import defpackage.ycp0;
import defpackage.yj70;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a implements kcs {
    public final /* synthetic */ tc9 a;
    public final ycp0 b;
    public final c c;
    public final PinRemoteConfigStatus d;
    public final ux5 e;
    public final yj70 f;
    public final lz70 g;
    public final AppAnalyticsReporter h;
    public final b i;

    public a(ycp0 ycp0Var, c cVar, PinRemoteConfigStatus pinRemoteConfigStatus, ux5 ux5Var, yj70 yj70Var, lz70 lz70Var, AppAnalyticsReporter appAnalyticsReporter, b bVar, Map map) {
        this.a = new tc9(map, 10);
        this.b = ycp0Var;
        this.c = cVar;
        this.d = pinRemoteConfigStatus;
        this.e = ux5Var;
        this.f = yj70Var;
        this.g = lz70Var;
        this.h = appAnalyticsReporter;
        this.i = bVar;
    }

    @Override // defpackage.kcs
    public final Fragment a(String str) {
        return this.a.a(str);
    }

    public final FragmentScreen b(String str, boolean z) {
        return new FragmentScreen("CheckPinCodeEnterScreen", false, new CheckPinFragment.CheckPinScreenParams(CheckType.ENTER, str, z), null, qoi0.a(CheckPinFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r6.c.t(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        PinFeatureImpl$disableBiometric$1 pinFeatureImpl$disableBiometric$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object A;
        if (continuationImpl instanceof PinFeatureImpl$disableBiometric$1) {
            pinFeatureImpl$disableBiometric$1 = (PinFeatureImpl$disableBiometric$1) continuationImpl;
            int i2 = pinFeatureImpl$disableBiometric$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinFeatureImpl$disableBiometric$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinFeatureImpl$disableBiometric$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinFeatureImpl$disableBiometric$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pinFeatureImpl$disableBiometric$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                pinFeatureImpl$disableBiometric$1.label = 2;
                A = this.i.b.A(Integer.MAX_VALUE, pinFeatureImpl$disableBiometric$1);
                if (A != coroutineSingletons) {
                    A = zy11Var;
                }
                if (A != coroutineSingletons) {
                    A = zy11Var;
                }
                return A != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        pinFeatureImpl$disableBiometric$1 = new PinFeatureImpl$disableBiometric$1(this, continuationImpl);
        Object obj2 = pinFeatureImpl$disableBiometric$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinFeatureImpl$disableBiometric$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        pinFeatureImpl$disableBiometric$1.label = 2;
        A = this.i.b.A(Integer.MAX_VALUE, pinFeatureImpl$disableBiometric$1);
        if (A != coroutineSingletons) {
        }
        if (A != coroutineSingletons) {
        }
        if (A != coroutineSingletons) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        PinFeatureImpl$isPinSettingsEnabled$1 pinFeatureImpl$isPinSettingsEnabled$1;
        Object obj;
        int i;
        if (continuationImpl instanceof PinFeatureImpl$isPinSettingsEnabled$1) {
            pinFeatureImpl$isPinSettingsEnabled$1 = (PinFeatureImpl$isPinSettingsEnabled$1) continuationImpl;
            int i2 = pinFeatureImpl$isPinSettingsEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinFeatureImpl$isPinSettingsEnabled$1.label = i2 - Integer.MIN_VALUE;
                obj = pinFeatureImpl$isPinSettingsEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinFeatureImpl$isPinSettingsEnabled$1.label;
                c cVar = this.c;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (this.d != PinRemoteConfigStatus.ENABLE) {
                        pinFeatureImpl$isPinSettingsEnabled$1.label = 1;
                        obj = cVar.l(pinFeatureImpl$isPinSettingsEnabled$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return Boolean.valueOf(z);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue() || !cVar.h()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        pinFeatureImpl$isPinSettingsEnabled$1 = new PinFeatureImpl$isPinSettingsEnabled$1(this, continuationImpl);
        obj = pinFeatureImpl$isPinSettingsEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinFeatureImpl$isPinSettingsEnabled$1.label;
        c cVar2 = this.c;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cd, code lost:
    
        if (r6.h() != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        PinFeatureImpl$needToEnterPin$1 pinFeatureImpl$needToEnterPin$1;
        int i;
        PinEvents$PinStateNeedAskForPinResultResult pinEvents$PinStateNeedAskForPinResultResult;
        g gVar = (g) this.f.a;
        di51 di51Var = (di51) this.g.b;
        if (continuationImpl instanceof PinFeatureImpl$needToEnterPin$1) {
            pinFeatureImpl$needToEnterPin$1 = (PinFeatureImpl$needToEnterPin$1) continuationImpl;
            int i2 = pinFeatureImpl$needToEnterPin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinFeatureImpl$needToEnterPin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinFeatureImpl$needToEnterPin$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinFeatureImpl$needToEnterPin$1.label;
                c cVar = this.c;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pinFeatureImpl$needToEnterPin$1.label = 1;
                    obj = cVar.l(pinFeatureImpl$needToEnterPin$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (((Long) di51Var.m().getValue()) != null) {
                    pinEvents$PinStateNeedAskForPinResultResult = PinEvents$PinStateNeedAskForPinResultResult.USER_UID_ERROR;
                } else if (booleanValue) {
                    dnz0 dnz0Var = (dnz0) gVar.f.get();
                    String str = dnz0Var != null ? dnz0Var.a : null;
                    if (!gVar.b()) {
                        str = null;
                    }
                    pinEvents$PinStateNeedAskForPinResultResult = str != null ? PinEvents$PinStateNeedAskForPinResultResult.HAS_CACHED_PIN : !cVar.h() ? PinEvents$PinStateNeedAskForPinResultResult.SHOULD_ASK_FOR_PIN_FALSE : PinEvents$PinStateNeedAskForPinResultResult.OK;
                } else {
                    pinEvents$PinStateNeedAskForPinResultResult = PinEvents$PinStateNeedAskForPinResultResult.NO_PIN;
                }
                em3 em3Var = this.h.S;
                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, pinEvents$PinStateNeedAskForPinResultResult.getOriginalValue());
                em3Var.a.a("pin_state.need_ask_for_pin_result", linkedHashMap);
                if (((Long) di51Var.m().getValue()) != null) {
                    return Boolean.FALSE;
                }
                if (booleanValue) {
                    dnz0 dnz0Var2 = (dnz0) gVar.f.get();
                    if ((gVar.b() ? dnz0Var2 != null ? dnz0Var2.a : null : null) == null) {
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        pinFeatureImpl$needToEnterPin$1 = new PinFeatureImpl$needToEnterPin$1(this, continuationImpl);
        Object obj2 = pinFeatureImpl$needToEnterPin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinFeatureImpl$needToEnterPin$1.label;
        c cVar2 = this.c;
        boolean z2 = true;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        if (((Long) di51Var.m().getValue()) != null) {
        }
        em3 em3Var2 = this.h.S;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
        linkedHashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, pinEvents$PinStateNeedAskForPinResultResult.getOriginalValue());
        em3Var2.a.a("pin_state.need_ask_for_pin_result", linkedHashMap2);
        if (((Long) di51Var.m().getValue()) != null) {
        }
    }
}
