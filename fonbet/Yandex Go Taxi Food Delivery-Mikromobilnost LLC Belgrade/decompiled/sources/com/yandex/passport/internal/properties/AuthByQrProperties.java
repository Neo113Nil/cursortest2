package com.yandex.passport.internal.properties;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.api.t0;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.b64;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.wwg;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0081\b\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0002@ABU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b)\u0010#J\u0012\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b*\u0010+Jp\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b.\u0010+J\u0010\u0010/\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b/\u0010\u001dJ\u001a\u00102\u001a\u00020\u00072\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b5\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u0010!R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b\b\u0010#R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b\t\u0010#R\u001a\u0010\n\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b\n\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b;\u0010'R\u001a\u0010\u000e\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b<\u0010#R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\b>\u0010+¨\u0006B"}, d2 = {"Lcom/yandex/passport/internal/properties/AuthByQrProperties;", "Lcom/yandex/passport/api/p;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/PassportTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", WebViewActivity.KEY_ENVIRONMENT, "", "isShowSkipButton", "isShowSettingsButton", "isFinishWithoutDialogOnError", "", "lottieSpinnerResId", "backgroundResId", "skipBackButton", "", "origin", "<init>", "(Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;ZZZLjava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/PassportTheme;", "component2", "()Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "component3", "()Z", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "()Ljava/lang/String;", "copy", "(Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;ZZZLjava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;)Lcom/yandex/passport/internal/properties/AuthByQrProperties;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/PassportTheme;", "getTheme", "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "getEnvironment", "Z", "Ljava/lang/Integer;", "getLottieSpinnerResId", "getBackgroundResId", "getSkipBackButton", "Ljava/lang/String;", "getOrigin", "Companion", "a", "com/yandex/passport/internal/properties/c", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AuthByQrProperties implements com.yandex.passport.api.p, Parcelable {
    public static final int $stable = 8;
    private static final String KEY_AUTH_BY_QR_PROPERTIES = "auth_by_qr_properties";
    private final Integer backgroundResId;
    private final PassportEnvironmentImpl environment;
    private final boolean isFinishWithoutDialogOnError;
    private final boolean isShowSettingsButton;
    private final boolean isShowSkipButton;
    private final Integer lottieSpinnerResId;
    private final String origin;
    private final boolean skipBackButton;
    private final PassportTheme theme;
    public static final c Companion = new c();
    public static final Parcelable.Creator<AuthByQrProperties> CREATOR = new Creator();

    public static final class a implements com.yandex.passport.api.p {
        public PassportTheme a = PassportTheme.FOLLOW_SYSTEM;
        public KPassportEnvironment b = KPassportEnvironment.PRODUCTION;
        public boolean c = true;
        public final boolean w = true;

        @Override // com.yandex.passport.api.p
        public final Integer getBackgroundResId() {
            return null;
        }

        @Override // com.yandex.passport.api.p
        public final t0 getEnvironment() {
            return this.b;
        }

        @Override // com.yandex.passport.api.p
        public final Integer getLottieSpinnerResId() {
            return null;
        }

        @Override // com.yandex.passport.api.p
        public final String getOrigin() {
            return null;
        }

        @Override // com.yandex.passport.api.p
        public final boolean getSkipBackButton() {
            return false;
        }

        @Override // com.yandex.passport.internal.b0
        public final PassportTheme getTheme() {
            return this.a;
        }

        @Override // com.yandex.passport.api.p
        public final boolean isFinishWithoutDialogOnError() {
            return false;
        }

        @Override // com.yandex.passport.api.p
        public final boolean isShowSettingsButton() {
            return this.w;
        }

        @Override // com.yandex.passport.api.p
        public final boolean isShowSkipButton() {
            return this.c;
        }
    }

    public AuthByQrProperties(PassportTheme passportTheme, PassportEnvironmentImpl passportEnvironmentImpl, boolean z, boolean z2, boolean z3, Integer num, Integer num2, boolean z4, String str) {
        this.theme = passportTheme;
        this.environment = passportEnvironmentImpl;
        this.isShowSkipButton = z;
        this.isShowSettingsButton = z2;
        this.isFinishWithoutDialogOnError = z3;
        this.lottieSpinnerResId = num;
        this.backgroundResId = num2;
        this.skipBackButton = z4;
        this.origin = str;
    }

    public static /* synthetic */ AuthByQrProperties copy$default(AuthByQrProperties authByQrProperties, PassportTheme passportTheme, PassportEnvironmentImpl passportEnvironmentImpl, boolean z, boolean z2, boolean z3, Integer num, Integer num2, boolean z4, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            passportTheme = authByQrProperties.theme;
        }
        if ((i & 2) != 0) {
            passportEnvironmentImpl = authByQrProperties.environment;
        }
        if ((i & 4) != 0) {
            z = authByQrProperties.isShowSkipButton;
        }
        if ((i & 8) != 0) {
            z2 = authByQrProperties.isShowSettingsButton;
        }
        if ((i & 16) != 0) {
            z3 = authByQrProperties.isFinishWithoutDialogOnError;
        }
        if ((i & 32) != 0) {
            num = authByQrProperties.lottieSpinnerResId;
        }
        if ((i & 64) != 0) {
            num2 = authByQrProperties.backgroundResId;
        }
        if ((i & 128) != 0) {
            z4 = authByQrProperties.skipBackButton;
        }
        if ((i & 256) != 0) {
            str = authByQrProperties.origin;
        }
        boolean z5 = z4;
        String str2 = str;
        Integer num3 = num;
        Integer num4 = num2;
        boolean z6 = z3;
        boolean z7 = z;
        return authByQrProperties.copy(passportTheme, passportEnvironmentImpl, z7, z2, z6, num3, num4, z5, str2);
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
    public final boolean getIsShowSkipButton() {
        return this.isShowSkipButton;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsShowSettingsButton() {
        return this.isShowSettingsButton;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsFinishWithoutDialogOnError() {
        return this.isFinishWithoutDialogOnError;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getLottieSpinnerResId() {
        return this.lottieSpinnerResId;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getBackgroundResId() {
        return this.backgroundResId;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getSkipBackButton() {
        return this.skipBackButton;
    }

    /* renamed from: component9, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    public final AuthByQrProperties copy(PassportTheme theme, PassportEnvironmentImpl environment, boolean isShowSkipButton, boolean isShowSettingsButton, boolean isFinishWithoutDialogOnError, Integer lottieSpinnerResId, Integer backgroundResId, boolean skipBackButton, String origin) {
        return new AuthByQrProperties(theme, environment, isShowSkipButton, isShowSettingsButton, isFinishWithoutDialogOnError, lottieSpinnerResId, backgroundResId, skipBackButton, origin);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthByQrProperties)) {
            return false;
        }
        AuthByQrProperties authByQrProperties = (AuthByQrProperties) other;
        return this.theme == authByQrProperties.theme && jl40.l(this.environment, authByQrProperties.environment) && this.isShowSkipButton == authByQrProperties.isShowSkipButton && this.isShowSettingsButton == authByQrProperties.isShowSettingsButton && this.isFinishWithoutDialogOnError == authByQrProperties.isFinishWithoutDialogOnError && jl40.l(this.lottieSpinnerResId, authByQrProperties.lottieSpinnerResId) && jl40.l(this.backgroundResId, authByQrProperties.backgroundResId) && this.skipBackButton == authByQrProperties.skipBackButton && jl40.l(this.origin, authByQrProperties.origin);
    }

    @Override // com.yandex.passport.api.p
    public Integer getBackgroundResId() {
        return this.backgroundResId;
    }

    @Override // com.yandex.passport.api.p
    public Integer getLottieSpinnerResId() {
        return this.lottieSpinnerResId;
    }

    @Override // com.yandex.passport.api.p
    public String getOrigin() {
        return this.origin;
    }

    @Override // com.yandex.passport.api.p
    public boolean getSkipBackButton() {
        return this.skipBackButton;
    }

    @Override // com.yandex.passport.internal.b0
    public PassportTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int e = unr0.e(unr0.e(unr0.e((this.environment.hashCode() + (this.theme.hashCode() * 31)) * 31, 31, this.isShowSkipButton), 31, this.isShowSettingsButton), 31, this.isFinishWithoutDialogOnError);
        Integer num = this.lottieSpinnerResId;
        int hashCode = (e + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.backgroundResId;
        int e2 = unr0.e((hashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.skipBackButton);
        String str = this.origin;
        return e2 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.yandex.passport.api.p
    public boolean isFinishWithoutDialogOnError() {
        return this.isFinishWithoutDialogOnError;
    }

    @Override // com.yandex.passport.api.p
    public boolean isShowSettingsButton() {
        return this.isShowSettingsButton;
    }

    @Override // com.yandex.passport.api.p
    public boolean isShowSkipButton() {
        return this.isShowSkipButton;
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair(KEY_AUTH_BY_QR_PROPERTIES, this));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AuthByQrProperties(theme=");
        sb.append(this.theme);
        sb.append(", environment=");
        sb.append(this.environment);
        sb.append(", isShowSkipButton=");
        sb.append(this.isShowSkipButton);
        sb.append(", isShowSettingsButton=");
        sb.append(this.isShowSettingsButton);
        sb.append(", isFinishWithoutDialogOnError=");
        sb.append(this.isFinishWithoutDialogOnError);
        sb.append(", lottieSpinnerResId=");
        sb.append(this.lottieSpinnerResId);
        sb.append(", backgroundResId=");
        sb.append(this.backgroundResId);
        sb.append(", skipBackButton=");
        sb.append(this.skipBackButton);
        sb.append(", origin=");
        return b64.p(sb, this.origin, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.theme.name());
        dest.writeParcelable(this.environment, flags);
        dest.writeInt(this.isShowSkipButton ? 1 : 0);
        dest.writeInt(this.isShowSettingsButton ? 1 : 0);
        dest.writeInt(this.isFinishWithoutDialogOnError ? 1 : 0);
        Integer num = this.lottieSpinnerResId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num);
        }
        Integer num2 = this.backgroundResId;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num2);
        }
        dest.writeInt(this.skipBackButton ? 1 : 0);
        dest.writeString(this.origin);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AuthByQrProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthByQrProperties createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            PassportTheme valueOf = PassportTheme.valueOf(parcel.readString());
            PassportEnvironmentImpl passportEnvironmentImpl = (PassportEnvironmentImpl) parcel.readParcelable(AuthByQrProperties.class.getClassLoader());
            boolean z4 = false;
            boolean z5 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z5 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z2;
            } else {
                z3 = z2;
                z2 = z;
            }
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                z = z3;
            }
            return new AuthByQrProperties(valueOf, passportEnvironmentImpl, z4, z5, z2, valueOf2, valueOf3, z, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthByQrProperties[] newArray(int i) {
            return new AuthByQrProperties[i];
        }
    }

    @Override // com.yandex.passport.api.p
    public PassportEnvironmentImpl getEnvironment() {
        return this.environment;
    }
}
