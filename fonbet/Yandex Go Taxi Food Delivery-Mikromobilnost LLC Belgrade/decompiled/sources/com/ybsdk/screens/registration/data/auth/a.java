package com.ybsdk.screens.registration.data.auth;

import com.ybsdk.network.CorpCardPciDssApi;
import com.ybsdk.network.dto.CorpCardSendAuthorizationCodeRequest;
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
public final class a implements ln3 {
    public final CorpCardPciDssApi a;

    public a(CorpCardPciDssApi corpCardPciDssApi) {
        this.a = corpCardPciDssApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ln3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        CorpCardAuthorizationRepository$requestOtp$1 corpCardAuthorizationRepository$requestOtp$1;
        int i;
        Object c;
        if (continuationImpl instanceof CorpCardAuthorizationRepository$requestOtp$1) {
            corpCardAuthorizationRepository$requestOtp$1 = (CorpCardAuthorizationRepository$requestOtp$1) continuationImpl;
            int i2 = corpCardAuthorizationRepository$requestOtp$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                corpCardAuthorizationRepository$requestOtp$1.label = i2 - Integer.MIN_VALUE;
                Object obj = corpCardAuthorizationRepository$requestOtp$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = corpCardAuthorizationRepository$requestOtp$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CorpCardAuthorizationRepository$requestOtp$2 corpCardAuthorizationRepository$requestOtp$2 = new CorpCardAuthorizationRepository$requestOtp$2(this, str3, new CorpCardSendAuthorizationCodeRequest(str), null);
                    corpCardAuthorizationRepository$requestOtp$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(corpCardAuthorizationRepository$requestOtp$2, corpCardAuthorizationRepository$requestOtp$1);
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
        corpCardAuthorizationRepository$requestOtp$1 = new CorpCardAuthorizationRepository$requestOtp$1(this, continuationImpl);
        Object obj2 = corpCardAuthorizationRepository$requestOtp$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = corpCardAuthorizationRepository$requestOtp$1.label;
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
        CorpCardAuthorizationRepository$validateOtp$1 corpCardAuthorizationRepository$validateOtp$1;
        int i;
        Object c;
        if (continuationImpl instanceof CorpCardAuthorizationRepository$validateOtp$1) {
            corpCardAuthorizationRepository$validateOtp$1 = (CorpCardAuthorizationRepository$validateOtp$1) continuationImpl;
            int i2 = corpCardAuthorizationRepository$validateOtp$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                corpCardAuthorizationRepository$validateOtp$1.label = i2 - Integer.MIN_VALUE;
                Object obj = corpCardAuthorizationRepository$validateOtp$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = corpCardAuthorizationRepository$validateOtp$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CorpCardAuthorizationRepository$validateOtp$2 corpCardAuthorizationRepository$validateOtp$2 = new CorpCardAuthorizationRepository$validateOtp$2(this, new VerifyAuthorizationCodeRequest(str2, str), null);
                    corpCardAuthorizationRepository$validateOtp$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(corpCardAuthorizationRepository$validateOtp$2, corpCardAuthorizationRepository$validateOtp$1);
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
        corpCardAuthorizationRepository$validateOtp$1 = new CorpCardAuthorizationRepository$validateOtp$1(this, continuationImpl);
        Object obj2 = corpCardAuthorizationRepository$validateOtp$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = corpCardAuthorizationRepository$validateOtp$1.label;
        if (i != 0) {
        }
        if (c instanceof Result.Failure) {
        }
    }
}
