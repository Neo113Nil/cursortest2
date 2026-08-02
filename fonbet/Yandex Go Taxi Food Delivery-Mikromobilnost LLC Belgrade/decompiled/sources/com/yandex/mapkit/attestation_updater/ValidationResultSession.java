package com.yandex.mapkit.attestation_updater;

import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface ValidationResultSession {

    public interface ValidationResultListener {
        void onValidationResult(ValidationResult validationResult);

        void onValidationResultError(Error error);
    }

    void cancel();

    void retry(ValidationResultListener validationResultListener);
}
