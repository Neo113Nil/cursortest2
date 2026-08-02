package com.ybsdk.screens.registration.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.network.Api;
import com.ybsdk.network.dto.ApplicationSubmitCodeRequest;
import com.ybsdk.network.dto.changephone.ChangePhoneSendCodeRequest;
import com.ybsdk.screens.registration.domain.OtpValidationResultEntity$Error$Type;
import defpackage.ny61;
import defpackage.tzd0;
import defpackage.ur80;
import defpackage.wr80;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final Api a;
    public final com.ybsdk.utils.poller.b b;

    public a(Api api, com.ybsdk.utils.poller.b bVar) {
        this.a = api;
        this.b = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        ChangePhoneRepository$requestOtp$1 changePhoneRepository$requestOtp$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof ChangePhoneRepository$requestOtp$1) {
            changePhoneRepository$requestOtp$1 = (ChangePhoneRepository$requestOtp$1) continuationImpl;
            int i2 = changePhoneRepository$requestOtp$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changePhoneRepository$requestOtp$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changePhoneRepository$requestOtp$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changePhoneRepository$requestOtp$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ChangePhoneRepository$requestOtp$2 changePhoneRepository$requestOtp$2 = new ChangePhoneRepository$requestOtp$2(this, str2, new ChangePhoneSendCodeRequest(str), null);
                    changePhoneRepository$requestOtp$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(changePhoneRepository$requestOtp$2, changePhoneRepository$requestOtp$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                ChangePhoneRepository$requestOtp$3$1 changePhoneRepository$requestOtp$3$1 = new ChangePhoneRepository$requestOtp$3$1(2, null);
                changePhoneRepository$requestOtp$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, changePhoneRepository$requestOtp$3$1, changePhoneRepository$requestOtp$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        changePhoneRepository$requestOtp$1 = new ChangePhoneRepository$requestOtp$1(this, continuationImpl);
        Object obj2 = changePhoneRepository$requestOtp$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changePhoneRepository$requestOtp$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    public final Object b(String str, boolean z, boolean z2, Continuation continuation) {
        return this.b.a(tzd0.b, new ChangePhoneRepository$startPolling$2(this, str, null), new ChangePhoneRepository$startPolling$3(this, z2, z, null)).d(null, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        if (r13 == r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0058, code lost:
    
        if (r13 == r2) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        ChangePhoneRepository$validateOtp$1 changePhoneRepository$validateOtp$1;
        int i;
        Object c;
        Throwable a;
        Object failure;
        Throwable a2;
        if (continuationImpl instanceof ChangePhoneRepository$validateOtp$1) {
            changePhoneRepository$validateOtp$1 = (ChangePhoneRepository$validateOtp$1) continuationImpl;
            int i2 = changePhoneRepository$validateOtp$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changePhoneRepository$validateOtp$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changePhoneRepository$validateOtp$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changePhoneRepository$validateOtp$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ChangePhoneRepository$validateOtp$2 changePhoneRepository$validateOtp$2 = new ChangePhoneRepository$validateOtp$2(this, str, new ApplicationSubmitCodeRequest(str2, str3), null);
                    changePhoneRepository$validateOtp$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(changePhoneRepository$validateOtp$2, changePhoneRepository$validateOtp$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        failure = ((Result) obj).getValue();
                        a2 = Result.a(failure);
                        if (a2 == null) {
                            return (wr80) failure;
                        }
                        FailDataException failDataException = a2 instanceof FailDataException ? (FailDataException) a2 : null;
                        if (failDataException == null) {
                            return new Result.Failure(a2);
                        }
                        String error = failDataException.getError();
                        Text.Constant constant = error != null ? new Text.Constant(error) : null;
                        String error2 = failDataException.getError();
                        return new ur80(constant, error2 != null ? new Text.Constant(error2) : null, failDataException.getSupportUrl(), OtpValidationResultEntity$Error$Type.DEFAULT, false);
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a != null) {
                    ChangePhoneRepository$validateOtp$3$1 changePhoneRepository$validateOtp$3$1 = new ChangePhoneRepository$validateOtp$3$1(2, null);
                    changePhoneRepository$validateOtp$1.label = 2;
                    failure = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, changePhoneRepository$validateOtp$3$1, changePhoneRepository$validateOtp$1);
                } else {
                    failure = new Result.Failure(a);
                }
                a2 = Result.a(failure);
                if (a2 == null) {
                }
            }
        }
        changePhoneRepository$validateOtp$1 = new ChangePhoneRepository$validateOtp$1(this, continuationImpl);
        Object obj2 = changePhoneRepository$validateOtp$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changePhoneRepository$validateOtp$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a != null) {
        }
        a2 = Result.a(failure);
        if (a2 == null) {
        }
    }
}
