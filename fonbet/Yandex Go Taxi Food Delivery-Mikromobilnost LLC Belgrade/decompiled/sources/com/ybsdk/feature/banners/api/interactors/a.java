package com.ybsdk.feature.banners.api.interactors;

import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.banners.api.MarkEventsApi;
import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final MarkEventsApi a;

    public a(MarkEventsApi markEventsApi) {
        this.a = markEventsApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        MarkNotificationsRepository$markAsRead$1 markNotificationsRepository$markAsRead$1;
        int i;
        if (continuationImpl instanceof MarkNotificationsRepository$markAsRead$1) {
            markNotificationsRepository$markAsRead$1 = (MarkNotificationsRepository$markAsRead$1) continuationImpl;
            int i2 = markNotificationsRepository$markAsRead$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                markNotificationsRepository$markAsRead$1.label = i2 - Integer.MIN_VALUE;
                Object obj = markNotificationsRepository$markAsRead$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = markNotificationsRepository$markAsRead$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                MarkNotificationsRepository$markAsRead$2 markNotificationsRepository$markAsRead$2 = new MarkNotificationsRepository$markAsRead$2(this, str, str2, null);
                markNotificationsRepository$markAsRead$1.label = 1;
                Object c = c.c(markNotificationsRepository$markAsRead$2, markNotificationsRepository$markAsRead$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        markNotificationsRepository$markAsRead$1 = new MarkNotificationsRepository$markAsRead$1(this, continuationImpl);
        Object obj2 = markNotificationsRepository$markAsRead$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = markNotificationsRepository$markAsRead$1.label;
        if (i == 0) {
        }
    }
}
