package com.yandex.passport.internal.properties;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.i2;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.b64;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0001\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001.B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b)\u0010\u0011R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/yandex/passport/internal/properties/TurboAppAuthProperties;", "Lcom/yandex/passport/api/i2;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/PassportTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", WebViewActivity.KEY_ENVIRONMENT, "Lcom/yandex/passport/api/PassportUidImpl;", "uid", "", "clientId", "turboAppIdentifier", "", "scopes", "<init>", "(Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;Lcom/yandex/passport/api/PassportUidImpl;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTurboAppRedirectUri", "()Ljava/lang/String;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/yandex/passport/api/PassportTheme;", "getTheme", "()Lcom/yandex/passport/api/PassportTheme;", "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "getEnvironment", "()Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "Lcom/yandex/passport/api/PassportUidImpl;", "getUid", "()Lcom/yandex/passport/api/PassportUidImpl;", "Ljava/lang/String;", "getClientId", "getTurboAppIdentifier", "Ljava/util/List;", "getScopes", "()Ljava/util/List;", "Companion", "com/yandex/passport/internal/properties/y", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TurboAppAuthProperties implements i2, Parcelable {
    public static final int $stable = 8;
    private final String clientId;
    private final PassportEnvironmentImpl environment;
    private final List<String> scopes;
    private final PassportTheme theme;
    private final String turboAppIdentifier;
    private final PassportUidImpl uid;
    public static final y Companion = new y();
    public static final Parcelable.Creator<TurboAppAuthProperties> CREATOR = new Creator();

    public TurboAppAuthProperties(PassportTheme passportTheme, PassportEnvironmentImpl passportEnvironmentImpl, PassportUidImpl passportUidImpl, String str, String str2, List<String> list) {
        this.theme = passportTheme;
        this.environment = passportEnvironmentImpl;
        this.uid = passportUidImpl;
        this.clientId = str;
        this.turboAppIdentifier = str2;
        this.scopes = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.yandex.passport.api.i2
    public String getClientId() {
        return this.clientId;
    }

    @Override // com.yandex.passport.api.i2
    public List<String> getScopes() {
        return this.scopes;
    }

    @Override // com.yandex.passport.internal.b0
    public PassportTheme getTheme() {
        return this.theme;
    }

    @Override // com.yandex.passport.api.i2
    public String getTurboAppIdentifier() {
        return this.turboAppIdentifier;
    }

    public final String getTurboAppRedirectUri() {
        return b64.k("^https://", getTurboAppIdentifier(), "yandexta://");
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("turbo_app_auth_properties", this);
        return bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.theme.name());
        dest.writeParcelable(this.environment, flags);
        this.uid.writeToParcel(dest, flags);
        dest.writeString(this.clientId);
        dest.writeString(this.turboAppIdentifier);
        dest.writeStringList(this.scopes);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TurboAppAuthProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TurboAppAuthProperties createFromParcel(Parcel parcel) {
            return new TurboAppAuthProperties(PassportTheme.valueOf(parcel.readString()), (PassportEnvironmentImpl) parcel.readParcelable(TurboAppAuthProperties.class.getClassLoader()), PassportUidImpl.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TurboAppAuthProperties[] newArray(int i) {
            return new TurboAppAuthProperties[i];
        }
    }

    @Override // com.yandex.passport.api.i2
    public PassportEnvironmentImpl getEnvironment() {
        return this.environment;
    }

    @Override // com.yandex.passport.api.i2
    public PassportUidImpl getUid() {
        return this.uid;
    }
}
