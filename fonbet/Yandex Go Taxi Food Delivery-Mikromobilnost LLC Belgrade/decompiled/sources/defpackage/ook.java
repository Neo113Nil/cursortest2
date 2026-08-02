package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.EducationEvents$EducationErrorError;
import com.ybsdk.core.utils.c;
import com.ybsdk.feature.educations.internal.domain.a;
import java.util.Collections;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class ook implements d6v {
    public final a b;
    public final dpn c;
    public final AppAnalyticsReporter w;
    public nok x;
    public final /* synthetic */ c a = new c();
    public boolean y = true;

    public ook(a aVar, dpn dpnVar, AppAnalyticsReporter appAnalyticsReporter) {
        this.b = aVar;
        this.c = dpnVar;
        this.w = appAnalyticsReporter;
    }

    @Override // defpackage.d6v
    public final Object B(Object obj, sls slsVar, tls tlsVar, wls wlsVar, ContinuationImpl continuationImpl) {
        Object B = this.a.B(obj, slsVar, tlsVar, wlsVar, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return B;
    }

    @Override // defpackage.d6v
    public final Object O(wls wlsVar, Object obj, Continuation continuation) {
        Object O = this.a.O(wlsVar, obj, continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return O;
    }

    public final void a() {
        nok nokVar = this.x;
        if (nokVar != null) {
            this.w.w.d(nokVar.a, nokVar.b, nokVar.c, EducationEvents$EducationErrorError.CONFIGURATION_FAILED);
        }
    }

    public final void b(String str) {
        nok nokVar = this.x;
        x4c.g("Education anchor contains wrong viewId", null, b.i(new Pair("education_id", nokVar != null ? nokVar.a : null), new Pair("view_id", str)), Collections.singletonList(lrp0.j), 2);
    }

    @Override // defpackage.d6v
    public final String i(String str) {
        return this.a.i(str);
    }
}
