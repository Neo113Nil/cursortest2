package com.yandex.mapkit.attestation_updater.internal;

import com.yandex.mapkit.attestation_updater.ValidationResultSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class ValidationResultSessionBinding implements ValidationResultSession {
    private final NativeObject nativeObject;

    public ValidationResultSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.attestation_updater.ValidationResultSession
    public native void cancel();

    @Override // com.yandex.mapkit.attestation_updater.ValidationResultSession
    public native void retry(ValidationResultSession.ValidationResultListener validationResultListener);
}
