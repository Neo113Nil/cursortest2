package com.ybsdk.feature.autotopup.internal.domain;

import com.ybsdk.core.utils.poller.PollerTimeoutException;
import com.ybsdk.feature.autotopup.api.AutoTopupShowOnly;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoTopupTypeRequestDto;
import com.ybsdk.feature.autotopup.internal.network.dto.SaveAutoTopupRequest;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSettingsV2ShowOnly;
import defpackage.b04;
import defpackage.d6v;
import defpackage.dqg;
import defpackage.dzd0;
import defpackage.ny61;
import defpackage.nzl0;
import defpackage.tv3;
import defpackage.w511;
import defpackage.wls;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class e {
    public final com.ybsdk.feature.autotopup.internal.data.b a;
    public final com.ybsdk.utils.poller.b b;
    public final tv3 c;
    public volatile dqg d;

    public e(com.ybsdk.feature.autotopup.internal.data.b bVar, com.ybsdk.utils.poller.b bVar2, tv3 tv3Var) {
        this.a = bVar;
        this.b = bVar2;
        this.c = tv3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, AutoTopupType autoTopupType, BigDecimal bigDecimal, BigDecimal bigDecimal2, ContinuationImpl continuationImpl) {
        AutoTopupSetupInteractor$getAutoTopupData$1 autoTopupSetupInteractor$getAutoTopupData$1;
        int i;
        if (continuationImpl instanceof AutoTopupSetupInteractor$getAutoTopupData$1) {
            autoTopupSetupInteractor$getAutoTopupData$1 = (AutoTopupSetupInteractor$getAutoTopupData$1) continuationImpl;
            int i2 = autoTopupSetupInteractor$getAutoTopupData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupInteractor$getAutoTopupData$1.label = i2 - Integer.MIN_VALUE;
                AutoTopupSetupInteractor$getAutoTopupData$1 autoTopupSetupInteractor$getAutoTopupData$12 = autoTopupSetupInteractor$getAutoTopupData$1;
                Object obj = autoTopupSetupInteractor$getAutoTopupData$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupInteractor$getAutoTopupData$12.label;
                AutoTopupTypeRequestDto autoTopupTypeRequestDto = null;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                int i3 = autoTopupType == null ? -1 : b04.a[autoTopupType.ordinal()];
                if (i3 != -1) {
                    if (i3 == 1) {
                        autoTopupTypeRequestDto = AutoTopupTypeRequestDto.BALANCE_THRESHOLD;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        autoTopupTypeRequestDto = AutoTopupTypeRequestDto.UP_TO_BALANCE;
                    }
                }
                autoTopupSetupInteractor$getAutoTopupData$12.label = 1;
                Object b = this.a.b(autoTopupTypeRequestDto, str, str2, bigDecimal, bigDecimal2, autoTopupSetupInteractor$getAutoTopupData$12);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        autoTopupSetupInteractor$getAutoTopupData$1 = new AutoTopupSetupInteractor$getAutoTopupData$1(this, continuationImpl);
        AutoTopupSetupInteractor$getAutoTopupData$1 autoTopupSetupInteractor$getAutoTopupData$122 = autoTopupSetupInteractor$getAutoTopupData$1;
        Object obj2 = autoTopupSetupInteractor$getAutoTopupData$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupInteractor$getAutoTopupData$122.label;
        AutoTopupTypeRequestDto autoTopupTypeRequestDto2 = null;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, AutoTopupShowOnly autoTopupShowOnly, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Map map, ContinuationImpl continuationImpl) {
        AutoTopupSetupInteractor$getAutoTopupDataV2$1 autoTopupSetupInteractor$getAutoTopupDataV2$1;
        int i;
        AutoTopupSettingsV2ShowOnly autoTopupSettingsV2ShowOnly;
        if (continuationImpl instanceof AutoTopupSetupInteractor$getAutoTopupDataV2$1) {
            autoTopupSetupInteractor$getAutoTopupDataV2$1 = (AutoTopupSetupInteractor$getAutoTopupDataV2$1) continuationImpl;
            int i2 = autoTopupSetupInteractor$getAutoTopupDataV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupInteractor$getAutoTopupDataV2$1.label = i2 - Integer.MIN_VALUE;
                AutoTopupSetupInteractor$getAutoTopupDataV2$1 autoTopupSetupInteractor$getAutoTopupDataV2$12 = autoTopupSetupInteractor$getAutoTopupDataV2$1;
                Object obj = autoTopupSetupInteractor$getAutoTopupDataV2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupInteractor$getAutoTopupDataV2$12.label;
                AutoTopupSettingsV2ShowOnly autoTopupSettingsV2ShowOnly2 = null;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (autoTopupShowOnly != null) {
                    int i3 = b04.b[autoTopupShowOnly.ordinal()];
                    if (i3 == 1) {
                        autoTopupSettingsV2ShowOnly = AutoTopupSettingsV2ShowOnly.AT;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        autoTopupSettingsV2ShowOnly = AutoTopupSettingsV2ShowOnly.AF;
                    }
                    autoTopupSettingsV2ShowOnly2 = autoTopupSettingsV2ShowOnly;
                }
                autoTopupSetupInteractor$getAutoTopupDataV2$12.label = 1;
                Object c = this.a.c(str, autoTopupSettingsV2ShowOnly2, str2, str3, bigDecimal, bigDecimal2, bigDecimal3, map, autoTopupSetupInteractor$getAutoTopupDataV2$12);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        autoTopupSetupInteractor$getAutoTopupDataV2$1 = new AutoTopupSetupInteractor$getAutoTopupDataV2$1(this, continuationImpl);
        AutoTopupSetupInteractor$getAutoTopupDataV2$1 autoTopupSetupInteractor$getAutoTopupDataV2$122 = autoTopupSetupInteractor$getAutoTopupDataV2$1;
        Object obj2 = autoTopupSetupInteractor$getAutoTopupDataV2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupInteractor$getAutoTopupDataV2$122.label;
        AutoTopupSettingsV2ShowOnly autoTopupSettingsV2ShowOnly22 = null;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, String str3, boolean z, ContinuationImpl continuationImpl) {
        AutoTopupSetupInteractor$getAutotopupPaymentStatus$1 autoTopupSetupInteractor$getAutotopupPaymentStatus$1;
        int i;
        Object e;
        if (continuationImpl instanceof AutoTopupSetupInteractor$getAutotopupPaymentStatus$1) {
            autoTopupSetupInteractor$getAutotopupPaymentStatus$1 = (AutoTopupSetupInteractor$getAutotopupPaymentStatus$1) continuationImpl;
            int i2 = autoTopupSetupInteractor$getAutotopupPaymentStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupInteractor$getAutotopupPaymentStatus$1.label = i2 - Integer.MIN_VALUE;
                AutoTopupSetupInteractor$getAutotopupPaymentStatus$1 autoTopupSetupInteractor$getAutotopupPaymentStatus$12 = autoTopupSetupInteractor$getAutotopupPaymentStatus$1;
                Object obj = autoTopupSetupInteractor$getAutotopupPaymentStatus$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupInteractor$getAutotopupPaymentStatus$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.utils.poller.c c = this.b.c(dzd0.b, new AutoTopupSetupInteractor$getAutotopupPaymentStatus$2(2, null), new AutoTopupSetupInteractor$getAutotopupPaymentStatus$3(this, str, str2, str3, z, null));
                    autoTopupSetupInteractor$getAutotopupPaymentStatus$12.label = 1;
                    e = c.e(autoTopupSetupInteractor$getAutotopupPaymentStatus$12);
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
                dqg dqgVar = this.d;
                return ((Result.a(e) instanceof PollerTimeoutException) || dqgVar == null) ? e : dqgVar;
            }
        }
        autoTopupSetupInteractor$getAutotopupPaymentStatus$1 = new AutoTopupSetupInteractor$getAutotopupPaymentStatus$1(this, continuationImpl);
        AutoTopupSetupInteractor$getAutotopupPaymentStatus$1 autoTopupSetupInteractor$getAutotopupPaymentStatus$122 = autoTopupSetupInteractor$getAutotopupPaymentStatus$1;
        Object obj2 = autoTopupSetupInteractor$getAutotopupPaymentStatus$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupInteractor$getAutotopupPaymentStatus$122.label;
        if (i != 0) {
        }
        dqg dqgVar2 = this.d;
        if (Result.a(e) instanceof PollerTimeoutException) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, d6v d6vVar, boolean z, ContinuationImpl continuationImpl) {
        AutoTopupSetupInteractor$retryAutotopupPayment$1 autoTopupSetupInteractor$retryAutotopupPayment$1;
        int i;
        if (continuationImpl instanceof AutoTopupSetupInteractor$retryAutotopupPayment$1) {
            autoTopupSetupInteractor$retryAutotopupPayment$1 = (AutoTopupSetupInteractor$retryAutotopupPayment$1) continuationImpl;
            int i2 = autoTopupSetupInteractor$retryAutotopupPayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupInteractor$retryAutotopupPayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupSetupInteractor$retryAutotopupPayment$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupInteractor$retryAutotopupPayment$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                wls autoTopupSetupInteractor$retryAutotopupPayment$2 = new AutoTopupSetupInteractor$retryAutotopupPayment$2(this, str, str2, z, null);
                autoTopupSetupInteractor$retryAutotopupPayment$1.label = 1;
                Object O = d6vVar.O(autoTopupSetupInteractor$retryAutotopupPayment$2, str2, autoTopupSetupInteractor$retryAutotopupPayment$1);
                return O == obj2 ? obj2 : O;
            }
        }
        autoTopupSetupInteractor$retryAutotopupPayment$1 = new AutoTopupSetupInteractor$retryAutotopupPayment$1(this, continuationImpl);
        Object obj3 = autoTopupSetupInteractor$retryAutotopupPayment$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupInteractor$retryAutotopupPayment$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(d6v d6vVar, SaveAutoTopupRequest saveAutoTopupRequest, ContinuationImpl continuationImpl) {
        AutoTopupSetupInteractor$saveAutoTopup$3 autoTopupSetupInteractor$saveAutoTopup$3;
        int i;
        if (continuationImpl instanceof AutoTopupSetupInteractor$saveAutoTopup$3) {
            autoTopupSetupInteractor$saveAutoTopup$3 = (AutoTopupSetupInteractor$saveAutoTopup$3) continuationImpl;
            int i2 = autoTopupSetupInteractor$saveAutoTopup$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupInteractor$saveAutoTopup$3.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupSetupInteractor$saveAutoTopup$3.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupInteractor$saveAutoTopup$3.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                this.a.getClass();
                wls autoTopupSetupInteractor$saveAutoTopup$4 = new AutoTopupSetupInteractor$saveAutoTopup$4(this, null, null, saveAutoTopupRequest, null);
                autoTopupSetupInteractor$saveAutoTopup$3.label = 1;
                Object O = d6vVar.O(autoTopupSetupInteractor$saveAutoTopup$4, "autotopup_default_id", autoTopupSetupInteractor$saveAutoTopup$3);
                return O == obj2 ? obj2 : O;
            }
        }
        autoTopupSetupInteractor$saveAutoTopup$3 = new AutoTopupSetupInteractor$saveAutoTopup$3(this, continuationImpl);
        Object obj3 = autoTopupSetupInteractor$saveAutoTopup$3.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupInteractor$saveAutoTopup$3.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, nzl0 nzl0Var, d6v d6vVar, String str2, String str3, ContinuationImpl continuationImpl) {
        AutoTopupSetupInteractor$saveAutoTopup$1 autoTopupSetupInteractor$saveAutoTopup$1;
        int i;
        Object obj;
        if (continuationImpl instanceof AutoTopupSetupInteractor$saveAutoTopup$1) {
            autoTopupSetupInteractor$saveAutoTopup$1 = (AutoTopupSetupInteractor$saveAutoTopup$1) continuationImpl;
            int i2 = autoTopupSetupInteractor$saveAutoTopup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupInteractor$saveAutoTopup$1.label = i2 - Integer.MIN_VALUE;
                AutoTopupSetupInteractor$saveAutoTopup$1 autoTopupSetupInteractor$saveAutoTopup$12 = autoTopupSetupInteractor$saveAutoTopup$1;
                Object obj2 = autoTopupSetupInteractor$saveAutoTopup$12.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupInteractor$saveAutoTopup$12.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj2);
                        return ((Result) obj2).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj2);
                if (str == null) {
                    this.a.getClass();
                    obj = "autotopup_default_id";
                } else {
                    obj = str;
                }
                wls autoTopupSetupInteractor$saveAutoTopup$2 = new AutoTopupSetupInteractor$saveAutoTopup$2(this, str3, str2, str, nzl0Var, null);
                autoTopupSetupInteractor$saveAutoTopup$12.label = 1;
                Object O = d6vVar.O(autoTopupSetupInteractor$saveAutoTopup$2, obj, autoTopupSetupInteractor$saveAutoTopup$12);
                return O == obj3 ? obj3 : O;
            }
        }
        autoTopupSetupInteractor$saveAutoTopup$1 = new AutoTopupSetupInteractor$saveAutoTopup$1(this, continuationImpl);
        AutoTopupSetupInteractor$saveAutoTopup$1 autoTopupSetupInteractor$saveAutoTopup$122 = autoTopupSetupInteractor$saveAutoTopup$1;
        Object obj22 = autoTopupSetupInteractor$saveAutoTopup$122.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupInteractor$saveAutoTopup$122.label;
        if (i == 0) {
        }
    }
}
