package com.google.android.gms.internal.play_billing;

import com.objsys.asn1j.runtime.Asn1Enumerated;
import defpackage.cvw;
import defpackage.df91;
import defpackage.ye91;
import java.util.Arrays;

/* loaded from: classes.dex */
enum zzd {
    RESPONSE_CODE_UNSPECIFIED(Asn1Enumerated.UNDEFINED),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);

    private static final zzcr zzp;
    private final int zzr;

    static {
        df91 df91Var = new df91();
        for (zzd zzdVar : values()) {
            Integer valueOf = Integer.valueOf(zzdVar.zzr);
            int i = df91Var.b + 1;
            Object[] objArr = df91Var.a;
            int length = objArr.length;
            int i2 = i + i;
            if (i2 > length) {
                df91Var.a = Arrays.copyOf(objArr, cvw.l0(length, i2));
            }
            Object[] objArr2 = df91Var.a;
            int i3 = df91Var.b;
            int i4 = i3 + i3;
            objArr2[i4] = valueOf;
            objArr2[i4 + 1] = zzdVar;
            df91Var.b = i3 + 1;
        }
        ye91 ye91Var = df91Var.c;
        if (ye91Var != null) {
            throw ye91Var.a();
        }
        zzdp b = zzdp.b(df91Var.b, df91Var.a, df91Var);
        ye91 ye91Var2 = df91Var.c;
        if (ye91Var2 != null) {
            throw ye91Var2.a();
        }
        zzp = b;
    }

    zzd(int i) {
        this.zzr = i;
    }

    public static zzd a(int i) {
        zzcr zzcrVar = zzp;
        Integer valueOf = Integer.valueOf(i);
        return !zzcrVar.containsKey(valueOf) ? RESPONSE_CODE_UNSPECIFIED : (zzd) zzcrVar.get(valueOf);
    }
}
