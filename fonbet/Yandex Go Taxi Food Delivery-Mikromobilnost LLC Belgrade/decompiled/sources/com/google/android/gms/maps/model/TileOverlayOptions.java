package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.maps.zzai;
import com.google.android.gms.internal.maps.zzaj;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.lm71;
import defpackage.z4z0;

/* loaded from: classes11.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new zzv();
    private zzaj zza;
    private z4z0 zzb;
    private boolean zzc;
    private float zzd;
    private boolean zze;
    private float zzf;

    public TileOverlayOptions(IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        this.zzc = true;
        this.zze = true;
        this.zzf = 0.0f;
        zzaj zzc = zzai.zzc(iBinder);
        this.zza = zzc;
        this.zzb = zzc == null ? null : new lm71(this);
        this.zzc = z;
        this.zzd = f;
        this.zze = z2;
        this.zzf = f2;
    }

    public TileOverlayOptions fadeIn(boolean z) {
        this.zze = z;
        return this;
    }

    public boolean getFadeIn() {
        return this.zze;
    }

    public z4z0 getTileProvider() {
        return this.zzb;
    }

    public float getTransparency() {
        return this.zzf;
    }

    public float getZIndex() {
        return this.zzd;
    }

    public boolean isVisible() {
        return this.zzc;
    }

    public TileOverlayOptions tileProvider(z4z0 z4z0Var) {
        cvw.m(z4z0Var, "tileProvider must not be null.");
        this.zzb = z4z0Var;
        this.zza = new zzu(this, z4z0Var);
        return this;
    }

    public TileOverlayOptions transparency(float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        cvw.d("Transparency must be in the range [0..1]", z);
        this.zzf = f;
        return this;
    }

    public TileOverlayOptions visible(boolean z) {
        this.zzc = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        zzaj zzajVar = this.zza;
        bb1.a0(parcel, 2, zzajVar == null ? null : zzajVar.asBinder());
        boolean isVisible = isVisible();
        bb1.m0(3, parcel, 4);
        parcel.writeInt(isVisible ? 1 : 0);
        float zIndex = getZIndex();
        bb1.m0(4, parcel, 4);
        parcel.writeFloat(zIndex);
        boolean fadeIn = getFadeIn();
        bb1.m0(5, parcel, 4);
        parcel.writeInt(fadeIn ? 1 : 0);
        float transparency = getTransparency();
        bb1.m0(6, parcel, 4);
        parcel.writeFloat(transparency);
        bb1.o0(parcel, n0);
    }

    public TileOverlayOptions zIndex(float f) {
        this.zzd = f;
        return this;
    }

    public TileOverlayOptions() {
        this.zzc = true;
        this.zze = true;
        this.zzf = 0.0f;
    }
}
