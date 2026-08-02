package com.yandex.runtime.auth.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.auth.PasswordRequiredData;
import com.yandex.runtime.auth.TokenListener;

/* loaded from: classes8.dex */
public class TokenListenerBinding implements TokenListener {
    private final NativeObject nativeObject;

    public TokenListenerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.runtime.auth.TokenListener
    public native void onPasswordRequired(PasswordRequiredData passwordRequiredData);

    @Override // com.yandex.runtime.auth.TokenListener
    public native void onTokenReceived(String str);

    @Override // com.yandex.runtime.auth.TokenListener
    public native void onTokenRefreshFailed(String str);
}
