package com.google.android.play.core.splitinstall;

import defpackage.f691;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zzo {
    public static final zzo zza;
    private static final AtomicReference zzb;
    private static final /* synthetic */ zzo[] zzc;

    static {
        zzo zzoVar = new zzo("INSTANCE", 0);
        zza = zzoVar;
        zzc = new zzo[]{zzoVar};
        zzb = new AtomicReference(null);
    }

    public static f691 a() {
        return (f691) zzb.get();
    }

    public static void b(f691 f691Var) {
        zzb.set(f691Var);
    }

    public static zzo[] values() {
        return (zzo[]) zzc.clone();
    }
}
