package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public enum zzhs {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(zzgk.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);

    private final Class zzl;

    static {
        zzgk zzgkVar = zzgk.a;
    }

    zzhs(Class cls) {
        this.zzl = cls;
    }
}
