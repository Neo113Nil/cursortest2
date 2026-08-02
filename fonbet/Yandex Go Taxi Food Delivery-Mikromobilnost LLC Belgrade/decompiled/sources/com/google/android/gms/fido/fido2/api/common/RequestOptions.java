package com.google.android.gms.fido.fido2.api.common;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hwa1;

/* loaded from: classes11.dex */
public abstract class RequestOptions extends AbstractSafeParcelable {
    public abstract AuthenticationExtensions getAuthenticationExtensions();

    public abstract byte[] getChallenge();

    public abstract Integer getRequestId();

    public abstract Double getTimeoutSeconds();

    public abstract TokenBinding getTokenBinding();

    public byte[] serializeToBytes() {
        return hwa1.f(this);
    }
}
