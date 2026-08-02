package com.google.android.gms.auth.blockstore;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class RetrieveBytesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RetrieveBytesResponse> CREATOR = new zzd();

    @Deprecated
    private final Bundle zza;
    private final List zzb;
    private final Map zzc;

    public static class BlockstoreData extends AbstractSafeParcelable {
        public static final Parcelable.Creator<BlockstoreData> CREATOR = new zza();
        private final byte[] zza;
        private final String zzb;

        public BlockstoreData(byte[] bArr, String str) {
            this.zza = bArr;
            this.zzb = str;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof BlockstoreData)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.zza, ((BlockstoreData) obj).zza);
        }

        public byte[] getBytes() {
            return this.zza;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.zza))});
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int n0 = bb1.n0(parcel, 20293);
            bb1.V(parcel, 1, getBytes(), false);
            bb1.g0(parcel, 2, this.zzb, false);
            bb1.o0(parcel, n0);
        }

        public final String zza() {
            return this.zzb;
        }
    }

    public RetrieveBytesResponse(Bundle bundle, List list) {
        this.zza = bundle;
        this.zzb = list;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BlockstoreData blockstoreData = (BlockstoreData) it.next();
            hashMap.put(blockstoreData.zza(), blockstoreData);
        }
        this.zzc = hashMap;
    }

    public Map<String, BlockstoreData> getBlockstoreDataMap() {
        return Collections.unmodifiableMap(this.zzc);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.U(parcel, 1, bundle, false);
        bb1.k0(parcel, 2, this.zzb, false);
        bb1.o0(parcel, n0);
    }
}
