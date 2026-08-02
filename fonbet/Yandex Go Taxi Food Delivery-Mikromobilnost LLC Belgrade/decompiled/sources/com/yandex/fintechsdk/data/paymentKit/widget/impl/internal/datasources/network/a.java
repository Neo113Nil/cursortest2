package com.yandex.fintechsdk.data.paymentKit.widget.impl.internal.datasources.network;

import defpackage.fgt;
import defpackage.hxk;
import defpackage.kyk;
import defpackage.ny61;
import defpackage.x4c;
import java.util.Map;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final kyk a;
    public final com.yandex.fintechsdk.data.paymentKit.widget.impl.internal.datasources.network.requesters.a b;

    public a(kyk kykVar, com.yandex.fintechsdk.data.paymentKit.widget.impl.internal.datasources.network.requesters.a aVar) {
        this.a = kykVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Map map, ContinuationImpl continuationImpl) {
        WidgetNetworkDataSource$loadWidget$1 widgetNetworkDataSource$loadWidget$1;
        int i;
        if (continuationImpl instanceof WidgetNetworkDataSource$loadWidget$1) {
            widgetNetworkDataSource$loadWidget$1 = (WidgetNetworkDataSource$loadWidget$1) continuationImpl;
            int i2 = widgetNetworkDataSource$loadWidget$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                widgetNetworkDataSource$loadWidget$1.label = i2 - Integer.MIN_VALUE;
                Object obj = widgetNetworkDataSource$loadWidget$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = widgetNetworkDataSource$loadWidget$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                this.a.getClass();
                x4c x4cVar = hxk.b;
                fgt fgtVar = new fgt(map, str);
                widgetNetworkDataSource$loadWidget$1.label = 1;
                Object b = this.b.b(fgtVar, widgetNetworkDataSource$loadWidget$1);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        widgetNetworkDataSource$loadWidget$1 = new WidgetNetworkDataSource$loadWidget$1(this, continuationImpl);
        Object obj2 = widgetNetworkDataSource$loadWidget$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = widgetNetworkDataSource$loadWidget$1.label;
        if (i == 0) {
        }
    }
}
