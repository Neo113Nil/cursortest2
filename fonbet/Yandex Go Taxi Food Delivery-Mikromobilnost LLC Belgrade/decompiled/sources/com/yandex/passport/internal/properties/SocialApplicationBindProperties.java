package com.yandex.passport.internal.properties;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.d2;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.z0;
import com.yandex.passport.internal.entities.Filter;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.wwg;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 52\u00020\u00012\u00020\u0002:\u000267B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010!JF\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b&\u0010\u0019J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u001fR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b4\u0010!¨\u00068"}, d2 = {"Lcom/yandex/passport/internal/properties/SocialApplicationBindProperties;", "Lcom/yandex/passport/api/d2;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/internal/entities/Filter;", "filter", "Lcom/yandex/passport/api/PassportTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lcom/yandex/passport/api/PassportUidImpl;", "uid", "", "applicationName", "clientId", "<init>", "(Lcom/yandex/passport/internal/entities/Filter;Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/api/PassportUidImpl;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/internal/entities/Filter;", "component2", "()Lcom/yandex/passport/api/PassportTheme;", "component3", "()Lcom/yandex/passport/api/PassportUidImpl;", "component4", "()Ljava/lang/String;", "component5", "copy", "(Lcom/yandex/passport/internal/entities/Filter;Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/api/PassportUidImpl;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/passport/internal/properties/SocialApplicationBindProperties;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/internal/entities/Filter;", "getFilter", "Lcom/yandex/passport/api/PassportTheme;", "getTheme", "Lcom/yandex/passport/api/PassportUidImpl;", "getUid", "Ljava/lang/String;", "getApplicationName", "getClientId", "Companion", "a", "com/yandex/passport/internal/properties/t", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SocialApplicationBindProperties implements d2, Parcelable {
    public static final int $stable = 8;
    private static final String KEY_APPLICATION_BIND_PROPERTIES = "passport-application-bind-properties";
    private final String applicationName;
    private final String clientId;
    private final Filter filter;
    private final PassportTheme theme;
    private final PassportUidImpl uid;
    public static final t Companion = new t();
    public static final Parcelable.Creator<SocialApplicationBindProperties> CREATOR = new Creator();

    public static final class a implements d2 {
        public z0 a;
        public PassportTheme b = PassportTheme.FOLLOW_SYSTEM;
        public k2 c;
        public String w;
        public String x;

        @Override // com.yandex.passport.api.d2
        public final String getApplicationName() {
            String str = this.w;
            if (str != null) {
                return str;
            }
            return null;
        }

        @Override // com.yandex.passport.api.d2
        public final String getClientId() {
            return this.x;
        }

        @Override // com.yandex.passport.api.d2
        public final z0 getFilter() {
            z0 z0Var = this.a;
            if (z0Var != null) {
                return z0Var;
            }
            return null;
        }

        @Override // com.yandex.passport.api.d2
        public final PassportTheme getTheme() {
            return this.b;
        }

        @Override // com.yandex.passport.api.d2
        public final k2 getUid() {
            return this.c;
        }
    }

    public SocialApplicationBindProperties(Filter filter, PassportTheme passportTheme, PassportUidImpl passportUidImpl, String str, String str2) {
        this.filter = filter;
        this.theme = passportTheme;
        this.uid = passportUidImpl;
        this.applicationName = str;
        this.clientId = str2;
    }

    public static /* synthetic */ SocialApplicationBindProperties copy$default(SocialApplicationBindProperties socialApplicationBindProperties, Filter filter, PassportTheme passportTheme, PassportUidImpl passportUidImpl, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            filter = socialApplicationBindProperties.filter;
        }
        if ((i & 2) != 0) {
            passportTheme = socialApplicationBindProperties.theme;
        }
        if ((i & 4) != 0) {
            passportUidImpl = socialApplicationBindProperties.uid;
        }
        if ((i & 8) != 0) {
            str = socialApplicationBindProperties.applicationName;
        }
        if ((i & 16) != 0) {
            str2 = socialApplicationBindProperties.clientId;
        }
        String str3 = str2;
        PassportUidImpl passportUidImpl2 = passportUidImpl;
        return socialApplicationBindProperties.copy(filter, passportTheme, passportUidImpl2, str, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final Filter getFilter() {
        return this.filter;
    }

    /* renamed from: component2, reason: from getter */
    public final PassportTheme getTheme() {
        return this.theme;
    }

    /* renamed from: component3, reason: from getter */
    public final PassportUidImpl getUid() {
        return this.uid;
    }

    /* renamed from: component4, reason: from getter */
    public final String getApplicationName() {
        return this.applicationName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    public final SocialApplicationBindProperties copy(Filter filter, PassportTheme theme, PassportUidImpl uid, String applicationName, String clientId) {
        return new SocialApplicationBindProperties(filter, theme, uid, applicationName, clientId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialApplicationBindProperties)) {
            return false;
        }
        SocialApplicationBindProperties socialApplicationBindProperties = (SocialApplicationBindProperties) other;
        return jl40.l(this.filter, socialApplicationBindProperties.filter) && this.theme == socialApplicationBindProperties.theme && jl40.l(this.uid, socialApplicationBindProperties.uid) && jl40.l(this.applicationName, socialApplicationBindProperties.applicationName) && jl40.l(this.clientId, socialApplicationBindProperties.clientId);
    }

    @Override // com.yandex.passport.api.d2
    public String getApplicationName() {
        return this.applicationName;
    }

    @Override // com.yandex.passport.api.d2
    public String getClientId() {
        return this.clientId;
    }

    @Override // com.yandex.passport.api.d2
    public PassportTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int hashCode = (this.theme.hashCode() + (this.filter.hashCode() * 31)) * 31;
        PassportUidImpl passportUidImpl = this.uid;
        int b = unr0.b((hashCode + (passportUidImpl == null ? 0 : passportUidImpl.hashCode())) * 31, 31, this.applicationName);
        String str = this.clientId;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair(KEY_APPLICATION_BIND_PROPERTIES, this));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SocialApplicationBindProperties(filter=");
        sb.append(this.filter);
        sb.append(", theme=");
        sb.append(this.theme);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", applicationName=");
        sb.append(this.applicationName);
        sb.append(", clientId=");
        return b64.p(sb, this.clientId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.filter.writeToParcel(dest, flags);
        dest.writeString(this.theme.name());
        PassportUidImpl passportUidImpl = this.uid;
        if (passportUidImpl == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            passportUidImpl.writeToParcel(dest, flags);
        }
        dest.writeString(this.applicationName);
        dest.writeString(this.clientId);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SocialApplicationBindProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SocialApplicationBindProperties createFromParcel(Parcel parcel) {
            return new SocialApplicationBindProperties(Filter.CREATOR.createFromParcel(parcel), PassportTheme.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : PassportUidImpl.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SocialApplicationBindProperties[] newArray(int i) {
            return new SocialApplicationBindProperties[i];
        }
    }

    @Override // com.yandex.passport.api.d2
    public Filter getFilter() {
        return this.filter;
    }

    @Override // com.yandex.passport.api.d2
    public PassportUidImpl getUid() {
        return this.uid;
    }
}
