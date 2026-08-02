package com.yandex.fintechsdk.data.paymentKit.widget.impl.internal;

import defpackage.ny61;
import defpackage.w351;
import java.util.Map;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final com.yandex.fintechsdk.data.paymentKit.widget.impl.internal.datasources.network.a a;
    public final w351 b;

    public a(com.yandex.fintechsdk.data.paymentKit.widget.impl.internal.datasources.network.a aVar, w351 w351Var) {
        this.a = aVar;
        this.b = w351Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Map map, ContinuationImpl continuationImpl) {
        WidgetRepositoryImpl$loadWidget$1 widgetRepositoryImpl$loadWidget$1;
        int i;
        if (continuationImpl instanceof WidgetRepositoryImpl$loadWidget$1) {
            widgetRepositoryImpl$loadWidget$1 = (WidgetRepositoryImpl$loadWidget$1) continuationImpl;
            int i2 = widgetRepositoryImpl$loadWidget$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                widgetRepositoryImpl$loadWidget$1.label = i2 - Integer.MIN_VALUE;
                Object obj = widgetRepositoryImpl$loadWidget$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = widgetRepositoryImpl$loadWidget$1.label;
                if (i != 0) {
                    b.b(obj);
                    widgetRepositoryImpl$loadWidget$1.label = 1;
                    Object a = this.a.a(str, map, widgetRepositoryImpl$loadWidget$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i == 1) {
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        widgetRepositoryImpl$loadWidget$1 = new WidgetRepositoryImpl$loadWidget$1(this, continuationImpl);
        Object obj2 = widgetRepositoryImpl$loadWidget$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = widgetRepositoryImpl$loadWidget$1.label;
        if (i != 0) {
        }
    }
}
