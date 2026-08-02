package com.yandex.passport.internal.properties;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.e3;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.smw0;
import defpackage.wwg;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00015B;\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b \u0010!JD\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b&\u0010\u0019J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u001fR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010!¨\u00066"}, d2 = {"Lcom/yandex/passport/internal/properties/UserMenuProperties;", "Lcom/yandex/passport/api/e3;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/PassportTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", WebViewActivity.KEY_ENVIRONMENT, "Lcom/yandex/passport/internal/properties/ProgressPropertiesImpl;", "progressProperties", "", "", "customWebParams", "<init>", "(Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;Lcom/yandex/passport/internal/properties/ProgressPropertiesImpl;Ljava/util/Map;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/PassportTheme;", "component2", "()Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "component3", "()Lcom/yandex/passport/internal/properties/ProgressPropertiesImpl;", "component4", "()Ljava/util/Map;", "copy", "(Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;Lcom/yandex/passport/internal/properties/ProgressPropertiesImpl;Ljava/util/Map;)Lcom/yandex/passport/internal/properties/UserMenuProperties;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/PassportTheme;", "getTheme", "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "getEnvironment", "Lcom/yandex/passport/internal/properties/ProgressPropertiesImpl;", "getProgressProperties", "Ljava/util/Map;", "getCustomWebParams", "Companion", "com/yandex/passport/internal/properties/a0", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UserMenuProperties implements e3, Parcelable {
    public static final int $stable = 8;
    private static final String KEY_SHOW_USER_MENU_PROPERTIES = "passport-show-user-menu-properties";
    private final Map<String, String> customWebParams;
    private final PassportEnvironmentImpl environment;
    private final ProgressPropertiesImpl progressProperties;
    private final PassportTheme theme;
    public static final a0 Companion = new a0();
    public static final Parcelable.Creator<UserMenuProperties> CREATOR = new Creator();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ UserMenuProperties(PassportTheme passportTheme, PassportEnvironmentImpl passportEnvironmentImpl, ProgressPropertiesImpl progressPropertiesImpl, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(passportTheme, passportEnvironmentImpl, progressPropertiesImpl, (i & 8) != 0 ? kotlin.collections.b.f() : map);
        passportTheme = (i & 1) != 0 ? PassportTheme.FOLLOW_SYSTEM : passportTheme;
        passportEnvironmentImpl = (i & 2) != 0 ? PassportEnvironmentImpl.PRODUCTION : passportEnvironmentImpl;
        if ((i & 4) != 0) {
            ProgressPropertiesImpl.Companion.getClass();
            progressPropertiesImpl = m.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserMenuProperties copy$default(UserMenuProperties userMenuProperties, PassportTheme passportTheme, PassportEnvironmentImpl passportEnvironmentImpl, ProgressPropertiesImpl progressPropertiesImpl, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            passportTheme = userMenuProperties.theme;
        }
        if ((i & 2) != 0) {
            passportEnvironmentImpl = userMenuProperties.environment;
        }
        if ((i & 4) != 0) {
            progressPropertiesImpl = userMenuProperties.progressProperties;
        }
        if ((i & 8) != 0) {
            map = userMenuProperties.customWebParams;
        }
        return userMenuProperties.copy(passportTheme, passportEnvironmentImpl, progressPropertiesImpl, map);
    }

    /* renamed from: component1, reason: from getter */
    public final PassportTheme getTheme() {
        return this.theme;
    }

    /* renamed from: component2, reason: from getter */
    public final PassportEnvironmentImpl getEnvironment() {
        return this.environment;
    }

    /* renamed from: component3, reason: from getter */
    public final ProgressPropertiesImpl getProgressProperties() {
        return this.progressProperties;
    }

    public final Map<String, String> component4() {
        return this.customWebParams;
    }

    public final UserMenuProperties copy(PassportTheme theme, PassportEnvironmentImpl environment, ProgressPropertiesImpl progressProperties, Map<String, String> customWebParams) {
        return new UserMenuProperties(theme, environment, progressProperties, customWebParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserMenuProperties)) {
            return false;
        }
        UserMenuProperties userMenuProperties = (UserMenuProperties) other;
        return this.theme == userMenuProperties.theme && jl40.l(this.environment, userMenuProperties.environment) && jl40.l(this.progressProperties, userMenuProperties.progressProperties) && jl40.l(this.customWebParams, userMenuProperties.customWebParams);
    }

    @Override // com.yandex.passport.api.e3
    public Map<String, String> getCustomWebParams() {
        return this.customWebParams;
    }

    @Override // com.yandex.passport.api.e3
    public PassportTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        return this.customWebParams.hashCode() + ((this.progressProperties.hashCode() + ((this.environment.hashCode() + (this.theme.hashCode() * 31)) * 31)) * 31);
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair(KEY_SHOW_USER_MENU_PROPERTIES, this));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserMenuProperties(theme=");
        sb.append(this.theme);
        sb.append(", environment=");
        sb.append(this.environment);
        sb.append(", progressProperties=");
        sb.append(this.progressProperties);
        sb.append(", customWebParams=");
        return smw0.n(sb, this.customWebParams, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.theme.name());
        dest.writeParcelable(this.environment, flags);
        this.progressProperties.writeToParcel(dest, flags);
        Iterator x = qv10.x(this.customWebParams, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserMenuProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserMenuProperties createFromParcel(Parcel parcel) {
            PassportTheme valueOf = PassportTheme.valueOf(parcel.readString());
            PassportEnvironmentImpl passportEnvironmentImpl = (PassportEnvironmentImpl) parcel.readParcelable(UserMenuProperties.class.getClassLoader());
            ProgressPropertiesImpl createFromParcel = ProgressPropertiesImpl.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            int i = 0;
            while (i != readInt) {
                i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
            }
            return new UserMenuProperties(valueOf, passportEnvironmentImpl, createFromParcel, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserMenuProperties[] newArray(int i) {
            return new UserMenuProperties[i];
        }
    }

    @Override // com.yandex.passport.api.e3
    public PassportEnvironmentImpl getEnvironment() {
        return this.environment;
    }

    @Override // com.yandex.passport.api.e3
    public ProgressPropertiesImpl getProgressProperties() {
        return this.progressProperties;
    }

    public UserMenuProperties(PassportTheme passportTheme, PassportEnvironmentImpl passportEnvironmentImpl, ProgressPropertiesImpl progressPropertiesImpl, Map<String, String> map) {
        this.theme = passportTheme;
        this.environment = passportEnvironmentImpl;
        this.progressProperties = progressPropertiesImpl;
        this.customWebParams = map;
    }

    public UserMenuProperties() {
        this(null, null, null, null, 15, null);
    }
}
