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
public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new zzm();
    private final List<LatLng> zza;
    private float zzb;
    private int zzc;
    private float zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private Cap zzh;
    private Cap zzi;
    private int zzj;
    private List<PatternItem> zzk;

    public PolylineOptions(List list, float f, int i, float f2, boolean z, boolean z2, boolean z3, Cap cap, Cap cap2, int i2, List<PatternItem> list2) {
        this.zzb = 10.0f;
        this.zzc = ModalContentViewContainer.BASE_SHADOW_COLOR;
        this.zzd = 0.0f;
        this.zze = true;
        this.zzf = false;
        this.zzg = false;
        this.zzh = new ButtCap();
        this.zzi = new ButtCap();
        this.zza = list;
        this.zzb = f;
        this.zzc = i;
        this.zzd = f2;
        this.zze = z;
        this.zzf = z2;
        this.zzg = z3;
        if (cap != null) {
            this.zzh = cap;
        }
        if (cap2 != null) {
            this.zzi = cap2;
        }
        this.zzj = i2;
        this.zzk = list2;
    }

    public PolylineOptions add(LatLng... latLngArr) {
        cvw.m(latLngArr, "points must not be null.");
        this.zza.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public PolylineOptions addAll(Iterable<LatLng> iterable) {
        cvw.m(iterable, "points must not be null.");
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.zza.add(it.next());
        }
        return this;
    }

    public PolylineOptions clickable(boolean z) {
        this.zzg = z;
        return this;
    }

    public PolylineOptions color(int i) {
        this.zzc = i;
        return this;
    }

    public PolylineOptions endCap(Cap cap) {
        cvw.m(cap, "endCap must not be null");
        this.zzi = cap;
        return this;
    }

    public PolylineOptions geodesic(boolean z) {
        this.zzf = z;
        return this;
    }

    public int getColor() {
        return this.zzc;
    }

    public Cap getEndCap() {
        return this.zzi;
    }

    public int getJointType() {
        return this.zzj;
    }

    public List<PatternItem> getPattern() {
        return this.zzk;
    }

    public List<LatLng> getPoints() {
        return this.zza;
    }

    public Cap getStartCap() {
        return this.zzh;
    }

    public float getWidth() {
        return this.zzb;
    }

    public float getZIndex() {
        return this.zzd;
    }

    public boolean isClickable() {
        return this.zzg;
    }

    public boolean isGeodesic() {
        return this.zzf;
    }

    public boolean isVisible() {
        return this.zze;
    }

    public PolylineOptions jointType(int i) {
        this.zzj = i;
        return this;
    }

    public PolylineOptions pattern(List<PatternItem> list) {
        this.zzk = list;
        return this;
    }

    public PolylineOptions startCap(Cap cap) {
        cvw.m(cap, "startCap must not be null");
        this.zzh = cap;
        return this;
    }

    public PolylineOptions visible(boolean z) {
        this.zze = z;
        return this;
    }

    public PolylineOptions width(float f) {
        this.zzb = f;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.k0(parcel, 2, getPoints(), false);
        float width = getWidth();
        bb1.m0(3, parcel, 4);
        parcel.writeFloat(width);
        int color = getColor();
        bb1.m0(4, parcel, 4);
        parcel.writeInt(color);
        float zIndex = getZIndex();
        bb1.m0(5, parcel, 4);
        parcel.writeFloat(zIndex);
        boolean isVisible = isVisible();
        bb1.m0(6, parcel, 4);
        parcel.writeInt(isVisible ? 1 : 0);
        boolean isGeodesic = isGeodesic();
        bb1.m0(7, parcel, 4);
        parcel.writeInt(isGeodesic ? 1 : 0);
        boolean isClickable = isClickable();
        bb1.m0(8, parcel, 4);
        parcel.writeInt(isClickable ? 1 : 0);
        bb1.f0(parcel, 9, getStartCap(), i, false);
        bb1.f0(parcel, 10, getEndCap(), i, false);
        int jointType = getJointType();
        bb1.m0(11, parcel, 4);
        parcel.writeInt(jointType);
        bb1.k0(parcel, 12, getPattern(), false);
        bb1.o0(parcel, n0);
    }

    public PolylineOptions zIndex(float f) {
        this.zzd = f;
        return this;
    }

    public PolylineOptions add(LatLng latLng) {
        cvw.m(this.zza, "point must not be null.");
        this.zza.add(latLng);
        return this;
    }

    public PolylineOptions() {
        this.zzb = 10.0f;
        this.zzc = ModalContentViewContainer.BASE_SHADOW_COLOR;
        this.zzd = 0.0f;
        this.zze = true;
        this.zzf = false;
        this.zzg = false;
        this.zzh = new ButtCap();
        this.zzi = new ButtCap();
        this.zzj = 0;
        this.zzk = null;
        this.zza = new ArrayList();
    }
}
