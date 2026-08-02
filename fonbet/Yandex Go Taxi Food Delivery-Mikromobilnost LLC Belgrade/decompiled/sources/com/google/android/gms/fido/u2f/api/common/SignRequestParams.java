package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.ooc;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Deprecated
/* loaded from: classes11.dex */
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new zzk();
    public static final int MAX_DISPLAY_HINT_LENGTH = 80;
    private final Integer zza;
    private final Double zzb;
    private final Uri zzc;
    private final byte[] zzd;
    private final List zze;
    private final ChannelIdValue zzf;
    private final String zzg;
    private final Set zzh;

    public SignRequestParams(Integer num, Double d, Uri uri, byte[] bArr, List list, ChannelIdValue channelIdValue, String str) {
        this.zza = num;
        this.zzb = d;
        this.zzc = uri;
        this.zzd = bArr;
        this.zze = list;
        this.zzf = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RegisteredKey registeredKey = (RegisteredKey) it.next();
                cvw.d("registered key has null appId and no request appId is provided", (registeredKey.getAppId() == null && uri == null) ? false : true);
                registeredKey.getChallengeValue();
                if (registeredKey.getAppId() != null) {
                    hashSet.add(Uri.parse(registeredKey.getAppId()));
                }
            }
        }
        this.zzh = hashSet;
        cvw.d("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.zzg = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        return ooc.m(this.zza, signRequestParams.zza) && ooc.m(this.zzb, signRequestParams.zzb) && ooc.m(this.zzc, signRequestParams.zzc) && Arrays.equals(this.zzd, signRequestParams.zzd) && this.zze.containsAll(signRequestParams.zze) && signRequestParams.zze.containsAll(this.zze) && ooc.m(this.zzf, signRequestParams.zzf) && ooc.m(this.zzg, signRequestParams.zzg);
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public Set<Uri> getAllAppIds() {
        return this.zzh;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public Uri getAppId() {
        return this.zzc;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public ChannelIdValue getChannelIdValue() {
        return this.zzf;
    }

    public byte[] getDefaultSignChallenge() {
        return this.zzd;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public String getDisplayHint() {
        return this.zzg;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public List<RegisteredKey> getRegisteredKeys() {
        return this.zze;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public Integer getRequestId() {
        return this.zza;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public Double getTimeoutSeconds() {
        return this.zzb;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzc, this.zzb, this.zze, this.zzf, this.zzg, Integer.valueOf(Arrays.hashCode(this.zzd))});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.d0(parcel, 2, getRequestId());
        bb1.X(parcel, 3, getTimeoutSeconds());
        bb1.f0(parcel, 4, getAppId(), i, false);
        bb1.V(parcel, 5, getDefaultSignChallenge(), false);
        bb1.k0(parcel, 6, getRegisteredKeys(), false);
        bb1.f0(parcel, 7, getChannelIdValue(), i, false);
        bb1.g0(parcel, 8, getDisplayHint(), false);
        bb1.o0(parcel, n0);
    }
}
