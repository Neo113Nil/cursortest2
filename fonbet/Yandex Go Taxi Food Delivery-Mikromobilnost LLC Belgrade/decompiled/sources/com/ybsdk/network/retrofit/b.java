package com.ybsdk.network.retrofit;

import com.squareup.moshi.Moshi;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.FailDataResponse;
import com.ybsdk.core.utils.dto.OldDataWithStatusResponse;
import com.ybsdk.core.utils.dto.OldFailDataResponse;
import com.ybsdk.core.utils.dto.OldTwoFactorAuthResponse;
import com.ybsdk.core.utils.dto.SecondAuthorizationResponse;
import com.ybsdk.core.utils.dto.TwoFactorAuthResponse;
import defpackage.ak7;
import defpackage.b7j0;
import defpackage.dvw;
import defpackage.kol0;
import defpackage.kzz0;
import defpackage.mq5;
import defpackage.ny61;
import defpackage.oo2;
import defpackage.tls;
import defpackage.u0k0;
import defpackage.wls;
import defpackage.y8j0;
import defpackage.yk;
import defpackage.ym11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import retrofit2.Call;

/* loaded from: classes8.dex */
public final class b {
    public final y8j0 a;
    public final Moshi b;
    public final u0k0 c;

    public b(y8j0 y8j0Var, Moshi moshi, u0k0 u0k0Var) {
        this.a = y8j0Var;
        this.b = moshi;
        this.c = u0k0Var;
    }

