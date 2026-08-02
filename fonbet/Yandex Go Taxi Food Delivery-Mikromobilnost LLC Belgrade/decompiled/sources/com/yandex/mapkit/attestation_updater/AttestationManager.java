package com.yandex.mapkit.attestation_updater;

import com.yandex.mapkit.attestation_updater.ValidationResultSession;

/* loaded from: classes15.dex */
public interface AttestationManager {
    void addAttestationIdListener(AttestationIdListener attestationIdListener);

    void dropAttestation();

    boolean isValid();

    void removeAttestationIdListener(AttestationIdListener attestationIdListener);

    ValidationResultSession requestValidationResult(ValidationResultSession.ValidationResultListener validationResultListener);
}
