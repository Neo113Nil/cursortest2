package com.ybsdk.feature.banners.impl.domain.interactors;

import defpackage.d6v;
import defpackage.i5z0;
import defpackage.nfo;
import defpackage.ny61;
import defpackage.wls;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final com.ybsdk.feature.banners.impl.data.a a;

    public b(com.ybsdk.feature.banners.impl.data.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(d6v d6vVar, String str, ContinuationImpl continuationImpl) {
        HandleNotificationClickInteractorImpl$markEventAsRead$1 handleNotificationClickInteractorImpl$markEventAsRead$1;
        int i;
        Object O;
        Throwable a;
        if (continuationImpl instanceof HandleNotificationClickInteractorImpl$markEventAsRead$1) {
            handleNotificationClickInteractorImpl$markEventAsRead$1 = (HandleNotificationClickInteractorImpl$markEventAsRead$1) continuationImpl;
            int i2 = handleNotificationClickInteractorImpl$markEventAsRead$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                handleNotificationClickInteractorImpl$markEventAsRead$1.label = i2 - Integer.MIN_VALUE;
                Object obj = handleNotificationClickInteractorImpl$markEventAsRead$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = handleNotificationClickInteractorImpl$markEventAsRead$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Object nfoVar = new nfo(str);
                    wls handleNotificationClickInteractorImpl$markEventAsRead$2 = new HandleNotificationClickInteractorImpl$markEventAsRead$2(this, str, null);
                    handleNotificationClickInteractorImpl$markEventAsRead$1.label = 1;
                    O = d6vVar.O(handleNotificationClickInteractorImpl$markEventAsRead$2, nfoVar, handleNotificationClickInteractorImpl$markEventAsRead$1);
                    if (O == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    O = ((Result) obj).getValue();
                }
                a = Result.a(O);
                if (a != null) {
                    i5z0.a.b(a);
                }
                return O;
            }
        }
        handleNotificationClickInteractorImpl$markEventAsRead$1 = new HandleNotificationClickInteractorImpl$markEventAsRead$1(this, continuationImpl);
        Object obj3 = handleNotificationClickInteractorImpl$markEventAsRead$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = handleNotificationClickInteractorImpl$markEventAsRead$1.label;
        if (i != 0) {
        }
        a = Result.a(O);
        if (a != null) {
        }
        return O;
    }
}
