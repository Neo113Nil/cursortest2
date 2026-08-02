package com.yandex.fintechsdk.flows.payment.kit.internal.widget;

import defpackage.ny61;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class b {
    public final com.yandex.fintechsdk.data.paymentKit.widget.impl.internal.a a;
    public Map b = kotlin.collections.b.f();
    public String c = "";

    public b(com.yandex.fintechsdk.data.paymentKit.widget.impl.internal.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        WidgetJsonLoader$loadJson$1 widgetJsonLoader$loadJson$1;
        int i;
        if (continuationImpl instanceof WidgetJsonLoader$loadJson$1) {
            widgetJsonLoader$loadJson$1 = (WidgetJsonLoader$loadJson$1) continuationImpl;
            int i2 = widgetJsonLoader$loadJson$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                widgetJsonLoader$loadJson$1.label = i2 - Integer.MIN_VALUE;
                Object obj = widgetJsonLoader$loadJson$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = widgetJsonLoader$loadJson$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                String str = this.c;
                Map map = this.b;
                widgetJsonLoader$loadJson$1.label = 1;
                Object a = this.a.a(str, map, widgetJsonLoader$loadJson$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        widgetJsonLoader$loadJson$1 = new WidgetJsonLoader$loadJson$1(this, continuationImpl);
        Object obj2 = widgetJsonLoader$loadJson$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = widgetJsonLoader$loadJson$1.label;
        if (i == 0) {
        }
    }
}
