package com.yandex.passport.api.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.c3;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00014BE\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010\u001fJN\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u001a\u0010(\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001bR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u001fR\u001a\u0010\f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b2\u0010\u001f¨\u00065"}, d2 = {"Lcom/yandex/passport/api/impl/UserIdProperties;", "Lcom/yandex/passport/api/c3;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/PassportTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", WebViewActivity.KEY_ENVIRONMENT, "", "", "customWebParams", "", "showLoading", "showUi", "<init>", "(Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;Ljava/util/Map;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/PassportTheme;", "component2", "()Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "component3", "()Ljava/util/Map;", "component4", "()Z", "component5", "copy", "(Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;Ljava/util/Map;ZZ)Lcom/yandex/passport/api/impl/UserIdProperties;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/PassportTheme;", "getTheme", "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "getEnvironment", "Ljava/util/Map;", "getCustomWebParams", "Z", "getShowLoading", "getShowUi", "Companion", "com/yandex/passport/api/impl/a", "passport-api-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UserIdProperties implements c3, Parcelable {
    private final Map<String, String> customWebParams;
    private final PassportEnvironmentImpl environment;
    private final boolean showLoading;
    private final boolean showUi;
    private final PassportTheme theme;
    public static final a Companion = new a();
    public static final Parcelable.Creator<UserIdProperties> CREATOR = new Creator();

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ UserIdProperties(com.yandex.passport.api.PassportTheme r2, com.yandex.passport.api.impl.PassportEnvironmentImpl r3, java.util.Map r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            com.yandex.passport.api.PassportTheme r2 = com.yandex.passport.api.PassportTheme.FOLLOW_SYSTEM
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto Lc
            com.yandex.passport.api.impl.PassportEnvironmentImpl r3 = com.yandex.passport.api.impl.PassportEnvironmentImpl.PRODUCTION
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L14
            java.util.Map r4 = kotlin.collections.b.f()
        L14:
            r8 = r7 & 8
            r0 = 1
            if (r8 == 0) goto L1a
            r5 = r0
        L1a:
            r7 = r7 & 16
            if (r7 == 0) goto L25
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2b
        L25:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L2b:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.passport.api.impl.UserIdProperties.<init>(com.yandex.passport.api.PassportTheme, com.yandex.passport.api.impl.PassportEnvironmentImpl, java.util.Map, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ UserIdProperties copy$default(UserIdProperties userIdProperties, PassportTheme passportTheme, PassportEnvironmentImpl passportEnvironmentImpl, Map map, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            passportTheme = userIdProperties.theme;
        }
        if ((i & 2) != 0) {
            passportEnvironmentImpl = userIdProperties.environment;
        }
        if ((i & 4) != 0) {
            map = userIdProperties.customWebParams;
        }
        if ((i & 8) != 0) {
            z = userIdProperties.showLoading;
        }
        if ((i & 16) != 0) {
            z2 = userIdProperties.showUi;
        }
        boolean z3 = z2;
        Map map2 = map;
        return userIdProperties.copy(passportTheme, passportEnvironmentImpl, map2, z, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final PassportTheme getTheme() {
        return this.theme;
    }

    /* renamed from: component2, reason: from getter */
    public final PassportEnvironmentImpl getEnvironment() {
        return this.environment;
    }

    public final Map<String, String> component3() {
        return this.customWebParams;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowLoading() {
        return this.showLoading;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowUi() {
        return this.showUi;
    }

    public final UserIdProperties copy(PassportTheme theme, PassportEnvironmentImpl environment, Map<String, String> customWebParams, boolean showLoading, boolean showUi) {
        return new UserIdProperties(theme, environment, customWebParams, showLoading, showUi);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserIdProperties)) {
            return false;
        }
        UserIdProperties userIdProperties = (UserIdProperties) other;
        return this.theme == userIdProperties.theme && jl40.l(this.environment, userIdProperties.environment) && jl40.l(this.customWebParams, userIdProperties.customWebParams) && this.showLoading == userIdProperties.showLoading && this.showUi == userIdProperties.showUi;
    }

    @Override // com.yandex.passport.api.c3
    public Map<String, String> getCustomWebParams() {
        return this.customWebParams;
    }

    @Override // com.yandex.passport.api.c3
    public boolean getShowLoading() {
        return this.showLoading;
    }

    @Override // com.yandex.passport.api.c3
    public boolean getShowUi() {
        return this.showUi;
    }

    @Override // com.yandex.passport.api.c3
    public PassportTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showUi) + unr0.e(unr0.d((this.environment.hashCode() + (this.theme.hashCode() * 31)) * 31, 31, this.customWebParams), 31, this.showLoading);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserIdProperties(theme=");
        sb.append(this.theme);
        sb.append(", environment=");
        sb.append(this.environment);
        sb.append(", customWebParams=");
        sb.append(this.customWebParams);
        sb.append(", showLoading=");
        sb.append(this.showLoading);
        sb.append(", showUi=");
        return unr0.u(sb, this.showUi, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.theme.name());
        dest.writeParcelable(this.environment, flags);
        Iterator x = qv10.x(this.customWebParams, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
        dest.writeInt(this.showLoading ? 1 : 0);
        dest.writeInt(this.showUi ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserIdProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserIdProperties createFromParcel(Parcel parcel) {
            PassportTheme valueOf = PassportTheme.valueOf(parcel.readString());
            PassportEnvironmentImpl passportEnvironmentImpl = (PassportEnvironmentImpl) parcel.readParcelable(UserIdProperties.class.getClassLoader());
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            int i = 0;
            while (true) {
                if (i == readInt) {
                    break;
                }
                i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
            }
            return new UserIdProperties(valueOf, passportEnvironmentImpl, linkedHashMap, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserIdProperties[] newArray(int i) {
            return new UserIdProperties[i];
        }
    }

    @Override // com.yandex.passport.api.c3
    public PassportEnvironmentImpl getEnvironment() {
        return this.environment;
    }

    public UserIdProperties(PassportTheme passportTheme, PassportEnvironmentImpl passportEnvironmentImpl, Map<String, String> map, boolean z, boolean z2) {
        this.theme = passportTheme;
        this.environment = passportEnvironmentImpl;
        this.customWebParams = map;
        this.showLoading = z;
        this.showUi = z2;
    }

    public UserIdProperties() {
        this(null, null, null, false, false, 31, null);
    }
}
