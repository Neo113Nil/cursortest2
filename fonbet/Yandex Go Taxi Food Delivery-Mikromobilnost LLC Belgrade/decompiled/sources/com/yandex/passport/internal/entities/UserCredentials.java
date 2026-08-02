package com.yandex.passport.internal.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.api.q2;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001*B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J:\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b'\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b(\u0010\u0017¨\u0006+"}, d2 = {"Lcom/yandex/passport/internal/entities/UserCredentials;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/q2;", "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", WebViewActivity.KEY_ENVIRONMENT, "", LegacyAccountType.STRING_LOGIN, URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, "avatarUrl", "<init>", "(Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/passport/internal/entities/UserCredentials;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "getEnvironment", "Ljava/lang/String;", "getLogin", "getPassword", "getAvatarUrl", "Companion", "com/yandex/passport/internal/entities/r", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UserCredentials implements Parcelable, q2 {
    public static final int $stable = 8;
    private final String avatarUrl;
    private final PassportEnvironmentImpl environment;
    private final String login;
    private final String password;
    public static final r Companion = new r();
    public static final Parcelable.Creator<UserCredentials> CREATOR = new Creator();

    public UserCredentials(PassportEnvironmentImpl passportEnvironmentImpl, String str, String str2, String str3) {
        this.environment = passportEnvironmentImpl;
        this.login = str;
        this.password = str2;
        this.avatarUrl = str3;
    }

    public static /* synthetic */ UserCredentials copy$default(UserCredentials userCredentials, PassportEnvironmentImpl passportEnvironmentImpl, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            passportEnvironmentImpl = userCredentials.environment;
        }
        if ((i & 2) != 0) {
            str = userCredentials.login;
        }
        if ((i & 4) != 0) {
            str2 = userCredentials.password;
        }
        if ((i & 8) != 0) {
            str3 = userCredentials.avatarUrl;
        }
        return userCredentials.copy(passportEnvironmentImpl, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final PassportEnvironmentImpl getEnvironment() {
        return this.environment;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLogin() {
        return this.login;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final UserCredentials copy(PassportEnvironmentImpl environment, String login, String password, String avatarUrl) {
        return new UserCredentials(environment, login, password, avatarUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserCredentials)) {
            return false;
        }
        UserCredentials userCredentials = (UserCredentials) other;
        return jl40.l(this.environment, userCredentials.environment) && jl40.l(this.login, userCredentials.login) && jl40.l(this.password, userCredentials.password) && jl40.l(this.avatarUrl, userCredentials.avatarUrl);
    }

    @Override // com.yandex.passport.api.q2
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    @Override // com.yandex.passport.api.q2
    public String getLogin() {
        return this.login;
    }

    @Override // com.yandex.passport.api.q2
    public String getPassword() {
        return this.password;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(this.environment.hashCode() * 31, 31, this.login), 31, this.password);
        String str = this.avatarUrl;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserCredentials(environment=");
        sb.append(this.environment);
        sb.append(", login=");
        sb.append(this.login);
        sb.append(", password=");
        sb.append(this.password);
        sb.append(", avatarUrl=");
        return b64.p(sb, this.avatarUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.environment, flags);
        dest.writeString(this.login);
        dest.writeString(this.password);
        dest.writeString(this.avatarUrl);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserCredentials> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserCredentials createFromParcel(Parcel parcel) {
            return new UserCredentials((PassportEnvironmentImpl) parcel.readParcelable(UserCredentials.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserCredentials[] newArray(int i) {
            return new UserCredentials[i];
        }
    }

    @Override // com.yandex.passport.api.q2
    public PassportEnvironmentImpl getEnvironment() {
        return this.environment;
    }

    public /* synthetic */ UserCredentials(PassportEnvironmentImpl passportEnvironmentImpl, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(passportEnvironmentImpl, str, str2, (i & 8) != 0 ? null : str3);
    }
}
