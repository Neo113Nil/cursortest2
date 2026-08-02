package com.google.android.gms.internal.fido;

import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import defpackage.oyr;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
final class zzbn extends zzbl {
    private final Object zza;

    public zzbn(PublicKeyCredentialParameters publicKeyCredentialParameters) {
        this.zza = publicKeyCredentialParameters;
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final Object a() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbn) {
            return this.zza.equals(((zzbn) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return oyr.p("Optional.of(", this.zza.toString(), Extension.C_BRAKE);
    }
}
