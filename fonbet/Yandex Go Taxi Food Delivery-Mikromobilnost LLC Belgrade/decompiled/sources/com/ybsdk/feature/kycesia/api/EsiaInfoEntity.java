package com.ybsdk.feature.kycesia.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/kycesia/api/EsiaInfoEntity;", "Landroid/os/Parcelable;", "Link", "LinkParts", "Lcom/ybsdk/feature/kycesia/api/EsiaInfoEntity$Link;", "Lcom/ybsdk/feature/kycesia/api/EsiaInfoEntity$LinkParts;", "feature-esia_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface EsiaInfoEntity extends Parcelable {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/kycesia/api/EsiaInfoEntity$Link;", "Lcom/ybsdk/feature/kycesia/api/EsiaInfoEntity;", "", "url", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/feature/kycesia/api/EsiaInfoEntity$Link;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "feature-esia_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Link implements EsiaInfoEntity {
        public static final Parcelable.Creator<Link> CREATOR = new Creator();
        private final String url;

        public Link(String str) {
            this.url = str;
        }

        public static /* synthetic */ Link copy$default(Link link, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = link.url;
            }
            return link.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final Link copy(String url) {
            return new Link(url);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Link) && jl40.l(this.url, ((Link) other).url);
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return oyr.p("Link(url=", this.url, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.url);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Link> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Link createFromParcel(Parcel parcel) {
                return new Link(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Link[] newArray(int i) {
                return new Link[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u001c\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0082\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\fHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001aJ\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010\u0018J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b5\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b6\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b7\u0010\u001aR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010$¨\u0006:"}, d2 = {"Lcom/ybsdk/feature/kycesia/api/EsiaInfoEntity$LinkParts;", "Lcom/ybsdk/feature/kycesia/api/EsiaInfoEntity;", "", "scope", ClidProvider.STATE, "clientId", ClidProvider.TIMESTAMP, "accessType", "redirectUri", "responseType", "clientSecret", "apiUrlOverride", "", "additionalParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/ybsdk/feature/kycesia/api/EsiaInfoEntity$LinkParts;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScope", "getState", "getClientId", "getTimestamp", "getAccessType", "getRedirectUri", "getResponseType", "getClientSecret", "getApiUrlOverride", "Ljava/util/Map;", "getAdditionalParams", "feature-esia_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkParts implements EsiaInfoEntity {
        public static final Parcelable.Creator<LinkParts> CREATOR = new Creator();
        private final String accessType;
        private final Map<String, String> additionalParams;
        private final String apiUrlOverride;
        private final String clientId;
        private final String clientSecret;
        private final String redirectUri;
        private final String responseType;
        private final String scope;
        private final String state;
        private final String timestamp;

        public LinkParts(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, String> map) {
            this.scope = str;
            this.state = str2;
            this.clientId = str3;
            this.timestamp = str4;
            this.accessType = str5;
            this.redirectUri = str6;
            this.responseType = str7;
            this.clientSecret = str8;
            this.apiUrlOverride = str9;
            this.additionalParams = map;
        }

        public static /* synthetic */ LinkParts copy$default(LinkParts linkParts, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = linkParts.scope;
            }
            if ((i & 2) != 0) {
                str2 = linkParts.state;
            }
            if ((i & 4) != 0) {
                str3 = linkParts.clientId;
            }
            if ((i & 8) != 0) {
                str4 = linkParts.timestamp;
            }
            if ((i & 16) != 0) {
                str5 = linkParts.accessType;
            }
            if ((i & 32) != 0) {
                str6 = linkParts.redirectUri;
            }
            if ((i & 64) != 0) {
                str7 = linkParts.responseType;
            }
            if ((i & 128) != 0) {
                str8 = linkParts.clientSecret;
            }
            if ((i & 256) != 0) {
                str9 = linkParts.apiUrlOverride;
            }
            if ((i & 512) != 0) {
                map = linkParts.additionalParams;
            }
            String str10 = str9;
            Map map2 = map;
            String str11 = str7;
            String str12 = str8;
            String str13 = str5;
            String str14 = str6;
            return linkParts.copy(str, str2, str3, str4, str13, str14, str11, str12, str10, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getScope() {
            return this.scope;
        }

        public final Map<String, String> component10() {
            return this.additionalParams;
        }

        /* renamed from: component2, reason: from getter */
        public final String getState() {
            return this.state;
        }

        /* renamed from: component3, reason: from getter */
        public final String getClientId() {
            return this.clientId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAccessType() {
            return this.accessType;
        }

        /* renamed from: component6, reason: from getter */
        public final String getRedirectUri() {
            return this.redirectUri;
        }

        /* renamed from: component7, reason: from getter */
        public final String getResponseType() {
            return this.responseType;
        }

        /* renamed from: component8, reason: from getter */
        public final String getClientSecret() {
            return this.clientSecret;
        }

        /* renamed from: component9, reason: from getter */
        public final String getApiUrlOverride() {
            return this.apiUrlOverride;
        }

        public final LinkParts copy(String scope, String state, String clientId, String timestamp, String accessType, String redirectUri, String responseType, String clientSecret, String apiUrlOverride, Map<String, String> additionalParams) {
            return new LinkParts(scope, state, clientId, timestamp, accessType, redirectUri, responseType, clientSecret, apiUrlOverride, additionalParams);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LinkParts)) {
                return false;
            }
            LinkParts linkParts = (LinkParts) other;
            return jl40.l(this.scope, linkParts.scope) && jl40.l(this.state, linkParts.state) && jl40.l(this.clientId, linkParts.clientId) && jl40.l(this.timestamp, linkParts.timestamp) && jl40.l(this.accessType, linkParts.accessType) && jl40.l(this.redirectUri, linkParts.redirectUri) && jl40.l(this.responseType, linkParts.responseType) && jl40.l(this.clientSecret, linkParts.clientSecret) && jl40.l(this.apiUrlOverride, linkParts.apiUrlOverride) && jl40.l(this.additionalParams, linkParts.additionalParams);
        }

        public final String getAccessType() {
            return this.accessType;
        }

        public final Map<String, String> getAdditionalParams() {
            return this.additionalParams;
        }

        public final String getApiUrlOverride() {
            return this.apiUrlOverride;
        }

        public final String getClientId() {
            return this.clientId;
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final String getRedirectUri() {
            return this.redirectUri;
        }

        public final String getResponseType() {
            return this.responseType;
        }

        public final String getScope() {
            return this.scope;
        }

        public final String getState() {
            return this.state;
        }

        public final String getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            int b = unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.scope.hashCode() * 31, 31, this.state), 31, this.clientId), 31, this.timestamp), 31, this.accessType), 31, this.redirectUri), 31, this.responseType), 31, this.clientSecret);
            String str = this.apiUrlOverride;
            return this.additionalParams.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            String str = this.scope;
            String str2 = this.state;
            String str3 = this.clientId;
            String str4 = this.timestamp;
            String str5 = this.accessType;
            String str6 = this.redirectUri;
            String str7 = this.responseType;
            String str8 = this.clientSecret;
            String str9 = this.apiUrlOverride;
            Map<String, String> map = this.additionalParams;
            StringBuilder v = b64.v("LinkParts(scope=", str, ", state=", str2, ", clientId=");
            g8e.D(v, str3, ", timestamp=", str4, ", accessType=");
            g8e.D(v, str5, ", redirectUri=", str6, ", responseType=");
            g8e.D(v, str7, ", clientSecret=", str8, ", apiUrlOverride=");
            v.append(str9);
            v.append(", additionalParams=");
            v.append(map);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.scope);
            dest.writeString(this.state);
            dest.writeString(this.clientId);
            dest.writeString(this.timestamp);
            dest.writeString(this.accessType);
            dest.writeString(this.redirectUri);
            dest.writeString(this.responseType);
            dest.writeString(this.clientSecret);
            dest.writeString(this.apiUrlOverride);
            Iterator x = qv10.x(this.additionalParams, dest);
            while (x.hasNext()) {
                Map.Entry entry = (Map.Entry) x.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LinkParts> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LinkParts createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                int i = 0;
                while (i != readInt) {
                    i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
                }
                return new LinkParts(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LinkParts[] newArray(int i) {
                return new LinkParts[i];
            }
        }
    }
}
