package com.yandex.go.support.analytics;

import defpackage.jst;
import defpackage.k52;
import defpackage.ny61;
import defpackage.sh41;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wnt;
import defpackage.zy11;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes14.dex */
public final class a {
    public final sh41 a;
    public final wnt b;
    public final tt2 c;

    public a(sh41 sh41Var, wnt wntVar, tt2 tt2Var) {
        this.a = sh41Var;
        this.b = wntVar;
        this.c = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        CommonSupportWebAnalytics$parseWebViewEvent$1 commonSupportWebAnalytics$parseWebViewEvent$1;
        int i;
        if (continuationImpl instanceof CommonSupportWebAnalytics$parseWebViewEvent$1) {
            commonSupportWebAnalytics$parseWebViewEvent$1 = (CommonSupportWebAnalytics$parseWebViewEvent$1) continuationImpl;
            int i2 = commonSupportWebAnalytics$parseWebViewEvent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonSupportWebAnalytics$parseWebViewEvent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonSupportWebAnalytics$parseWebViewEvent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonSupportWebAnalytics$parseWebViewEvent$1.label;
                if (i != 0) {
                    b.b(obj);
                    this.c.getClass();
                    sjh sjhVar = uyj.a;
                    CommonSupportWebAnalytics$parseWebViewEvent$2 commonSupportWebAnalytics$parseWebViewEvent$2 = new CommonSupportWebAnalytics$parseWebViewEvent$2(this, str, null);
                    commonSupportWebAnalytics$parseWebViewEvent$1.L$0 = null;
                    commonSupportWebAnalytics$parseWebViewEvent$1.label = 1;
                    obj = tje.k0(sjhVar, commonSupportWebAnalytics$parseWebViewEvent$2, commonSupportWebAnalytics$parseWebViewEvent$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        commonSupportWebAnalytics$parseWebViewEvent$1 = new CommonSupportWebAnalytics$parseWebViewEvent$1(this, continuationImpl);
        Object obj2 = commonSupportWebAnalytics$parseWebViewEvent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonSupportWebAnalytics$parseWebViewEvent$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        CommonSupportWebAnalytics$trackWebViewAnalyticsEvent$1 commonSupportWebAnalytics$trackWebViewAnalyticsEvent$1;
        int i;
        Object a;
        Throwable a2;
        if (continuationImpl instanceof CommonSupportWebAnalytics$trackWebViewAnalyticsEvent$1) {
            commonSupportWebAnalytics$trackWebViewAnalyticsEvent$1 = (CommonSupportWebAnalytics$trackWebViewAnalyticsEvent$1) continuationImpl;
            int i2 = commonSupportWebAnalytics$trackWebViewAnalyticsEvent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonSupportWebAnalytics$trackWebViewAnalyticsEvent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonSupportWebAnalytics$trackWebViewAnalyticsEvent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonSupportWebAnalytics$trackWebViewAnalyticsEvent$1.label;
                if (i != 0) {
                    b.b(obj);
                    commonSupportWebAnalytics$trackWebViewAnalyticsEvent$1.L$0 = null;
                    commonSupportWebAnalytics$trackWebViewAnalyticsEvent$1.label = 1;
                    a = a(str, commonSupportWebAnalytics$trackWebViewAnalyticsEvent$1);
                    if (a == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    ((j) this.a).u((k52) a);
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    jst.e.i("Failed to parse WebView analytics event", a2);
                }
                return zy11.a;
            }
        }
        commonSupportWebAnalytics$trackWebViewAnalyticsEvent$1 = new CommonSupportWebAnalytics$trackWebViewAnalyticsEvent$1(this, continuationImpl);
        Object obj3 = commonSupportWebAnalytics$trackWebViewAnalyticsEvent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonSupportWebAnalytics$trackWebViewAnalyticsEvent$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        return zy11.a;
    }
}
