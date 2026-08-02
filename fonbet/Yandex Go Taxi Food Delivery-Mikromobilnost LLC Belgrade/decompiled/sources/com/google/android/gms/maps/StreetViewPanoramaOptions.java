package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;
import defpackage.bb1;
import defpackage.kjz;
import defpackage.qna1;

/* loaded from: classes11.dex */
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new zzap();
    private StreetViewPanoramaCamera zza;
    private String zzb;
    private LatLng zzc;
    private Integer zzd;
    private Boolean zze;
    private Boolean zzf;
    private Boolean zzg;
    private Boolean zzh;
    private Boolean zzi;
    private StreetViewSource zzj;

    public StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5, StreetViewSource streetViewSource) {
        Boolean bool = Boolean.TRUE;
        this.zze = bool;
        this.zzf = bool;
        this.zzg = bool;
        this.zzh = bool;
        this.zzj = StreetViewSource.DEFAULT;
        this.zza = streetViewPanoramaCamera;
        this.zzc = latLng;
        this.zzd = num;
        this.zzb = str;
        this.zze = qna1.j(b);
        this.zzf = qna1.j(b2);
        this.zzg = qna1.j(b3);
        this.zzh = qna1.j(b4);
        this.zzi = qna1.j(b5);
        this.zzj = streetViewSource;
    }

    public Boolean getPanningGesturesEnabled() {
        return this.zzg;
    }

    public String getPanoramaId() {
        return this.zzb;
    }

    public LatLng getPosition() {
        return this.zzc;
    }

    public Integer getRadius() {
        return this.zzd;
    }

    public StreetViewSource getSource() {
        return this.zzj;
    }

    public Boolean getStreetNamesEnabled() {
        return this.zzh;
    }

    public StreetViewPanoramaCamera getStreetViewPanoramaCamera() {
        return this.zza;
    }

    public Boolean getUseViewLifecycleInFragment() {
        return this.zzi;
    }

    public Boolean getUserNavigationEnabled() {
        return this.zze;
    }

    public Boolean getZoomGesturesEnabled() {
        return this.zzf;
    }

    public StreetViewPanoramaOptions panningGesturesEnabled(boolean z) {
        this.zzg = Boolean.valueOf(z);
        return this;
    }

    public StreetViewPanoramaOptions panoramaCamera(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.zza = streetViewPanoramaCamera;
        return this;
    }

    public StreetViewPanoramaOptions panoramaId(String str) {
        this.zzb = str;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latLng, Integer num, StreetViewSource streetViewSource) {
        this.zzc = latLng;
        this.zzd = num;
        this.zzj = streetViewSource;
        return this;
    }

    public StreetViewPanoramaOptions streetNamesEnabled(boolean z) {
        this.zzh = Boolean.valueOf(z);
        return this;
    }

    public String toString() {
        kjz kjzVar = new kjz(this);
        kjzVar.b(this.zzb, "PanoramaId");
        kjzVar.b(this.zzc, "Position");
        kjzVar.b(this.zzd, "Radius");
        kjzVar.b(this.zzj, "Source");
        kjzVar.b(this.zza, "StreetViewPanoramaCamera");
        kjzVar.b(this.zze, "UserNavigationEnabled");
        kjzVar.b(this.zzf, "ZoomGesturesEnabled");
        kjzVar.b(this.zzg, "PanningGesturesEnabled");
        kjzVar.b(this.zzh, "StreetNamesEnabled");
        kjzVar.b(this.zzi, "UseViewLifecycleInFragment");
        return kjzVar.toString();
    }

    public StreetViewPanoramaOptions useViewLifecycleInFragment(boolean z) {
        this.zzi = Boolean.valueOf(z);
        return this;
    }

    public StreetViewPanoramaOptions userNavigationEnabled(boolean z) {
        this.zze = Boolean.valueOf(z);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 2, getStreetViewPanoramaCamera(), i, false);
        bb1.g0(parcel, 3, getPanoramaId(), false);
        bb1.f0(parcel, 4, getPosition(), i, false);
        bb1.d0(parcel, 5, getRadius());
        byte i2 = qna1.i(this.zze);
        bb1.m0(6, parcel, 4);
        parcel.writeInt(i2);
        byte i3 = qna1.i(this.zzf);
        bb1.m0(7, parcel, 4);
        parcel.writeInt(i3);
        byte i4 = qna1.i(this.zzg);
        bb1.m0(8, parcel, 4);
        parcel.writeInt(i4);
        byte i5 = qna1.i(this.zzh);
        bb1.m0(9, parcel, 4);
        parcel.writeInt(i5);
        byte i6 = qna1.i(this.zzi);
        bb1.m0(10, parcel, 4);
        parcel.writeInt(i6);
        bb1.f0(parcel, 11, getSource(), i, false);
        bb1.o0(parcel, n0);
    }

    public StreetViewPanoramaOptions zoomGesturesEnabled(boolean z) {
        this.zzf = Boolean.valueOf(z);
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latLng, StreetViewSource streetViewSource) {
        this.zzc = latLng;
        this.zzj = streetViewSource;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latLng, Integer num) {
        this.zzc = latLng;
        this.zzd = num;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latLng) {
        this.zzc = latLng;
        return this;
    }

    public StreetViewPanoramaOptions() {
        Boolean bool = Boolean.TRUE;
        this.zze = bool;
        this.zzf = bool;
        this.zzg = bool;
        this.zzh = bool;
        this.zzj = StreetViewSource.DEFAULT;
    }
}
