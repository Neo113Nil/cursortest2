package com.yandex.plus.home.feature.webviews.internal.purchase.subscription;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import defpackage.b64;
import defpackage.ny61;
import defpackage.skd0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class b {
    public final com.yandex.plus.home.graphql.subscription.a a;

    public b(com.yandex.plus.home.graphql.subscription.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:23|24))(3:25|26|(1:28))|12|13|(1:15)|16|(1:21)(2:18|19)))|35|6|7|(0)(0)|12|13|(0)|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        r9 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0043, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        r9 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        StoriesConfigurationInteractorImpl$getStoriesConfig$1 storiesConfigurationInteractorImpl$getStoriesConfig$1;
        Object obj;
        int i;
        Throwable a;
        if (continuationImpl instanceof StoriesConfigurationInteractorImpl$getStoriesConfig$1) {
            storiesConfigurationInteractorImpl$getStoriesConfig$1 = (StoriesConfigurationInteractorImpl$getStoriesConfig$1) continuationImpl;
            int i2 = storiesConfigurationInteractorImpl$getStoriesConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storiesConfigurationInteractorImpl$getStoriesConfig$1.label = i2 - Integer.MIN_VALUE;
                obj = storiesConfigurationInteractorImpl$getStoriesConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storiesConfigurationInteractorImpl$getStoriesConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.plus.home.graphql.subscription.a aVar = this.a;
                    storiesConfigurationInteractorImpl$getStoriesConfig$1.L$0 = str;
                    storiesConfigurationInteractorImpl$getStoriesConfig$1.L$1 = str2;
                    storiesConfigurationInteractorImpl$getStoriesConfig$1.L$2 = str3;
                    storiesConfigurationInteractorImpl$getStoriesConfig$1.L$3 = null;
                    storiesConfigurationInteractorImpl$getStoriesConfig$1.L$4 = null;
                    storiesConfigurationInteractorImpl$getStoriesConfig$1.L$5 = null;
                    storiesConfigurationInteractorImpl$getStoriesConfig$1.I$0 = 0;
                    storiesConfigurationInteractorImpl$getStoriesConfig$1.I$1 = 0;
                    storiesConfigurationInteractorImpl$getStoriesConfig$1.label = 1;
                    obj = aVar.b(str, str2, str3, storiesConfigurationInteractorImpl$getStoriesConfig$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = (String) storiesConfigurationInteractorImpl$getStoriesConfig$1.L$2;
                    str2 = (String) storiesConfigurationInteractorImpl$getStoriesConfig$1.L$1;
                    str = (String) storiesConfigurationInteractorImpl$getStoriesConfig$1.L$0;
                    kotlin.b.b(obj);
                }
                a = Result.a(obj);
                if (a != null) {
                    PlusLogTag plusLogTag = PlusLogTag.SUBSCRIPTION;
                    StringBuilder v = b64.v("getStoriesConfig(", str, Extension.FIX_SPACE, str2, Extension.FIX_SPACE);
                    v.append(str3);
                    v.append(')');
                    skd0.c(plusLogTag, v.toString(), a);
                }
                if (obj instanceof Result.Failure) {
                    return obj;
                }
                return null;
            }
        }
        storiesConfigurationInteractorImpl$getStoriesConfig$1 = new StoriesConfigurationInteractorImpl$getStoriesConfig$1(this, continuationImpl);
        obj = storiesConfigurationInteractorImpl$getStoriesConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storiesConfigurationInteractorImpl$getStoriesConfig$1.label;
        if (i != 0) {
        }
        a = Result.a(obj);
        if (a != null) {
        }
        if (obj instanceof Result.Failure) {
        }
    }
}
