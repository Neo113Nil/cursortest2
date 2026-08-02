package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.social.esia.EsiaBindWebClient;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J`\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b/\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b0\u0010\u0017R \u00102\u001a\u0002018\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/ybsdk/deeplink/generated/EsiaSdkAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", ClidProvider.STATE, "scope", "clientId", ClidProvider.TIMESTAMP, "accessType", "redirectUri", "responseType", "clientSecret", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/EsiaSdkAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getState", "getScope", "getClientId", "getTimestamp", "getAccessType", "getRedirectUri", "getResponseType", "getClientSecret", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EsiaSdkAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<EsiaSdkAction> CREATOR = new Creator();
    private final String accessType;
    private final String clientId;
    private final String clientSecret;
    private final Uri deeplinkUri;
    private final String redirectUri;
    private final String responseType;
    private final String scope;
    private final String state;
    private final String timestamp;

    public EsiaSdkAction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.state = str;
        this.scope = str2;
        this.clientId = str3;
        this.timestamp = str4;
        this.accessType = str5;
        this.redirectUri = str6;
        this.responseType = str7;
        this.clientSecret = str8;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/esia_sdk", ClidProvider.STATE, str);
        j.appendQueryParameter("scope", str2);
        j.appendQueryParameter("client_id", str3);
        j.appendQueryParameter(ClidProvider.TIMESTAMP, str4);
        j.appendQueryParameter("access_type", str5);
        j.appendQueryParameter(EsiaBindWebClient.REDIRECT_PARAM_NAME, str6);
        j.appendQueryParameter("response_type", str7);
        j.appendQueryParameter("client_secret", str8);
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ EsiaSdkAction copy$default(EsiaSdkAction esiaSdkAction, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = esiaSdkAction.state;
        }
        if ((i & 2) != 0) {
            str2 = esiaSdkAction.scope;
        }
        if ((i & 4) != 0) {
            str3 = esiaSdkAction.clientId;
        }
        if ((i & 8) != 0) {
            str4 = esiaSdkAction.timestamp;
        }
        if ((i & 16) != 0) {
            str5 = esiaSdkAction.accessType;
        }
        if ((i & 32) != 0) {
            str6 = esiaSdkAction.redirectUri;
        }
        if ((i & 64) != 0) {
            str7 = esiaSdkAction.responseType;
        }
        if ((i & 128) != 0) {
            str8 = esiaSdkAction.clientSecret;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return esiaSdkAction.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: component2, reason: from getter */
    public final String getScope() {
        return this.scope;
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

    public final EsiaSdkAction copy(String state, String scope, String clientId, String timestamp, String accessType, String redirectUri, String responseType, String clientSecret) {
        return new EsiaSdkAction(state, scope, clientId, timestamp, accessType, redirectUri, responseType, clientSecret);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EsiaSdkAction)) {
            return false;
        }
        EsiaSdkAction esiaSdkAction = (EsiaSdkAction) other;
        return jl40.l(this.state, esiaSdkAction.state) && jl40.l(this.scope, esiaSdkAction.scope) && jl40.l(this.clientId, esiaSdkAction.clientId) && jl40.l(this.timestamp, esiaSdkAction.timestamp) && jl40.l(this.accessType, esiaSdkAction.accessType) && jl40.l(this.redirectUri, esiaSdkAction.redirectUri) && jl40.l(this.responseType, esiaSdkAction.responseType) && jl40.l(this.clientSecret, esiaSdkAction.clientSecret);
    }

    public final String getAccessType() {
        return this.accessType;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
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
        return this.clientSecret.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.state.hashCode() * 31, 31, this.scope), 31, this.clientId), 31, this.timestamp), 31, this.accessType), 31, this.redirectUri), 31, this.responseType);
    }

    public String toString() {
        String str = this.state;
        String str2 = this.scope;
        String str3 = this.clientId;
        String str4 = this.timestamp;
        String str5 = this.accessType;
        String str6 = this.redirectUri;
        String str7 = this.responseType;
        String str8 = this.clientSecret;
        StringBuilder v = b64.v("EsiaSdkAction(state=", str, ", scope=", str2, ", clientId=");
        g8e.D(v, str3, ", timestamp=", str4, ", accessType=");
        g8e.D(v, str5, ", redirectUri=", str6, ", responseType=");
        return g8e.r(v, str7, ", clientSecret=", str8, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.state);
        dest.writeString(this.scope);
        dest.writeString(this.clientId);
        dest.writeString(this.timestamp);
        dest.writeString(this.accessType);
        dest.writeString(this.redirectUri);
        dest.writeString(this.responseType);
        dest.writeString(this.clientSecret);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EsiaSdkAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EsiaSdkAction createFromParcel(Parcel parcel) {
            return new EsiaSdkAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EsiaSdkAction[] newArray(int i) {
            return new EsiaSdkAction[i];
        }
    }
}
