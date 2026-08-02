package com.yandex.passport.common.ebs;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.wwg;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u00018BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001bJj\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001bJ\u0010\u0010'\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b'\u0010\u0019J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b4\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b5\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b6\u0010\u001b¨\u00069"}, d2 = {"Lcom/yandex/passport/common/ebs/BiometricAuthSdkProperties;", "Landroid/os/Parcelable;", "", "bioCollectionType", "tibUri", "consumerApiUri", "ebsUriTemplate", "redirectUri", "esiaSessionId", "sid", "esiaCookie", "trackId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/passport/common/ebs/BiometricAuthSdkProperties;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBioCollectionType", "getTibUri", "getConsumerApiUri", "getEbsUriTemplate", "getRedirectUri", "getEsiaSessionId", "getSid", "getEsiaCookie", "getTrackId", "Companion", "com/yandex/passport/common/ebs/a", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BiometricAuthSdkProperties implements Parcelable {
    public static final int $stable = 0;
    private static final String KEY_PROPERTIES = "biometric_auth_sdk_properties";
    private final String bioCollectionType;
    private final String consumerApiUri;
    private final String ebsUriTemplate;
    private final String esiaCookie;
    private final String esiaSessionId;
    private final String redirectUri;
    private final String sid;
    private final String tibUri;
    private final String trackId;
    public static final a Companion = new a();
    public static final Parcelable.Creator<BiometricAuthSdkProperties> CREATOR = new Creator();

    public BiometricAuthSdkProperties(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.bioCollectionType = str;
        this.tibUri = str2;
        this.consumerApiUri = str3;
        this.ebsUriTemplate = str4;
        this.redirectUri = str5;
        this.esiaSessionId = str6;
        this.sid = str7;
        this.esiaCookie = str8;
        this.trackId = str9;
    }

    public static /* synthetic */ BiometricAuthSdkProperties copy$default(BiometricAuthSdkProperties biometricAuthSdkProperties, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = biometricAuthSdkProperties.bioCollectionType;
        }
        if ((i & 2) != 0) {
            str2 = biometricAuthSdkProperties.tibUri;
        }
        if ((i & 4) != 0) {
            str3 = biometricAuthSdkProperties.consumerApiUri;
        }
        if ((i & 8) != 0) {
            str4 = biometricAuthSdkProperties.ebsUriTemplate;
        }
        if ((i & 16) != 0) {
            str5 = biometricAuthSdkProperties.redirectUri;
        }
        if ((i & 32) != 0) {
            str6 = biometricAuthSdkProperties.esiaSessionId;
        }
        if ((i & 64) != 0) {
            str7 = biometricAuthSdkProperties.sid;
        }
        if ((i & 128) != 0) {
            str8 = biometricAuthSdkProperties.esiaCookie;
        }
        if ((i & 256) != 0) {
            str9 = biometricAuthSdkProperties.trackId;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return biometricAuthSdkProperties.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBioCollectionType() {
        return this.bioCollectionType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTibUri() {
        return this.tibUri;
    }

    /* renamed from: component3, reason: from getter */
    public final String getConsumerApiUri() {
        return this.consumerApiUri;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEbsUriTemplate() {
        return this.ebsUriTemplate;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRedirectUri() {
        return this.redirectUri;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEsiaSessionId() {
        return this.esiaSessionId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    /* renamed from: component8, reason: from getter */
    public final String getEsiaCookie() {
        return this.esiaCookie;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    public final BiometricAuthSdkProperties copy(String bioCollectionType, String tibUri, String consumerApiUri, String ebsUriTemplate, String redirectUri, String esiaSessionId, String sid, String esiaCookie, String trackId) {
        return new BiometricAuthSdkProperties(bioCollectionType, tibUri, consumerApiUri, ebsUriTemplate, redirectUri, esiaSessionId, sid, esiaCookie, trackId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometricAuthSdkProperties)) {
            return false;
        }
        BiometricAuthSdkProperties biometricAuthSdkProperties = (BiometricAuthSdkProperties) other;
        return jl40.l(this.bioCollectionType, biometricAuthSdkProperties.bioCollectionType) && jl40.l(this.tibUri, biometricAuthSdkProperties.tibUri) && jl40.l(this.consumerApiUri, biometricAuthSdkProperties.consumerApiUri) && jl40.l(this.ebsUriTemplate, biometricAuthSdkProperties.ebsUriTemplate) && jl40.l(this.redirectUri, biometricAuthSdkProperties.redirectUri) && jl40.l(this.esiaSessionId, biometricAuthSdkProperties.esiaSessionId) && jl40.l(this.sid, biometricAuthSdkProperties.sid) && jl40.l(this.esiaCookie, biometricAuthSdkProperties.esiaCookie) && jl40.l(this.trackId, biometricAuthSdkProperties.trackId);
    }

    public final String getBioCollectionType() {
        return this.bioCollectionType;
    }

    public final String getConsumerApiUri() {
        return this.consumerApiUri;
    }

    public final String getEbsUriTemplate() {
        return this.ebsUriTemplate;
    }

    public final String getEsiaCookie() {
        return this.esiaCookie;
    }

    public final String getEsiaSessionId() {
        return this.esiaSessionId;
    }

    public final String getRedirectUri() {
        return this.redirectUri;
    }

    public final String getSid() {
        return this.sid;
    }

    public final String getTibUri() {
        return this.tibUri;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public int hashCode() {
        return this.trackId.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.bioCollectionType.hashCode() * 31, 31, this.tibUri), 31, this.consumerApiUri), 31, this.ebsUriTemplate), 31, this.redirectUri), 31, this.esiaSessionId), 31, this.sid), 31, this.esiaCookie);
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair(KEY_PROPERTIES, this));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BiometricAuthSdkProperties(bioCollectionType=");
        sb.append(this.bioCollectionType);
        sb.append(", tibUri=");
        sb.append(this.tibUri);
        sb.append(", consumerApiUri=");
        sb.append(this.consumerApiUri);
        sb.append(", ebsUriTemplate=");
        sb.append(this.ebsUriTemplate);
        sb.append(", redirectUri=");
        sb.append(this.redirectUri);
        sb.append(", esiaSessionId=");
        sb.append(this.esiaSessionId);
        sb.append(", sid=");
        sb.append(this.sid);
        sb.append(", esiaCookie=");
        sb.append(this.esiaCookie);
        sb.append(", trackId=");
        return b64.p(sb, this.trackId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.bioCollectionType);
        dest.writeString(this.tibUri);
        dest.writeString(this.consumerApiUri);
        dest.writeString(this.ebsUriTemplate);
        dest.writeString(this.redirectUri);
        dest.writeString(this.esiaSessionId);
        dest.writeString(this.sid);
        dest.writeString(this.esiaCookie);
        dest.writeString(this.trackId);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BiometricAuthSdkProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BiometricAuthSdkProperties createFromParcel(Parcel parcel) {
            return new BiometricAuthSdkProperties(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BiometricAuthSdkProperties[] newArray(int i) {
            return new BiometricAuthSdkProperties[i];
        }
    }
}
