package com.ybsdk.core.utils.dto;

import defpackage.ny61;
import defpackage.pk11;
import defpackage.qk11;
import defpackage.rk11;
import defpackage.tk11;
import defpackage.tls;
import defpackage.w511;
import defpackage.wls;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public abstract class f {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(TwoFactorAuthResponse twoFactorAuthResponse, wls wlsVar, ContinuationImpl continuationImpl) {
        TwoFactorAuthEntityKt$toEntity$1 twoFactorAuthEntityKt$toEntity$1;
        int i;
        if (continuationImpl instanceof TwoFactorAuthEntityKt$toEntity$1) {
            twoFactorAuthEntityKt$toEntity$1 = (TwoFactorAuthEntityKt$toEntity$1) continuationImpl;
            int i2 = twoFactorAuthEntityKt$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                twoFactorAuthEntityKt$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = twoFactorAuthEntityKt$toEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = twoFactorAuthEntityKt$toEntity$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                TwoFactorAuthEntityKt$toEntity$2 twoFactorAuthEntityKt$toEntity$2 = new TwoFactorAuthEntityKt$toEntity$2(wlsVar, null);
                twoFactorAuthEntityKt$toEntity$1.label = 1;
                Object c = c(twoFactorAuthResponse, twoFactorAuthEntityKt$toEntity$2, twoFactorAuthEntityKt$toEntity$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        twoFactorAuthEntityKt$toEntity$1 = new TwoFactorAuthEntityKt$toEntity$1(continuationImpl);
        Object obj2 = twoFactorAuthEntityKt$toEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = twoFactorAuthEntityKt$toEntity$1.label;
        if (i == 0) {
        }
    }

    public static final Object b(OldTwoFactorAuthResponse oldTwoFactorAuthResponse, tls tlsVar) {
        int i = tk11.a[oldTwoFactorAuthResponse.getStatus().ordinal()];
        if (i == 1) {
            Object value = ((Result) tlsVar.invoke(oldTwoFactorAuthResponse.getSuccessData())).getValue();
            return !(value instanceof Result.Failure) ? new rk11(value) : value;
        }
        if (i == 2) {
            if (oldTwoFactorAuthResponse.getFailData() == null) {
                return new Result.Failure(new Exception("failData null"));
            }
            String error = oldTwoFactorAuthResponse.getFailData().getError();
            if (error == null) {
                error = "";
            }
            String description = oldTwoFactorAuthResponse.getFailData().getDescription();
            UtilsThemedParameter<String> icon = oldTwoFactorAuthResponse.getFailData().getIcon();
            return new qk11(error, description, icon != null ? icon.toEntity() : null, oldTwoFactorAuthResponse.getFailData().getSupportUrl(), oldTwoFactorAuthResponse.getFailData().getTraceId(), oldTwoFactorAuthResponse.getFailData().getTechInfo());
        }
        if (i == 3) {
            AuthenticationTrackInfo authenticationInfo = oldTwoFactorAuthResponse.getAuthenticationInfo();
            return (authenticationInfo != null ? authenticationInfo.getTrackId() : null) == null ? new Result.Failure(new Exception("authorizationInfo null")) : new pk11(oldTwoFactorAuthResponse.getAuthenticationInfo().getTrackId(), oldTwoFactorAuthResponse.getAuthenticationInfo().getOperationId());
        }
        if (i != 4) {
            w511.b();
            return null;
        }
        return new Result.Failure(new Exception("unknown status " + oldTwoFactorAuthResponse));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(TwoFactorAuthResponse twoFactorAuthResponse, wls wlsVar, ContinuationImpl continuationImpl) {
        TwoFactorAuthEntityKt$toResultEntity$2 twoFactorAuthEntityKt$toResultEntity$2;
        int i;
        if (continuationImpl instanceof TwoFactorAuthEntityKt$toResultEntity$2) {
            twoFactorAuthEntityKt$toResultEntity$2 = (TwoFactorAuthEntityKt$toResultEntity$2) continuationImpl;
            int i2 = twoFactorAuthEntityKt$toResultEntity$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                twoFactorAuthEntityKt$toResultEntity$2.label = i2 - Integer.MIN_VALUE;
                Object obj = twoFactorAuthEntityKt$toResultEntity$2.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = twoFactorAuthEntityKt$toResultEntity$2.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = tk11.a[twoFactorAuthResponse.getStatus().ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            if (twoFactorAuthResponse.getFailData() == null) {
                                return new Result.Failure(new Exception("failData null"));
                            }
                            String title = twoFactorAuthResponse.getFailData().getTitle();
                            String description = twoFactorAuthResponse.getFailData().getDescription();
                            UtilsThemedParameter<String> icon = twoFactorAuthResponse.getFailData().getIcon();
                            return new qk11(title, description, icon != null ? icon.toEntity() : null, twoFactorAuthResponse.getFailData().getSupportUrl(), twoFactorAuthResponse.getFailData().getTraceId(), twoFactorAuthResponse.getFailData().getTechInfo());
                        }
                        if (i3 == 3) {
                            AuthenticationTrackInfo authenticationInfo = twoFactorAuthResponse.getAuthenticationInfo();
                            return (authenticationInfo != null ? authenticationInfo.getTrackId() : null) == null ? new Result.Failure(new Exception("authorizationInfo null")) : new pk11(twoFactorAuthResponse.getAuthenticationInfo().getTrackId(), twoFactorAuthResponse.getAuthenticationInfo().getOperationId());
                        }
                        if (i3 != 4) {
                            w511.b();
                            return null;
                        }
                        return new Result.Failure(new Exception("unknown status " + twoFactorAuthResponse));
                    }
                    if (twoFactorAuthResponse.getSuccessData() == null) {
                        return new Result.Failure(new Exception("successData null"));
                    }
                    Object successData = twoFactorAuthResponse.getSuccessData();
                    twoFactorAuthEntityKt$toResultEntity$2.label = 1;
                    obj = wlsVar.invoke(successData, twoFactorAuthEntityKt$toResultEntity$2);
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
                Object value = ((Result) obj).getValue();
                return value instanceof Result.Failure ? new rk11(value) : value;
            }
        }
        twoFactorAuthEntityKt$toResultEntity$2 = new TwoFactorAuthEntityKt$toResultEntity$2(continuationImpl);
        Object obj3 = twoFactorAuthEntityKt$toResultEntity$2.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = twoFactorAuthEntityKt$toResultEntity$2.label;
        if (i != 0) {
        }
        Object value2 = ((Result) obj3).getValue();
        if (value2 instanceof Result.Failure) {
        }
    }
}
