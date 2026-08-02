package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.a06;
import defpackage.bb1;
import defpackage.ny61;

/* loaded from: classes11.dex */
public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new zzi();
    private LatLng zza;
    private String zzb;
    private String zzc;
    private a06 zzd;
    private float zze;
    private float zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private float zzn;

    public MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.zze = 0.5f;
        this.zzf = 1.0f;
        this.zzh = true;
        this.zzi = false;
        this.zzj = 0.0f;
        this.zzk = 0.5f;
        this.zzl = 0.0f;
        this.zzm = 1.0f;
        this.zza = latLng;
        this.zzb = str;
        this.zzc = str2;
        if (iBinder == null) {
            this.zzd = null;
        } else {
            this.zzd = new a06(IObjectWrapper.Stub.asInterface(iBinder));
        }
        this.zze = f;
        this.zzf = f2;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = f3;
        this.zzk = f4;
        this.zzl = f5;
        this.zzm = f6;
        this.zzn = f7;
    }

    public MarkerOptions alpha(float f) {
        this.zzm = f;
        return this;
    }

    public MarkerOptions anchor(float f, float f2) {
        this.zze = f;
        this.zzf = f2;
        return this;
    }

    public MarkerOptions draggable(boolean z) {
        this.zzg = z;
        return this;
    }

    public MarkerOptions flat(boolean z) {
        this.zzi = z;
        return this;
    }

    public float getAlpha() {
        return this.zzm;
    }

    public float getAnchorU() {
        return this.zze;
    }

    public float getAnchorV() {
        return this.zzf;
    }

    public a06 getIcon() {
        return this.zzd;
    }

    public float getInfoWindowAnchorU() {
        return this.zzk;
    }

    public float getInfoWindowAnchorV() {
        return this.zzl;
    }

    public LatLng getPosition() {
        return this.zza;
    }

    public float getRotation() {
        return this.zzj;
    }

    public String getSnippet() {
        return this.zzc;
    }

    public String getTitle() {
        return this.zzb;
    }

    public float getZIndex() {
        return this.zzn;
    }

    public MarkerOptions icon(a06 a06Var) {
        this.zzd = a06Var;
        return this;
    }

    public MarkerOptions infoWindowAnchor(float f, float f2) {
        this.zzk = f;
        this.zzl = f2;
        return this;
    }

    public boolean isDraggable() {
        return this.zzg;
    }

    public boolean isFlat() {
        return this.zzi;
    }

    public boolean isVisible() {
        return this.zzh;
    }

    public MarkerOptions position(LatLng latLng) {
        if (latLng != null) {
            this.zza = latLng;
            return this;
        }
        ny61.g("latlng cannot be null - a position is required.");
        return null;
    }

    public MarkerOptions rotation(float f) {
        this.zzj = f;
        return this;
    }

    public MarkerOptions snippet(String str) {
        this.zzc = str;
        return this;
    }

    public MarkerOptions title(String str) {
        this.zzb = str;
        return this;
    }

    public MarkerOptions visible(boolean z) {
        this.zzh = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 2, getPosition(), i, false);
        bb1.g0(parcel, 3, getTitle(), false);
        bb1.g0(parcel, 4, getSnippet(), false);
        a06 a06Var = this.zzd;
        bb1.a0(parcel, 5, a06Var == null ? null : a06Var.a.asBinder());
        float anchorU = getAnchorU();
        bb1.m0(6, parcel, 4);
        parcel.writeFloat(anchorU);
        float anchorV = getAnchorV();
        bb1.m0(7, parcel, 4);
        parcel.writeFloat(anchorV);
        boolean isDraggable = isDraggable();
        bb1.m0(8, parcel, 4);
        parcel.writeInt(isDraggable ? 1 : 0);
        boolean isVisible = isVisible();
        bb1.m0(9, parcel, 4);
        parcel.writeInt(isVisible ? 1 : 0);
        boolean isFlat = isFlat();
        bb1.m0(10, parcel, 4);
        parcel.writeInt(isFlat ? 1 : 0);
        float rotation = getRotation();
        bb1.m0(11, parcel, 4);
        parcel.writeFloat(rotation);
        float infoWindowAnchorU = getInfoWindowAnchorU();
        bb1.m0(12, parcel, 4);
        parcel.writeFloat(infoWindowAnchorU);
        float infoWindowAnchorV = getInfoWindowAnchorV();
        bb1.m0(13, parcel, 4);
        parcel.writeFloat(infoWindowAnchorV);
        float alpha = getAlpha();
        bb1.m0(14, parcel, 4);
        parcel.writeFloat(alpha);
        float zIndex = getZIndex();
        bb1.m0(15, parcel, 4);
        parcel.writeFloat(zIndex);
        bb1.o0(parcel, n0);
    }

    public MarkerOptions zIndex(float f) {
        this.zzn = f;
        return this;
    }

    public MarkerOptions() {
        this.zze = 0.5f;
        this.zzf = 1.0f;
        this.zzh = true;
        this.zzi = false;
        this.zzj = 0.0f;
        this.zzk = 0.5f;
        this.zzl = 0.0f;
        this.zzm = 1.0f;
    }
}
