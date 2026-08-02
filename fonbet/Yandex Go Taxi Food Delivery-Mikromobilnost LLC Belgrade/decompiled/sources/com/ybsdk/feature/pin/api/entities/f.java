package com.ybsdk.feature.pin.api.entities;

import com.ybsdk.feature.pin.api.entities.StartSessionState;
import defpackage.jl40;
import defpackage.unr0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class f extends StartSessionState {
    public final ProductEntity a;
    public final String b;
    public final StartSessionState.Action c;

    public f(ProductEntity productEntity, String str, StartSessionState.Action action) {
        super(null, null, 3, null);
        this.a = productEntity;
        this.b = str;
        this.c = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && jl40.l(this.b, fVar.b) && this.c == fVar.c;
    }

    @Override // com.ybsdk.feature.pin.api.entities.StartSessionState
    public final StartSessionState.Action getSessionStateAction() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "OpenProduct(product=" + this.a + ", startLandingUrl=" + this.b + ", sessionStateAction=" + this.c + Extension.C_BRAKE;
    }
}
