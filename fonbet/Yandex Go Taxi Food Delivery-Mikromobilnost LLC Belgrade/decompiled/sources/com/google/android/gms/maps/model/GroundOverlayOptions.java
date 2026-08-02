package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.a06;
import defpackage.bb1;
import defpackage.cvw;

/* loaded from: classes11.dex */
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new zzd();
    public static final float NO_DIMENSION = -1.0f;
    private a06 zza;
    private LatLng zzb;
    private float zzc;
    private float zzd;
    private LatLngBounds zze;
    private float zzf;
    private float zzg;
    private boolean zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;

    public GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        this.zzh = true;
        this.zzi = 0.0f;
        this.zzj = 0.5f;
        this.zzk = 0.5f;
        this.zzl = false;
        this.zza = new a06(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzb = latLng;
        this.zzc = f;
        this.zzd = f2;
        this.zze = latLngBounds;
        this.zzf = f3;
        this.zzg = f4;
        this.zzh = z;
        this.zzi = f5;
        this.zzj = f6;
        this.zzk = f7;
        this.zzl = z2;
    }

    private final GroundOverlayOptions zza(LatLng latLng, float f, float f2) {
        this.zzb = latLng;
        this.zzc = f;
        this.zzd = f2;
        return this;
    }

    public GroundOverlayOptions anchor(float f, float f2) {
        this.zzj = f;
        this.zzk = f2;
        return this;
    }

    public GroundOverlayOptions bearing(float f) {
        this.zzf = ((f % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    public GroundOverlayOptions clickable(boolean z) {
        this.zzl = z;
        return this;
    }

    public float getAnchorU() {
        return this.zzj;
    }

    public float getAnchorV() {
        return this.zzk;
    }

    public float getBearing() {
        return this.zzf;
    }

    public LatLngBounds getBounds() {
        return this.zze;
    }

    public float getHeight() {
        return this.zzd;
    }

    public a06 getImage() {
        return this.zza;
    }

    public LatLng getLocation() {
        return this.zzb;
    }

    public float getTransparency() {
        return this.zzi;
    }

    public float getWidth() {
        return this.zzc;
    }

    public float getZIndex() {
        return this.zzg;
    }

    public GroundOverlayOptions image(a06 a06Var) {
        cvw.m(a06Var, "imageDescriptor must not be null");
        this.zza = a06Var;
        return this;
    }

    public boolean isClickable() {
        return this.zzl;
    }

    public boolean isVisible() {
        return this.zzh;
    }

    public GroundOverlayOptions position(LatLng latLng, float f, float f2) {
        cvw.n("Position has already been set using positionFromBounds", this.zze == null);
        cvw.d("Location must be specified", latLng != null);
        cvw.d("Width must be non-negative", f >= 0.0f);
        cvw.d("Height must be non-negative", f2 >= 0.0f);
        zza(latLng, f, f2);
        return this;
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds latLngBounds) {
        LatLng latLng = this.zzb;
        cvw.n("Position has already been set using position: ".concat(String.valueOf(latLng)), latLng == null);
        this.zze = latLngBounds;
        return this;
    }

    public GroundOverlayOptions transparency(float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        cvw.d("Transparency must be in the range [0..1]", z);
        this.zzi = f;
        return this;
    }

    public GroundOverlayOptions visible(boolean z) {
        this.zzh = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.a0(parcel, 2, this.zza.a.asBinder());
        bb1.f0(parcel, 3, getLocation(), i, false);
        float width = getWidth();
        bb1.m0(4, parcel, 4);
        parcel.writeFloat(width);
        float height = getHeight();
        bb1.m0(5, parcel, 4);
        parcel.writeFloat(height);
        bb1.f0(parcel, 6, getBounds(), i, false);
        float bearing = getBearing();
        bb1.m0(7, parcel, 4);
        parcel.writeFloat(bearing);
        float zIndex = getZIndex();
        bb1.m0(8, parcel, 4);
        parcel.writeFloat(zIndex);
        boolean isVisible = isVisible();
        bb1.m0(9, parcel, 4);
        parcel.writeInt(isVisible ? 1 : 0);
        float transparency = getTransparency();
        bb1.m0(10, parcel, 4);
        parcel.writeFloat(transparency);
        float anchorU = getAnchorU();
        bb1.m0(11, parcel, 4);
        parcel.writeFloat(anchorU);
        float anchorV = getAnchorV();
        bb1.m0(12, parcel, 4);
        parcel.writeFloat(anchorV);
        boolean isClickable = isClickable();
        bb1.m0(13, parcel, 4);
        parcel.writeInt(isClickable ? 1 : 0);
        bb1.o0(parcel, n0);
    }

    public GroundOverlayOptions zIndex(float f) {
        this.zzg = f;
        return this;
    }

    public GroundOverlayOptions position(LatLng latLng, float f) {
        cvw.n("Position has already been set using positionFromBounds", this.zze == null);
        cvw.d("Location must be specified", latLng != null);
        cvw.d("Width must be non-negative", f >= 0.0f);
        zza(latLng, f, -1.0f);
        return this;
    }

    public GroundOverlayOptions() {
        this.zzh = true;
        this.zzi = 0.0f;
        this.zzj = 0.5f;
        this.zzk = 0.5f;
        this.zzl = false;
    }
}
