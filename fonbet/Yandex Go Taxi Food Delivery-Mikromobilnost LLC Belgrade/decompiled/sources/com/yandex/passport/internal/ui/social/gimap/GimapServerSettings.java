package com.yandex.passport.internal.ui.social.gimap;

import android.os.Parcel;
import android.os.Parcelable;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.auth.LegacyAccountType;
import defpackage.b64;
import defpackage.jl40;
import defpackage.nzs;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u00014B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJL\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b'\u0010\u001cJ\u001a\u0010*\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u001e¨\u00065"}, d2 = {"Lcom/yandex/passport/internal/ui/social/gimap/GimapServerSettings;", "Landroid/os/Parcelable;", "", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT, "", "ssl", LegacyAccountType.STRING_LOGIN, URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/yandex/passport/internal/ui/social/gimap/c;", "hint", "applyHint", "(Lcom/yandex/passport/internal/ui/social/gimap/c;)Lcom/yandex/passport/internal/ui/social/gimap/GimapServerSettings;", "isFull", "()Z", "Lorg/json/JSONObject;", "toJson", "()Lorg/json/JSONObject;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/passport/internal/ui/social/gimap/GimapServerSettings;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHost", "getPort", "Ljava/lang/Boolean;", "getSsl", "getLogin", "getPassword", "Companion", "com/yandex/passport/internal/ui/social/gimap/m", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GimapServerSettings implements Parcelable {
    public static final int $stable = 0;
    private final String host;
    private final String login;
    private final String password;
    private final String port;
    private final Boolean ssl;
    public static final m Companion = new m();
    public static final Parcelable.Creator<GimapServerSettings> CREATOR = new Creator();

    public GimapServerSettings(String str, String str2, Boolean bool, String str3, String str4) {
        this.host = str;
        this.port = str2;
        this.ssl = bool;
        this.login = str3;
        this.password = str4;
    }

    public static /* synthetic */ GimapServerSettings copy$default(GimapServerSettings gimapServerSettings, String str, String str2, Boolean bool, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gimapServerSettings.host;
        }
        if ((i & 2) != 0) {
            str2 = gimapServerSettings.port;
        }
        if ((i & 4) != 0) {
            bool = gimapServerSettings.ssl;
        }
        if ((i & 8) != 0) {
            str3 = gimapServerSettings.login;
        }
        if ((i & 16) != 0) {
            str4 = gimapServerSettings.password;
        }
        String str5 = str4;
        Boolean bool2 = bool;
        return gimapServerSettings.copy(str, str2, bool2, str3, str5);
    }

    public static final GimapServerSettings empty() {
        Companion.getClass();
        return m.a();
    }

    public static final GimapServerSettings fromJson(JSONObject jSONObject) {
        Companion.getClass();
        return m.b(jSONObject);
    }

    public final GimapServerSettings applyHint(c hint) {
        String str = this.host;
        if (str == null) {
            str = hint.a;
        }
        String str2 = str;
        String str3 = this.port;
        if (str3 == null) {
            str3 = String.valueOf(hint.b);
        }
        String str4 = str3;
        Boolean bool = this.ssl;
        return copy$default(this, str2, str4, Boolean.valueOf(bool != null ? bool.booleanValue() : hint.c), null, null, 24, null);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPort() {
        return this.port;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getSsl() {
        return this.ssl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLogin() {
        return this.login;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    public final GimapServerSettings copy(String host, String port, Boolean ssl, String login, String password) {
        return new GimapServerSettings(host, port, ssl, login, password);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GimapServerSettings)) {
            return false;
        }
        GimapServerSettings gimapServerSettings = (GimapServerSettings) other;
        return jl40.l(this.host, gimapServerSettings.host) && jl40.l(this.port, gimapServerSettings.port) && jl40.l(this.ssl, gimapServerSettings.ssl) && jl40.l(this.login, gimapServerSettings.login) && jl40.l(this.password, gimapServerSettings.password);
    }

    public final String getHost() {
        return this.host;
    }

    public final String getLogin() {
        return this.login;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPort() {
        return this.port;
    }

    public final Boolean getSsl() {
        return this.ssl;
    }

    public int hashCode() {
        String str = this.host;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.port;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.ssl;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.login;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.password;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isFull() {
        return (this.host == null || this.port == null || this.ssl == null || this.login == null || this.password == null) ? false : true;
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, this.host);
        jSONObject.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT, this.port);
        jSONObject.put("ssl", this.ssl.booleanValue());
        jSONObject.put(LegacyAccountType.STRING_LOGIN, this.login);
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GimapServerSettings(host=");
        sb.append(this.host);
        sb.append(", port=");
        sb.append(this.port);
        sb.append(", ssl=");
        sb.append(this.ssl);
        sb.append(", login=");
        sb.append(this.login);
        sb.append(", password=");
        return b64.p(sb, this.password, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.host);
        dest.writeString(this.port);
        Boolean bool = this.ssl;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool);
        }
        dest.writeString(this.login);
        dest.writeString(this.password);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GimapServerSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GimapServerSettings createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GimapServerSettings(readString, readString2, valueOf, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GimapServerSettings[] newArray(int i) {
            return new GimapServerSettings[i];
        }
    }
}
