package com.yandex.go.proxyprovision.mob;

import android.content.Context;
import defpackage.dp20;
import defpackage.ny61;
import defpackage.v2u0;
import defpackage.yb20;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.q;

/* loaded from: classes8.dex */
public final class d {
    public final Context a;
    public final v2u0 b;

    public d(Context context, v2u0 v2u0Var) {
        this.a = context;
        this.b = v2u0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        GoMobMetricaDataProvider$metricaData$1 goMobMetricaDataProvider$metricaData$1;
        int i;
        String str;
        if (continuationImpl instanceof GoMobMetricaDataProvider$metricaData$1) {
            goMobMetricaDataProvider$metricaData$1 = (GoMobMetricaDataProvider$metricaData$1) continuationImpl;
            int i2 = goMobMetricaDataProvider$metricaData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                goMobMetricaDataProvider$metricaData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = goMobMetricaDataProvider$metricaData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = goMobMetricaDataProvider$metricaData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    goMobMetricaDataProvider$metricaData$1.label = 1;
                    obj = ((q) this.b).l(this.a, goMobMetricaDataProvider$metricaData$1);
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
                yb20 yb20Var = (yb20) obj;
                str = yb20Var.b;
                if (str == null) {
                    str = "";
                }
                String str2 = yb20Var.a;
                return new dp20(str, str2 != null ? str2 : "");
            }
        }
        goMobMetricaDataProvider$metricaData$1 = new GoMobMetricaDataProvider$metricaData$1(this, continuationImpl);
        Object obj2 = goMobMetricaDataProvider$metricaData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = goMobMetricaDataProvider$metricaData$1.label;
        if (i != 0) {
        }
        yb20 yb20Var2 = (yb20) obj2;
        str = yb20Var2.b;
        if (str == null) {
        }
        String str22 = yb20Var2.a;
        return new dp20(str, str22 != null ? str22 : "");
    }
}
