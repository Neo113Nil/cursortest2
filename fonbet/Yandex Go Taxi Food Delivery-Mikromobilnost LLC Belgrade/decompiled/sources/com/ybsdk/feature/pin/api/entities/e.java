package com.ybsdk.feature.pin.api.entities;

import com.ybsdk.feature.pin.api.entities.StartSessionState;
import defpackage.jl40;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class e extends StartSessionState {
    public final ArrayList a;
    public final String b;
    public final StartSessionState.Action c;

    public e(ArrayList arrayList, String str, StartSessionState.Action action) {
        super(null, null, 3, null);
        this.a = arrayList;
        this.b = str;
        this.c = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return jl40.l(this.a, eVar.a) && jl40.l(this.b, eVar.b) && this.c == eVar.c;
    }

    @Override // com.ybsdk.feature.pin.api.entities.StartSessionState
    public final List getApplications() {
        return this.a;
    }

    @Override // com.ybsdk.feature.pin.api.entities.StartSessionState
    public final StartSessionState.Action getSessionStateAction() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Ok(applications=" + this.a + ", startLandingUrl=" + this.b + ", sessionStateAction=" + this.c + Extension.C_BRAKE;
    }
}
