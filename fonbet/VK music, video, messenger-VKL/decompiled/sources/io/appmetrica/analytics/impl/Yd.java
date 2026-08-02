package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes8.dex */
public final /* synthetic */ class Yd extends FunctionReferenceImpl implements izs {
    public Yd(Object obj) {
        super(1, obj, Zd.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Zd zd = (Zd) this.receiver;
        zd.a.markCrashCompleted((String) obj);
        zd.a.deleteCompletedCrashes();
        return s3q0.a;
    }
}
