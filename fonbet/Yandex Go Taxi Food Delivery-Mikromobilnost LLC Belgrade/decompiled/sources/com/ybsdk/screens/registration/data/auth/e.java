package com.ybsdk.screens.registration.data.auth;

import com.ybsdk.network.PciDssApi;
import com.ybsdk.network.dto.SendAuthorizationCodeRequest;
import com.ybsdk.network.dto.SendAuthorizationCodeResponse;
import com.ybsdk.network.dto.VerifyAuthorizationCodeRequest;
import com.ybsdk.network.dto.VerifyAuthorizationCodeResponse;
import defpackage.ln3;
import defpackage.ny61;
import defpackage.yr80;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class e implements ln3 {
    public final PciDssApi a;

    public e(PciDssApi pciDssApi) {
        this.a = pciDssApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ln3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        YbAuthorizationRepository$requestOtp$1 ybAuthorizationRepository$requestOtp$1;
        int i;
        Object c;
        if (continuationImpl instanceof YbAuthorizationRepository$requestOtp$1) {
            ybAuthorizationRepository$requestOtp$1 = (YbAuthorizationRepository$requestOtp$1) continuationImpl;
            int i2 = ybAuthorizationRepository$requestOtp$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybAuthorizationRepository$requestOtp$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybAuthorizationRepository$requestOtp$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybAuthorizationRepository$requestOtp$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str2 == null) {
                        return new Result.Failure(new Exception("Can't get device id"));
                    }
                    YbAuthorizationRepository$requestOtp$2 ybAuthorizationRepository$requestOtp$2 = new YbAuthorizationRepository$requestOtp$2(this, str3, new SendAuthorizationCodeRequest(str, str2), null);
                    ybAuthorizationRepository$requestOtp$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(ybAuthorizationRepository$requestOtp$2, ybAuthorizationRepository$requestOtp$1);
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
                return c instanceof Result.Failure ? com.ybsdk.screens.registration.domain.a.a((SendAuthorizationCodeResponse) c) : c;
            }
        }
        ybAuthorizationRepository$requestOtp$1 = new YbAuthorizationRepository$requestOtp$1(this, continuationImpl);
        Object obj2 = ybAuthorizationRepository$requestOtp$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybAuthorizationRepository$requestOtp$1.label;
        if (i != 0) {
        }
        if (c instanceof Result.Failure) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ln3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, ContinuationImpl continuationImpl) {
        YbAuthorizationRepository$validateOtp$1 ybAuthorizationRepository$validateOtp$1;
        int i;
        Object c;
        if (continuationImpl instanceof YbAuthorizationRepository$validateOtp$1) {
            ybAuthorizationRepository$validateOtp$1 = (YbAuthorizationRepository$validateOtp$1) continuationImpl;
            int i2 = ybAuthorizationRepository$validateOtp$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybAuthorizationRepository$validateOtp$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybAuthorizationRepository$validateOtp$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybAuthorizationRepository$validateOtp$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    YbAuthorizationRepository$validateOtp$2 ybAuthorizationRepository$validateOtp$2 = new YbAuthorizationRepository$validateOtp$2(this, new VerifyAuthorizationCodeRequest(str2, str), null);
                    ybAuthorizationRepository$validateOtp$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(ybAuthorizationRepository$validateOtp$2, ybAuthorizationRepository$validateOtp$1);
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
                return c instanceof Result.Failure ? yr80.a((VerifyAuthorizationCodeResponse) c) : c;
            }
        }
        ybAuthorizationRepository$validateOtp$1 = new YbAuthorizationRepository$validateOtp$1(this, continuationImpl);
        Object obj2 = ybAuthorizationRepository$validateOtp$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybAuthorizationRepository$validateOtp$1.label;
        if (i != 0) {
        }
        if (c instanceof Result.Failure) {
        }
    }
}
