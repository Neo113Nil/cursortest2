package com.yandex.passport.internal.properties;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.api.PassportAutoLoginMode;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.n0;
import com.yandex.passport.api.z0;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.ui.autologin.AutoLoginRetryActivity;
import defpackage.b64;
import defpackage.jl40;
import defpackage.nea1;
import defpackage.unr0;
import defpackage.wwg;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0081\b\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0002ABBQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b*\u0010%J\\\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b-\u0010%J\u0010\u0010.\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b.\u0010\u001dJ\u001a\u00101\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b4\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010!R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010%R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b>\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b?\u0010%¨\u0006C"}, d2 = {"Lcom/yandex/passport/internal/properties/AutoLoginProperties;", "Lcom/yandex/passport/api/a0;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/internal/entities/Filter;", "filter", "Lcom/yandex/passport/api/PassportTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lcom/yandex/passport/api/PassportAutoLoginMode;", "mode", "", Constants.KEY_MESSAGE, "", "setAsCurrent", "Lcom/yandex/passport/internal/credentials/ClientCredentials;", AutoLoginRetryActivity.KEY_USER_CREDENTIALS, "phoneNumber", "<init>", "(Lcom/yandex/passport/internal/entities/Filter;Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/api/PassportAutoLoginMode;Ljava/lang/String;ZLcom/yandex/passport/internal/credentials/ClientCredentials;Ljava/lang/String;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/internal/entities/Filter;", "component2", "()Lcom/yandex/passport/api/PassportTheme;", "component3", "()Lcom/yandex/passport/api/PassportAutoLoginMode;", "component4", "()Ljava/lang/String;", "component5", "()Z", "component6", "()Lcom/yandex/passport/internal/credentials/ClientCredentials;", "component7", "copy", "(Lcom/yandex/passport/internal/entities/Filter;Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/api/PassportAutoLoginMode;Ljava/lang/String;ZLcom/yandex/passport/internal/credentials/ClientCredentials;Ljava/lang/String;)Lcom/yandex/passport/internal/properties/AutoLoginProperties;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/internal/entities/Filter;", "getFilter", "Lcom/yandex/passport/api/PassportTheme;", "getTheme", "Lcom/yandex/passport/api/PassportAutoLoginMode;", "getMode", "Ljava/lang/String;", "getMessage", "Z", "getSetAsCurrent", "Lcom/yandex/passport/internal/credentials/ClientCredentials;", "getCredentials", "getPhoneNumber", "Companion", "a", "com/yandex/passport/internal/properties/e", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AutoLoginProperties implements com.yandex.passport.api.a0, Parcelable {
    public static final int $stable = 8;
    private final ClientCredentials credentials;
    private final Filter filter;
    private final String message;
    private final PassportAutoLoginMode mode;
    private final String phoneNumber;
    private final boolean setAsCurrent;
    private final PassportTheme theme;
    public static final e Companion = new e();
    public static final Parcelable.Creator<AutoLoginProperties> CREATOR = new Creator();

    public static final class a implements com.yandex.passport.api.a0 {
        public z0 a;
        public PassportTheme b = PassportTheme.FOLLOW_SYSTEM;
        public PassportAutoLoginMode c = PassportAutoLoginMode.ONE_OR_MORE_ACCOUNT;
        public boolean w;

        public final AutoLoginProperties a() {
            if (this.a != null) {
                AutoLoginProperties.Companion.getClass();
                return e.b(this);
            }
            nea1.b("You must set filter");
            throw null;
        }

        public final a b() {
            this.w = true;
            return this;
        }

        public final a c(Filter filter) {
            this.a = filter;
            return this;
        }

        public final a d(PassportAutoLoginMode passportAutoLoginMode) {
            this.c = passportAutoLoginMode;
            return this;
        }

        public final a e(PassportTheme passportTheme) {
            this.b = passportTheme;
            return this;
        }

        @Override // com.yandex.passport.api.a0
        public final n0 getCredentials() {
            return null;
        }

        @Override // com.yandex.passport.api.a0
        public final z0 getFilter() {
            z0 z0Var = this.a;
            if (z0Var != null) {
                return z0Var;
            }
            return null;
        }

        @Override // com.yandex.passport.api.a0
        public final String getMessage() {
            return null;
        }

        @Override // com.yandex.passport.api.a0
        public final PassportAutoLoginMode getMode() {
            return this.c;
        }

        @Override // com.yandex.passport.api.a0
        public final String getPhoneNumber() {
            return null;
        }

        @Override // com.yandex.passport.api.a0
        public final boolean getSetAsCurrent() {
            return this.w;
        }

        @Override // com.yandex.passport.api.a0
        public final PassportTheme getTheme() {
            return this.b;
        }
    }

    public /* synthetic */ AutoLoginProperties(Filter filter, PassportTheme passportTheme, PassportAutoLoginMode passportAutoLoginMode, String str, boolean z, ClientCredentials clientCredentials, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(filter, (i & 2) != 0 ? PassportTheme.FOLLOW_SYSTEM : passportTheme, (i & 4) != 0 ? PassportAutoLoginMode.ONE_OR_MORE_ACCOUNT : passportAutoLoginMode, (i & 8) != 0 ? null : str, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : clientCredentials, (i & 64) != 0 ? null : str2);
    }

    public static /* synthetic */ AutoLoginProperties copy$default(AutoLoginProperties autoLoginProperties, Filter filter, PassportTheme passportTheme, PassportAutoLoginMode passportAutoLoginMode, String str, boolean z, ClientCredentials clientCredentials, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            filter = autoLoginProperties.filter;
        }
        if ((i & 2) != 0) {
            passportTheme = autoLoginProperties.theme;
        }
        if ((i & 4) != 0) {
            passportAutoLoginMode = autoLoginProperties.mode;
        }
        if ((i & 8) != 0) {
            str = autoLoginProperties.message;
        }
        if ((i & 16) != 0) {
            z = autoLoginProperties.setAsCurrent;
        }
        if ((i & 32) != 0) {
            clientCredentials = autoLoginProperties.credentials;
        }
        if ((i & 64) != 0) {
            str2 = autoLoginProperties.phoneNumber;
        }
        ClientCredentials clientCredentials2 = clientCredentials;
        String str3 = str2;
        boolean z2 = z;
        PassportAutoLoginMode passportAutoLoginMode2 = passportAutoLoginMode;
        return autoLoginProperties.copy(filter, passportTheme, passportAutoLoginMode2, str, z2, clientCredentials2, str3);
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
    public final PassportAutoLoginMode getMode() {
        return this.mode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getSetAsCurrent() {
        return this.setAsCurrent;
    }

    /* renamed from: component6, reason: from getter */
    public final ClientCredentials getCredentials() {
        return this.credentials;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final AutoLoginProperties copy(Filter filter, PassportTheme theme, PassportAutoLoginMode mode, String message, boolean setAsCurrent, ClientCredentials credentials, String phoneNumber) {
        return new AutoLoginProperties(filter, theme, mode, message, setAsCurrent, credentials, phoneNumber);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoLoginProperties)) {
            return false;
        }
        AutoLoginProperties autoLoginProperties = (AutoLoginProperties) other;
        return jl40.l(this.filter, autoLoginProperties.filter) && this.theme == autoLoginProperties.theme && this.mode == autoLoginProperties.mode && jl40.l(this.message, autoLoginProperties.message) && this.setAsCurrent == autoLoginProperties.setAsCurrent && jl40.l(this.credentials, autoLoginProperties.credentials) && jl40.l(this.phoneNumber, autoLoginProperties.phoneNumber);
    }

    @Override // com.yandex.passport.api.a0
    public String getMessage() {
        return this.message;
    }

    @Override // com.yandex.passport.api.a0
    public PassportAutoLoginMode getMode() {
        return this.mode;
    }

    @Override // com.yandex.passport.api.a0
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override // com.yandex.passport.api.a0
    public boolean getSetAsCurrent() {
        return this.setAsCurrent;
    }

    @Override // com.yandex.passport.api.a0
    public PassportTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int hashCode = (this.mode.hashCode() + ((this.theme.hashCode() + (this.filter.hashCode() * 31)) * 31)) * 31;
        String str = this.message;
        int e = unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.setAsCurrent);
        ClientCredentials clientCredentials = this.credentials;
        int hashCode2 = (e + (clientCredentials == null ? 0 : clientCredentials.hashCode())) * 31;
        String str2 = this.phoneNumber;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair("passport-auto-login-properties", this));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AutoLoginProperties(filter=");
        sb.append(this.filter);
        sb.append(", theme=");
        sb.append(this.theme);
        sb.append(", mode=");
        sb.append(this.mode);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", setAsCurrent=");
        sb.append(this.setAsCurrent);
        sb.append(", credentials=");
        sb.append(this.credentials);
        sb.append(", phoneNumber=");
        return b64.p(sb, this.phoneNumber, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.filter.writeToParcel(dest, flags);
        dest.writeString(this.theme.name());
        dest.writeString(this.mode.name());
        dest.writeString(this.message);
        dest.writeInt(this.setAsCurrent ? 1 : 0);
        dest.writeParcelable(this.credentials, flags);
        dest.writeString(this.phoneNumber);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoLoginProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoLoginProperties createFromParcel(Parcel parcel) {
            return new AutoLoginProperties(Filter.CREATOR.createFromParcel(parcel), PassportTheme.valueOf(parcel.readString()), PassportAutoLoginMode.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, (ClientCredentials) parcel.readParcelable(AutoLoginProperties.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoLoginProperties[] newArray(int i) {
            return new AutoLoginProperties[i];
        }
    }

    @Override // com.yandex.passport.api.a0
    public ClientCredentials getCredentials() {
        return this.credentials;
    }

    @Override // com.yandex.passport.api.a0
    public Filter getFilter() {
        return this.filter;
    }

    public AutoLoginProperties(Filter filter, PassportTheme passportTheme, PassportAutoLoginMode passportAutoLoginMode, String str, boolean z, ClientCredentials clientCredentials, String str2) {
        this.filter = filter;
        this.theme = passportTheme;
        this.mode = passportAutoLoginMode;
        this.message = str;
        this.setAsCurrent = z;
        this.credentials = clientCredentials;
        this.phoneNumber = str2;
    }
}
