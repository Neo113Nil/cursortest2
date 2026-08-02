package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ag70;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.ooc;
import defpackage.r530;
import defpackage.rvr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes11.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new zac();
    private static final Comparator zaa = rvr.z;
    private final List zab;
    private final boolean zac;
    private final String zad;
    private final String zae;

    public ApiFeatureRequest(List list, boolean z, String str, String str2) {
        cvw.l(list);
        this.zab = list;
        this.zac = z;
        this.zad = str;
        this.zae = str2;
    }

    public static ApiFeatureRequest fromModuleInstallRequest(r530 r530Var) {
        return zaa(r530Var.a, true);
    }

    public static ApiFeatureRequest zaa(List list, boolean z) {
        TreeSet treeSet = new TreeSet(zaa);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((ag70) it.next()).a());
        }
        return new ApiFeatureRequest(new ArrayList(treeSet), z, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.zac == apiFeatureRequest.zac && ooc.m(this.zab, apiFeatureRequest.zab) && ooc.m(this.zad, apiFeatureRequest.zad) && ooc.m(this.zae, apiFeatureRequest.zae);
    }

    public List<Feature> getApiFeatures() {
        return this.zab;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zac), this.zab, this.zad, this.zae});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.k0(parcel, 1, getApiFeatures(), false);
        boolean z = this.zac;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.g0(parcel, 3, this.zad, false);
        bb1.g0(parcel, 4, this.zae, false);
        bb1.o0(parcel, n0);
    }
}
