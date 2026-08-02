package com.ybsdk.feature.pin.api.entities;

import com.ybsdk.feature.pin.api.entities.StartSessionState;
import defpackage.jl40;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class b extends StartSessionState {
    public final ArrayList a;
    public final StartSessionState.Action b;

    public b(ArrayList arrayList, StartSessionState.Action action) {
        super(null, null, 3, null);
        this.a = arrayList;
        this.b = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return jl40.l(this.a, bVar.a) && this.b == bVar.b;
    }

    @Override // com.ybsdk.feature.pin.api.entities.StartSessionState
    public final List getApplications() {
        return this.a;
    }

    @Override // com.ybsdk.feature.pin.api.entities.StartSessionState
    public final StartSessionState.Action getSessionStateAction() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ApplicationStatusCheck(applications=" + this.a + ", sessionStateAction=" + this.b + Extension.C_BRAKE;
    }
}
