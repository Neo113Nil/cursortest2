package ru.ok.tracer;

import kotlin.Result;

/* compiled from: SystemStateSerializer.kt */
/* loaded from: classes9.dex */
public final class SystemStateSerializerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getImpliedPackageName() {
        Object failure;
        try {
            failure = Tracer.INSTANCE.getContext().getPackageName();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            failure = "NA";
        }
        return (String) failure;
    }
}
