package com.yandex.passport.internal.properties;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.x1;
import defpackage.jl40;
import defpackage.wwg;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 )2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001*B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0015J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006+"}, d2 = {"Lcom/yandex/passport/internal/properties/RegisterWebAuthNPropertiesImpl;", "Lcom/yandex/passport/api/x1;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/internal/b0;", "Lcom/yandex/passport/api/PassportTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lcom/yandex/passport/api/PassportUidImpl;", "uid", "<init>", "(Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/api/PassportUidImpl;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/PassportTheme;", "component2", "()Lcom/yandex/passport/api/PassportUidImpl;", "copy", "(Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/api/PassportUidImpl;)Lcom/yandex/passport/internal/properties/RegisterWebAuthNPropertiesImpl;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/PassportTheme;", "getTheme", "Lcom/yandex/passport/api/PassportUidImpl;", "getUid", "Companion", "com/yandex/passport/internal/properties/r", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RegisterWebAuthNPropertiesImpl implements x1, Parcelable, com.yandex.passport.internal.b0 {
    public static final int $stable = 8;
    private static final String KEY_REGISTER_WEBAUTHN_PROPERTIES = "register_webauthn_properties";
    private final PassportTheme theme;
    private final PassportUidImpl uid;
    public static final r Companion = new r();
    public static final Parcelable.Creator<RegisterWebAuthNPropertiesImpl> CREATOR = new Creator();

    public RegisterWebAuthNPropertiesImpl(PassportTheme passportTheme, PassportUidImpl passportUidImpl) {
        this.theme = passportTheme;
        this.uid = passportUidImpl;
    }

    public static /* synthetic */ RegisterWebAuthNPropertiesImpl copy$default(RegisterWebAuthNPropertiesImpl registerWebAuthNPropertiesImpl, PassportTheme passportTheme, PassportUidImpl passportUidImpl, int i, Object obj) {
        if ((i & 1) != 0) {
            passportTheme = registerWebAuthNPropertiesImpl.theme;
        }
        if ((i & 2) != 0) {
            passportUidImpl = registerWebAuthNPropertiesImpl.uid;
        }
        return registerWebAuthNPropertiesImpl.copy(passportTheme, passportUidImpl);
    }

    /* renamed from: component1, reason: from getter */
    public final PassportTheme getTheme() {
        return this.theme;
    }

    /* renamed from: component2, reason: from getter */
    public final PassportUidImpl getUid() {
        return this.uid;
    }

    public final RegisterWebAuthNPropertiesImpl copy(PassportTheme theme, PassportUidImpl uid) {
        return new RegisterWebAuthNPropertiesImpl(theme, uid);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegisterWebAuthNPropertiesImpl)) {
            return false;
        }
        RegisterWebAuthNPropertiesImpl registerWebAuthNPropertiesImpl = (RegisterWebAuthNPropertiesImpl) other;
        return this.theme == registerWebAuthNPropertiesImpl.theme && jl40.l(this.uid, registerWebAuthNPropertiesImpl.uid);
    }

    @Override // com.yandex.passport.api.x1, com.yandex.passport.internal.b0
    public PassportTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        return this.uid.hashCode() + (this.theme.hashCode() * 31);
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair(KEY_REGISTER_WEBAUTHN_PROPERTIES, this));
    }

    public String toString() {
        return "RegisterWebAuthNPropertiesImpl(theme=" + this.theme + ", uid=" + this.uid + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.theme.name());
        this.uid.writeToParcel(dest, flags);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RegisterWebAuthNPropertiesImpl> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegisterWebAuthNPropertiesImpl createFromParcel(Parcel parcel) {
            return new RegisterWebAuthNPropertiesImpl(PassportTheme.valueOf(parcel.readString()), PassportUidImpl.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegisterWebAuthNPropertiesImpl[] newArray(int i) {
            return new RegisterWebAuthNPropertiesImpl[i];
        }
    }

    @Override // com.yandex.passport.api.x1
    public PassportUidImpl getUid() {
        return this.uid;
    }
}
