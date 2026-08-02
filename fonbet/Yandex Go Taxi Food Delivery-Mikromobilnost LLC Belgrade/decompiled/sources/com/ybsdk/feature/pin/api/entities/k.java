package com.ybsdk.feature.pin.api.entities;

import com.ybsdk.feature.pin.api.entities.StartSessionState;
import defpackage.jl40;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class k extends StartSessionState {
    public final String a;
    public final StartSessionState.Action b;

    public k(String str, StartSessionState.Action action) {
        super(null, null, 3, null);
        this.a = str;
        this.b = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return jl40.l(this.a, kVar.a) && this.b == kVar.b;
    }

    @Override // com.ybsdk.feature.pin.api.entities.StartSessionState
    public final StartSessionState.Action getSessionStateAction() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SmsAuthorization(trackId=" + this.a + ", sessionStateAction=" + this.b + Extension.C_BRAKE;
    }
}
