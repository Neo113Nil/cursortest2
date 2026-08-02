package com.ybsdk.feature.pin.api.entities;

import com.ybsdk.feature.pin.api.entities.StartSessionState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class n extends StartSessionState {
    public final StartSessionState.Action a;

    public n(StartSessionState.Action action) {
        super(null, null, 3, null);
        this.a = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.a == ((n) obj).a;
    }

    @Override // com.ybsdk.feature.pin.api.entities.StartSessionState
    public final StartSessionState.Action getSessionStateAction() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdateRequired(sessionStateAction=" + this.a + Extension.C_BRAKE;
    }
}
