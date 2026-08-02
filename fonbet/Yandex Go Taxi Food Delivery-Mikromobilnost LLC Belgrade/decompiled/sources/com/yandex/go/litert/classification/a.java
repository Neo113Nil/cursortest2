package com.yandex.go.litert.classification;

import android.content.Context;
import com.yandex.go.litert.api.error.LiteRtServiceException;
import com.yandex.go.litert.contract.LiteRtDynamicApi;
import com.yandex.go.litert.contract.LiteRtInferenceBackendSelection;
import defpackage.ny61;
import defpackage.wuy;
import defpackage.xuy;
import defpackage.yuy;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a implements wuy {
    public final Context a;
    public final com.yandex.go.litert.service.a b;

    public a(Context context, com.yandex.go.litert.service.a aVar, yuy yuyVar) {
        this.a = context;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(File file, xuy xuyVar, String str, ContinuationImpl continuationImpl) {
        LiteRtImageClassifierFactoryImpl$open$1 liteRtImageClassifierFactoryImpl$open$1;
        int i;
        try {
            if (continuationImpl instanceof LiteRtImageClassifierFactoryImpl$open$1) {
                liteRtImageClassifierFactoryImpl$open$1 = (LiteRtImageClassifierFactoryImpl$open$1) continuationImpl;
                int i2 = liteRtImageClassifierFactoryImpl$open$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    liteRtImageClassifierFactoryImpl$open$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = liteRtImageClassifierFactoryImpl$open$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = liteRtImageClassifierFactoryImpl$open$1.label;
                    if (i != 0) {
                        b.b(obj);
                        com.yandex.go.litert.service.a aVar = this.b;
                        liteRtImageClassifierFactoryImpl$open$1.L$0 = file;
                        liteRtImageClassifierFactoryImpl$open$1.L$1 = xuyVar;
                        liteRtImageClassifierFactoryImpl$open$1.L$2 = str;
                        liteRtImageClassifierFactoryImpl$open$1.L$3 = null;
                        liteRtImageClassifierFactoryImpl$open$1.L$4 = null;
                        liteRtImageClassifierFactoryImpl$open$1.label = 1;
                        obj = aVar.a(liteRtImageClassifierFactoryImpl$open$1);
                        if (obj == coroutineSingletons) {
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj);
                            return obj;
                        }
                        b.b(obj);
                    }
                    this.a.getApplicationContext();
                    LiteRtInferenceBackendSelection liteRtInferenceBackendSelection = LiteRtInferenceBackendSelection.AUTO;
                    liteRtImageClassifierFactoryImpl$open$1.L$0 = null;
                    liteRtImageClassifierFactoryImpl$open$1.L$1 = null;
                    liteRtImageClassifierFactoryImpl$open$1.L$2 = null;
                    liteRtImageClassifierFactoryImpl$open$1.L$3 = null;
                    liteRtImageClassifierFactoryImpl$open$1.L$4 = null;
                    liteRtImageClassifierFactoryImpl$open$1.label = 2;
                    Object i3 = ((LiteRtDynamicApi) obj).i();
                    return i3 != coroutineSingletons ? coroutineSingletons : i3;
                }
            }
            if (i != 0) {
            }
            this.a.getApplicationContext();
            LiteRtInferenceBackendSelection liteRtInferenceBackendSelection2 = LiteRtInferenceBackendSelection.AUTO;
            liteRtImageClassifierFactoryImpl$open$1.L$0 = null;
            liteRtImageClassifierFactoryImpl$open$1.L$1 = null;
            liteRtImageClassifierFactoryImpl$open$1.L$2 = null;
            liteRtImageClassifierFactoryImpl$open$1.L$3 = null;
            liteRtImageClassifierFactoryImpl$open$1.L$4 = null;
            liteRtImageClassifierFactoryImpl$open$1.label = 2;
            Object i32 = ((LiteRtDynamicApi) obj).i();
            if (i32 != coroutineSingletons) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return th instanceof LiteRtServiceException ? new Result.Failure(th) : new Result.Failure(new LiteRtServiceException.FeatureLoadingFailed(th));
        }
        liteRtImageClassifierFactoryImpl$open$1 = new LiteRtImageClassifierFactoryImpl$open$1(this, continuationImpl);
        Object obj2 = liteRtImageClassifierFactoryImpl$open$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = liteRtImageClassifierFactoryImpl$open$1.label;
    }
}
