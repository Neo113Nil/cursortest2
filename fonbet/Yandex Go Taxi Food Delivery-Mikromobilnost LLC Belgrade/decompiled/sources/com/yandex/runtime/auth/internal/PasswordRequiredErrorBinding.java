package com.yandex.runtime.auth.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.auth.PasswordRequiredData;
import com.yandex.runtime.auth.PasswordRequiredError;
import com.yandex.runtime.internal.ErrorBinding;

/* loaded from: classes2.dex */
public class PasswordRequiredErrorBinding extends ErrorBinding implements PasswordRequiredError {
    public PasswordRequiredErrorBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.runtime.auth.PasswordRequiredError
    public native PasswordRequiredData getData();
}
