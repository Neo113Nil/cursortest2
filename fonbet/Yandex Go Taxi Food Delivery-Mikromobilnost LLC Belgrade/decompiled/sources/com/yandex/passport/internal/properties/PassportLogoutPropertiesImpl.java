package com.yandex.passport.internal.properties;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.f1;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.u1;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.smw0;
import defpackage.unr0;
import defpackage.wwg;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0081\b\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0002>?BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u001c\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\rHÆ\u0003¢\u0006\u0004\b'\u0010(JZ\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\rHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b+\u0010\"J\u0010\u0010,\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b,\u0010\u001cJ\u001a\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b2\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\"R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010$R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010&R&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b<\u0010(¨\u0006@"}, d2 = {"Lcom/yandex/passport/internal/properties/PassportLogoutPropertiesImpl;", "Lcom/yandex/passport/api/f1;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/PassportUidImpl;", "uid", "Lcom/yandex/passport/api/PassportTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "", "source", "", "canLogoutOnDevice", "Lcom/yandex/passport/internal/properties/ProgressPropertiesImpl;", "progressProperties", "", "headers", "<init>", "(Lcom/yandex/passport/api/PassportUidImpl;Lcom/yandex/passport/api/PassportTheme;Ljava/lang/String;ZLcom/yandex/passport/internal/properties/ProgressPropertiesImpl;Ljava/util/Map;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/PassportUidImpl;", "component2", "()Lcom/yandex/passport/api/PassportTheme;", "component3", "()Ljava/lang/String;", "component4", "()Z", "component5", "()Lcom/yandex/passport/internal/properties/ProgressPropertiesImpl;", "component6", "()Ljava/util/Map;", "copy", "(Lcom/yandex/passport/api/PassportUidImpl;Lcom/yandex/passport/api/PassportTheme;Ljava/lang/String;ZLcom/yandex/passport/internal/properties/ProgressPropertiesImpl;Ljava/util/Map;)Lcom/yandex/passport/internal/properties/PassportLogoutPropertiesImpl;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/PassportUidImpl;", "getUid", "Lcom/yandex/passport/api/PassportTheme;", "getTheme", "Ljava/lang/String;", "getSource", "Z", "getCanLogoutOnDevice", "Lcom/yandex/passport/internal/properties/ProgressPropertiesImpl;", "getProgressProperties", "Ljava/util/Map;", "getHeaders", "Companion", "com/yandex/passport/internal/properties/l", "a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PassportLogoutPropertiesImpl implements f1, Parcelable {
    public static final int $stable = 8;
    private static final String KEY_LOGOUT_PROPERTIES = "passport-logout-properties";
    private final boolean canLogoutOnDevice;
    private final Map<String, String> headers;
    private final ProgressPropertiesImpl progressProperties;
    private final String source;
    private final PassportTheme theme;
    private final PassportUidImpl uid;
    public static final l Companion = new l();
    public static final Parcelable.Creator<PassportLogoutPropertiesImpl> CREATOR = new Creator();

    public static final class a implements f1 {
        public k2 a;
        public PassportTheme b = PassportTheme.FOLLOW_SYSTEM;
        public boolean c;
        public u1 w;
        public final Map x;

        public a() {
            ProgressPropertiesImpl.Companion.getClass();
            this.w = m.a();
            this.x = kotlin.collections.b.f();
        }

        public final /* synthetic */ void a() {
            this.c = true;
        }

        public final /* synthetic */ void b(PassportTheme passportTheme) {
            this.b = passportTheme;
        }

        public final /* synthetic */ void c(PassportUidImpl passportUidImpl) {
            this.a = passportUidImpl;
        }

        @Override // com.yandex.passport.api.f1
        public final boolean getCanLogoutOnDevice() {
            return this.c;
        }

        @Override // com.yandex.passport.api.f1
        public final Map getHeaders() {
            return this.x;
        }

        @Override // com.yandex.passport.api.f1
        public final u1 getProgressProperties() {
            return this.w;
        }

        @Override // com.yandex.passport.api.f1
        public final String getSource() {
            return null;
        }

        @Override // com.yandex.passport.api.f1
        public final PassportTheme getTheme() {
            return this.b;
        }

        @Override // com.yandex.passport.api.f1
        public final k2 getUid() {
            k2 k2Var = this.a;
            if (k2Var != null) {
                return k2Var;
            }
            return null;
        }
    }

    public /* synthetic */ PassportLogoutPropertiesImpl(PassportUidImpl passportUidImpl, PassportTheme passportTheme, String str, boolean z, ProgressPropertiesImpl progressPropertiesImpl, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(passportUidImpl, (i & 2) != 0 ? PassportTheme.FOLLOW_SYSTEM : passportTheme, (i & 4) != 0 ? null : str, z, progressPropertiesImpl, (i & 32) != 0 ? kotlin.collections.b.f() : map);
    }

    public static /* synthetic */ PassportLogoutPropertiesImpl copy$default(PassportLogoutPropertiesImpl passportLogoutPropertiesImpl, PassportUidImpl passportUidImpl, PassportTheme passportTheme, String str, boolean z, ProgressPropertiesImpl progressPropertiesImpl, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            passportUidImpl = passportLogoutPropertiesImpl.uid;
        }
        if ((i & 2) != 0) {
            passportTheme = passportLogoutPropertiesImpl.theme;
        }
        if ((i & 4) != 0) {
            str = passportLogoutPropertiesImpl.source;
        }
        if ((i & 8) != 0) {
            z = passportLogoutPropertiesImpl.canLogoutOnDevice;
        }
        if ((i & 16) != 0) {
            progressPropertiesImpl = passportLogoutPropertiesImpl.progressProperties;
        }
        if ((i & 32) != 0) {
            map = passportLogoutPropertiesImpl.headers;
        }
        ProgressPropertiesImpl progressPropertiesImpl2 = progressPropertiesImpl;
        Map map2 = map;
        return passportLogoutPropertiesImpl.copy(passportUidImpl, passportTheme, str, z, progressPropertiesImpl2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final PassportUidImpl getUid() {
        return this.uid;
    }

    /* renamed from: component2, reason: from getter */
    public final PassportTheme getTheme() {
        return this.theme;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getCanLogoutOnDevice() {
        return this.canLogoutOnDevice;
    }

    /* renamed from: component5, reason: from getter */
    public final ProgressPropertiesImpl getProgressProperties() {
        return this.progressProperties;
    }

    public final Map<String, String> component6() {
        return this.headers;
    }

    public final PassportLogoutPropertiesImpl copy(PassportUidImpl uid, PassportTheme theme, String source, boolean canLogoutOnDevice, ProgressPropertiesImpl progressProperties, Map<String, String> headers) {
        return new PassportLogoutPropertiesImpl(uid, theme, source, canLogoutOnDevice, progressProperties, headers);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportLogoutPropertiesImpl)) {
            return false;
        }
        PassportLogoutPropertiesImpl passportLogoutPropertiesImpl = (PassportLogoutPropertiesImpl) other;
        return jl40.l(this.uid, passportLogoutPropertiesImpl.uid) && this.theme == passportLogoutPropertiesImpl.theme && jl40.l(this.source, passportLogoutPropertiesImpl.source) && this.canLogoutOnDevice == passportLogoutPropertiesImpl.canLogoutOnDevice && jl40.l(this.progressProperties, passportLogoutPropertiesImpl.progressProperties) && jl40.l(this.headers, passportLogoutPropertiesImpl.headers);
    }

    @Override // com.yandex.passport.api.f1
    public boolean getCanLogoutOnDevice() {
        return this.canLogoutOnDevice;
    }

    @Override // com.yandex.passport.api.f1
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.yandex.passport.api.f1
    public String getSource() {
        return this.source;
    }

    @Override // com.yandex.passport.api.f1
    public PassportTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int hashCode = (this.theme.hashCode() + (this.uid.hashCode() * 31)) * 31;
        String str = this.source;
        return this.headers.hashCode() + ((this.progressProperties.hashCode() + unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.canLogoutOnDevice)) * 31);
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair(KEY_LOGOUT_PROPERTIES, this));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PassportLogoutPropertiesImpl(uid=");
        sb.append(this.uid);
        sb.append(", theme=");
        sb.append(this.theme);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", canLogoutOnDevice=");
        sb.append(this.canLogoutOnDevice);
        sb.append(", progressProperties=");
        sb.append(this.progressProperties);
        sb.append(", headers=");
        return smw0.n(sb, this.headers, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.uid.writeToParcel(dest, flags);
        dest.writeString(this.theme.name());
        dest.writeString(this.source);
        dest.writeInt(this.canLogoutOnDevice ? 1 : 0);
        this.progressProperties.writeToParcel(dest, flags);
        Iterator x = qv10.x(this.headers, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PassportLogoutPropertiesImpl> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassportLogoutPropertiesImpl createFromParcel(Parcel parcel) {
            int i;
            PassportUidImpl createFromParcel = PassportUidImpl.CREATOR.createFromParcel(parcel);
            PassportTheme valueOf = PassportTheme.valueOf(parcel.readString());
            String readString = parcel.readString();
            int i2 = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            ProgressPropertiesImpl createFromParcel2 = ProgressPropertiesImpl.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            while (i2 != readInt) {
                i2 = xvz.b(parcel, linkedHashMap, parcel.readString(), i2, i);
            }
            return new PassportLogoutPropertiesImpl(createFromParcel, valueOf, readString, z, createFromParcel2, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassportLogoutPropertiesImpl[] newArray(int i) {
            return new PassportLogoutPropertiesImpl[i];
        }
    }

    @Override // com.yandex.passport.api.f1
    public ProgressPropertiesImpl getProgressProperties() {
        return this.progressProperties;
    }

    @Override // com.yandex.passport.api.f1
    public PassportUidImpl getUid() {
        return this.uid;
    }

    public PassportLogoutPropertiesImpl(PassportUidImpl passportUidImpl, PassportTheme passportTheme, String str, boolean z, ProgressPropertiesImpl progressPropertiesImpl, Map<String, String> map) {
        this.uid = passportUidImpl;
        this.theme = passportTheme;
        this.source = str;
        this.canLogoutOnDevice = z;
        this.progressProperties = progressPropertiesImpl;
        this.headers = map;
    }
}
