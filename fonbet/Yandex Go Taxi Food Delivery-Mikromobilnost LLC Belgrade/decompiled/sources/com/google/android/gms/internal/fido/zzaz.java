package com.google.android.gms.internal.fido;

/* loaded from: classes11.dex */
final class zzaz extends zzbl {
    public static final zzaz a = new zzaz();

    @Override // com.google.android.gms.internal.fido.zzbl
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
