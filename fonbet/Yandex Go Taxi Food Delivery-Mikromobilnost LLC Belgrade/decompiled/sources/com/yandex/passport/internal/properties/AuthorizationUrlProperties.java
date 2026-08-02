package com.yandex.passport.internal.properties;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.l2;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.smw0;
import defpackage.unr0;
import defpackage.w9a1;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u000201B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJD\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\"\u0010\u0017J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b,\u0010\u001bR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u001e¨\u00062"}, d2 = {"Lcom/yandex/passport/internal/properties/AuthorizationUrlProperties;", "Lcom/yandex/passport/api/y;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/PassportUidImpl;", "uid", "", "returnUrl", "tld", "", "analyticsParams", "<init>", "(Lcom/yandex/passport/api/PassportUidImpl;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/PassportUidImpl;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/Map;", "copy", "(Lcom/yandex/passport/api/PassportUidImpl;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/yandex/passport/internal/properties/AuthorizationUrlProperties;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/PassportUidImpl;", "getUid", "Ljava/lang/String;", "getReturnUrl", "getTld", "Ljava/util/Map;", "getAnalyticsParams", "Companion", "a", "com/yandex/passport/internal/properties/d", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AuthorizationUrlProperties implements com.yandex.passport.api.y, Parcelable {
    public static final int $stable = 8;
    private final Map<String, String> analyticsParams;
    private final String returnUrl;
    private final String tld;
    private final PassportUidImpl uid;
    public static final d Companion = new d();
    public static final Parcelable.Creator<AuthorizationUrlProperties> CREATOR = new Creator();

    public static final class a implements com.yandex.passport.api.x {
        public k2 a;
        public String b;
        public String c;
        public final LinkedHashMap w = new LinkedHashMap();

        public final AuthorizationUrlProperties a() {
            k2 k2Var = (k2) w9a1.k(new AuthorizationUrlProperties$Builder$build$1(this, a.class, "uid", "getUid()Lcom/yandex/passport/api/PassportUid;", 0));
            PassportUidImpl.Companion.getClass();
            return new AuthorizationUrlProperties(l2.a(k2Var), (String) w9a1.k(new AuthorizationUrlProperties$Builder$build$2(this, a.class, "returnUrl", "getReturnUrl()Ljava/lang/String;", 0)), (String) w9a1.k(new AuthorizationUrlProperties$Builder$build$3(this, a.class, "tld", "getTld()Ljava/lang/String;", 0)), this.w);
        }

        @Override // com.yandex.passport.api.y
        public final Map getAnalyticsParams() {
            return this.w;
        }

        @Override // com.yandex.passport.api.y
        public final String getReturnUrl() {
            String str = this.b;
            if (str != null) {
                return str;
            }
            return null;
        }

        @Override // com.yandex.passport.api.y
        public final String getTld() {
            String str = this.c;
            if (str != null) {
                return str;
            }
            return null;
        }

        @Override // com.yandex.passport.api.y
        public final k2 getUid() {
            k2 k2Var = this.a;
            if (k2Var != null) {
                return k2Var;
            }
            return null;
        }
    }

    public AuthorizationUrlProperties(PassportUidImpl passportUidImpl, String str, String str2, Map<String, String> map) {
        this.uid = passportUidImpl;
        this.returnUrl = str;
        this.tld = str2;
        this.analyticsParams = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthorizationUrlProperties copy$default(AuthorizationUrlProperties authorizationUrlProperties, PassportUidImpl passportUidImpl, String str, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            passportUidImpl = authorizationUrlProperties.uid;
        }
        if ((i & 2) != 0) {
            str = authorizationUrlProperties.returnUrl;
        }
        if ((i & 4) != 0) {
            str2 = authorizationUrlProperties.tld;
        }
        if ((i & 8) != 0) {
            map = authorizationUrlProperties.analyticsParams;
        }
        return authorizationUrlProperties.copy(passportUidImpl, str, str2, map);
    }

    /* renamed from: component1, reason: from getter */
    public final PassportUidImpl getUid() {
        return this.uid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTld() {
        return this.tld;
    }

    public final Map<String, String> component4() {
        return this.analyticsParams;
    }

    public final AuthorizationUrlProperties copy(PassportUidImpl uid, String returnUrl, String tld, Map<String, String> analyticsParams) {
        return new AuthorizationUrlProperties(uid, returnUrl, tld, analyticsParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorizationUrlProperties)) {
            return false;
        }
        AuthorizationUrlProperties authorizationUrlProperties = (AuthorizationUrlProperties) other;
        return jl40.l(this.uid, authorizationUrlProperties.uid) && jl40.l(this.returnUrl, authorizationUrlProperties.returnUrl) && jl40.l(this.tld, authorizationUrlProperties.tld) && jl40.l(this.analyticsParams, authorizationUrlProperties.analyticsParams);
    }

    @Override // com.yandex.passport.api.y
    public Map<String, String> getAnalyticsParams() {
        return this.analyticsParams;
    }

    @Override // com.yandex.passport.api.y
    public String getReturnUrl() {
        return this.returnUrl;
    }

    @Override // com.yandex.passport.api.y
    public String getTld() {
        return this.tld;
    }

    public int hashCode() {
        return this.analyticsParams.hashCode() + unr0.b(unr0.b(this.uid.hashCode() * 31, 31, this.returnUrl), 31, this.tld);
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("authorization_url_properties", this);
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AuthorizationUrlProperties(uid=");
        sb.append(this.uid);
        sb.append(", returnUrl=");
        sb.append(this.returnUrl);
        sb.append(", tld=");
        sb.append(this.tld);
        sb.append(", analyticsParams=");
        return smw0.n(sb, this.analyticsParams, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.uid.writeToParcel(dest, flags);
        dest.writeString(this.returnUrl);
        dest.writeString(this.tld);
        Iterator x = qv10.x(this.analyticsParams, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AuthorizationUrlProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthorizationUrlProperties createFromParcel(Parcel parcel) {
            PassportUidImpl createFromParcel = PassportUidImpl.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            int i = 0;
            while (i != readInt) {
                i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
            }
            return new AuthorizationUrlProperties(createFromParcel, readString, readString2, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthorizationUrlProperties[] newArray(int i) {
            return new AuthorizationUrlProperties[i];
        }
    }

    @Override // com.yandex.passport.api.y
    public PassportUidImpl getUid() {
        return this.uid;
    }
}
