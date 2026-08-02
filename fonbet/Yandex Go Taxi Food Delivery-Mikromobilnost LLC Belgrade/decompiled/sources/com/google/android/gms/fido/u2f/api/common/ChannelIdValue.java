package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.yci0;
import org.json.JSONException;
import org.json.JSONObject;
import ru.CryptoPro.reprov.x509.ReasonFlags;

@Deprecated
/* loaded from: classes11.dex */
public class ChannelIdValue extends AbstractSafeParcelable {
    private final ChannelIdValueType zza;
    private final String zzb;
    private final String zzc;
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = new zzb();
    public static final ChannelIdValue ABSENT = new ChannelIdValue();
    public static final ChannelIdValue UNAVAILABLE = new ChannelIdValue("unavailable");
    public static final ChannelIdValue UNUSED = new ChannelIdValue(ReasonFlags.UNUSED);

    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);

        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = new zza();
        private final int zzb;

        ChannelIdValueType(int i) {
            this.zzb = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.zzb);
        }
    }

    public static class UnsupportedChannelIdValueTypeException extends Exception {
    }

    public ChannelIdValue(int i, String str, String str2) {
        try {
            this.zza = toChannelIdValueType(i);
            this.zzb = str;
            this.zzc = str2;
        } catch (UnsupportedChannelIdValueTypeException e) {
            yci0.r(e);
            throw null;
        }
    }

    public static ChannelIdValueType toChannelIdValueType(int i) throws UnsupportedChannelIdValueTypeException {
        for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
            if (i == channelIdValueType.zzb) {
                return channelIdValueType;
            }
        }
        throw new UnsupportedChannelIdValueTypeException(oyr.j(i, "ChannelIdValueType ", " not supported"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj;
        if (!this.zza.equals(channelIdValue.zza)) {
            return false;
        }
        int ordinal = this.zza.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return this.zzb.equals(channelIdValue.zzb);
        }
        if (ordinal != 2) {
            return false;
        }
        return this.zzc.equals(channelIdValue.zzc);
    }

    public JSONObject getObjectValue() {
        if (this.zzc == null) {
            return null;
        }
        try {
            return new JSONObject(this.zzc);
        } catch (JSONException e) {
            ny61.j(e);
            return null;
        }
    }

    public String getObjectValueAsString() {
        return this.zzc;
    }

    public String getStringValue() {
        return this.zzb;
    }

    public ChannelIdValueType getType() {
        return this.zza;
    }

    public int getTypeAsInt() {
        return this.zza.zzb;
    }

    public int hashCode() {
        int i;
        int hashCode;
        int hashCode2 = this.zza.hashCode() + 31;
        int ordinal = this.zza.ordinal();
        if (ordinal == 1) {
            i = hashCode2 * 31;
            hashCode = this.zzb.hashCode();
        } else {
            if (ordinal != 2) {
                return hashCode2;
            }
            i = hashCode2 * 31;
            hashCode = this.zzc.hashCode();
        }
        return hashCode + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int typeAsInt = getTypeAsInt();
        bb1.m0(2, parcel, 4);
        parcel.writeInt(typeAsInt);
        bb1.g0(parcel, 3, getStringValue(), false);
        bb1.g0(parcel, 4, getObjectValueAsString(), false);
        bb1.o0(parcel, n0);
    }

    private ChannelIdValue() {
        this.zza = ChannelIdValueType.ABSENT;
        this.zzc = null;
        this.zzb = null;
    }

    private ChannelIdValue(String str) {
        cvw.l(str);
        this.zzb = str;
        this.zza = ChannelIdValueType.STRING;
        this.zzc = null;
    }

    public ChannelIdValue(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        cvw.l(jSONObject2);
        this.zzc = jSONObject2;
        this.zza = ChannelIdValueType.OBJECT;
        this.zzb = null;
    }
}
