package com.ybsdk.feature.pin.api.entities;

import defpackage.b64;
import defpackage.jl40;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class d extends StartSessionState {
    public final Throwable a;

    public d(Throwable th) {
        super(null, null, 3, null);
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && jl40.l(this.a, ((d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.m("Error(t=", Extension.C_BRAKE, this.a);
    }
}
