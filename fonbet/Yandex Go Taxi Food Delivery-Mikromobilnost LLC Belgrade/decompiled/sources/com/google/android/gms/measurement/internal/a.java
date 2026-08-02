package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

/* loaded from: classes.dex */
public final class a {
    public final EnumMap a;

    public a(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public final void a(zzjk zzjkVar, int i) {
        zzam zzamVar = zzam.zza;
        if (i != -30) {
            if (i != -20) {
                if (i == -10) {
                    zzamVar = zzam.zzd;
                } else if (i != 0) {
                    if (i == 30) {
                        zzamVar = zzam.zze;
                    }
                }
            }
            zzamVar = zzam.zzf;
        } else {
            zzamVar = zzam.zzh;
        }
        this.a.put((EnumMap) zzjkVar, (zzjk) zzamVar);
    }

    public final void b(zzjk zzjkVar, zzam zzamVar) {
        this.a.put((EnumMap) zzjkVar, (zzjk) zzamVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (zzjk zzjkVar : zzjk.values()) {
            zzam zzamVar = (zzam) this.a.get(zzjkVar);
            if (zzamVar == null) {
                zzamVar = zzam.zza;
            }
            sb.append(zzamVar.b());
        }
        return sb.toString();
    }

    public a() {
        this.a = new EnumMap(zzjk.class);
    }
}
