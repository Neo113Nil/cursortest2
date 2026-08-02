package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.bb1;
import defpackage.kjz;
import defpackage.qna1;
import defpackage.x2i0;

/* loaded from: classes11.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new zzab();
    private Boolean zza;
    private Boolean zzb;
    private int zzc;
    private CameraPosition zzd;
    private Boolean zze;
    private Boolean zzf;
    private Boolean zzg;
    private Boolean zzh;
    private Boolean zzi;
    private Boolean zzj;
    private Boolean zzk;
    private Boolean zzl;
    private Boolean zzm;
    private Float zzn;
    private Float zzo;
    private LatLngBounds zzp;
    private Boolean zzq;
    private Integer zzr;
    private String zzs;

    public GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12, Integer num, String str) {
        this.zzc = -1;
        this.zzn = null;
        this.zzo = null;
        this.zzp = null;
        this.zzr = null;
        this.zzs = null;
        this.zza = qna1.j(b);
        this.zzb = qna1.j(b2);
        this.zzc = i;
        this.zzd = cameraPosition;
        this.zze = qna1.j(b3);
        this.zzf = qna1.j(b4);
        this.zzg = qna1.j(b5);
        this.zzh = qna1.j(b6);
        this.zzi = qna1.j(b7);
        this.zzj = qna1.j(b8);
        this.zzk = qna1.j(b9);
        this.zzl = qna1.j(b10);
        this.zzm = qna1.j(b11);
        this.zzn = f;
        this.zzo = f2;
        this.zzp = latLngBounds;
        this.zzq = qna1.j(b12);
        this.zzr = num;
        this.zzs = str;
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, x2i0.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(x2i0.MapAttrs_mapType)) {
            googleMapOptions.mapType(obtainAttributes.getInt(x2i0.MapAttrs_mapType, -1));
        }
        if (obtainAttributes.hasValue(x2i0.MapAttrs_zOrderOnTop)) {
            googleMapOptions.zOrderOnTop(obtainAttributes.getBoolean(x2i0.MapAttrs_zOrderOnTop, false));
        }
        if (obtainAttributes.hasValue(x2i0.MapAttrs_useViewLifecycle)) {
            googleMapOptions.useViewLifecycleInFragment(obtainAttributes.getBoolean(x2i0.MapAttrs_useViewLifecycle, false));
        }
        if (obtainAttributes.hasValue(x2i0.MapAttrs_uiCompass)) {
            googleMapOptions.compassEnabled(obtainAttributes.getBoolean(x2i0.MapAttrs_uiCompass, true));
        }
        if (obtainAttributes.hasValue(x2i0.MapAttrs_uiRotateGestures)) {
            googleMapOptions.rotateGesturesEnabled(obtainAttributes.getBoolean(x2i0.MapAttrs_uiRotateGestures, true));
        }
        if (obtainAttributes.hasValue(x2i0.MapAttrs_uiScrollGesturesDuringRotateOrZoom)) {
            googleMapOptions.scrollGesturesEnabledDuringRotateOrZoom(obtainAttributes.getBoolean(x2i0.MapAttrs_uiScrollGesturesDuringRotateOrZoom, true));
        }
        if (obtainAttributes.hasValue(x2i0.MapAttrs_uiScrollGestures)) {
            googleMapOptions.scrollGesturesEnabled(obtainAttributes.getBoolean(x2i0.MapAttrs_uiScrollGestures, true));
        }
        if (obtainAttributes.hasValue(x2i0.MapAttrs_uiTiltGestures)) {
            googleMapOptions.tiltGesturesEnabled(obtainAttributes.getBoolean(x2i0.MapAttrs_uiTiltGestures, true));
        }
        if (obtainAttributes.hasValue(x2i0.MapAttrs_uiZoomGestures)) {
            googleMapOptions.zoomGesturesEnabled(obtainAttributes.getBoolean(x2i0.MapAttrs_uiZoomGestures, true));
        }
        if (obtainAttributes.hasValue(x2i0.MapAttrs_uiZoomControls)) {
            googleMapOptions.zoomControlsEnabled(obtainAttributes.getBoolean(x2i0.MapAttrs_uiZoomControls, true));
        }
        if (obtainAttributes.hasValue(x2i0.MapAttrs_liteMode)) {
            googleMapOptions.liteMode(obtainAttributes.getBoolean(x2i0.MapAttrs_liteMode, false));
        }
        if (obtainAttributes.hasValue(x2i0.MapAttrs_uiMapToolbar)) {
            googleMapOptions.mapToolbarEnabled(obtainAttributes.getBoolean(x2i0.MapAttrs_uiMapToolbar, true));
        }
        if (obtainAttributes.hasValue(x2i0.MapAttrs_ambientEnabled)) {
            googleMapOptions.ambientEnabled(obtainAttributes.getBoolean(x2i0.MapAttrs_ambientEnabled, false));
        }
        if (obtainAttributes.hasValue(x2i0.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.minZoomPreference(obtainAttributes.getFloat(x2i0.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(x2i0.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.maxZoomPreference(obtainAttributes.getFloat(x2i0.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, new int[]{zzc(context, UrbanAdsBottomSheetFragment.BACKGROUND_COLOR), zzc(context, "mapId")});
        if (obtainAttributes2.hasValue(0)) {
            googleMapOptions.backgroundColor(Integer.valueOf(obtainAttributes2.getColor(0, 0)));
        }
        if (obtainAttributes2.hasValue(1) && (string = obtainAttributes2.getString(1)) != null && !string.isEmpty()) {
            googleMapOptions.mapId(string);
        }
        obtainAttributes2.recycle();
        googleMapOptions.latLngBoundsForCameraTarget(zzb(context, attributeSet));
        googleMapOptions.camera(zza(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public static CameraPosition zza(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, x2i0.MapAttrs);
        LatLng latLng = new LatLng(obtainAttributes.hasValue(x2i0.MapAttrs_cameraTargetLat) ? obtainAttributes.getFloat(x2i0.MapAttrs_cameraTargetLat, 0.0f) : 0.0f, obtainAttributes.hasValue(x2i0.MapAttrs_cameraTargetLng) ? obtainAttributes.getFloat(x2i0.MapAttrs_cameraTargetLng, 0.0f) : 0.0f);
        CameraPosition.a builder = CameraPosition.builder();
        builder.getClass();
        builder.a = latLng;
        if (obtainAttributes.hasValue(x2i0.MapAttrs_cameraZoom)) {
            builder.b = obtainAttributes.getFloat(x2i0.MapAttrs_cameraZoom, 0.0f);
        }
        if (obtainAttributes.hasValue(x2i0.MapAttrs_cameraBearing)) {
            builder.d = obtainAttributes.getFloat(x2i0.MapAttrs_cameraBearing, 0.0f);
        }
        if (obtainAttributes.hasValue(x2i0.MapAttrs_cameraTilt)) {
            builder.c = obtainAttributes.getFloat(x2i0.MapAttrs_cameraTilt, 0.0f);
        }
        obtainAttributes.recycle();
        return new CameraPosition(builder.a, builder.b, builder.c, builder.d);
    }

    public static LatLngBounds zzb(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, x2i0.MapAttrs);
        Float valueOf = obtainAttributes.hasValue(x2i0.MapAttrs_latLngBoundsSouthWestLatitude) ? Float.valueOf(obtainAttributes.getFloat(x2i0.MapAttrs_latLngBoundsSouthWestLatitude, 0.0f)) : null;
        Float valueOf2 = obtainAttributes.hasValue(x2i0.MapAttrs_latLngBoundsSouthWestLongitude) ? Float.valueOf(obtainAttributes.getFloat(x2i0.MapAttrs_latLngBoundsSouthWestLongitude, 0.0f)) : null;
        Float valueOf3 = obtainAttributes.hasValue(x2i0.MapAttrs_latLngBoundsNorthEastLatitude) ? Float.valueOf(obtainAttributes.getFloat(x2i0.MapAttrs_latLngBoundsNorthEastLatitude, 0.0f)) : null;
        Float valueOf4 = obtainAttributes.hasValue(x2i0.MapAttrs_latLngBoundsNorthEastLongitude) ? Float.valueOf(obtainAttributes.getFloat(x2i0.MapAttrs_latLngBoundsNorthEastLongitude, 0.0f)) : null;
        obtainAttributes.recycle();
        if (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(valueOf.floatValue(), valueOf2.floatValue()), new LatLng(valueOf3.floatValue(), valueOf4.floatValue()));
    }

    private static int zzc(Context context, String str) {
        return context.getResources().getIdentifier(str, "attr", context.getPackageName());
    }

    public GoogleMapOptions ambientEnabled(boolean z) {
        this.zzm = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions backgroundColor(Integer num) {
        this.zzr = num;
        return this;
    }

    public GoogleMapOptions camera(CameraPosition cameraPosition) {
        this.zzd = cameraPosition;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean z) {
        this.zzf = Boolean.valueOf(z);
        return this;
    }

    public Boolean getAmbientEnabled() {
        return this.zzm;
    }

    public Integer getBackgroundColor() {
        return this.zzr;
    }

    public CameraPosition getCamera() {
        return this.zzd;
    }

    public Boolean getCompassEnabled() {
        return this.zzf;
    }

    public LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.zzp;
    }

    public Boolean getLiteMode() {
        return this.zzk;
    }

    public String getMapId() {
        return this.zzs;
    }

    public Boolean getMapToolbarEnabled() {
        return this.zzl;
    }

    public int getMapType() {
        return this.zzc;
    }

    public Float getMaxZoomPreference() {
        return this.zzo;
    }

    public Float getMinZoomPreference() {
        return this.zzn;
    }

    public Boolean getRotateGesturesEnabled() {
        return this.zzj;
    }

    public Boolean getScrollGesturesEnabled() {
        return this.zzg;
    }

    public Boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.zzq;
    }

    public Boolean getTiltGesturesEnabled() {
        return this.zzi;
    }

    public Boolean getUseViewLifecycleInFragment() {
        return this.zzb;
    }

    public Boolean getZOrderOnTop() {
        return this.zza;
    }

    public Boolean getZoomControlsEnabled() {
        return this.zze;
    }

    public Boolean getZoomGesturesEnabled() {
        return this.zzh;
    }

    public GoogleMapOptions latLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
        this.zzp = latLngBounds;
        return this;
    }

    public GoogleMapOptions liteMode(boolean z) {
        this.zzk = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions mapId(String str) {
        this.zzs = str;
        return this;
    }

    public GoogleMapOptions mapToolbarEnabled(boolean z) {
        this.zzl = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions mapType(int i) {
        this.zzc = i;
        return this;
    }

    public GoogleMapOptions maxZoomPreference(float f) {
        this.zzo = Float.valueOf(f);
        return this;
    }

    public GoogleMapOptions minZoomPreference(float f) {
        this.zzn = Float.valueOf(f);
        return this;
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean z) {
        this.zzj = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean z) {
        this.zzg = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabledDuringRotateOrZoom(boolean z) {
        this.zzq = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean z) {
        this.zzi = Boolean.valueOf(z);
        return this;
    }

    public String toString() {
        kjz kjzVar = new kjz(this);
        kjzVar.b(Integer.valueOf(this.zzc), "MapType");
        kjzVar.b(this.zzk, "LiteMode");
        kjzVar.b(this.zzd, "Camera");
        kjzVar.b(this.zzf, "CompassEnabled");
        kjzVar.b(this.zze, "ZoomControlsEnabled");
        kjzVar.b(this.zzg, "ScrollGesturesEnabled");
        kjzVar.b(this.zzh, "ZoomGesturesEnabled");
        kjzVar.b(this.zzi, "TiltGesturesEnabled");
        kjzVar.b(this.zzj, "RotateGesturesEnabled");
        kjzVar.b(this.zzq, "ScrollGesturesEnabledDuringRotateOrZoom");
        kjzVar.b(this.zzl, "MapToolbarEnabled");
        kjzVar.b(this.zzm, "AmbientEnabled");
        kjzVar.b(this.zzn, "MinZoomPreference");
        kjzVar.b(this.zzo, "MaxZoomPreference");
        kjzVar.b(this.zzr, "BackgroundColor");
        kjzVar.b(this.zzp, "LatLngBoundsForCameraTarget");
        kjzVar.b(this.zza, "ZOrderOnTop");
        kjzVar.b(this.zzb, "UseViewLifecycleInFragment");
        return kjzVar.toString();
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean z) {
        this.zzb = Boolean.valueOf(z);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        byte i2 = qna1.i(this.zza);
        bb1.m0(2, parcel, 4);
        parcel.writeInt(i2);
        byte i3 = qna1.i(this.zzb);
        bb1.m0(3, parcel, 4);
        parcel.writeInt(i3);
        int mapType = getMapType();
        bb1.m0(4, parcel, 4);
        parcel.writeInt(mapType);
        bb1.f0(parcel, 5, getCamera(), i, false);
        byte i4 = qna1.i(this.zze);
        bb1.m0(6, parcel, 4);
        parcel.writeInt(i4);
        byte i5 = qna1.i(this.zzf);
        bb1.m0(7, parcel, 4);
        parcel.writeInt(i5);
        byte i6 = qna1.i(this.zzg);
        bb1.m0(8, parcel, 4);
        parcel.writeInt(i6);
        byte i7 = qna1.i(this.zzh);
        bb1.m0(9, parcel, 4);
        parcel.writeInt(i7);
        byte i8 = qna1.i(this.zzi);
        bb1.m0(10, parcel, 4);
        parcel.writeInt(i8);
        byte i9 = qna1.i(this.zzj);
        bb1.m0(11, parcel, 4);
        parcel.writeInt(i9);
        byte i10 = qna1.i(this.zzk);
        bb1.m0(12, parcel, 4);
        parcel.writeInt(i10);
        byte i11 = qna1.i(this.zzl);
        bb1.m0(14, parcel, 4);
        parcel.writeInt(i11);
        byte i12 = qna1.i(this.zzm);
        bb1.m0(15, parcel, 4);
        parcel.writeInt(i12);
        bb1.Z(parcel, 16, getMinZoomPreference());
        bb1.Z(parcel, 17, getMaxZoomPreference());
        bb1.f0(parcel, 18, getLatLngBoundsForCameraTarget(), i, false);
        byte i13 = qna1.i(this.zzq);
        bb1.m0(19, parcel, 4);
        parcel.writeInt(i13);
        bb1.d0(parcel, 20, getBackgroundColor());
        bb1.g0(parcel, 21, getMapId(), false);
        bb1.o0(parcel, n0);
    }

    public GoogleMapOptions zOrderOnTop(boolean z) {
        this.zza = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean z) {
        this.zze = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean z) {
        this.zzh = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions() {
        this.zzc = -1;
        this.zzn = null;
        this.zzo = null;
        this.zzp = null;
        this.zzr = null;
        this.zzs = null;
    }
}
