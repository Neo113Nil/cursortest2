package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.bb1;
import defpackage.cvw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new zzl();
    private final List<LatLng> zza;
    private final List<List<LatLng>> zzb;
    private float zzc;
    private int zzd;
    private int zze;
    private float zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzj;
    private List<PatternItem> zzk;

    public PolygonOptions() {
        this.zzc = 10.0f;
        this.zzd = ModalContentViewContainer.BASE_SHADOW_COLOR;
        this.zze = 0;
        this.zzf = 0.0f;
        this.zzg = true;
        this.zzh = false;
        this.zzi = false;
        this.zzj = 0;
        this.zzk = null;
        this.zza = new ArrayList();
        this.zzb = new ArrayList();
    }

    public PolygonOptions add(LatLng... latLngArr) {
        cvw.m(latLngArr, "points must not be null.");
        this.zza.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public PolygonOptions addAll(Iterable<LatLng> iterable) {
        cvw.m(iterable, "points must not be null.");
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.zza.add(it.next());
        }
        return this;
    }

    public PolygonOptions addHole(Iterable<LatLng> iterable) {
        cvw.m(iterable, "points must not be null.");
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.zzb.add(arrayList);
        return this;
    }

    public PolygonOptions clickable(boolean z) {
        this.zzi = z;
        return this;
    }

    public PolygonOptions fillColor(int i) {
        this.zze = i;
        return this;
    }

    public PolygonOptions geodesic(boolean z) {
        this.zzh = z;
        return this;
    }

    public int getFillColor() {
        return this.zze;
    }

    public List<List<LatLng>> getHoles() {
        return this.zzb;
    }

    public List<LatLng> getPoints() {
        return this.zza;
    }

    public int getStrokeColor() {
        return this.zzd;
    }

    public int getStrokeJointType() {
        return this.zzj;
    }

    public List<PatternItem> getStrokePattern() {
        return this.zzk;
    }

    public float getStrokeWidth() {
        return this.zzc;
    }

    public float getZIndex() {
        return this.zzf;
    }

    public boolean isClickable() {
        return this.zzi;
    }

    public boolean isGeodesic() {
        return this.zzh;
    }

    public boolean isVisible() {
        return this.zzg;
    }

    public PolygonOptions strokeColor(int i) {
        this.zzd = i;
        return this;
    }

    public PolygonOptions strokeJointType(int i) {
        this.zzj = i;
        return this;
    }

    public PolygonOptions strokePattern(List<PatternItem> list) {
        this.zzk = list;
        return this;
    }

    public PolygonOptions strokeWidth(float f) {
        this.zzc = f;
        return this;
    }

    public PolygonOptions visible(boolean z) {
        this.zzg = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.k0(parcel, 2, getPoints(), false);
        List<List<LatLng>> list = this.zzb;
        if (list != null) {
            int n02 = bb1.n0(parcel, 3);
            parcel.writeList(list);
            bb1.o0(parcel, n02);
        }
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
        boolean isGeodesic = isGeodesic();
        bb1.m0(9, parcel, 4);
        parcel.writeInt(isGeodesic ? 1 : 0);
        boolean isClickable = isClickable();
        bb1.m0(10, parcel, 4);
        parcel.writeInt(isClickable ? 1 : 0);
        int strokeJointType = getStrokeJointType();
        bb1.m0(11, parcel, 4);
        parcel.writeInt(strokeJointType);
        bb1.k0(parcel, 12, getStrokePattern(), false);
        bb1.o0(parcel, n0);
    }

    public PolygonOptions zIndex(float f) {
        this.zzf = f;
        return this;
    }

    public PolygonOptions add(LatLng latLng) {
        cvw.m(latLng, "point must not be null.");
        this.zza.add(latLng);
        return this;
    }

    public PolygonOptions(List<LatLng> list, List list2, float f, int i, int i2, float f2, boolean z, boolean z2, boolean z3, int i3, List<PatternItem> list3) {
        this.zza = list;
        this.zzb = list2;
        this.zzc = f;
        this.zzd = i;
        this.zze = i2;
        this.zzf = f2;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = i3;
        this.zzk = list3;
    }
}
