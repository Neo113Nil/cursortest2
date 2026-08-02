package com.yandex.passport.internal.ui.domik;

import android.os.Bundle;
import android.os.Parcelable;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.properties.LoginProperties;
import defpackage.ny61;
import defpackage.wwg;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b!\u0018\u0000 #2\u00020\u0001:\u0001$B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000fJ\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\"\u0010\u000f¨\u0006%"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/BaseTrack;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/internal/properties/LoginProperties;", "properties", "", "trackId", LegacyAccountType.STRING_LOGIN, URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, "phoneNumber", "<init>", "(Lcom/yandex/passport/internal/properties/LoginProperties;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "requireTrackId", "()Ljava/lang/String;", "requireLogin", "requirePhoneNumber", "requirePassword", "Lcom/yandex/passport/common/core/Environment;", "requireEnvironment", "()Lcom/yandex/passport/common/core/Environment;", "withPhoneNumber", "(Ljava/lang/String;)Lcom/yandex/passport/internal/ui/domik/BaseTrack;", "Lcom/yandex/passport/internal/ui/domik/AuthTrack;", "toAuthTrack", "()Lcom/yandex/passport/internal/ui/domik/AuthTrack;", "Lcom/yandex/passport/internal/properties/LoginProperties;", "getProperties", "()Lcom/yandex/passport/internal/properties/LoginProperties;", "Ljava/lang/String;", "getTrackId", "getLogin", "getPassword", "getPhoneNumber", "Companion", "com/yandex/passport/internal/ui/domik/d", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseTrack implements Parcelable {
    public static final int $stable = 8;
    public static final d Companion = new d();
    public static final String KEY_TRACK = "track";
    private final String login;
    private final String password;
    private final String phoneNumber;
    private final LoginProperties properties;
    private final String trackId;

    public BaseTrack(LoginProperties loginProperties, String str, String str2, String str3, String str4) {
        this.properties = loginProperties;
        this.trackId = str;
        this.login = str2;
        this.password = str3;
        this.phoneNumber = str4;
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public LoginProperties getProperties() {
        return this.properties;
    }

    public String getTrackId() {
        return this.trackId;
    }

    public abstract Environment requireEnvironment();

    public final String requireLogin() {
        String login = getLogin();
        if (login != null) {
            return login;
        }
        ny61.r("required login is missing");
        return null;
    }

    public final String requirePassword() {
        String password = getPassword();
        if (password != null) {
            return password;
        }
        ny61.r("required password is missing");
        return null;
    }

    public final String requirePhoneNumber() {
        String phoneNumber = getPhoneNumber();
        if (phoneNumber != null) {
            return phoneNumber;
        }
        ny61.r("required phoneNumber is missing");
        return null;
    }

    public final String requireTrackId() {
        String trackId = getTrackId();
        if (trackId != null) {
            return trackId;
        }
        ny61.r("required trackId is missing");
        return null;
    }

    public abstract AuthTrack toAuthTrack();

    public final Bundle toBundle() {
        return wwg.g(new Pair(KEY_TRACK, this));
    }

    public abstract BaseTrack withPhoneNumber(String phoneNumber);
}
