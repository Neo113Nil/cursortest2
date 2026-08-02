package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.autotopup.api.dto.AutoTopupType;
import com.ybsdk.feature.autotopup.api.dto.PaymentMethodInfoDto;
import com.ybsdk.feature.autotopup.internal.network.AutoTopupApi;
import com.ybsdk.feature.autotopup.internal.network.dto.CreateAutoTopupRequest;
import com.ybsdk.feature.autotopup.internal.network.dto.CreateAutoTopupResponse;
import com.ybsdk.feature.autotopup.internal.network.dto.UpdateAutoTopupResponse;
import defpackage.bu3;
import defpackage.cu3;
import defpackage.du3;
import defpackage.mw3;
import defpackage.ny61;
import defpackage.w511;
import defpackage.y1b1;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final AutoTopupApi a;

    public a(AutoTopupApi autoTopupApi) {
        this.a = autoTopupApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(mw3 mw3Var, String str, ContinuationImpl continuationImpl) {
        AutoTopupRepository$createAutoTopup$1 autoTopupRepository$createAutoTopup$1;
        int i;
        CreateAutoTopupRequest createAutoTopupRequest;
        AutoTopupType autoTopupType;
        Object c;
        PaymentMethodInfoDto paymentMethodInfoDto;
        if (continuationImpl instanceof AutoTopupRepository$createAutoTopup$1) {
            autoTopupRepository$createAutoTopup$1 = (AutoTopupRepository$createAutoTopup$1) continuationImpl;
            int i2 = autoTopupRepository$createAutoTopup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupRepository$createAutoTopup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupRepository$createAutoTopup$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupRepository$createAutoTopup$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    y1b1 y1b1Var = mw3Var.e;
                    if (y1b1Var instanceof bu3) {
                        autoTopupType = AutoTopupType.LIMIT_EXACT;
                    } else if (y1b1Var instanceof cu3) {
                        autoTopupType = AutoTopupType.LIMIT_FILL;
                    } else if (y1b1Var instanceof du3) {
                        autoTopupType = AutoTopupType.REGULAR_PERIOD;
                    } else {
                        if (y1b1Var != null) {
                            w511.b();
                            return null;
                        }
                        createAutoTopupRequest = null;
                        if (createAutoTopupRequest == null) {
                            return new Result.Failure(new Exception("Incorrect auto topup data: " + mw3Var));
                        }
                        AutoTopupRepository$createAutoTopup$2 autoTopupRepository$createAutoTopup$2 = new AutoTopupRepository$createAutoTopup$2(this, createAutoTopupRequest, str, null);
                        autoTopupRepository$createAutoTopup$1.label = 1;
                        c = c.c(autoTopupRepository$createAutoTopup$2, autoTopupRepository$createAutoTopup$1);
                        if (c == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    AutoTopupType autoTopupType2 = autoTopupType;
                    String str2 = mw3Var.h;
                    if (str2 != null && (paymentMethodInfoDto = mw3Var.j) != null) {
                        createAutoTopupRequest = new CreateAutoTopupRequest(autoTopupType2, str2, paymentMethodInfoDto, mw3Var.f, mw3Var.g);
                        if (createAutoTopupRequest == null) {
                        }
                    }
                    createAutoTopupRequest = null;
                    if (createAutoTopupRequest == null) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                return c instanceof Result.Failure ? ((CreateAutoTopupResponse) c).getAutoTopupId() : c;
            }
        }
        autoTopupRepository$createAutoTopup$1 = new AutoTopupRepository$createAutoTopup$1(this, continuationImpl);
        Object obj2 = autoTopupRepository$createAutoTopup$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupRepository$createAutoTopup$1.label;
        if (i != 0) {
        }
        if (c instanceof Result.Failure) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, mw3 mw3Var, String str2, ContinuationImpl continuationImpl) {
        AutoTopupRepository$updateAutoTopup$1 autoTopupRepository$updateAutoTopup$1;
        int i;
        Object c;
        if (continuationImpl instanceof AutoTopupRepository$updateAutoTopup$1) {
            autoTopupRepository$updateAutoTopup$1 = (AutoTopupRepository$updateAutoTopup$1) continuationImpl;
            int i2 = autoTopupRepository$updateAutoTopup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupRepository$updateAutoTopup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupRepository$updateAutoTopup$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupRepository$updateAutoTopup$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AutoTopupRepository$updateAutoTopup$2 autoTopupRepository$updateAutoTopup$2 = new AutoTopupRepository$updateAutoTopup$2(this, mw3Var, str, str2, null);
                    autoTopupRepository$updateAutoTopup$1.label = 1;
                    c = c.c(autoTopupRepository$updateAutoTopup$2, autoTopupRepository$updateAutoTopup$1);
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
                return c instanceof Result.Failure ? ((UpdateAutoTopupResponse) c).getAutoTopupId() : c;
            }
        }
        autoTopupRepository$updateAutoTopup$1 = new AutoTopupRepository$updateAutoTopup$1(this, continuationImpl);
        Object obj2 = autoTopupRepository$updateAutoTopup$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupRepository$updateAutoTopup$1.label;
        if (i != 0) {
        }
        if (c instanceof Result.Failure) {
        }
    }
}
