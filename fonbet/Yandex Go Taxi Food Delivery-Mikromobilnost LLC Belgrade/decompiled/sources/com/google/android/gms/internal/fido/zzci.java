package com.google.android.gms.internal.fido;

import defpackage.z591;
import java.util.Iterator;

/* loaded from: classes11.dex */
final class zzci extends zzce {
    final /* synthetic */ zzcj zza;

    public zzci(zzcj zzcjVar) {
        this.zza = zzcjVar;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final z591 g() {
        return l().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return l().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc m() {
        return new zzch(this);
    }
}
