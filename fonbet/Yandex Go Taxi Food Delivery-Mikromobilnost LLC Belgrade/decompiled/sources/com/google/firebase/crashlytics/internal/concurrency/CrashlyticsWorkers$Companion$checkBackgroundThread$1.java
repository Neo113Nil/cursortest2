package com.google.firebase.crashlytics.internal.concurrency;

import defpackage.evu0;
import defpackage.l3f;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class CrashlyticsWorkers$Companion$checkBackgroundThread$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        ((l3f) this.receiver).getClass();
        return Boolean.valueOf(evu0.y(Thread.currentThread().getName(), "Firebase Background Thread #", false));
    }
}
