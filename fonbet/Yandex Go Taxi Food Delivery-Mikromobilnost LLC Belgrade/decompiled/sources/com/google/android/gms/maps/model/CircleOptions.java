package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.bb1;
import defpackage.cvw;
import java.util.List;

/* loaded from: classes11.dex */
public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CircleOptions> CREATOR = new zzc();
    private LatLng zza;
    private double zzb;
    private float zzc;
    private int zzd;
    private int zze;
    private float zzf;
    private boolean zzg;
    private boolean zzh;
    private List<PatternItem> zzi;

    public CircleOptions() {
        this.zza = null;
        this.zzb = 0.0d;
        this.zzc = 10.0f;
        this.zzd = ModalContentViewContainer.BASE_SHADOW_COLOR;
        this.zze = 0;
        this.zzf = 0.0f;
        this.zzg = true;
        this.zzh = false;
        this.zzi = null;
    }

    public CircleOptions center(LatLng latLng) {
        cvw.m(latLng, "center must not be null.");
        this.zza = latLng;
        return this;
    }

    public CircleOptions clickable(boolean z) {
        this.zzh = z;
        return this;
    }

    public CircleOptions fillColor(int i) {
        this.zze = i;
        return this;
    }

    public LatLng getCenter() {
        return this.zza;
    }

    public int getFillColor() {
        return this.zze;
    }

    public double getRadius() {
        return this.zzb;
    }

    public int getStrokeColor() {
        return this.zzd;
    }

    public List<PatternItem> getStrokePattern() {
        return this.zzi;
    }

    public float getStrokeWidth() {
        return this.zzc;
    }

    public float getZIndex() {
        return this.zzf;
    }

    public boolean isClickable() {
        return this.zzh;
    }

    public boolean isVisible() {
        return this.zzg;
    }

    public CircleOptions radius(double d) {
        this.zzb = d;
        return this;
    }

    public CircleOptions strokeColor(int i) {
        this.zzd = i;
        return this;
    }

    public CircleOptions strokePattern(List<PatternItem> list) {
        this.zzi = list;
        return this;
    }

    public CircleOptions strokeWidth(float f) {
        this.zzc = f;
        return this;
    }

    public CircleOptions visible(boolean z) {
        this.zzg = z;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 2, getCenter(), i, false);
        double radius = getRadius();
        bb1.m0(3, parcel, 8);
        parcel.writeDouble(radius);
        float strokeWidth = getStrokeWidth();
        bb1.m0(4, parcel, 4);
        parcel.writeFloat(strokeWidth);
        int strokeColor = getStrokeColor();
        bb1.m0(5, parcel, 4);
        parcel.writeInt(strokeColor);
        int fillColor = getFillColor();
        bb1.m0(6, parcel, 4);
        parcel.writeInt(fillColor);
        float zIndex = getZIndex();
        bb1.m0(7, parcel, 4);
        parcel.writeFloat(zIndex);
        boolean isVisible = isVisible();
        bb1.m0(8, parcel, 4);
        parcel.writeInt(isVisible ? 1 : 0);
        boolean isClickable = isClickable();
        bb1.m0(9, parcel, 4);
        parcel.writeInt(isClickable ? 1 : 0);
        bb1.k0(parcel, 10, getStrokePattern(), false);
        bb1.o0(parcel, n0);
    }

    public CircleOptions zIndex(float f) {
        this.zzf = f;
        return this;
    }

    public CircleOptions(LatLng latLng, double d, float f, int i, int i2, float f2, boolean z, boolean z2, List<PatternItem> list) {
        this.zza = latLng;
        this.zzb = d;
        this.zzc = f;
        this.zzd = i;
        this.zze = i2;
        this.zzf = f2;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = list;
    }
}
