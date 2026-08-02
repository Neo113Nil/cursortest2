package com.google.ar.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
final class w {
    public static final w a;
    public static final w b;
    public static final w c;
    private static final /* synthetic */ w[] d;

    static {
        w wVar = new w("ACCEPTED", 0);
        a = wVar;
        w wVar2 = new w("CANCELLED", 1);
        b = wVar2;
        w wVar3 = new w("COMPLETED", 2);
        c = wVar3;
        d = new w[]{wVar, wVar2, wVar3};
    }

    public static w[] values() {
        return (w[]) d.clone();
    }
}
