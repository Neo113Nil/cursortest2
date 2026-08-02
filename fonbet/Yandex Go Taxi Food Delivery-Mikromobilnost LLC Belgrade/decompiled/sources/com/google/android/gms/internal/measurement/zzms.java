package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public enum zzms {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(zzlh.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);

    private final Class zzk;

    static {
        zzlh zzlhVar = zzlh.a;
    }

    zzms(Class cls) {
        this.zzk = cls;
    }
}