    public static final Object a(b bVar, Call call, Object obj, ak7 ak7Var, tls tlsVar) {
        Object obj2 = obj;
        bVar.c.e(call, obj2, ak7Var);
        b7j0 b7j0Var = (b7j0) call.k().c(b7j0.class);
        String str = b7j0Var != null ? b7j0Var.a : null;
        kzz0 kzz0Var = (kzz0) bVar.a.get(str != null ? new b7j0(str) : null);
        String str2 = kzz0Var != null ? kzz0Var.a : null;
        String str3 = str2 == null ? null : str2;
        if (obj2 instanceof TwoFactorAuthResponse) {
            TwoFactorAuthResponse twoFactorAuthResponse = (TwoFactorAuthResponse) obj2;
            FailDataResponse failData = twoFactorAuthResponse.getFailData();
            obj2 = TwoFactorAuthResponse.copy$default(twoFactorAuthResponse, null, null, failData != null ? FailDataResponse.copy$default(failData, null, null, null, null, null, str3, 31, null) : null, null, 11, null);
        } else if (obj2 instanceof DataWithStatusResponse) {
            DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) obj2;
            FailDataResponse failData2 = dataWithStatusResponse.getFailData();
            obj2 = DataWithStatusResponse.copy$default(dataWithStatusResponse, null, failData2 != null ? FailDataResponse.copy$default(failData2, null, null, null, null, null, str3, 31, null) : null, null, 5, null);
        } else if (obj2 instanceof OldDataWithStatusResponse) {
            OldDataWithStatusResponse oldDataWithStatusResponse = (OldDataWithStatusResponse) obj2;
            OldFailDataResponse failData3 = oldDataWithStatusResponse.getFailData();
            obj2 = OldDataWithStatusResponse.copy$default(oldDataWithStatusResponse, null, failData3 != null ? OldFailDataResponse.copy$default(failData3, null, null, null, null, str3, null, 47, null) : null, null, 5, null);
        } else if (obj2 instanceof OldTwoFactorAuthResponse) {
            OldTwoFactorAuthResponse oldTwoFactorAuthResponse = (OldTwoFactorAuthResponse) obj2;
            OldFailDataResponse failData4 = oldTwoFactorAuthResponse.getFailData();
            obj2 = OldTwoFactorAuthResponse.copy$default(oldTwoFactorAuthResponse, null, null, failData4 != null ? OldFailDataResponse.copy$default(failData4, null, null, null, null, str3, null, 47, null) : null, null, 11, null);
        } else if (obj2 instanceof SecondAuthorizationResponse) {
            SecondAuthorizationResponse secondAuthorizationResponse = (SecondAuthorizationResponse) obj2;
            SecondAuthorizationResponse.FailData failData5 = secondAuthorizationResponse.getFailData();
            obj2 = SecondAuthorizationResponse.copy$default(secondAuthorizationResponse, null, null, failData5 != null ? SecondAuthorizationResponse.FailData.copy$default(failData5, null, str3, 1, null) : null, null, 11, null);
        }
        bVar.b(call);
        return tlsVar.invoke(obj2);
    }

    public final void b(Call call) {
        b7j0 b7j0Var = (b7j0) call.k().c(b7j0.class);
        String str = b7j0Var != null ? b7j0Var.a : null;
        ym11.c(this.a).remove(str != null ? new b7j0(str) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Call call, tls tlsVar, ak7 ak7Var, ContinuationImpl continuationImpl) {
        CallExecutor$execute$1 callExecutor$execute$1;
        int i;
        if (continuationImpl instanceof CallExecutor$execute$1) {
            callExecutor$execute$1 = (CallExecutor$execute$1) continuationImpl;
            int i2 = callExecutor$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                callExecutor$execute$1.label = i2 - Integer.MIN_VALUE;
                CallExecutor$execute$1 callExecutor$execute$12 = callExecutor$execute$1;
                Object obj = callExecutor$execute$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callExecutor$execute$12.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                wls ykVar = new yk(2);
                callExecutor$execute$12.label = 1;
                Object d = d(call, tlsVar, ak7Var, ykVar, callExecutor$execute$12);
                return d == obj2 ? obj2 : d;
            }
        }
        callExecutor$execute$1 = new CallExecutor$execute$1(this, continuationImpl);
        CallExecutor$execute$1 callExecutor$execute$122 = callExecutor$execute$1;
        Object obj3 = callExecutor$execute$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callExecutor$execute$122.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Call call, tls tlsVar, ak7 ak7Var, wls wlsVar, ContinuationImpl continuationImpl) {
        CallExecutor$executeCall$1 callExecutor$executeCall$1;
        int i;
        if (continuationImpl instanceof CallExecutor$executeCall$1) {
            callExecutor$executeCall$1 = (CallExecutor$executeCall$1) continuationImpl;
            int i2 = callExecutor$executeCall$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                callExecutor$executeCall$1.label = i2 - Integer.MIN_VALUE;
                Object obj = callExecutor$executeCall$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callExecutor$executeCall$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    callExecutor$executeCall$1.L$0 = call;
                    callExecutor$executeCall$1.L$1 = tlsVar;
                    callExecutor$executeCall$1.L$2 = ak7Var;
                    callExecutor$executeCall$1.L$3 = wlsVar;
                    callExecutor$executeCall$1.label = 1;
                    kol0 kol0Var = new kol0(dvw.b(callExecutor$executeCall$1));
                    this.c.a(call, ak7Var.a, ak7Var.c);
                    call.k0(new oo2(tlsVar, kol0Var, this, ak7Var, wlsVar));
                    obj = kol0Var.a();
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
                return ((Result) obj).getValue();
            }
        }
        callExecutor$executeCall$1 = new CallExecutor$executeCall$1(this, continuationImpl);
        Object obj2 = callExecutor$executeCall$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callExecutor$executeCall$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Call call, tls tlsVar, ak7 ak7Var, ContinuationImpl continuationImpl) {
        CallExecutor$executePollable$1 callExecutor$executePollable$1;
        int i;
        if (continuationImpl instanceof CallExecutor$executePollable$1) {
            callExecutor$executePollable$1 = (CallExecutor$executePollable$1) continuationImpl;
            int i2 = callExecutor$executePollable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                callExecutor$executePollable$1.label = i2 - Integer.MIN_VALUE;
                CallExecutor$executePollable$1 callExecutor$executePollable$12 = callExecutor$executePollable$1;
                Object obj = callExecutor$executePollable$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callExecutor$executePollable$12.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                wls mq5Var = new mq5(7);
                callExecutor$executePollable$12.label = 1;
                Object d = d(call, tlsVar, ak7Var, mq5Var, callExecutor$executePollable$12);
                return d == obj2 ? obj2 : d;
            }
        }
        callExecutor$executePollable$1 = new CallExecutor$executePollable$1(this, continuationImpl);
        CallExecutor$executePollable$1 callExecutor$executePollable$122 = callExecutor$executePollable$1;
        Object obj3 = callExecutor$executePollable$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callExecutor$executePollable$122.label;
        if (i == 0) {
        }
    }
}
