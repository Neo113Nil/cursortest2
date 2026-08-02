package com.yandex.passport.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.PassportSocialConfiguration;
import com.yandex.passport.api.PassportSocialProviderCode;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.qv10;
import defpackage.smw0;
import defpackage.unr0;
import defpackage.w511;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 82\u00020\u0001:\u00029:BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JP\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u001a\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b\t\u0010\u001eR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010 R\u0011\u00103\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b2\u0010\u001cR\u0011\u00107\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006;"}, d2 = {"Lcom/yandex/passport/internal/SocialConfiguration;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/PassportSocialConfiguration;", "id", "Lcom/yandex/passport/internal/SocialConfiguration$Type;", "type", "", "scope", "", "isBrowserRequired", "", "extraQueryParams", "<init>", "(Lcom/yandex/passport/api/PassportSocialConfiguration;Lcom/yandex/passport/internal/SocialConfiguration$Type;Ljava/lang/String;ZLjava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/PassportSocialConfiguration;", "component2", "()Lcom/yandex/passport/internal/SocialConfiguration$Type;", "component3", "()Ljava/lang/String;", "component4", "()Z", "component5", "()Ljava/util/Map;", "copy", "(Lcom/yandex/passport/api/PassportSocialConfiguration;Lcom/yandex/passport/internal/SocialConfiguration$Type;Ljava/lang/String;ZLjava/util/Map;)Lcom/yandex/passport/internal/SocialConfiguration;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/PassportSocialConfiguration;", "getId", "Lcom/yandex/passport/internal/SocialConfiguration$Type;", "getType", "Ljava/lang/String;", "getScope", "Z", "Ljava/util/Map;", "getExtraQueryParams", "getProviderCodeOld", "providerCodeOld", "Lcom/yandex/passport/api/PassportSocialProviderCode;", "getProviderCode", "()Lcom/yandex/passport/api/PassportSocialProviderCode;", "providerCode", "Companion", "Type", "com/yandex/passport/internal/y", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SocialConfiguration implements Parcelable {
    public static final int $stable = 8;
    private final Map<String, String> extraQueryParams;
    private final PassportSocialConfiguration id;
    private final boolean isBrowserRequired;
    private final String scope;
    private final Type type;
    public static final y Companion = new y();
    public static final Parcelable.Creator<SocialConfiguration> CREATOR = new Creator();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/internal/SocialConfiguration$Type;", "", "SOCIAL", "MAIL_OAUTH", "MAIL_PASSWORD", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type MAIL_OAUTH;
        public static final Type MAIL_PASSWORD;
        public static final Type SOCIAL;

        static {
            Type type = new Type("SOCIAL", 0);
            SOCIAL = type;
            Type type2 = new Type("MAIL_OAUTH", 1);
            MAIL_OAUTH = type2;
            Type type3 = new Type("MAIL_PASSWORD", 2);
            MAIL_PASSWORD = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ SocialConfiguration(PassportSocialConfiguration passportSocialConfiguration, Type type, String str, boolean z, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(passportSocialConfiguration, type, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? kotlin.collections.b.f() : map);
    }

    public static /* synthetic */ SocialConfiguration copy$default(SocialConfiguration socialConfiguration, PassportSocialConfiguration passportSocialConfiguration, Type type, String str, boolean z, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            passportSocialConfiguration = socialConfiguration.id;
        }
        if ((i & 2) != 0) {
            type = socialConfiguration.type;
        }
        if ((i & 4) != 0) {
            str = socialConfiguration.scope;
        }
        if ((i & 8) != 0) {
            z = socialConfiguration.isBrowserRequired;
        }
        if ((i & 16) != 0) {
            map = socialConfiguration.extraQueryParams;
        }
        Map map2 = map;
        String str2 = str;
        return socialConfiguration.copy(passportSocialConfiguration, type, str2, z, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final PassportSocialConfiguration getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsBrowserRequired() {
        return this.isBrowserRequired;
    }

    public final Map<String, String> component5() {
        return this.extraQueryParams;
    }

    public final SocialConfiguration copy(PassportSocialConfiguration id, Type type, String scope, boolean isBrowserRequired, Map<String, String> extraQueryParams) {
        return new SocialConfiguration(id, type, scope, isBrowserRequired, extraQueryParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialConfiguration)) {
            return false;
        }
        SocialConfiguration socialConfiguration = (SocialConfiguration) other;
        return this.id == socialConfiguration.id && this.type == socialConfiguration.type && jl40.l(this.scope, socialConfiguration.scope) && this.isBrowserRequired == socialConfiguration.isBrowserRequired && jl40.l(this.extraQueryParams, socialConfiguration.extraQueryParams);
    }

    public final Map<String, String> getExtraQueryParams() {
        return this.extraQueryParams;
    }

    public final PassportSocialConfiguration getId() {
        return this.id;
    }

    public final PassportSocialProviderCode getProviderCode() {
        switch (z.a[this.id.ordinal()]) {
            case 1:
                return PassportSocialProviderCode.VKONTAKTE;
            case 2:
                return PassportSocialProviderCode.FACEBOOK;
            case 3:
                return PassportSocialProviderCode.TWITTER;
            case 4:
                return PassportSocialProviderCode.ODNOKLASSNIKI;
            case 5:
                return PassportSocialProviderCode.GOOGLE;
            case 6:
                return PassportSocialProviderCode.MAILRU;
            case 7:
                return PassportSocialProviderCode.ESIA;
            case 8:
                return PassportSocialProviderCode.TV1001;
            case 9:
                return PassportSocialProviderCode.GOOGLE;
            case 10:
                return PassportSocialProviderCode.MICROSOFT;
            case 11:
                return PassportSocialProviderCode.MAILRU;
            case 12:
                return PassportSocialProviderCode.YAHOO;
            case 13:
                return PassportSocialProviderCode.RAMBLER;
            case 14:
                return PassportSocialProviderCode.OTHER;
            default:
                w511.b();
                return null;
        }
    }

    public final String getProviderCodeOld() {
        return getProviderCode().getCodeString();
    }

    public final String getScope() {
        return this.scope;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() + (this.id.hashCode() * 31)) * 31;
        String str = this.scope;
        return this.extraQueryParams.hashCode() + unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isBrowserRequired);
    }

    public final boolean isBrowserRequired() {
        return this.isBrowserRequired;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SocialConfiguration(id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", scope=");
        sb.append(this.scope);
        sb.append(", isBrowserRequired=");
        sb.append(this.isBrowserRequired);
        sb.append(", extraQueryParams=");
        return smw0.n(sb, this.extraQueryParams, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id.name());
        dest.writeString(this.type.name());
        dest.writeString(this.scope);
        dest.writeInt(this.isBrowserRequired ? 1 : 0);
        Iterator x = qv10.x(this.extraQueryParams, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SocialConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SocialConfiguration createFromParcel(Parcel parcel) {
            int i;
            PassportSocialConfiguration valueOf = PassportSocialConfiguration.valueOf(parcel.readString());
            Type valueOf2 = Type.valueOf(parcel.readString());
            String readString = parcel.readString();
            int i2 = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            while (i2 != readInt) {
                i2 = xvz.b(parcel, linkedHashMap, parcel.readString(), i2, i);
            }
            return new SocialConfiguration(valueOf, valueOf2, readString, z, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SocialConfiguration[] newArray(int i) {
            return new SocialConfiguration[i];
        }
    }

    public SocialConfiguration(PassportSocialConfiguration passportSocialConfiguration, Type type, String str, boolean z, Map<String, String> map) {
        this.id = passportSocialConfiguration;
        this.type = type;
        this.scope = str;
        this.isBrowserRequired = z;
        this.extraQueryParams = map;
    }
}
