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
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new zzh();
    public static final int MAX_DISPLAY_HINT_LENGTH = 80;
    private final Integer zza;
    private final Double zzb;
    private final Uri zzc;
    private final List zzd;
    private final List zze;
    private final ChannelIdValue zzf;
    private final String zzg;
    private Set zzh;

    public RegisterRequestParams(Integer num, Double d, Uri uri, List list, List list2, ChannelIdValue channelIdValue, String str) {
        this.zza = num;
        this.zzb = d;
        this.zzc = uri;
        cvw.d("empty list of register requests is provided", (list == null || list.isEmpty()) ? false : true);
        this.zzd = list;
        this.zze = list2;
        this.zzf = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RegisterRequest registerRequest = (RegisterRequest) it.next();
            cvw.d("register request has null appId and no request appId is provided", (uri == null && registerRequest.getAppId() == null) ? false : true);
            if (registerRequest.getAppId() != null) {
                hashSet.add(Uri.parse(registerRequest.getAppId()));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it2.next();
            cvw.d("registered key has null appId and no request appId is provided", (uri == null && registeredKey.getAppId() == null) ? false : true);
            if (registeredKey.getAppId() != null) {
                hashSet.add(Uri.parse(registeredKey.getAppId()));
            }
        }
        this.zzh = hashSet;
        cvw.d("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.zzg = str;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        return ooc.m(this.zza, registerRequestParams.zza) && ooc.m(this.zzb, registerRequestParams.zzb) && ooc.m(this.zzc, registerRequestParams.zzc) && ooc.m(this.zzd, registerRequestParams.zzd) && (((list = this.zze) == null && registerRequestParams.zze == null) || (list != null && (list2 = registerRequestParams.zze) != null && list.containsAll(list2) && registerRequestParams.zze.containsAll(this.zze))) && ooc.m(this.zzf, registerRequestParams.zzf) && ooc.m(this.zzg, registerRequestParams.zzg);
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

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public String getDisplayHint() {
        return this.zzg;
    }

    public List<RegisterRequest> getRegisterRequests() {
        return this.zzd;
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
        return Arrays.hashCode(new Object[]{this.zza, this.zzc, this.zzb, this.zzd, this.zze, this.zzf, this.zzg});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.d0(parcel, 2, getRequestId());
        bb1.X(parcel, 3, getTimeoutSeconds());
        bb1.f0(parcel, 4, getAppId(), i, false);
        bb1.k0(parcel, 5, getRegisterRequests(), false);
        bb1.k0(parcel, 6, getRegisteredKeys(), false);
        bb1.f0(parcel, 7, getChannelIdValue(), i, false);
        bb1.g0(parcel, 8, getDisplayHint(), false);
        bb1.o0(parcel, n0);
    }
}
