package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public class RetrieveBytesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RetrieveBytesRequest> CREATOR = new zzc();
    private final List zza;
    private final boolean zzb;

    public RetrieveBytesRequest(List list, boolean z) {
        if (z) {
            boolean z2 = true;
            if (list != null && !list.isEmpty()) {
                z2 = false;
            }
            cvw.n("retrieveAll was set to true but other constraint(s) was also provided: keys", z2);
        }
        this.zzb = z;
        this.zza = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                cvw.j(str, "Element in keys cannot be null or empty");
                this.zza.add(str);
            }
        }
    }

    public List<String> getKeys() {
        return Collections.unmodifiableList(this.zza);
    }

    public boolean getRetrieveAll() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.i0(parcel, 1, getKeys());
        boolean retrieveAll = getRetrieveAll();
        bb1.m0(2, parcel, 4);
        parcel.writeInt(retrieveAll ? 1 : 0);
        bb1.o0(parcel, n0);
    }
}
