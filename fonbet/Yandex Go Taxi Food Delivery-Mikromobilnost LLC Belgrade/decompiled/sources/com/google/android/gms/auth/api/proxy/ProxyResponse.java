package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new zzb();
    public static final int STATUS_CODE_NO_CONNECTION = -1;
    public final byte[] body;
    public final int googlePlayServicesStatusCode;
    public final PendingIntent recoveryAction;
    public final int statusCode;
    final int zza;
    final Bundle zzb;

    public ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.zza = i;
        this.googlePlayServicesStatusCode = i2;
        this.statusCode = i3;
        this.zzb = bundle;
        this.body = bArr;
        this.recoveryAction = pendingIntent;
    }

    public static ProxyResponse createErrorProxyResponse(int i, PendingIntent pendingIntent, int i2, Map<String, String> map, byte[] bArr) {
        return new ProxyResponse(1, i, pendingIntent, i2, zza(map), bArr);
    }

    private static Bundle zza(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return bundle;
    }

    public Map<String, String> getHeaders() {
        if (this.zzb == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap();
        for (String str : this.zzb.keySet()) {
            hashMap.put(str, this.zzb.getString(str));
        }
        return hashMap;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.googlePlayServicesStatusCode;
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        bb1.f0(parcel, 2, this.recoveryAction, i, false);
        int i3 = this.statusCode;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(i3);
        bb1.U(parcel, 4, this.zzb, false);
        bb1.V(parcel, 5, this.body, false);
        int i4 = this.zza;
        bb1.m0(1000, parcel, 4);
        parcel.writeInt(i4);
        bb1.o0(parcel, n0);
    }

    public ProxyResponse(int i, PendingIntent pendingIntent, int i2, Bundle bundle, byte[] bArr) {
        this(1, i, pendingIntent, i2, bundle, bArr);
    }

    public ProxyResponse(int i, Map<String, String> map, byte[] bArr) {
        this(1, 0, null, i, zza(map), bArr);
    }
}
