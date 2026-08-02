package com.google.firebase.crashlytics.internal.concurrency;

import android.os.Looper;
import defpackage.l3f;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class CrashlyticsWorkers$Companion$checkNotMainThread$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        ((l3f) this.receiver).getClass();
        return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
    }
}
