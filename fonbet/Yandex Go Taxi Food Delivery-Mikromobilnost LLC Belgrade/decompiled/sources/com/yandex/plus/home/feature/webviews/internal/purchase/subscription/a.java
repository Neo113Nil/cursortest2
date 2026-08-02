package com.yandex.plus.home.feature.webviews.internal.purchase.subscription;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import defpackage.ffx;
import defpackage.ny61;
import defpackage.skd0;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class a {
    public final com.yandex.plus.home.graphql.subscription.a a;
    public final n0 b = ffx.c(0, 0, null, 7);

    public a(com.yandex.plus.home.graphql.subscription.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(2:30|31)|19|20|(1:22)|23|(1:25)|26))|40|6|7|(0)(0)|19|20|(0)|23|(0)|26|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        if (r9.b.emit((defpackage.ef41) r12, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        if (r12 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        r2 = new kotlin.Result.Failure(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0058, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
    
        r2 = new kotlin.Result.Failure(r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        HomeConfigurationInteractorImpl$updateHomeConfiguration$1 homeConfigurationInteractorImpl$updateHomeConfiguration$1;
        Object obj;
        int i;
        Throwable a;
        if (continuationImpl instanceof HomeConfigurationInteractorImpl$updateHomeConfiguration$1) {
            homeConfigurationInteractorImpl$updateHomeConfiguration$1 = (HomeConfigurationInteractorImpl$updateHomeConfiguration$1) continuationImpl;
            int i2 = homeConfigurationInteractorImpl$updateHomeConfiguration$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                homeConfigurationInteractorImpl$updateHomeConfiguration$1.label = i2 - Integer.MIN_VALUE;
                obj = homeConfigurationInteractorImpl$updateHomeConfiguration$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = homeConfigurationInteractorImpl$updateHomeConfiguration$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.plus.home.graphql.subscription.a aVar = this.a;
                    homeConfigurationInteractorImpl$updateHomeConfiguration$1.L$0 = str;
                    homeConfigurationInteractorImpl$updateHomeConfiguration$1.L$1 = str2;
                    homeConfigurationInteractorImpl$updateHomeConfiguration$1.L$2 = null;
                    homeConfigurationInteractorImpl$updateHomeConfiguration$1.L$3 = null;
                    homeConfigurationInteractorImpl$updateHomeConfiguration$1.L$4 = null;
                    homeConfigurationInteractorImpl$updateHomeConfiguration$1.I$0 = 0;
                    homeConfigurationInteractorImpl$updateHomeConfiguration$1.I$1 = 0;
                    homeConfigurationInteractorImpl$updateHomeConfiguration$1.label = 1;
                    obj = aVar.a(str, str2, homeConfigurationInteractorImpl$updateHomeConfiguration$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    str2 = (String) homeConfigurationInteractorImpl$updateHomeConfiguration$1.L$1;
                    str = (String) homeConfigurationInteractorImpl$updateHomeConfiguration$1.L$0;
                    kotlin.b.b(obj);
                }
                a = Result.a(obj);
                if (a != null) {
                    skd0.c(PlusLogTag.SUBSCRIPTION, "updateHomeConfiguration(" + str + Extension.FIX_SPACE + str2 + ')', a);
                }
                if (obj instanceof Result.Failure) {
                    obj = null;
                }
                homeConfigurationInteractorImpl$updateHomeConfiguration$1.L$0 = null;
                homeConfigurationInteractorImpl$updateHomeConfiguration$1.L$1 = null;
                homeConfigurationInteractorImpl$updateHomeConfiguration$1.L$2 = obj;
                homeConfigurationInteractorImpl$updateHomeConfiguration$1.L$3 = null;
                homeConfigurationInteractorImpl$updateHomeConfiguration$1.L$4 = null;
                homeConfigurationInteractorImpl$updateHomeConfiguration$1.I$0 = 0;
                homeConfigurationInteractorImpl$updateHomeConfiguration$1.label = 2;
            }
        }
        homeConfigurationInteractorImpl$updateHomeConfiguration$1 = new HomeConfigurationInteractorImpl$updateHomeConfiguration$1(this, continuationImpl);
        obj = homeConfigurationInteractorImpl$updateHomeConfiguration$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = homeConfigurationInteractorImpl$updateHomeConfiguration$1.label;
        if (i != 0) {
        }
        a = Result.a(obj);
        if (a != null) {
        }
        if (obj instanceof Result.Failure) {
        }
        homeConfigurationInteractorImpl$updateHomeConfiguration$1.L$0 = null;
        homeConfigurationInteractorImpl$updateHomeConfiguration$1.L$1 = null;
        homeConfigurationInteractorImpl$updateHomeConfiguration$1.L$2 = obj;
        homeConfigurationInteractorImpl$updateHomeConfiguration$1.L$3 = null;
        homeConfigurationInteractorImpl$updateHomeConfiguration$1.L$4 = null;
        homeConfigurationInteractorImpl$updateHomeConfiguration$1.I$0 = 0;
        homeConfigurationInteractorImpl$updateHomeConfiguration$1.label = 2;
    }
}
