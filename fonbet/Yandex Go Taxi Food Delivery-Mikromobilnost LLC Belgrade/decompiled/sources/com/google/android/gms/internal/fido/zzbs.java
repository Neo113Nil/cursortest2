package com.google.android.gms.internal.fido;

import defpackage.jra1;
import defpackage.ka91;
import defpackage.oyr;
import java.io.Serializable;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
final class zzbs implements Serializable, ka91 {
    final Object zza;

    public zzbs(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbs) {
            return jra1.h(this.zza, ((zzbs) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        return oyr.p("Suppliers.ofInstance(", this.zza.toString(), Extension.C_BRAKE);
    }
}
