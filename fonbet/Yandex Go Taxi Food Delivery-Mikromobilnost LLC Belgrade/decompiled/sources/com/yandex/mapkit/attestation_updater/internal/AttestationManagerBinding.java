package com.yandex.mapkit.attestation_updater.internal;

import com.yandex.mapkit.attestation_updater.AttestationIdListener;
import com.yandex.mapkit.attestation_updater.AttestationManager;
import com.yandex.mapkit.attestation_updater.ValidationResultSession;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;

/* loaded from: classes15.dex */
public class AttestationManagerBinding implements AttestationManager {
    protected Subscription<AttestationIdListener> attestationIdListenerSubscription = new Subscription<AttestationIdListener>(this) { // from class: com.yandex.mapkit.attestation_updater.internal.AttestationManagerBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(AttestationIdListener attestationIdListener) {
            return AttestationManagerBinding.createAttestationIdListener(attestationIdListener);
        }
    };
    private final NativeObject nativeObject;

    public AttestationManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createAttestationIdListener(AttestationIdListener attestationIdListener);

    @Override // com.yandex.mapkit.attestation_updater.AttestationManager
    public native void addAttestationIdListener(AttestationIdListener attestationIdListener);

    @Override // com.yandex.mapkit.attestation_updater.AttestationManager
    public native void dropAttestation();

    @Override // com.yandex.mapkit.attestation_updater.AttestationManager
    public native boolean isValid();

    @Override // com.yandex.mapkit.attestation_updater.AttestationManager
    public native void removeAttestationIdListener(AttestationIdListener attestationIdListener);

    @Override // com.yandex.mapkit.attestation_updater.AttestationManager
    public native ValidationResultSession requestValidationResult(ValidationResultSession.ValidationResultListener validationResultListener);
}
