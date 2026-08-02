package com.ybsdk.feature.pin.api.entities;

import com.ybsdk.feature.pin.api.entities.StartSessionState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class g extends StartSessionState {
    public final StartSessionState.Action a;

    public g(StartSessionState.Action action) {
        super(null, null, 3, null);
        this.a = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.a == ((g) obj).a;
    }

    @Override // com.ybsdk.feature.pin.api.entities.StartSessionState
    public final StartSessionState.Action getSessionStateAction() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PinTokenClear(sessionStateAction=" + this.a + Extension.C_BRAKE;
    }
}
