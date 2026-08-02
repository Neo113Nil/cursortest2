package com.yandex.passport.common.analytics;

import android.content.Context;
import android.provider.Settings;
import defpackage.bvf0;
import defpackage.evu0;
import defpackage.fyc;
import defpackage.gwk0;
import defpackage.ike;
import defpackage.ny61;
import defpackage.qhw0;
import defpackage.tje;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.common.startup.StartupRequest;

/* loaded from: classes8.dex */
public final class d {
    public final Context a;
    public final com.yandex.passport.common.coroutine.a b;
    public final fyc c;

    public d(Context context, com.yandex.passport.common.coroutine.a aVar) {
        this.a = context;
        this.b = aVar;
        ike a = bvf0.a(new qhw0(null));
        this.c = gwk0.b();
        tje.N(a, null, null, new AnalyticalIdentifiersProvider$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, ContinuationImpl continuationImpl) {
        AnalyticalIdentifiersProvider$getAnalyticalIdentifiers$1 analyticalIdentifiersProvider$getAnalyticalIdentifiers$1;
        int i;
        if (continuationImpl instanceof AnalyticalIdentifiersProvider$getAnalyticalIdentifiers$1) {
            analyticalIdentifiersProvider$getAnalyticalIdentifiers$1 = (AnalyticalIdentifiersProvider$getAnalyticalIdentifiers$1) continuationImpl;
            int i2 = analyticalIdentifiersProvider$getAnalyticalIdentifiers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                analyticalIdentifiersProvider$getAnalyticalIdentifiers$1.label = i2 - Integer.MIN_VALUE;
                Object obj = analyticalIdentifiersProvider$getAnalyticalIdentifiers$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = analyticalIdentifiersProvider$getAnalyticalIdentifiers$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AnalyticalIdentifiersProvider$getAnalyticalIdentifiers$2 analyticalIdentifiersProvider$getAnalyticalIdentifiers$2 = new AnalyticalIdentifiersProvider$getAnalyticalIdentifiers$2(this, null);
                    analyticalIdentifiersProvider$getAnalyticalIdentifiers$1.L$0 = this;
                    analyticalIdentifiersProvider$getAnalyticalIdentifiers$1.label = 1;
                    obj = kotlinx.coroutines.a.w(j, analyticalIdentifiersProvider$getAnalyticalIdentifiers$2, analyticalIdentifiersProvider$getAnalyticalIdentifiers$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (d) analyticalIdentifiersProvider$getAnalyticalIdentifiers$1.L$0;
                    kotlin.b.b(obj);
                }
                b bVar = (b) obj;
                return bVar != null ? this.c() : bVar;
            }
        }
        analyticalIdentifiersProvider$getAnalyticalIdentifiers$1 = new AnalyticalIdentifiersProvider$getAnalyticalIdentifiers$1(this, continuationImpl);
        Object obj2 = analyticalIdentifiersProvider$getAnalyticalIdentifiers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = analyticalIdentifiersProvider$getAnalyticalIdentifiers$1.label;
        if (i != 0) {
        }
        b bVar2 = (b) obj2;
        if (bVar2 != null) {
        }
    }

    public final b b() {
        fyc fycVar = this.c;
        Object obj = null;
        if (!fycVar.isActive() && !fycVar.isCancelled() && fycVar.k0()) {
            obj = fycVar.E();
        }
        b bVar = (b) obj;
        return bVar == null ? c() : bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b c() {
        String string = Settings.Secure.getString(this.a.getContentResolver(), StartupRequest.PARAM_ANDROID_ID);
        if (string != null) {
            if (evu0.J(string)) {
                string = null;
            }
        }
        string = null;
        return new b(string, null);
    }
}
