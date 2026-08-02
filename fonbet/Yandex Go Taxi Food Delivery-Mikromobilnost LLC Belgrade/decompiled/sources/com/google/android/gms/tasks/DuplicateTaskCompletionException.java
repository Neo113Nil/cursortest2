package com.google.android.gms.tasks;

import com.yandex.payment.common.result.ResultType;

/* loaded from: classes11.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    public static IllegalStateException a(zzw zzwVar) {
        if (!zzwVar.n()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception j = zzwVar.j();
        return new DuplicateTaskCompletionException("Complete with: ".concat(j != null ? ResultType.RESULT_TYPE_FAILURE : zzwVar.o() ? "result ".concat(String.valueOf(zzwVar.k())) : zzwVar.d ? "cancellation" : "unknown issue"), j);
    }
}
