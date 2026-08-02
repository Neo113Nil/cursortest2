package com.yandex.passport.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.kbs;
import defpackage.nzs;
import defpackage.xvz;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 52\u00020\u0001:\u00016Ba\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0013J\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u0013J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u0013J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\u0013J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(Jz\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010\u0013J\u0010\u0010,\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b,\u0010\u001cJ\u001a\u0010/\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u00102R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u00103R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u00103R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u00103R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u00102R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u00104¨\u00067"}, d2 = {"Lcom/yandex/passport/internal/LegacyExtraData;", "Landroid/os/Parcelable;", "", "uidValue", "", "displayName", "avatarUrl", "", "isAvatarEmpty", "isYandexoid", "isBetaTester", "diskPinCode", "mailPinCode", "updatedTimestamp", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;J)V", "with", "(Ljava/lang/Long;)Lcom/yandex/passport/internal/LegacyExtraData;", "serialize", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/Long;", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "component7", "component8", "component9", "()J", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;J)Lcom/yandex/passport/internal/LegacyExtraData;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "Ljava/lang/String;", "Ljava/lang/Boolean;", "J", "Companion", "com/yandex/passport/internal/f", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LegacyExtraData implements Parcelable {
    public static final int $stable = 8;
    private static final String SERIALIZATION_PREFIX = "@jsn";
    public final String avatarUrl;
    public String diskPinCode;
    public final String displayName;
    public final Boolean isAvatarEmpty;
    public final Boolean isBetaTester;
    public final Boolean isYandexoid;
    public String mailPinCode;
    public final Long uidValue;
    public long updatedTimestamp;
    public static final f Companion = new f();
    public static final Parcelable.Creator<LegacyExtraData> CREATOR = new Creator();

    public LegacyExtraData(Long l, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, String str4, long j) {
        this.uidValue = l;
        this.displayName = str;
        this.avatarUrl = str2;
        this.isAvatarEmpty = bool;
        this.isYandexoid = bool2;
        this.isBetaTester = bool3;
        this.diskPinCode = str3;
        this.mailPinCode = str4;
        this.updatedTimestamp = j;
    }

    public static /* synthetic */ LegacyExtraData copy$default(LegacyExtraData legacyExtraData, Long l, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            l = legacyExtraData.uidValue;
        }
        if ((i & 2) != 0) {
            str = legacyExtraData.displayName;
        }
        if ((i & 4) != 0) {
            str2 = legacyExtraData.avatarUrl;
        }
        if ((i & 8) != 0) {
            bool = legacyExtraData.isAvatarEmpty;
        }
        if ((i & 16) != 0) {
            bool2 = legacyExtraData.isYandexoid;
        }
        if ((i & 32) != 0) {
            bool3 = legacyExtraData.isBetaTester;
        }
        if ((i & 64) != 0) {
            str3 = legacyExtraData.diskPinCode;
        }
        if ((i & 128) != 0) {
            str4 = legacyExtraData.mailPinCode;
        }
        if ((i & 256) != 0) {
            j = legacyExtraData.updatedTimestamp;
        }
        long j2 = j;
        String str5 = str3;
        String str6 = str4;
        Boolean bool4 = bool2;
        Boolean bool5 = bool3;
        return legacyExtraData.copy(l, str, str2, bool, bool4, bool5, str5, str6, j2);
    }

    public static final LegacyExtraData from(String str) throws JSONException {
        Companion.getClass();
        return f.e(str);
    }

    public static final LegacyExtraData optionalFrom(String str) {
        Companion.getClass();
        return f.f(str);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getUidValue() {
        return this.uidValue;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsAvatarEmpty() {
        return this.isAvatarEmpty;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsYandexoid() {
        return this.isYandexoid;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsBetaTester() {
        return this.isBetaTester;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDiskPinCode() {
        return this.diskPinCode;
    }

    /* renamed from: component8, reason: from getter */
    public final String getMailPinCode() {
        return this.mailPinCode;
    }

    /* renamed from: component9, reason: from getter */
    public final long getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    public final LegacyExtraData copy(Long uidValue, String displayName, String avatarUrl, Boolean isAvatarEmpty, Boolean isYandexoid, Boolean isBetaTester, String diskPinCode, String mailPinCode, long updatedTimestamp) {
        return new LegacyExtraData(uidValue, displayName, avatarUrl, isAvatarEmpty, isYandexoid, isBetaTester, diskPinCode, mailPinCode, updatedTimestamp);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegacyExtraData)) {
            return false;
        }
        LegacyExtraData legacyExtraData = (LegacyExtraData) other;
        return jl40.l(this.uidValue, legacyExtraData.uidValue) && jl40.l(this.displayName, legacyExtraData.displayName) && jl40.l(this.avatarUrl, legacyExtraData.avatarUrl) && jl40.l(this.isAvatarEmpty, legacyExtraData.isAvatarEmpty) && jl40.l(this.isYandexoid, legacyExtraData.isYandexoid) && jl40.l(this.isBetaTester, legacyExtraData.isBetaTester) && jl40.l(this.diskPinCode, legacyExtraData.diskPinCode) && jl40.l(this.mailPinCode, legacyExtraData.mailPinCode) && this.updatedTimestamp == legacyExtraData.updatedTimestamp;
    }

    public int hashCode() {
        Long l = this.uidValue;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.displayName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatarUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isAvatarEmpty;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isYandexoid;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isBetaTester;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.diskPinCode;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mailPinCode;
        return Long.hashCode(this.updatedTimestamp) + ((hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String serialize() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.uidValue;
            if (l != null) {
                jSONObject.put("_uid", f.a(Companion, l.toString()));
            }
            String str = this.displayName;
            if (str != null && str.length() > 0) {
                jSONObject.put("_display_name", f.a(Companion, this.displayName));
            }
            String str2 = this.avatarUrl;
            if (str2 != null && str2.length() > 0) {
                jSONObject.put("_default_avatar", f.a(Companion, this.avatarUrl));
            }
            Boolean bool = this.isAvatarEmpty;
            if (bool != null) {
                jSONObject.put("_is_avatar_empty", f.a(Companion, Boolean.toString(bool.booleanValue())));
            }
            Boolean bool2 = this.isYandexoid;
            if (bool2 != null) {
                jSONObject.put("_is_staff", f.a(Companion, Boolean.toString(bool2.booleanValue())));
            }
            Boolean bool3 = this.isBetaTester;
            if (bool3 != null) {
                jSONObject.put("_is_beta_tester", f.a(Companion, Boolean.toString(bool3.booleanValue())));
            }
            String str3 = this.diskPinCode;
            if (str3 != null) {
                jSONObject.put("disk.pincode", f.a(Companion, str3));
            }
            String str4 = this.mailPinCode;
            if (str4 != null) {
                jSONObject.put("mail.pincode", f.a(Companion, str4));
            }
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject.length() > 0) {
                jSONObject2.put("extra_data", jSONObject);
            }
            return SERIALIZATION_PREFIX + jSONObject2;
        } catch (JSONException unused) {
            kbs.g("Json serialization has failed");
            return null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LegacyExtraData(uidValue=");
        sb.append(this.uidValue);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(", avatarUrl=");
        sb.append(this.avatarUrl);
        sb.append(", isAvatarEmpty=");
        sb.append(this.isAvatarEmpty);
        sb.append(", isYandexoid=");
        sb.append(this.isYandexoid);
        sb.append(", isBetaTester=");
        sb.append(this.isBetaTester);
        sb.append(", diskPinCode=");
        sb.append(this.diskPinCode);
        sb.append(", mailPinCode=");
        sb.append(this.mailPinCode);
        sb.append(", updatedTimestamp=");
        return b64.o(sb, this.updatedTimestamp, ')');
    }

    public final LegacyExtraData with(Long uidValue) {
        return new LegacyExtraData(uidValue, this.displayName, this.avatarUrl, this.isAvatarEmpty, this.isYandexoid, this.isBetaTester, this.diskPinCode, this.mailPinCode, this.updatedTimestamp);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Long l = this.uidValue;
        if (l == null) {
            dest.writeInt(0);
        } else {
            xvz.z(dest, 1, l);
        }
        dest.writeString(this.displayName);
        dest.writeString(this.avatarUrl);
        Boolean bool = this.isAvatarEmpty;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool);
        }
        Boolean bool2 = this.isYandexoid;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool2);
        }
        Boolean bool3 = this.isBetaTester;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool3);
        }
        dest.writeString(this.diskPinCode);
        dest.writeString(this.mailPinCode);
        dest.writeLong(this.updatedTimestamp);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LegacyExtraData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LegacyExtraData createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean bool = null;
            Long valueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LegacyExtraData(valueOf3, readString, readString2, valueOf, valueOf2, bool, parcel.readString(), parcel.readString(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LegacyExtraData[] newArray(int i) {
            return new LegacyExtraData[i];
        }
    }
}
